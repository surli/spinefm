/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.util;

import fr.unice.spinefm.ActionModel.UserActionModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage
 * @generated
 */
public class UserActionModelSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UserActionModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionModelSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = UserActionModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case UserActionModelPackage.USER_SELECT:
			{
				UserSelect userSelect = (UserSelect)theEObject;
				T result = caseUserSelect(userSelect);
				if (result == null) result = caseUserAction(userSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_ACTION:
			{
				UserAction userAction = (UserAction)theEObject;
				T result = caseUserAction(userAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_CREATE_CONTEXT:
			{
				UserCreateContext userCreateContext = (UserCreateContext)theEObject;
				T result = caseUserCreateContext(userCreateContext);
				if (result == null) result = caseUserAction(userCreateContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_DESELECT:
			{
				UserDeselect userDeselect = (UserDeselect)theEObject;
				T result = caseUserDeselect(userDeselect);
				if (result == null) result = caseUserAction(userDeselect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_PROPAGATE:
			{
				UserPropagate userPropagate = (UserPropagate)theEObject;
				T result = caseUserPropagate(userPropagate);
				if (result == null) result = caseUserAction(userPropagate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_VALID_CONFIGURATION:
			{
				UserValidConfiguration userValidConfiguration = (UserValidConfiguration)theEObject;
				T result = caseUserValidConfiguration(userValidConfiguration);
				if (result == null) result = caseUserAction(userValidConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_LINK_CONFIGURATION:
			{
				UserLinkConfiguration userLinkConfiguration = (UserLinkConfiguration)theEObject;
				T result = caseUserLinkConfiguration(userLinkConfiguration);
				if (result == null) result = caseUserAction(userLinkConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_INIT:
			{
				UserInit userInit = (UserInit)theEObject;
				T result = caseUserInit(userInit);
				if (result == null) result = caseUserAction(userInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_GENERATE:
			{
				UserGenerate userGenerate = (UserGenerate)theEObject;
				T result = caseUserGenerate(userGenerate);
				if (result == null) result = caseUserAction(userGenerate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_SAVE_PAST:
			{
				UserSavePast userSavePast = (UserSavePast)theEObject;
				T result = caseUserSavePast(userSavePast);
				if (result == null) result = caseUserAction(userSavePast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_RENAME_ELEMENT:
			{
				UserRenameElement userRenameElement = (UserRenameElement)theEObject;
				T result = caseUserRenameElement(userRenameElement);
				if (result == null) result = caseUserAction(userRenameElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UserActionModelPackage.USER_CLONE_CONTEXT:
			{
				UserCloneContext userCloneContext = (UserCloneContext)theEObject;
				T result = caseUserCloneContext(userCloneContext);
				if (result == null) result = caseUserAction(userCloneContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserSelect(UserSelect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserAction(UserAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Create Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Create Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserCreateContext(UserCreateContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Deselect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Deselect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDeselect(UserDeselect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Propagate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Propagate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPropagate(UserPropagate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Valid Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Valid Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserValidConfiguration(UserValidConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Link Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Link Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserLinkConfiguration(UserLinkConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInit(UserInit object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Generate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Generate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserGenerate(UserGenerate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Save Past</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Save Past</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserSavePast(UserSavePast object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Rename Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Rename Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserRenameElement(UserRenameElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Clone Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Clone Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserCloneContext(UserCloneContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //UserActionModelSwitch
