package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

public class ActionDeleteContextImplDelegate extends ActionDeleteContextImpl {
	private static Logger log = Logger.getLogger(ActionDeleteContextImplDelegate.class);
	
	@Override
	public void apply() {
		log.debug("Apply action DeleteContext from step "+this.getStep());
		this.contextManager.removeContext(context);
	}
	
	@Override
	public void undo() {
		log.debug("Undo action DeleteContext from step "+this.getStep());
		this.contextManager.restoreContext(context);
	}
	
	public String toString() {
		return "Action DeleteContext [Ctx : "+this.getContext().getId()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}
