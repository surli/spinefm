/**
 */
package fr.unice.spinefm.RFModel.impl;

import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;

import fr.unice.spinefm.RFModel.ConfigurationState;
import fr.unice.spinefm.RFModel.RFModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl#getSelectedFeatures <em>Selected Features</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl#getDeselectedFeatures <em>Deselected Features</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl#getFm <em>Fm</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationStateImpl extends EObjectImpl implements ConfigurationState
{
	/**
	 * The cached value of the '{@link #getSelectedFeatures() <em>Selected Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> selectedFeatures;

	/**
	 * The cached value of the '{@link #getDeselectedFeatures() <em>Deselected Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeselectedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> deselectedFeatures;

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
	protected ConfigurationStateImpl()
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
		return RFModelPackage.Literals.CONFIGURATION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSelectedFeatures()
	{
		if (selectedFeatures == null)
		{
			selectedFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, RFModelPackage.CONFIGURATION_STATE__SELECTED_FEATURES);
		}
		return selectedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDeselectedFeatures()
	{
		if (deselectedFeatures == null)
		{
			deselectedFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, RFModelPackage.CONFIGURATION_STATE__DESELECTED_FEATURES);
		}
		return deselectedFeatures;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RFModelPackage.CONFIGURATION_STATE__FM, oldFm, fm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RFModelPackage.CONFIGURATION_STATE__FM, oldFm, fm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RFModelPackage.CONFIGURATION_STATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludedIn(ConfigurationState otherState)
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
			case RFModelPackage.CONFIGURATION_STATE__SELECTED_FEATURES:
				return getSelectedFeatures();
			case RFModelPackage.CONFIGURATION_STATE__DESELECTED_FEATURES:
				return getDeselectedFeatures();
			case RFModelPackage.CONFIGURATION_STATE__FM:
				if (resolve) return getFm();
				return basicGetFm();
			case RFModelPackage.CONFIGURATION_STATE__ID:
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
			case RFModelPackage.CONFIGURATION_STATE__SELECTED_FEATURES:
				getSelectedFeatures().clear();
				getSelectedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case RFModelPackage.CONFIGURATION_STATE__DESELECTED_FEATURES:
				getDeselectedFeatures().clear();
				getDeselectedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case RFModelPackage.CONFIGURATION_STATE__FM:
				setFm((FeatureModel)newValue);
				return;
			case RFModelPackage.CONFIGURATION_STATE__ID:
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
			case RFModelPackage.CONFIGURATION_STATE__SELECTED_FEATURES:
				getSelectedFeatures().clear();
				return;
			case RFModelPackage.CONFIGURATION_STATE__DESELECTED_FEATURES:
				getDeselectedFeatures().clear();
				return;
			case RFModelPackage.CONFIGURATION_STATE__FM:
				setFm((FeatureModel)null);
				return;
			case RFModelPackage.CONFIGURATION_STATE__ID:
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
			case RFModelPackage.CONFIGURATION_STATE__SELECTED_FEATURES:
				return selectedFeatures != null && !selectedFeatures.isEmpty();
			case RFModelPackage.CONFIGURATION_STATE__DESELECTED_FEATURES:
				return deselectedFeatures != null && !deselectedFeatures.isEmpty();
			case RFModelPackage.CONFIGURATION_STATE__FM:
				return fm != null;
			case RFModelPackage.CONFIGURATION_STATE__ID:
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

} //ConfigurationStateImpl
