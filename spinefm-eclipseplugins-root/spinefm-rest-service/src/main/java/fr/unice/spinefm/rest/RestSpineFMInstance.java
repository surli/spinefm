package fr.unice.spinefm.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestSpineFMInstance {

	private String uid;
	private String description;
	private Date creationDate;
	private Date modificationDate;
	private String filePath;
	private String modelID;

	public RestSpineFMInstance(String uid, String description, Date creationDate, String modelID) {
		super();
		this.uid = uid;
		this.description = description;
		this.creationDate = creationDate;
		this.filePath = "";
		this.modelID = modelID;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFilePath() {
		return this.filePath;
	}
	
	@XmlElement
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	@XmlElement
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElement
	public Date getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@XmlElement
	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	@XmlElement
	public String getModelID() {
		return this.modelID;
	}
	
	public void setModelID(String model) {
		this.modelID = model;
	}
}
