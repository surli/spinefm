package fr.unice.spinefm.rest.command;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.HistoryModel.Step;

@XmlRootElement
public class RestStep {

	private String id;
	private String description;
	
	public RestStep(Step s) {
		this.id = s.getId();
		this.description = s.getDescription();
	}
	
	@XmlElement
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
