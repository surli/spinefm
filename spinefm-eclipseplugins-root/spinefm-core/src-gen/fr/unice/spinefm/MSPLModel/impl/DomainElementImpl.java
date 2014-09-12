/**
 */
package fr.unice.spinefm.MSPLModel.impl;

import fr.unice.spinefm.FMModel.FeatureModel;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;
import fr.unice.spinefm.MSPLModel.MultiplicityElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DomainElementImpl#getMultiplicityElement <em>Multiplicity Element</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DomainElementImpl#getRefers_on <em>Refers on</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DomainElementImpl#getBelongs_to <em>Belongs to</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DomainElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainElementImpl extends EObjectImpl implements DomainElement
{
	/**
	 * The cached value of the '{@link #getMultiplicityElement() <em>Multiplicity Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicityElement()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityElement multiplicityElement;

	/**
	 * The cached value of the '{@link #getRefers_on() <em>Refers on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefers_on()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel refers_on;

	/**
	 * The cached value of the '{@link #getBelongs_to() <em>Belongs to</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongs_to()
	 * @generated
	 * @ordered
	 */
	protected EList<DEAssociation> belongs_to;

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
	protected DomainElementImpl()
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
		return MSPLModelPackage.Literals.DOMAIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getMultiplicityElement()
	{
		return multiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicityElement(MultiplicityElement newMultiplicityElement, NotificationChain msgs)
	{
		MultiplicityElement oldMultiplicityElement = multiplicityElement;
		multiplicityElement = newMultiplicityElement;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT, oldMultiplicityElement, newMultiplicityElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicityElement(MultiplicityElement newMultiplicityElement)
	{
		if (newMultiplicityElement != multiplicityElement)
		{
			NotificationChain msgs = null;
			if (multiplicityElement != null)
				msgs = ((InternalEObject)multiplicityElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT, null, msgs);
			if (newMultiplicityElement != null)
				msgs = ((InternalEObject)newMultiplicityElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT, null, msgs);
			msgs = basicSetMultiplicityElement(newMultiplicityElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT, newMultiplicityElement, newMultiplicityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getRefers_on()
	{
		return refers_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefers_on(FeatureModel newRefers_on, NotificationChain msgs)
	{
		FeatureModel oldRefers_on = refers_on;
		refers_on = newRefers_on;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON, oldRefers_on, newRefers_on);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefers_on(FeatureModel newRefers_on)
	{
		if (newRefers_on != refers_on)
		{
			NotificationChain msgs = null;
			if (refers_on != null)
				msgs = ((InternalEObject)refers_on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON, null, msgs);
			if (newRefers_on != null)
				msgs = ((InternalEObject)newRefers_on).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON, null, msgs);
			msgs = basicSetRefers_on(newRefers_on, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON, newRefers_on, newRefers_on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DEAssociation> getBelongs_to()
	{
		if (belongs_to == null)
		{
			belongs_to = new EObjectResolvingEList<DEAssociation>(DEAssociation.class, this, MSPLModelPackage.DOMAIN_ELEMENT__BELONGS_TO);
		}
		return belongs_to;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DOMAIN_ELEMENT__ID, oldId, id));
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
			case MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT:
				return basicSetMultiplicityElement(null, msgs);
			case MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON:
				return basicSetRefers_on(null, msgs);
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
			case MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT:
				return getMultiplicityElement();
			case MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON:
				return getRefers_on();
			case MSPLModelPackage.DOMAIN_ELEMENT__BELONGS_TO:
				return getBelongs_to();
			case MSPLModelPackage.DOMAIN_ELEMENT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT:
				setMultiplicityElement((MultiplicityElement)newValue);
				return;
			case MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON:
				setRefers_on((FeatureModel)newValue);
				return;
			case MSPLModelPackage.DOMAIN_ELEMENT__BELONGS_TO:
				getBelongs_to().clear();
				getBelongs_to().addAll((Collection<? extends DEAssociation>)newValue);
				return;
			case MSPLModelPackage.DOMAIN_ELEMENT__ID:
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
			case MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT:
				setMultiplicityElement((MultiplicityElement)null);
				return;
			case MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON:
				setRefers_on((FeatureModel)null);
				return;
			case MSPLModelPackage.DOMAIN_ELEMENT__BELONGS_TO:
				getBelongs_to().clear();
				return;
			case MSPLModelPackage.DOMAIN_ELEMENT__ID:
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
			case MSPLModelPackage.DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT:
				return multiplicityElement != null;
			case MSPLModelPackage.DOMAIN_ELEMENT__REFERS_ON:
				return refers_on != null;
			case MSPLModelPackage.DOMAIN_ELEMENT__BELONGS_TO:
				return belongs_to != null && !belongs_to.isEmpty();
			case MSPLModelPackage.DOMAIN_ELEMENT__ID:
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

} //DomainElementImpl
