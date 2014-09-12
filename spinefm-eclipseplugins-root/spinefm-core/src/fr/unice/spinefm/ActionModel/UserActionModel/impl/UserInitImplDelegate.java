package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory;
import fr.unice.spinefm.ActionModel.UserActionModel.UserInit;
import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.FMModel.FMModelFactory;
import fr.unice.spinefm.FMModel.FeatureModel;
import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;
import fr.unice.spinefm.FMModel.impl.FeatureModelImplDelegate;
import fr.unice.spinefm.HistoryModel.HistoryModelFactory;
import fr.unice.spinefm.HistoryModel.HistoryModelPackage;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;
import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.core.Constants;
import fr.unice.spinefm.core.InitUtils;
import fr.unice.spinefm.core.ModelInstancesFactory;
import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;
import fr.unice.spinefm.exceptions.RootPathNotSetException;
import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.SpecificInterpreter;
import fr.unice.spinefm.fmengine.exceptions.FMEngineException;
import fr.unice.spinefm.fmengine.familiar.FMLSpineFMAdapter;
import fr.unice.spinefm.fmengine.familiar.FamiliarInterpreter;
import fr.unice.spinefm.restfunc.RestrictionFunctionParser;
import fr.unice.spinefm.restfunc.RuleFactory;
import fr.unice.spinefm.restfunc.exceptions.RestrictionFunctionParserException;
import fr.unice.spinefm.restfunc.exceptions.RuleFactoryException;
import fr.unice.spinefm.stats.StatsFactory;
import fr.unice.spinefm.utils.Debug;
import fr.unice.spinefm.utils.PersistModel;
import fr.unice.spinefm.utils.Utils;

public class UserInitImplDelegate extends UserInitImpl {

	private static Logger log = Logger.getLogger(UserInitImplDelegate.class);
	private MultipleSoftwareProductLine mspl;
	private SpecificInterpreter sfi;
	private FMSpineFMAdapter fma;
	private CompositeConfiguration compconfig;
	private StatsFactory statsFactory;
	private Past pastActions;
	
	@Override
	public void apply() throws ElementNotFoundException, FatalSpineFMException {
		log.info("\n\n\t\t Apply user action Init with model path "+this.getFilePath()+"\n\n");
		this.initPast();
	}
	
	private void initPast() throws ElementNotFoundException, FatalSpineFMException {
		MSPLModelPackage.eINSTANCE.eClass();
		
		Debug.setSaveScript(true);
		Debug.setDisplayScript(false);
		
		String rootPath = Utils.getDirectoryFromModelPath(this.getFilePath());
		
		if (this.getPastPath() == null) {
			if (this.getFilePath() != null && rootPath != null) {
				String instanceID = UUID.randomUUID().toString().replace("-", "");
				this.pastActions = HistoryModelFactory.eINSTANCE.createPast();
				this.pastActions.setId(instanceID);
				this.pastActions.setModelPath(this.getFilePath());
				this.pastActions.setRootPath(rootPath);
				this.pastActions.setDescription(this.getConfDescription());
			} else {
				throw new ElementNotFoundException("Root path and file path must be given to init the system.");
			}
		} else {
			this.pastActions = PersistModel.loadModel(this.getPastPath(), HistoryModelPackage.eINSTANCE);
			String instanceID = UUID.randomUUID().toString().replace("-", "");
			this.pastActions.setId(instanceID);
		}
		
		this.initFromPast();
	}
	
	private void redoActionsFromPast() throws ElementNotFoundException, FatalSpineFMException {
		if (this.getPastPath() != null) {
			for (Step s : this.pastActions.getSteps()) {
				UserAction ua = s.getLaunchingAction();
				ua.setContextManager(this.contextManager);
				ua.apply();
			}
		}
	}

