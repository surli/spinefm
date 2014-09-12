package fr.unice.spinefm.ProcessModel.exceptions;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

public class ContextNotFoundException extends ElementNotFoundException {

	public ContextNotFoundException(String msg) {
		super(msg);
	}
}
