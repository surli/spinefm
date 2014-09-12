package fr.unice.spinefm.ActionModel.UserActionModel.impl.test;

import org.junit.After;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserInit;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.core.ModelInstancesFactory;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

public abstract class InitSimpleModel {

	@After
	public void after() {
		cm.getFma().getSFI().clearInterpreter();
		ModelInstancesFactory.emptyList();
	}
	
	protected ContextManager cm;
	
	protected void initModel() throws ElementNotFoundException, FatalSpineFMException {
		UserInit ui = UserActionModelFactory.eINSTANCE.createUserInit();
		ui.setFilePath("./test-resources/simplemodel/MultipleSoftwareProductLine.xmi");
		ui.apply();
		
		this.cm = (ContextManager)ui.getResult();
	}
}
