/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.Variable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getVariable_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.Variable#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Variable
