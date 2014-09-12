package fr.unice.spinefm.RFModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.roassaltracer.RoassalTracer;
import fr.unice.spinefm.utils.Debug;
import fr.unice.spinefm.utils.Utils;

public class ConfigurationStateImplDelegate extends ConfigurationStateImpl {
	
	public boolean isIncludedIn(ConfigurationState otherState) {
		if (this.fm == null || !this.fm.equals(otherState.getFm()))
			return false;
		return (Utils.listIsIncludeInAnother(this.getSelectedFeatures(), otherState.getSelectedFeatures()) && Utils.listIsIncludeInAnother(this.getDeselectedFeatures(), otherState.getDeselectedFeatures()));
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ConfigurationStateImpl))
			return false;
		ConfigurationState cs = (ConfigurationStateImpl)o;
		return (this.getFm().equals(cs.getFm()) && Utils.equalsEList(this.getDeselectedFeatures(), cs.getDeselectedFeatures()) && Utils.equalsEList(this.getSelectedFeatures(), cs.getSelectedFeatures()));
	}
	
	public String toString() {
		return "ConfigurationState [FM: "+this.fm.getId()+"] Selected = "+this.getSelectedFeatures()+" | Deselected = "+this.getDeselectedFeatures();
	}

	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_CS))
			buffer.put(RoassalTracer.ROASSAL_CS, new ArrayList<String>());
		String selFeatures;
		
		if (this.getSelectedFeatures().isEmpty())
			selFeatures="selected=[]";
		else {
			selFeatures = "selected=[";
			for (Feature f : this.getSelectedFeatures())
				selFeatures += f.getId()+",";
			selFeatures = selFeatures.substring(0,selFeatures.length()-1)+"]";
		}
		
		String deselFeatures;
		if (this.getDeselectedFeatures().isEmpty())
			deselFeatures = "deselected=[]";
		else {
			deselFeatures = "deselected=[";
			for (Feature f : this.getDeselectedFeatures())
				deselFeatures += f.getId()+",";
			deselFeatures = deselFeatures.substring(0,deselFeatures.length()-1)+"]";
		}
		
		String trace = RoassalTracer.ROASSAL_CS+" id=\""+this.id+"\" fm=["+this.fm.getId()+"] "+selFeatures+" "+deselFeatures;
		buffer.get(RoassalTracer.ROASSAL_CS).add(trace);
	}
}
