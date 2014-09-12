/**
 */
package fr.unice.spinefm.HistoryModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;
import fr.unice.spinefm.HistoryModel.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.StepImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.StepImpl#getLaunchingAction <em>Launching Action</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.StepImpl#getLaunchedActions <em>Launched Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends EObjectImpl implements Step
{
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
	 * The cached value of the '{@link #getLaunchingAction() <em>Launching Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchingAction()
	 * @generated
	 * @ordered
	 */
	protected UserAction launchingAction;

	/**
	 * The cached value of the '{@link #getLaunchedActions() <em>Launched Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAction> launchedActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl()
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
		return HistoryModelPackage.Literals.STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryModelPackage.STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAction getLaunchingAction()
	{
		return launchingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaunchingAction(UserAction newLaunchingAction, NotificationChain msgs)
	{
		UserAction oldLaunchingAction = launchingAction;
		launchingAction = newLaunchingAction;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HistoryModelPackage.STEP__LAUNCHING_ACTION, oldLaunchingAction, newLaunchingAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchingAction(UserAction newLaunchingAction)
	{
		if (newLaunchingAction != launchingAction)
		{
			NotificationChain msgs = null;
			if (launchingAction != null)
				msgs = ((InternalEObject)launchingAction).eInverseRemove(this, UserActionModelPackage.USER_ACTION__STEP, UserAction.class, msgs);
			if (newLaunchingAction != null)
				msgs = ((InternalEObject)newLaunchingAction).eInverseAdd(this, UserActionModelPackage.USER_ACTION__STEP, UserAction.class, msgs);
			msgs = basicSetLaunchingAction(newLaunchingAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryModelPackage.STEP__LAUNCHING_ACTION, newLaunchingAction, newLaunchingAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAction> getLaunchedActions()
	{
		if (launchedActions == null)
		{
			launchedActions = new EObjectContainmentWithInverseEList<SystemAction>(SystemAction.class, this, HistoryModelPackage.STEP__LAUNCHED_ACTIONS, SystemActionModelPackage.SYSTEM_ACTION__STEP);
		}
		return launchedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void undoActions()
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
	public String getDescription()
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
	public Step cloneStepWithoutSystemActions()
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case HistoryModelPackage.STEP__LAUNCHING_ACTION:
				if (launchingAction != null)
					msgs = ((InternalEObject)launchingAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HistoryModelPackage.STEP__LAUNCHING_ACTION, null, msgs);
				return basicSetLaunchingAction((UserAction)otherEnd, msgs);
			case HistoryModelPackage.STEP__LAUNCHED_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaunchedActions()).basicAdd(otherEnd, msgs);
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
			case HistoryModelPackage.STEP__LAUNCHING_ACTION:
				return basicSetLaunchingAction(null, msgs);
			case HistoryModelPackage.STEP__LAUNCHED_ACTIONS:
				return ((InternalEList<?>)getLaunchedActions()).basicRemove(otherEnd, msgs);
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
			case HistoryModelPackage.STEP__ID:
				return getId();
			case HistoryModelPackage.STEP__LAUNCHING_ACTION:
				return getLaunchingAction();
			case HistoryModelPackage.STEP__LAUNCHED_ACTIONS:
				return getLaunchedActions();
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
			case HistoryModelPackage.STEP__ID:
				setId((String)newValue);
				return;
			case HistoryModelPackage.STEP__LAUNCHING_ACTION:
				setLaunchingAction((UserAction)newValue);
				return;
			case HistoryModelPackage.STEP__LAUNCHED_ACTIONS:
				getLaunchedActions().clear();
				getLaunchedActions().addAll((Collection<? extends SystemAction>)newValue);
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
			case HistoryModelPackage.STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case HistoryModelPackage.STEP__LAUNCHING_ACTION:
				setLaunchingAction((UserAction)null);
				return;
			case HistoryModelPackage.STEP__LAUNCHED_ACTIONS:
				getLaunchedActions().clear();
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
			case HistoryModelPackage.STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HistoryModelPackage.STEP__LAUNCHING_ACTION:
				return launchingAction != null;
			case HistoryModelPackage.STEP__LAUNCHED_ACTIONS:
				return launchedActions != null && !launchedActions.isEmpty();
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

} //StepImpl
