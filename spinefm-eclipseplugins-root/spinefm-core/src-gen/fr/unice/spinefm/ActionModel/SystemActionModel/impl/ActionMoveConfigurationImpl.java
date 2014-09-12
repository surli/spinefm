/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.ConfigurationModel.Configuration;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Move Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl#getCpsSource <em>Cps Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionMoveConfigurationImpl#getCpsTarget <em>Cps Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionMoveConfigurationImpl extends SystemActionImplDelegate implements ActionMoveConfiguration
{
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
	 * The cached value of the '{@link #getCpsSource() <em>Cps Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpsSource()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationProcessStep cpsSource;

	/**
	 * The cached value of the '{@link #getCpsTarget() <em>Cps Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpsTarget()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationProcessStep cpsTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionMoveConfigurationImpl()
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
		return SystemActionModelPackage.Literals.ACTION_MOVE_CONFIGURATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
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
	public void setConfiguration(Configuration newConfiguration)
	{
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep getCpsSource()
	{
		if (cpsSource != null && cpsSource.eIsProxy())
		{
			InternalEObject oldCpsSource = (InternalEObject)cpsSource;
			cpsSource = (ConfigurationProcessStep)eResolveProxy(oldCpsSource);
			if (cpsSource != oldCpsSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_SOURCE, oldCpsSource, cpsSource));
			}
		}
		return cpsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep basicGetCpsSource()
	{
		return cpsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpsSource(ConfigurationProcessStep newCpsSource)
	{
		ConfigurationProcessStep oldCpsSource = cpsSource;
		cpsSource = newCpsSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_SOURCE, oldCpsSource, cpsSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep getCpsTarget()
	{
		if (cpsTarget != null && cpsTarget.eIsProxy())
		{
			InternalEObject oldCpsTarget = (InternalEObject)cpsTarget;
			cpsTarget = (ConfigurationProcessStep)eResolveProxy(oldCpsTarget);
			if (cpsTarget != oldCpsTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_TARGET, oldCpsTarget, cpsTarget));
			}
		}
		return cpsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep basicGetCpsTarget()
	{
		return cpsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpsTarget(ConfigurationProcessStep newCpsTarget)
	{
		ConfigurationProcessStep oldCpsTarget = cpsTarget;
		cpsTarget = newCpsTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_TARGET, oldCpsTarget, cpsTarget));
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
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CONFIGURATION:
				if (resolve) return getConfiguration();
				return basicGetConfiguration();
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_SOURCE:
				if (resolve) return getCpsSource();
				return basicGetCpsSource();
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_TARGET:
				if (resolve) return getCpsTarget();
				return basicGetCpsTarget();
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
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_SOURCE:
				setCpsSource((ConfigurationProcessStep)newValue);
				return;
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_TARGET:
				setCpsTarget((ConfigurationProcessStep)newValue);
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
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_SOURCE:
				setCpsSource((ConfigurationProcessStep)null);
				return;
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_TARGET:
				setCpsTarget((ConfigurationProcessStep)null);
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
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CONFIGURATION:
				return configuration != null;
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_SOURCE:
				return cpsSource != null;
			case SystemActionModelPackage.ACTION_MOVE_CONFIGURATION__CPS_TARGET:
				return cpsTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionMoveConfigurationImpl
