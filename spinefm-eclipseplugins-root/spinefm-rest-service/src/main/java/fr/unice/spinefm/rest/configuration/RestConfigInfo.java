package fr.unice.spinefm.rest.configuration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

@XmlRootElement
public class RestConfigInfo {

	private String configID;
	private String ctxID;
	private String de;
	private String name;
	
	public RestConfigInfo() {}

	public RestConfigInfo(Configuration conf) {
		this.configID = conf.getId();
		this.ctxID = conf.getCPSRef().getContext().getId();
		this.de = conf.getDomainElement().getId();
		this.name = conf.getDescription();
	}
	
	public RestConfigInfo(ConfigurationProcessStep cps) {
		this.configID = "";
		this.ctxID = cps.getContext().getId();
		this.de = cps.getDomainElement().getId();
		this.name = cps.getDescription();
	}
	
	@XmlElement
	public String getConfigID() {
		return configID;
	}

	public void setConfigID(String configID) {
		this.configID = configID;
	}

	@XmlElement
	public String getCtxID() {
		return ctxID;
	}

	public void setCtxID(String ctxID) {
		this.ctxID = ctxID;
	}

	@XmlElement
	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
