/**
 */
package fr.unice.spinefm.MSPLModel.impl;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;
import fr.unice.spinefm.MSPLModel.MSPLModelPackage;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

import fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

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
 * An implementation of the model object '<em><b>Multiple Software Product Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl#getDomainElements <em>Domain Elements</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl#getAssociations <em>Associations</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleSoftwareProductLineImpl extends EObjectImpl implements MultipleSoftwareProductLine
{
	/**
	 * The cached value of the '{@link #getDomainElements() <em>Domain Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainElement> domainElements;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<DEAssociation> associations;

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
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleSoftwareProductLineImpl()
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
		return MSPLModelPackage.Literals.MULTIPLE_SOFTWARE_PRODUCT_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainElement> getDomainElements()
	{
		if (domainElements == null)
		{
			domainElements = new EObjectContainmentEList<DomainElement>(DomainElement.class, this, MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS);
		}
		return domainElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DEAssociation> getAssociations()
	{
		if (associations == null)
		{
			associations = new EObjectContainmentEList<DEAssociation>(DEAssociation.class, this, MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS);
		}
		return associations;
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
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId()
	{
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId()
	{
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement getDomainElementByName(String name) throws DomainElementNotFoundException
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
	public EList<DEAssociation> getValidAssociationsForDEs(DomainElement source, DomainElement target) throws DEAssociationNotFoundException
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
	public DEAssociation getAssociationByName(String assoName) throws DEAssociationNotFoundException
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
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS:
				return ((InternalEList<?>)getDomainElements()).basicRemove(otherEnd, msgs);
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS:
				return getDomainElements();
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS:
				return getAssociations();
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ID:
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
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS:
				getDomainElements().clear();
				getDomainElements().addAll((Collection<? extends DomainElement>)newValue);
				return;
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends DEAssociation>)newValue);
				return;
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ID:
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
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS:
				getDomainElements().clear();
				return;
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS:
				getAssociations().clear();
				return;
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ID:
				unsetId();
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
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS:
				return domainElements != null && !domainElements.isEmpty();
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE__ID:
				return isSetId();
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
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MultipleSoftwareProductLineImpl
