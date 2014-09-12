/**
 */
package fr.unice.spinefm.ProcessModel.impl;

import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;
import fr.unice.spinefm.ProcessModel.Context;
import fr.unice.spinefm.ProcessModel.ContextManager;
import fr.unice.spinefm.ProcessModel.GlobalContext;
import fr.unice.spinefm.ProcessModel.LocalContext;
import fr.unice.spinefm.ProcessModel.ProcessModelPackage;

import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl#getMspl <em>Mspl</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl#getGlobalContext <em>Global Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl#getLocalContexts <em>Local Contexts</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl#getFma <em>Fma</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl#getPast <em>Past</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.impl.ContextManagerImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextManagerImpl extends EObjectImpl implements ContextManager
{
	/**
	 * The cached value of the '{@link #getMspl() <em>Mspl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMspl()
	 * @generated
	 * @ordered
	 */
	protected MultipleSoftwareProductLine mspl;

	/**
	 * The cached value of the '{@link #getGlobalContext() <em>Global Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalContext()
	 * @generated
	 * @ordered
	 */
	protected GlobalContext globalContext;

	/**
	 * The cached value of the '{@link #getLocalContexts() <em>Local Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalContext> localContexts;

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
	 * The cached value of the '{@link #getPast() <em>Past</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPast()
	 * @generated
	 * @ordered
	 */
	protected Past past;

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
	protected ContextManagerImpl()
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
		return ProcessModelPackage.Literals.CONTEXT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSoftwareProductLine getMspl()
	{
		if (mspl != null && mspl.eIsProxy())
		{
			InternalEObject oldMspl = (InternalEObject)mspl;
			mspl = (MultipleSoftwareProductLine)eResolveProxy(oldMspl);
			if (mspl != oldMspl)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessModelPackage.CONTEXT_MANAGER__MSPL, oldMspl, mspl));
			}
		}
		return mspl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSoftwareProductLine basicGetMspl()
	{
		return mspl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMspl(MultipleSoftwareProductLine newMspl)
	{
		MultipleSoftwareProductLine oldMspl = mspl;
		mspl = newMspl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__MSPL, oldMspl, mspl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalContext getGlobalContext()
	{
		return globalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalContext(GlobalContext newGlobalContext, NotificationChain msgs)
	{
		GlobalContext oldGlobalContext = globalContext;
		globalContext = newGlobalContext;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT, oldGlobalContext, newGlobalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalContext(GlobalContext newGlobalContext)
	{
		if (newGlobalContext != globalContext)
		{
			NotificationChain msgs = null;
			if (globalContext != null)
				msgs = ((InternalEObject)globalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT, null, msgs);
			if (newGlobalContext != null)
				msgs = ((InternalEObject)newGlobalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT, null, msgs);
			msgs = basicSetGlobalContext(newGlobalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT, newGlobalContext, newGlobalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalContext> getLocalContexts()
	{
		if (localContexts == null)
		{
			localContexts = new EObjectContainmentEList<LocalContext>(LocalContext.class, this, ProcessModelPackage.CONTEXT_MANAGER__LOCAL_CONTEXTS);
		}
		return localContexts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__FMA, oldFma, fma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Past getPast()
	{
		return past;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPast(Past newPast, NotificationChain msgs)
	{
		Past oldPast = past;
		past = newPast;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__PAST, oldPast, newPast);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPast(Past newPast)
	{
		if (newPast != past)
		{
			NotificationChain msgs = null;
			if (past != null)
				msgs = ((InternalEObject)past).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessModelPackage.CONTEXT_MANAGER__PAST, null, msgs);
			if (newPast != null)
				msgs = ((InternalEObject)newPast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessModelPackage.CONTEXT_MANAGER__PAST, null, msgs);
			msgs = basicSetPast(newPast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__PAST, newPast, newPast));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessModelPackage.CONTEXT_MANAGER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void propagate(ConfigurationProcessStep CPS, Context context, Step step) throws FMEngineException, IllegalCallException, CPSNotFoundException, DomainElementNotFoundException
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
	public void init(Step step) throws FMEngineException, ElementNotFoundException
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
	public Context createNewContext(Step step) throws FMEngineException, ElementNotFoundException
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
	public Context getContextFromId(String id) throws ContextNotFoundException
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
	public Context cloningExistingContext(Context contextSource) throws FMEngineException, CPSNotFoundException
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
	public void removeContext(Context context)
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
	public void restoreContext(Context context)
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
	public ConfigurationProcessStep getCPSFromId(String id) throws CPSNotFoundException
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
			case ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT:
				return basicSetGlobalContext(null, msgs);
			case ProcessModelPackage.CONTEXT_MANAGER__LOCAL_CONTEXTS:
				return ((InternalEList<?>)getLocalContexts()).basicRemove(otherEnd, msgs);
			case ProcessModelPackage.CONTEXT_MANAGER__PAST:
				return basicSetPast(null, msgs);
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
			case ProcessModelPackage.CONTEXT_MANAGER__MSPL:
				if (resolve) return getMspl();
				return basicGetMspl();
			case ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT:
				return getGlobalContext();
			case ProcessModelPackage.CONTEXT_MANAGER__LOCAL_CONTEXTS:
				return getLocalContexts();
			case ProcessModelPackage.CONTEXT_MANAGER__FMA:
				return getFma();
			case ProcessModelPackage.CONTEXT_MANAGER__PAST:
				return getPast();
			case ProcessModelPackage.CONTEXT_MANAGER__ID:
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
			case ProcessModelPackage.CONTEXT_MANAGER__MSPL:
				setMspl((MultipleSoftwareProductLine)newValue);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT:
				setGlobalContext((GlobalContext)newValue);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__LOCAL_CONTEXTS:
				getLocalContexts().clear();
				getLocalContexts().addAll((Collection<? extends LocalContext>)newValue);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__FMA:
				setFma((FMSpineFMAdapter)newValue);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__PAST:
				setPast((Past)newValue);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__ID:
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
			case ProcessModelPackage.CONTEXT_MANAGER__MSPL:
				setMspl((MultipleSoftwareProductLine)null);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT:
				setGlobalContext((GlobalContext)null);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__LOCAL_CONTEXTS:
				getLocalContexts().clear();
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__FMA:
				setFma(FMA_EDEFAULT);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__PAST:
				setPast((Past)null);
				return;
			case ProcessModelPackage.CONTEXT_MANAGER__ID:
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
			case ProcessModelPackage.CONTEXT_MANAGER__MSPL:
				return mspl != null;
			case ProcessModelPackage.CONTEXT_MANAGER__GLOBAL_CONTEXT:
				return globalContext != null;
			case ProcessModelPackage.CONTEXT_MANAGER__LOCAL_CONTEXTS:
				return localContexts != null && !localContexts.isEmpty();
			case ProcessModelPackage.CONTEXT_MANAGER__FMA:
				return FMA_EDEFAULT == null ? fma != null : !FMA_EDEFAULT.equals(fma);
			case ProcessModelPackage.CONTEXT_MANAGER__PAST:
				return past != null;
			case ProcessModelPackage.CONTEXT_MANAGER__ID:
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
		result.append(" (fma: ");
		result.append(fma);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ContextManagerImpl
