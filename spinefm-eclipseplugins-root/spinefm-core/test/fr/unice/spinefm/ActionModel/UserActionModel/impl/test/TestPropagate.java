package fr.unice.spinefm.ActionModel.UserActionModel.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext;
import fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate;
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

public class TestPropagate extends InitSimpleModel {

	@Test
	public void testPropagate() throws ElementNotFoundException, FatalSpineFMException, FMEngineException {
		this.initModel();
		assertEquals(0,cm.getLocalContexts().size());
		UserCreateContext ucc = UserActionModelFactory.eINSTANCE.createUserCreateContext();
		ucc.initManualAction(cm);
		ucc.apply();
		
		Context cl = (Context)ucc.getResult();
		Context cg = cm.getGlobalContext();
		FMSpineFMAdapter fma = cm.getFma();
		
		DomainElement deLayout = cm.getMspl().getDomainElementByName("layout");
		Feature fLayoutGLC = deLayout.getRefers_on().getFeatureFromName("GLC");
		Feature fLayoutIRSAM = deLayout.getRefers_on().getFeatureFromName("IRSAM");
		ConfigurationProcessStep cpsLayout = cg.getCPSOfDE(deLayout);
		ConfigurationState csLayout = cpsLayout.getState();
		
		DomainElement deZone = cm.getMspl().getDomainElementByName("zone");
		Feature fzoneGLC = deZone.getRefers_on().getFeatureFromName("GLC");
		Feature fzoneIRSAM = deZone.getRefers_on().getFeatureFromName("IRSAM");
		
		ConfigurationProcessStep cpsZone = cl.getCPSOfDE(deZone);
		ConfigurationState csZone = cpsZone.getState();
		
		UserSelect usc = UserActionModelFactory.eINSTANCE.createUserSelect();
		usc.initManualAction(cm);
		usc.setContextID(cg.getId());
		usc.setDomainElementName("layout");
		usc.setFeatureName("GLC");
		usc.apply();
		
		Set<Feature> features = fma.getSelectedFeatures(cpsLayout.getConfName(), deLayout.getRefers_on());
		assertTrue(features.contains(fLayoutGLC));
		assertTrue(csLayout.getSelectedFeatures().contains(fLayoutGLC));
		assertFalse(features.contains(fLayoutIRSAM));
		assertTrue(csLayout.getDeselectedFeatures().contains(fLayoutIRSAM));
		
		UserPropagate up = UserActionModelFactory.eINSTANCE.createUserPropagate();
		up.initManualAction(cm);
		up.setContextID(cg.getId());
		up.setDomainElementName(deLayout.getId());
		up.apply();
		
		features = fma.getSelectedFeatures(cpsZone.getConfName(), deZone.getRefers_on());
		assertTrue(features.contains(fzoneGLC));
		assertTrue(csZone.getSelectedFeatures().contains(fzoneGLC));
		assertFalse(features.contains(fzoneIRSAM));
		assertTrue(csZone.getDeselectedFeatures().contains(fzoneIRSAM));
		
	}
}
