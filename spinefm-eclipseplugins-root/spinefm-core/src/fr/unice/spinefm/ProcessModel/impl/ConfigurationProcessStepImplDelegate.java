package fr.unice.spinefm.ProcessModel.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ActionModel.ActionMode;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.HistoryModel.HistoryModelFactory;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;
import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class ConfigurationProcessStepImplDelegate extends ConfigurationProcessStepImpl {

	private static Logger log = Logger.getLogger(ConfigurationProcessStepImplDelegate.class);
	private FMSpineFMAdapter fma;

	private Map<Feature, SystemAction> actionsDoneOnFeature;
	private static int counter = 0;

	protected ConfigurationProcessStepImplDelegate() {
		super();
		this.actionsDoneOnFeature = new HashMap<Feature, SystemAction>();
		this.setState(RFModelFactory.eINSTANCE.createConfigurationState());
		counter++;
	}

	@Override
	public boolean isComplete() throws FMEngineException {
		if (this.fma != null) {
			return this.fma.getSFI().isComplete(this.getConfName()); // && this.fma.getSFI().isValid(this.getConfName());
		}
		return false;
	}

	@Override
	public void captureImplicitActions(ActionOnFM as, Step step) throws FMEngineException {
		if (as != null) {
			this.getActionsDone().add(as);
		}
		
		Set<Feature> selectedFeatures = this.fma.getSelectedFeatures(this.getConfName(), this.domainElement.getRefers_on());
		log.debug("Retrieve selected : "+selectedFeatures);
		if (!selectedFeatures.isEmpty()) {
			this.getState().getSelectedFeatures().addAll(selectedFeatures);
		}

		Set<Feature> deselectedFeatures = this.fma.getDeselectedFeatures(this.getConfName(), this.domainElement.getRefers_on());
		log.debug("Retrieve deselected : "+selectedFeatures);
		if (!deselectedFeatures.isEmpty()) {
			this.getState().getDeselectedFeatures().addAll(deselectedFeatures);
		}
		
		for (Feature f : this.getState().getSelectedFeatures()) {
			if (!this.actionsDoneOnFeature.containsKey(f)) {
				this.recordActionDoneInsideFM("select", f, step);
			}
		}
		for (Feature f : this.getState().getDeselectedFeatures()) {
			if (!this.actionsDoneOnFeature.containsKey(f)) {
				this.recordActionDoneInsideFM("deselect", f, step);
			}
		}
	}

	private void recordActionDoneInsideFM(String type, Feature f, Step step) {
		ActionOnFM a;
		
		if (type.equals("select")) {
			ActionSelect select = SystemActionModelFactory.eINSTANCE.createActionSelect();
			select.setCps(this);
			select.setFeature(f);
			select.setFma(this.fma);
			a = select;
		} else if (type.equals("deselect")) {
			ActionDeselect deselect = SystemActionModelFactory.eINSTANCE.createActionDeselect();
			deselect.setCps(this);
			deselect.setFeature(f);
			deselect.setFma(this.fma);
			a = deselect;
		} else {
			throw new IllegalArgumentException("Action type must be select or deselect but it is : "+type);
		}
		a.setFm(this.getDomainElement().getRefers_on());
		a.setType(ActionMode.FM);
		a.setStep(step);
		this.recordActionDone(a, f);
	}
	
	@Override
	public void recordActionDone(ActionOnFM as, Feature f) {
		this.actionsDoneOnFeature.put(f, as);
		this.getActionsDone().add(as);
		log.info("Record action {"+as+"} on CPS "+this.id);
	}

	private void updateConfigurationState() throws FMEngineException {
		Set<Feature> selectedFeatures;
		selectedFeatures = this.fma.getSelectedFeatures(this.getConfName(), this.domainElement.getRefers_on());
		this.getState().getSelectedFeatures().addAll(selectedFeatures);

		Set<Feature> deselectedFeatures = this.fma.getDeselectedFeatures(this.getConfName(), this.getDomainElement().getRefers_on());
		this.getState().getDeselectedFeatures().addAll(deselectedFeatures);
	}

	@Override
	public void setFMA(FMSpineFMAdapter fma, Step step) throws FMEngineException {
		this.fma = fma;
		this.fma.createConfiguration(this.getConfName(), this.getDomainElement().getRefers_on());
		this.getState().setFm(this.getDomainElement().getRefers_on());
		
		this.updateConfigurationState();
		this.captureImplicitActions(null,step);
	}

	@Override
	public String getConfName() {
		return "conf_"+this.id;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ConfigurationProcessStepImpl))
			return false;
		ConfigurationProcessStep cps = (ConfigurationProcessStepImpl)o;
		// TODO Check that !
		return (this.domainElement.equals(cps.getDomainElement()) && this.getState().equals(cps.getState()) && this.getId().equals(cps.getId()));
	}

	@Override
	public boolean alreadyHaveAction(ActionOnFM as) throws FMEngineException {
		if (as instanceof ActionAddCTConstraint) {
			return false;
		} else if (as instanceof ActionSelect) {
			ActionSelect select = (ActionSelect)as;
			Feature f = select.getFeature();
			if (this.actionsDoneOnFeature.containsKey(f)) {
				SystemAction asDone = this.actionsDoneOnFeature.get(f);
				if (asDone instanceof ActionSelect) {
					return true;
				} else {
					throw new FMEngineException("Contradictory actions (SELECT) on feature "+f+" in CPS "+this.id);
				}
			}
			return false;
		}  else if (as instanceof ActionDeselect) {
			ActionDeselect deselect = (ActionDeselect)as;
			Feature f = deselect.getFeature();
			if (this.actionsDoneOnFeature.containsKey(f)) {
				SystemAction asDone = this.actionsDoneOnFeature.get(f);
				if (asDone instanceof ActionDeselect) {
					return true;
				} else {
					throw new FMEngineException("Contradictory actions (DESELECT) on feature "+f+" in CPS "+this.id);
				}
			}
			return false;
		} else {
			throw new IllegalArgumentException("This method can only be called for FMs actions (Select / deselect / addCTConstraint). It has been called with "+as);
		}
	}
	
	@Override
	public boolean isMergeableWithCPS(ConfigurationProcessStep cps) throws FMEngineException, IllegalCallException, ElementNotFoundException {
		log.info("Check if the CPS "+this+" is mergeable with the CPS "+cps);
		//ConfigurationProcessStep confCPS = conf.getCPSRef();
		//String clone_conf = "merge_"+this.getConfName()+"_"+confCPS.getConfName();
		//this.fma.cloneConfiguration(this.getConfName(), clone_conf);
		
		if (!this.getDomainElement().equals(cps.getDomainElement())) {
			throw new IllegalCallException("This method can only be called with a CPS of the same domain element. DE Source "+this.getDomainElement()+" DE Target "+cps.getDomainElement());
		}
		Step s = HistoryModelFactory.eINSTANCE.createStep();
		s.setLaunchingAction(null);
		s.setId(UUID.randomUUID().toString());
		
		//List<ActionOnFM> clonedActions = new ArrayList<ActionOnFM>();
		for (ActionOnFM a : cps.getActionsDone()) {
			try {
				if (!this.alreadyHaveAction(a)) {
					ActionOnFM a2 = a.cloneAction();
					a2.setCps(this);
					a2.setFma(this.fma);
					a2.setStep(s);
					a2.setFm(this.getDomainElement().getRefers_on());
					//clonedActions.add(a2);
					a2.apply();
				}
			} catch (FMEngineException e) {
				s.undoActions();
				return false;
			}
		}
		s.undoActions();
		
		return true;
	}
	
	private boolean isOtherManualActions() {
		for (SystemAction as : this.getActionsDone()) {
			if (as.getType().equals(ActionMode.MANUAL)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void setFeatureUnselected(Feature feature) {
		
		SystemAction as = this.actionsDoneOnFeature.get(feature);
		if (as instanceof ActionSelect) {
			this.getState().getSelectedFeatures().remove(feature);
		} else if (as instanceof ActionDeselect) {
			this.getState().getDeselectedFeatures().remove(feature);
		}
		this.getActionsDone().remove(as);
		this.actionsDoneOnFeature.remove(feature);
		
		if (as.getType().equals(ActionMode.MANUAL)) {
			if (!this.isOtherManualActions()) {
				this.setUserConfig(false);
			}
		}
	}

	@Override
	public void mergeWithExternalCPS(ConfigurationProcessStep confCPS, Step step, ContextManager cm) throws FMEngineException, ElementNotFoundException {
		log.info("Merging CPS "+this+" with CPS "+confCPS);
		for (ActionOnFM aof : confCPS.getActionsDone()) {
			if (!this.alreadyHaveAction(aof)) {
				ActionOnFM aofBis = aof.cloneAction();
				aofBis.setStep(step);
				aofBis.setCps(this);
				aofBis.setType(ActionMode.AUTOMATIC);
				aofBis.apply();
			}
		}
	}
	
	@Override
	public String toString() {
		return "CPS "+this.getId()+" ["+this.getDescription()+"] {"+this.getConfName()+"}";
	}
}
