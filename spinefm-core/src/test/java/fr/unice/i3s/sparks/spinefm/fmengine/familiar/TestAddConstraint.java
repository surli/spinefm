package fr.unice.i3s.sparks.spinefm.fmengine.familiar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.familiar.parser.FeatureNotFoundException;
import fr.unice.i3s.sparks.spinefm.featuremodeling.Constraint;
import fr.unice.i3s.sparks.spinefm.featuremodeling.Feature;
import fr.unice.i3s.sparks.spinefm.featuremodeling.FeatureModel;
import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		this.fmObtained = new FeatureModel();
		this.fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);
		this.fma.createConfiguration(CONF_NAME, fmObtained);
	}
	
	@Test
	public void testAddConstraintAllowToUseThatConstraint() throws FMEngineException, FeatureNotFoundException {
		Constraint c = new Constraint();
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
		Constraint c = new Constraint();
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
		Constraint c = new Constraint();
		c.setRule("C -> E");
		this.fma.addConstraint(c, CONF_NAME);
		c = new Constraint();
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
