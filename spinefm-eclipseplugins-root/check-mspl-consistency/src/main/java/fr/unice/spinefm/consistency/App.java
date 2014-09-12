package fr.unice.spinefm.consistency;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import fr.familiar.interpreter.VariableNotExistingException;
import fr.familiar.parser.VariableAmbigousConflictException;
import fr.familiar.variable.FeatureModelVariable;
import fr.familiar.variable.FeatureVariable;
import fr.familiar.variable.SetVariable;
import fr.familiar.variable.Variable;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserInit;
import fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate;
import fr.unice.spinefm.ActionModel.UserActionModel.UserSelect;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.fmengine.familiar.FamiliarInterpreter;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static String outputCombination(List<SetVariable> combinaison) {
		String log = "";
		for (SetVariable sv : combinaison) {
			log += "{";
			for (Variable v : sv.getVars()) {
				FeatureVariable fv = (FeatureVariable)v;
				log += fv.getFtName()+" ";
			}
			log += "}\n";
		}
		return log;
	}
	
	private static void logMessage(FileWriter fw, String msg) throws IOException {
		String msgToWrite = msg+"\n";
		System.out.println(msgToWrite);
		fw.write(msgToWrite);
		fw.flush();
	}
	private static <T> void GeneratePermutations(List<List<T>> Lists, List<List<T>> result, int depth, List<T> current)
	{
	    if (depth == Lists.size())
	    {
	       result.add(current);
	       return;
	     }

	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	    	List<T> newcurrent = new ArrayList<T>(current);
	    	newcurrent.add(Lists.get(depth).get(i));
	        GeneratePermutations(Lists, result, depth + 1, newcurrent);
	    }
	}
	
    public static void main( String[] args )
    {
    	try {
	    	
	    	UserInit ui = UserActionModelFactory.eINSTANCE.createUserInit();
			ui.setFilePath("/var/yourcast/MSPL/MultipleSoftwareProductLine.xmi");
			ui.setRootPath("/var/yourcast/MSPL/");
			ui.apply();
			Logger.getLogger("fr.unice.spinefm").setLevel(Level.OFF);
			ContextManager cm = (ContextManager)ui.getResult();
			
			FamiliarInterpreter sfi = (FamiliarInterpreter) cm.getFma().getSFI();
			sfi.setVerbose(false);
			List<DomainElement> listDE = cm.getMspl().getDomainElements();
			
			FileWriter fw = new FileWriter("/tmp/yc-metric.log");
			List<List<SetVariable>> listFmv = new ArrayList<List<SetVariable>>();
			
			for (DomainElement de : listDE) {
				FeatureModelVariable fmv = (FeatureModelVariable) sfi.getVariable(cm.getMspl().getId()+"_"+de.getId());
				Set<Variable> configs = fmv.configs();
				
				List<SetVariable> sconfigs = new ArrayList<SetVariable>();
				for (Variable v : configs) {
					sconfigs.add((SetVariable)v);
				}
				listFmv.add(sconfigs);
			}
			
			List<List<SetVariable>> allPotentialCombinations = new ArrayList<List<SetVariable>>();
			App.GeneratePermutations(listFmv, allPotentialCombinations, 0, new ArrayList<SetVariable>());
			
			String log = "Size : "+allPotentialCombinations.size()+"\n";
			log += "First combinaison : \n";
			log += App.outputCombination(allPotentialCombinations.get(0));
			
			App.logMessage(fw, log);
			
			int totalCounter = 0;
			int deCounter = 0;
			int featureCounter = 0;
			int combinationNumber = 0;
			boolean valid = true;
			
			for (List<SetVariable> combinaison : allPotentialCombinations) {
				if (combinationNumber % 10 == 0) {
					log = "Analyzing combination n°"+combinationNumber+" | Valid combination for now : "+totalCounter+"\n";
					//log += App.outputCombination(combinaison);
					App.logMessage(fw, log);
				}
				
				
				UserInit uiCombi = UserActionModelFactory.eINSTANCE.createUserInit();
				uiCombi.setFilePath("/var/yourcast/MSPL/MultipleSoftwareProductLine.xmi");
				uiCombi.setRootPath("/var/yourcast/MSPL/");
				uiCombi.apply();
				ContextManager cmCombi = (ContextManager)uiCombi.getResult();
				
				List<DomainElement> deList = cm.getMspl().getDomainElements();
				Iterator<DomainElement> iterator = deList.iterator();
				DomainElement currentDe;
				deCounter = 0;
				valid = true;
				
				
				for (SetVariable config : combinaison) {
					currentDe = iterator.next();
					featureCounter = 0;
					
					for (Variable varFeature : config.getVars()) {
						FeatureVariable feature = (FeatureVariable)varFeature;
						UserSelect select = UserActionModelFactory.eINSTANCE.createUserSelect();
						select.initManualAction(cmCombi);
						select.setFeatureName(feature.getFtName());
						select.setDomainElementName(currentDe.getId());
						select.setContextID(cmCombi.getGlobalContext().getId());
						
						UserPropagate propagate = UserActionModelFactory.eINSTANCE.createUserPropagate();
						propagate.initManualAction(cmCombi);
						propagate.setContextID(cmCombi.getGlobalContext().getId());
						propagate.setDomainElementName(currentDe.getId());
						
						try {
							select.apply();
							featureCounter++;
						} catch (Exception e) {
							System.err.println(e.getMessage());
							valid = false;
							break;
						}
						propagate.apply();
						
					}
					if (!valid) {
						break;
					}
				}
				for (ConfigurationProcessStep cps : cmCombi.getGlobalContext().getCPS()) {
					sfi.eval("rm "+cps.getConfName());
				}
				if (valid) {
					totalCounter++;
				}
				
				combinationNumber++;
				valid = true;
			}
			log = "Overall count of valid configurations : "+totalCounter+"\n";
			System.out.println(log);
			fw.write(log);
			fw.flush();
			fw.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    		System.exit(1);
    	}
    }
}
