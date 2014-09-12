/**
 */
package fr.unice.spinefm.ConfigurationModel.impl;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;
import fr.unice.spinefm.ConfigurationModel.Link;

import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;

import fr.unice.spinefm.FMModel.FeatureModel;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import fr.unice.spinefm.RFModel.ConfigurationState;

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
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getCPSRef <em>CPS Ref</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getBelongs_to <em>Belongs to</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getState <em>State</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getDomainElement <em>Domain Element</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl#getClonedCPS <em>Cloned CPS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration
{
	/**
	 * The cached value of the '{@link #getCPSRef() <em>CPS Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPSRef()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationProcessStep cpsRef;

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
	 * The cached value of the '{@link #getBelongs_to() <em>Belongs to</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongs_to()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> belongs_to;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationState state;

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
	 * The cached value of the '{@link #getDomainElement() <em>Domain Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainElement()
	 * @generated
	 * @ordered
	 */
	protected DomainElement domainElement;

	/**
	 * The cached value of the '{@link #getClonedCPS() <em>Cloned CPS</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClonedCPS()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationProcessStep> clonedCPS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl()
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
		return ConfigurationModelPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep getCPSRef()
	{
		if (cpsRef != null && cpsRef.eIsProxy())
		{
			InternalEObject oldCPSRef = (InternalEObject)cpsRef;
			cpsRef = (ConfigurationProcessStep)eResolveProxy(oldCPSRef);
			if (cpsRef != oldCPSRef)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.CONFIGURATION__CPS_REF, oldCPSRef, cpsRef));
			}
		}
		return cpsRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep basicGetCPSRef()
	{
		return cpsRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCPSRef(ConfigurationProcessStep newCPSRef, NotificationChain msgs)
	{
		ConfigurationProcessStep oldCPSRef = cpsRef;
		cpsRef = newCPSRef;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.CONFIGURATION__CPS_REF, oldCPSRef, newCPSRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPSRef(ConfigurationProcessStep newCPSRef)
	{
		if (newCPSRef != cpsRef)
		{
			NotificationChain msgs = null;
			if (cpsRef != null)
				msgs = ((InternalEObject)cpsRef).eInverseRemove(this, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION, ConfigurationProcessStep.class, msgs);
			if (newCPSRef != null)
				msgs = ((InternalEObject)newCPSRef).eInverseAdd(this, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION, ConfigurationProcessStep.class, msgs);
			msgs = basicSetCPSRef(newCPSRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.CONFIGURATION__CPS_REF, newCPSRef, newCPSRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.CONFIGURATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getBelongs_to()
	{
		if (belongs_to == null)
		{
			belongs_to = new EObjectResolvingEList<Link>(Link.class, this, ConfigurationModelPackage.CONFIGURATION__BELONGS_TO);
		}
		return belongs_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationState getState()
	{
		if (state != null && state.eIsProxy())
		{
			InternalEObject oldState = (InternalEObject)state;
			state = (ConfigurationState)eResolveProxy(oldState);
			if (state != oldState)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.CONFIGURATION__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationState basicGetState()
	{
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ConfigurationState newState)
	{
		ConfigurationState oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.CONFIGURATION__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement getDomainElement()
	{
		if (domainElement != null && domainElement.eIsProxy())
		{
			InternalEObject oldDomainElement = (InternalEObject)domainElement;
			domainElement = (DomainElement)eResolveProxy(oldDomainElement);
			if (domainElement != oldDomainElement)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationModelPackage.CONFIGURATION__DOMAIN_ELEMENT, oldDomainElement, domainElement));
			}
		}
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement basicGetDomainElement()
	{
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainElement(DomainElement newDomainElement)
	{
		DomainElement oldDomainElement = domainElement;
		domainElement = newDomainElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationModelPackage.CONFIGURATION__DOMAIN_ELEMENT, oldDomainElement, domainElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationProcessStep> getClonedCPS()
	{
		if (clonedCPS == null)
		{
			clonedCPS = new EObjectResolvingEList<ConfigurationProcessStep>(ConfigurationProcessStep.class, this, ConfigurationModelPackage.CONFIGURATION__CLONED_CPS);
		}
		return clonedCPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canBeLinked(DEAssociation association) throws DomainElementNotFoundException
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
	public FeatureModel getFeatureModel()
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
	public EList<Configuration> getLinkedConfigurationsOfDomainElement(DomainElement de) throws ConfigNotFoundException
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
	public boolean isCompletlyLinked() throws ConfigNotFoundException, DomainElementNotFoundException
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
	public EList<ConfigurationProcessStep> getAllCPS()
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ConfigurationModelPackage.CONFIGURATION__CPS_REF:
				if (cpsRef != null)
					msgs = ((InternalEObject)cpsRef).eInverseRemove(this, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION, ConfigurationProcessStep.class, msgs);
				return basicSetCPSRef((ConfigurationProcessStep)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case ConfigurationModelPackage.CONFIGURATION__CPS_REF:
				return basicSetCPSRef(null, msgs);
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
			case ConfigurationModelPackage.CONFIGURATION__CPS_REF:
				if (resolve) return getCPSRef();
				return basicGetCPSRef();
			case ConfigurationModelPackage.CONFIGURATION__ID:
				return getId();
			case ConfigurationModelPackage.CONFIGURATION__BELONGS_TO:
				return getBelongs_to();
			case ConfigurationModelPackage.CONFIGURATION__STATE:
				if (resolve) return getState();
				return basicGetState();
			case ConfigurationModelPackage.CONFIGURATION__DESCRIPTION:
				return getDescription();
			case ConfigurationModelPackage.CONFIGURATION__DOMAIN_ELEMENT:
				if (resolve) return getDomainElement();
				return basicGetDomainElement();
			case ConfigurationModelPackage.CONFIGURATION__CLONED_CPS:
				return getClonedCPS();
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
			case ConfigurationModelPackage.CONFIGURATION__CPS_REF:
				setCPSRef((ConfigurationProcessStep)newValue);
				return;
			case ConfigurationModelPackage.CONFIGURATION__ID:
				setId((String)newValue);
				return;
			case ConfigurationModelPackage.CONFIGURATION__BELONGS_TO:
				getBelongs_to().clear();
				getBelongs_to().addAll((Collection<? extends Link>)newValue);
				return;
			case ConfigurationModelPackage.CONFIGURATION__STATE:
				setState((ConfigurationState)newValue);
				return;
			case ConfigurationModelPackage.CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConfigurationModelPackage.CONFIGURATION__DOMAIN_ELEMENT:
				setDomainElement((DomainElement)newValue);
				return;
			case ConfigurationModelPackage.CONFIGURATION__CLONED_CPS:
				getClonedCPS().clear();
				getClonedCPS().addAll((Collection<? extends ConfigurationProcessStep>)newValue);
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
			case ConfigurationModelPackage.CONFIGURATION__CPS_REF:
				setCPSRef((ConfigurationProcessStep)null);
				return;
			case ConfigurationModelPackage.CONFIGURATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ConfigurationModelPackage.CONFIGURATION__BELONGS_TO:
				getBelongs_to().clear();
				return;
			case ConfigurationModelPackage.CONFIGURATION__STATE:
				setState((ConfigurationState)null);
				return;
			case ConfigurationModelPackage.CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConfigurationModelPackage.CONFIGURATION__DOMAIN_ELEMENT:
				setDomainElement((DomainElement)null);
				return;
			case ConfigurationModelPackage.CONFIGURATION__CLONED_CPS:
				getClonedCPS().clear();
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
			case ConfigurationModelPackage.CONFIGURATION__CPS_REF:
				return cpsRef != null;
			case ConfigurationModelPackage.CONFIGURATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConfigurationModelPackage.CONFIGURATION__BELONGS_TO:
				return belongs_to != null && !belongs_to.isEmpty();
			case ConfigurationModelPackage.CONFIGURATION__STATE:
				return state != null;
			case ConfigurationModelPackage.CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConfigurationModelPackage.CONFIGURATION__DOMAIN_ELEMENT:
				return domainElement != null;
			case ConfigurationModelPackage.CONFIGURATION__CLONED_CPS:
				return clonedCPS != null && !clonedCPS.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
