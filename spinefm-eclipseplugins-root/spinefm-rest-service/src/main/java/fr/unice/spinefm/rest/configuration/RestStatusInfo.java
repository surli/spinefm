package fr.unice.spinefm.rest.configuration;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RestStatusInfo {

	private List<RestConfigInfo> partialConfigs;
	private List<RestConfigInfo> validConfigs;
	
	public RestStatusInfo() {}
	
	public RestStatusInfo(List<RestConfigInfo> partialConfigs,
			List<RestConfigInfo> validConfigs) {
		super();
		this.partialConfigs = partialConfigs;
		this.validConfigs = validConfigs;
	}
	
	@XmlElement
	public List<RestConfigInfo> getPartialConfigs() {
		return partialConfigs;
	}
	public void setPartialConfigs(List<RestConfigInfo> partialConfigs) {
		this.partialConfigs = partialConfigs;
	}
	
	@XmlElement
	public List<RestConfigInfo> getValidConfigs() {
		return validConfigs;
	}
	public void setValidConfigs(List<RestConfigInfo> validConfigs) {
		this.validConfigs = validConfigs;
	}
	
	
}
