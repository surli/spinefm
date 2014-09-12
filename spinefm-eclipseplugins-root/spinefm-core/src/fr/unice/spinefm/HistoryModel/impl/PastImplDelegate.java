package fr.unice.spinefm.HistoryModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImplDelegate;
import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.HistoryModel.HistoryModelFactory;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

public class PastImplDelegate extends PastImpl {

	public int nbUserUndo = 0;
	public int nbSystemUndo = 0;
	
	private static Logger log = Logger.getLogger(PastImplDelegate.class);
	
	@Override
	public Step createStep(UserAction action) {
		if (action.getStep() != null) {
			throw new IllegalArgumentException("The given action is already attached to a step !");
		}
		Step s = HistoryModelFactory.eINSTANCE.createStep();
		s.setId(UUID.randomUUID().toString());
		s.setLaunchingAction(action);
		action.setStep(s);
		this.getSteps().add(s);
		return s;
	}
	
	@Override
	public Step getStepFromId(String stepID) {
		for (Step s : this.getSteps()) {
			if (s.getId().equals(stepID)) {
				return s;
			}
		}
		return null;
	}
	
	@Override
	public void undoLastAction() {
		Step s = this.getSteps().remove(this.getSteps().size()-1);
		this.nbUserUndo++;
		this.nbSystemUndo += s.getLaunchedActions().size();
		
		s.undoActions();
	}
	
	@Override
	public void undoAction(Step s) {
		List<Step> stepsToRedo = new ArrayList<Step>();
		this.nbUserUndo++;
		int limit = this.getSteps().indexOf(s);
		
		for (int i = this.getSteps().size()-1; i >= limit; i--) {
			Step oldStep = this.getSteps().remove(i);
			if (i == limit) {
				this.nbSystemUndo += oldStep.getLaunchedActions().size();
			}
			oldStep.undoActions();
			if (i != limit) {
				stepsToRedo.add(0, oldStep);
			}
		}
		
		for (Step toRedo : stepsToRedo) {
			try {
				this.getSteps().add(toRedo);
				toRedo.getLaunchingAction().apply();
			} catch (Exception e) {
				this.nbUserUndo++;
				this.nbSystemUndo += toRedo.getLaunchedActions().size();
				toRedo.undoActions();
				this.getSteps().remove(toRedo);
				log.info("Redo action "+toRedo.getDescription()+" has failed");
				log.info(e.getMessage());
			}
		}
	}
	
	public Past clonePastWithoutSystemActions() {
		Past p = HistoryModelFactory.eINSTANCE.createPast();
		p.setId(this.getId());
		p.setModelPath(this.getModelPath());
		p.setRootPath(this.getRootPath());
		for (Step s : this.getSteps()) {
			p.getSteps().add(s.cloneStepWithoutSystemActions());
		}
		
		return p;
	}
}
