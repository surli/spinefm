/**
 */
package fr.unice.spinefm.MSPLModel.impl;

import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;
import fr.unice.spinefm.MSPLModel.MultiplicityElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DE Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl#getLinkMultiplicity <em>Link Multiplicity</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl#getApply_on <em>Apply on</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEAssociationEndImpl extends EObjectImpl implements DEAssociationEnd
{
	/**
	 * The cached value of the '{@link #getLinkMultiplicity() <em>Link Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityElement linkMultiplicity;

	/**
	 * The cached value of the '{@link #getApply_on() <em>Apply on</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply_on()
	 * @generated
	 * @ordered
	 */
	protected DomainElement apply_on;

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
	protected DEAssociationEndImpl()
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
		return MSPLModelPackage.Literals.DE_ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getLinkMultiplicity()
	{
		return linkMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkMultiplicity(MultiplicityElement newLinkMultiplicity, NotificationChain msgs)
	{
		MultiplicityElement oldLinkMultiplicity = linkMultiplicity;
		linkMultiplicity = newLinkMultiplicity;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY, oldLinkMultiplicity, newLinkMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkMultiplicity(MultiplicityElement newLinkMultiplicity)
	{
		if (newLinkMultiplicity != linkMultiplicity)
		{
			NotificationChain msgs = null;
			if (linkMultiplicity != null)
				msgs = ((InternalEObject)linkMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY, null, msgs);
			if (newLinkMultiplicity != null)
				msgs = ((InternalEObject)newLinkMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY, null, msgs);
			msgs = basicSetLinkMultiplicity(newLinkMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY, newLinkMultiplicity, newLinkMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement getApply_on()
	{
		if (apply_on != null && apply_on.eIsProxy())
		{
			InternalEObject oldApply_on = (InternalEObject)apply_on;
			apply_on = (DomainElement)eResolveProxy(oldApply_on);
			if (apply_on != oldApply_on)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MSPLModelPackage.DE_ASSOCIATION_END__APPLY_ON, oldApply_on, apply_on));
			}
		}
		return apply_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement basicGetApply_on()
	{
		return apply_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApply_on(DomainElement newApply_on)
	{
		DomainElement oldApply_on = apply_on;
		apply_on = newApply_on;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DE_ASSOCIATION_END__APPLY_ON, oldApply_on, apply_on));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DE_ASSOCIATION_END__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY:
				return basicSetLinkMultiplicity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY:
				return getLinkMultiplicity();
			case MSPLModelPackage.DE_ASSOCIATION_END__APPLY_ON:
				if (resolve) return getApply_on();
				return basicGetApply_on();
			case MSPLModelPackage.DE_ASSOCIATION_END__ID:
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
			case MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY:
				setLinkMultiplicity((MultiplicityElement)newValue);
				return;
			case MSPLModelPackage.DE_ASSOCIATION_END__APPLY_ON:
				setApply_on((DomainElement)newValue);
				return;
			case MSPLModelPackage.DE_ASSOCIATION_END__ID:
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
			case MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY:
				setLinkMultiplicity((MultiplicityElement)null);
				return;
			case MSPLModelPackage.DE_ASSOCIATION_END__APPLY_ON:
				setApply_on((DomainElement)null);
				return;
			case MSPLModelPackage.DE_ASSOCIATION_END__ID:
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
			case MSPLModelPackage.DE_ASSOCIATION_END__LINK_MULTIPLICITY:
				return linkMultiplicity != null;
			case MSPLModelPackage.DE_ASSOCIATION_END__APPLY_ON:
				return apply_on != null;
			case MSPLModelPackage.DE_ASSOCIATION_END__ID:
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

} //DEAssociationEndImpl
