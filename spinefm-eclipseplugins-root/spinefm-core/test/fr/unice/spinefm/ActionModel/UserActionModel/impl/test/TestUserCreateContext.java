package fr.unice.spinefm.ActionModel.UserActionModel.impl.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

public class TestUserCreateContext extends InitSimpleModel {
	
	@Test
	public void testCreateContextAndUndoWorks() throws ElementNotFoundException, FatalSpineFMException {
		this.initModel();
		assertEquals(0,cm.getLocalContexts().size());
		UserCreateContext ucc = UserActionModelFactory.eINSTANCE.createUserCreateContext();
		ucc.initManualAction(cm);
		ucc.apply();
		assertEquals(1,cm.getLocalContexts().size());
		cm.getPast().undoLastAction();
		assertEquals(0,cm.getLocalContexts().size());
	}
}
