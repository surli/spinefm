/**
 */
package fr.unice.spinefm.ProcessModel.impl;

import fr.unice.spinefm.ActionModel.ActionModelPackage;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;

import fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl;

import fr.unice.spinefm.ActionModel.impl.ActionModelPackageImpl;

import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;

import fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl;

import fr.unice.spinefm.FMModel.FMModelPackage;

import fr.unice.spinefm.FMModel.exceptions.ExceptionsPackage;

import fr.unice.spinefm.FMModel.exceptions.impl.ExceptionsPackageImpl;

import fr.unice.spinefm.FMModel.impl.FMModelPackageImpl;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;

import fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl;

import fr.unice.spinefm.MSPLModel.MSPLModelPackage;

import fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl;

import fr.unice.spinefm.ProcessModel.CPSStatus;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.DeletedContextInformations;
import fr.unice.spinefm.ProcessModel.GlobalContext;
import fr.unice.spinefm.ProcessModel.LocalContext;
import fr.unice.spinefm.ProcessModel.ProcessModelFactory;
import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import fr.unice.spinefm.RFModel.RFModelPackage;

import fr.unice.spinefm.RFModel.impl.RFModelPackageImpl;

import fr.unice.spinefm.fmengine.FmenginePackage;

import fr.unice.spinefm.fmengine.impl.FmenginePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessModelPackageImpl extends EPackageImpl implements ProcessModelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletedContextInformationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cpsStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessModelPackageImpl()
	{
		super(eNS_URI, ProcessModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProcessModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessModelPackage init()
	{
		if (isInited) return (ProcessModelPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessModelPackage.eNS_URI);

		// Obtain or create and register package
		ProcessModelPackageImpl theProcessModelPackage = (ProcessModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProcessModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProcessModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FMModelPackageImpl theFMModelPackage = (FMModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) instanceof FMModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) : FMModelPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
		MSPLModelPackageImpl theMSPLModelPackage = (MSPLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI) instanceof MSPLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI) : MSPLModelPackage.eINSTANCE);
		fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_1 = (fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eINSTANCE);
		ConfigurationModelPackageImpl theConfigurationModelPackage = (ConfigurationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI) instanceof ConfigurationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI) : ConfigurationModelPackage.eINSTANCE);
		fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_2 = (fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eINSTANCE);
		fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_3 = (fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage.eINSTANCE);
		FmenginePackageImpl theFmenginePackage = (FmenginePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FmenginePackage.eNS_URI) instanceof FmenginePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FmenginePackage.eNS_URI) : FmenginePackage.eINSTANCE);
		fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_4 = (fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eINSTANCE);
		fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_5 = (fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.exceptions.ExceptionsPackage.eINSTANCE);
		ActionModelPackageImpl theActionModelPackage = (ActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionModelPackage.eNS_URI) instanceof ActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionModelPackage.eNS_URI) : ActionModelPackage.eINSTANCE);
		SystemActionModelPackageImpl theSystemActionModelPackage = (SystemActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI) instanceof SystemActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI) : SystemActionModelPackage.eINSTANCE);
		UserActionModelPackageImpl theUserActionModelPackage = (UserActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserActionModelPackage.eNS_URI) instanceof UserActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserActionModelPackage.eNS_URI) : UserActionModelPackage.eINSTANCE);
		HistoryModelPackageImpl theHistoryModelPackage = (HistoryModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI) instanceof HistoryModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI) : HistoryModelPackage.eINSTANCE);
		RFModelPackageImpl theRFModelPackage = (RFModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) instanceof RFModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) : RFModelPackage.eINSTANCE);

		// Create package meta-data objects
		theProcessModelPackage.createPackageContents();
		theFMModelPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theMSPLModelPackage.createPackageContents();
		theExceptionsPackage_1.createPackageContents();
		theConfigurationModelPackage.createPackageContents();
		theExceptionsPackage_2.createPackageContents();
		theExceptionsPackage_3.createPackageContents();
		theFmenginePackage.createPackageContents();
		theExceptionsPackage_4.createPackageContents();
		theExceptionsPackage_5.createPackageContents();
		theActionModelPackage.createPackageContents();
		theSystemActionModelPackage.createPackageContents();
		theUserActionModelPackage.createPackageContents();
		theHistoryModelPackage.createPackageContents();
		theRFModelPackage.createPackageContents();

		// Initialize created meta-data
		theProcessModelPackage.initializePackageContents();
		theFMModelPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theMSPLModelPackage.initializePackageContents();
		theExceptionsPackage_1.initializePackageContents();
		theConfigurationModelPackage.initializePackageContents();
		theExceptionsPackage_2.initializePackageContents();
		theExceptionsPackage_3.initializePackageContents();
		theFmenginePackage.initializePackageContents();
		theExceptionsPackage_4.initializePackageContents();
		theExceptionsPackage_5.initializePackageContents();
		theActionModelPackage.initializePackageContents();
		theSystemActionModelPackage.initializePackageContents();
		theUserActionModelPackage.initializePackageContents();
		theHistoryModelPackage.initializePackageContents();
		theRFModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessModelPackage.eNS_URI, theProcessModelPackage);
		return theProcessModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationProcessStep()
	{
		return configurationProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationProcessStep_DomainElement()
	{
		return (EReference)configurationProcessStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProcessStep_Id()
	{
		return (EAttribute)configurationProcessStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProcessStep_Description()
	{
		return (EAttribute)configurationProcessStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationProcessStep_Context()
	{
		return (EReference)configurationProcessStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationProcessStep_Configuration()
	{
		return (EReference)configurationProcessStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProcessStep_UserConfig()
	{
		return (EAttribute)configurationProcessStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProcessStep_History()
	{
		return (EAttribute)configurationProcessStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationProcessStep_State()
	{
		return (EReference)configurationProcessStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationProcessStep_ActionsDone()
	{
		return (EReference)configurationProcessStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProcessStep_Status()
	{
		return (EAttribute)configurationProcessStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext()
	{
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_CPS()
	{
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_Id()
	{
		return (EAttribute)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalContext()
	{
		return globalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalContext_Configuration()
	{
		return (EReference)globalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalContext()
	{
		return localContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalContext_Configurations()
	{
		return (EReference)localContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextManager()
	{
		return contextManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_Mspl()
	{
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_GlobalContext()
	{
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_LocalContexts()
	{
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextManager_Fma()
	{
		return (EAttribute)contextManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextManager_Past()
	{
		return (EReference)contextManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextManager_Id()
	{
		return (EAttribute)contextManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletedContextInformations()
	{
		return deletedContextInformationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletedContextInformations_DeletedContext()
	{
		return (EAttribute)deletedContextInformationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeletedContextInformations_ReplacedBy()
	{
		return (EReference)deletedContextInformationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCPSStatus()
	{
		return cpsStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModelFactory getProcessModelFactory()
	{
		return (ProcessModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationProcessStepEClass = createEClass(CONFIGURATION_PROCESS_STEP);
		createEReference(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT);
		createEAttribute(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__ID);
		createEAttribute(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__DESCRIPTION);
		createEReference(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__CONTEXT);
		createEReference(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__CONFIGURATION);
		createEAttribute(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__USER_CONFIG);
		createEAttribute(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__HISTORY);
		createEReference(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__STATE);
		createEReference(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__ACTIONS_DONE);
		createEAttribute(configurationProcessStepEClass, CONFIGURATION_PROCESS_STEP__STATUS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CPS);
		createEAttribute(contextEClass, CONTEXT__ID);

		globalContextEClass = createEClass(GLOBAL_CONTEXT);
		createEReference(globalContextEClass, GLOBAL_CONTEXT__CONFIGURATION);

		localContextEClass = createEClass(LOCAL_CONTEXT);
		createEReference(localContextEClass, LOCAL_CONTEXT__CONFIGURATIONS);

		contextManagerEClass = createEClass(CONTEXT_MANAGER);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__MSPL);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__GLOBAL_CONTEXT);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__LOCAL_CONTEXTS);
		createEAttribute(contextManagerEClass, CONTEXT_MANAGER__FMA);
		createEReference(contextManagerEClass, CONTEXT_MANAGER__PAST);
		createEAttribute(contextManagerEClass, CONTEXT_MANAGER__ID);

		deletedContextInformationsEClass = createEClass(DELETED_CONTEXT_INFORMATIONS);
		createEAttribute(deletedContextInformationsEClass, DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT);
		createEReference(deletedContextInformationsEClass, DELETED_CONTEXT_INFORMATIONS__REPLACED_BY);

		// Create enums
		cpsStatusEEnum = createEEnum(CPS_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage theExceptionsPackage_3 = (fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage.eNS_URI);
		MSPLModelPackage theMSPLModelPackage = (MSPLModelPackage)EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI);
		ConfigurationModelPackage theConfigurationModelPackage = (ConfigurationModelPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI);
		RFModelPackage theRFModelPackage = (RFModelPackage)EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI);
		SystemActionModelPackage theSystemActionModelPackage = (SystemActionModelPackage)EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI);
		fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage theExceptionsPackage_4 = (fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI);
		FmenginePackage theFmenginePackage = (FmenginePackage)EPackage.Registry.INSTANCE.getEPackage(FmenginePackage.eNS_URI);
		HistoryModelPackage theHistoryModelPackage = (HistoryModelPackage)EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI);
		fr.unice.spinefm.exceptions.ExceptionsPackage theExceptionsPackage_5 = (fr.unice.spinefm.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI);
		FMModelPackage theFMModelPackage = (FMModelPackage)EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI);
		fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage theExceptionsPackage_1 = (fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExceptionsPackage_3);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		globalContextEClass.getESuperTypes().add(this.getContext());
		localContextEClass.getESuperTypes().add(this.getContext());

		// Initialize classes and features; add operations and parameters
		initEClass(configurationProcessStepEClass, ConfigurationProcessStep.class, "ConfigurationProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationProcessStep_DomainElement(), theMSPLModelPackage.getDomainElement(), null, "domainElement", null, 1, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProcessStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProcessStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationProcessStep_Context(), this.getContext(), null, "context", null, 1, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationProcessStep_Configuration(), theConfigurationModelPackage.getConfiguration(), theConfigurationModelPackage.getConfiguration_CPSRef(), "configuration", null, 0, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProcessStep_UserConfig(), ecorePackage.getEBoolean(), "userConfig", null, 1, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProcessStep_History(), ecorePackage.getEString(), "history", null, 1, -1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationProcessStep_State(), theRFModelPackage.getConfigurationState(), null, "state", null, 1, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationProcessStep_ActionsDone(), theSystemActionModelPackage.getActionOnFM(), null, "actionsDone", null, 0, -1, ConfigurationProcessStep.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProcessStep_Status(), this.getCPSStatus(), "status", null, 1, 1, ConfigurationProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(configurationProcessStepEClass, ecorePackage.getEBoolean(), "isComplete", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());

		op = addEOperation(configurationProcessStepEClass, ecorePackage.getEBoolean(), "alreadyHaveAction", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSystemActionModelPackage.getActionOnFM(), "a", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());

		addEOperation(configurationProcessStepEClass, ecorePackage.getEString(), "getConfName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurationProcessStepEClass, null, "setFMA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFmenginePackage.getFMSpineFMAdapter(), "fma", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());

		op = addEOperation(configurationProcessStepEClass, ecorePackage.getEBoolean(), "isMergeableWithCPS", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurationProcessStep(), "cps", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getIllegalCallException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		op = addEOperation(configurationProcessStepEClass, null, "mergeWithExternalCPS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurationProcessStep(), "confCPS", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextManager(), "cm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		op = addEOperation(configurationProcessStepEClass, null, "captureImplicitActions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSystemActionModelPackage.getActionOnFM(), "aof", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());

		op = addEOperation(configurationProcessStepEClass, null, "recordActionDone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSystemActionModelPackage.getActionOnFM(), "aof", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFMModelPackage.getFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurationProcessStepEClass, null, "setFeatureUnselected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFMModelPackage.getFeature(), "feature", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_CPS(), this.getConfigurationProcessStep(), null, "CPS", null, 1, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContext_Id(), ecorePackage.getEString(), "id", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(contextEClass, null, "addCPS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurationProcessStep(), "cps", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextEClass, this.getConfigurationProcessStep(), "getCPSOfDE", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMSPLModelPackage.getDomainElement(), "de", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_3.getCPSNotFoundException());

		op = addEOperation(contextEClass, null, "mergeExternalCPS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurationProcessStep(), "externalCPS", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContextManager(), "cm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		initEClass(globalContextEClass, GlobalContext.class, "GlobalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalContext_Configuration(), theConfigurationModelPackage.getCompositeConfiguration(), null, "configuration", null, 1, 1, GlobalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localContextEClass, LocalContext.class, "LocalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalContext_Configurations(), theConfigurationModelPackage.getConfiguration(), null, "configurations", null, 1, -1, LocalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contextManagerEClass, ContextManager.class, "ContextManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextManager_Mspl(), theMSPLModelPackage.getMultipleSoftwareProductLine(), null, "mspl", null, 1, 1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_GlobalContext(), this.getGlobalContext(), null, "globalContext", null, 1, 1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_LocalContexts(), this.getLocalContext(), null, "localContexts", null, 0, -1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContextManager_Fma(), theFmenginePackage.getFMSpineFMAdapter(), "fma", null, 1, 1, ContextManager.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextManager_Past(), theHistoryModelPackage.getPast(), null, "past", null, 1, 1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextManager_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContextManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(contextManagerEClass, null, "propagate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurationProcessStep(), "CPS", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getIllegalCallException());
		addEException(op, theExceptionsPackage_3.getCPSNotFoundException());
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		op = addEOperation(contextManagerEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		op = addEOperation(contextManagerEClass, this.getContext(), "createNewContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHistoryModelPackage.getStep(), "step", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		op = addEOperation(contextManagerEClass, this.getContext(), "getContextFromId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_3.getContextNotFoundException());

		op = addEOperation(contextManagerEClass, this.getContext(), "cloningExistingContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "contextSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_3.getCPSNotFoundException());

		op = addEOperation(contextManagerEClass, null, "removeContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextManagerEClass, null, "restoreContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contextManagerEClass, this.getConfigurationProcessStep(), "getCPSFromId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_3.getCPSNotFoundException());

		initEClass(deletedContextInformationsEClass, DeletedContextInformations.class, "DeletedContextInformations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeletedContextInformations_DeletedContext(), ecorePackage.getEString(), "deletedContext", null, 0, 1, DeletedContextInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeletedContextInformations_ReplacedBy(), this.getContext(), null, "replacedBy", null, 0, 1, DeletedContextInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cpsStatusEEnum, CPSStatus.class, "CPSStatus");
		addEEnumLiteral(cpsStatusEEnum, CPSStatus.PARTIALLY_CONFIGURED);
		addEEnumLiteral(cpsStatusEEnum, CPSStatus.CONFIGURED);
		addEEnumLiteral(cpsStatusEEnum, CPSStatus.UNCONFIGURABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessModelPackageImpl
