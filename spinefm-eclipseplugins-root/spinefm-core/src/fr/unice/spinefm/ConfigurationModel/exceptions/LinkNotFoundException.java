package fr.unice.spinefm.ConfigurationModel.exceptions;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

public class LinkNotFoundException extends ElementNotFoundException {

	public LinkNotFoundException(String msg) {
		super(msg);
	}
}
