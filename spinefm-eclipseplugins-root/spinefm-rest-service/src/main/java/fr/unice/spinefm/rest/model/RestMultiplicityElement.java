package fr.unice.spinefm.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestMultiplicityElement {

	private int lowerBound;
	private int upperBound;
	
	
	
	public RestMultiplicityElement(int lowerBound, int upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	@XmlElement
	public int getLowerBound() {
		return lowerBound;
	}
	
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
	
	@XmlElement
	public int getUpperBound() {
		return upperBound;
	}
	
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	
	
}
