package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class UserValidConfigurationImplDelegate extends UserValidConfigurationImpl {
	
	protected static Logger log = Logger.getLogger(UserValidConfigurationImplDelegate.class);
	
	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		log.info("\n\n\t\t Apply user action ValidConfiguration on concept "+this.getDomainElementName()+" and context "+this.getContextID()+" \n\n");
		Context context = this.getContextManager().getContextFromId(this.getContextID());
		DomainElement de = this.getContextManager().getMspl().getDomainElementByName(this.getDomainElementName());
		ConfigurationProcessStep cps = context.getCPSOfDE(de);
		try {
			if (cps.isComplete()) {
				ActionCreateConfiguration a = SystemActionModelFactory.eINSTANCE.createActionCreateConfiguration();
				a.setCps(cps);
				a.setStep(this.getStep());
				a.setType(ActionMode.AUTOMATIC);
				a.setCompconf(this.getContextManager().getGlobalContext().getConfiguration());
				a.apply();
				this.setResult(a.getCps().getConfiguration());
			} else throw new FMEngineException("Configuration cannot be validate as it is not complete.");
		} catch (FMEngineException e) {
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}

	}
	
	@Override
	public String getDescription() {
		return "Finalize configuration of concept "+this.getDomainElementName();
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserValidConfiguration result = UserActionModelFactory.eINSTANCE.createUserValidConfiguration();
		result.setContextID(this.transformContextNameToSave(this.getContextID()));
		result.setDomainElementName(this.getDomainElementName());
		return result;
	}
}
