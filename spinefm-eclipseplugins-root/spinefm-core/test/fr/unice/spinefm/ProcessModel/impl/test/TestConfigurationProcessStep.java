package fr.unice.spinefm.ProcessModel.impl.test;

import org.junit.Before;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelFactory;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.fmengine.familiar.FMLSpineFMAdapter;
import fr.unice.spinefm.fmengine.familiar.FamiliarInterpreter;

public class TestConfigurationProcessStep {
	
	private FMLSpineFMAdapter adapter;
	private FeatureModel fm;
	private ConfigurationProcessStep cps;
	private DomainElement de;
	
	@Before
	public void setUp() throws FMEngineException {
		this.adapter = new FMLSpineFMAdapter(FamiliarInterpreter.getInstance());
		
		String cmd = "a = FM(Source: TypeInfo Product Criteria; TypeInfo: PictureAlbum; Product: (FlickR|Picasa); Criteria: [Sort]; Sort: (Date|Name)+; Picasa <-> Date;)";
		this.adapter.getSFI().eval(cmd);

		this.fm = FMModelFactory.eINSTANCE.createFeatureModel();
		this.fm.setId("a");
		this.adapter.populateFeatureModel(fm);
		
		this.de = MSPLModelFactory.eINSTANCE.createDomainElement();
		this.de.setId("a");
		this.de.setRefers_on(this.fm);
		this.cps = ProcessModelFactory.eINSTANCE.createConfigurationProcessStep();
		this.cps.setId("cpsA");
		this.cps.setDomainElement(de);
		//this.cps.setFMA(this.adapter);
	}
	/*
	@Test
	public void testGetStateWithoutActionSelectMandatoryFeatures() throws IllegalCallException, FeatureNotFoundException {
		ConfigurationState state = this.cps.getState();
		
		ConfigurationState expected = ActionModelFactory.eINSTANCE.createConfigurationState();
		expected.setFm(this.fm);
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("TypeInfo"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Source"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("PictureAlbum"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Criteria"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Product"));
		expected.getDeselectedFeatures();
		
		assertEquals(expected, state);
	}
	
	@Test
	public void testGetStateAfterActionSelectSort() throws IllegalCallException, FeatureNotFoundException {
		Action a = ActionModelFactory.eINSTANCE.createActionSelect();
		a.setFeature(this.fm.getFeatureFromName("Sort"));
		a.setFm(this.fm);
		
		this.cps.addActionToDo(a);
		ConfigurationState state = this.cps.getState();
		
		ConfigurationState expected = ActionModelFactory.eINSTANCE.createConfigurationState();
		expected.setFm(this.fm);
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("TypeInfo"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Source"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("PictureAlbum"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Criteria"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Product"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Sort"));
		expected.getDeselectedFeatures();
		
		assertEquals(expected, state);
	}
	
	@Test
	public void testGetStateAfterActionDeselectSort() throws IllegalCallException, FeatureNotFoundException {
		Action a = ActionModelFactory.eINSTANCE.createActionDeselect();
		a.setFeature(this.fm.getFeatureFromName("Sort"));
		a.setFm(this.fm);
		
		this.cps.addActionToDo(a);
		ConfigurationState state = this.cps.getState();
		
		ConfigurationState expected = ActionModelFactory.eINSTANCE.createConfigurationState();
		expected.setFm(this.fm);
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("TypeInfo"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Source"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("PictureAlbum"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Criteria"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("Product"));
		expected.getSelectedFeatures().add(this.fm.getFeatureFromName("FlickR"));
		
		expected.getDeselectedFeatures().add(this.fm.getFeatureFromName("Sort"));
		expected.getDeselectedFeatures().add(this.fm.getFeatureFromName("Date"));
		expected.getDeselectedFeatures().add(this.fm.getFeatureFromName("Name"));
		expected.getDeselectedFeatures().add(this.fm.getFeatureFromName("Picasa"));
		
		assertEquals(expected, state);
	}
	
	@Test
	public void testGetActionsDoneListWithoutDoingNothingReportImplicitActions() throws IllegalCallException, FeatureNotFoundException {
		Action selectTypeInfo = ActionModelFactory.eINSTANCE.createActionSelect();
		selectTypeInfo.setFeature(this.fm.getFeatureFromName("TypeInfo"));
		selectTypeInfo.setFm(this.fm);
		
		Action selectSource = ActionModelFactory.eINSTANCE.createActionSelect();
		selectSource.setFeature(this.fm.getFeatureFromName("Source"));
		selectSource.setFm(this.fm);
		
		Action selectPictureAlbum = ActionModelFactory.eINSTANCE.createActionSelect();
		selectPictureAlbum.setFeature(this.fm.getFeatureFromName("PictureAlbum"));
		selectPictureAlbum.setFm(this.fm);
		
		Action selectCriteria = ActionModelFactory.eINSTANCE.createActionSelect();
		selectCriteria.setFeature(this.fm.getFeatureFromName("Criteria"));
		selectCriteria.setFm(this.fm);
		
		Action selectProduct = ActionModelFactory.eINSTANCE.createActionSelect();
		selectProduct.setFeature(this.fm.getFeatureFromName("Product"));
		selectProduct.setFm(this.fm);
		
		ConfigurationProcessStep cps_expected = ProcessModelFactory.eINSTANCE.createConfigurationProcessStep();
		cps_expected.setDomainElement(de);
		cps_expected.setId(this.cps.getId());
		
		cps_expected.getActionsDone().add(selectTypeInfo);
		cps_expected.getActionsDone().add(selectSource);
		cps_expected.getActionsDone().add(selectPictureAlbum);
		cps_expected.getActionsDone().add(selectCriteria);
		cps_expected.getActionsDone().add(selectProduct);
		
		cps_expected.getActionsToDo();
		assertEquals(cps_expected, cps);
	}
	
	@Test
	public void testGetActionsDoneAfterDeselectingSortReportImplicitActions() throws IllegalCallException, FeatureNotFoundException {
		Action a = ActionModelFactory.eINSTANCE.createActionDeselect();
		a.setFeature(this.fm.getFeatureFromName("Sort"));
		a.setFm(this.fm);
		
		this.cps.addActionToDo(a);
		this.cps.getState();
		
		Action selectTypeInfo = ActionModelFactory.eINSTANCE.createActionSelect();
		selectTypeInfo.setFeature(this.fm.getFeatureFromName("TypeInfo"));
		selectTypeInfo.setFm(this.fm);
		
		Action selectSource = ActionModelFactory.eINSTANCE.createActionSelect();
		selectSource.setFeature(this.fm.getFeatureFromName("Source"));
		selectSource.setFm(this.fm);
		
		Action selectPictureAlbum = ActionModelFactory.eINSTANCE.createActionSelect();
		selectPictureAlbum.setFeature(this.fm.getFeatureFromName("PictureAlbum"));
		selectPictureAlbum.setFm(this.fm);
		
		Action selectCriteria = ActionModelFactory.eINSTANCE.createActionSelect();
		selectCriteria.setFeature(this.fm.getFeatureFromName("Criteria"));
		selectCriteria.setFm(this.fm);
		
		Action selectProduct = ActionModelFactory.eINSTANCE.createActionSelect();
		selectProduct.setFeature(this.fm.getFeatureFromName("Product"));
		selectProduct.setFm(this.fm);
		
		Action selectFlickR = ActionModelFactory.eINSTANCE.createActionSelect();
		selectFlickR.setFeature(this.fm.getFeatureFromName("FlickR"));
		selectFlickR.setFm(this.fm);
		
		Action deselectPicasa = ActionModelFactory.eINSTANCE.createActionDeselect();
		deselectPicasa.setFeature(this.fm.getFeatureFromName("Picasa"));
		deselectPicasa.setFm(this.fm);
		
		Action deselectSort = ActionModelFactory.eINSTANCE.createActionDeselect();
		deselectSort.setFeature(this.fm.getFeatureFromName("Sort"));
		deselectSort.setFm(this.fm);
		
		Action deselectDate = ActionModelFactory.eINSTANCE.createActionDeselect();
		deselectDate.setFeature(this.fm.getFeatureFromName("Date"));
		deselectDate.setFm(this.fm);
		
		Action deselectName = ActionModelFactory.eINSTANCE.createActionDeselect();
		deselectName.setFeature(this.fm.getFeatureFromName("Name"));
		deselectName.setFm(this.fm);
		
		ConfigurationProcessStep cps_expected = ProcessModelFactory.eINSTANCE.createConfigurationProcessStep();
		cps_expected.setDomainElement(de);
		cps_expected.setId(this.cps.getId());
		
		cps_expected.getActionsDone().add(selectTypeInfo);
		cps_expected.getActionsDone().add(selectSource);
		cps_expected.getActionsDone().add(selectPictureAlbum);
		cps_expected.getActionsDone().add(selectCriteria);
		cps_expected.getActionsDone().add(selectProduct);
		cps_expected.getActionsDone().add(selectFlickR);
		cps_expected.getActionsDone().add(deselectPicasa);
		cps_expected.getActionsDone().add(deselectDate);
		cps_expected.getActionsDone().add(deselectName);
		cps_expected.getActionsDone().add(deselectSort);
		
		cps_expected.getActionsToDo();
		assertEquals(cps_expected, cps);
	}
	
	@Test
	public void testIsCompleteWhenDoingNothingIsFalse() throws IllegalCallException, FMEngineException {
		System.err.println(this.cps);
		assertFalse(this.cps.isComplete());
	}*/
}
