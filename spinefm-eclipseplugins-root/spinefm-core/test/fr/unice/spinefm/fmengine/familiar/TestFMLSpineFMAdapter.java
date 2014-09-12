package fr.unice.spinefm.fmengine.familiar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.FMModel.Constraint;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.Group;
import fr.unice.spinefm.FMModel.GroupState;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.fmengine.familiar.FMLSpineFMAdapter;
import fr.unice.spinefm.fmengine.familiar.FamiliarInterpreter;
import fr.unice.spinefm.utils.Debug;

/**
 * Tests on useful function of the class FMLSpineFMAdapter.
 * Please be sure to use the argument -Xmx1024m to run properly the tests.
 * @author Simon Urli
 *
 */
public class TestFMLSpineFMAdapter {

	private FamiliarInterpreter sfi = FamiliarInterpreter.getInstance();
	private FMLSpineFMAdapter fma = new FMLSpineFMAdapter(this.sfi);

	@After
	public void tearDown() {
		this.sfi.clearInterpreter();
	}

	@Test
	public void testPopulateFMUniqueRoot() throws FMEngineException {
		String cmd = "a = FM(A;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = FMModelFactory.eINSTANCE.createFeatureModel();
		fmExpected.setId("a");
		Feature root = FMModelFactory.eINSTANCE.createFeature();
		root.setId("a.A");
		root.setName("A");
		fmExpected.setRoot(root);

		assertEquals("FMs are not identical : ", fmExpected, fmObtained);
	}

	@Test
	public void testPopulateFMAllMandatory() throws FMEngineException {
		String cmd = "a = FM(Source: TypeInfo Product; TypeInfo: Calendar; Product: ICalReader;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = FMModelFactory.eINSTANCE.createFeatureModel();
		fmExpected.setId("a");

		Feature root = FMModelFactory.eINSTANCE.createFeature();
		root.setId("a.Source");
		root.setName("Source");

		Feature typeinfo = FMModelFactory.eINSTANCE.createFeature();
		typeinfo.setId("a.TypeInfo");
		typeinfo.setName("TypeInfo");

		Feature product = FMModelFactory.eINSTANCE.createFeature();
		product.setId("a.Product");
		product.setName("Product");

		Feature calendar = FMModelFactory.eINSTANCE.createFeature();
		calendar.setId("a.Calendar");
		calendar.setName("Calendar");

		Feature icalreader = FMModelFactory.eINSTANCE.createFeature();
		icalreader.setId("a.ICalReader");
		icalreader.setName("ICalReader");

		Group g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(typeinfo);
		root.getChildren().add(g);
		
		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(product);
		root.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(calendar);
		typeinfo.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(icalreader);
		product.getChildren().add(g);

		fmExpected.setRoot(root);
		assertEquals("FMs are not identical : ", fmExpected, fmObtained);
	}

