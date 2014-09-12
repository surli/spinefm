/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.ConfigurationModel.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Rename Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionRenameConfig()
 * @model
 * @generated
 */
public interface ActionRenameConfig extends ActionAbstractRename
{
	/**
	 * Returns the value of the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' reference.
	 * @see #setConfig(Configuration)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionRenameConfig_Config()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Configuration getConfig();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig#getConfig <em>Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(Configuration value);

} // ActionRenameConfig
