package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class ActionCreateContextImplDelegate extends ActionCreateContextImpl {

	private static Logger log = Logger.getLogger(ActionCreateContextImplDelegate.class);

	@Override
	public void apply() throws FMEngineException, ElementNotFoundException {
		log.debug("Apply action CreateContext from step "+this.getStep());
		this.context = this.contextManager.createNewContext(this.getStep());
		
	}
	
	@Override
	public void undo() {
		log.debug("Undo action CreateContext from step "+this.getStep());
		this.contextManager.removeContext(this.context);
	}
	
	public String toString() {
		return "Action CreateContext [Type : "+this.getType()+"] "+this.getStep();
	}
}
