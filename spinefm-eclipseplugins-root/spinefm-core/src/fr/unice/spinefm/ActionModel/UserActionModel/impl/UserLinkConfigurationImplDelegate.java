package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration;
import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.DeletedContextInformations;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class UserLinkConfigurationImplDelegate extends UserLinkConfigurationImpl {
	private static Logger log = Logger.getLogger(UserLinkConfigurationImplDelegate.class);

	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		log.info("\n\n\t\t Apply user action LinkConfiguration between config "+this.getConfSourceName()+" and "+this.getConfTargetName()+" with asso "+this.getAssoName()+"\n\n");
		CompositeConfiguration compConf = this.getContextManager().getGlobalContext().getConfiguration();
		Configuration confSource = compConf.getConfigurationByName(this.getConfSourceName());
		Configuration confTarget = compConf.getConfigurationByName(this.getConfTargetName());
		DEAssociation asso = this.getContextManager().getMspl().getAssociationByName(this.getAssoName());
		try {
			this.processLinkConfiguration(confSource, confTarget, asso);
		} catch (FMEngineException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}


	}

	private void processLinkConfiguration(Configuration confSource, Configuration confTarget, DEAssociation asso) throws FMEngineException, ElementNotFoundException {
		log.debug("Apply action Link in step "+this.getStep());
		log.info("Begin of link configurations "+confSource+" and "+confTarget+" with association "+asso);
		DeletedContextInformations deletedContextInformations = ProcessModelFactory.eINSTANCE.createDeletedContextInformations();
		DomainElement deSource = confSource.getDomainElement();
		DomainElement deTarget = confTarget.getDomainElement();

		DEAssociationEnd deaSource, deaTarget;

		if (deSource.equals(asso.getExtremity().get(0).getApply_on())) {
			deaSource = asso.getExtremity().get(0);
			deaTarget = asso.getExtremity().get(1);
		} else {
			deaSource = asso.getExtremity().get(1);
			deaTarget = asso.getExtremity().get(0);
		}

		//if (!asso.isLinkBetweenDEs(deSource, deTarget))
		//	throw new InvalidAssociationException("Domain elements from configuration source ("+confSource+") and/or target ("+confTarget+") are not corresponding with domain element of the association ("+asso+").");

		Context contextSourceRef = confSource.getCPSRef().getContext();
		Context contextTargetRef = confTarget.getCPSRef().getContext();

		List<Context> allSourceContexts = new ArrayList<Context>();
		for (ConfigurationProcessStep cps : confSource.getAllCPS()) {
			allSourceContexts.add(cps.getContext());
		}

		List<Context> allTargetContexts = new ArrayList<Context>();
		for (ConfigurationProcessStep cps : confTarget.getAllCPS()) {
			allTargetContexts.add(cps.getContext());
		}

		deletedContextInformations.setReplacedBy(contextSourceRef);

		if (!contextSourceRef.equals(this.contextManager.getGlobalContext()) && !contextTargetRef.equals(this.contextManager.getGlobalContext())) {
			log.debug("Test if contexts need to be merged. Ctx source : "+contextSourceRef+" ; Ctx target : "+contextTargetRef);

			if (!contextSourceRef.equals(contextTargetRef) && !allSourceContexts.contains(contextTargetRef) && !allTargetContexts.contains(contextSourceRef)) {
				if (deaTarget.getLinkMultiplicity().isExactlyOne() && deaSource.getLinkMultiplicity().isExactlyOne()) {
					log.info("Multiplicities on link are only one. Start to merge contexts. Target context will be deleted.");

					for (ConfigurationProcessStep cps : contextTargetRef.getCPS()) {
						if (!cps.getDomainElement().equals(deSource)) {
							ConfigurationProcessStep cpsSource;
							cpsSource = contextSourceRef.getCPSOfDE(cps.getDomainElement());

							this.createActionMerge(cpsSource, cps);

							if (cps.getConfiguration() != null) {
								log.info("Associate configuration "+cps.getConfiguration()+" with merged CPS "+cpsSource);
								this.createActionMoveConfiguration(cps.getConfiguration(), cps, cpsSource);
							}
						}
					}
					deletedContextInformations.setDeletedContext(contextTargetRef.getId());
					this.createActionDeleteContext(contextTargetRef);
				} else {
					log.info("Multiplicies on association are complex. Start to merge contexts without deletion");
					if (deaTarget.getLinkMultiplicity().getUpperBound() == -1) {
						for (ConfigurationProcessStep cps : contextTargetRef.getCPS()) {
							if (!cps.getDomainElement().equals(deSource)) {
								ConfigurationProcessStep cpsSource = contextSourceRef.getCPSOfDE(cps.getDomainElement());
								this.createActionMerge(cpsSource, cps);
							}
						}
					}
					if (deaSource.getLinkMultiplicity().getUpperBound() == -1) {
						for (ConfigurationProcessStep cps : contextSourceRef.getCPS()) {
							if (!cps.getDomainElement().equals(deTarget)) {
								ConfigurationProcessStep cpsTarget = contextTargetRef.getCPSOfDE(cps.getDomainElement());
								this.createActionMerge(cpsTarget, cps);
							}
						}
					}
				}
			}
		}
		this.createActionLink(confSource, confTarget, asso);
		this.setResult(deletedContextInformations);
	}

	private void createActionLink(Configuration confSource, Configuration confTarget, DEAssociation asso) throws FMEngineException, ElementNotFoundException {
		ActionLink al = SystemActionModelFactory.eINSTANCE.createActionLink();
		al.setAsso(asso);
		al.setConfSource(confSource);
		al.setConfTarget(confTarget);
		al.setContextManager(this.getContextManager());
		al.setStep(this.getStep());
		al.setType(ActionMode.AUTOMATIC);
		al.apply();
		this.setResult(al.getLink());
	}

	private void createActionMerge(ConfigurationProcessStep cpsSource, ConfigurationProcessStep cpsTarget) throws FMEngineException, ElementNotFoundException {
		log.debug("Merge CPS source "+cpsSource+" with CPS target "+cpsTarget);
		for (ActionOnFM aof : cpsSource.getActionsDone()) {
			if (!cpsTarget.alreadyHaveAction(aof)) {
				ActionOnFM aof2 = aof.cloneAction();
				aof2.setStep(this.getStep());
				aof2.setCps(cpsTarget);
				aof2.apply();
			}
		}
	}

	private void createActionDeleteContext(Context ctxTarget) throws FMEngineException, ElementNotFoundException {
		ActionDeleteContext adc = SystemActionModelFactory.eINSTANCE.createActionDeleteContext();
		adc.setContext(ctxTarget);
		adc.setContextManager(this.getContextManager());
		adc.setStep(this.getStep());
		adc.setType(ActionMode.AUTOMATIC);
		adc.apply();
	}

	private void createActionMoveConfiguration(Configuration config, ConfigurationProcessStep cpsSource, ConfigurationProcessStep cpsTarget) throws FMEngineException, ElementNotFoundException {
		ActionMoveConfiguration amc = SystemActionModelFactory.eINSTANCE.createActionMoveConfiguration();
		amc.setConfiguration(config);
		amc.setCpsSource(cpsSource);
		amc.setCpsTarget(cpsTarget);
		amc.setStep(this.getStep());
		amc.setType(ActionMode.AUTOMATIC);
		amc.apply();
	}
	
	@Override
	public String getDescription() {
		CompositeConfiguration compConf = this.getContextManager().getGlobalContext().getConfiguration();
		try {
			Configuration confSource = compConf.getConfigurationByName(this.getConfSourceName());
			Configuration confTarget = compConf.getConfigurationByName(this.getConfTargetName());
			return "Link configuration "+confSource.getDescription()+" with configuration "+confTarget.getDescription();
		} catch (ConfigNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Link configuration "+this.getConfSourceName()+" with configuration "+this.getConfTargetName();	
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserLinkConfiguration result = UserActionModelFactory.eINSTANCE.createUserLinkConfiguration();
		result.setAssoName(this.getAssoName());
		result.setConfSourceName(this.getConfSourceName());
		result.setConfTargetName(this.getConfTargetName());
		return result;
	}
}
