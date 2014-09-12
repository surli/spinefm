package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

public class ActionRenameConfigImplDelegate extends ActionRenameConfigImpl {
	private static Logger log = Logger.getLogger(ActionRenameConfigImplDelegate.class);
	
	@Override
	public void apply() {
		this.getConfig().setDescription(this.getNewName());
	}
	
	@Override
	public void undo() {
		this.getConfig().setDescription(this.getOldName());
	}
	
	public String toString() {
		return "Action RenameConfig ["+this.getOldName()+" -> "+this.getNewName()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}
