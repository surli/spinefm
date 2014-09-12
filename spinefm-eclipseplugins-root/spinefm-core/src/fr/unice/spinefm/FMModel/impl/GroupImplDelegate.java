package fr.unice.spinefm.FMModel.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.utils.Utils;

public class GroupImplDelegate extends GroupImpl {
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof GroupImpl) {
			GroupImpl gOther = (GroupImpl)other;
			return Utils.equalsEList(this.features, gOther.features) && this.state == gOther.state;
		}
		return false;
	}
	
	@Override
	public EList<Feature> getAllChildren() {
		EList<Feature> retour = new BasicEList<Feature>();
		for (Feature f : this.getFeatures()) {
			retour.add(f);
			retour.addAll(f.getAllChildrenFeatures());
		}
		return retour;
	}
	
	@Override
	public String toString() {
		return "Group "+this.getState().toString()+" of features: "+this.getFeatures();
	}
}
