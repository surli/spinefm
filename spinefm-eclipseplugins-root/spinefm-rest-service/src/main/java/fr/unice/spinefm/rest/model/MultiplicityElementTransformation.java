package fr.unice.spinefm.rest.model;

import fr.unice.spinefm.MSPLModel.MultiplicityElement;

public class MultiplicityElementTransformation {

	public static RestMultiplicityElement transform(MultiplicityElement me) {
		return new RestMultiplicityElement(me.getLowerBound(), me.getUpperBound());
	}
}
