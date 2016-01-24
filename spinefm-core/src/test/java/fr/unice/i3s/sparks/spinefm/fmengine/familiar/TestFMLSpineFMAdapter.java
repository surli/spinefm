package fr.unice.i3s.sparks.spinefm.fmengine.familiar;

import static org.junit.Assert.*;

import fr.familiar.parser.FeatureNotFoundException;
import fr.unice.i3s.sparks.spinefm.featuremodeling.*;
import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = new FeatureModel();
		fmExpected.setName("a");
		Feature root = new Feature();
		root.setName("A");
		fmExpected.setRoot(root);

		assertEquals("FMs are not identical : ", fmExpected, fmObtained);
	}

	@Test
	public void testPopulateFMAllMandatory() throws FMEngineException {
		String cmd = "a = FM(Source: TypeInfo Product; TypeInfo: Calendar; Product: ICalReader;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = new FeatureModel();
		fmExpected.setName("a");

		Feature root = new Feature();
		root.setName("Source");

		Feature typeinfo = new Feature();
		typeinfo.setName("TypeInfo");

		Feature product = new Feature();
		product.setName("Product");

		Feature calendar = new Feature();
		calendar.setName("Calendar");

		Feature icalreader = new Feature();
		icalreader.setName("ICalReader");

		Group g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(typeinfo);
		root.getChildren().add(g);
		
		g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(product);
		root.getChildren().add(g);

		g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(calendar);
		typeinfo.getChildren().add(g);

		g = new Group();
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

		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = new FeatureModel();
		fmExpected.setName("a");

		Feature root = new Feature();
		root.setName("a.Source");
		root.setName("Source");

		Feature typeinfo = new Feature();
		typeinfo.setName("a.TypeInfo");
		typeinfo.setName("TypeInfo");

		Feature product = new Feature();
		product.setName("a.Product");
		product.setName("Product");

		Feature criteria = new Feature();
		criteria.setName("a.Criteria");
		criteria.setName("Criteria");

		Feature picturealbum = new Feature();
		picturealbum.setName("a.PictureAlbum");
		picturealbum.setName("PictureAlbum");

		Feature flickr = new Feature();
		flickr.setName("a.FlickR");
		flickr.setName("FlickR");

		Feature picasa = new Feature();
		picasa.setName("a.Picasa");
		picasa.setName("Picasa");

		Feature sort = new Feature();
		sort.setName("a.Sort");
		sort.setName("Sort");

		Feature date = new Feature();
		date.setName("a.Date");
		date.setName("Date");

		Feature name = new Feature();
		name.setName("a.Name");
		name.setName("Name");

		Group g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(typeinfo);
		root.getChildren().add(g);
		
		g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(product);
		root.getChildren().add(g);
		
		g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(criteria);
		root.getChildren().add(g);

		g = new Group();
		g.getFeatures().add(picturealbum);
		g.setState(GroupState.MANDATORY);
		typeinfo.getChildren().add(g);

		g = new Group();
		g.setState(GroupState.ALTERNATIVE);
		g.getFeatures().add(flickr);
		g.getFeatures().add(picasa);
		product.getChildren().add(g);

		g = new Group();
		g.setState(GroupState.OPTIONAL);
		g.getFeatures().add(sort);
		criteria.getChildren().add(g);

		g = new Group();
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

		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);
		
		Feature picturealbum = new Feature();
		picturealbum.setName("a.PictureAlbum");
		picturealbum.setName("PictureAlbum");
		
		Feature fx = fmObtained.getFeatureFromName("PictureAlbum");
		assertEquals(picturealbum, fx);
	}
	
	/*@Test
	public void testPopulateFMAndTestGetGroupStateFromFeature() throws FMEngineException, FeatureNotFoundException {
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);
		
		Feature f = fmObtained.getFeatureFromName("Date");
		GroupState gs = fmObtained.getStateFT(f);
		assertEquals(GroupState.OR, gs);
	}*/

	@Test
	public void testPopulateFMWithConstraint() throws FMEngineException {
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+; Picasa <-> Date;)";
		this.sfi.eval(cmd);

		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);

		FeatureModel fmExpected = new FeatureModel();
		fmExpected.setName("a");

		Feature root = new Feature();
		root.setName("Source");

		Feature typeinfo = new Feature();
		typeinfo.setName("TypeInfo");

		Feature product = new Feature();
		product.setName("Product");

		Feature criteria = new Feature();
		criteria.setName("Criteria");

		Feature picturealbum = new Feature();
		picturealbum.setName("PictureAlbum");

		Feature flickr = new Feature();
		flickr.setName("FlickR");

		Feature picasa = new Feature();
		picasa.setName("Picasa");

		Feature sort = new Feature();
		sort.setName("Sort");

		Feature date = new Feature();
		date.setName("Date");

		Feature name = new Feature();
		name.setName("Name");

		Group g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(typeinfo);
		root.getChildren().add(g);
		
		g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(product);
		root.getChildren().add(g);
		
		g = new Group();
		g.setState(GroupState.MANDATORY);
		g.getFeatures().add(criteria);
		root.getChildren().add(g);

		g = new Group();
		g.getFeatures().add(picturealbum);
		g.setState(GroupState.MANDATORY);
		typeinfo.getChildren().add(g);

		g = new Group();
		g.setState(GroupState.ALTERNATIVE);
		g.getFeatures().add(flickr);
		g.getFeatures().add(picasa);
		product.getChildren().add(g);

		g = new Group();
		g.setState(GroupState.OPTIONAL);
		g.getFeatures().add(sort);
		criteria.getChildren().add(g);

		g = new Group();
		g.setState(GroupState.OR);
		g.getFeatures().add(date);
		g.getFeatures().add(name);
		sort.getChildren().add(g);

		Constraint c = new Constraint();
		c.setRule("(Picasa <-> Date)");

		fmExpected.addConstraint(c);
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
		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");
		this.fma.populateFeatureModel(fmObtained);
	}


	@Test
	public void testIsEquivalentReturnTrue() throws FMEngineException {
		String cmd = "a = FM(A: B C [D]; D: (E|F);)";
		this.sfi.eval(cmd);
		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");

		cmd = "b = FM(A: C [D] B; D: (F|E);)";
		this.sfi.eval(cmd);
		FeatureModel fmExpected = new FeatureModel();
		fmExpected.setName("b");

		assertTrue(this.fma.isEquivalent(fmObtained, fmExpected));
	}

	@Test
	public void testIsEquivalentReturnFalse() throws FMEngineException {
		String cmd = "a = FM(A: B C [D]; D: (E|F);)";
		this.sfi.eval(cmd);
		FeatureModel fmObtained = new FeatureModel();
		fmObtained.setName("a");

		cmd = "b = FM(A: X Y Z;)";
		this.sfi.eval(cmd);
		FeatureModel fmExpected = new FeatureModel();
		fmExpected.setName("b");

		assertFalse(this.fma.isEquivalent(fmObtained, fmExpected));
	}
}
