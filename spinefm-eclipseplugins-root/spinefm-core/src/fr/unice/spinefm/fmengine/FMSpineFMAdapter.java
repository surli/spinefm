package fr.unice.spinefm.fmengine;

import java.util.List;
import java.util.Set;

import fr.unice.spinefm.FMModel.Constraint;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

/**
 * This file is part of SpineFM framework.
 * 
 * This interface provides all useful methods to interact with FMEngine.
 * @author Simon Urli
 *
 */
public interface FMSpineFMAdapter {
	
	/**
	 * Populate a feature model from the datas retrieve from the FMEngine. The feature model ID is used to get proper datas.
	 * If the feature model already contains informations, there will be erased. 
	 * @param fm The feature model to populate.
	 * @throws FMEngineException 
	 */
	public void populateFeatureModel(FeatureModel fm) throws FMEngineException;
	
	/**
	 * Test if two feature models are equivalent. The definition of equivalence is given in @see https://nyx.unice.fr/projects/familiar/wiki/equality
	 * @param fm1 The first feature model
	 * @param fm2 The second one to compare
	 * @return True if the two feature models are equivalent.
	 */
	public boolean isEquivalent(FeatureModel fm1, FeatureModel fm2);
	
	public Set<Feature> getSelectedFeatures(String confName, FeatureModel fm) throws FMEngineException;
	
	public Set<Feature> getDeselectedFeatures(String confName, FeatureModel fm) throws FMEngineException;

	public void createConfiguration(String confName, FeatureModel refers_on) throws FMEngineException;
	
	public void cloneConfiguration(String confSourceName, String confTargetName) throws FMEngineException;
	
	public void selectFeatureInConfiguration(Feature ft, String configuration) throws FMEngineException;
	
	public void unselectFeatureInConfiguration(Feature ft, String configuration) throws FMEngineException;
	
	public void deselectFeatureInConfiguration(Feature ft, String configuration) throws FMEngineException;

	public SpecificInterpreter getSFI();

	String getRepresentationOfFeatureModel(FeatureModel fm);

	Set<Feature> getUnselectedFeatures(String confName, FeatureModel fm) throws FMEngineException;
	
	public void exitInterpreter();
	
	public void addConstraint(Constraint c, String confName) throws FMEngineException;
	
	public void removeConstraint(Constraint c, String confName) throws FMEngineException;

	public void destroyConfiguration(String clone_conf) throws FMEngineException;

	boolean isValidConfiguration(String confID) throws FMEngineException;

	void copyElement(String elementSource, String elementTarget) throws FMEngineException;
	
	Set<Set<Feature>> getAllConfigurations(String confName) throws FMEngineException;
}
