package fr.unice.spinefm.RFModel.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.unice.spinefm.ActionModel.ActionModelFactory;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.RFModel.Rule;
import fr.unice.spinefm.roassaltracer.RoassalTracer;
import fr.unice.spinefm.utils.Utils;

public class RestrictionFunctionImplDelegate extends RestrictionFunctionImpl {

	@Override
	public RestrictionFunction createAndAssociateInverseRestFunc() throws FeatureNotFoundException {
		RestrictionFunction restFuncInverse = RFModelFactory.eINSTANCE.createRestrictionFunction();
		restFuncInverse.setId(this.getId()+"_inverse");
		restFuncInverse.setSource(this.getTarget());
		restFuncInverse.setTarget(this.getSource());
		for (Rule r : this.getRules()) {
			Rule rInv = r.createInverseRule();
			restFuncInverse.getRules().add(rInv);
		}
		this.setInverse(restFuncInverse);
		restFuncInverse.setInverse(this);
		return restFuncInverse;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof RestrictionFunction))
			return false;
		RestrictionFunction rf = (RestrictionFunction)o;
		return (this.getId().equals(rf.getId()) && Utils.equalsEList(this.getRules(), rf.getRules()));
	}
	
	public void roassalTrace(Map<String, List<String>> buffer) {
		if (!buffer.containsKey(RoassalTracer.ROASSAL_RF))
			buffer.put(RoassalTracer.ROASSAL_RF, new ArrayList<String>());
		
		
		String rules;
		if (this.getRules().isEmpty())
			rules = "rules=[]";
		else {
			rules = "rules=[";
			for (Rule r : this.getRules()) {
				rules += r.getId()+",";
				RoassalTracer.callRoassalTracer(r, buffer);
			}
			rules = rules.substring(0, rules.length()-1)+"]";
		}
		
		String trace = RoassalTracer.ROASSAL_RF+" id=\""+this.id+"\" "+rules;
		buffer.get(RoassalTracer.ROASSAL_RF).add(trace);
	}
	
	@Override
	public String toString() {
		return "RF "+this.getId();
	}
}
