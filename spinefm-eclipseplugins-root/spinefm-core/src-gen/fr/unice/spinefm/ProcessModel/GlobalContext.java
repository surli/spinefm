/**
 */
package fr.unice.spinefm.ProcessModel;

import fr.unice.spinefm.ConfigurationModel.CompositeConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.GlobalContext#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getGlobalContext()
 * @model
 * @generated
 */
public interface GlobalContext extends Context
{
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(CompositeConfiguration)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getGlobalContext_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositeConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.GlobalContext#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(CompositeConfiguration value);

} // GlobalContext
