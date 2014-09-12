package fr.unice.spinefm.rest.fms;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatedFeatureModel {
	
	private String name;
	private String id;
	private String concept;
	private StatedFeature root;
	
	public StatedFeatureModel() {}
	
	public StatedFeatureModel(String name, String id, String concept) {
		this.name = name;
		this.id = id;
		this.concept = concept;
	}
	
	public StatedFeatureModel(String name, String id, String concept, StatedFeature root) {
		this.name = name;
		this.id = id;
		this.root = root;
		this.concept = concept;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public StatedFeature getRoot() {
		return root;
	}

	public void setRoot(StatedFeature root) {
		this.root = root;
	}
	
	@XmlElement
	public String getConcept() {
		return this.concept;
	}
	
	public void setConcept(String concept) {
		this.concept = concept;
	}
	
}
