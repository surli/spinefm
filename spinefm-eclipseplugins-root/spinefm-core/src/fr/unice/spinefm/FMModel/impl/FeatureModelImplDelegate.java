package fr.unice.spinefm.FMModel.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.GroupState;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.roassaltracer.RoassalTracer;
import fr.unice.spinefm.utils.Utils;

public class FeatureModelImplDelegate extends FeatureModelImpl {

	private Map<String,Feature> features;
	private Map<Feature,GroupState> states;
	
	private String representation;
	
	protected FeatureModelImplDelegate() {
		super();
		this.features = new HashMap<String,Feature>();
		this.states = new HashMap<Feature, GroupState>();
	}
	
	@Override
	public Feature getFeatureFromName(String name) throws FeatureNotFoundException {
		if (this.features.containsKey(name))
			return this.features.get(name);
		else
			throw new FeatureNotFoundException("The feature "+name+" doesn't belong to the FM "+this.id);
	}

	@Override
	public void addFeature(String name, Feature feature, GroupState state) {
		this.features.put(name, feature);
		this.states.put(feature, state);
	}

	public void setRepresentation(String representation) {
		this.representation = representation;
	}
	
	@Override
	public String toString() {
		return this.getId()+" : "+this.representation;
	}
	
	@Override
	public GroupState getStateFT(Feature feature) {
		return this.states.get(feature);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof FeatureModelImpl) {
			FeatureModelImpl fmi = (FeatureModelImpl)other;
			
			if (!Utils.equalsPrimitive(this.id, fmi.id))
				return false;
			
			if (!Utils.equalsPrimitive(this.name, fmi.name))
				return false;
			
			if (!Utils.equalsPrimitive(this.root, fmi.root))
				return false;
			
			return Utils.equalsEList(this.constraints, fmi.constraints);
		}
		return false;
	}

	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_FM))
			buffer.put(RoassalTracer.ROASSAL_FM, new ArrayList<String>());
		String features = "features=[";
		for (Feature f : this.features.values()) {
			features += f.getId()+",";
			RoassalTracer.callRoassalTracer(f, buffer);
		}
		features = features.substring(0,features.length()-1)+"]";
		String toCapture = RoassalTracer.ROASSAL_FM+" id=\""+this.id+"\" "+features+" familiar=\""+representation.replace('"', ' ')+"\"";
		buffer.get(RoassalTracer.ROASSAL_FM).add(toCapture);
	}
}
