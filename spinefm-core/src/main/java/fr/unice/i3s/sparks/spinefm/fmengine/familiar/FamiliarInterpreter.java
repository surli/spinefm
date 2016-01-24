package fr.unice.i3s.sparks.spinefm.fmengine.familiar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.unice.i3s.sparks.spinefm.fmengine.SpecificInterpreter;
import fr.unice.i3s.sparks.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.i3s.sparks.spinefm.utils.Debug;
import org.apache.log4j.Logger;

import fr.familiar.interpreter.FMLShell;
import fr.familiar.interpreter.VariableNotExistingException;
import fr.familiar.parser.FMLCommandInterpreter;
import fr.familiar.parser.VariableAmbigousConflictException;
import fr.familiar.variable.ConfigurationVariable;
import fr.familiar.variable.FeatureModelVariable;
import fr.familiar.variable.SetVariable;
import fr.familiar.variable.Variable;
import fr.familiar.variable.VariableImpl;
/**
 * The implementation of SpecificInterpreter for FAMILIAR
 * @see{http://nyx.unice.fr/projects/familiar/}
 * @author Simon Urli
 *
 */
public class FamiliarInterpreter implements SpecificInterpreter {

	protected final FMLShell _shell;
	protected final FMLCommandInterpreter _environment;
	protected boolean hasBeenParsed;
	private static Logger log = Logger.getLogger(FamiliarInterpreter.class);
	private static FamiliarInterpreter instance = new FamiliarInterpreter();

	private FamiliarInterpreter() {
		//if (FMLShell.getInstance() == null)
			_shell = FMLShell.instantiateStandalone(System.in);
		//else
		//	_shell = FMLShell.getInstance();
		_environment = _shell.getCurrentEnv();
		_shell.setVerbose(true);
		log.debug("Environment du shell :"+_environment);
		hasBeenParsed = false;
	}
	
	public static FamiliarInterpreter getInstance() {
		instance.getShell().printFMLHeader();
		return instance;
	}
	
	public void clearInterpreter() {
		this._shell.reset();
	}

