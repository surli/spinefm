/**
 */
package fr.unice.spinefm.ProcessModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage;

import fr.unice.spinefm.FMModel.Feature;

import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.MSPLModel.DomainElement;

import fr.unice.spinefm.ProcessModel.CPSStatus;
import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import fr.unice.spinefm.RFModel.ConfigurationState;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;

import fr.unice.spinefm.fmengine.FMSpineFMAdapter;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getDomainElement <em>Domain Element</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getContext <em>Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#isUserConfig <em>User Config</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getHistory <em>History</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getState <em>State</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getActionsDone <em>Actions Done</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ConfigurationProcessStepImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationProcessStepImpl extends EObjectImpl implements ConfigurationProcessStep
{
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The default value of the '{@link #isUserConfig() <em>User Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserConfig()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_CONFIG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserConfig() <em>User Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserConfig()
	 * @generated
	 * @ordered
	 */
	protected boolean userConfig = USER_CONFIG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> history;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationState state;

	/**
	 * The cached value of the '{@link #getActionsDone() <em>Actions Done</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsDone()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionOnFM> actionsDone;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CPSStatus STATUS_EDEFAULT = CPSStatus.PARTIALLY_CONFIGURED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CPSStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationProcessStepImpl()
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
		return ProcessModelPackage.Literals.CONFIGURATION_PROCESS_STEP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT, oldDomainElement, domainElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT, oldDomainElement, domainElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getContext()
	{
		if (context != null && context.eIsProxy())
		{
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext()
	{
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Context newContext)
	{
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration()
	{
		if (configuration != null && configuration.eIsProxy())
		{
			InternalEObject oldConfiguration = (InternalEObject)configuration;
			configuration = (Configuration)eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration()
	{
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs)
	{
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration)
	{
		if (newConfiguration != configuration)
		{
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, ConfigurationModelPackage.CONFIGURATION__CPS_REF, Configuration.class, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, ConfigurationModelPackage.CONFIGURATION__CPS_REF, Configuration.class, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserConfig()
	{
		return userConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserConfig(boolean newUserConfig)
	{
		boolean oldUserConfig = userConfig;
		userConfig = newUserConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__USER_CONFIG, oldUserConfig, userConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHistory()
	{
		if (history == null)
		{
			history = new EDataTypeUniqueEList<String>(String.class, this, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__HISTORY);
		}
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationState getState()
	{
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(ConfigurationState newState, NotificationChain msgs)
	{
		ConfigurationState oldState = state;
		state = newState;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ConfigurationState newState)
	{
		if (newState != state)
		{
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionOnFM> getActionsDone()
	{
		if (actionsDone == null)
		{
			actionsDone = new EObjectResolvingEList<ActionOnFM>(ActionOnFM.class, this, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ACTIONS_DONE);
		}
		return actionsDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSStatus getStatus()
	{
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CPSStatus newStatus)
	{
		CPSStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComplete() throws FMEngineException
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
	public boolean alreadyHaveAction(ActionOnFM a) throws FMEngineException
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
	public String getConfName()
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
	public void setFMA(FMSpineFMAdapter fma, Step step) throws FMEngineException
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
	public boolean isMergeableWithCPS(ConfigurationProcessStep cps) throws FMEngineException, IllegalCallException, ElementNotFoundException
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
	public void mergeWithExternalCPS(ConfigurationProcessStep confCPS, Step step, ContextManager cm) throws FMEngineException, ElementNotFoundException
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
	public void captureImplicitActions(ActionOnFM aof, Step step) throws FMEngineException
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
	public void recordActionDone(ActionOnFM aof, Feature feature)
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
	public void setFeatureUnselected(Feature feature)
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION:
				if (configuration != null)
					msgs = ((InternalEObject)configuration).eInverseRemove(this, ConfigurationModelPackage.CONFIGURATION__CPS_REF, Configuration.class, msgs);
				return basicSetConfiguration((Configuration)otherEnd, msgs);
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE:
				return basicSetState(null, msgs);
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT:
				if (resolve) return getDomainElement();
				return basicGetDomainElement();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ID:
				return getId();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DESCRIPTION:
				return getDescription();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__USER_CONFIG:
				return isUserConfig();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__HISTORY:
				return getHistory();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE:
				return getState();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ACTIONS_DONE:
				return getActionsDone();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATUS:
				return getStatus();
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT:
				setDomainElement((DomainElement)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ID:
				setId((String)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONTEXT:
				setContext((Context)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__USER_CONFIG:
				setUserConfig((Boolean)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__HISTORY:
				getHistory().clear();
				getHistory().addAll((Collection<? extends String>)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE:
				setState((ConfigurationState)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ACTIONS_DONE:
				getActionsDone().clear();
				getActionsDone().addAll((Collection<? extends ActionOnFM>)newValue);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATUS:
				setStatus((CPSStatus)newValue);
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT:
				setDomainElement((DomainElement)null);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONTEXT:
				setContext((Context)null);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__USER_CONFIG:
				setUserConfig(USER_CONFIG_EDEFAULT);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__HISTORY:
				getHistory().clear();
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE:
				setState((ConfigurationState)null);
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ACTIONS_DONE:
				getActionsDone().clear();
				return;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DOMAIN_ELEMENT:
				return domainElement != null;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONTEXT:
				return context != null;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__CONFIGURATION:
				return configuration != null;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__USER_CONFIG:
				return userConfig != USER_CONFIG_EDEFAULT;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__HISTORY:
				return history != null && !history.isEmpty();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATE:
				return state != null;
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__ACTIONS_DONE:
				return actionsDone != null && !actionsDone.isEmpty();
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(", userConfig: ");
		result.append(userConfig);
		result.append(", history: ");
		result.append(history);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ConfigurationProcessStepImpl
