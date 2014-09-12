/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Create Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCps <em>Cps</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCompconf <em>Compconf</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionCreateConfiguration()
 * @model
 * @generated
 */
public interface ActionCreateConfiguration extends SystemAction
{
	/**
	 * Returns the value of the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps</em>' reference.
	 * @see #setCps(ConfigurationProcessStep)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionCreateConfiguration_Cps()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationProcessStep getCps();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCps <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' reference.
	 * @see #getCps()
	 * @generated
	 */
	void setCps(ConfigurationProcessStep value);

	/**
	 * Returns the value of the '<em><b>Compconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compconf</em>' reference.
	 * @see #setCompconf(CompositeConfiguration)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionCreateConfiguration_Compconf()
	 * @model required="true" transient="true"
	 * @generated
	 */
	CompositeConfiguration getCompconf();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration#getCompconf <em>Compconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compconf</em>' reference.
	 * @see #getCompconf()
	 * @generated
	 */
	void setCompconf(CompositeConfiguration value);

} // ActionCreateConfiguration
