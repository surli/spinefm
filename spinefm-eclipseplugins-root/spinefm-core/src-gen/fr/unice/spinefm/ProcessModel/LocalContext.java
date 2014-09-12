/**
 */
package fr.unice.spinefm.ProcessModel;

import fr.unice.spinefm.ConfigurationModel.Configuration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.LocalContext#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getLocalContext()
 * @model
 * @generated
 */
public interface LocalContext extends Context
{
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ConfigurationModel.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference list.
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getLocalContext_Configurations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

} // LocalContext
