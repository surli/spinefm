package fr.unice.spinefm.rest.fms;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatedFeature {

	private String name;
	private FeatureState state;
	private List<SFGroup> groups;
	
	public StatedFeature() {}
	
	public StatedFeature(String name) {
		this.name = name;
		this.state = FeatureState.UNSELECTED;
	}
	
	public StatedFeature(String name, FeatureState state, List<SFGroup> groups) {
		this.name = name;
		this.state = state;
		this.groups = groups;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public FeatureState getState() {
		return state;
	}
	public void setState(FeatureState state) {
		this.state = state;
	}
	
	@XmlElement
	public List<SFGroup> getGroups() {
		return groups;
	}
	public void setGroups(List<SFGroup> groups) {
		this.groups = groups;
	}
	
	
}
