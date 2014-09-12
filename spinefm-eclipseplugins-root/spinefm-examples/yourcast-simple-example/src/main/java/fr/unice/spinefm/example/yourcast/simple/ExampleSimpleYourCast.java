package fr.unice.spinefm.example.yourcast.simple;

import java.io.IOException;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException;
import fr.unice.spinefm.core.Core;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.exceptions.IllegalCallException;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.roassaltracer.*;

public class ExampleSimpleYourCast {
	public static void main(String args[]) throws ContextNotFoundException, DomainElementNotFoundException, FeatureNotFoundException, FMEngineException, FatalSpineFMException, IllegalCallException {
		Core c = new Core("./resources/exempleCMA/MultipleSoftwareProductLine.xmi","./resources/exempleCMA/");
		System.out.println(RoassalTracer.trace(c.getMspl()));
		/*System.out.println("Beginning of the scenario");
		System.out.println("Step1 : select Picasa (source) in a new context.");
		
		c.selectFeatureFromDomainElementInContext("EPU", "layout", c.getGlobalContext().getId());
		
		String contextName1 = c.createNewContext();
		Context context1 = c.getContextFromName(contextName1);
		
		
		c.selectFeatureFromDomainElementInContext("RendererMosaic", "renderer", contextName1);
		c.selectFeatureFromDomainElementInContext("Picasa", "source", contextName1);
		
		System.out.println("(Step2) CPS of local context : ");
		for (ConfigurationProcessStep cpss : context1.getCPS())
			System.out.println(cpss);
		
		System.out.println("(Step2) CPS of global context : ");
		for (ConfigurationProcessStep cpss : c.getGlobalContext().getCPS())
			System.out.println(cpss);
		
		System.out.println("Step3 : select Day (renderer) in a new context");
		String contextName2 = c.createNewContext();
		c.selectFeatureFromDomainElementInContext("RendererCalendarByDay", "renderer", contextName2);
		
		System.out.println("(Step3) CPS of global context : ");
		for (ConfigurationProcessStep cpss : c.getGlobalContext().getCPS())
			System.out.println(cpss);
		
		System.out.println("(Step3) CPS of local context : ");
		Context context2 = c.getContextFromName(contextName2);
		for (ConfigurationProcessStep cpss : context1.getCPS())
			System.out.println(cpss);
		for (ConfigurationProcessStep cpss : context2.getCPS())
			System.out.println(cpss);
		try {
			c.saveModels("/tmp/testmodel");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.exit();
		*/
	}
}
