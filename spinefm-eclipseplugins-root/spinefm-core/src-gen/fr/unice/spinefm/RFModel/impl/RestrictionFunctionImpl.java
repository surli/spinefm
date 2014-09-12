/**
 */
package fr.unice.spinefm.RFModel.impl;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

import fr.unice.spinefm.MSPLModel.DomainElement;

import fr.unice.spinefm.RFModel.RFModelPackage;
import fr.unice.spinefm.RFModel.RestrictionFunction;
import fr.unice.spinefm.RFModel.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl#getInverse <em>Inverse</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionFunctionImpl extends EObjectImpl implements RestrictionFunction
{
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
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverse()
	 * @generated
	 * @ordered
	 */
	protected RestrictionFunction inverse;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DomainElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DomainElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionFunctionImpl()
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
		return RFModelPackage.Literals.RESTRICTION_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RFModelPackage.RESTRICTION_FUNCTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules()
	{
		if (rules == null)
		{
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, RFModelPackage.RESTRICTION_FUNCTION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionFunction getInverse()
	{
		if (inverse != null && inverse.eIsProxy())
		{
			InternalEObject oldInverse = (InternalEObject)inverse;
			inverse = (RestrictionFunction)eResolveProxy(oldInverse);
			if (inverse != oldInverse)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RFModelPackage.RESTRICTION_FUNCTION__INVERSE, oldInverse, inverse));
			}
		}
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionFunction basicGetInverse()
	{
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(RestrictionFunction newInverse)
	{
		RestrictionFunction oldInverse = inverse;
		inverse = newInverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RFModelPackage.RESTRICTION_FUNCTION__INVERSE, oldInverse, inverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (DomainElement)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RFModelPackage.RESTRICTION_FUNCTION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement basicGetSource()
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DomainElement newSource)
	{
		DomainElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RFModelPackage.RESTRICTION_FUNCTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (DomainElement)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RFModelPackage.RESTRICTION_FUNCTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement basicGetTarget()
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DomainElement newTarget)
	{
		DomainElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RFModelPackage.RESTRICTION_FUNCTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionFunction createAndAssociateInverseRestFunc() throws FeatureNotFoundException
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RFModelPackage.RESTRICTION_FUNCTION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case RFModelPackage.RESTRICTION_FUNCTION__ID:
				return getId();
			case RFModelPackage.RESTRICTION_FUNCTION__RULES:
				return getRules();
			case RFModelPackage.RESTRICTION_FUNCTION__INVERSE:
				if (resolve) return getInverse();
				return basicGetInverse();
			case RFModelPackage.RESTRICTION_FUNCTION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case RFModelPackage.RESTRICTION_FUNCTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case RFModelPackage.RESTRICTION_FUNCTION__ID:
				setId((String)newValue);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__INVERSE:
				setInverse((RestrictionFunction)newValue);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__SOURCE:
				setSource((DomainElement)newValue);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__TARGET:
				setTarget((DomainElement)newValue);
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
			case RFModelPackage.RESTRICTION_FUNCTION__ID:
				setId(ID_EDEFAULT);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__RULES:
				getRules().clear();
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__INVERSE:
				setInverse((RestrictionFunction)null);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__SOURCE:
				setSource((DomainElement)null);
				return;
			case RFModelPackage.RESTRICTION_FUNCTION__TARGET:
				setTarget((DomainElement)null);
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
			case RFModelPackage.RESTRICTION_FUNCTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RFModelPackage.RESTRICTION_FUNCTION__RULES:
				return rules != null && !rules.isEmpty();
			case RFModelPackage.RESTRICTION_FUNCTION__INVERSE:
				return inverse != null;
			case RFModelPackage.RESTRICTION_FUNCTION__SOURCE:
				return source != null;
			case RFModelPackage.RESTRICTION_FUNCTION__TARGET:
				return target != null;
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

} //RestrictionFunctionImpl
