/**
 */
package fr.unice.spinefm.ConfigurationModel.impl;

import fr.unice.spinefm.ActionModel.ActionModelPackage;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;

import fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl;

import fr.unice.spinefm.ActionModel.impl.ActionModelPackageImpl;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;
import fr.unice.spinefm.ConfigurationModel.Link;

import fr.unice.spinefm.FMModel.FMModelPackage;

import fr.unice.spinefm.FMModel.exceptions.ExceptionsPackage;

import fr.unice.spinefm.FMModel.exceptions.impl.ExceptionsPackageImpl;

import fr.unice.spinefm.FMModel.impl.FMModelPackageImpl;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;

import fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl;

import fr.unice.spinefm.MSPLModel.MSPLModelPackage;

import fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl;

import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl;

import fr.unice.spinefm.RFModel.RFModelPackage;

import fr.unice.spinefm.RFModel.impl.RFModelPackageImpl;

import fr.unice.spinefm.fmengine.FmenginePackage;

import fr.unice.spinefm.fmengine.impl.FmenginePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ConfigurationModelPackageImpl extends EPackageImpl implements ConfigurationModelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConfigurationEClass = null;

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
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationModelPackageImpl()
	{
		super(eNS_URI, ConfigurationModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationModelPackage init()
	{
		if (isInited) return (ConfigurationModelPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationModelPackageImpl theConfigurationModelPackage = (ConfigurationModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FMModelPackageImpl theFMModelPackage = (FMModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) instanceof FMModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) : FMModelPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
		MSPLModelPackageImpl theMSPLModelPackage = (MSPLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI) instanceof MSPLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI) : MSPLModelPackage.eINSTANCE);
		fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_1 = (fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eINSTANCE);
		fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_2 = (fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eINSTANCE);
		ProcessModelPackageImpl theProcessModelPackage = (ProcessModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProcessModelPackage.eNS_URI) instanceof ProcessModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProcessModelPackage.eNS_URI) : ProcessModelPackage.eINSTANCE);
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
		theConfigurationModelPackage.createPackageContents();
		theFMModelPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theMSPLModelPackage.createPackageContents();
		theExceptionsPackage_1.createPackageContents();
		theExceptionsPackage_2.createPackageContents();
		theProcessModelPackage.createPackageContents();
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
		theConfigurationModelPackage.initializePackageContents();
		theFMModelPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theMSPLModelPackage.initializePackageContents();
		theExceptionsPackage_1.initializePackageContents();
		theExceptionsPackage_2.initializePackageContents();
		theProcessModelPackage.initializePackageContents();
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
		theConfigurationModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationModelPackage.eNS_URI, theConfigurationModelPackage);
		return theConfigurationModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration()
	{
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_CPSRef()
	{
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Id()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Belongs_to()
	{
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_State()
	{
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Description()
	{
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_DomainElement()
	{
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ClonedCPS()
	{
		return (EReference)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink()
	{
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Source()
	{
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_RelatedAssociation()
	{
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Target()
	{
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Id()
	{
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeConfiguration()
	{
		return compositeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeConfiguration_SubConfigurations()
	{
		return (EReference)compositeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeConfiguration_Links()
	{
		return (EReference)compositeConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeConfiguration_Name()
	{
		return (EAttribute)compositeConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeConfiguration_Mspl()
	{
		return (EReference)compositeConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeConfiguration_Description()
	{
		return (EAttribute)compositeConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationModelFactory getConfigurationModelFactory()
	{
		return (ConfigurationModelFactory)getEFactoryInstance();
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__CPS_REF);
		createEAttribute(configurationEClass, CONFIGURATION__ID);
		createEReference(configurationEClass, CONFIGURATION__BELONGS_TO);
		createEReference(configurationEClass, CONFIGURATION__STATE);
		createEAttribute(configurationEClass, CONFIGURATION__DESCRIPTION);
		createEReference(configurationEClass, CONFIGURATION__DOMAIN_ELEMENT);
		createEReference(configurationEClass, CONFIGURATION__CLONED_CPS);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SOURCE);
		createEReference(linkEClass, LINK__RELATED_ASSOCIATION);
		createEReference(linkEClass, LINK__TARGET);
		createEAttribute(linkEClass, LINK__ID);

		compositeConfigurationEClass = createEClass(COMPOSITE_CONFIGURATION);
		createEReference(compositeConfigurationEClass, COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS);
		createEReference(compositeConfigurationEClass, COMPOSITE_CONFIGURATION__LINKS);
		createEAttribute(compositeConfigurationEClass, COMPOSITE_CONFIGURATION__NAME);
		createEReference(compositeConfigurationEClass, COMPOSITE_CONFIGURATION__MSPL);
		createEAttribute(compositeConfigurationEClass, COMPOSITE_CONFIGURATION__DESCRIPTION);
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
		fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage theExceptionsPackage_2 = (fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage.eNS_URI);
		ProcessModelPackage theProcessModelPackage = (ProcessModelPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessModelPackage.eNS_URI);
		RFModelPackage theRFModelPackage = (RFModelPackage)EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI);
		MSPLModelPackage theMSPLModelPackage = (MSPLModelPackage)EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI);
		fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage theExceptionsPackage_1 = (fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI);
		FMModelPackage theFMModelPackage = (FMModelPackage)EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI);
		fr.unice.spinefm.exceptions.ExceptionsPackage theExceptionsPackage_5 = (fr.unice.spinefm.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI);
		fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage theExceptionsPackage_4 = (fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI);
		fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage theExceptionsPackage_3 = (fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.ProcessModel.exceptions.ExceptionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExceptionsPackage_2);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_CPSRef(), theProcessModelPackage.getConfigurationProcessStep(), theProcessModelPackage.getConfigurationProcessStep_Configuration(), "CPSRef", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Id(), ecorePackage.getEString(), "id", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Belongs_to(), this.getLink(), null, "belongs_to", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_State(), theRFModelPackage.getConfigurationState(), null, "state", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_DomainElement(), theMSPLModelPackage.getDomainElement(), null, "domainElement", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_ClonedCPS(), theProcessModelPackage.getConfigurationProcessStep(), null, "clonedCPS", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(configurationEClass, ecorePackage.getEBoolean(), "canBeLinked", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMSPLModelPackage.getDEAssociation(), "association", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		addEOperation(configurationEClass, theFMModelPackage.getFeatureModel(), "getFeatureModel", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurationEClass, this.getConfiguration(), "getLinkedConfigurationsOfDomainElement", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theMSPLModelPackage.getDomainElement(), "de", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_2.getConfigNotFoundException());

		op = addEOperation(configurationEClass, ecorePackage.getEBoolean(), "isCompletlyLinked", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_2.getConfigNotFoundException());
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		addEOperation(configurationEClass, theProcessModelPackage.getConfigurationProcessStep(), "getAllCPS", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Source(), this.getConfiguration(), null, "source", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_RelatedAssociation(), theMSPLModelPackage.getDEAssociation(), null, "relatedAssociation", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getConfiguration(), null, "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Id(), ecorePackage.getEString(), "id", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(linkEClass, this.getConfiguration(), "getAssociatedConfiguration", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfiguration(), "conf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_2.getConfigNotFoundException());

		initEClass(compositeConfigurationEClass, CompositeConfiguration.class, "CompositeConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeConfiguration_SubConfigurations(), this.getConfiguration(), null, "subConfigurations", null, 0, -1, CompositeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompositeConfiguration_Links(), this.getLink(), null, "links", null, 0, -1, CompositeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompositeConfiguration_Name(), ecorePackage.getEString(), "name", null, 1, 1, CompositeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeConfiguration_Mspl(), theMSPLModelPackage.getMultipleSoftwareProductLine(), null, "mspl", null, 1, 1, CompositeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeConfiguration_Description(), ecorePackage.getEString(), "description", null, 1, 1, CompositeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(compositeConfigurationEClass, ecorePackage.getEBoolean(), "isValid", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		op = addEOperation(compositeConfigurationEClass, null, "addConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfiguration(), "conf", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compositeConfigurationEClass, this.getConfiguration(), "getConfigurationByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "confName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_2.getConfigNotFoundException());

		op = addEOperation(compositeConfigurationEClass, null, "createConfigurationLink", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfiguration(), "confSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfiguration(), "confTarget", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMSPLModelPackage.getDEAssociation(), "asso", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_2.getInvalidAssociationException());
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		op = addEOperation(compositeConfigurationEClass, this.getConfiguration(), "getCompatibleConfigurations", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getConfiguration(), "confSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMSPLModelPackage.getDEAssociation(), "asso", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_2.getInvalidAssociationException());
		addEException(op, theExceptionsPackage_5.getIllegalCallException());
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_3.getCPSNotFoundException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigurationModelPackageImpl
