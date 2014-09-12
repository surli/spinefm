package fr.unice.spinefm.rest.configuration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.ConfigurationModel.Link;

@XmlRootElement
public class RestLinkInfo {

	private String source;
	private String target;
	
	public RestLinkInfo(Link l) {
		this.source = l.getSource().getId();
		this.target = l.getTarget().getId();
	}
	
	public RestLinkInfo(String source, String target) {
		super();
		this.source = source;
		this.target = target;
	}
	
	@XmlElement
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	@XmlElement
	public String getTarget() {
		return target;
	}
	
	public void setTarget(String target) {
		this.target = target;
	}
}
