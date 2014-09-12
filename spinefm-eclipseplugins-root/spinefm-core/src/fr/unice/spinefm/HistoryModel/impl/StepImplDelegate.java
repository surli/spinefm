package fr.unice.spinefm.HistoryModel.impl;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.HistoryModel.HistoryModelFactory;
import fr.unice.spinefm.HistoryModel.Step;

public class StepImplDelegate extends StepImpl {

	private static Logger log = Logger.getLogger(StepImplDelegate.class);
	@Override
	public void undoActions() {
		int actionNumber = this.getLaunchedActions().size();
		log.debug("Step "+this.getDescription()+" - Number of actions : "+actionNumber);
		for (int i = actionNumber-1; i >= 0; i--) {
			log.debug("Step "+this.getId()+" - Undo action n°"+(actionNumber-i));
			SystemAction sa = this.getLaunchedActions().get(i);
			sa.undo();
			this.getLaunchedActions().remove(sa);
		}
	}
	
	@Override
	public String getDescription() {
		if (this.getLaunchingAction() != null) {
			return this.getLaunchingAction().getDescription();
		} else {
			return "Virtual step";
		}
	}
	
	@Override
	public String toString() {
		return "Step : "+this.getDescription()+" [ID: "+this.getId()+"]";
	}
	
	@Override
	public Step cloneStepWithoutSystemActions() {
		Step s = HistoryModelFactory.eINSTANCE.createStep();
		s.setId(this.getId());
		UserAction ua = this.getLaunchingAction().cloneActionWithStringAttributes();
		if (ua != null) {
			s.setLaunchingAction(ua);
			ua.setStep(s);
		} else {
			throw new RuntimeException("User action cannot be cloned.");
		}
		return s;
	}
}