	@Test
	public void testPopulateFMMandatoryOptionalXorOrNoConstraint() throws FMEngineException {
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = FMModelFactory.eINSTANCE.createFeatureModel();
		fmExpected.setId("a");

		Feature root = FMModelFactory.eINSTANCE.createFeature();
		root.setId("a.Source");
		root.setName("Source");

		Feature typeinfo = FMModelFactory.eINSTANCE.createFeature();
		typeinfo.setId("a.TypeInfo");
		typeinfo.setName("TypeInfo");

		Feature product = FMModelFactory.eINSTANCE.createFeature();
		product.setId("a.Product");
		product.setName("Product");

		Feature criteria = FMModelFactory.eINSTANCE.createFeature();
		criteria.setId("a.Criteria");
		criteria.setName("Criteria");

		Feature picturealbum = FMModelFactory.eINSTANCE.createFeature();
		picturealbum.setId("a.PictureAlbum");
		picturealbum.setName("PictureAlbum");

		Feature flickr = FMModelFactory.eINSTANCE.createFeature();
		flickr.setId("a.FlickR");
		flickr.setName("FlickR");

		Feature picasa = FMModelFactory.eINSTANCE.createFeature();
		picasa.setId("a.Picasa");
		picasa.setName("Picasa");

		Feature sort = FMModelFactory.eINSTANCE.createFeature();
		sort.setId("a.Sort");
		sort.setName("Sort");

		Feature date = FMModelFactory.eINSTANCE.createFeature();
		date.setId("a.Date");
		date.setName("Date");

		Feature name = FMModelFactory.eINSTANCE.createFeature();
		name.setId("a.Name");
		name.setName("Name");

		Group g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(typeinfo);
		root.getChildren().add(g);
		
		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(product);
		root.getChildren().add(g);
		
		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(criteria);
		root.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.getFeatures().add(picturealbum);
		g.setState(GroupState.MANDATORY);
		typeinfo.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.ALTERNATIVE);
		g.getFeatures().add(flickr);
		g.getFeatures().add(picasa);
		product.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.OPTIONAL);
		g.getFeatures().add(sort);
		criteria.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.OR);
		g.getFeatures().add(date);
		g.getFeatures().add(name);
		sort.getChildren().add(g);

		fmExpected.setRoot(root);
		assertEquals("FMs are not identical : ", fmExpected, fmObtained);
	}
	
	@Test
	public void testPopulateFMAndTestGetFeatureFromName() throws FMEngineException, FeatureNotFoundException {
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);
		
		Feature picturealbum = FMModelFactory.eINSTANCE.createFeature();
		picturealbum.setId("a.PictureAlbum");
		picturealbum.setName("PictureAlbum");
		
		Feature fx = fmObtained.getFeatureFromName("PictureAlbum");
		assertEquals(picturealbum, fx);
	}
	
	@Test
	public void testPopulateFMAndTestGetGroupStateFromFeature() throws FMEngineException, FeatureNotFoundException {
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);
		
		Feature f = fmObtained.getFeatureFromName("Date");
		GroupState gs = fmObtained.getStateFT(f);
		assertEquals(GroupState.OR, gs);
	}

	@Test
	public void testPopulateFMWithConstraint() throws FMEngineException {
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+; Picasa <-> Date;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = FMModelFactory.eINSTANCE.createFeatureModel();
		fmExpected.setId("a");

		Feature root = FMModelFactory.eINSTANCE.createFeature();
		root.setId("a.Source");
		root.setName("Source");

		Feature typeinfo = FMModelFactory.eINSTANCE.createFeature();
		typeinfo.setId("a.TypeInfo");
		typeinfo.setName("TypeInfo");

		Feature product = FMModelFactory.eINSTANCE.createFeature();
		product.setId("a.Product");
		product.setName("Product");

		Feature criteria = FMModelFactory.eINSTANCE.createFeature();
		criteria.setId("a.Criteria");
		criteria.setName("Criteria");

		Feature picturealbum = FMModelFactory.eINSTANCE.createFeature();
		picturealbum.setId("a.PictureAlbum");
		picturealbum.setName("PictureAlbum");

		Feature flickr = FMModelFactory.eINSTANCE.createFeature();
		flickr.setId("a.FlickR");
		flickr.setName("FlickR");

		Feature picasa = FMModelFactory.eINSTANCE.createFeature();
		picasa.setId("a.Picasa");
		picasa.setName("Picasa");

		Feature sort = FMModelFactory.eINSTANCE.createFeature();
		sort.setId("a.Sort");
		sort.setName("Sort");

		Feature date = FMModelFactory.eINSTANCE.createFeature();
		date.setId("a.Date");
		date.setName("Date");

		Feature name = FMModelFactory.eINSTANCE.createFeature();
		name.setId("a.Name");
		name.setName("Name");

		Group g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(typeinfo);
		root.getChildren().add(g);
		
		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(product);
		root.getChildren().add(g);
		
		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(criteria);
		root.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.getFeatures().add(picturealbum);
		g.setState(GroupState.MANDATORY);
		typeinfo.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.ALTERNATIVE);
		g.getFeatures().add(flickr);
		g.getFeatures().add(picasa);
		product.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.OPTIONAL);
		g.getFeatures().add(sort);
		criteria.getChildren().add(g);

		g = FMModelFactory.eINSTANCE.createGroup();
		g.setState(GroupState.OR);
		g.getFeatures().add(date);
		g.getFeatures().add(name);
		sort.getChildren().add(g);

		Constraint c = FMModelFactory.eINSTANCE.createConstraint();
		c.setRule("(Picasa <-> Date)");

		fmExpected.getConstraints().add(c);
		fmExpected.setRoot(root);
		assertEquals("FMs are not identical : ", fmExpected, fmObtained);
	}

	@Test(expected=FMEngineException.class)
	public void testEvalMalformedScriptReturnFMEngineException() throws FMEngineException {
		String cmd = "a = FM(A: N; X: Y;);";
		this.sfi.eval(cmd);
	}

	@Test(expected=FMEngineException.class)
	public void testPopulateUnexistingFMFailedWithFMEngineException() throws FMEngineException {
		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");
		this.fma.populateFeatureModel(fmObtained);
	}


	@Test
	public void testIsEquivalentReturnTrue() throws FMEngineException {
		String cmd = "a = FM(A: B C [D]; D: (E|F);)";
		this.sfi.eval(cmd);
		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");

		cmd = "b = FM(A: C [D] B; D: (F|E);)";
		this.sfi.eval(cmd);
		FeatureModel fmExpected = FMModelFactory.eINSTANCE.createFeatureModel();
		fmExpected.setId("b");

		assertTrue(this.fma.isEquivalent(fmObtained, fmExpected));
	}

	@Test
	public void testIsEquivalentReturnFalse() throws FMEngineException {
		String cmd = "a = FM(A: B C [D]; D: (E|F);)";
		this.sfi.eval(cmd);
		FeatureModel fmObtained = FMModelFactory.eINSTANCE.createFeatureModel();
		fmObtained.setId("a");

		cmd = "b = FM(A: X Y Z;)";
		this.sfi.eval(cmd);
		FeatureModel fmExpected = FMModelFactory.eINSTANCE.createFeatureModel();
		fmExpected.setId("b");

		assertFalse(this.fma.isEquivalent(fmObtained, fmExpected));
	}
}
