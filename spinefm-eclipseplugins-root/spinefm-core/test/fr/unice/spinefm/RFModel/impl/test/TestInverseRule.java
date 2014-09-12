package fr.unice.spinefm.RFModel.impl.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.unice.spinefm.ActionModel.ActionModelFactory;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.Rule;
import fr.unice.spinefm.FMModel.*;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

public class TestInverseRule {

	FeatureModel fmSource;
	FeatureModel fmTarget;
	
	Feature a,b,c;
	Feature x,y,z;
	
	@Before
	public void setUp() {
		this.fmSource = FMModelFactory.eINSTANCE.createFeatureModel();
		this.fmSource.setId("fmSource");
		this.fmTarget = FMModelFactory.eINSTANCE.createFeatureModel();
		this.fmTarget.setId("fmTarget");
		
		a = FMModelFactory.eINSTANCE.createFeature();
		a.setId("fmSource.a");
		a.setName("a");
		this.fmSource.addFeature(a.getName(), a, GroupState.MANDATORY);
		
		b = FMModelFactory.eINSTANCE.createFeature();
		b.setId("fmSource.b");
		b.setName("b");
		
		this.fmSource.addFeature(b.getName(), b, GroupState.OPTIONAL);
		
		c = FMModelFactory.eINSTANCE.createFeature();
		c.setId("fmSource.c");
		c.setName("c");
		Group gSource = FMModelFactory.eINSTANCE.createGroup();
		gSource.getAllChildren().add(b);
		gSource.getAllChildren().add(c);
		
		this.fmSource.addFeature(c.getName(), c, GroupState.OPTIONAL);
		
		a.getChildren().add(gSource);
		fmSource.setRoot(a);
		
		x = FMModelFactory.eINSTANCE.createFeature();
		x.setId("fmTarget.x");
		x.setName("x");
		
		this.fmTarget.addFeature(x.getName(), x, GroupState.MANDATORY);
		
		y = FMModelFactory.eINSTANCE.createFeature();
		y.setId("fmTarget.y");
		y.setName("y");
		
		this.fmTarget.addFeature(y.getName(), y, GroupState.OPTIONAL);
		
		z = FMModelFactory.eINSTANCE.createFeature();
		z.setId("fmTarget.z");
		z.setName("z");
		
		this.fmTarget.addFeature(z.getName(), z, GroupState.OPTIONAL);
		
		Group gTarget = FMModelFactory.eINSTANCE.createGroup();
		gTarget.getAllChildren().add(y);
		gTarget.getAllChildren().add(z);
		x.getChildren().add(gTarget);
		fmTarget.setRoot(x);
	}
	
	private Rule createSimpleRule() {
		ConfigurationState cs = RFModelFactory.eINSTANCE.createConfigurationState();
		cs.setFm(fmSource);
		cs.getSelectedFeatures().add(a);
		
		ActionSelect action = SystemActionModelFactory.eINSTANCE.createActionSelect();
		action.setFm(fmTarget);
		action.setFeature(x);
		
		Rule r = RFModelFactory.eINSTANCE.createRule();
		r.setAction(action);
		r.setState(cs);
		return r;
	}
	
	@Test
	public void testInverseRuleStateContainsTheRightFeature() throws FeatureNotFoundException {
		Rule r = this.createSimpleRule();
		Rule rInv = r.createInverseRule();
		
		assertEquals("Source of inverse rule is not target of original rule",rInv.getState().getFm(),fmTarget);
		assertEquals("Feature implied in the state of the inverse rule is not the same that is implied in the action of the original rule",x, rInv.getState().getDeselectedFeatures().get(0));
	}
	
	@Test
	public void testIverseRuleActionContainsTheRightFeature() throws FeatureNotFoundException {
		Rule r = this.createSimpleRule();
		Rule rInv = r.createInverseRule();
		
		assertEquals("Target of inverse rule is not source of original rule",fmSource, rInv.getAction().getFm());
		//assertEquals("Feature implied in the action of the inverse rule is not the same that is implied in the state of the original rule", a.getName(), rInv.getAction().getF);
	}
	
	@Test
	public void testIverseRuleActionSelectCreateDeselectState() throws FeatureNotFoundException {
		Rule r = this.createSimpleRule();
		ActionSelect action = SystemActionModelFactory.eINSTANCE.createActionSelect();
		action.setFm(fmTarget);
		action.setFeature(x);
		r.setAction(action);
		Rule rInv = r.createInverseRule();
		
		assertEquals("Action select create a state deselect in inverse rule", 1, rInv.getState().getDeselectedFeatures().size());
		assertEquals("Action select create a state deselect in inverse rule",0, rInv.getState().getSelectedFeatures().size());
		assertEquals("Action select create a state deselect in inverse rule",x, rInv.getState().getDeselectedFeatures().get(0));	
	}
	
