package fr.unice.spinefm.stats;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.impl.ContextManagerImplDelegate;

public class StatsFactory {

	private FMStats fmstat;
	private ModelStats modelstats;
	private ProcessStats processtats;
	private ConfigurationStats configstats;
	private PropagationStats propstats;
	
	private MultipleSoftwareProductLine mspl;
	private CompositeConfiguration compConfig;
	private ContextManager cm;
	
	public StatsFactory(ContextManager cm) {
		this.mspl = cm.getMspl();
		this.compConfig = cm.getGlobalContext().getConfiguration();
		this.cm = cm;
		
		this.fmstat = new FMStats();
		this.modelstats = new ModelStats();
		this.processtats = new ProcessStats();
		this.configstats = new ConfigurationStats();
	}
	
	public FMStats getFMStats() {
		this.fmstat.computeNumbersFromMspl(this.mspl);
		return this.fmstat;
	}
	
	public ModelStats getModelStats() {
		this.modelstats.computeFiguresFromMSPL(this.mspl);
		return this.modelstats;
	}
	
	public ProcessStats getProcessStats() {
		this.processtats.computeFiguresFromContextManager(this.cm);
		return this.processtats;
	}
	
	public ConfigurationStats getConfigurationStats() {
		this.configstats.computeNumbersFromCompositeConfiguration(this.compConfig);
		return this.configstats;
	}
	
	public PropagationStats getPropagationStats() {
		ContextManagerImplDelegate trueCM = (ContextManagerImplDelegate)this.cm;
		return trueCM.getStats();
	}
	
}
