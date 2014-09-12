/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.ConfigurationModel.Configuration;
import fr.unice.spinefm.ConfigurationModel.Link;

import fr.unice.spinefm.MSPLModel.DEAssociation;

import fr.unice.spinefm.ProcessModel.ContextManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfSource <em>Conf Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfTarget <em>Conf Target</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getAsso <em>Asso</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getLink <em>Link</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getContextManager <em>Context Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionLink()
 * @model
 * @generated
 */
public interface ActionLink extends SystemAction
{
	/**
	 * Returns the value of the '<em><b>Conf Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Source</em>' reference.
	 * @see #setConfSource(Configuration)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionLink_ConfSource()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfSource();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfSource <em>Conf Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Source</em>' reference.
	 * @see #getConfSource()
	 * @generated
	 */
	void setConfSource(Configuration value);

	/**
	 * Returns the value of the '<em><b>Conf Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Target</em>' reference.
	 * @see #setConfTarget(Configuration)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionLink_ConfTarget()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfTarget();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getConfTarget <em>Conf Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Target</em>' reference.
	 * @see #getConfTarget()
	 * @generated
	 */
	void setConfTarget(Configuration value);

	/**
	 * Returns the value of the '<em><b>Asso</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asso</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asso</em>' reference.
	 * @see #setAsso(DEAssociation)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionLink_Asso()
	 * @model required="true"
	 * @generated
	 */
	DEAssociation getAsso();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getAsso <em>Asso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asso</em>' reference.
	 * @see #getAsso()
	 * @generated
	 */
	void setAsso(DEAssociation value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Link)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionLink_Link()
	 * @model required="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

	/**
	 * Returns the value of the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Manager</em>' reference.
	 * @see #setContextManager(ContextManager)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionLink_ContextManager()
	 * @model required="true"
	 * @generated
	 */
	ContextManager getContextManager();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink#getContextManager <em>Context Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Manager</em>' reference.
	 * @see #getContextManager()
	 * @generated
	 */
	void setContextManager(ContextManager value);

} // ActionLink
