/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.LeftPart#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getLeftPart()
 * @model
 * @generated
 */
public interface LeftPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.unice.spinefm.restfuncDSL.GroupFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getLeftPart_Features()
   * @model containment="true"
   * @generated
   */
  EList<GroupFeature> getFeatures();

} // LeftPart