	/**
	 * Eval file line by line: won't work with a FM written on multiple lines.
	 * @param filename
	 * @throws FMEngineException, FileNotFoundException, IOException
	 */
	public void evalFile(String filename) throws FMEngineException, FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String t = "";
		while (br.ready()) {
			t = t.concat(br.readLine());
		}
		this.eval(t);
	}

	/**
	 * @param instr
	 *            the FAMILIAR expressions to eval
	 */
	public void eval(String instr) throws FMEngineException {
		Debug.traceToScript(instr);
		try {
			_shell.parse(instr);
		} catch (Exception e) {
			throw new FMEngineException("Unmanaged error :"+e+".\nInstruction: "+instr+"\n");
		}

		if (_shell.hasFatalErrors()) {
			//throw new FMLFatalError(_shell.getFatalErrors());
			throw new FMEngineException("Fatal error :"+_shell.getFatalErrors().toString());
		}

		if (_shell.hasAssertionErrors()) {
			hasBeenParsed = true; // considering that assertion does not break
									// the parsing process
			//throw new FMLAssertionError(_shell.getAssertionErrors());
			throw new FMEngineException("Assertion error :"+_shell.getFatalErrors().toString());
		}
	}

	/**
	 * @param id
	 *            identifier of a variable in the environment
	 * @return variable 'id' in the environment
	 * @throws VariableNotExistingException
	 *             in case there is no variable associated to the identifier
	 * @throws VariableAmbigousConflictException
	 *             in case there is no explicit identifier (ambiguity)
	 */
	public Variable getVariable(String id) throws VariableNotExistingException,
			VariableAmbigousConflictException {

		//assert (hasBeenParsed);

		try {
			VariableImpl v = (VariableImpl) _environment.getVariable(id);
			return v;
		} catch (VariableNotExistingException e) {
			throw e;
		} catch (VariableAmbigousConflictException e) {
			throw e;
		}

	}

	/**
	 * Note that fm1.A are not considered as "active" variables and are not
	 * returned
	 * 
	 * @return A list of identifiers, where each element is a variable
	 *         identifier in the environment
	 */
	protected List<String> getAllIdentifiers() {

		assert (hasBeenParsed);

		List<String> ls = new ArrayList<String>();
		List<Variable> vars = _environment.getVariables();

		for (Variable v : vars) {
			ls.add(((VariableImpl) v).getCompleteIdentifier());
		}

		return ls;
	}

	/**
	 * Basically delete all variables in the environment
	 */
	protected void reset() {
		_shell.reset();
		assert (getAllIdentifiers().size() == 0);
	}

	/**
	 * @param id
	 * @return a variable of type feature model whose identifier is id in the
	 *         current environment
	 * @throws VariableAmbigousConflictException
	 * @throws VariableNotExistingException
	 */
	protected FeatureModelVariable getFMVariable(String id)
			throws VariableNotExistingException,
			VariableAmbigousConflictException {
		Variable v = _environment.getVariable(id);
		return (FeatureModelVariable) v;

	}
	
	protected ConfigurationVariable getConfigurationVariable(String id) 
			throws VariableNotExistingException,
			VariableAmbigousConflictException {
		Variable v = _environment.getVariable(id);
		return (ConfigurationVariable) v;
	}
	

	/**
	 * @param id
	 * @return a variable of type set whose identifier is id in the current
	 *         environment
	 * @throws VariableAmbigousConflictException
	 * @throws VariableNotExistingException
	 */
	protected SetVariable getSetVariable(String id)
			throws VariableNotExistingException,
			VariableAmbigousConflictException {
		Variable v = _environment.getVariable(id);
		return (SetVariable) v;

	}

	public FMLShell getShell() {
		return _shell;
	}

	public void setVerbose(boolean b) {
		_shell.setVerbose(b);
	}

	public Collection<String> getSelectedFeature(String configurationID)
			throws FMEngineException {
		try {
			ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
			this.eval("selectedF "+configurationID);
			return cv.getSelected();
		} catch (Exception e) {
			throw new FMEngineException(e.getMessage());
			//e.printStackTrace();
		}
	}


	public Collection<String> getDeselectedFeature(String configurationID)
			throws FMEngineException {
		try {
			ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
			this.eval("deselectedF "+configurationID);
			return cv.getDeselected();
		} catch (Exception e) {
			throw new FMEngineException(e.getMessage());
			//e.printStackTrace();
		}
	}

	public Collection<String> getUnselectedFeature(String configurationID) throws FMEngineException {
		try {
			ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
			this.eval("unselectedF "+configurationID);
			return cv.getUnselected();
		} catch (Exception e) {
			throw new FMEngineException(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public boolean isValid(String configurationID) throws FMEngineException {
		try {
			ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
			return cv.isValid();
		} catch (Exception e) {
			throw new FMEngineException(e.getMessage());
		}
	}
	
	public boolean isComplete(String configurationID) throws FMEngineException {
		try {
			ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
			return cv.isComplete();
		} catch (Exception e) {
			throw new FMEngineException(e.getMessage());
		}
	}

	public Set<Set<String>> getAvailableConfigurations(String configurationID)
			throws FMEngineException {
		String configFM = configurationID+"fm";
		String cmd = configFM +" = asFM "+configurationID;
		this.eval(cmd);
		
		String var = "allConfig";
		this.eval(var+" = configs "+configFM);
		HashSet<Set<String>> result = new HashSet<Set<String>>();
		try {
			SetVariable sv = this.getSetVariable(var);
			for (Variable v : sv.getVars()) {
				HashSet<String> configResult = new HashSet<String>();
				SetVariable config = (SetVariable)v;
				for (Variable v2 : config.getVars()) {
					configResult.add(v2.getValue());
				}
				result.add(configResult);
			}
		} catch (Exception e) {
			throw new FMEngineException(e.getMessage());
		}
		return result;
		
	}
}
