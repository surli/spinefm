/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;
import fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Propagate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserPropagateImpl#getDomainElementName <em>Domain Element Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserPropagateImpl#getContextID <em>Context ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserPropagateImpl extends UserActionImplDelegate implements UserPropagate
{
	/**
	 * The default value of the '{@link #getDomainElementName() <em>Domain Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainElementName() <em>Domain Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElementName()
	 * @generated
	 * @ordered
	 */
	protected String domainElementName = DOMAIN_ELEMENT_NAME_EDEFAULT;

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
	protected UserPropagateImpl()
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
		return UserActionModelPackage.Literals.USER_PROPAGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainElementName()
	{
		return domainElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainElementName(String newDomainElementName)
	{
		String oldDomainElementName = domainElementName;
		domainElementName = newDomainElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_PROPAGATE__DOMAIN_ELEMENT_NAME, oldDomainElementName, domainElementName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_PROPAGATE__CONTEXT_ID, oldContextID, contextID));
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
			case UserActionModelPackage.USER_PROPAGATE__DOMAIN_ELEMENT_NAME:
				return getDomainElementName();
			case UserActionModelPackage.USER_PROPAGATE__CONTEXT_ID:
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
			case UserActionModelPackage.USER_PROPAGATE__DOMAIN_ELEMENT_NAME:
				setDomainElementName((String)newValue);
				return;
			case UserActionModelPackage.USER_PROPAGATE__CONTEXT_ID:
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
			case UserActionModelPackage.USER_PROPAGATE__DOMAIN_ELEMENT_NAME:
				setDomainElementName(DOMAIN_ELEMENT_NAME_EDEFAULT);
				return;
			case UserActionModelPackage.USER_PROPAGATE__CONTEXT_ID:
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
			case UserActionModelPackage.USER_PROPAGATE__DOMAIN_ELEMENT_NAME:
				return DOMAIN_ELEMENT_NAME_EDEFAULT == null ? domainElementName != null : !DOMAIN_ELEMENT_NAME_EDEFAULT.equals(domainElementName);
			case UserActionModelPackage.USER_PROPAGATE__CONTEXT_ID:
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
		result.append(" (domainElementName: ");
		result.append(domainElementName);
		result.append(", contextID: ");
		result.append(contextID);
		result.append(')');
		return result.toString();
	}

} //UserPropagateImpl
