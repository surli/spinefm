package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ProcessModel.ContextManager;

public class UserActionImplDelegate extends UserActionImpl {

	@Override
	public void initManualAction(ContextManager contextManager) {
		this.setContextManager(contextManager);
		contextManager.getPast().createStep(this);
		this.setType(ActionMode.MANUAL);
	}
	
	@Override
	public String getDescription() {
		return this.getClass().getName();
	}
	
	@Override
	public String transformContextNameToSave(String contextID) {
		if (contextID.equals(this.getContextManager().getGlobalContext().getId())) {
			return "globalcontext";
		} else {
			return contextID;
		}
	}
}
