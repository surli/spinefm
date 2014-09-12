package fr.unice.spinefm.MSPLModel.exceptions;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

public class DomainElementNotFoundException extends ElementNotFoundException {

	public DomainElementNotFoundException(String msg) {
		super(msg);
	}
}
