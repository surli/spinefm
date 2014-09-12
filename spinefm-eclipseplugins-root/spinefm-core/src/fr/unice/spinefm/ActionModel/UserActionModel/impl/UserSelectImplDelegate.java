package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect;
import fr.unice.spinefm.ActionModel.UserActionModel.UserSelect;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class UserSelectImplDelegate extends UserSelectImpl {

	protected static Logger log = Logger.getLogger(UserSelectImplDelegate.class);
	
	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		log.info("\n\n\t\t Apply user action Select on feature "+this.getFeatureName()+" on concept "+this.getDomainElementName()+" and context "+this.getContextID()+"\n\n");
		
		Context c = this.getContextManager().getContextFromId(this.getContextID());
		DomainElement de = this.getContextManager().getMspl().getDomainElementByName(this.getDomainElementName());
		ConfigurationProcessStep cps = c.getCPSOfDE(de);
		ActionSelect as = SystemActionModelFactory.eINSTANCE.createActionSelect();
		FeatureModel fm = de.getRefers_on();
		Feature f = fm.getFeatureFromName(this.getFeatureName());
		as.setCps(cps);
		as.setStep(this.getStep());
		as.setFeature(f);
		as.setFm(fm);
		as.setFma(this.getContextManager().getFma());
		as.setType(ActionMode.MANUAL);
		cps.setUserConfig(true);
		try {
			as.apply();
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}
	}
	
	@Override
	public String getDescription() {
		return "Select feature "+this.getFeatureName()+" in concept "+this.getDomainElementName();
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserSelect result = UserActionModelFactory.eINSTANCE.createUserSelect();
		result.setContextID(this.transformContextNameToSave(this.getContextID()));
		result.setDomainElementName(this.getDomainElementName());
		result.setFeatureName(this.getFeatureName());
		return result;
	}
}
