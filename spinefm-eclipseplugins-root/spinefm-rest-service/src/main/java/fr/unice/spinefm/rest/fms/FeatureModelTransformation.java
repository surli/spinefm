package fr.unice.spinefm.rest.fms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.Group;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.RFModel.ConfigurationState;

public class FeatureModelTransformation {

	public static StatedFeatureModel getSFMFromCPS(ConfigurationProcessStep cps) {
		Map<String,StatedFeature> mapSF = new HashMap<String,StatedFeature>();
		DomainElement de = cps.getDomainElement();
		FeatureModel fm = de.getRefers_on();
		StatedFeatureModel sfm = new StatedFeatureModel(fm.getId(),cps.getId(),de.getId());
		Feature froot = fm.getRoot();
		StatedFeature sfroot = createFeatureAndRecurse(sfm,fm,froot,mapSF);
		sfm.setRoot(sfroot);
		
		//setStatesSFM(mapSF,cps);
		return sfm;
	}
	
	public static List<StatedFeature> getSFListFromCPS(ConfigurationProcessStep cps) {
		List<StatedFeature> lsf = new ArrayList<StatedFeature>();
		ConfigurationState cs = cps.getState();
		for (Feature f : cs.getDeselectedFeatures()) {
			StatedFeature sf = createSFFromFeature(f);
			sf.setState(FeatureState.DESELECTED);
			lsf.add(sf);
		}
		for (Feature f : cs.getSelectedFeatures()) {
			StatedFeature sf = createSFFromFeature(f);
			sf.setState(FeatureState.SELECTED);
			lsf.add(sf);
		}
		return lsf;
	}

	private static StatedFeature createSFFromFeature(Feature f) {
		return new StatedFeature(f.getName());
	}
	
	private static StatedFeature createFeatureAndRecurse(StatedFeatureModel sfm, FeatureModel fm, Feature froot, Map<String, StatedFeature> mapSF) {
		StatedFeature root = createSFFromFeature(froot);
		List<SFGroup> lsfg = new ArrayList<SFGroup>();
		
		for (Group g : froot.getChildren()) {
			List<StatedFeature> lf = new ArrayList<StatedFeature>();
			for (Feature f : g.getFeatures()) {
				lf.add(createFeatureAndRecurse(sfm,fm,f,mapSF));
			}
			lsfg.add(new SFGroup(g.getState(),lf));
		}
		root.setGroups(lsfg);
		mapSF.put(root.getName(), root);
		return root;
	}
}
