package fr.familiar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
 * @see https://nyx.unice.fr/projects/familiar/
 * @author Simon Urli
 *
 */
public class FamiliarInterpreter {

	protected final FMLShell _shell;
	protected final FMLCommandInterpreter _environment;
	protected boolean hasBeenParsed;

	public FamiliarInterpreter() {
		/*
		 * TODO: check that code.
		 * Two users must use two different environments...
		 */
		//if (FMLShell.getInstance() == null)
			_shell = FMLShell.instantiateStandalone(System.in);
		//else
		//	_shell = FMLShell.getInstance();
		_environment = _shell.getCurrentEnv();
		hasBeenParsed = false;
	}

	/**
	 * @param filename
	 * @throws FMEngineException, FileNotFoundException, IOException 
	 * @throws FMLFatalError
	 * @throws FMLAssertionError
	 */
	public void evalFile(String filename) throws Exception {
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
	 * @throws FMLFatalError
	 *             in case there is a fatal error during the evaluation
	 * @throws FMLAssertionError
	 *             in case there is an assertion (using assert in FAMILIAR)
	 *             error during the evaluation
	 */
	public void eval(String instr) throws Exception {
		try {
			_shell.parse(instr);
		} catch (Exception e) {
			throw new Exception("Unmanaged error :"+e);
		}

		if (_shell.hasFatalErrors()) {
			//throw new FMLFatalError(_shell.getFatalErrors());
			throw new Exception("Fatal error :"+_shell.getFatalErrors().toString());
		}

		if (_shell.hasAssertionErrors()) {
			hasBeenParsed = true; // considering that assertion does not break
									// the parsing process
			//throw new FMLAssertionError(_shell.getAssertionErrors());
			throw new Exception("Assertion error :"+_shell.getFatalErrors().toString());
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

		assert (hasBeenParsed);

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
	public FeatureModelVariable getFMVariable(String id)
			throws VariableNotExistingException,
			VariableAmbigousConflictException {
		Variable v = _environment.getVariable(id);
		assertNotNull(v);
		assertTrue(v instanceof FeatureModelVariable);
		return (FeatureModelVariable) v;

	}
	
	protected ConfigurationVariable getConfigurationVariable(String id) 
			throws VariableNotExistingException,
			VariableAmbigousConflictException {
		Variable v = _environment.getVariable(id);
		assertNotNull(v);
		//assertTrue(v instanceof FeatureModelVariable);
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
		assertNotNull(v);
		assertTrue(v instanceof SetVariable);
		return (SetVariable) v;

	}

	public FMLShell getShell() {
		return _shell;
	}
	
	

	public void setVerbose(boolean b) {
		_shell.setVerbose(b);
	}

	public Collection<String> getSelectedFeature(String configurationID)
			throws Exception {
	    ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
			return cv.getSelected();
	
	}

	
	public Collection<String> getDeselectedFeature(String configurationID)
			throws Exception {
		ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
		return cv.getDeselected();
	}

	
	public Collection<String> getUnselectedFeature(String configurationID) throws Exception {
	    ConfigurationVariable cv = this.getConfigurationVariable(configurationID);
	    return cv.getUnselected();
	
	}

	/*public static void main(String args[]) {
		FamiliarInterpreter sfi = new FamiliarInterpreter();
		System.out.println("Instanciation de SFI");
		//String FMA = "source = FM(Source: TypeInfo Criteria; TypeInfo: PictureAlbum; PictureAlbum: (Picasa|FlickR); Criteria: (Sort|Filter)+; Sort: Date; Filter: Name; Date <-> Picasa;)";
		String fmlfile = "/Users/urli/yourcast/yourcast/mde/fr.unice.yourcast.models.cspl/models/testmodels/fml/source.fml";
		try {
			//sfi.eval(FMA);
			sfi.evalFile(fmlfile);
			System.out.println("Eval de FMA");
			System.out.println("Env : "+sfi.getAllIdentifiers());
			Variable fmav = sfi.getVariable("source");
			FeatureModelVariable fmv = (FeatureModelVariable) fmav;
			FeatureVariable root = fmv.root();
			System.out.println("Root:"+fmv.getVOP(root.getFtName()).getSpecificValue());
			SetVariable sv = root.children();
			Set<Variable> svv = sv.getVars();
			for(Variable v : svv) {
				if (v.getType().equals("FEATURE")) {
					FeatureVariable fv = (FeatureVariable)v;
					System.out.println(fv.getCompleteIdentifier()+" "+fmv.getVOP(fv.getFtName()).getSpecificValue());
					SetVariable children = fv.children();
					for (Variable v2 : children.getVars()) {
						if (v.getType().equals("FEATURE")) {
							FeatureVariable fv2 = (FeatureVariable)v2;
							System.out.println(fv2.getCompleteIdentifier()+" "+fmv.getVOP(fv2.getFtName()).getSpecificValue());
						}
					}
				}
			}
			
		} catch (VariableNotExistingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VariableAmbigousConflictException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}*/
}
