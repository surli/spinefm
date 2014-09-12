package fr.unice.spinefm.stats;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;

@XmlRootElement
public class ConfigurationStats {

	private Map<String,Integer> numberOfSelectedFeaturesByConfiguration;
	private Map<String,Integer> numberOfDeselectedFeaturesByConfiguration;
	private int numberOfLinks;
	
	public ConfigurationStats() {
		this.numberOfSelectedFeaturesByConfiguration = new HashMap<String,Integer>();
		this.numberOfDeselectedFeaturesByConfiguration = new HashMap<String,Integer>();
	}
	
	public void computeNumbersFromCompositeConfiguration(CompositeConfiguration compconf) {
		this.numberOfLinks = compconf.getLinks().size();
		
		for (Configuration conf : compconf.getSubConfigurations()) {
			ConfigurationState cs = conf.getState();
			this.numberOfSelectedFeaturesByConfiguration.put(conf.getId(), cs.getSelectedFeatures().size());
			this.numberOfDeselectedFeaturesByConfiguration.put(conf.getId(), cs.getDeselectedFeatures().size());
		}
	}
	
	@XmlElement
	public int getNumberOfLinks() {
		return this.numberOfLinks;
	}
	
	@XmlElement
	public Map<String,Integer> getNumberOfSelectedFeaturesByConfiguration() {
		return this.numberOfSelectedFeaturesByConfiguration;
	}
	
	@XmlElement
	public Map<String,Integer> getNumberOfDeselectedFeaturesByConfiguration() {
		return this.numberOfDeselectedFeaturesByConfiguration;
	}
	
	@XmlElement
	public int getNumberOfConfigurations() {
		return this.numberOfSelectedFeaturesByConfiguration.size();
	}
	
	@XmlElement
	public int getTotalNumberOfSelectedFeatures() {
		int result = 0;
		for (Integer i : this.numberOfSelectedFeaturesByConfiguration.values()) {
			result += i;
		}
		return result;
	}
	
	@XmlElement
	public int getTotalNumberOfDeselectedFeatures() {
		int result = 0;
		for (Integer i : this.numberOfDeselectedFeaturesByConfiguration.values()) {
			result += i;
		}
		return result;
	}
	
	@XmlElement
	public double getAverageNumberOfSelectedFeaturesByConfiguration() {
		return (this.getTotalNumberOfSelectedFeatures() / this.getNumberOfConfigurations());
	}
	
	@XmlElement
	public double getAverageNumberOfDeselectedFeaturesByConfiguration() {
		return (this.getTotalNumberOfDeselectedFeatures() / this.getNumberOfConfigurations());
	}
	
	@XmlElement
	public double getAverageNumberOfLinksByConfiguration() {
		return this.numberOfLinks / this.getNumberOfConfigurations();
	}
}
