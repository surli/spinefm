/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.ConfigurationModel.Configuration;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Move Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsSource <em>Cps Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsTarget <em>Cps Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionMoveConfiguration()
 * @model
 * @generated
 */
public interface ActionMoveConfiguration extends SystemAction
{
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionMoveConfiguration_Configuration()
	 * @model required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Cps Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cps Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps Source</em>' reference.
	 * @see #setCpsSource(ConfigurationProcessStep)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionMoveConfiguration_CpsSource()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationProcessStep getCpsSource();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsSource <em>Cps Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps Source</em>' reference.
	 * @see #getCpsSource()
	 * @generated
	 */
	void setCpsSource(ConfigurationProcessStep value);

	/**
	 * Returns the value of the '<em><b>Cps Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cps Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps Target</em>' reference.
	 * @see #setCpsTarget(ConfigurationProcessStep)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionMoveConfiguration_CpsTarget()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationProcessStep getCpsTarget();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration#getCpsTarget <em>Cps Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps Target</em>' reference.
	 * @see #getCpsTarget()
	 * @generated
	 */
	void setCpsTarget(ConfigurationProcessStep value);

} // ActionMoveConfiguration
