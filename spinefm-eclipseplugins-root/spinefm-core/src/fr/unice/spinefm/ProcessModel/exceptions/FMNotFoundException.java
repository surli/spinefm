package fr.unice.spinefm.ProcessModel.exceptions;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

public class FMNotFoundException extends ElementNotFoundException {

	public FMNotFoundException(String msg) {
		super(msg);
	}
}
