package fr.unice.spinefm.ProcessModel.impl;

import java.util.HashMap;
import java.util.Map;

import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class ContextImplDelegate extends ContextImpl {
	private Map<DomainElement,ConfigurationProcessStep> mapCPS;
	
	protected ContextImplDelegate() {
		super();
		this.mapCPS = new HashMap<DomainElement,ConfigurationProcessStep>();
	}
	
	@Override
	public void addCPS(ConfigurationProcessStep cps) {
		this.getCPS().add(cps);
		this.mapCPS.put(cps.getDomainElement(), cps);
	}
	
	@Override
	public ConfigurationProcessStep getCPSOfDE(DomainElement de) throws CPSNotFoundException {
		if (!this.mapCPS.containsKey(de))
			throw new CPSNotFoundException("CPS of DE "+de+" can not be found in context "+this);
		return this.mapCPS.get(de);
	}
	
	@Override
	public void mergeExternalCPS(ConfigurationProcessStep externalCPS, Step step, ContextManager cm) throws FMEngineException, ElementNotFoundException {
		ConfigurationProcessStep sourceCPS = this.getCPSOfDE(externalCPS.getDomainElement());
		sourceCPS.mergeWithExternalCPS(externalCPS, step, cm);
	}
	
	@Override
	public String toString() {
		return "Ctx "+this.getId();
	}
	
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
}
