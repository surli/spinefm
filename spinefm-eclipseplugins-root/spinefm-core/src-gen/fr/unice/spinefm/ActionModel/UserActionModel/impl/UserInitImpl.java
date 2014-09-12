/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;
import fr.unice.spinefm.ActionModel.UserActionModel.UserInit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl#getPastPath <em>Past Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserInitImpl#getConfDescription <em>Conf Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserInitImpl extends UserActionImplDelegate implements UserInit
{
	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPastPath() <em>Past Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PAST_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPastPath() <em>Past Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastPath()
	 * @generated
	 * @ordered
	 */
	protected String pastPath = PAST_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfDescription() <em>Conf Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONF_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfDescription() <em>Conf Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfDescription()
	 * @generated
	 * @ordered
	 */
	protected String confDescription = CONF_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInitImpl()
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
		return UserActionModelPackage.Literals.USER_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath()
	{
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath)
	{
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_INIT__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPastPath()
	{
		return pastPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPastPath(String newPastPath)
	{
		String oldPastPath = pastPath;
		pastPath = newPastPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_INIT__PAST_PATH, oldPastPath, pastPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfDescription()
	{
		return confDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfDescription(String newConfDescription)
	{
		String oldConfDescription = confDescription;
		confDescription = newConfDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_INIT__CONF_DESCRIPTION, oldConfDescription, confDescription));
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
			case UserActionModelPackage.USER_INIT__FILE_PATH:
				return getFilePath();
			case UserActionModelPackage.USER_INIT__PAST_PATH:
				return getPastPath();
			case UserActionModelPackage.USER_INIT__CONF_DESCRIPTION:
				return getConfDescription();
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
			case UserActionModelPackage.USER_INIT__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case UserActionModelPackage.USER_INIT__PAST_PATH:
				setPastPath((String)newValue);
				return;
			case UserActionModelPackage.USER_INIT__CONF_DESCRIPTION:
				setConfDescription((String)newValue);
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
			case UserActionModelPackage.USER_INIT__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case UserActionModelPackage.USER_INIT__PAST_PATH:
				setPastPath(PAST_PATH_EDEFAULT);
				return;
			case UserActionModelPackage.USER_INIT__CONF_DESCRIPTION:
				setConfDescription(CONF_DESCRIPTION_EDEFAULT);
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
			case UserActionModelPackage.USER_INIT__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case UserActionModelPackage.USER_INIT__PAST_PATH:
				return PAST_PATH_EDEFAULT == null ? pastPath != null : !PAST_PATH_EDEFAULT.equals(pastPath);
			case UserActionModelPackage.USER_INIT__CONF_DESCRIPTION:
				return CONF_DESCRIPTION_EDEFAULT == null ? confDescription != null : !CONF_DESCRIPTION_EDEFAULT.equals(confDescription);
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
		result.append(" (filePath: ");
		result.append(filePath);
		result.append(", pastPath: ");
		result.append(pastPath);
		result.append(", confDescription: ");
		result.append(confDescription);
		result.append(')');
		return result.toString();
	}

} //UserInitImpl
