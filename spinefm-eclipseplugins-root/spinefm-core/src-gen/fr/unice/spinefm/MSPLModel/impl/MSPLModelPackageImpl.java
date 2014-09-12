/**
 */
package fr.unice.spinefm.MSPLModel.impl;

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

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelFactory;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;
import fr.unice.spinefm.MSPLModel.MultiplicityElement;

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
public class MSPLModelPackageImpl extends EPackageImpl implements MSPLModelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleSoftwareProductLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deAssociationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementEClass = null;

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
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MSPLModelPackageImpl()
	{
		super(eNS_URI, MSPLModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MSPLModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MSPLModelPackage init()
	{
		if (isInited) return (MSPLModelPackage)EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI);

		// Obtain or create and register package
		MSPLModelPackageImpl theMSPLModelPackage = (MSPLModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MSPLModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MSPLModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FMModelPackageImpl theFMModelPackage = (FMModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) instanceof FMModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI) : FMModelPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI) : ExceptionsPackage.eINSTANCE);
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
		RFModelPackageImpl theRFModelPackage = (RFModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) instanceof RFModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) : RFModelPackage.eINSTANCE);

		// Create package meta-data objects
		theMSPLModelPackage.createPackageContents();
		theFMModelPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
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
		theRFModelPackage.createPackageContents();

		// Initialize created meta-data
		theMSPLModelPackage.initializePackageContents();
		theFMModelPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
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
		theRFModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMSPLModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MSPLModelPackage.eNS_URI, theMSPLModelPackage);
		return theMSPLModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleSoftwareProductLine()
	{
		return multipleSoftwareProductLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleSoftwareProductLine_DomainElements()
	{
		return (EReference)multipleSoftwareProductLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleSoftwareProductLine_Associations()
	{
		return (EReference)multipleSoftwareProductLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleSoftwareProductLine_Id()
	{
		return (EAttribute)multipleSoftwareProductLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEAssociation()
	{
		return deAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEAssociation_RestrictionFunction()
	{
		return (EReference)deAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEAssociation_Extremity()
	{
		return (EReference)deAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAssociation_Id()
	{
		return (EAttribute)deAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement()
	{
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_LowerBound()
	{
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_UpperBound()
	{
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Id()
	{
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEAssociationEnd()
	{
		return deAssociationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEAssociationEnd_LinkMultiplicity()
	{
		return (EReference)deAssociationEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEAssociationEnd_Apply_on()
	{
		return (EReference)deAssociationEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAssociationEnd_Id()
	{
		return (EAttribute)deAssociationEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainElement()
	{
		return domainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainElement_MultiplicityElement()
	{
		return (EReference)domainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainElement_Refers_on()
	{
		return (EReference)domainElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainElement_Belongs_to()
	{
		return (EReference)domainElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainElement_Id()
	{
		return (EAttribute)domainElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSPLModelFactory getMSPLModelFactory()
	{
		return (MSPLModelFactory)getEFactoryInstance();
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
		multipleSoftwareProductLineEClass = createEClass(MULTIPLE_SOFTWARE_PRODUCT_LINE);
		createEReference(multipleSoftwareProductLineEClass, MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS);
		createEReference(multipleSoftwareProductLineEClass, MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS);
		createEAttribute(multipleSoftwareProductLineEClass, MULTIPLE_SOFTWARE_PRODUCT_LINE__ID);

		deAssociationEClass = createEClass(DE_ASSOCIATION);
		createEReference(deAssociationEClass, DE_ASSOCIATION__RESTRICTION_FUNCTION);
		createEReference(deAssociationEClass, DE_ASSOCIATION__EXTREMITY);
		createEAttribute(deAssociationEClass, DE_ASSOCIATION__ID);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_BOUND);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_BOUND);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__ID);

		deAssociationEndEClass = createEClass(DE_ASSOCIATION_END);
		createEReference(deAssociationEndEClass, DE_ASSOCIATION_END__LINK_MULTIPLICITY);
		createEReference(deAssociationEndEClass, DE_ASSOCIATION_END__APPLY_ON);
		createEAttribute(deAssociationEndEClass, DE_ASSOCIATION_END__ID);

		domainElementEClass = createEClass(DOMAIN_ELEMENT);
		createEReference(domainElementEClass, DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT);
		createEReference(domainElementEClass, DOMAIN_ELEMENT__REFERS_ON);
		createEReference(domainElementEClass, DOMAIN_ELEMENT__BELONGS_TO);
		createEAttribute(domainElementEClass, DOMAIN_ELEMENT__ID);
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
		fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage theExceptionsPackage_1 = (fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.MSPLModel.exceptions.ExceptionsPackage.eNS_URI);
		RFModelPackage theRFModelPackage = (RFModelPackage)EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI);
		SystemActionModelPackage theSystemActionModelPackage = (SystemActionModelPackage)EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI);
		ProcessModelPackage theProcessModelPackage = (ProcessModelPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessModelPackage.eNS_URI);
		fr.unice.spinefm.exceptions.ExceptionsPackage theExceptionsPackage_5 = (fr.unice.spinefm.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI);
		ExceptionsPackage theExceptionsPackage = (ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExceptionsPackage.eNS_URI);
		FMModelPackage theFMModelPackage = (FMModelPackage)EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExceptionsPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(multipleSoftwareProductLineEClass, MultipleSoftwareProductLine.class, "MultipleSoftwareProductLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleSoftwareProductLine_DomainElements(), this.getDomainElement(), null, "domainElements", null, 1, -1, MultipleSoftwareProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMultipleSoftwareProductLine_Associations(), this.getDEAssociation(), null, "associations", null, 0, -1, MultipleSoftwareProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultipleSoftwareProductLine_Id(), ecorePackage.getEString(), "id", null, 1, 1, MultipleSoftwareProductLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(multipleSoftwareProductLineEClass, this.getDomainElement(), "getDomainElementByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		op = addEOperation(multipleSoftwareProductLineEClass, this.getDEAssociation(), "getValidAssociationsForDEs", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDomainElement(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainElement(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDEAssociationNotFoundException());

		op = addEOperation(multipleSoftwareProductLineEClass, this.getDEAssociation(), "getAssociationByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "assoName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDEAssociationNotFoundException());

		initEClass(deAssociationEClass, DEAssociation.class, "DEAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEAssociation_RestrictionFunction(), theRFModelPackage.getRestrictionFunction(), null, "restrictionFunction", null, 0, -1, DEAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDEAssociation_Extremity(), this.getDEAssociationEnd(), null, "extremity", null, 2, 2, DEAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAssociation_Id(), ecorePackage.getEString(), "id", null, 1, 1, DEAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(deAssociationEClass, theSystemActionModelPackage.getActionOnFM(), "computeActionsToDo", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theProcessModelPackage.getConfigurationProcessStep(), "CPSSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theProcessModelPackage.getConfigurationProcessStep(), "CPSTarget", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_5.getIllegalCallException());

		op = addEOperation(deAssociationEClass, null, "createAndAssociateInverseAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage.getFeatureNotFoundException());

		op = addEOperation(deAssociationEClass, ecorePackage.getEBoolean(), "isLinkBetweenDEs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainElement(), "firstExtremity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainElement(), "secondExtremity", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(deAssociationEClass, this.getDEAssociationEnd(), "getOppositeExtremity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainElement(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		op = addEOperation(deAssociationEClass, this.getDEAssociationEnd(), "getExtremityOfDE", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDomainElement(), "de", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_1.getDomainElementNotFoundException());

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, ecorePackage.getEBoolean(), "respectBoundaries", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(multiplicityElementEClass, ecorePackage.getEBoolean(), "isExactlyOne", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, ecorePackage.getEBoolean(), "isLowerThanUpperBound", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deAssociationEndEClass, DEAssociationEnd.class, "DEAssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEAssociationEnd_LinkMultiplicity(), this.getMultiplicityElement(), null, "LinkMultiplicity", null, 1, 1, DEAssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEAssociationEnd_Apply_on(), this.getDomainElement(), null, "apply_on", null, 1, 1, DEAssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAssociationEnd_Id(), ecorePackage.getEString(), "id", null, 0, 1, DEAssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainElementEClass, DomainElement.class, "DomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainElement_MultiplicityElement(), this.getMultiplicityElement(), null, "MultiplicityElement", null, 1, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainElement_Refers_on(), theFMModelPackage.getFeatureModel(), null, "refers_on", null, 1, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainElement_Belongs_to(), this.getDEAssociation(), null, "belongs_to", null, 0, -1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDomainElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, DomainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MSPLModelPackageImpl
