/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.UserActionModel.*;

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
public class UserActionModelFactoryImpl extends EFactoryImpl implements UserActionModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserActionModelFactory init()
	{
		try
		{
			UserActionModelFactory theUserActionModelFactory = (UserActionModelFactory)EPackage.Registry.INSTANCE.getEFactory("user.action.spinefm.unice.fr"); 
			if (theUserActionModelFactory != null)
			{
				return theUserActionModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UserActionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionModelFactoryImpl()
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
			case UserActionModelPackage.USER_SELECT: return createUserSelect();
			case UserActionModelPackage.USER_CREATE_CONTEXT: return createUserCreateContext();
			case UserActionModelPackage.USER_DESELECT: return createUserDeselect();
			case UserActionModelPackage.USER_PROPAGATE: return createUserPropagate();
			case UserActionModelPackage.USER_VALID_CONFIGURATION: return createUserValidConfiguration();
			case UserActionModelPackage.USER_LINK_CONFIGURATION: return createUserLinkConfiguration();
			case UserActionModelPackage.USER_INIT: return createUserInit();
			case UserActionModelPackage.USER_GENERATE: return createUserGenerate();
			case UserActionModelPackage.USER_SAVE_PAST: return createUserSavePast();
			case UserActionModelPackage.USER_RENAME_ELEMENT: return createUserRenameElement();
			case UserActionModelPackage.USER_CLONE_CONTEXT: return createUserCloneContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSelect createUserSelect()
	{
		UserSelectImplDelegate userSelect = new UserSelectImplDelegate();
		return userSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCreateContext createUserCreateContext()
	{
		UserCreateContextImplDelegate userCreateContext = new UserCreateContextImplDelegate();
		return userCreateContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDeselect createUserDeselect()
	{
		UserDeselectImplDelegate userDeselect = new UserDeselectImplDelegate();
		return userDeselect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPropagate createUserPropagate()
	{
		UserPropagateImplDelegate userPropagate = new UserPropagateImplDelegate();
		return userPropagate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserValidConfiguration createUserValidConfiguration()
	{
		UserValidConfigurationImplDelegate userValidConfiguration = new UserValidConfigurationImplDelegate();
		return userValidConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLinkConfiguration createUserLinkConfiguration()
	{
		UserLinkConfigurationImplDelegate userLinkConfiguration = new UserLinkConfigurationImplDelegate();
		return userLinkConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInit createUserInit()
	{
		UserInitImplDelegate userInit = new UserInitImplDelegate();
		return userInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGenerate createUserGenerate()
	{
		UserGenerateImplDelegate userGenerate = new UserGenerateImplDelegate();
		return userGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSavePast createUserSavePast()
	{
		UserSavePastImplDelegate userSavePast = new UserSavePastImplDelegate();
		return userSavePast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRenameElement createUserRenameElement()
	{
		UserRenameElementImplDelegate userRenameElement = new UserRenameElementImplDelegate();
		return userRenameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCloneContext createUserCloneContext()
	{
		UserCloneContextImplDelegate userCloneContext = new UserCloneContextImplDelegate();
		return userCloneContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionModelPackage getUserActionModelPackage()
	{
		return (UserActionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UserActionModelPackage getPackage()
	{
		return UserActionModelPackage.eINSTANCE;
	}

} //UserActionModelFactoryImpl
