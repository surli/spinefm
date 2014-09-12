package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement;
import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class UserRenameElementImplDelegate extends UserRenameElementImpl {

	protected static Logger log = Logger.getLogger(UserRenameElementImplDelegate.class);
	
	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		ActionAbstractRename action = null;
		
		if (this.getElementType().equals("product")) {
			ActionRenameProduct actionp = SystemActionModelFactory.eINSTANCE.createActionRenameProduct();
			actionp.setProduct(this.getContextManager().getGlobalContext().getConfiguration());
			actionp.setOldName(actionp.getProduct().getName());
			action = actionp;
		} else if (this.getElementType().equals("setdescription")) {
			ActionSetProductDescription actionsd = SystemActionModelFactory.eINSTANCE.createActionSetProductDescription();
			actionsd.setProduct(this.getContextManager().getGlobalContext().getConfiguration());
			actionsd.setOldName(actionsd.getProduct().getDescription());
			action = actionsd;
		} else if (this.getElementType().equals("config")) {
			ActionRenameConfig actionconf = SystemActionModelFactory.eINSTANCE.createActionRenameConfig();
			CompositeConfiguration compconf = this.getContextManager().getGlobalContext().getConfiguration();
			Configuration conf = compconf.getConfigurationByName(this.getElementID());
			actionconf.setConfig(conf);
			actionconf.setOldName(conf.getDescription());
			action = actionconf;
		} else if (this.getElementType().equals("cps")) {
			ActionRenameCPS actioncps = SystemActionModelFactory.eINSTANCE.createActionRenameCPS();
			ConfigurationProcessStep cps = this.getContextManager().getCPSFromId(this.getElementID());
			actioncps.setCps(cps);
			actioncps.setOldName(cps.getDescription());
			action = actioncps;
		} else {
			throw new ElementNotFoundException("Element type "+this.getElementType()+" cannot be renamed.");
		}
		
		action.setNewName(this.getName());
		action.setStep(this.getStep());
		action.setType(ActionMode.AUTOMATIC);
		try {
			action.apply();
		} catch (FMEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}
	}
	
	@Override
	public String getDescription() {
		return "Rename "+this.getElementType()+" element with the name "+this.getName();
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserRenameElement result = UserActionModelFactory.eINSTANCE.createUserRenameElement();
		result.setElementID(this.getElementID());
		result.setElementType(this.getElementType());
		result.setName(this.getName());
		return result;
	}
}
