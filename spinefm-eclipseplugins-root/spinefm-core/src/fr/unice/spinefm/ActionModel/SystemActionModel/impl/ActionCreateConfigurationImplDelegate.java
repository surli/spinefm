package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

public class ActionCreateConfigurationImplDelegate extends ActionCreateConfigurationImpl {

	private static Logger log = Logger.getLogger(ActionCreateConfigurationImplDelegate.class);

	@Override
	public void apply() {
		log.debug("Apply action CreateConfig from step "+this.getStep());
		Configuration config = ConfigurationModelFactory.eINSTANCE.createConfiguration();
		config.setId(cps.getConfName());
		config.setCPSRef(cps);
		config.setDomainElement(cps.getDomainElement());
		config.setState(cps.getState());
		compconf.addConfiguration(config);
	}
	
	@Override
	public void undo() {
		log.debug("Undo action CreateConfig from step "+this.getStep());
		Configuration conf = this.cps.getConfiguration();
		this.cps.setConfiguration(null);
		conf.setCPSRef(null);
		this.compconf.getSubConfigurations().remove(conf);
	}
	
	public String toString() {
		return "Action CreateConfiguration ["+this.getCps().getDescription()+" | Type : "+this.getType()+"] "+this.getStep();
	}
}
