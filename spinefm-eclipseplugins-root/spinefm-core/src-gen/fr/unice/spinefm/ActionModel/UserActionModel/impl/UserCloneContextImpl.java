/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;
import fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Clone Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserCloneContextImpl#getContextID <em>Context ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserCloneContextImpl extends UserActionImplDelegate implements UserCloneContext
{
	/**
	 * The default value of the '{@link #getContextID() <em>Context ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextID() <em>Context ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextID()
	 * @generated
	 * @ordered
	 */
	protected String contextID = CONTEXT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserCloneContextImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return UserActionModelPackage.Literals.USER_CLONE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextID()
	{
		return contextID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextID(String newContextID)
	{
		String oldContextID = contextID;
		contextID = newContextID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_CLONE_CONTEXT__CONTEXT_ID, oldContextID, contextID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case UserActionModelPackage.USER_CLONE_CONTEXT__CONTEXT_ID:
				return getContextID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case UserActionModelPackage.USER_CLONE_CONTEXT__CONTEXT_ID:
				setContextID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case UserActionModelPackage.USER_CLONE_CONTEXT__CONTEXT_ID:
				setContextID(CONTEXT_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case UserActionModelPackage.USER_CLONE_CONTEXT__CONTEXT_ID:
				return CONTEXT_ID_EDEFAULT == null ? contextID != null : !CONTEXT_ID_EDEFAULT.equals(contextID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contextID: ");
		result.append(contextID);
		result.append(')');
		return result.toString();
	}

} //UserCloneContextImpl
