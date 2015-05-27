package fr.unice.spinefm.ProcessModel.impl;

import java.util.HashMap;
import java.util.Map;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.GlobalContext;
import fr.unice.spinefm.ProcessModel.LocalContext;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.stats.PropagationStats;

public class ContextManagerImplDelegate extends ContextManagerImpl {

	private Map<String, Context> mapOfContexts;
	private Map<String, ConfigurationProcessStep> mapOfCPS;
	private PropagationStats stats;
	private int counter;
	
	protected ContextManagerImplDelegate() {
		super();
		this.mapOfContexts = new HashMap<String, Context>();
		this.mapOfCPS = new HashMap<String,ConfigurationProcessStep>();
		this.stats = new PropagationStats();
	}
	
	public PropagationStats getStats() {
		return this.stats;
	}
	
	@Override
	public void init(Step step) throws FMEngineException, ElementNotFoundException {
		this.counter = 0;
		GlobalContext gc = ProcessModelFactory.eINSTANCE.createGlobalContext();
		gc.setId(this.getId()+"_globalcontext");
		this.setGlobalContext(gc);
		this.mapOfContexts.put("globalcontext",this.getGlobalContext());
		this.mapOfContexts.put(this.getGlobalContext().getId(),this.getGlobalContext());
		this.createCPSInNewContext(this.getGlobalContext(), step);
	}
	
	private void createCPSInNewContext(Context c, Step step) throws FMEngineException, ElementNotFoundException {
		for (DomainElement de : this.mspl.getDomainElements()) {
			if (c.equals(this.globalContext) || !de.getMultiplicityElement().isExactlyOne()) {
				ConfigurationProcessStep cps = ProcessModelFactory.eINSTANCE.createConfigurationProcessStep();
				cps.setId(c.getId()+"_"+de.getId());
				cps.setDescription("PartialConf_"+de.getId()+"_"+this.counter);
				cps.setDomainElement(de);
				cps.setFMA(this.fma, step);
				c.addCPS(cps);
				this.mapOfCPS.put(cps.getId(), cps);
				cps.setContext(c);
				if (this.globalContext != null) {
					c.mergeExternalCPS(this.globalContext.getCPSOfDE(de), step, this);
				}
			}
		}
	}
	
	@Override
	public ConfigurationProcessStep getCPSFromId(String id) throws CPSNotFoundException {
		if (this.mapOfCPS.containsKey(id)) {
			return this.mapOfCPS.get(id);
		} else {
			String[] idElements = id.split("_");
			if (idElements.length == 3 && idElements[1].equals("globalcontext")) {
				String idRebuilt = this.getId()+"_"+idElements[1]+"_"+idElements[2];
				if (this.mapOfCPS.containsKey(idRebuilt)) {
					return this.mapOfCPS.get(idRebuilt);
				}
			}
			throw new CPSNotFoundException("CPS with id "+id+" does not exist.");
		}
	}

	@Override
	public Context createNewContext(Step step) throws FMEngineException, ElementNotFoundException {
		LocalContext c = ProcessModelFactory.eINSTANCE.createLocalContext();
		c.setId("cl_"+step.getId().replace("-", ""));
		//c.setId("cl_"+(counter++)+"_"+this.getId());
		this.createCPSInNewContext(c,step);
		this.getLocalContexts().add(c);
		this.mapOfContexts.put(c.getId(),c);
		return c;
	}
	
	@Override
	public void removeContext(Context c) {
		this.mapOfContexts.remove(c.getId());
		this.getLocalContexts().remove(c);
	}
	
	@Override
	public void restoreContext(Context c) {
		this.mapOfContexts.put(c.getId(),c);
		this.getLocalContexts().add((LocalContext) c);
	}

	@Override
	public Context getContextFromId(String id) throws ContextNotFoundException {
		if (this.mapOfContexts.containsKey(id)) {
			return this.mapOfContexts.get(id);
		} else {
			throw new ContextNotFoundException("Context not found with the ID : "+id);
		}
	}
}
