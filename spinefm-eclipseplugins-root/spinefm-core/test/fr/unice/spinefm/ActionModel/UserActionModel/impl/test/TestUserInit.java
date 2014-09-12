package fr.unice.spinefm.ActionModel.UserActionModel.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

public class TestUserInit extends InitSimpleModel {
	
	@Test
	public void testInit() throws ElementNotFoundException, FatalSpineFMException {
		this.initModel();
		assertTrue(this.cm != null);
		assertTrue(this.cm.getMspl() != null);
		assertEquals(5,this.cm.getMspl().getDomainElements().size());
	}
}
