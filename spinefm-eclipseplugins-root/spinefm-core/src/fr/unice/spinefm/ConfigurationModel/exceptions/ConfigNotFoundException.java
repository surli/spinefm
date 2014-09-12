package fr.unice.spinefm.ConfigurationModel.exceptions;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

public class ConfigNotFoundException extends ElementNotFoundException {

	public ConfigNotFoundException(String msg) {
		super(msg);
	}
}
