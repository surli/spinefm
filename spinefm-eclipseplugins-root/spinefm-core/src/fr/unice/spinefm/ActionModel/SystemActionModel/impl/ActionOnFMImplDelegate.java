package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.*;
public class ActionOnFMImplDelegate extends ActionOnFMImpl {

	@Override
	public ActionOnFM cloneAction() {
		ActionOnFM result;
		if (this instanceof ActionSelect) {
			ActionSelect clone = SystemActionModelFactory.eINSTANCE.createActionSelect();
			ActionSelect original = (ActionSelect)this;
			clone.setFeature(original.getFeature());
			result = clone;
		} else if (this instanceof ActionDeselect) {
			ActionDeselect clone = SystemActionModelFactory.eINSTANCE.createActionDeselect();
			ActionDeselect original = (ActionDeselect)this;
			clone.setFeature(original.getFeature());
			result = clone;
		} else if (this instanceof ActionAddCTConstraint) {
			ActionAddCTConstraint clone = SystemActionModelFactory.eINSTANCE.createActionAddCTConstraint();
			ActionAddCTConstraint original = (ActionAddCTConstraint)this;
			clone.setConstraint(original.getConstraint());
			result = clone;
		} else {
			return null;
		}
		
		result.setCps(this.getCps());
		result.setFm(this.getFm());
		result.setFma(this.getFma());
		return result;
	}
}
