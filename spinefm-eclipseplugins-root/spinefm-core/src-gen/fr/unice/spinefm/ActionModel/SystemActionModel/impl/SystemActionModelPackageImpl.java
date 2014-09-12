/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.ActionModelPackage;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect;
import fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

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
public class SystemActionModelPackageImpl extends EPackageImpl implements SystemActionModelPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCreateConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCreateContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionMoveConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDeleteContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionOnFMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDeselectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionAddCTConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionAbstractRenameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRenameCPSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRenameConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRenameProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSetProductDescriptionEClass = null;

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
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemActionModelPackageImpl()
	{
		super(eNS_URI, SystemActionModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemActionModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemActionModelPackage init()
	{
		if (isInited) return (SystemActionModelPackage)EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI);

		// Obtain or create and register package
		SystemActionModelPackageImpl theSystemActionModelPackage = (SystemActionModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SystemActionModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SystemActionModelPackageImpl());

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
		UserActionModelPackageImpl theUserActionModelPackage = (UserActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserActionModelPackage.eNS_URI) instanceof UserActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserActionModelPackage.eNS_URI) : UserActionModelPackage.eINSTANCE);
		HistoryModelPackageImpl theHistoryModelPackage = (HistoryModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI) instanceof HistoryModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI) : HistoryModelPackage.eINSTANCE);
		RFModelPackageImpl theRFModelPackage = (RFModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) instanceof RFModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) : RFModelPackage.eINSTANCE);

		// Create package meta-data objects
		theSystemActionModelPackage.createPackageContents();
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
		theUserActionModelPackage.createPackageContents();
		theHistoryModelPackage.createPackageContents();
		theRFModelPackage.createPackageContents();

		// Initialize created meta-data
		theSystemActionModelPackage.initializePackageContents();
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
		theUserActionModelPackage.initializePackageContents();
		theHistoryModelPackage.initializePackageContents();
		theRFModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemActionModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemActionModelPackage.eNS_URI, theSystemActionModelPackage);
		return theSystemActionModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAction()
	{
		return systemActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAction_CpsHistory()
	{
		return (EAttribute)systemActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAction_Step()
	{
		return (EReference)systemActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemAction_Type()
	{
		return (EAttribute)systemActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionCreateConfiguration()
	{
		return actionCreateConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionCreateConfiguration_Cps()
	{
		return (EReference)actionCreateConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionCreateConfiguration_Compconf()
	{
		return (EReference)actionCreateConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionLink()
	{
		return actionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_ConfSource()
	{
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_ConfTarget()
	{
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_Asso()
	{
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_Link()
	{
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLink_ContextManager()
	{
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionCreateContext()
	{
		return actionCreateContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionCreateContext_ContextManager()
	{
		return (EReference)actionCreateContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionCreateContext_Context()
	{
		return (EReference)actionCreateContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionMoveConfiguration()
	{
		return actionMoveConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMoveConfiguration_Configuration()
	{
		return (EReference)actionMoveConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMoveConfiguration_CpsSource()
	{
		return (EReference)actionMoveConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMoveConfiguration_CpsTarget()
	{
		return (EReference)actionMoveConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDeleteContext()
	{
		return actionDeleteContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDeleteContext_ContextManager()
	{
		return (EReference)actionDeleteContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDeleteContext_Context()
	{
		return (EReference)actionDeleteContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionOnFM()
	{
		return actionOnFMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionOnFM_Fm()
	{
		return (EReference)actionOnFMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionOnFM_Cps()
	{
		return (EReference)actionOnFMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionOnFM_Fma()
	{
		return (EAttribute)actionOnFMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSelect()
	{
		return actionSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSelect_Feature()
	{
		return (EReference)actionSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDeselect()
	{
		return actionDeselectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDeselect_Feature()
	{
		return (EReference)actionDeselectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionAddCTConstraint()
	{
		return actionAddCTConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionAddCTConstraint_Constraint()
	{
		return (EReference)actionAddCTConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionAbstractRename()
	{
		return actionAbstractRenameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionAbstractRename_OldName()
	{
		return (EAttribute)actionAbstractRenameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionAbstractRename_NewName()
	{
		return (EAttribute)actionAbstractRenameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRenameCPS()
	{
		return actionRenameCPSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionRenameCPS_Cps()
	{
		return (EReference)actionRenameCPSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRenameConfig()
	{
		return actionRenameConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionRenameConfig_Config()
	{
		return (EReference)actionRenameConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRenameProduct()
	{
		return actionRenameProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionRenameProduct_Product()
	{
		return (EReference)actionRenameProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSetProductDescription()
	{
		return actionSetProductDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSetProductDescription_Product()
	{
		return (EReference)actionSetProductDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionModelFactory getSystemActionModelFactory()
	{
		return (SystemActionModelFactory)getEFactoryInstance();
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
		systemActionEClass = createEClass(SYSTEM_ACTION);
		createEAttribute(systemActionEClass, SYSTEM_ACTION__CPS_HISTORY);
		createEReference(systemActionEClass, SYSTEM_ACTION__STEP);
		createEAttribute(systemActionEClass, SYSTEM_ACTION__TYPE);

		actionCreateConfigurationEClass = createEClass(ACTION_CREATE_CONFIGURATION);
		createEReference(actionCreateConfigurationEClass, ACTION_CREATE_CONFIGURATION__CPS);
		createEReference(actionCreateConfigurationEClass, ACTION_CREATE_CONFIGURATION__COMPCONF);

		actionLinkEClass = createEClass(ACTION_LINK);
		createEReference(actionLinkEClass, ACTION_LINK__CONF_SOURCE);
		createEReference(actionLinkEClass, ACTION_LINK__CONF_TARGET);
		createEReference(actionLinkEClass, ACTION_LINK__ASSO);
		createEReference(actionLinkEClass, ACTION_LINK__LINK);
		createEReference(actionLinkEClass, ACTION_LINK__CONTEXT_MANAGER);

		actionCreateContextEClass = createEClass(ACTION_CREATE_CONTEXT);
		createEReference(actionCreateContextEClass, ACTION_CREATE_CONTEXT__CONTEXT_MANAGER);
		createEReference(actionCreateContextEClass, ACTION_CREATE_CONTEXT__CONTEXT);

		actionMoveConfigurationEClass = createEClass(ACTION_MOVE_CONFIGURATION);
		createEReference(actionMoveConfigurationEClass, ACTION_MOVE_CONFIGURATION__CONFIGURATION);
		createEReference(actionMoveConfigurationEClass, ACTION_MOVE_CONFIGURATION__CPS_SOURCE);
		createEReference(actionMoveConfigurationEClass, ACTION_MOVE_CONFIGURATION__CPS_TARGET);

		actionDeleteContextEClass = createEClass(ACTION_DELETE_CONTEXT);
		createEReference(actionDeleteContextEClass, ACTION_DELETE_CONTEXT__CONTEXT_MANAGER);
		createEReference(actionDeleteContextEClass, ACTION_DELETE_CONTEXT__CONTEXT);

		actionOnFMEClass = createEClass(ACTION_ON_FM);
		createEReference(actionOnFMEClass, ACTION_ON_FM__FM);
		createEReference(actionOnFMEClass, ACTION_ON_FM__CPS);
		createEAttribute(actionOnFMEClass, ACTION_ON_FM__FMA);

		actionSelectEClass = createEClass(ACTION_SELECT);
		createEReference(actionSelectEClass, ACTION_SELECT__FEATURE);

		actionDeselectEClass = createEClass(ACTION_DESELECT);
		createEReference(actionDeselectEClass, ACTION_DESELECT__FEATURE);

		actionAddCTConstraintEClass = createEClass(ACTION_ADD_CT_CONSTRAINT);
		createEReference(actionAddCTConstraintEClass, ACTION_ADD_CT_CONSTRAINT__CONSTRAINT);

		actionAbstractRenameEClass = createEClass(ACTION_ABSTRACT_RENAME);
		createEAttribute(actionAbstractRenameEClass, ACTION_ABSTRACT_RENAME__OLD_NAME);
		createEAttribute(actionAbstractRenameEClass, ACTION_ABSTRACT_RENAME__NEW_NAME);

		actionRenameCPSEClass = createEClass(ACTION_RENAME_CPS);
		createEReference(actionRenameCPSEClass, ACTION_RENAME_CPS__CPS);

		actionRenameConfigEClass = createEClass(ACTION_RENAME_CONFIG);
		createEReference(actionRenameConfigEClass, ACTION_RENAME_CONFIG__CONFIG);

		actionRenameProductEClass = createEClass(ACTION_RENAME_PRODUCT);
		createEReference(actionRenameProductEClass, ACTION_RENAME_PRODUCT__PRODUCT);

		actionSetProductDescriptionEClass = createEClass(ACTION_SET_PRODUCT_DESCRIPTION);
		createEReference(actionSetProductDescriptionEClass, ACTION_SET_PRODUCT_DESCRIPTION__PRODUCT);
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
		HistoryModelPackage theHistoryModelPackage = (HistoryModelPackage)EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI);
		ActionModelPackage theActionModelPackage = (ActionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ActionModelPackage.eNS_URI);
		fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage theExceptionsPackage_4 = (fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI);
		fr.unice.spinefm.exceptions.ExceptionsPackage theExceptionsPackage_5 = (fr.unice.spinefm.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI);
		ProcessModelPackage theProcessModelPackage = (ProcessModelPackage)EPackage.Registry.INSTANCE.getEPackage(ProcessModelPackage.eNS_URI);
		ConfigurationModelPackage theConfigurationModelPackage = (ConfigurationModelPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationModelPackage.eNS_URI);
		MSPLModelPackage theMSPLModelPackage = (MSPLModelPackage)EPackage.Registry.INSTANCE.getEPackage(MSPLModelPackage.eNS_URI);
		FMModelPackage theFMModelPackage = (FMModelPackage)EPackage.Registry.INSTANCE.getEPackage(FMModelPackage.eNS_URI);
		FmenginePackage theFmenginePackage = (FmenginePackage)EPackage.Registry.INSTANCE.getEPackage(FmenginePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionCreateConfigurationEClass.getESuperTypes().add(this.getSystemAction());
		actionLinkEClass.getESuperTypes().add(this.getSystemAction());
		actionCreateContextEClass.getESuperTypes().add(this.getSystemAction());
		actionMoveConfigurationEClass.getESuperTypes().add(this.getSystemAction());
		actionDeleteContextEClass.getESuperTypes().add(this.getSystemAction());
		actionOnFMEClass.getESuperTypes().add(this.getSystemAction());
		actionSelectEClass.getESuperTypes().add(this.getActionOnFM());
		actionDeselectEClass.getESuperTypes().add(this.getActionOnFM());
		actionAddCTConstraintEClass.getESuperTypes().add(this.getActionOnFM());
		actionAbstractRenameEClass.getESuperTypes().add(this.getSystemAction());
		actionRenameCPSEClass.getESuperTypes().add(this.getActionAbstractRename());
		actionRenameConfigEClass.getESuperTypes().add(this.getActionAbstractRename());
		actionRenameProductEClass.getESuperTypes().add(this.getActionAbstractRename());
		actionSetProductDescriptionEClass.getESuperTypes().add(this.getActionAbstractRename());

		// Initialize classes and features; add operations and parameters
		initEClass(systemActionEClass, SystemAction.class, "SystemAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemAction_CpsHistory(), ecorePackage.getEString(), "cpsHistory", null, 0, -1, SystemAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAction_Step(), theHistoryModelPackage.getStep(), theHistoryModelPackage.getStep_LaunchedActions(), "step", null, 1, 1, SystemAction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemAction_Type(), theActionModelPackage.getActionMode(), "type", null, 1, 1, SystemAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(systemActionEClass, null, "apply", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theExceptionsPackage_4.getFMEngineException());
		addEException(op, theExceptionsPackage_5.getElementNotFoundException());

		op = addEOperation(systemActionEClass, ecorePackage.getEBoolean(), "isSameObject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "o", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(systemActionEClass, null, "undo", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionCreateConfigurationEClass, ActionCreateConfiguration.class, "ActionCreateConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionCreateConfiguration_Cps(), theProcessModelPackage.getConfigurationProcessStep(), null, "cps", null, 1, 1, ActionCreateConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionCreateConfiguration_Compconf(), theConfigurationModelPackage.getCompositeConfiguration(), null, "compconf", null, 1, 1, ActionCreateConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionLink_ConfSource(), theConfigurationModelPackage.getConfiguration(), null, "confSource", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLink_ConfTarget(), theConfigurationModelPackage.getConfiguration(), null, "confTarget", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLink_Asso(), theMSPLModelPackage.getDEAssociation(), null, "asso", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLink_Link(), theConfigurationModelPackage.getLink(), null, "link", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLink_ContextManager(), theProcessModelPackage.getContextManager(), null, "contextManager", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionCreateContextEClass, ActionCreateContext.class, "ActionCreateContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionCreateContext_ContextManager(), theProcessModelPackage.getContextManager(), null, "contextManager", null, 1, 1, ActionCreateContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionCreateContext_Context(), theProcessModelPackage.getContext(), null, "context", null, 1, 1, ActionCreateContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMoveConfigurationEClass, ActionMoveConfiguration.class, "ActionMoveConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionMoveConfiguration_Configuration(), theConfigurationModelPackage.getConfiguration(), null, "configuration", null, 1, 1, ActionMoveConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMoveConfiguration_CpsSource(), theProcessModelPackage.getConfigurationProcessStep(), null, "cpsSource", null, 1, 1, ActionMoveConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMoveConfiguration_CpsTarget(), theProcessModelPackage.getConfigurationProcessStep(), null, "cpsTarget", null, 1, 1, ActionMoveConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDeleteContextEClass, ActionDeleteContext.class, "ActionDeleteContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDeleteContext_ContextManager(), theProcessModelPackage.getContextManager(), null, "contextManager", null, 1, 1, ActionDeleteContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDeleteContext_Context(), theProcessModelPackage.getContext(), null, "context", null, 1, 1, ActionDeleteContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionOnFMEClass, ActionOnFM.class, "ActionOnFM", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionOnFM_Fm(), theFMModelPackage.getFeatureModel(), null, "fm", null, 1, 1, ActionOnFM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionOnFM_Cps(), theProcessModelPackage.getConfigurationProcessStep(), null, "cps", null, 1, 1, ActionOnFM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionOnFM_Fma(), theFmenginePackage.getFMSpineFMAdapter(), "fma", null, 1, 1, ActionOnFM.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(actionOnFMEClass, this.getActionOnFM(), "cloneAction", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionSelectEClass, ActionSelect.class, "ActionSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSelect_Feature(), theFMModelPackage.getFeature(), null, "feature", null, 1, 1, ActionSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDeselectEClass, ActionDeselect.class, "ActionDeselect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDeselect_Feature(), theFMModelPackage.getFeature(), null, "feature", null, 1, 1, ActionDeselect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionAddCTConstraintEClass, ActionAddCTConstraint.class, "ActionAddCTConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionAddCTConstraint_Constraint(), theFMModelPackage.getConstraint(), null, "constraint", null, 1, 1, ActionAddCTConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionAbstractRenameEClass, ActionAbstractRename.class, "ActionAbstractRename", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionAbstractRename_OldName(), ecorePackage.getEString(), "oldName", null, 1, 1, ActionAbstractRename.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionAbstractRename_NewName(), ecorePackage.getEString(), "newName", null, 1, 1, ActionAbstractRename.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionRenameCPSEClass, ActionRenameCPS.class, "ActionRenameCPS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionRenameCPS_Cps(), theProcessModelPackage.getConfigurationProcessStep(), null, "cps", null, 1, 1, ActionRenameCPS.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionRenameConfigEClass, ActionRenameConfig.class, "ActionRenameConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionRenameConfig_Config(), theConfigurationModelPackage.getConfiguration(), null, "config", null, 1, 1, ActionRenameConfig.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionRenameProductEClass, ActionRenameProduct.class, "ActionRenameProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionRenameProduct_Product(), theConfigurationModelPackage.getCompositeConfiguration(), null, "product", null, 1, 1, ActionRenameProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionSetProductDescriptionEClass, ActionSetProductDescription.class, "ActionSetProductDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSetProductDescription_Product(), theConfigurationModelPackage.getCompositeConfiguration(), null, "product", null, 1, 1, ActionSetProductDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SystemActionModelPackageImpl
