package fr.unice.spinefm.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.fmengine.SpecificInterpreter;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

public class ModelInstancesFactory {

	private static List<String> instanciedModels = new ArrayList<String>();
	
	public static void createModelInstance(MultipleSoftwareProductLine model, SpecificInterpreter sfi, String rootPath) throws FileNotFoundException, FMEngineException, IOException {
		if (!instanciedModels.contains(model.getId())) {
			List<DomainElement> l = model.getDomainElements();
			//for (int i = l.size()-1; i >= 0; i--) {
			//	DomainElement de = l.get(i);
			for (DomainElement de : model.getDomainElements()) {
				sfi.evalFile(InitUtils.getFMInitializerForDomainElement(de,rootPath));
			}
			instanciedModels.add(model.getId());
		}
	}
	
	public static void emptyList() {
		instanciedModels.clear();
	}
}
