/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.FMModel.FeatureModel;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import fr.unice.spinefm.fmengine.FMSpineFMAdapter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action On FM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl#getFm <em>Fm</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl#getCps <em>Cps</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionOnFMImpl#getFma <em>Fma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionOnFMImpl extends SystemActionImplDelegate implements ActionOnFM
{
	/**
	 * The cached value of the '{@link #getFm() <em>Fm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFm()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel fm;

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
	 * The default value of the '{@link #getFma() <em>Fma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFma()
	 * @generated
	 * @ordered
	 */
	protected static final FMSpineFMAdapter FMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFma() <em>Fma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFma()
	 * @generated
	 * @ordered
	 */
	protected FMSpineFMAdapter fma = FMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionOnFMImpl()
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
		return SystemActionModelPackage.Literals.ACTION_ON_FM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getFm()
	{
		if (fm != null && fm.eIsProxy())
		{
			InternalEObject oldFm = (InternalEObject)fm;
			fm = (FeatureModel)eResolveProxy(oldFm);
			if (fm != oldFm)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_ON_FM__FM, oldFm, fm));
			}
		}
		return fm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel basicGetFm()
	{
		return fm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFm(FeatureModel newFm)
	{
		FeatureModel oldFm = fm;
		fm = newFm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_ON_FM__FM, oldFm, fm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_ON_FM__CPS, oldCps, cps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_ON_FM__CPS, oldCps, cps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMSpineFMAdapter getFma()
	{
		return fma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFma(FMSpineFMAdapter newFma)
	{
		FMSpineFMAdapter oldFma = fma;
		fma = newFma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_ON_FM__FMA, oldFma, fma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOnFM cloneAction()
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SystemActionModelPackage.ACTION_ON_FM__FM:
				if (resolve) return getFm();
				return basicGetFm();
			case SystemActionModelPackage.ACTION_ON_FM__CPS:
				if (resolve) return getCps();
				return basicGetCps();
			case SystemActionModelPackage.ACTION_ON_FM__FMA:
				return getFma();
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
			case SystemActionModelPackage.ACTION_ON_FM__FM:
				setFm((FeatureModel)newValue);
				return;
			case SystemActionModelPackage.ACTION_ON_FM__CPS:
				setCps((ConfigurationProcessStep)newValue);
				return;
			case SystemActionModelPackage.ACTION_ON_FM__FMA:
				setFma((FMSpineFMAdapter)newValue);
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
			case SystemActionModelPackage.ACTION_ON_FM__FM:
				setFm((FeatureModel)null);
				return;
			case SystemActionModelPackage.ACTION_ON_FM__CPS:
				setCps((ConfigurationProcessStep)null);
				return;
			case SystemActionModelPackage.ACTION_ON_FM__FMA:
				setFma(FMA_EDEFAULT);
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
			case SystemActionModelPackage.ACTION_ON_FM__FM:
				return fm != null;
			case SystemActionModelPackage.ACTION_ON_FM__CPS:
				return cps != null;
			case SystemActionModelPackage.ACTION_ON_FM__FMA:
				return FMA_EDEFAULT == null ? fma != null : !FMA_EDEFAULT.equals(fma);
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
		result.append(" (fma: ");
		result.append(fma);
		result.append(')');
		return result.toString();
	}

} //ActionOnFMImpl
