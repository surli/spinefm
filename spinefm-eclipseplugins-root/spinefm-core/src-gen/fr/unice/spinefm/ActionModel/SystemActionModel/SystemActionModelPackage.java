/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelFactory
 * @model kind="package"
 * @generated
 */
public interface SystemActionModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SystemActionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "system.action.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "systemaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemActionModelPackage eINSTANCE = fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl <em>System Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getSystemAction()
	 * @generated
	 */
	int SYSTEM_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__CPS_HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__STEP = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION__TYPE = 2;

	/**
	 * The number of structural features of the '<em>System Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateConfigurationImpl <em>Action Create Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateConfigurationImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionCreateConfiguration()
	 * @generated
	 */
	int ACTION_CREATE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONFIGURATION__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONFIGURATION__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONFIGURATION__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONFIGURATION__CPS = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONFIGURATION__COMPCONF = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Create Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONFIGURATION_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 2;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Conf Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__CONF_SOURCE = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conf Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__CONF_TARGET = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asso</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__ASSO = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__LINK = SYSTEM_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__CONTEXT_MANAGER = SYSTEM_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateContextImpl <em>Action Create Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateContextImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionCreateContext()
	 * @generated
	 */
	int ACTION_CREATE_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONTEXT__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONTEXT__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONTEXT__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONTEXT__CONTEXT_MANAGER = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONTEXT__CONTEXT = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Create Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATE_CONTEXT_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl <em>Action Move Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionMoveConfiguration()
	 * @generated
	 */
	int ACTION_MOVE_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION__CONFIGURATION = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cps Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION__CPS_SOURCE = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cps Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION__CPS_TARGET = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Move Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MOVE_CONFIGURATION_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeleteContextImpl <em>Action Delete Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeleteContextImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionDeleteContext()
	 * @generated
	 */
	int ACTION_DELETE_CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DELETE_CONTEXT__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DELETE_CONTEXT__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DELETE_CONTEXT__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DELETE_CONTEXT__CONTEXT_MANAGER = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DELETE_CONTEXT__CONTEXT = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Delete Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DELETE_CONTEXT_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl <em>Action On FM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionOnFM()
	 * @generated
	 */
	int ACTION_ON_FM = 6;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM__FM = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM__CPS = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM__FMA = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action On FM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ON_FM_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSelectImpl <em>Action Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSelectImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionSelect()
	 * @generated
	 */
	int ACTION_SELECT = 7;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__CPS_HISTORY = ACTION_ON_FM__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__STEP = ACTION_ON_FM__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__TYPE = ACTION_ON_FM__TYPE;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__FM = ACTION_ON_FM__FM;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__CPS = ACTION_ON_FM__CPS;

	/**
	 * The feature id for the '<em><b>Fma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__FMA = ACTION_ON_FM__FMA;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT__FEATURE = ACTION_ON_FM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SELECT_FEATURE_COUNT = ACTION_ON_FM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeselectImpl <em>Action Deselect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeselectImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionDeselect()
	 * @generated
	 */
	int ACTION_DESELECT = 8;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__CPS_HISTORY = ACTION_ON_FM__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__STEP = ACTION_ON_FM__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__TYPE = ACTION_ON_FM__TYPE;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__FM = ACTION_ON_FM__FM;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__CPS = ACTION_ON_FM__CPS;

	/**
	 * The feature id for the '<em><b>Fma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__FMA = ACTION_ON_FM__FMA;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT__FEATURE = ACTION_ON_FM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Deselect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DESELECT_FEATURE_COUNT = ACTION_ON_FM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAddCTConstraintImpl <em>Action Add CT Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAddCTConstraintImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionAddCTConstraint()
	 * @generated
	 */
	int ACTION_ADD_CT_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__CPS_HISTORY = ACTION_ON_FM__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__STEP = ACTION_ON_FM__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__TYPE = ACTION_ON_FM__TYPE;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__FM = ACTION_ON_FM__FM;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__CPS = ACTION_ON_FM__CPS;

	/**
	 * The feature id for the '<em><b>Fma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__FMA = ACTION_ON_FM__FMA;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT__CONSTRAINT = ACTION_ON_FM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Add CT Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ADD_CT_CONSTRAINT_FEATURE_COUNT = ACTION_ON_FM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAbstractRenameImpl <em>Action Abstract Rename</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAbstractRenameImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionAbstractRename()
	 * @generated
	 */
	int ACTION_ABSTRACT_RENAME = 10;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ABSTRACT_RENAME__CPS_HISTORY = SYSTEM_ACTION__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ABSTRACT_RENAME__STEP = SYSTEM_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ABSTRACT_RENAME__TYPE = SYSTEM_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ABSTRACT_RENAME__OLD_NAME = SYSTEM_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ABSTRACT_RENAME__NEW_NAME = SYSTEM_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Abstract Rename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ABSTRACT_RENAME_FEATURE_COUNT = SYSTEM_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameCPSImpl <em>Action Rename CPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameCPSImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionRenameCPS()
	 * @generated
	 */
	int ACTION_RENAME_CPS = 11;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS__CPS_HISTORY = ACTION_ABSTRACT_RENAME__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS__STEP = ACTION_ABSTRACT_RENAME__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS__TYPE = ACTION_ABSTRACT_RENAME__TYPE;

	/**
	 * The feature id for the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS__OLD_NAME = ACTION_ABSTRACT_RENAME__OLD_NAME;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS__NEW_NAME = ACTION_ABSTRACT_RENAME__NEW_NAME;

	/**
	 * The feature id for the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS__CPS = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Rename CPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CPS_FEATURE_COUNT = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameConfigImpl <em>Action Rename Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameConfigImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionRenameConfig()
	 * @generated
	 */
	int ACTION_RENAME_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG__CPS_HISTORY = ACTION_ABSTRACT_RENAME__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG__STEP = ACTION_ABSTRACT_RENAME__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG__TYPE = ACTION_ABSTRACT_RENAME__TYPE;

	/**
	 * The feature id for the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG__OLD_NAME = ACTION_ABSTRACT_RENAME__OLD_NAME;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG__NEW_NAME = ACTION_ABSTRACT_RENAME__NEW_NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG__CONFIG = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Rename Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_CONFIG_FEATURE_COUNT = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameProductImpl <em>Action Rename Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameProductImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionRenameProduct()
	 * @generated
	 */
	int ACTION_RENAME_PRODUCT = 13;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT__CPS_HISTORY = ACTION_ABSTRACT_RENAME__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT__STEP = ACTION_ABSTRACT_RENAME__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT__TYPE = ACTION_ABSTRACT_RENAME__TYPE;

	/**
	 * The feature id for the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT__OLD_NAME = ACTION_ABSTRACT_RENAME__OLD_NAME;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT__NEW_NAME = ACTION_ABSTRACT_RENAME__NEW_NAME;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT__PRODUCT = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Rename Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RENAME_PRODUCT_FEATURE_COUNT = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSetProductDescriptionImpl <em>Action Set Product Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSetProductDescriptionImpl
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionSetProductDescription()
	 * @generated
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Cps History</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION__CPS_HISTORY = ACTION_ABSTRACT_RENAME__CPS_HISTORY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION__STEP = ACTION_ABSTRACT_RENAME__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION__TYPE = ACTION_ABSTRACT_RENAME__TYPE;

	/**
	 * The feature id for the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION__OLD_NAME = ACTION_ABSTRACT_RENAME__OLD_NAME;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION__NEW_NAME = ACTION_ABSTRACT_RENAME__NEW_NAME;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION__PRODUCT = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Set Product Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SET_PRODUCT_DESCRIPTION_FEATURE_COUNT = ACTION_ABSTRACT_RENAME_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction <em>System Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Action</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction
	 * @generated
	 */
	EClass getSystemAction();

	/**
	 * Returns the meta object for the attribute list '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getCpsHistory <em>Cps History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cps History</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getCpsHistory()
	 * @see #getSystemAction()
	 * @generated
	 */
	EAttribute getSystemAction_CpsHistory();

	/**
	 * Returns the meta object for the container reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Step</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getStep()
	 * @see #getSystemAction()
	 * @generated
	 */
	EReference getSystemAction_Step();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getType()
	 * @see #getSystemAction()
	 * @generated
	 */
	EAttribute getSystemAction_Type();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration <em>Action Create Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Create Configuration</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration
	 * @generated
	 */
	EClass getActionCreateConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCps()
	 * @see #getActionCreateConfiguration()
	 * @generated
	 */
	EReference getActionCreateConfiguration_Cps();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCompconf <em>Compconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compconf</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCompconf()
	 * @see #getActionCreateConfiguration()
	 * @generated
	 */
	EReference getActionCreateConfiguration_Compconf();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfSource <em>Conf Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conf Source</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfSource()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_ConfSource();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfTarget <em>Conf Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conf Target</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfTarget()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_ConfTarget();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getAsso <em>Asso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asso</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getAsso()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Asso();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getLink()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Link();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Manager</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getContextManager()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_ContextManager();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext <em>Action Create Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Create Context</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext
	 * @generated
	 */
	EClass getActionCreateContext();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext#getContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Manager</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext#getContextManager()
	 * @see #getActionCreateContext()
	 * @generated
	 */
	EReference getActionCreateContext_ContextManager();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext#getContext()
	 * @see #getActionCreateContext()
	 * @generated
	 */
	EReference getActionCreateContext_Context();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration <em>Action Move Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Move Configuration</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration
	 * @generated
	 */
	EClass getActionMoveConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getConfiguration()
	 * @see #getActionMoveConfiguration()
	 * @generated
	 */
	EReference getActionMoveConfiguration_Configuration();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsSource <em>Cps Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps Source</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsSource()
	 * @see #getActionMoveConfiguration()
	 * @generated
	 */
	EReference getActionMoveConfiguration_CpsSource();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsTarget <em>Cps Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps Target</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsTarget()
	 * @see #getActionMoveConfiguration()
	 * @generated
	 */
	EReference getActionMoveConfiguration_CpsTarget();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext <em>Action Delete Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Delete Context</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext
	 * @generated
	 */
	EClass getActionDeleteContext();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext#getContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Manager</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext#getContextManager()
	 * @see #getActionDeleteContext()
	 * @generated
	 */
	EReference getActionDeleteContext_ContextManager();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext#getContext()
	 * @see #getActionDeleteContext()
	 * @generated
	 */
	EReference getActionDeleteContext_Context();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM <em>Action On FM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action On FM</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM
	 * @generated
	 */
	EClass getActionOnFM();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFm <em>Fm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fm</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFm()
	 * @see #getActionOnFM()
	 * @generated
	 */
	EReference getActionOnFM_Fm();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getCps()
	 * @see #getActionOnFM()
	 * @generated
	 */
	EReference getActionOnFM_Cps();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFma <em>Fma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fma</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFma()
	 * @see #getActionOnFM()
	 * @generated
	 */
	EAttribute getActionOnFM_Fma();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect <em>Action Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Select</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect
	 * @generated
	 */
	EClass getActionSelect();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect#getFeature()
	 * @see #getActionSelect()
	 * @generated
	 */
	EReference getActionSelect_Feature();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect <em>Action Deselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Deselect</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect
	 * @generated
	 */
	EClass getActionDeselect();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect#getFeature()
	 * @see #getActionDeselect()
	 * @generated
	 */
	EReference getActionDeselect_Feature();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint <em>Action Add CT Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Add CT Constraint</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint
	 * @generated
	 */
	EClass getActionAddCTConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint#getConstraint()
	 * @see #getActionAddCTConstraint()
	 * @generated
	 */
	EReference getActionAddCTConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename <em>Action Abstract Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Abstract Rename</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename
	 * @generated
	 */
	EClass getActionAbstractRename();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getOldName <em>Old Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getOldName()
	 * @see #getActionAbstractRename()
	 * @generated
	 */
	EAttribute getActionAbstractRename_OldName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getNewName()
	 * @see #getActionAbstractRename()
	 * @generated
	 */
	EAttribute getActionAbstractRename_NewName();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS <em>Action Rename CPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Rename CPS</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS
	 * @generated
	 */
	EClass getActionRenameCPS();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS#getCps <em>Cps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cps</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS#getCps()
	 * @see #getActionRenameCPS()
	 * @generated
	 */
	EReference getActionRenameCPS_Cps();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig <em>Action Rename Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Rename Config</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig
	 * @generated
	 */
	EClass getActionRenameConfig();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig#getConfig()
	 * @see #getActionRenameConfig()
	 * @generated
	 */
	EReference getActionRenameConfig_Config();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct <em>Action Rename Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Rename Product</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct
	 * @generated
	 */
	EClass getActionRenameProduct();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct#getProduct()
	 * @see #getActionRenameProduct()
	 * @generated
	 */
	EReference getActionRenameProduct_Product();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription <em>Action Set Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Set Product Description</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription
	 * @generated
	 */
	EClass getActionSetProductDescription();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription#getProduct()
	 * @see #getActionSetProductDescription()
	 * @generated
	 */
	EReference getActionSetProductDescription_Product();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemActionModelFactory getSystemActionModelFactory();

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
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl <em>System Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getSystemAction()
		 * @generated
		 */
		EClass SYSTEM_ACTION = eINSTANCE.getSystemAction();

		/**
		 * The meta object literal for the '<em><b>Cps History</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ACTION__CPS_HISTORY = eINSTANCE.getSystemAction_CpsHistory();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ACTION__STEP = eINSTANCE.getSystemAction_Step();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ACTION__TYPE = eINSTANCE.getSystemAction_Type();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateConfigurationImpl <em>Action Create Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateConfigurationImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionCreateConfiguration()
		 * @generated
		 */
		EClass ACTION_CREATE_CONFIGURATION = eINSTANCE.getActionCreateConfiguration();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CREATE_CONFIGURATION__CPS = eINSTANCE.getActionCreateConfiguration_Cps();

		/**
		 * The meta object literal for the '<em><b>Compconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CREATE_CONFIGURATION__COMPCONF = eINSTANCE.getActionCreateConfiguration_Compconf();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACTION_LINK = eINSTANCE.getActionLink();

		/**
		 * The meta object literal for the '<em><b>Conf Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__CONF_SOURCE = eINSTANCE.getActionLink_ConfSource();

		/**
		 * The meta object literal for the '<em><b>Conf Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__CONF_TARGET = eINSTANCE.getActionLink_ConfTarget();

		/**
		 * The meta object literal for the '<em><b>Asso</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__ASSO = eINSTANCE.getActionLink_Asso();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__LINK = eINSTANCE.getActionLink_Link();

		/**
		 * The meta object literal for the '<em><b>Context Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__CONTEXT_MANAGER = eINSTANCE.getActionLink_ContextManager();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateContextImpl <em>Action Create Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateContextImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionCreateContext()
		 * @generated
		 */
		EClass ACTION_CREATE_CONTEXT = eINSTANCE.getActionCreateContext();

		/**
		 * The meta object literal for the '<em><b>Context Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CREATE_CONTEXT__CONTEXT_MANAGER = eINSTANCE.getActionCreateContext_ContextManager();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CREATE_CONTEXT__CONTEXT = eINSTANCE.getActionCreateContext_Context();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl <em>Action Move Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionMoveConfiguration()
		 * @generated
		 */
		EClass ACTION_MOVE_CONFIGURATION = eINSTANCE.getActionMoveConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MOVE_CONFIGURATION__CONFIGURATION = eINSTANCE.getActionMoveConfiguration_Configuration();

		/**
		 * The meta object literal for the '<em><b>Cps Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MOVE_CONFIGURATION__CPS_SOURCE = eINSTANCE.getActionMoveConfiguration_CpsSource();

		/**
		 * The meta object literal for the '<em><b>Cps Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MOVE_CONFIGURATION__CPS_TARGET = eINSTANCE.getActionMoveConfiguration_CpsTarget();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeleteContextImpl <em>Action Delete Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeleteContextImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionDeleteContext()
		 * @generated
		 */
		EClass ACTION_DELETE_CONTEXT = eINSTANCE.getActionDeleteContext();

		/**
		 * The meta object literal for the '<em><b>Context Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DELETE_CONTEXT__CONTEXT_MANAGER = eINSTANCE.getActionDeleteContext_ContextManager();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DELETE_CONTEXT__CONTEXT = eINSTANCE.getActionDeleteContext_Context();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl <em>Action On FM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionOnFM()
		 * @generated
		 */
		EClass ACTION_ON_FM = eINSTANCE.getActionOnFM();

		/**
		 * The meta object literal for the '<em><b>Fm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ON_FM__FM = eINSTANCE.getActionOnFM_Fm();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ON_FM__CPS = eINSTANCE.getActionOnFM_Cps();

		/**
		 * The meta object literal for the '<em><b>Fma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ON_FM__FMA = eINSTANCE.getActionOnFM_Fma();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSelectImpl <em>Action Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSelectImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionSelect()
		 * @generated
		 */
		EClass ACTION_SELECT = eINSTANCE.getActionSelect();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SELECT__FEATURE = eINSTANCE.getActionSelect_Feature();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeselectImpl <em>Action Deselect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionDeselectImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionDeselect()
		 * @generated
		 */
		EClass ACTION_DESELECT = eINSTANCE.getActionDeselect();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DESELECT__FEATURE = eINSTANCE.getActionDeselect_Feature();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAddCTConstraintImpl <em>Action Add CT Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAddCTConstraintImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionAddCTConstraint()
		 * @generated
		 */
		EClass ACTION_ADD_CT_CONSTRAINT = eINSTANCE.getActionAddCTConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ADD_CT_CONSTRAINT__CONSTRAINT = eINSTANCE.getActionAddCTConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAbstractRenameImpl <em>Action Abstract Rename</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAbstractRenameImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionAbstractRename()
		 * @generated
		 */
		EClass ACTION_ABSTRACT_RENAME = eINSTANCE.getActionAbstractRename();

		/**
		 * The meta object literal for the '<em><b>Old Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ABSTRACT_RENAME__OLD_NAME = eINSTANCE.getActionAbstractRename_OldName();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ABSTRACT_RENAME__NEW_NAME = eINSTANCE.getActionAbstractRename_NewName();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameCPSImpl <em>Action Rename CPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameCPSImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionRenameCPS()
		 * @generated
		 */
		EClass ACTION_RENAME_CPS = eINSTANCE.getActionRenameCPS();

		/**
		 * The meta object literal for the '<em><b>Cps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RENAME_CPS__CPS = eINSTANCE.getActionRenameCPS_Cps();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameConfigImpl <em>Action Rename Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameConfigImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionRenameConfig()
		 * @generated
		 */
		EClass ACTION_RENAME_CONFIG = eINSTANCE.getActionRenameConfig();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RENAME_CONFIG__CONFIG = eINSTANCE.getActionRenameConfig_Config();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameProductImpl <em>Action Rename Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionRenameProductImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionRenameProduct()
		 * @generated
		 */
		EClass ACTION_RENAME_PRODUCT = eINSTANCE.getActionRenameProduct();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RENAME_PRODUCT__PRODUCT = eINSTANCE.getActionRenameProduct_Product();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSetProductDescriptionImpl <em>Action Set Product Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionSetProductDescriptionImpl
		 * @see fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelPackageImpl#getActionSetProductDescription()
		 * @generated
		 */
		EClass ACTION_SET_PRODUCT_DESCRIPTION = eINSTANCE.getActionSetProductDescription();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SET_PRODUCT_DESCRIPTION__PRODUCT = eINSTANCE.getActionSetProductDescription_Product();

	}

} //SystemActionModelPackage
