/**
 */
package fr.unice.spinefm.RFModel.impl;

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

import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl;

import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RFModelFactory;
import fr.unice.spinefm.RFModel.RFModelPackage;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.RFModel.Rule;

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
public class RFModelPackageImpl extends EPackageImpl implements RFModelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

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
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RFModelPackageImpl()
	{
		super(eNS_URI, RFModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RFModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RFModelPackage init()
	{
		if (isInited) return (RFModelPackage)EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI);

		// Obtain or create and register package
		RFModelPackageImpl theRFModelPackage = (RFModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RFModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RFModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FMModelPackageImpl theFMModelPackage = (FMModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) instanceof FMModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) : FMModelPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
		MSPLModelPackageImpl theMSPLModelPackage = (MSPLModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI) instanceof MSPLModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI) : MSPLModelPackage.eINSTANCE);
		fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_1 = (fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eINSTANCE);
		ConfigurationModelPackageImpl theConfigurationModelPackage = (ConfigurationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI) instanceof ConfigurationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI) : ConfigurationModelPackage.eINSTANCE);
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

		// Create package meta-data objects
		theRFModelPackage.createPackageContents();
		theFMModelPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theMSPLModelPackage.createPackageContents();
		theExceptionsPackage_1.createPackageContents();
		theConfigurationModelPackage.createPackageContents();
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

		// Initialize created meta-data
		theRFModelPackage.initializePackageContents();
		theFMModelPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theMSPLModelPackage.initializePackageContents();
		theExceptionsPackage_1.initializePackageContents();
		theConfigurationModelPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theRFModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RFModelPackage.eNS_URI, theRFModelPackage);
		return theRFModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictionFunction()
	{
		return restrictionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestrictionFunction_Id()
	{
		return (EAttribute)restrictionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionFunction_Rules()
	{
		return (EReference)restrictionFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionFunction_Inverse()
	{
		return (EReference)restrictionFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionFunction_Source()
	{
		return (EReference)restrictionFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestrictionFunction_Target()
	{
		return (EReference)restrictionFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationState()
	{
		return configurationStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationState_SelectedFeatures()
	{
		return (EReference)configurationStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationState_DeselectedFeatures()
	{
		return (EReference)configurationStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationState_Fm()
	{
		return (EReference)configurationStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationState_Id()
	{
		return (EAttribute)configurationStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule()
	{
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Action()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_State()
	{
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Id()
	{
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFModelFactory getRFModelFactory()
	{
		return (RFModelFactory)getEFactoryInstance();
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
		restrictionFunctionEClass = createEClass(RESTRICTION_FUNCTION);
		createEAttribute(restrictionFunctionEClass, RESTRICTION_FUNCTION__ID);
		createEReference(restrictionFunctionEClass, RESTRICTION_FUNCTION__RULES);
		createEReference(restrictionFunctionEClass, RESTRICTION_FUNCTION__INVERSE);
		createEReference(restrictionFunctionEClass, RESTRICTION_FUNCTION__SOURCE);
		createEReference(restrictionFunctionEClass, RESTRICTION_FUNCTION__TARGET);

		configurationStateEClass = createEClass(CONFIGURATION_STATE);
		createEReference(configurationStateEClass, CONFIGURATION_STATE__SELECTED_FEATURES);
		createEReference(configurationStateEClass, CONFIGURATION_STATE__DESELECTED_FEATURES);
		createEReference(configurationStateEClass, CONFIGURATION_STATE__FM);
		createEAttribute(configurationStateEClass, CONFIGURATION_STATE__ID);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__ACTION);
		createEReference(ruleEClass, RULE__STATE);
		createEAttribute(ruleEClass, RULE__ID);
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
		MSPLModelPackage theMSPLModelPackage = (MSPLModelPackage)EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI);
		ExceptionsPackage theExceptionsPackage = (ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI);
		FMModelPackage theFMModelPackage = (FMModelPackage)EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI);
		SystemActionModelPackage theSystemActionModelPackage = (SystemActionModelPackage)EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(restrictionFunctionEClass, RestrictionFunction.class, "RestrictionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestrictionFunction_Id(), ecorePackage.getEString(), "id", null, 1, 1, RestrictionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionFunction_Rules(), this.getRule(), null, "rules", null, 1, -1, RestrictionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestrictionFunction_Inverse(), this.getRestrictionFunction(), null, "inverse", null, 1, 1, RestrictionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionFunction_Source(), theMSPLModelPackage.getDomainElement(), null, "source", null, 1, 1, RestrictionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestrictionFunction_Target(), theMSPLModelPackage.getDomainElement(), null, "target", null, 1, 1, RestrictionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(restrictionFunctionEClass, this.getRestrictionFunction(), "createAndAssociateInverseRestFunc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage.getFeatureNotFoundException());

		initEClass(configurationStateEClass, ConfigurationState.class, "ConfigurationState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationState_SelectedFeatures(), theFMModelPackage.getFeature(), null, "selectedFeatures", null, 1, -1, ConfigurationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurationState_DeselectedFeatures(), theFMModelPackage.getFeature(), null, "deselectedFeatures", null, 0, -1, ConfigurationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurationState_Fm(), theFMModelPackage.getFeatureModel(), null, "fm", null, 1, 1, ConfigurationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationState_Id(), ecorePackage.getEString(), "id", null, 1, 1, ConfigurationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(configurationStateEClass, ecorePackage.getEBoolean(), "isIncludedIn", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurationState(), "otherState", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Action(), theSystemActionModelPackage.getActionOnFM(), null, "action", null, 1, 1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_State(), this.getConfigurationState(), null, "state", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ruleEClass, this.getRule(), "createInverseRule", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage.getFeatureNotFoundException());

		// Create resource
		createResource(eNS_URI);
	}

} //RFModelPackageImpl
