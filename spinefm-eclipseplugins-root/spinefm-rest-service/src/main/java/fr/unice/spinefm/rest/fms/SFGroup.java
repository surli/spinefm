package fr.unice.spinefm.rest.fms;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.FMModel.GroupState;

@XmlRootElement
public class SFGroup {

	private GroupState state;
	private List<StatedFeature> children;
	
	public SFGroup() {}
	
	public SFGroup(GroupState state, List<StatedFeature> children) {
		super();
		this.state = state;
		this.children = children;
	}

	@XmlElement
	public GroupState getState() {
		return state;
	}

	public void setState(GroupState state) {
		this.state = state;
	}

	@XmlElement
	public List<StatedFeature> getChildren() {
		return children;
	}

	public void setChildren(List<StatedFeature> children) {
		this.children = children;
	}
	
	
}
