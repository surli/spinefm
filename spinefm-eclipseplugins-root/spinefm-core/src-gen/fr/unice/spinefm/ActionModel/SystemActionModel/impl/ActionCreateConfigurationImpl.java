/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Create Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateConfigurationImpl#getCps <em>Cps</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionCreateConfigurationImpl#getCompconf <em>Compconf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionCreateConfigurationImpl extends SystemActionImplDelegate implements ActionCreateConfiguration
{
	/**
	 * The cached value of the '{@link #getCps() <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCps()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationProcessStep cps;

	/**
	 * The cached value of the '{@link #getCompconf() <em>Compconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompconf()
	 * @generated
	 * @ordered
	 */
	protected CompositeConfiguration compconf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionCreateConfigurationImpl()
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
		return SystemActionModelPackage.Literals.ACTION_CREATE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep getCps()
	{
		if (cps != null && cps.eIsProxy())
		{
			InternalEObject oldCps = (InternalEObject)cps;
			cps = (ConfigurationProcessStep)eResolveProxy(oldCps);
			if (cps != oldCps)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__CPS, oldCps, cps));
			}
		}
		return cps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep basicGetCps()
	{
		return cps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCps(ConfigurationProcessStep newCps)
	{
		ConfigurationProcessStep oldCps = cps;
		cps = newCps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__CPS, oldCps, cps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConfiguration getCompconf()
	{
		if (compconf != null && compconf.eIsProxy())
		{
			InternalEObject oldCompconf = (InternalEObject)compconf;
			compconf = (CompositeConfiguration)eResolveProxy(oldCompconf);
			if (compconf != oldCompconf)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__COMPCONF, oldCompconf, compconf));
			}
		}
		return compconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConfiguration basicGetCompconf()
	{
		return compconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompconf(CompositeConfiguration newCompconf)
	{
		CompositeConfiguration oldCompconf = compconf;
		compconf = newCompconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__COMPCONF, oldCompconf, compconf));
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
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__CPS:
				if (resolve) return getCps();
				return basicGetCps();
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__COMPCONF:
				if (resolve) return getCompconf();
				return basicGetCompconf();
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
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__CPS:
				setCps((ConfigurationProcessStep)newValue);
				return;
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__COMPCONF:
				setCompconf((CompositeConfiguration)newValue);
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
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__CPS:
				setCps((ConfigurationProcessStep)null);
				return;
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__COMPCONF:
				setCompconf((CompositeConfiguration)null);
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
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__CPS:
				return cps != null;
			case SystemActionModelPackage.ACTION_CREATE_CONFIGURATION__COMPCONF:
				return compconf != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionCreateConfigurationImpl
