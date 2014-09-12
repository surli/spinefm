/**
 */
package fr.unice.spinefm.MSPLModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DEAssociationEnd;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import fr.unice.spinefm.RFModel.RestrictionFunction;

import fr.unice.spinefm.exceptions.IllegalCallException;

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
 * An implementation of the model object '<em><b>DE Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl#getRestrictionFunction <em>Restriction Function</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl#getExtremity <em>Extremity</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEAssociationImpl extends EObjectImpl implements DEAssociation
{
	/**
	 * The cached value of the '{@link #getRestrictionFunction() <em>Restriction Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<RestrictionFunction> restrictionFunction;

	/**
	 * The cached value of the '{@link #getExtremity() <em>Extremity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremity()
	 * @generated
	 * @ordered
	 */
	protected EList<DEAssociationEnd> extremity;

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
	protected DEAssociationImpl()
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
		return MSPLModelPackage.Literals.DE_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestrictionFunction> getRestrictionFunction()
	{
		if (restrictionFunction == null)
		{
			restrictionFunction = new EObjectContainmentEList<RestrictionFunction>(RestrictionFunction.class, this, MSPLModelPackage.DE_ASSOCIATION__RESTRICTION_FUNCTION);
		}
		return restrictionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DEAssociationEnd> getExtremity()
	{
		if (extremity == null)
		{
			extremity = new EObjectContainmentEList<DEAssociationEnd>(DEAssociationEnd.class, this, MSPLModelPackage.DE_ASSOCIATION__EXTREMITY);
		}
		return extremity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.DE_ASSOCIATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionOnFM> computeActionsToDo(ConfigurationProcessStep CPSSource, ConfigurationProcessStep CPSTarget) throws IllegalCallException
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
	public void createAndAssociateInverseAssociation() throws FeatureNotFoundException
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
	public boolean isLinkBetweenDEs(DomainElement firstExtremity, DomainElement secondExtremity)
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
	public DEAssociationEnd getOppositeExtremity(DomainElement source) throws DomainElementNotFoundException
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
	public DEAssociationEnd getExtremityOfDE(DomainElement de) throws DomainElementNotFoundException
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
			case MSPLModelPackage.DE_ASSOCIATION__RESTRICTION_FUNCTION:
				return ((InternalEList<?>)getRestrictionFunction()).basicRemove(otherEnd, msgs);
			case MSPLModelPackage.DE_ASSOCIATION__EXTREMITY:
				return ((InternalEList<?>)getExtremity()).basicRemove(otherEnd, msgs);
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
			case MSPLModelPackage.DE_ASSOCIATION__RESTRICTION_FUNCTION:
				return getRestrictionFunction();
			case MSPLModelPackage.DE_ASSOCIATION__EXTREMITY:
				return getExtremity();
			case MSPLModelPackage.DE_ASSOCIATION__ID:
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
			case MSPLModelPackage.DE_ASSOCIATION__RESTRICTION_FUNCTION:
				getRestrictionFunction().clear();
				getRestrictionFunction().addAll((Collection<? extends RestrictionFunction>)newValue);
				return;
			case MSPLModelPackage.DE_ASSOCIATION__EXTREMITY:
				getExtremity().clear();
				getExtremity().addAll((Collection<? extends DEAssociationEnd>)newValue);
				return;
			case MSPLModelPackage.DE_ASSOCIATION__ID:
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
			case MSPLModelPackage.DE_ASSOCIATION__RESTRICTION_FUNCTION:
				getRestrictionFunction().clear();
				return;
			case MSPLModelPackage.DE_ASSOCIATION__EXTREMITY:
				getExtremity().clear();
				return;
			case MSPLModelPackage.DE_ASSOCIATION__ID:
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
			case MSPLModelPackage.DE_ASSOCIATION__RESTRICTION_FUNCTION:
				return restrictionFunction != null && !restrictionFunction.isEmpty();
			case MSPLModelPackage.DE_ASSOCIATION__EXTREMITY:
				return extremity != null && !extremity.isEmpty();
			case MSPLModelPackage.DE_ASSOCIATION__ID:
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

} //DEAssociationImpl
