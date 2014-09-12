package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

public class ActionMoveConfigurationImplDelegate extends ActionMoveConfigurationImpl {

	private static Logger log = Logger.getLogger(ActionMoveConfigurationImplDelegate.class);
	
	@Override
	public void apply() {
		log.debug("Apply action MoveConfiguration in step "+this.getStep());
		this.cpsTarget.setConfiguration(configuration);
		this.cpsSource.setConfiguration(null);
	}
	
	@Override
	public void undo() {
		log.debug("Undo action MoveConfiguration in step "+this.getStep());
		this.cpsSource.setConfiguration(this.configuration);
		this.cpsTarget.setConfiguration(null);
	}
	
	public String toString() {
		return "Action MoveConfig [Config : "+this.getConfiguration().getDescription()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}
