/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.Source#getDeSrc <em>De Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject
{
  /**
   * Returns the value of the '<em><b>De Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>De Src</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>De Src</em>' attribute.
   * @see #setDeSrc(String)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getSource_DeSrc()
   * @model
   * @generated
   */
  String getDeSrc();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.Source#getDeSrc <em>De Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>De Src</em>' attribute.
   * @see #getDeSrc()
   * @generated
   */
  void setDeSrc(String value);

} // Source
