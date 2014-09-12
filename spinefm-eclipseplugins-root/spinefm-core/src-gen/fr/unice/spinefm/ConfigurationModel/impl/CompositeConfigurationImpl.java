/**
 */
package fr.unice.spinefm.ConfigurationModel.impl;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;
import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;
import fr.unice.spinefm.ConfigurationModel.Link;

import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

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
 * An implementation of the model object '<em><b>Composite Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl#getSubConfigurations <em>Sub Configurations</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl#getMspl <em>Mspl</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeConfigurationImpl extends EObjectImpl implements CompositeConfiguration
{
	/**
	 * The cached value of the '{@link #getSubConfigurations() <em>Sub Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> subConfigurations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMspl() <em>Mspl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMspl()
	 * @generated
	 * @ordered
	 */
	protected MultipleSoftwareProductLine mspl;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConfigurationImpl()
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
		return ConfigurationModelPackage.Literals.COMPOSITE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getSubConfigurations()
	{
		if (subConfigurations == null)
		{
			subConfigurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, ConfigurationModelPackage.COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS);
		}
		return subConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks()
	{
		if (links == null)
		{
			links = new EObjectContainmentEList<Link>(Link.class, this, ConfigurationModelPackage.COMPOSITE_CONFIGURATION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.COMPOSITE_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSoftwareProductLine getMspl()
	{
		if (mspl != null && mspl.eIsProxy())
		{
			InternalEObject oldMspl = (InternalEObject)mspl;
			mspl = (MultipleSoftwareProductLine)eResolveProxy(oldMspl);
			if (mspl != oldMspl)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.COMPOSITE_CONFIGURATION__MSPL, oldMspl, mspl));
			}
		}
		return mspl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSoftwareProductLine basicGetMspl()
	{
		return mspl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMspl(MultipleSoftwareProductLine newMspl)
	{
		MultipleSoftwareProductLine oldMspl = mspl;
		mspl = newMspl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.COMPOSITE_CONFIGURATION__MSPL, oldMspl, mspl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.COMPOSITE_CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() throws DomainElementNotFoundException
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
	public void addConfiguration(Configuration conf)
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
	public Configuration getConfigurationByName(String confName) throws ConfigNotFoundException
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
	public void createConfigurationLink(Configuration confSource, Configuration confTarget, DEAssociation asso) throws InvalidAssociationException, DomainElementNotFoundException
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
	public EList<Configuration> getCompatibleConfigurations(Configuration confSource, DEAssociation asso) throws InvalidAssociationException, IllegalCallException, FMEngineException, CPSNotFoundException, ElementNotFoundException
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
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS:
				return ((InternalEList<?>)getSubConfigurations()).basicRemove(otherEnd, msgs);
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS:
				return getSubConfigurations();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__LINKS:
				return getLinks();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__NAME:
				return getName();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__MSPL:
				if (resolve) return getMspl();
				return basicGetMspl();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__DESCRIPTION:
				return getDescription();
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
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS:
				getSubConfigurations().clear();
				getSubConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__MSPL:
				setMspl((MultipleSoftwareProductLine)newValue);
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
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
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS:
				getSubConfigurations().clear();
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__LINKS:
				getLinks().clear();
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__MSPL:
				setMspl((MultipleSoftwareProductLine)null);
				return;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS:
				return subConfigurations != null && !subConfigurations.isEmpty();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__LINKS:
				return links != null && !links.isEmpty();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__MSPL:
				return mspl != null;
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CompositeConfigurationImpl
