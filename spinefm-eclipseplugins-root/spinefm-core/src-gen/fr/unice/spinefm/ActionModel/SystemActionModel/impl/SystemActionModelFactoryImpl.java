/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemActionModelFactoryImpl extends EFactoryImpl implements SystemActionModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemActionModelFactory init()
	{
		try
		{
			SystemActionModelFactory theSystemActionModelFactory = (SystemActionModelFactory)EPackage.Registry.INSTANCE.getEFactory("system.action.spinefm.unice.fr"); 
			if (theSystemActionModelFactory != null)
			{
				return theSystemActionModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemActionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionModelFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION: return createActionCreateConfiguration();
			case SystemActionModelPackage.ACTION_LINK: return createActionLink();
			case SystemActionModelPackage.ACTION_CREATE_CONTEXT: return createActionCreateContext();
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION: return createActionMoveConfiguration();
			case SystemActionModelPackage.ACTION_DELETE_CONTEXT: return createActionDeleteContext();
			case SystemActionModelPackage.ACTION_SELECT: return createActionSelect();
			case SystemActionModelPackage.ACTION_DESELECT: return createActionDeselect();
			case SystemActionModelPackage.ACTION_ADD_CT_CONSTRAINT: return createActionAddCTConstraint();
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME: return createActionAbstractRename();
			case SystemActionModelPackage.ACTION_RENAME_CPS: return createActionRenameCPS();
			case SystemActionModelPackage.ACTION_RENAME_CONFIG: return createActionRenameConfig();
			case SystemActionModelPackage.ACTION_RENAME_PRODUCT: return createActionRenameProduct();
			case SystemActionModelPackage.ACTION_SET_PRODUCT_DESCRIPTION: return createActionSetProductDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCreateConfiguration createActionCreateConfiguration()
	{
		ActionCreateConfigurationImplDelegate actionCreateConfiguration = new ActionCreateConfigurationImplDelegate();
		return actionCreateConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLink createActionLink()
	{
		ActionLinkImplDelegate actionLink = new ActionLinkImplDelegate();
		return actionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCreateContext createActionCreateContext()
	{
		ActionCreateContextImplDelegate actionCreateContext = new ActionCreateContextImplDelegate();
		return actionCreateContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMoveConfiguration createActionMoveConfiguration()
	{
		ActionMoveConfigurationImplDelegate actionMoveConfiguration = new ActionMoveConfigurationImplDelegate();
		return actionMoveConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDeleteContext createActionDeleteContext()
	{
		ActionDeleteContextImplDelegate actionDeleteContext = new ActionDeleteContextImplDelegate();
		return actionDeleteContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSelect createActionSelect()
	{
		ActionSelectImplDelegate actionSelect = new ActionSelectImplDelegate();
		return actionSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDeselect createActionDeselect()
	{
		ActionDeselectImplDelegate actionDeselect = new ActionDeselectImplDelegate();
		return actionDeselect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAddCTConstraint createActionAddCTConstraint()
	{
		ActionAddCTConstraintImplDelegate actionAddCTConstraint = new ActionAddCTConstraintImplDelegate();
		return actionAddCTConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAbstractRename createActionAbstractRename()
	{
		ActionAbstractRenameImpl actionAbstractRename = new ActionAbstractRenameImpl();
		return actionAbstractRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRenameCPS createActionRenameCPS()
	{
		ActionRenameCPSImplDelegate actionRenameCPS = new ActionRenameCPSImplDelegate();
		return actionRenameCPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRenameConfig createActionRenameConfig()
	{
		ActionRenameConfigImplDelegate actionRenameConfig = new ActionRenameConfigImplDelegate();
		return actionRenameConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRenameProduct createActionRenameProduct()
	{
		ActionRenameProductImplDelegate actionRenameProduct = new ActionRenameProductImplDelegate();
		return actionRenameProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSetProductDescription createActionSetProductDescription()
	{
		ActionSetProductDescriptionImplDelegate actionSetProductDescription = new ActionSetProductDescriptionImplDelegate();
		return actionSetProductDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionModelPackage getSystemActionModelPackage()
	{
		return (SystemActionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemActionModelPackage getPackage()
	{
		return SystemActionModelPackage.eINSTANCE;
	}

} //SystemActionModelFactoryImpl
