/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.util;

import fr.unice.spinefm.ActionModel.SystemActionModel.*;

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
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage
 * @generated
 */
public class SystemActionModelSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemActionModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionModelSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = SystemActionModelPackage.eINSTANCE;
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
			case SystemActionModelPackage.SYSTEM_ACTION:
			{
				SystemAction systemAction = (SystemAction)theEObject;
				T result = caseSystemAction(systemAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION:
			{
				ActionCreateConfiguration actionCreateConfiguration = (ActionCreateConfiguration)theEObject;
				T result = caseActionCreateConfiguration(actionCreateConfiguration);
				if (result == null) result = caseSystemAction(actionCreateConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_LINK:
			{
				ActionLink actionLink = (ActionLink)theEObject;
				T result = caseActionLink(actionLink);
				if (result == null) result = caseSystemAction(actionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_CREATE_CONTEXT:
			{
				ActionCreateContext actionCreateContext = (ActionCreateContext)theEObject;
				T result = caseActionCreateContext(actionCreateContext);
				if (result == null) result = caseSystemAction(actionCreateContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION:
			{
				ActionMoveConfiguration actionMoveConfiguration = (ActionMoveConfiguration)theEObject;
				T result = caseActionMoveConfiguration(actionMoveConfiguration);
				if (result == null) result = caseSystemAction(actionMoveConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_DELETE_CONTEXT:
			{
				ActionDeleteContext actionDeleteContext = (ActionDeleteContext)theEObject;
				T result = caseActionDeleteContext(actionDeleteContext);
				if (result == null) result = caseSystemAction(actionDeleteContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_ON_FM:
			{
				ActionOnFM actionOnFM = (ActionOnFM)theEObject;
				T result = caseActionOnFM(actionOnFM);
				if (result == null) result = caseSystemAction(actionOnFM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_SELECT:
			{
				ActionSelect actionSelect = (ActionSelect)theEObject;
				T result = caseActionSelect(actionSelect);
				if (result == null) result = caseActionOnFM(actionSelect);
				if (result == null) result = caseSystemAction(actionSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_DESELECT:
			{
				ActionDeselect actionDeselect = (ActionDeselect)theEObject;
				T result = caseActionDeselect(actionDeselect);
				if (result == null) result = caseActionOnFM(actionDeselect);
				if (result == null) result = caseSystemAction(actionDeselect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_ADD_CT_CONSTRAINT:
			{
				ActionAddCTConstraint actionAddCTConstraint = (ActionAddCTConstraint)theEObject;
				T result = caseActionAddCTConstraint(actionAddCTConstraint);
				if (result == null) result = caseActionOnFM(actionAddCTConstraint);
				if (result == null) result = caseSystemAction(actionAddCTConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME:
			{
				ActionAbstractRename actionAbstractRename = (ActionAbstractRename)theEObject;
				T result = caseActionAbstractRename(actionAbstractRename);
				if (result == null) result = caseSystemAction(actionAbstractRename);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_RENAME_CPS:
			{
				ActionRenameCPS actionRenameCPS = (ActionRenameCPS)theEObject;
				T result = caseActionRenameCPS(actionRenameCPS);
				if (result == null) result = caseActionAbstractRename(actionRenameCPS);
				if (result == null) result = caseSystemAction(actionRenameCPS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_RENAME_CONFIG:
			{
				ActionRenameConfig actionRenameConfig = (ActionRenameConfig)theEObject;
				T result = caseActionRenameConfig(actionRenameConfig);
				if (result == null) result = caseActionAbstractRename(actionRenameConfig);
				if (result == null) result = caseSystemAction(actionRenameConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_RENAME_PRODUCT:
			{
				ActionRenameProduct actionRenameProduct = (ActionRenameProduct)theEObject;
				T result = caseActionRenameProduct(actionRenameProduct);
				if (result == null) result = caseActionAbstractRename(actionRenameProduct);
				if (result == null) result = caseSystemAction(actionRenameProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemActionModelPackage.ACTION_SET_PRODUCT_DESCRIPTION:
			{
				ActionSetProductDescription actionSetProductDescription = (ActionSetProductDescription)theEObject;
				T result = caseActionSetProductDescription(actionSetProductDescription);
				if (result == null) result = caseActionAbstractRename(actionSetProductDescription);
				if (result == null) result = caseSystemAction(actionSetProductDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemAction(SystemAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Create Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Create Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCreateConfiguration(ActionCreateConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLink(ActionLink object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Create Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Create Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCreateContext(ActionCreateContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Move Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Move Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionMoveConfiguration(ActionMoveConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Delete Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Delete Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDeleteContext(ActionDeleteContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action On FM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action On FM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionOnFM(ActionOnFM object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSelect(ActionSelect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Deselect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Deselect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDeselect(ActionDeselect object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Add CT Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Add CT Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionAddCTConstraint(ActionAddCTConstraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Abstract Rename</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Abstract Rename</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionAbstractRename(ActionAbstractRename object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Rename CPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Rename CPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRenameCPS(ActionRenameCPS object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Rename Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Rename Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRenameConfig(ActionRenameConfig object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Rename Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Rename Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionRenameProduct(ActionRenameProduct object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Set Product Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Set Product Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSetProductDescription(ActionSetProductDescription object)
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

} //SystemActionModelSwitch
