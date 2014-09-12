package fr.unice.spinefm.stats;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

@XmlRootElement
public class ModelStats {
	private int numberOfConcepts;
	private int numberOfAssociation;
	private int numberOfRestrictionFunctions;
	private int numberOfRules;
	private Map<String, Integer> numberOfRulesByAssociation;
	private Map<String, Integer> numberOfRFByAssociation;
	private Map<String, Integer> numberOfRulesByRF;
	
	public ModelStats() {}
	
	public void computeFiguresFromMSPL(MultipleSoftwareProductLine mspl) {
		this.numberOfRFByAssociation = new HashMap<String,Integer>();
		this.numberOfRulesByAssociation = new HashMap<String,Integer>();
		this.numberOfRulesByRF = new HashMap<String,Integer>();
		
		this.numberOfConcepts = mspl.getDomainElements().size();
		this.numberOfAssociation = mspl.getAssociations().size();
		this.numberOfRestrictionFunctions = 0;
		this.numberOfRules = 0;
		
		int accumulator;
		for (DEAssociation asso : mspl.getAssociations()) {
			this.numberOfRFByAssociation.put(asso.getId(), asso.getRestrictionFunction().size());
			this.numberOfRestrictionFunctions += asso.getRestrictionFunction().size();
			accumulator = 0;
			for (RestrictionFunction restfunc : asso.getRestrictionFunction()) {
				this.numberOfRules += restfunc.getRules().size();
				accumulator += restfunc.getRules().size();
				this.numberOfRulesByRF.put(asso.getId()+" : "+restfunc.getId(), restfunc.getRules().size());
			}
			this.numberOfRulesByAssociation.put(asso.getId(), accumulator);
			
		}
	}
	
	@XmlElement
	public int getNumberOfRestrictionFunctions() {
		return this.numberOfRestrictionFunctions;
	}
	
	@XmlElement
	public int getNumberOfConcepts() {
		return this.numberOfConcepts;
	}
	
	@XmlElement
	public int getNumberOfAssociation() {
		return this.numberOfAssociation;
	}
	
	@XmlElement
	public int getNumberOfRules() {
		return this.numberOfRules;
	}
	
	@XmlElement
	public double getAverageOfRestrictionFunctionByAssociation() {
		return this.numberOfRestrictionFunctions / this.numberOfAssociation;
	}
	
	@XmlElement
	public double getAverageOfRulesByRestrictionFunctions() {
		return this.numberOfRules / this.numberOfRestrictionFunctions;
	}
	
	@XmlElement
	public double getAverageOfRulesByAssociation() {
		return this.numberOfRules / this.numberOfAssociation;
	}
	
	@XmlElement
	public double getAverageOfAssociationByConcept() {
		return this.numberOfAssociation / this.numberOfConcepts;
	}
	
	@XmlElement
	public double getAverageOfRulesByConcept() {
		return this.numberOfRules / this.numberOfConcepts;
	}

	@XmlElement
	public Map<String, Integer> getNumberOfRulesByAssociation() {
		return numberOfRulesByAssociation;
	}

	@XmlElement
	public Map<String, Integer> getNumberOfRFByAssociation() {
		return numberOfRFByAssociation;
	}

	@XmlElement
	public Map<String, Integer> getNumberOfRulesByRF() {
		return numberOfRulesByRF;
	}
	
}
