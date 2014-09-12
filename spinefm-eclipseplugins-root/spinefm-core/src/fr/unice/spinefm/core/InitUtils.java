package fr.unice.spinefm.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.exceptions.RootPathNotSetException;

public class InitUtils {

	/**
	 * Absolute path of the directory containing all feature models scripts
	 */
	public static final String DIRECTORY_FMS = "/fms/";
	
	public static final String DIRECTORY_RESTFUNC = "/restfunc/";
	
	/**
	 * Return the absolute path of the feature model scripts to the given domain element
	 * @param de The domain element, one wishes to initialize
	 * @return the path of a script to initialize its feature model
	 * @throws RootPathNotSetException 
	 */
	public static String getFMInitializerForDomainElement(DomainElement de, String rootPath) {
		return rootPath+DIRECTORY_FMS+de.getId()+".fml";
	}
	
	public static List<String> getRestrictionFunctionsFromAssociationDir(DEAssociation dea, String rootPath) {
		String path = rootPath+DIRECTORY_RESTFUNC+dea.getId();
		File f = new File(path);
		List<String> result = new ArrayList<String>();
		if (f.exists()) {
			for (File sf : f.listFiles()) {
				if (sf.isFile()) {
					String[] tokens = sf.getName().split(".restfunc");
					if (tokens.length == 1) {
						result.add(sf.getAbsolutePath());
					}
				}
			}
		}
		return result;
	}
	
	public static String getFMID(DomainElement de, MultipleSoftwareProductLine mspl) {
		return mspl.getId()+"_"+de.getId();
	}
	
	public static String getElementNameFromInstanceId(String element, String instanceID) {
		return element+"_"+instanceID;
	}
	
	public static String getRestrictionFunctionIdFromPathName(String path) {
		String pof = path.substring(path.lastIndexOf("/")+1);
		if (pof.indexOf(".") != -1)
			return pof.substring(0, pof.indexOf("."));
		else
			return pof;
	}
}
