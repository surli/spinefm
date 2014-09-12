package fr.unice.spinefm.FMModel.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fr.unice.spinefm.FMModel.*;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

public class TestFeatureModel {

	@Test
	public void testEqualsReturnsTrue() {
		//a = FM(A: B C D;)
		FeatureModel fm1 = FMModelFactory.eINSTANCE.createFeatureModel();
		fm1.setId("a");
		
		Feature fm1A = FMModelFactory.eINSTANCE.createFeature();
		fm1A.setId("A");
		fm1A.setName("A");
		
		Feature fm1B = FMModelFactory.eINSTANCE.createFeature();
		fm1B.setId("B");
		fm1B.setName("B");
		
		Feature fm1C = FMModelFactory.eINSTANCE.createFeature();
		fm1C.setId("C");
		fm1C.setName("C");
		
		Feature fm1D = FMModelFactory.eINSTANCE.createFeature();
		fm1D.setId("D");
		fm1D.setName("D");
		
		Group g = FMModelFactory.eINSTANCE.createGroup();
		fm1A.getChildren().add(g);
		g.getFeatures().add(fm1B);
		g.getFeatures().add(fm1C);
		g.getFeatures().add(fm1D);
		g.setState(GroupState.MANDATORY);
		
		fm1.setRoot(fm1A);
		
		//a = FM(A: D B C;)
		FeatureModel fm2 = FMModelFactory.eINSTANCE.createFeatureModel();
		fm2.setId("a");

		Feature fm2A = FMModelFactory.eINSTANCE.createFeature();
		fm2A.setId("A");
		fm2A.setName("A");

		Feature fm2B = FMModelFactory.eINSTANCE.createFeature();
		fm2B.setId("B");
		fm2B.setName("B");

		Feature fm2C = FMModelFactory.eINSTANCE.createFeature();
		fm2C.setId("C");
		fm2C.setName("C");

		Feature fm2D = FMModelFactory.eINSTANCE.createFeature();
		fm2D.setId("D");
		fm2D.setName("D");

		g = FMModelFactory.eINSTANCE.createGroup();
		fm2A.getChildren().add(g);
		g.getFeatures().add(fm2D);
		g.getFeatures().add(fm2B);
		g.getFeatures().add(fm2C);
		
		g.setState(GroupState.MANDATORY);

		fm2.setRoot(fm2A);
		
		assertTrue(fm1.equals(fm2));
	}
	
	@Test
	public void testEqualsReturnsFalse() {
		//a = FM(A: B C;)
		FeatureModel fm1 = FMModelFactory.eINSTANCE.createFeatureModel();
		fm1.setId("a");
		
		Feature fm1A = FMModelFactory.eINSTANCE.createFeature();
		fm1A.setId("A");
		fm1A.setName("A");
		
		Feature fm1B = FMModelFactory.eINSTANCE.createFeature();
		fm1B.setId("B");
		fm1B.setName("B");
		
		Feature fm1C = FMModelFactory.eINSTANCE.createFeature();
		fm1C.setId("C");
		fm1C.setName("C");
		
		Group g = FMModelFactory.eINSTANCE.createGroup();
		fm1A.getChildren().add(g);
		g.getFeatures().add(fm1B);
		g.getFeatures().add(fm1C);
		g.setState(GroupState.MANDATORY);
		
		fm1.setRoot(fm1A);
		
		//a = FM(A: D B C;)
		FeatureModel fm2 = FMModelFactory.eINSTANCE.createFeatureModel();
		fm2.setId("a");

		Feature fm2A = FMModelFactory.eINSTANCE.createFeature();
		fm2A.setId("A");
		fm2A.setName("A");

		Feature fm2B = FMModelFactory.eINSTANCE.createFeature();
		fm2B.setId("B");
		fm2B.setName("B");

		Feature fm2C = FMModelFactory.eINSTANCE.createFeature();
		fm2C.setId("C");
		fm2C.setName("C");

		Feature fm2D = FMModelFactory.eINSTANCE.createFeature();
		fm2D.setId("D");
		fm2D.setName("D");

		g = FMModelFactory.eINSTANCE.createGroup();
		fm2A.getChildren().add(g);
		g.getFeatures().add(fm2D);
		g.getFeatures().add(fm2B);
		g.getFeatures().add(fm2C);
		
		g.setState(GroupState.MANDATORY);

		fm2.setRoot(fm2A);
		
		assertFalse(fm1.equals(fm2));
	}
	
	@Test
	public void testAddFeatureAndGetIt() throws FeatureNotFoundException {
		FeatureModel fm = FMModelFactory.eINSTANCE.createFeatureModel();
		Feature fm1 = FMModelFactory.eINSTANCE.createFeature();
		Feature fm2 = FMModelFactory.eINSTANCE.createFeature();
		Feature fm3 = FMModelFactory.eINSTANCE.createFeature();
		
		fm1.setId("Feature1");
		fm1.setName("feature_1");
		
		fm2.setId("Feature2");
		fm2.setName("foo");
		
		fm3.setId("foo");
		fm3.setName("Feature3");
		
		fm.addFeature(fm1.getName(), fm1, null);
		fm.addFeature(fm2.getName(), fm2, null);
		fm.addFeature(fm3.getName(), fm3, null);
		
		Feature fx = fm.getFeatureFromName("foo");
		assertEquals(fx, fm2);
	}
	
	@Test
	public void testAddFeatureWithGroupStateAndGetGroupState() {
		FeatureModel fm = FMModelFactory.eINSTANCE.createFeatureModel();
		Feature fm1 = FMModelFactory.eINSTANCE.createFeature();
		Feature fm2 = FMModelFactory.eINSTANCE.createFeature();
		Feature fm3 = FMModelFactory.eINSTANCE.createFeature();
		
		fm1.setId("Feature1");
		fm1.setName("feature_1");
		
		fm2.setId("Feature2");
		fm2.setName("foo");
		
		fm3.setId("foo");
		fm3.setName("Feature3");
		
		fm.addFeature(fm1.getName(), fm1, GroupState.MANDATORY);
		fm.addFeature(fm2.getName(), fm2, GroupState.OPTIONAL);
		fm.addFeature(fm3.getName(), fm3, GroupState.OR);
		
		GroupState gs = fm.getStateFT(fm2);
		assertEquals(gs, GroupState.OPTIONAL);
	}

}
