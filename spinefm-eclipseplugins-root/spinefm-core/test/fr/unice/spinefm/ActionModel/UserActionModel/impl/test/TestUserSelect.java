package fr.unice.spinefm.ActionModel.UserActionModel.impl.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext;
import fr.unice.spinefm.ActionModel.UserActionModel.UserSelect;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class TestUserSelect extends InitSimpleModel {

	@Test
	public void testSelectWorks() throws ElementNotFoundException, FatalSpineFMException, FMEngineException {
		this.initModel();
		assertEquals(0,cm.getLocalContexts().size());
		UserCreateContext ucc = UserActionModelFactory.eINSTANCE.createUserCreateContext();
		ucc.initManualAction(cm);
		ucc.apply();
		Context c = (Context)ucc.getResult();
		
		DomainElement de = cm.getMspl().getDomainElementByName("zone");
		Feature f = de.getRefers_on().getFeatureFromName("GLC");
		ConfigurationProcessStep cps = c.getCPSOfDE(de);
		ConfigurationState cs = cps.getState();
		FMSpineFMAdapter fma = cm.getFma();
		
		assertFalse(cs.getSelectedFeatures().contains(f));
		
		UserSelect usc = UserActionModelFactory.eINSTANCE.createUserSelect();
		usc.initManualAction(cm);
		usc.setContextID(c.getId());
		usc.setDomainElementName("zone");
		usc.setFeatureName("GLC");
		usc.apply();
		
		Set<Feature> features = fma.getSelectedFeatures(cps.getConfName(), de.getRefers_on());
		assertTrue(features.contains(f));
		assertTrue(cs.getSelectedFeatures().contains(f));
		
		
		cm.getPast().undoLastAction();
		
		features = fma.getSelectedFeatures(cps.getConfName(), de.getRefers_on());
		assertFalse(features.contains(f));
		assertFalse(cs.getSelectedFeatures().contains(f));
	}
}
