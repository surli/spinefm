package fr.unice.spinefm.FMModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.Group;
import fr.unice.spinefm.roassaltracer.RoassalTracer;
import fr.unice.spinefm.utils.Utils;

public class FeatureImplDelegate extends FeatureImpl {

	
	public boolean equals(Object other) {
		if (other instanceof FeatureImpl) {
			FeatureImpl otherFeat = (FeatureImpl)other;
			
			if (!Utils.equalsPrimitive(this.id, otherFeat.id))
				return false;
			
			if (!Utils.equalsPrimitive(this.name, otherFeat.name))
				return false;
			
			return Utils.equalsEList(this.children, otherFeat.children);
		}
		return false;
	}

	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_F))
			buffer.put(RoassalTracer.ROASSAL_F, new ArrayList<String>());
		String toCapture = RoassalTracer.ROASSAL_F+" id=\""+this.id+"\" name=\""+this.name+"\"";
		buffer.get(RoassalTracer.ROASSAL_F).add(toCapture);
	}

	@Override
	public EList<Feature> getAllChildrenFeatures() {
		EList<Feature> retour = new BasicEList<Feature>();
		for (Group g : this.getChildren())
			retour.addAll(g.getAllChildren());
		return retour;
	}
	
	@Override
	public String toString() {
		return this.getId();
	}
}
