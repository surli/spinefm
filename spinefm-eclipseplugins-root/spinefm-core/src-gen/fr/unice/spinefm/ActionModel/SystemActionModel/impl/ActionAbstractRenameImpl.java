/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Abstract Rename</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAbstractRenameImpl#getOldName <em>Old Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionAbstractRenameImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionAbstractRenameImpl extends SystemActionImplDelegate implements ActionAbstractRename
{
	/**
	 * The default value of the '{@link #getOldName() <em>Old Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldName()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldName() <em>Old Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldName()
	 * @generated
	 * @ordered
	 */
	protected String oldName = OLD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected String newName = NEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAbstractRenameImpl()
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
		return SystemActionModelPackage.Literals.ACTION_ABSTRACT_RENAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldName()
	{
		return oldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldName(String newOldName)
	{
		String oldOldName = oldName;
		oldName = newOldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_ABSTRACT_RENAME__OLD_NAME, oldOldName, oldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewName()
	{
		return newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewName(String newNewName)
	{
		String oldNewName = newName;
		newName = newNewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_ABSTRACT_RENAME__NEW_NAME, oldNewName, newName));
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
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__OLD_NAME:
				return getOldName();
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__NEW_NAME:
				return getNewName();
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
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__OLD_NAME:
				setOldName((String)newValue);
				return;
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__NEW_NAME:
				setNewName((String)newValue);
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
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__OLD_NAME:
				setOldName(OLD_NAME_EDEFAULT);
				return;
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
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
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__OLD_NAME:
				return OLD_NAME_EDEFAULT == null ? oldName != null : !OLD_NAME_EDEFAULT.equals(oldName);
			case SystemActionModelPackage.ACTION_ABSTRACT_RENAME__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
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
		result.append(" (oldName: ");
		result.append(oldName);
		result.append(", newName: ");
		result.append(newName);
		result.append(')');
		return result.toString();
	}

} //ActionAbstractRenameImpl
