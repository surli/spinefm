package fr.unice.spinefm.RFModel.impl.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;
import fr.unice.spinefm.ActionModel.ActionModelFactory;
import fr.unice.spinefm.ActionModel.ActionModelPackage;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.utils.Utils;

public class TestConfigurationState {
	
	private FeatureModel fm;
	private Feature root;
	private Feature foo;
	private Feature bar;
	private Feature bidule;
	private Feature truc;
	private ConfigurationState cs1,cs2;
	
	@Before
	public void setUp() {
		fm = FMModelFactory.eINSTANCE.createFeatureModel();
		fm.setId("toto");
		fm.setName("toto");
		
		root = FMModelFactory.eINSTANCE.createFeature();
		root.setId("root");
		root.setName("Root");
		
		foo = FMModelFactory.eINSTANCE.createFeature();
		foo.setId("foo");
		foo.setName("foo");
		
		bar = FMModelFactory.eINSTANCE.createFeature();
		bar.setId("bar");
		bar.setName("bar");
		
		bidule = FMModelFactory.eINSTANCE.createFeature();
		bidule.setId("bidule");
		bidule.setName("bidule");
		
		truc = FMModelFactory.eINSTANCE.createFeature();
		truc.setId("truc");
		truc.setName("truc");
		cs1 = RFModelFactory.eINSTANCE.createConfigurationState();
		cs1.setFm(fm);
		cs2 = RFModelFactory.eINSTANCE.createConfigurationState();
		cs2.setFm(fm);
	}
	
	@Test
	public void testCSIsIncludedWorksWithEmptyValue() {
		ConfigurationState csEmpty = RFModelFactory.eINSTANCE.createConfigurationState();
		assertFalse(cs1.isIncludedIn(csEmpty));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsTrueIfSelectedFeatureIsIncluded() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(root);
		
		assertTrue(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsTrueIfDeselectedFeatureIsIncluded() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getDeselectedFeatures().add(foo);
		
		assertTrue(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsTrueIfBothSelectedAndDeselectedFeatureAreIncluded() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(truc);
		cs2.getDeselectedFeatures().add(foo);
		
		assertTrue(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsTrueIfItIsEmpty() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		assertTrue(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsTrueIfCSAreEquals() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(root);
		cs2.getSelectedFeatures().add(truc);
		
		cs2.getDeselectedFeatures().add(bar);
		cs2.getDeselectedFeatures().add(foo);
		
		assertTrue(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsFalseIfItContainsOneDifferentSelectedFeature() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(root);
		cs2.getSelectedFeatures().add(bidule);
		
		assertFalse(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsFalseIfItContainsOneDifferentDeselectedFeature() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getDeselectedFeatures().add(foo);
		cs2.getDeselectedFeatures().add(bidule);
		
		assertFalse(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsFalseIfSelectedAndDeselectedAreBothDifferent() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(bar);
		cs2.getDeselectedFeatures().add(bidule);
		
		assertFalse(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsFalseIfItContainsMoreSelectedFeatures() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(root);
		cs2.getSelectedFeatures().add(truc);
		cs2.getSelectedFeatures().add(bidule);
		
		cs2.getDeselectedFeatures().add(bar);
		cs2.getDeselectedFeatures().add(foo);
		
		assertFalse(cs2.isIncludedIn(cs1));
	}
	
	@Test
	public void testCSIsIncludedInAnotherOneReturnsFalseIfItContainsMoreDeselectedFeatures() {
		cs1.getSelectedFeatures().add(root);
		cs1.getSelectedFeatures().add(truc);
		
		cs1.getDeselectedFeatures().add(bar);
		cs1.getDeselectedFeatures().add(foo);
		
		cs2.getSelectedFeatures().add(root);
		cs2.getSelectedFeatures().add(truc);
		
		cs2.getDeselectedFeatures().add(bar);
		cs2.getDeselectedFeatures().add(foo);

		cs2.getDeselectedFeatures().add(bidule);
		
		assertFalse(cs2.isIncludedIn(cs1));
	}
}