	@Test
	public void testIverseRuleActionDeselectCreateSelectState() throws FeatureNotFoundException {
		Rule r = this.createSimpleRule();
		ActionDeselect action = SystemActionModelFactory.eINSTANCE.createActionDeselect();
		action.setFm(fmTarget);
		action.setFeature(x);
		r.setAction(action);
		Rule rInv = r.createInverseRule();
		
		assertEquals("Action deselect create a state select in inverse rule",0 ,rInv.getState().getDeselectedFeatures().size());
		assertEquals("Action deselect create a state select in inverse rule",1 ,rInv.getState().getSelectedFeatures().size());
		assertEquals("Action deselect create a state select in inverse rule",x ,rInv.getState().getSelectedFeatures().get(0));	
	}
	
	/*@Test
	public void testSimpleStateSelectedCreateActionDeselect() {
		Rule r = this.createSimpleRule();
		Rule rInv = r.createInverseRule();
		
		assertTrue("Simple state with one feature selected create an action deselect",rInv.getActions() instanceof ActionDeselect);
		assertEquals("Simple state with one feature selected create an action deselect",a,rInv.getActions().getFeature());
	}
	
	@Test
	public void testSimpleStateDeselectedCreateActionSelect() {
		Rule r = this.createSimpleRule();
		ConfigurationState cs = RFModelFactory.eINSTANCE.createConfigurationState();
		cs.getDeselectedFeatures().add(a);
		r.setState(cs);
		Rule rInv = r.createInverseRule();
		
		assertTrue("Simple state with one feature deselected create an action select",rInv.getActions() instanceof ActionSelect);
		assertEquals("Simple state with one feature deselected create an action select",a,rInv.getActions().getFeature());
	}
	
	@Test
	public void testComplexStateWithMultipleSelectedFeatureCreateConstraintOrWithNot() {
		Rule r = this.createSimpleRule();
		ConfigurationState cs = RFModelFactory.eINSTANCE.createConfigurationState();
		cs.getSelectedFeatures().add(a);
		cs.getSelectedFeatures().add(b);
		r.setState(cs);
		Rule rInv = r.createInverseRule();
		
		String cmd = "!a or !b";
		
		assertTrue("Complex state with two features selected create an action AddCTConstraint",rInv.getActions() instanceof ActionAddCTConstraint);
		
		ActionAddCTConstraint action = (ActionAddCTConstraint)rInv.getActions();
		assertEquals("Constraint is coherent with the given state",cmd.trim(), action.getConstraint().getRule().trim());
	}
	
	@Test
	public void testComplexStateWithMultipleDeselectedFeatureCreateConstraintOr() {
		Rule r = this.createSimpleRule();
		ConfigurationState cs = ActionModelFactory.eINSTANCE.createConfigurationState();
		cs.getDeselectedFeatures().add(b);
		cs.getDeselectedFeatures().add(c);
		r.setState(cs);
		Rule rInv = r.createInverseRule();
		
		String cmd = "b or c";
		
		assertTrue("Complex state with two features deselected create an action AddCTConstraint",rInv.getActions() instanceof ActionAddCTConstraint);
		
		ActionAddCTConstraint action = (ActionAddCTConstraint)rInv.getActions();
		assertEquals("Constraint is coherent with the given state",cmd.trim(), action.getConstraint().getRule().trim());
	}
	
	@Test
	public void testComplexStateWithMultipleDeselectedAndSelectedFeatureCreateComplexConstraintOr() {
		Rule r = this.createSimpleRule();
		ConfigurationState cs = ActionModelFactory.eINSTANCE.createConfigurationState();
		cs.getSelectedFeatures().add(a);
		cs.getDeselectedFeatures().add(b);
		cs.getDeselectedFeatures().add(c);
		r.setState(cs);
		Rule rInv = r.createInverseRule();
		
		String cmd = "!a or b or c";
		
		assertTrue("Complex state with three features selected or not create an action AddCTConstraint",rInv.getActions() instanceof ActionAddCTConstraint);
		
		ActionAddCTConstraint action = (ActionAddCTConstraint)rInv.getActions();
		assertEquals("Constraint is coherent with the given state",cmd.trim(), action.getConstraint().getRule().trim());
	}
	
	@Test
	public void testComplexStateWithMultipleDeselectedAndSelectedFeatureCreateComplexConstraintOr2() {
		Rule r = this.createSimpleRule();
		ConfigurationState cs = ActionModelFactory.eINSTANCE.createConfigurationState();
		cs.getSelectedFeatures().add(a);
		cs.getDeselectedFeatures().add(b);
		cs.getSelectedFeatures().add(c);
		r.setState(cs);
		Rule rInv = r.createInverseRule();
		
		String cmd = "!a or !c or b";
		
		assertTrue("Complex state with three features selected or not create an action AddCTConstraint",rInv.getActions() instanceof ActionAddCTConstraint);
		
		ActionAddCTConstraint action = (ActionAddCTConstraint)rInv.getActions();
		assertEquals("Constraint is coherent with the given state",cmd.trim(), action.getConstraint().getRule().trim());
	}*/
}
