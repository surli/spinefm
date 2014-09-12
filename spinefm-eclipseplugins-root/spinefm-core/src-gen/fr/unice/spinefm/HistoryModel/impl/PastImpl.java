/**
 */
package fr.unice.spinefm.HistoryModel.impl;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;

import fr.unice.spinefm.HistoryModel.HistoryModelPackage;
import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.ProcessModel.LocalContext;

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
 * An implementation of the model object '<em><b>Past</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.PastImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.PastImpl#getDeletedContext <em>Deleted Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.PastImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.PastImpl#getRootPath <em>Root Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.PastImpl#getModelPath <em>Model Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.impl.PastImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PastImpl extends EObjectImpl implements Past
{
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getDeletedContext() <em>Deleted Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedContext()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalContext> deletedContext;

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
	 * The default value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootPath() <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPath()
	 * @generated
	 * @ordered
	 */
	protected String rootPath = ROOT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected String modelPath = MODEL_PATH_EDEFAULT;

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
	protected PastImpl()
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
		return HistoryModelPackage.Literals.PAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps()
	{
		if (steps == null)
		{
			steps = new EObjectContainmentEList<Step>(Step.class, this, HistoryModelPackage.PAST__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalContext> getDeletedContext()
	{
		if (deletedContext == null)
		{
			deletedContext = new EObjectContainmentEList<LocalContext>(LocalContext.class, this, HistoryModelPackage.PAST__DELETED_CONTEXT);
		}
		return deletedContext;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryModelPackage.PAST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootPath()
	{
		return rootPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootPath(String newRootPath)
	{
		String oldRootPath = rootPath;
		rootPath = newRootPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryModelPackage.PAST__ROOT_PATH, oldRootPath, rootPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelPath()
	{
		return modelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelPath(String newModelPath)
	{
		String oldModelPath = modelPath;
		modelPath = newModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryModelPackage.PAST__MODEL_PATH, oldModelPath, modelPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryModelPackage.PAST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep(UserAction action)
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
	public void undoLastAction()
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
	public Past clonePastWithoutSystemActions()
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
	public void undoAction(Step step)
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
	public Step getStepFromId(String stepId)
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
			case HistoryModelPackage.PAST__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case HistoryModelPackage.PAST__DELETED_CONTEXT:
				return ((InternalEList<?>)getDeletedContext()).basicRemove(otherEnd, msgs);
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
			case HistoryModelPackage.PAST__STEPS:
				return getSteps();
			case HistoryModelPackage.PAST__DELETED_CONTEXT:
				return getDeletedContext();
			case HistoryModelPackage.PAST__ID:
				return getId();
			case HistoryModelPackage.PAST__ROOT_PATH:
				return getRootPath();
			case HistoryModelPackage.PAST__MODEL_PATH:
				return getModelPath();
			case HistoryModelPackage.PAST__DESCRIPTION:
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
			case HistoryModelPackage.PAST__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case HistoryModelPackage.PAST__DELETED_CONTEXT:
				getDeletedContext().clear();
				getDeletedContext().addAll((Collection<? extends LocalContext>)newValue);
				return;
			case HistoryModelPackage.PAST__ID:
				setId((String)newValue);
				return;
			case HistoryModelPackage.PAST__ROOT_PATH:
				setRootPath((String)newValue);
				return;
			case HistoryModelPackage.PAST__MODEL_PATH:
				setModelPath((String)newValue);
				return;
			case HistoryModelPackage.PAST__DESCRIPTION:
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
			case HistoryModelPackage.PAST__STEPS:
				getSteps().clear();
				return;
			case HistoryModelPackage.PAST__DELETED_CONTEXT:
				getDeletedContext().clear();
				return;
			case HistoryModelPackage.PAST__ID:
				setId(ID_EDEFAULT);
				return;
			case HistoryModelPackage.PAST__ROOT_PATH:
				setRootPath(ROOT_PATH_EDEFAULT);
				return;
			case HistoryModelPackage.PAST__MODEL_PATH:
				setModelPath(MODEL_PATH_EDEFAULT);
				return;
			case HistoryModelPackage.PAST__DESCRIPTION:
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
			case HistoryModelPackage.PAST__STEPS:
				return steps != null && !steps.isEmpty();
			case HistoryModelPackage.PAST__DELETED_CONTEXT:
				return deletedContext != null && !deletedContext.isEmpty();
			case HistoryModelPackage.PAST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case HistoryModelPackage.PAST__ROOT_PATH:
				return ROOT_PATH_EDEFAULT == null ? rootPath != null : !ROOT_PATH_EDEFAULT.equals(rootPath);
			case HistoryModelPackage.PAST__MODEL_PATH:
				return MODEL_PATH_EDEFAULT == null ? modelPath != null : !MODEL_PATH_EDEFAULT.equals(modelPath);
			case HistoryModelPackage.PAST__DESCRIPTION:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", rootPath: ");
		result.append(rootPath);
		result.append(", modelPath: ");
		result.append(modelPath);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PastImpl
