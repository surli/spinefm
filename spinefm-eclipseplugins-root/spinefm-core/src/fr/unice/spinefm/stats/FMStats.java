package fr.unice.spinefm.stats;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

@XmlRootElement
public class FMStats {
	
	private Map<String, Integer> featuresByFM;
	private Map<String, Integer> cstByFM;
	
	public FMStats() {
		this.featuresByFM = new HashMap<String, Integer>();
		this.cstByFM = new HashMap<String, Integer>();
	}
	
	public void computeNumbersFromMspl(MultipleSoftwareProductLine mspl) {
		for (DomainElement de : mspl.getDomainElements()) {
			this.addFeatureModel(de.getRefers_on());
		}
	}
	
	private void addFeatureModel(FeatureModel fm) {
		this.featuresByFM.put(fm.getId(), fm.getRoot().getAllChildrenFeatures().size()+1);
		this.cstByFM.put(fm.getId(), fm.getConstraints().size());
	}
	
	@XmlElement
	public int getNumberOfFM() {
		return this.featuresByFM.size();
	}
	
	@XmlElement
	public Map<String, Integer> getFeaturesByFM() {
		return this.featuresByFM;
	}
	
	@XmlElement
	public Map<String, Integer> getCstByFM() {
		return this.cstByFM;
	}
	
	@XmlElement
	public int getTotalNumberOfFeatures() {
		int result = 0;
		for (int i : featuresByFM.values()) {
			result += i;
		}
		return result;
	}
	
	@XmlElement
	public int getTotalNumberOfCst() {
		int result = 0;
		for (int i : cstByFM.values()) {
			result += i;
		}
		return result;
	}
	
	@XmlElement
	public double getAverageOfFeatures() {
		return this.getTotalNumberOfFeatures() / this.getNumberOfFM();
	}
	
	@XmlElement
	public double getAverageOfCst() {
		return this.getTotalNumberOfCst() / this.getNumberOfFM();
	}
}
