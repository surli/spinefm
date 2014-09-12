package fr.unice.spinefm.fmengine.familiar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.unice.spinefm.FMModel.Constraint;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.utils.Debug;

public class TestAddConstraint {

	private FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
	private FMLSpineFMAdapter fma = new FMLSpineFMAdapter(this.sfi);

	@After
	public void tearDown() {
		this.sfi.clearInterpreter();
	}

	FeatureModel fmObtained;
	private static final String FAMILIAR_FM = "a = FM(A: B [C] [D]; C: (E|F);)";
	private static final String CONF_NAME = "conf_a";

	@Before
	public void setUp() throws FMEngineException {
		this.fma.getSFI().eval(FAMILIAR_FM);
		this.fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		this.fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);
		this.fma.createConfiguration(CONF_NAME, fmObtained);
	}
	
	@Test
	public void testAddConstraintAllowToUseThatConstraint() throws FMEngineException, FeatureNotFoundException {
		Constraint c = FMModelFactory.eINSTANCE.createConstraint();
		c.setRule("D -> E");
		this.fma.addConstraint(c, CONF_NAME);
		Feature D = fmObtained.getFeatureFromName("D");
		this.fma.selectFeatureInConfiguration(D, CONF_NAME);
		Set<Feature> lfObtained = this.fma.getSelectedFeatures(CONF_NAME, fmObtained);
		Set<Feature> lfExpected = new HashSet<Feature>();
		lfExpected.add(fmObtained.getFeatureFromName("D"));
		lfExpected.add(fmObtained.getFeatureFromName("E"));
		lfExpected.add(fmObtained.getFeatureFromName("A"));
		lfExpected.add(fmObtained.getFeatureFromName("B"));
		lfExpected.add(fmObtained.getFeatureFromName("C"));
		assertEquals("The added constraint seems not respected.",lfExpected, lfObtained);
	}
	
	@Test
	public void testAddConstraintAfterAFirstConfigurationWorks() throws FMEngineException, FeatureNotFoundException {
		Feature D = fmObtained.getFeatureFromName("D");
		this.fma.selectFeatureInConfiguration(D, CONF_NAME);
		Constraint c = FMModelFactory.eINSTANCE.createConstraint();
		c.setRule("D -> E");
		this.fma.addConstraint(c, CONF_NAME);
		Set<Feature> lfObtained = this.fma.getSelectedFeatures(CONF_NAME, fmObtained);
		Set<Feature> lfExpected = new HashSet<Feature>();
		lfExpected.add(fmObtained.getFeatureFromName("D"));
		lfExpected.add(fmObtained.getFeatureFromName("E"));
		lfExpected.add(fmObtained.getFeatureFromName("A"));
		lfExpected.add(fmObtained.getFeatureFromName("B"));
		lfExpected.add(fmObtained.getFeatureFromName("C"));
		assertEquals("The added constraint seems not respected.",lfExpected, lfObtained);
	}
	
	@Test
	public void testAddMultipleConstraintsWorks() throws FMEngineException, FeatureNotFoundException {
		Constraint c = FMModelFactory.eINSTANCE.createConstraint();
		c.setRule("C -> E");
		this.fma.addConstraint(c, CONF_NAME);
		c = FMModelFactory.eINSTANCE.createConstraint();
		c.setRule("E -> D");
		this.fma.addConstraint(c, CONF_NAME);
		Feature C = fmObtained.getFeatureFromName("C");
		this.fma.selectFeatureInConfiguration(C, CONF_NAME);
		Set<Feature> lfObtained = this.fma.getSelectedFeatures(CONF_NAME, fmObtained);
		Set<Feature> lfExpected = new HashSet<Feature>();
		lfExpected.add(fmObtained.getFeatureFromName("D"));
		lfExpected.add(fmObtained.getFeatureFromName("E"));
		lfExpected.add(fmObtained.getFeatureFromName("A"));
		lfExpected.add(fmObtained.getFeatureFromName("B"));
		lfExpected.add(fmObtained.getFeatureFromName("C"));
		assertEquals("The added constraint seems not respected.",lfExpected, lfObtained);
	}
}