	private void initFromPast() throws FatalSpineFMException, ElementNotFoundException {
		if (this.pastActions == null)
			throw new FatalSpineFMException("Method initPast must be called first !",this.getContextManager().getPast(),this.getStep());
		boolean verbose = true;
		
		this.mspl = PersistModel.loadModel(this.pastActions.getModelPath(), MSPLModelPackage.eINSTANCE);
		this.sfi = FamiliarInterpreter.getInstance();
		this.sfi.setVerbose(verbose);
		Logger.getRootLogger().setLevel(Level.INFO);
		if (verbose)
			Logger.getLogger("fr.unice.spinefm").setLevel(Level.DEBUG);
		this.initAssociations();
		this.fma = new FMLSpineFMAdapter((FamiliarInterpreter) this.sfi);


		try {
			log.info("Debut de l'initialisation des FMs");
			this.initFeatureModels(this.pastActions.getRootPath(), this.pastActions.getId());
			log.info("Fin de l'initialisation des FMs");
			
			log.info("Debut de l'initialisation des regles");
			this.initRules(this.pastActions.getRootPath());
			log.info("Fin de l'initialisation des regles");
			
			log.info("Debut de l'initialisation des associations");
			this.initInverseAssociations();
			log.info("Fin de l'initialisation des associations");
			
			log.info("Debut de l'initialisation du contexte manager");
			this.initContextManager(this.pastActions.getId());
			log.info("Fin de l'initialisation des contextes");
			
			log.info("Debut de l'initialisation de la config composite");
			this.initCompositeConfiguration();
			log.info("Fin de l'initialisation de la config composite");
			
			
			this.setResult(this.getContextManager());
			
			log.info("Debut de l'application des anciennes actions");
			this.redoActionsFromPast();
			log.info("Fin de l'application des anciennes actions");
		} catch (FeatureNotFoundException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (RootPathNotSetException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (DomainElementNotFoundException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (FMEngineException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (IOException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		} catch (CPSNotFoundException e) {
			e.printStackTrace();
			throw new FatalSpineFMException(e.getMessage(),this.getContextManager().getPast(),this.getStep());
		}

		//this.validateModel();

		//log.info(RoassalTracer.trace(this.mspl));

	}

	private void initAssociations() {
		for (DEAssociation asso : this.mspl.getAssociations()) {
			DomainElement source = asso.getExtremity().get(0).getApply_on();
			DomainElement target = asso.getExtremity().get(1).getApply_on();

			if (!source.getBelongs_to().contains(asso)) {
				source.getBelongs_to().add(asso);
			}
			if (!target.getBelongs_to().contains(asso)) {
				target.getBelongs_to().add(asso);
			}
		}
	}

	private void initInverseAssociations() {
		List<DEAssociation> inverseAsso = new ArrayList<DEAssociation>();
		for (DEAssociation dea : this.mspl.getAssociations()) {
			try {
				dea.createAndAssociateInverseAssociation();
			} catch (FeatureNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.mspl.getAssociations().addAll(inverseAsso);
	}

	private void validateModel() throws FatalSpineFMException {
		Diagnostic diag = Diagnostician.INSTANCE.validate(this.mspl);

		if (diag.getSeverity() != Diagnostic.OK) {
			String messages = "";
			for (Diagnostic d : diag.getChildren()) {
				messages += d.getMessage()+"\n";
			}
			log.info("Model diagnostic :\n"+messages);
			throw new FatalSpineFMException("Errors when loading the model.",this.getContextManager().getPast(),this.getStep());
		}
	}

	private void initContextManager(String instanceID) throws FMEngineException, ElementNotFoundException {
		ContextManager cm = ProcessModelFactory.eINSTANCE.createContextManager();
		cm.setId(instanceID);
		cm.setFma(this.fma);
		cm.setMspl(this.mspl);
		cm.setPast(this.pastActions);
		this.setContextManager(cm);
		this.getContextManager().init(this.getStep());
	}

	private void initCompositeConfiguration() {
		this.compconfig = ConfigurationModelFactory.eINSTANCE.createCompositeConfiguration();
		this.getContextManager().getGlobalContext().setConfiguration(this.compconfig);
		this.compconfig.setMspl(this.mspl);
	}

	private void initFeatureModels(String rootPath, String instanceID) throws FileNotFoundException, FMEngineException, IOException {
		ModelInstancesFactory.createModelInstance(this.mspl, this.sfi, rootPath);
		
		for (DomainElement de : this.mspl.getDomainElements()) {
		//for (int i = l.size()-1; i >= 0; i--) {
			//DomainElement de = l.get(i);
			if (de.getRefers_on() == null) {
				String fmID = InitUtils.getFMID(de, mspl);
				String targetID = InitUtils.getElementNameFromInstanceId(fmID, instanceID);
				this.fma.copyElement(fmID, targetID);
				FeatureModel fmde = FMModelFactory.eINSTANCE.createFeatureModel();
				fmde.setId(targetID);
				fmde.setName(de.getId());
				this.fma.populateFeatureModel(fmde);
				((FeatureModelImplDelegate)fmde).setRepresentation(this.fma.getRepresentationOfFeatureModel(fmde));
				de.setRefers_on(fmde);
			}
		}
	}

	private void initRules(String rootPath) throws RootPathNotSetException, RestrictionFunctionParserException, FeatureNotFoundException, RuleFactoryException, DomainElementNotFoundException {
		RestrictionFunctionParser rfp = new RestrictionFunctionParser();
		for (DEAssociation dea : this.mspl.getAssociations()) {
			List<String> listOfRfPathName = InitUtils.getRestrictionFunctionsFromAssociationDir(dea, rootPath);

			for (String rfPathName : listOfRfPathName) {
				RestrictionFunction rf = RFModelFactory.eINSTANCE.createRestrictionFunction();
				rf.setId(InitUtils.getRestrictionFunctionIdFromPathName(rfPathName));
				RuleFactory.createRuleAndPutItInModel(rf, dea, rfPathName, rfp, this.mspl);
			}

		}
	}

	@Override
	public String getDescription() {
		return "Initialize the system at "+Calendar.getInstance().toString()+" by "+this.getConfDescription();
	}
	
	@Override
	public UserAction cloneActionWithStringAttributes() {
		UserInit result = UserActionModelFactory.eINSTANCE.createUserInit();
		result.setFilePath(this.getFilePath());
		return result;
	}
}
