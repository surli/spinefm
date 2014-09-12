/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.ActionMode;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;
import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl#getCpsHistory <em>Cps History</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SystemActionImpl extends EObjectImpl implements SystemAction
{
	/**
	 * The cached value of the '{@link #getCpsHistory() <em>Cps History</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpsHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cpsHistory;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionMode TYPE_EDEFAULT = ActionMode.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActionMode type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemActionImpl()
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
		return SystemActionModelPackage.Literals.SYSTEM_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCpsHistory()
	{
		if (cpsHistory == null)
		{
			cpsHistory = new EDataTypeUniqueEList<String>(String.class, this, SystemActionModelPackage.SYSTEM_ACTION__CPS_HISTORY);
		}
		return cpsHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep()
	{
		if (eContainerFeatureID() != SystemActionModelPackage.SYSTEM_ACTION__STEP) return null;
		return (Step)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newStep, SystemActionModelPackage.SYSTEM_ACTION__STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep)
	{
		if (newStep != eInternalContainer() || (eContainerFeatureID() != SystemActionModelPackage.SYSTEM_ACTION__STEP && newStep != null))
		{
			if (EcoreUtil.isAncestor(this, newStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, HistoryModelPackage.STEP__LAUNCHED_ACTIONS, Step.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.SYSTEM_ACTION__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMode getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActionMode newType)
	{
		ActionMode oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.SYSTEM_ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void apply() throws FMEngineException, ElementNotFoundException
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
	public boolean isSameObject(EObject o)
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
	public void undo()
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
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStep((Step)otherEnd, msgs);
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
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				return basicSetStep(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				return eInternalContainer().eInverseRemove(this, HistoryModelPackage.STEP__LAUNCHED_ACTIONS, Step.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case SystemActionModelPackage.SYSTEM_ACTION__CPS_HISTORY:
				return getCpsHistory();
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				return getStep();
			case SystemActionModelPackage.SYSTEM_ACTION__TYPE:
				return getType();
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
			case SystemActionModelPackage.SYSTEM_ACTION__CPS_HISTORY:
				getCpsHistory().clear();
				getCpsHistory().addAll((Collection<? extends String>)newValue);
				return;
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				setStep((Step)newValue);
				return;
			case SystemActionModelPackage.SYSTEM_ACTION__TYPE:
				setType((ActionMode)newValue);
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
			case SystemActionModelPackage.SYSTEM_ACTION__CPS_HISTORY:
				getCpsHistory().clear();
				return;
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				setStep((Step)null);
				return;
			case SystemActionModelPackage.SYSTEM_ACTION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SystemActionModelPackage.SYSTEM_ACTION__CPS_HISTORY:
				return cpsHistory != null && !cpsHistory.isEmpty();
			case SystemActionModelPackage.SYSTEM_ACTION__STEP:
				return getStep() != null;
			case SystemActionModelPackage.SYSTEM_ACTION__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (cpsHistory: ");
		result.append(cpsHistory);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SystemActionImpl
