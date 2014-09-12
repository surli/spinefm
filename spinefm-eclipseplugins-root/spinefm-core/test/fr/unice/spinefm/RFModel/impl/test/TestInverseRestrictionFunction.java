package fr.unice.spinefm.RFModel.impl.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.RFModel.Rule;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.GroupState;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.utils.Utils;

public class TestInverseRestrictionFunction {

	List<Rule> rules;
	
	@Before
	public void setUp() {
		FeatureModel fmSource = FMModelFactory.eINSTANCE.createFeatureModel();
		FeatureModel fmTarget = FMModelFactory.eINSTANCE.createFeatureModel();
		
		Feature a,b;
		
		a = FMModelFactory.eINSTANCE.createFeature();
		a.setId("fmSource.a");
		a.setName("a");
		
		fmSource.addFeature(a.getName(), a, GroupState.MANDATORY);
		
		b = FMModelFactory.eINSTANCE.createFeature();
		b.setId("fmTarget.b");
		b.setName("b");
		
		fmTarget.addFeature(b.getName(), b, GroupState.MANDATORY);
		
		fmSource.setRoot(a);
		fmTarget.setRoot(b);
		
		this.rules = new ArrayList<Rule>();
		Rule r1 = RFModelFactory.eINSTANCE.createRule();
		Rule r2 = RFModelFactory.eINSTANCE.createRule();
		
		ConfigurationState cs1 = RFModelFactory.eINSTANCE.createConfigurationState();
		cs1.setFm(fmSource);
		cs1.getSelectedFeatures().add(a);
		
		ConfigurationState cs2 = RFModelFactory.eINSTANCE.createConfigurationState();
		cs2.setFm(fmSource);
		cs2.getDeselectedFeatures().add(a);
		
		ActionSelect act1 = SystemActionModelFactory.eINSTANCE.createActionSelect();
		ActionDeselect act2 = SystemActionModelFactory.eINSTANCE.createActionDeselect();
		
		act1.setFm(fmTarget);
		act1.setFeature(b);
		act1.setFma(null);
		
		act2.setFm(fmTarget);
		act2.setFeature(b);
		act2.setFma(null);
		
		r1.setAction(act1);
		r1.setState(cs1);
		
		r2.setAction(act2);
		r2.setState(cs2);
		rules.add(r1);
		rules.add(r2);
	}
	
	@Test
	public void testInverseRestrictionFunctionHasAllInverseRules() throws FeatureNotFoundException {
		EList<Rule> invRules = new BasicEList<Rule>();
		
		for (Rule r : this.rules) {
			invRules.add(r.createInverseRule());
		}
		
		RestrictionFunction restfunc = RFModelFactory.eINSTANCE.createRestrictionFunction();
		restfunc.getRules().addAll(this.rules);
		restfunc.setId("test");
		
		RestrictionFunction restfuncInv = restfunc.createAndAssociateInverseRestFunc();
		assertEquals("Inverse restriction function has the same number of rules ", invRules.size(), restfuncInv.getRules().size());
		assertTrue("Inverse rules are the right ones", Utils.equalsEList(invRules, restfuncInv.getRules()));
	}
	
	@Test
	public void testComputeInverseRestrictionFunctionSetTheInverseAttributeProperly() throws FeatureNotFoundException {
		RestrictionFunction restfunc = RFModelFactory.eINSTANCE.createRestrictionFunction();
		restfunc.getRules().addAll(this.rules);
		restfunc.setId("test");
		
		RestrictionFunction restfuncInv = restfunc.createAndAssociateInverseRestFunc();
		assertSame("Inverse restriction function has the original restriction function as inverse ", restfunc, restfuncInv.getInverse());
		assertSame("restriction function has the inverse restriction function as inverse ", restfuncInv, restfunc.getInverse());
	}
}
