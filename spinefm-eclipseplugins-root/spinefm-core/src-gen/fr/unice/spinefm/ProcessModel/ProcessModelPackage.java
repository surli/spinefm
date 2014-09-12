/**
 */
package fr.unice.spinefm.ProcessModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ProcessModel.ProcessModelFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProcessModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pm.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessModelPackage eINSTANCE = fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl <em>Configuration Process Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getConfigurationProcessStep()
	 * @generated
	 */
	int CONFIGURATION_PROCESS_STEP = 0;

	/**
	 * The feature id for the '<em><b>Domain Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>User Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__USER_CONFIG = 5;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__HISTORY = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__STATE = 7;

	/**
	 * The feature id for the '<em><b>Actions Done</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__ACTIONS_DONE = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP__STATUS = 9;

	/**
	 * The number of structural features of the '<em>Configuration Process Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROCESS_STEP_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.impl.ContextImpl
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>CPS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CPS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.impl.GlobalContextImpl <em>Global Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.impl.GlobalContextImpl
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getGlobalContext()
	 * @generated
	 */
	int GLOBAL_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>CPS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONTEXT__CPS = CONTEXT__CPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONTEXT__ID = CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONTEXT__CONFIGURATION = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.impl.LocalContextImpl <em>Local Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.impl.LocalContextImpl
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getLocalContext()
	 * @generated
	 */
	int LOCAL_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>CPS</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT__CPS = CONTEXT__CPS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT__ID = CONTEXT__ID;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT__CONFIGURATIONS = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl <em>Context Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getContextManager()
	 * @generated
	 */
	int CONTEXT_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Mspl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__MSPL = 0;

	/**
	 * The feature id for the '<em><b>Global Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__GLOBAL_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Local Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__LOCAL_CONTEXTS = 2;

	/**
	 * The feature id for the '<em><b>Fma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__FMA = 3;

	/**
	 * The feature id for the '<em><b>Past</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__PAST = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER__ID = 5;

	/**
	 * The number of structural features of the '<em>Context Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MANAGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.impl.DeletedContextInformationsImpl <em>Deleted Context Informations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.impl.DeletedContextInformationsImpl
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getDeletedContextInformations()
	 * @generated
	 */
	int DELETED_CONTEXT_INFORMATIONS = 5;

	/**
	 * The feature id for the '<em><b>Deleted Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Replaced By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONTEXT_INFORMATIONS__REPLACED_BY = 1;

	/**
	 * The number of structural features of the '<em>Deleted Context Informations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_CONTEXT_INFORMATIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ProcessModel.CPSStatus <em>CPS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.CPSStatus
	 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getCPSStatus()
	 * @generated
	 */
	int CPS_STATUS = 6;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep <em>Configuration Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Process Step</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep
	 * @generated
	 */
	EClass getConfigurationProcessStep();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Element</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDomainElement()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EReference getConfigurationProcessStep_DomainElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getId()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EAttribute getConfigurationProcessStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDescription()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EAttribute getConfigurationProcessStep_Description();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getContext()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EReference getConfigurationProcessStep_Context();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getConfiguration()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EReference getConfigurationProcessStep_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#isUserConfig <em>User Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Config</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#isUserConfig()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EAttribute getConfigurationProcessStep_UserConfig();

	/**
	 * Returns the meta object for the attribute list '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>History</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getHistory()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EAttribute getConfigurationProcessStep_History();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getState()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EReference getConfigurationProcessStep_State();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getActionsDone <em>Actions Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions Done</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getActionsDone()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EReference getConfigurationProcessStep_ActionsDone();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getStatus()
	 * @see #getConfigurationProcessStep()
	 * @generated
	 */
	EAttribute getConfigurationProcessStep_Status();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ProcessModel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.unice.spinefm.ProcessModel.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.ProcessModel.Context#getCPS <em>CPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CPS</em>'.
	 * @see fr.unice.spinefm.ProcessModel.Context#getCPS()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_CPS();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.Context#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.ProcessModel.Context#getId()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ProcessModel.GlobalContext <em>Global Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Context</em>'.
	 * @see fr.unice.spinefm.ProcessModel.GlobalContext
	 * @generated
	 */
	EClass getGlobalContext();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.ProcessModel.GlobalContext#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see fr.unice.spinefm.ProcessModel.GlobalContext#getConfiguration()
	 * @see #getGlobalContext()
	 * @generated
	 */
	EReference getGlobalContext_Configuration();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ProcessModel.LocalContext <em>Local Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Context</em>'.
	 * @see fr.unice.spinefm.ProcessModel.LocalContext
	 * @generated
	 */
	EClass getLocalContext();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.ProcessModel.LocalContext#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configurations</em>'.
	 * @see fr.unice.spinefm.ProcessModel.LocalContext#getConfigurations()
	 * @see #getLocalContext()
	 * @generated
	 */
	EReference getLocalContext_Configurations();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ProcessModel.ContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Manager</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager
	 * @generated
	 */
	EClass getContextManager();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ProcessModel.ContextManager#getMspl <em>Mspl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mspl</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager#getMspl()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_Mspl();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.ProcessModel.ContextManager#getGlobalContext <em>Global Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Context</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager#getGlobalContext()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_GlobalContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.ProcessModel.ContextManager#getLocalContexts <em>Local Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Contexts</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager#getLocalContexts()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_LocalContexts();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.ContextManager#getFma <em>Fma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fma</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager#getFma()
	 * @see #getContextManager()
	 * @generated
	 */
	EAttribute getContextManager_Fma();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.ProcessModel.ContextManager#getPast <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Past</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager#getPast()
	 * @see #getContextManager()
	 * @generated
	 */
	EReference getContextManager_Past();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.ContextManager#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager#getId()
	 * @see #getContextManager()
	 * @generated
	 */
	EAttribute getContextManager_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations <em>Deleted Context Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted Context Informations</em>'.
	 * @see fr.unice.spinefm.ProcessModel.DeletedContextInformations
	 * @generated
	 */
	EClass getDeletedContextInformations();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations#getDeletedContext <em>Deleted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Context</em>'.
	 * @see fr.unice.spinefm.ProcessModel.DeletedContextInformations#getDeletedContext()
	 * @see #getDeletedContextInformations()
	 * @generated
	 */
	EAttribute getDeletedContextInformations_DeletedContext();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations#getReplacedBy <em>Replaced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replaced By</em>'.
	 * @see fr.unice.spinefm.ProcessModel.DeletedContextInformations#getReplacedBy()
	 * @see #getDeletedContextInformations()
	 * @generated
	 */
	EReference getDeletedContextInformations_ReplacedBy();

	/**
	 * Returns the meta object for enum '{@link fr.unice.spinefm.ProcessModel.CPSStatus <em>CPS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CPS Status</em>'.
	 * @see fr.unice.spinefm.ProcessModel.CPSStatus
	 * @generated
	 */
	EEnum getCPSStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessModelFactory getProcessModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl <em>Configuration Process Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getConfigurationProcessStep()
		 * @generated
		 */
		EClass CONFIGURATION_PROCESS_STEP = eINSTANCE.getConfigurationProcessStep();

		/**
		 * The meta object literal for the '<em><b>Domain Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT = eINSTANCE.getConfigurationProcessStep_DomainElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROCESS_STEP__ID = eINSTANCE.getConfigurationProcessStep_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROCESS_STEP__DESCRIPTION = eINSTANCE.getConfigurationProcessStep_Description();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROCESS_STEP__CONTEXT = eINSTANCE.getConfigurationProcessStep_Context();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROCESS_STEP__CONFIGURATION = eINSTANCE.getConfigurationProcessStep_Configuration();

		/**
		 * The meta object literal for the '<em><b>User Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROCESS_STEP__USER_CONFIG = eINSTANCE.getConfigurationProcessStep_UserConfig();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROCESS_STEP__HISTORY = eINSTANCE.getConfigurationProcessStep_History();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROCESS_STEP__STATE = eINSTANCE.getConfigurationProcessStep_State();

		/**
		 * The meta object literal for the '<em><b>Actions Done</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROCESS_STEP__ACTIONS_DONE = eINSTANCE.getConfigurationProcessStep_ActionsDone();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROCESS_STEP__STATUS = eINSTANCE.getConfigurationProcessStep_Status();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.impl.ContextImpl
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>CPS</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CPS = eINSTANCE.getContext_CPS();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__ID = eINSTANCE.getContext_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.impl.GlobalContextImpl <em>Global Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.impl.GlobalContextImpl
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getGlobalContext()
		 * @generated
		 */
		EClass GLOBAL_CONTEXT = eINSTANCE.getGlobalContext();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_CONTEXT__CONFIGURATION = eINSTANCE.getGlobalContext_Configuration();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.impl.LocalContextImpl <em>Local Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.impl.LocalContextImpl
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getLocalContext()
		 * @generated
		 */
		EClass LOCAL_CONTEXT = eINSTANCE.getLocalContext();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_CONTEXT__CONFIGURATIONS = eINSTANCE.getLocalContext_Configurations();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl <em>Context Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getContextManager()
		 * @generated
		 */
		EClass CONTEXT_MANAGER = eINSTANCE.getContextManager();

		/**
		 * The meta object literal for the '<em><b>Mspl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__MSPL = eINSTANCE.getContextManager_Mspl();

		/**
		 * The meta object literal for the '<em><b>Global Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__GLOBAL_CONTEXT = eINSTANCE.getContextManager_GlobalContext();

		/**
		 * The meta object literal for the '<em><b>Local Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__LOCAL_CONTEXTS = eINSTANCE.getContextManager_LocalContexts();

		/**
		 * The meta object literal for the '<em><b>Fma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MANAGER__FMA = eINSTANCE.getContextManager_Fma();

		/**
		 * The meta object literal for the '<em><b>Past</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MANAGER__PAST = eINSTANCE.getContextManager_Past();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MANAGER__ID = eINSTANCE.getContextManager_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.impl.DeletedContextInformationsImpl <em>Deleted Context Informations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.impl.DeletedContextInformationsImpl
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getDeletedContextInformations()
		 * @generated
		 */
		EClass DELETED_CONTEXT_INFORMATIONS = eINSTANCE.getDeletedContextInformations();

		/**
		 * The meta object literal for the '<em><b>Deleted Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT = eINSTANCE.getDeletedContextInformations_DeletedContext();

		/**
		 * The meta object literal for the '<em><b>Replaced By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETED_CONTEXT_INFORMATIONS__REPLACED_BY = eINSTANCE.getDeletedContextInformations_ReplacedBy();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ProcessModel.CPSStatus <em>CPS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.CPSStatus
		 * @see fr.unice.spinefm.ProcessModel.impl.ProcessModelPackageImpl#getCPSStatus()
		 * @generated
		 */
		EEnum CPS_STATUS = eINSTANCE.getCPSStatus();

	}

} //ProcessModelPackage
