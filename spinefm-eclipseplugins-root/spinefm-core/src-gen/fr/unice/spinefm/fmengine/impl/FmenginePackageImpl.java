/**
 */
package fr.unice.spinefm.fmengine.impl;

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

import fr.unice.spinefm.RFModel.RFModelPackage;

import fr.unice.spinefm.RFModel.impl.RFModelPackageImpl;

import fr.unice.spinefm.fmengine.FMSpineFMAdapter;
import fr.unice.spinefm.fmengine.FmengineFactory;
import fr.unice.spinefm.fmengine.FmenginePackage;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmenginePackageImpl extends EPackageImpl implements FmenginePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmSpineFMAdapterEDataType = null;

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
	 * @see fr.unice.spinefm.fmengine.FmenginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FmenginePackageImpl()
	{
		super(eNS_URI, FmengineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FmenginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FmenginePackage init()
	{
		if (isInited) return (FmenginePackage)EPackage.Registry.INSTANCE.getEPackage(FmenginePackage.eNS_URI);

		// Obtain or create and register package
		FmenginePackageImpl theFmenginePackage = (FmenginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FmenginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FmenginePackageImpl());

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
		fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_4 = (fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eINSTANCE);
		fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl theExceptionsPackage_5 = (fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI) instanceof fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.exceptions.ExceptionsPackage.eNS_URI) : fr.unice.spinefm.exceptions.ExceptionsPackage.eINSTANCE);
		ActionModelPackageImpl theActionModelPackage = (ActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionModelPackage.eNS_URI) instanceof ActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionModelPackage.eNS_URI) : ActionModelPackage.eINSTANCE);
		SystemActionModelPackageImpl theSystemActionModelPackage = (SystemActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI) instanceof SystemActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SystemActionModelPackage.eNS_URI) : SystemActionModelPackage.eINSTANCE);
		UserActionModelPackageImpl theUserActionModelPackage = (UserActionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UserActionModelPackage.eNS_URI) instanceof UserActionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UserActionModelPackage.eNS_URI) : UserActionModelPackage.eINSTANCE);
		HistoryModelPackageImpl theHistoryModelPackage = (HistoryModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI) instanceof HistoryModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HistoryModelPackage.eNS_URI) : HistoryModelPackage.eINSTANCE);
		RFModelPackageImpl theRFModelPackage = (RFModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) instanceof RFModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RFModelPackage.eNS_URI) : RFModelPackage.eINSTANCE);

		// Create package meta-data objects
		theFmenginePackage.createPackageContents();
		theFMModelPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theMSPLModelPackage.createPackageContents();
		theExceptionsPackage_1.createPackageContents();
		theConfigurationModelPackage.createPackageContents();
		theExceptionsPackage_2.createPackageContents();
		theProcessModelPackage.createPackageContents();
		theExceptionsPackage_3.createPackageContents();
		theExceptionsPackage_4.createPackageContents();
		theExceptionsPackage_5.createPackageContents();
		theActionModelPackage.createPackageContents();
		theSystemActionModelPackage.createPackageContents();
		theUserActionModelPackage.createPackageContents();
		theHistoryModelPackage.createPackageContents();
		theRFModelPackage.createPackageContents();

		// Initialize created meta-data
		theFmenginePackage.initializePackageContents();
		theFMModelPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theMSPLModelPackage.initializePackageContents();
		theExceptionsPackage_1.initializePackageContents();
		theConfigurationModelPackage.initializePackageContents();
		theExceptionsPackage_2.initializePackageContents();
		theProcessModelPackage.initializePackageContents();
		theExceptionsPackage_3.initializePackageContents();
		theExceptionsPackage_4.initializePackageContents();
		theExceptionsPackage_5.initializePackageContents();
		theActionModelPackage.initializePackageContents();
		theSystemActionModelPackage.initializePackageContents();
		theUserActionModelPackage.initializePackageContents();
		theHistoryModelPackage.initializePackageContents();
		theRFModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFmenginePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FmenginePackage.eNS_URI, theFmenginePackage);
		return theFmenginePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFMSpineFMAdapter()
	{
		return fmSpineFMAdapterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmengineFactory getFmengineFactory()
	{
		return (FmengineFactory)getEFactoryInstance();
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

		// Create data types
		fmSpineFMAdapterEDataType = createEDataType(FM_SPINE_FM_ADAPTER);
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
		fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage theExceptionsPackage_4 = (fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage)EPackage.Registry.INSTANCE.getEPackage(fr.unice.spinefm.fmengine.exceptions.ExceptionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theExceptionsPackage_4);

		// Initialize data types
		initEDataType(fmSpineFMAdapterEDataType, FMSpineFMAdapter.class, "FMSpineFMAdapter", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FmenginePackageImpl
