/**
 */
package fr.unice.spinefm.FMModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.FMModel.Constraint#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.FMModel.FMModelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getConstraint_Rule()
	 * @model required="true"
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.FMModel.Constraint#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

} // Constraint
