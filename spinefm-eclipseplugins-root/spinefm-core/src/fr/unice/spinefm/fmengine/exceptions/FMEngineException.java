package fr.unice.spinefm.fmengine.exceptions;

/**
 * This file is part of SpineFM framework.
 * 
 * An exception to manage errors from the FMEngine.
 * @author Simon Urli
 *
 */
public class FMEngineException extends Exception {

	public FMEngineException(String string) {
		super("FMEngineException :"+string);
	}

}
