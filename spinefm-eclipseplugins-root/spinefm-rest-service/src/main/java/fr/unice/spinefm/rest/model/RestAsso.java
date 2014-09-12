package fr.unice.spinefm.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestAsso {

	private RestMultiplicityElement linkMultiplicity;
	private String de;
	
	public RestAsso() {}
	
	public RestAsso(RestMultiplicityElement linkMultiplicity, String de) {
		this.linkMultiplicity = linkMultiplicity;
		this.de = de;
	}

	@XmlElement
	public RestMultiplicityElement getLinkMultiplicity() {
		return linkMultiplicity;
	}

	public void setLinkMultiplicity(RestMultiplicityElement linkMultiplicity) {
		this.linkMultiplicity = linkMultiplicity;
	}

	@XmlElement
	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}
	
	
}
