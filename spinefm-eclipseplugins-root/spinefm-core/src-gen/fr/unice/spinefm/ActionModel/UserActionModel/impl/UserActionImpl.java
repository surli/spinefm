/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.impl;

import fr.unice.spinefm.ActionModel.ActionMode;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;
import fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;
import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.ProcessModel.ContextManager;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl#getContextManager <em>Context Manager</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UserActionImpl extends EObjectImpl implements UserAction
{
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
	 * The cached value of the '{@link #getContextManager() <em>Context Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextManager()
	 * @generated
	 * @ordered
	 */
	protected ContextManager contextManager;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EObject result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserActionImpl()
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
		return UserActionModelPackage.Literals.USER_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep()
	{
		if (eContainerFeatureID() != UserActionModelPackage.USER_ACTION__STEP) return null;
		return (Step)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newStep, UserActionModelPackage.USER_ACTION__STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep)
	{
		if (newStep != eInternalContainer() || (eContainerFeatureID() != UserActionModelPackage.USER_ACTION__STEP && newStep != null))
		{
			if (EcoreUtil.isAncestor(this, newStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, HistoryModelPackage.STEP__LAUNCHING_ACTION, Step.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_ACTION__STEP, newStep, newStep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager getContextManager()
	{
		if (contextManager != null && contextManager.eIsProxy())
		{
			InternalEObject oldContextManager = (InternalEObject)contextManager;
			contextManager = (ContextManager)eResolveProxy(oldContextManager);
			if (contextManager != oldContextManager)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserActionModelPackage.USER_ACTION__CONTEXT_MANAGER, oldContextManager, contextManager));
			}
		}
		return contextManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager basicGetContextManager()
	{
		return contextManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextManager(ContextManager newContextManager)
	{
		ContextManager oldContextManager = contextManager;
		contextManager = newContextManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_ACTION__CONTEXT_MANAGER, oldContextManager, contextManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getResult()
	{
		if (result != null && result.eIsProxy())
		{
			InternalEObject oldResult = (InternalEObject)result;
			result = eResolveProxy(oldResult);
			if (result != oldResult)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserActionModelPackage.USER_ACTION__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetResult()
	{
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(EObject newResult)
	{
		EObject oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserActionModelPackage.USER_ACTION__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void apply() throws ElementNotFoundException, FatalSpineFMException
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
	public void initManualAction(ContextManager contextManager)
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
	public UserAction cloneActionWithStringAttributes()
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
	public Boolean precondition()
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
	public void postcondition()
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
	public String transformContextNameToSave(String contextID)
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
			case UserActionModelPackage.USER_ACTION__STEP:
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
			case UserActionModelPackage.USER_ACTION__STEP:
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
			case UserActionModelPackage.USER_ACTION__STEP:
				return eInternalContainer().eInverseRemove(this, HistoryModelPackage.STEP__LAUNCHING_ACTION, Step.class, msgs);
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
			case UserActionModelPackage.USER_ACTION__STEP:
				return getStep();
			case UserActionModelPackage.USER_ACTION__TYPE:
				return getType();
			case UserActionModelPackage.USER_ACTION__CONTEXT_MANAGER:
				if (resolve) return getContextManager();
				return basicGetContextManager();
			case UserActionModelPackage.USER_ACTION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
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
			case UserActionModelPackage.USER_ACTION__STEP:
				setStep((Step)newValue);
				return;
			case UserActionModelPackage.USER_ACTION__TYPE:
				setType((ActionMode)newValue);
				return;
			case UserActionModelPackage.USER_ACTION__CONTEXT_MANAGER:
				setContextManager((ContextManager)newValue);
				return;
			case UserActionModelPackage.USER_ACTION__RESULT:
				setResult((EObject)newValue);
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
			case UserActionModelPackage.USER_ACTION__STEP:
				setStep((Step)null);
				return;
			case UserActionModelPackage.USER_ACTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UserActionModelPackage.USER_ACTION__CONTEXT_MANAGER:
				setContextManager((ContextManager)null);
				return;
			case UserActionModelPackage.USER_ACTION__RESULT:
				setResult((EObject)null);
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
			case UserActionModelPackage.USER_ACTION__STEP:
				return getStep() != null;
			case UserActionModelPackage.USER_ACTION__TYPE:
				return type != TYPE_EDEFAULT;
			case UserActionModelPackage.USER_ACTION__CONTEXT_MANAGER:
				return contextManager != null;
			case UserActionModelPackage.USER_ACTION__RESULT:
				return result != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //UserActionImpl
