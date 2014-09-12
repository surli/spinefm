package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

public class ActionRenameProductImplDelegate extends ActionRenameProductImpl {

	private static Logger log = Logger.getLogger(ActionRenameProductImplDelegate.class);
	
	@Override
	public void apply() {
		this.getProduct().setName(this.getNewName());
	}
	
	@Override
	public void undo() {
		this.getProduct().setName(this.getOldName());
	}
	
	public String toString() {
		return "Action RenameProduct ["+this.getOldName()+" -> "+this.getNewName()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}
