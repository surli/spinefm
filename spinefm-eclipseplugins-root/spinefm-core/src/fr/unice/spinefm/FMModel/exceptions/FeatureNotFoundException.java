package fr.unice.spinefm.FMModel.exceptions;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

public class FeatureNotFoundException extends ElementNotFoundException {

	public FeatureNotFoundException(String msg) {
		super(msg);
	}
}
