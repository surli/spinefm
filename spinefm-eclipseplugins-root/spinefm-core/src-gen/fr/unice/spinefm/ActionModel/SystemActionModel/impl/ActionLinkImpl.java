/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.impl;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink;
import fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.Link;

import fr.unice.spinefm.MSPLModel.DEAssociation;

import fr.unice.spinefm.ProcessModel.ContextManager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl#getConfSource <em>Conf Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl#getConfTarget <em>Conf Target</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl#getAsso <em>Asso</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl#getLink <em>Link</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.impl.ActionLinkImpl#getContextManager <em>Context Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionLinkImpl extends SystemActionImplDelegate implements ActionLink
{
	/**
	 * The cached value of the '{@link #getConfSource() <em>Conf Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfSource()
	 * @generated
	 * @ordered
	 */
	protected Configuration confSource;

	/**
	 * The cached value of the '{@link #getConfTarget() <em>Conf Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfTarget()
	 * @generated
	 * @ordered
	 */
	protected Configuration confTarget;

	/**
	 * The cached value of the '{@link #getAsso() <em>Asso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsso()
	 * @generated
	 * @ordered
	 */
	protected DEAssociation asso;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Link link;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLinkImpl()
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
		return SystemActionModelPackage.Literals.ACTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfSource()
	{
		if (confSource != null && confSource.eIsProxy())
		{
			InternalEObject oldConfSource = (InternalEObject)confSource;
			confSource = (Configuration)eResolveProxy(oldConfSource);
			if (confSource != oldConfSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_LINK__CONF_SOURCE, oldConfSource, confSource));
			}
		}
		return confSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfSource()
	{
		return confSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfSource(Configuration newConfSource)
	{
		Configuration oldConfSource = confSource;
		confSource = newConfSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_LINK__CONF_SOURCE, oldConfSource, confSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfTarget()
	{
		if (confTarget != null && confTarget.eIsProxy())
		{
			InternalEObject oldConfTarget = (InternalEObject)confTarget;
			confTarget = (Configuration)eResolveProxy(oldConfTarget);
			if (confTarget != oldConfTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_LINK__CONF_TARGET, oldConfTarget, confTarget));
			}
		}
		return confTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfTarget()
	{
		return confTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfTarget(Configuration newConfTarget)
	{
		Configuration oldConfTarget = confTarget;
		confTarget = newConfTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_LINK__CONF_TARGET, oldConfTarget, confTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociation getAsso()
	{
		if (asso != null && asso.eIsProxy())
		{
			InternalEObject oldAsso = (InternalEObject)asso;
			asso = (DEAssociation)eResolveProxy(oldAsso);
			if (asso != oldAsso)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_LINK__ASSO, oldAsso, asso));
			}
		}
		return asso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociation basicGetAsso()
	{
		return asso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsso(DEAssociation newAsso)
	{
		DEAssociation oldAsso = asso;
		asso = newAsso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_LINK__ASSO, oldAsso, asso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLink()
	{
		if (link != null && link.eIsProxy())
		{
			InternalEObject oldLink = (InternalEObject)link;
			link = (Link)eResolveProxy(oldLink);
			if (link != oldLink)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_LINK__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetLink()
	{
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink)
	{
		Link oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_LINK__LINK, oldLink, link));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemActionModelPackage.ACTION_LINK__CONTEXT_MANAGER, oldContextManager, contextManager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemActionModelPackage.ACTION_LINK__CONTEXT_MANAGER, oldContextManager, contextManager));
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
			case SystemActionModelPackage.ACTION_LINK__CONF_SOURCE:
				if (resolve) return getConfSource();
				return basicGetConfSource();
			case SystemActionModelPackage.ACTION_LINK__CONF_TARGET:
				if (resolve) return getConfTarget();
				return basicGetConfTarget();
			case SystemActionModelPackage.ACTION_LINK__ASSO:
				if (resolve) return getAsso();
				return basicGetAsso();
			case SystemActionModelPackage.ACTION_LINK__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case SystemActionModelPackage.ACTION_LINK__CONTEXT_MANAGER:
				if (resolve) return getContextManager();
				return basicGetContextManager();
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
			case SystemActionModelPackage.ACTION_LINK__CONF_SOURCE:
				setConfSource((Configuration)newValue);
				return;
			case SystemActionModelPackage.ACTION_LINK__CONF_TARGET:
				setConfTarget((Configuration)newValue);
				return;
			case SystemActionModelPackage.ACTION_LINK__ASSO:
				setAsso((DEAssociation)newValue);
				return;
			case SystemActionModelPackage.ACTION_LINK__LINK:
				setLink((Link)newValue);
				return;
			case SystemActionModelPackage.ACTION_LINK__CONTEXT_MANAGER:
				setContextManager((ContextManager)newValue);
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
			case SystemActionModelPackage.ACTION_LINK__CONF_SOURCE:
				setConfSource((Configuration)null);
				return;
			case SystemActionModelPackage.ACTION_LINK__CONF_TARGET:
				setConfTarget((Configuration)null);
				return;
			case SystemActionModelPackage.ACTION_LINK__ASSO:
				setAsso((DEAssociation)null);
				return;
			case SystemActionModelPackage.ACTION_LINK__LINK:
				setLink((Link)null);
				return;
			case SystemActionModelPackage.ACTION_LINK__CONTEXT_MANAGER:
				setContextManager((ContextManager)null);
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
			case SystemActionModelPackage.ACTION_LINK__CONF_SOURCE:
				return confSource != null;
			case SystemActionModelPackage.ACTION_LINK__CONF_TARGET:
				return confTarget != null;
			case SystemActionModelPackage.ACTION_LINK__ASSO:
				return asso != null;
			case SystemActionModelPackage.ACTION_LINK__LINK:
				return link != null;
			case SystemActionModelPackage.ACTION_LINK__CONTEXT_MANAGER:
				return contextManager != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionLinkImpl
