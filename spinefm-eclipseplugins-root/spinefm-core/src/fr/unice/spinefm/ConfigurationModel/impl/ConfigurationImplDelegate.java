package fr.unice.spinefm.ConfigurationModel.impl;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.Link;
import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultiplicityElement;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

public class ConfigurationImplDelegate extends ConfigurationImpl {

	private static Logger log = Logger.getLogger(ConfigurationImplDelegate.class);
	private static int counter = 0;
	
	public ConfigurationImplDelegate() {
		super();
		this.setId("conf_"+counter++);
		this.setDescription(this.getId());
	}
	
	@Override
	public FeatureModel getFeatureModel() {
		return this.getDomainElement().getRefers_on();
	}
	
	@Override
	public boolean canBeLinked(DEAssociation association) throws DomainElementNotFoundException {
		log.debug("Check cardinalities on configurations "+this+" with association "+association);
		int involvedInLinkRelativeToAssociaton = 0;
		for (Link l : this.getBelongs_to()) {
			log.debug("Check link "+l+" of config "+this+" with asso "+association);
			if (l.getRelatedAssociation().equals(association)) {
				involvedInLinkRelativeToAssociaton++;
			}
		}
		log.debug("Number of links related to the association for "+this+" : "+involvedInLinkRelativeToAssociaton);
		
		DEAssociationEnd opposite = association.getOppositeExtremity(this.getDomainElement());
		MultiplicityElement me = opposite.getLinkMultiplicity();
		log.debug("Check with multiplicity "+me);
		return me.isLowerThanUpperBound(involvedInLinkRelativeToAssociaton);
	}
	
	@Override
	public EList<Configuration> getLinkedConfigurationsOfDomainElement(DomainElement de) throws ConfigNotFoundException {
		EList<Configuration> result = new BasicEList<Configuration>();
		for (Link l : this.getBelongs_to()) {
			Configuration target = l.getAssociatedConfiguration(this);
			if (target.getDomainElement().equals(de)) {
				result.add(target);
				log.debug("GetLinkedConfiguration of DE "+de+" on config "+this+" explore link : "+l+" | Test with config : "+target+" succeed.");
			} else {
				log.debug("GetLinkedConfiguration of DE "+de+" on config "+this+" explore link : "+l+" | Test with config : "+target+" failed.");
			}
			
		}
		return result;
	}
	
	@Override
	public void setCPSRef(ConfigurationProcessStep cps) {
		super.setCPSRef(cps);
		
		if (cps != null) {
			this.setDescription(cps.getDescription());
		} else {
			this.setDescription("");
		}
	}
	
	@Override
	public boolean isCompletlyLinked() throws ConfigNotFoundException, DomainElementNotFoundException {
		DomainElement deSource = this.getDomainElement();
		for (DEAssociation asso : deSource.getBelongs_to()) {
			log.debug("isCompletelyLinked : "+this+" test association "+asso);
			DEAssociationEnd deaTarget = asso.getOppositeExtremity(this.getDomainElement());
			DomainElement deTarget = deaTarget.getApply_on();
			MultiplicityElement me = deaTarget.getLinkMultiplicity();
			if (me.getLowerBound() == 1 && this.getLinkedConfigurationsOfDomainElement(deTarget).isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public EList<ConfigurationProcessStep> getAllCPS() {
		EList<ConfigurationProcessStep> result = new BasicEList<ConfigurationProcessStep>();
		result.add(this.getCPSRef());
		result.addAll(this.getClonedCPS());
		return result;
	}
	
	@Override
	public String toString() {
		return "Config "+this.getId()+" ["+this.getDescription()+"]";
	}
}
