package fr.unice.spinefm.rest.context;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.ProcessModel.DeletedContextInformations;

@XmlRootElement
public class ModifiedContext {

	private String deletedContext;
	private String replacedBy;
	
	public ModifiedContext(String deleted, String replacedBy) {
		this.deletedContext = deleted;
		this.replacedBy = replacedBy;
	}
	
	public ModifiedContext() {}
	
	public ModifiedContext(DeletedContextInformations dci) {
		this.deletedContext = dci.getDeletedContext();
		this.replacedBy = dci.getReplacedBy().getId();
	}

	@XmlElement
	public String getDeletedContext() {
		return deletedContext;
	}

	public void setDeletedContext(String deletedContext) {
		this.deletedContext = deletedContext;
	}

	@XmlElement
	public String getReplacedBy() {
		return replacedBy;
	}

	public void setReplacedBy(String replacedBy) {
		this.replacedBy = replacedBy;
	}
	
	
}
