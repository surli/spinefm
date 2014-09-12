package fr.unice.spinefm.rest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RestDE {

	private RestMultiplicityElement multiplicityDE;
	private List<RestAsso> target;
	
	public RestDE() {
	}
	
	public RestDE(RestMultiplicityElement multiplicity, List<RestAsso> target) {
		this.multiplicityDE = multiplicity;
		this.target = target;
	}

	@XmlElement
	public RestMultiplicityElement getMultiplicityDE() {
		return multiplicityDE;
	}

	public void setMultiplicityDE(RestMultiplicityElement multiplicityDE) {
		this.multiplicityDE = multiplicityDE;
	}

	@XmlElement
	public List<RestAsso> getTarget() {
		return target;
	}

	public void setTarget(List<RestAsso> target) {
		this.target = target;
	}
	
	
	
}
