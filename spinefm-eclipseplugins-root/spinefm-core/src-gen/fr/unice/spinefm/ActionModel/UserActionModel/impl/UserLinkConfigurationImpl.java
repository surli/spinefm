/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;
import fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Link Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl#getConfSourceName <em>Conf Source Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl#getConfTargetName <em>Conf Target Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserLinkConfigurationImpl#getAssoName <em>Asso Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserLinkConfigurationImpl extends UserActionImplDelegate implements UserLinkConfiguration
{
	/**
	 * The default value of the '{@link #getConfSourceName() <em>Conf Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONF_SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfSourceName() <em>Conf Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfSourceName()
	 * @generated
	 * @ordered
	 */
	protected String confSourceName = CONF_SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfTargetName() <em>Conf Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONF_TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfTargetName() <em>Conf Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfTargetName()
	 * @generated
	 * @ordered
	 */
	protected String confTargetName = CONF_TARGET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssoName() <em>Asso Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssoName() <em>Asso Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssoName()
	 * @generated
	 * @ordered
	 */
	protected String assoName = ASSO_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserLinkConfigurationImpl()
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
		return UserActionModelPackage.Literals.USER_LINK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfSourceName()
	{
		return confSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfSourceName(String newConfSourceName)
	{
		String oldConfSourceName = confSourceName;
		confSourceName = newConfSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_SOURCE_NAME, oldConfSourceName, confSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfTargetName()
	{
		return confTargetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfTargetName(String newConfTargetName)
	{
		String oldConfTargetName = confTargetName;
		confTargetName = newConfTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_TARGET_NAME, oldConfTargetName, confTargetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssoName()
	{
		return assoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssoName(String newAssoName)
	{
		String oldAssoName = assoName;
		assoName = newAssoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_LINK_CONFIGURATION__ASSO_NAME, oldAssoName, assoName));
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
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_SOURCE_NAME:
				return getConfSourceName();
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_TARGET_NAME:
				return getConfTargetName();
			case UserActionModelPackage.USER_LINK_CONFIGURATION__ASSO_NAME:
				return getAssoName();
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
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_SOURCE_NAME:
				setConfSourceName((String)newValue);
				return;
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_TARGET_NAME:
				setConfTargetName((String)newValue);
				return;
			case UserActionModelPackage.USER_LINK_CONFIGURATION__ASSO_NAME:
				setAssoName((String)newValue);
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
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_SOURCE_NAME:
				setConfSourceName(CONF_SOURCE_NAME_EDEFAULT);
				return;
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_TARGET_NAME:
				setConfTargetName(CONF_TARGET_NAME_EDEFAULT);
				return;
			case UserActionModelPackage.USER_LINK_CONFIGURATION__ASSO_NAME:
				setAssoName(ASSO_NAME_EDEFAULT);
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
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_SOURCE_NAME:
				return CONF_SOURCE_NAME_EDEFAULT == null ? confSourceName != null : !CONF_SOURCE_NAME_EDEFAULT.equals(confSourceName);
			case UserActionModelPackage.USER_LINK_CONFIGURATION__CONF_TARGET_NAME:
				return CONF_TARGET_NAME_EDEFAULT == null ? confTargetName != null : !CONF_TARGET_NAME_EDEFAULT.equals(confTargetName);
			case UserActionModelPackage.USER_LINK_CONFIGURATION__ASSO_NAME:
				return ASSO_NAME_EDEFAULT == null ? assoName != null : !ASSO_NAME_EDEFAULT.equals(assoName);
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
		result.append(" (confSourceName: ");
		result.append(confSourceName);
		result.append(", confTargetName: ");
		result.append(confTargetName);
		result.append(", assoName: ");
		result.append(assoName);
		result.append(')');
		return result.toString();
	}

} //UserLinkConfigurationImpl
