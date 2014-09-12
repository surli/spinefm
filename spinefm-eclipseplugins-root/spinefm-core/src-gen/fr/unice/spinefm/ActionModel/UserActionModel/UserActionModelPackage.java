/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;

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
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelFactory
 * @model kind="package"
 * @generated
 */
public interface UserActionModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UserActionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "user.action.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "useraction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserActionModelPackage eINSTANCE = fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl <em>User Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserAction()
	 * @generated
	 */
	int USER_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION__STEP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION__CONTEXT_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION__RESULT = 3;

	/**
	 * The number of structural features of the '<em>User Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSelectImpl <em>User Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSelectImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserSelect()
	 * @generated
	 */
	int USER_SELECT = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Domain Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__DOMAIN_ELEMENT_NAME = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__CONTEXT_ID = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT__FEATURE_NAME = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SELECT_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCreateContextImpl <em>User Create Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCreateContextImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserCreateContext()
	 * @generated
	 */
	int USER_CREATE_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATE_CONTEXT__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATE_CONTEXT__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATE_CONTEXT__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATE_CONTEXT__RESULT = USER_ACTION__RESULT;

	/**
	 * The number of structural features of the '<em>User Create Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CREATE_CONTEXT_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserDeselectImpl <em>User Deselect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserDeselectImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserDeselect()
	 * @generated
	 */
	int USER_DESELECT = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Domain Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__DOMAIN_ELEMENT_NAME = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__CONTEXT_ID = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT__FEATURE_NAME = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Deselect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DESELECT_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserPropagateImpl <em>User Propagate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserPropagateImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserPropagate()
	 * @generated
	 */
	int USER_PROPAGATE = 4;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Domain Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE__DOMAIN_ELEMENT_NAME = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE__CONTEXT_ID = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Propagate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPAGATE_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserValidConfigurationImpl <em>User Valid Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserValidConfigurationImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserValidConfiguration()
	 * @generated
	 */
	int USER_VALID_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Domain Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION__DOMAIN_ELEMENT_NAME = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION__CONTEXT_ID = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Valid Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_VALID_CONFIGURATION_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl <em>User Link Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserLinkConfiguration()
	 * @generated
	 */
	int USER_LINK_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Conf Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__CONF_SOURCE_NAME = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conf Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__CONF_TARGET_NAME = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asso Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION__ASSO_NAME = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Link Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LINK_CONFIGURATION_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl <em>User Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserInit()
	 * @generated
	 */
	int USER_INIT = 7;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__FILE_PATH = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Past Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__PAST_PATH = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conf Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT__CONF_DESCRIPTION = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INIT_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserGenerateImpl <em>User Generate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserGenerateImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserGenerate()
	 * @generated
	 */
	int USER_GENERATE = 8;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GENERATE__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GENERATE__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GENERATE__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GENERATE__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GENERATE__PATH = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Generate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GENERATE_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSavePastImpl <em>User Save Past</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSavePastImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserSavePast()
	 * @generated
	 */
	int USER_SAVE_PAST = 9;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SAVE_PAST__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SAVE_PAST__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SAVE_PAST__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SAVE_PAST__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Dest Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SAVE_PAST__DEST_PATH = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Save Past</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SAVE_PAST_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserRenameElementImpl <em>User Rename Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserRenameElementImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserRenameElement()
	 * @generated
	 */
	int USER_RENAME_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__NAME = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__ELEMENT_TYPE = USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT__ELEMENT_ID = USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Rename Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_RENAME_ELEMENT_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCloneContextImpl <em>User Clone Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCloneContextImpl
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserCloneContext()
	 * @generated
	 */
	int USER_CLONE_CONTEXT = 11;

	/**
	 * The feature id for the '<em><b>Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CLONE_CONTEXT__STEP = USER_ACTION__STEP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CLONE_CONTEXT__TYPE = USER_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CLONE_CONTEXT__CONTEXT_MANAGER = USER_ACTION__CONTEXT_MANAGER;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CLONE_CONTEXT__RESULT = USER_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Context ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CLONE_CONTEXT__CONTEXT_ID = USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Clone Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_CLONE_CONTEXT_FEATURE_COUNT = USER_ACTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSelect <em>User Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Select</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSelect
	 * @generated
	 */
	EClass getUserSelect();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSelect#getDomainElementName <em>Domain Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Element Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSelect#getDomainElementName()
	 * @see #getUserSelect()
	 * @generated
	 */
	EAttribute getUserSelect_DomainElementName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSelect#getContextID <em>Context ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context ID</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSelect#getContextID()
	 * @see #getUserSelect()
	 * @generated
	 */
	EAttribute getUserSelect_ContextID();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSelect#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSelect#getFeatureName()
	 * @see #getUserSelect()
	 * @generated
	 */
	EAttribute getUserSelect_FeatureName();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction <em>User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Action</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction
	 * @generated
	 */
	EClass getUserAction();

	/**
	 * Returns the meta object for the container reference '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Step</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getStep()
	 * @see #getUserAction()
	 * @generated
	 */
	EReference getUserAction_Step();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getType()
	 * @see #getUserAction()
	 * @generated
	 */
	EAttribute getUserAction_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Manager</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getContextManager()
	 * @see #getUserAction()
	 * @generated
	 */
	EReference getUserAction_ContextManager();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getResult()
	 * @see #getUserAction()
	 * @generated
	 */
	EReference getUserAction_Result();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext <em>User Create Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Create Context</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext
	 * @generated
	 */
	EClass getUserCreateContext();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect <em>User Deselect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Deselect</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect
	 * @generated
	 */
	EClass getUserDeselect();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getDomainElementName <em>Domain Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Element Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getDomainElementName()
	 * @see #getUserDeselect()
	 * @generated
	 */
	EAttribute getUserDeselect_DomainElementName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getContextID <em>Context ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context ID</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getContextID()
	 * @see #getUserDeselect()
	 * @generated
	 */
	EAttribute getUserDeselect_ContextID();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getFeatureName()
	 * @see #getUserDeselect()
	 * @generated
	 */
	EAttribute getUserDeselect_FeatureName();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate <em>User Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Propagate</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate
	 * @generated
	 */
	EClass getUserPropagate();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate#getDomainElementName <em>Domain Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Element Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate#getDomainElementName()
	 * @see #getUserPropagate()
	 * @generated
	 */
	EAttribute getUserPropagate_DomainElementName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate#getContextID <em>Context ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context ID</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate#getContextID()
	 * @see #getUserPropagate()
	 * @generated
	 */
	EAttribute getUserPropagate_ContextID();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration <em>User Valid Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Valid Configuration</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration
	 * @generated
	 */
	EClass getUserValidConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration#getDomainElementName <em>Domain Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Element Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration#getDomainElementName()
	 * @see #getUserValidConfiguration()
	 * @generated
	 */
	EAttribute getUserValidConfiguration_DomainElementName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration#getContextID <em>Context ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context ID</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration#getContextID()
	 * @see #getUserValidConfiguration()
	 * @generated
	 */
	EAttribute getUserValidConfiguration_ContextID();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration <em>User Link Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Link Configuration</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration
	 * @generated
	 */
	EClass getUserLinkConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfSourceName <em>Conf Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf Source Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfSourceName()
	 * @see #getUserLinkConfiguration()
	 * @generated
	 */
	EAttribute getUserLinkConfiguration_ConfSourceName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfTargetName <em>Conf Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf Target Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfTargetName()
	 * @see #getUserLinkConfiguration()
	 * @generated
	 */
	EAttribute getUserLinkConfiguration_ConfTargetName();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getAssoName <em>Asso Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asso Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getAssoName()
	 * @see #getUserLinkConfiguration()
	 * @generated
	 */
	EAttribute getUserLinkConfiguration_AssoName();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit <em>User Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Init</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserInit
	 * @generated
	 */
	EClass getUserInit();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getFilePath()
	 * @see #getUserInit()
	 * @generated
	 */
	EAttribute getUserInit_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getPastPath <em>Past Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Past Path</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getPastPath()
	 * @see #getUserInit()
	 * @generated
	 */
	EAttribute getUserInit_PastPath();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getConfDescription <em>Conf Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf Description</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getConfDescription()
	 * @see #getUserInit()
	 * @generated
	 */
	EAttribute getUserInit_ConfDescription();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate <em>User Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Generate</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate
	 * @generated
	 */
	EClass getUserGenerate();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate#getPath()
	 * @see #getUserGenerate()
	 * @generated
	 */
	EAttribute getUserGenerate_Path();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast <em>User Save Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Save Past</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast
	 * @generated
	 */
	EClass getUserSavePast();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast#getDestPath <em>Dest Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest Path</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast#getDestPath()
	 * @see #getUserSavePast()
	 * @generated
	 */
	EAttribute getUserSavePast_DestPath();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement <em>User Rename Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Rename Element</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement
	 * @generated
	 */
	EClass getUserRenameElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement#getName()
	 * @see #getUserRenameElement()
	 * @generated
	 */
	EAttribute getUserRenameElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement#getElementType()
	 * @see #getUserRenameElement()
	 * @generated
	 */
	EAttribute getUserRenameElement_ElementType();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement#getElementID()
	 * @see #getUserRenameElement()
	 * @generated
	 */
	EAttribute getUserRenameElement_ElementID();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext <em>User Clone Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Clone Context</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext
	 * @generated
	 */
	EClass getUserCloneContext();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext#getContextID <em>Context ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context ID</em>'.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext#getContextID()
	 * @see #getUserCloneContext()
	 * @generated
	 */
	EAttribute getUserCloneContext_ContextID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserActionModelFactory getUserActionModelFactory();

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
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSelectImpl <em>User Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSelectImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserSelect()
		 * @generated
		 */
		EClass USER_SELECT = eINSTANCE.getUserSelect();

		/**
		 * The meta object literal for the '<em><b>Domain Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SELECT__DOMAIN_ELEMENT_NAME = eINSTANCE.getUserSelect_DomainElementName();

		/**
		 * The meta object literal for the '<em><b>Context ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SELECT__CONTEXT_ID = eINSTANCE.getUserSelect_ContextID();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SELECT__FEATURE_NAME = eINSTANCE.getUserSelect_FeatureName();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl <em>User Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserAction()
		 * @generated
		 */
		EClass USER_ACTION = eINSTANCE.getUserAction();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ACTION__STEP = eINSTANCE.getUserAction_Step();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACTION__TYPE = eINSTANCE.getUserAction_Type();

		/**
		 * The meta object literal for the '<em><b>Context Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ACTION__CONTEXT_MANAGER = eINSTANCE.getUserAction_ContextManager();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_ACTION__RESULT = eINSTANCE.getUserAction_Result();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCreateContextImpl <em>User Create Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCreateContextImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserCreateContext()
		 * @generated
		 */
		EClass USER_CREATE_CONTEXT = eINSTANCE.getUserCreateContext();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserDeselectImpl <em>User Deselect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserDeselectImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserDeselect()
		 * @generated
		 */
		EClass USER_DESELECT = eINSTANCE.getUserDeselect();

		/**
		 * The meta object literal for the '<em><b>Domain Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DESELECT__DOMAIN_ELEMENT_NAME = eINSTANCE.getUserDeselect_DomainElementName();

		/**
		 * The meta object literal for the '<em><b>Context ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DESELECT__CONTEXT_ID = eINSTANCE.getUserDeselect_ContextID();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DESELECT__FEATURE_NAME = eINSTANCE.getUserDeselect_FeatureName();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserPropagateImpl <em>User Propagate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserPropagateImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserPropagate()
		 * @generated
		 */
		EClass USER_PROPAGATE = eINSTANCE.getUserPropagate();

		/**
		 * The meta object literal for the '<em><b>Domain Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPAGATE__DOMAIN_ELEMENT_NAME = eINSTANCE.getUserPropagate_DomainElementName();

		/**
		 * The meta object literal for the '<em><b>Context ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPAGATE__CONTEXT_ID = eINSTANCE.getUserPropagate_ContextID();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserValidConfigurationImpl <em>User Valid Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserValidConfigurationImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserValidConfiguration()
		 * @generated
		 */
		EClass USER_VALID_CONFIGURATION = eINSTANCE.getUserValidConfiguration();

		/**
		 * The meta object literal for the '<em><b>Domain Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_VALID_CONFIGURATION__DOMAIN_ELEMENT_NAME = eINSTANCE.getUserValidConfiguration_DomainElementName();

		/**
		 * The meta object literal for the '<em><b>Context ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_VALID_CONFIGURATION__CONTEXT_ID = eINSTANCE.getUserValidConfiguration_ContextID();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl <em>User Link Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserLinkConfiguration()
		 * @generated
		 */
		EClass USER_LINK_CONFIGURATION = eINSTANCE.getUserLinkConfiguration();

		/**
		 * The meta object literal for the '<em><b>Conf Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LINK_CONFIGURATION__CONF_SOURCE_NAME = eINSTANCE.getUserLinkConfiguration_ConfSourceName();

		/**
		 * The meta object literal for the '<em><b>Conf Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LINK_CONFIGURATION__CONF_TARGET_NAME = eINSTANCE.getUserLinkConfiguration_ConfTargetName();

		/**
		 * The meta object literal for the '<em><b>Asso Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LINK_CONFIGURATION__ASSO_NAME = eINSTANCE.getUserLinkConfiguration_AssoName();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl <em>User Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserInit()
		 * @generated
		 */
		EClass USER_INIT = eINSTANCE.getUserInit();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INIT__FILE_PATH = eINSTANCE.getUserInit_FilePath();

		/**
		 * The meta object literal for the '<em><b>Past Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INIT__PAST_PATH = eINSTANCE.getUserInit_PastPath();

		/**
		 * The meta object literal for the '<em><b>Conf Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INIT__CONF_DESCRIPTION = eINSTANCE.getUserInit_ConfDescription();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserGenerateImpl <em>User Generate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserGenerateImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserGenerate()
		 * @generated
		 */
		EClass USER_GENERATE = eINSTANCE.getUserGenerate();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GENERATE__PATH = eINSTANCE.getUserGenerate_Path();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSavePastImpl <em>User Save Past</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserSavePastImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserSavePast()
		 * @generated
		 */
		EClass USER_SAVE_PAST = eINSTANCE.getUserSavePast();

		/**
		 * The meta object literal for the '<em><b>Dest Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_SAVE_PAST__DEST_PATH = eINSTANCE.getUserSavePast_DestPath();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserRenameElementImpl <em>User Rename Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserRenameElementImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserRenameElement()
		 * @generated
		 */
		EClass USER_RENAME_ELEMENT = eINSTANCE.getUserRenameElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RENAME_ELEMENT__NAME = eINSTANCE.getUserRenameElement_Name();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RENAME_ELEMENT__ELEMENT_TYPE = eINSTANCE.getUserRenameElement_ElementType();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_RENAME_ELEMENT__ELEMENT_ID = eINSTANCE.getUserRenameElement_ElementID();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCloneContextImpl <em>User Clone Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCloneContextImpl
		 * @see fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelPackageImpl#getUserCloneContext()
		 * @generated
		 */
		EClass USER_CLONE_CONTEXT = eINSTANCE.getUserCloneContext();

		/**
		 * The meta object literal for the '<em><b>Context ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_CLONE_CONTEXT__CONTEXT_ID = eINSTANCE.getUserCloneContext_ContextID();

	}

} //UserActionModelPackage
