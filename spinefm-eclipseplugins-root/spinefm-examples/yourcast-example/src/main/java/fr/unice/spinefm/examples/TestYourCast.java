package fr.unice.spinefm.examples;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext;
import fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate;
import fr.unice.spinefm.ActionModel.UserActionModel.UserInit;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

public class TestYourCast {
	private static void operationResult(boolean b, String operationName) {
		if (b)
			System.out.println(operationName+" effectué avec succès !");
		else
			System.out.println("Erreur dans l'opération : "+operationName);
	}
	
	public static void main(String args[]) throws ElementNotFoundException, FatalSpineFMException {
		UserInit ui = UserActionModelFactory.eINSTANCE.createUserInit();
		ui.setFilePath("./resources/yourcast/MultipleSoftwareProductLine.xmi");
		ui.setRootPath("./resources/yourcast/");
		ui.apply();
		
		ContextManager cm = (ContextManager)ui.getResult();
		
		UserCreateContext ucc = UserActionModelFactory.eINSTANCE.createUserCreateContext();
		ucc.initManualAction(cm);
		ucc.apply();
		System.out.println("Number of ctx : "+cm.getLocalContexts().size());
		
		System.out.println(ucc.getStep().getDescription());
		Step s = ucc.getStep();
		System.out.println("Actions launched : "+s.getLaunchedActions().size());
		cm.getPast().undoLastAction();
		System.out.println("Remaining size : "+s.getLaunchedActions().size());
		System.out.println("Number of ctx : "+cm.getLocalContexts().size());
		//System.out.println(RoassalTracer.trace(c.getMspl()));
		
		/*System.out.println("Scénario de configuration 1");
		String contextName1 = c.createNewContext();
		boolean b;
	
		c.selectFeatureFromDomainElementInContext("Twitter", "source", contextName1);
	
		c.selectFeatureFromDomainElementInContext("Filter", "source", contextName1);
		
		Configuration configSource = c.validConfigurationOfDomainElementFromContext("source", contextName1);
		operationResult((configSource != null),"Configuration Picasa");
		
		c.selectFeatureFromDomainElementInContext("Thumbnails", "renderer", contextName1);
		
		c.selectFeatureFromDomainElementInContext("Logo", "renderer", contextName1);
		
		Configuration configRenderer = c.validConfigurationOfDomainElementFromContext("renderer", contextName1);
		operationResult((configRenderer != null),"Configuration Renderer MosaicAlbum");
		
		c.selectFeatureFromDomainElementInContext("BigSquareCenter", "zone", contextName1);
		
		Configuration configZone = c.validConfigurationOfDomainElementFromContext("zone", contextName1);
		operationResult((configZone != null),"Configuration Zone Center");
		
		c.selectFeatureFromDomainElementInContext("LayoutEPU", "layout", "gc");
		
		Configuration configLayout = c.validConfigurationOfDomainElementFromContext("layout", "gc");
		operationResult((configLayout != null),"Configuration Layout");
		
		c.selectFeatureFromDomainElementInContext("AppearanceBehaviour", "behaviour", contextName1);
		
		c.selectFeatureFromDomainElementInContext("Unique", "behaviour", contextName1);
		
		c.selectFeatureFromDomainElementInContext("Graphic", "behaviour", contextName1);
		
		Configuration configBehaviour = c.validConfigurationOfDomainElementFromContext("behaviour", contextName1);
		operationResult((configBehaviour != null),"Configuration Behaviour");
		
		DEAssociation sourceRenderer = c.getAssociationsForSourceAndTarget("source", "renderer").get(0);
		c.linkConfigurations(configSource, configRenderer, sourceRenderer);
		
		DEAssociation rendererZone = c.getAssociationsForSourceAndTarget("renderer", "zone").get(0);
		c.linkConfigurations(configRenderer, configZone, rendererZone);
		
		DEAssociation behaviourZone = c.getAssociationsForSourceAndTarget("behaviour", "zone").get(0);
		c.linkConfigurations(configBehaviour, configZone, behaviourZone);
		
		DEAssociation layoutZone = c.getAssociationsForSourceAndTarget("layout", "zone").get(0);
		c.linkConfigurations(configLayout, configZone, layoutZone);
		
		c.saveModels();
		*/
	}
}
