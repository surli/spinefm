package fr.unice.spinefm.roassaltracer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

public class RoassalTracer {

	public static final String ROASSAL_IDENTIFIER = "[ROASSAL]";
	public static final String ROASSAL_FM = "FeatureModel";
	public static final String ROASSAL_F = "Feature";
	public static final String ROASSAL_DE = "DomainElement";
	public static final String ROASSAL_DEA = "DEAssociation";
	public static final String ROASSAL_DEAEND = "DEAEnd";
	public static final String ROASSAL_ME = "MultiplicityElement";
	public static final String ROASSAL_RF = "RestrictionFunction";
	public static final String ROASSAL_RULE = "Rule";
	public static final String ROASSAL_CS = "ConfigurationState";
	public static final String ROASSAL_AS = "ActionSelect";
	public static final String ROASSAL_AD = "ActionDeselect";
	public static final String ROASSAL_ACTC = "ActionAddCTConstraint";
	
	public static void callRoassalTracer(EObject obj, Map<String, List<String>> buffer) {
		Method roassalTrace;
		try {
			roassalTrace = obj.getClass().getMethod("roassalTrace", Map.class);
			roassalTrace.invoke(obj, buffer);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String trace(MultipleSoftwareProductLine mspl) {
		String result = ROASSAL_IDENTIFIER+" BEGIN MODEL\n";
		Map<String, List<String>> buffer = new HashMap<String, List<String>>();
		callRoassalTracer(mspl, buffer);
		
		for (String keys : buffer.keySet()) {
			result = result.concat(">> list of "+keys+"\n");
			for (String traces : buffer.get(keys)) {
				result = result.concat(ROASSAL_IDENTIFIER+" "+traces+"\n");
			}
		}
		result = result.concat(ROASSAL_IDENTIFIER+" END MODEL \n");
		return result;
	}
}
