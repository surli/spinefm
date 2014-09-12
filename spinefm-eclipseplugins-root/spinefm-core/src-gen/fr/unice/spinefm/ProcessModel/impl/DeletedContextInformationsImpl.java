/**
 */
package fr.unice.spinefm.ProcessModel.impl;

import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.DeletedContextInformations;
import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deleted Context Informations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.DeletedContextInformationsImpl#getDeletedContext <em>Deleted Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.DeletedContextInformationsImpl#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeletedContextInformationsImpl extends EObjectImpl implements DeletedContextInformations
{
	/**
	 * The default value of the '{@link #getDeletedContext() <em>Deleted Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedContext()
	 * @generated
	 * @ordered
	 */
	protected static final String DELETED_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeletedContext() <em>Deleted Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedContext()
	 * @generated
	 * @ordered
	 */
	protected String deletedContext = DELETED_CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplacedBy() <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacedBy()
	 * @generated
	 * @ordered
	 */
	protected Context replacedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeletedContextInformationsImpl()
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
		return ProcessModelPackage.Literals.DELETED_CONTEXT_INFORMATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeletedContext()
	{
		return deletedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedContext(String newDeletedContext)
	{
		String oldDeletedContext = deletedContext;
		deletedContext = newDeletedContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT, oldDeletedContext, deletedContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getReplacedBy()
	{
		if (replacedBy != null && replacedBy.eIsProxy())
		{
			InternalEObject oldReplacedBy = (InternalEObject)replacedBy;
			replacedBy = (Context)eResolveProxy(oldReplacedBy);
			if (replacedBy != oldReplacedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__REPLACED_BY, oldReplacedBy, replacedBy));
			}
		}
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetReplacedBy()
	{
		return replacedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacedBy(Context newReplacedBy)
	{
		Context oldReplacedBy = replacedBy;
		replacedBy = newReplacedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__REPLACED_BY, oldReplacedBy, replacedBy));
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
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT:
				return getDeletedContext();
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__REPLACED_BY:
				if (resolve) return getReplacedBy();
				return basicGetReplacedBy();
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
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT:
				setDeletedContext((String)newValue);
				return;
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__REPLACED_BY:
				setReplacedBy((Context)newValue);
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
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT:
				setDeletedContext(DELETED_CONTEXT_EDEFAULT);
				return;
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__REPLACED_BY:
				setReplacedBy((Context)null);
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
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__DELETED_CONTEXT:
				return DELETED_CONTEXT_EDEFAULT == null ? deletedContext != null : !DELETED_CONTEXT_EDEFAULT.equals(deletedContext);
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS__REPLACED_BY:
				return replacedBy != null;
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
		result.append(" (deletedContext: ");
		result.append(deletedContext);
		result.append(')');
		return result.toString();
	}

} //DeletedContextInformationsImpl
