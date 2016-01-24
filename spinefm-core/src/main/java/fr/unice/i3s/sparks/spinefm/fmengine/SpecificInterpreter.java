package fr.unice.i3s.sparks.spinefm.fmengine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;

/**
 * The interface of a specific interpreter for the Feature Model Engine. 
 * @author Simon Urli
 *
 */
public interface SpecificInterpreter {

	/**
	 * To evaluate a script file
	 * @param filename The path of the file
	 * @throws FMEngineException If there is an error during the execution of the script
	 * @throws FileNotFoundException In case of error in the filepath
	 * @throws IOException For all reading errors
	 */
	public void evalFile(String filename) throws FMEngineException, FileNotFoundException, IOException;
	
	/**
	 * Evaluate a specific command
	 * @param cmd The command to evaluate
	 * @throws FMEngineException In case of error in the command.
	 */
	public void eval(String cmd) throws FMEngineException;
	
	public void clearInterpreter();
	
	public void setVerbose(boolean b);
	
	public Collection<String> getSelectedFeature(String configurationID) throws FMEngineException;
	
	public Collection<String> getDeselectedFeature(String configurationID) throws FMEngineException;

	public Collection<String> getUnselectedFeature(String configurationID) throws FMEngineException;
	
	public boolean isValid(String configurationID) throws FMEngineException;
	
	public boolean isComplete(String configurationID) throws FMEngineException;
	
	public Set<Set<String>> getAvailableConfigurations(String configurationID) throws FMEngineException;
}
