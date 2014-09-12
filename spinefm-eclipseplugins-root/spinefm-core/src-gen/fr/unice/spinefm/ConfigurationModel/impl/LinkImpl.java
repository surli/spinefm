/**
 */
package fr.unice.spinefm.ConfigurationModel.impl;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;
import fr.unice.spinefm.ConfigurationModel.Link;

import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;

import fr.unice.spinefm.MSPLModel.DEAssociation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.LinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.LinkImpl#getRelatedAssociation <em>Related Association</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.LinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.LinkImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link
{
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Configuration source;

	/**
	 * The cached value of the '{@link #getRelatedAssociation() <em>Related Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAssociation()
	 * @generated
	 * @ordered
	 */
	protected DEAssociation relatedAssociation;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Configuration target;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl()
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
		return ConfigurationModelPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (Configuration)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetSource()
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Configuration newSource)
	{
		Configuration oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociation getRelatedAssociation()
	{
		if (relatedAssociation != null && relatedAssociation.eIsProxy())
		{
			InternalEObject oldRelatedAssociation = (InternalEObject)relatedAssociation;
			relatedAssociation = (DEAssociation)eResolveProxy(oldRelatedAssociation);
			if (relatedAssociation != oldRelatedAssociation)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.LINK__RELATED_ASSOCIATION, oldRelatedAssociation, relatedAssociation));
			}
		}
		return relatedAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociation basicGetRelatedAssociation()
	{
		return relatedAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAssociation(DEAssociation newRelatedAssociation)
	{
		DEAssociation oldRelatedAssociation = relatedAssociation;
		relatedAssociation = newRelatedAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.LINK__RELATED_ASSOCIATION, oldRelatedAssociation, relatedAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Configuration)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetTarget()
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Configuration newTarget)
	{
		Configuration oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId)
	{
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.LINK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getAssociatedConfiguration(Configuration conf) throws ConfigNotFoundException
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ConfigurationModelPackage.LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ConfigurationModelPackage.LINK__RELATED_ASSOCIATION:
				if (resolve) return getRelatedAssociation();
				return basicGetRelatedAssociation();
			case ConfigurationModelPackage.LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ConfigurationModelPackage.LINK__ID:
				return getId();
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
			case ConfigurationModelPackage.LINK__SOURCE:
				setSource((Configuration)newValue);
				return;
			case ConfigurationModelPackage.LINK__RELATED_ASSOCIATION:
				setRelatedAssociation((DEAssociation)newValue);
				return;
			case ConfigurationModelPackage.LINK__TARGET:
				setTarget((Configuration)newValue);
				return;
			case ConfigurationModelPackage.LINK__ID:
				setId((String)newValue);
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
			case ConfigurationModelPackage.LINK__SOURCE:
				setSource((Configuration)null);
				return;
			case ConfigurationModelPackage.LINK__RELATED_ASSOCIATION:
				setRelatedAssociation((DEAssociation)null);
				return;
			case ConfigurationModelPackage.LINK__TARGET:
				setTarget((Configuration)null);
				return;
			case ConfigurationModelPackage.LINK__ID:
				setId(ID_EDEFAULT);
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
			case ConfigurationModelPackage.LINK__SOURCE:
				return source != null;
			case ConfigurationModelPackage.LINK__RELATED_ASSOCIATION:
				return relatedAssociation != null;
			case ConfigurationModelPackage.LINK__TARGET:
				return target != null;
			case ConfigurationModelPackage.LINK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
