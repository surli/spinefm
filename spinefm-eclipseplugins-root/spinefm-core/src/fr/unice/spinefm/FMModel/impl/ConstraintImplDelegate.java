package fr.unice.spinefm.FMModel.impl;

import fr.unice.spinefm.utils.Utils;

public class ConstraintImplDelegate extends ConstraintImpl {

	@Override
	public boolean equals(Object other) {
		if (other instanceof ConstraintImpl) {
			ConstraintImpl otherConst = (ConstraintImpl)other;
			return Utils.equalsPrimitive(this.rule, otherConst.rule);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Constraint ("+this.getRule()+")";
	}
}
