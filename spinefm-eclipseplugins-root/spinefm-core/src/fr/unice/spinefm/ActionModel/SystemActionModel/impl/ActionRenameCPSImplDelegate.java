package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

public class ActionRenameCPSImplDelegate extends ActionRenameCPSImpl {

	private static Logger log = Logger.getLogger(ActionRenameCPSImplDelegate.class);
	
	@Override
	public void apply() {
		this.getCps().setDescription(newName);
	}
	
	@Override
	public void undo() {
		this.getCps().setDescription(oldName);
	}
	
	public String toString() {
		return "Action RenameCPS ["+this.getOldName()+" -> "+this.getNewName()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}
