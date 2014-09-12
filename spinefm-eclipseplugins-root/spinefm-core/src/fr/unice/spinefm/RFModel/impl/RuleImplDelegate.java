package fr.unice.spinefm.RFModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import fr.unice.spinefm.ActionModel.ActionModelFactory;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.Rule;
import fr.unice.spinefm.FMModel.Constraint;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.roassaltracer.RoassalTracer;
import fr.unice.spinefm.utils.Debug;

public class RuleImplDelegate extends RuleImpl {

	private static int counter = 0;
	private static Logger log = Logger.getLogger(RuleImplDelegate.class);
	
	protected RuleImplDelegate() {
		super();
		this.setId("Rule_"+(counter++));
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Rule))
			return false;
		Rule r = (Rule)o;
		return (this.getId().equals(r.getId()) && this.getState().equals(r.getState()) && this.getAction().equals(r.getAction()));
	}
	
	@Override
	public ConfigurationState getState() {
		if (this.state.getId() == null || this.state.getId().equals(""))
			this.state.setId("cs_"+this.id);
		return state;
	}
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_RULE))
			buffer.put(RoassalTracer.ROASSAL_RULE, new ArrayList<String>());

		RoassalTracer.callRoassalTracer(this.action, buffer);
		RoassalTracer.callRoassalTracer(this.state, buffer);
		
		String trace = RoassalTracer.ROASSAL_RULE+" id=\""+this.id+"\" state=["+this.state.getId()+"] actions=["+this.action+"]";
		buffer.get(RoassalTracer.ROASSAL_RULE).add(trace);
	}
	
	@Override
	public Rule createInverseRule() throws FeatureNotFoundException {
		ActionOnFM action = this.getAction();
		ConfigurationState cs = this.getState();
		
		Rule rInv = RFModelFactory.eINSTANCE.createRule();
		rInv.setId(this.getId()+"inv");
		ConfigurationState invCS = RFModelFactory.eINSTANCE.createConfigurationState();
		rInv.setState(invCS);
		invCS.setFm(action.getFm());
		
		Feature f;
		
		if (action instanceof ActionSelect) {
			ActionSelect as = (ActionSelect)action;
			f = as.getFeature();
			invCS.getDeselectedFeatures().add(f);
		} else if (action instanceof ActionDeselect) {
			ActionDeselect ad = (ActionDeselect)action;
			f = ad.getFeature();
			invCS.getSelectedFeatures().add(f);
		}
		
		int maxFeatureInvolved = (cs.getDeselectedFeatures().size()+cs.getSelectedFeatures().size());
		
		ActionOnFM a = null;
		// pas de addConstraint
		if (maxFeatureInvolved == 1) {
			if (cs.getDeselectedFeatures().size() == 1) {
				f = cs.getDeselectedFeatures().get(0);
				ActionSelect as = SystemActionModelFactory.eINSTANCE.createActionSelect();
				as.setFm(cs.getFm());
				as.setFeature(f);
				a = as;
			}
			if (cs.getSelectedFeatures().size() == 1) {
				f = cs.getSelectedFeatures().get(0);
				ActionDeselect ad = SystemActionModelFactory.eINSTANCE.createActionDeselect();
				ad.setFm(cs.getFm());
				ad.setFeature(f);
				a = ad;
			}

			rInv.setAction(a);
		} else {
			ActionAddCTConstraint act = SystemActionModelFactory.eINSTANCE.createActionAddCTConstraint();
			
			act.setFm(cs.getFm());
			String familiar_constraint = "";
			
			for (Feature fa : cs.getSelectedFeatures()) {
				familiar_constraint += "!"+fa.getName()+" ";
				if (maxFeatureInvolved > 1)
					familiar_constraint += "or ";
				maxFeatureInvolved--;
			}
			
			for (Feature fa : cs.getDeselectedFeatures()) {
				familiar_constraint += fa.getName()+" ";
				if (maxFeatureInvolved > 1)
					familiar_constraint += "or ";
				maxFeatureInvolved--;
			}
			Constraint cst = FMModelFactory.eINSTANCE.createConstraint();
			cst.setRule(familiar_constraint);
			act.setConstraint(cst);
			rInv.setAction(act);
		}
		log.info("Create inverse rule : "+rInv);
		return rInv;
	}
	
	@Override
	public String toString() {
		return "Rule "+this.getId();
	}
}
