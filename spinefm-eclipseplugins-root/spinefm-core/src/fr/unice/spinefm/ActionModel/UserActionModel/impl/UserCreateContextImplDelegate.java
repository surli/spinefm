package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class UserCreateContextImplDelegate extends UserCreateContextImpl {

	protected static Logger log = Logger.getLogger(UserCreateContextImplDelegate.class);
	
	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		log.info("\n\n\t\t Apply user action CreateContext\n\n");
		ActionCreateContext acc = SystemActionModelFactory.eINSTANCE.createActionCreateContext();
		acc.setContextManager(this.getContextManager());
		acc.setStep(this.getStep());
		acc.setType(ActionMode.AUTOMATIC);
		try {
			acc.apply();
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}
		this.setResult(acc.getContext());
	}
	
	@Override
	public String getDescription() {
		return "Create a new context";
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		return UserActionModelFactory.eINSTANCE.createUserCreateContext();
	}
}
