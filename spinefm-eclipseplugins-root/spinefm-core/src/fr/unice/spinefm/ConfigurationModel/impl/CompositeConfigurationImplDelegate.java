package fr.unice.spinefm.ConfigurationModel.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.ConfigurationModel.Link;
import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException;
import fr.unice.spinefm.HistoryModel.HistoryModelFactory;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultiplicityElement;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class CompositeConfigurationImplDelegate extends
		CompositeConfigurationImpl {

	private Map<String,Configuration> mapOfSub;
	private static Logger log = Logger.getLogger(CompositeConfigurationImplDelegate.class);
	
	protected CompositeConfigurationImplDelegate() {
		super();
		this.mapOfSub = new HashMap<String,Configuration>();
	}
	
	@Override
	public void addConfiguration(Configuration conf) {
		this.getSubConfigurations().add(conf);
		this.mapOfSub.put(conf.getId(),conf);
	}
	
	@Override
	public Configuration getConfigurationByName(String confName) throws ConfigNotFoundException {
		if (this.mapOfSub.containsKey(confName))
			return this.mapOfSub.get(confName);
		else {
			String[] elementName = confName.split("_");
			if (elementName.length == 4 && elementName[2].equals("globalcontext")) {
				String endName = elementName[2]+"_"+elementName[3];
				for (String s : this.mapOfSub.keySet()) {
					if (s.endsWith(endName)) {
						return this.mapOfSub.get(s);
					}
				}
			}
			throw new ConfigNotFoundException("Config not found : "+confName);
		}		
	}
	
	@Override
	public boolean isValid() throws DomainElementNotFoundException {
		log.debug("Check if the composite configuration is valid.");
		try {
			if (!this.isSomeConfigurationUnlinked()) {
				Map<DEAssociationEnd, Map<Configuration,Integer>> configByAsso = this.countConfigurationsByDEAssociation();
				Map<DomainElement, Integer> configByDE = this.countConfigurationsByDomainElement();
				
				for (DomainElement de : configByDE.keySet()) {
					if (!de.getMultiplicityElement().respectBoundaries(configByDE.get(de))) {
						log.debug("Multiplicity of DE : "+de+" is not respected.");
						return false;
					}
				}
				
				for (DEAssociationEnd deaend : configByAsso.keySet()) {
					if (!this.checkMutliplicityOfDEAssociationEnd(deaend, configByAsso)) {
						return false;
					}
				}
				return true;
			} else {
				log.debug("Some configurations are still not linked.");
				return false;
			}
		} catch (ConfigNotFoundException e) {
			e.printStackTrace(); // should not be reached
			return false;
		}
	}
	
	// FIX that code 
	private boolean checkMutliplicityOfDEAssociationEnd(DEAssociationEnd deaend, Map<DEAssociationEnd, Map<Configuration,Integer>> configByAsso) {
		Map<Configuration,Integer> inter = configByAsso.get(deaend);
		MultiplicityElement multToTest = deaend.getLinkMultiplicity();
		
		if (inter.isEmpty()) {
			if (!multToTest.respectBoundaries(0)) {
				log.debug("Multiplicity of DEAssociationEnd : "+deaend+" is not respected : it has been never used.");
				return false;
			}
		} else {
			for (Configuration conf : inter.keySet()) {
				int links = inter.get(conf);
				if (!multToTest.respectBoundaries(links)) {
					log.debug("Multiplicity of DEAssociationEnd : "+deaend+" is not respected for config "+conf+". Number of links : "+links+" | Multiplicity : "+multToTest.getLowerBound()+" - "+multToTest.getUpperBound());
					return false;
				}
			}
		}
		return true;
	}
	
	private Map<DomainElement, Integer> countConfigurationsByDomainElement() {
		Map<DomainElement, Integer> result = new HashMap<DomainElement, Integer>();
		for (DomainElement de : this.getMspl().getDomainElements()) {
			result.put(de, 0);
		}
		for (Configuration conf : this.getSubConfigurations()) {
			DomainElement de = conf.getDomainElement();
			result.put(de, result.get(de)+1);
		}
		return result;
	}
	
	private Map<DEAssociationEnd, Map<Configuration,Integer>> countConfigurationsByDEAssociation() {
		Map<DEAssociationEnd, Map<Configuration,Integer>> result = new HashMap<DEAssociationEnd, Map<Configuration,Integer>>();
		for (DEAssociation dea : this.getMspl().getAssociations()) {
			result.put(dea.getExtremity().get(0), new HashMap<Configuration,Integer>());
			result.put(dea.getExtremity().get(1), new HashMap<Configuration,Integer>());
		}
		
		for (Link l : this.getLinks()) {
			Configuration confSource = l.getSource();
			Configuration confTarget = l.getTarget();
			DEAssociation asso = l.getRelatedAssociation();
			
			Map<Configuration,Integer> inter = result.get(asso.getExtremity().get(1));
			int baseValue = 0;
			
			if (inter.containsKey(confSource)) {
				baseValue = inter.get(confSource);
			}
			inter.put(confSource, baseValue+1);
			
			inter = result.get(asso.getExtremity().get(0));
			baseValue = 0;
			
			if (inter.containsKey(confTarget)) {
				baseValue = inter.get(confTarget);
			}
			inter.put(confTarget, baseValue+1);
			
		}
		return result;
	}
	
	private boolean isSomeConfigurationUnlinked() throws ConfigNotFoundException, DomainElementNotFoundException {
		for (Configuration conf : this.getSubConfigurations()) {
			if (!conf.isCompletlyLinked()) {
				log.debug("Configuration "+conf+" is not completely linked.");
				return true;
			}
		}
		return false;
	}
	
	// TODO Check that one
	// Need unit test with Zone case
	@Override
	public EList<Configuration> getCompatibleConfigurations(Configuration confSource, DEAssociation asso) throws InvalidAssociationException, IllegalCallException, FMEngineException, ElementNotFoundException {
		log.debug("Look for a compatible configuration for config "+confSource.getId()+" and asso "+asso.getId());
		
		if (!confSource.canBeLinked(asso))
			throw new InvalidAssociationException("The configuration "+confSource+" is not linkable using association "+asso);
		
		DomainElement deTarget = asso.getOppositeExtremity(confSource.getDomainElement()).getApply_on();
		
		EList<Configuration> result = new BasicEList<Configuration>();
		
		if (!deTarget.getMultiplicityElement().isExactlyOne()) {
			Context c = confSource.getCPSRef().getContext();
			ConfigurationProcessStep cpsTargeted = c.getCPSOfDE(deTarget);
			ConfigurationState csTargeted = cpsTargeted.getState();
			
			for (Configuration conf : this.getSubConfigurations()) {
				ConfigurationProcessStep cpsCandidate = conf.getCPSRef();
				if (cpsCandidate.getDomainElement().equals(deTarget) && conf.canBeLinked(asso)) {
					log.debug("Evaluate a potential compatible configuration for "+confSource.getId()+" : "+conf.getId());
					ConfigurationState csCandidate = cpsCandidate.getState();
					if (csTargeted.isIncludedIn(csCandidate)) {
						
						if (cpsTargeted.isMergeableWithCPS(conf.getCPSRef())) {
							result.add(conf);
						}
					}
				}
			}
		} else {
			for (Configuration conf : this.getSubConfigurations()) {
				if (conf.getDomainElement().equals(deTarget) && conf.canBeLinked(asso)) {
					result.add(conf);
				}
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "CompConf "+this.getName();
	}
}
