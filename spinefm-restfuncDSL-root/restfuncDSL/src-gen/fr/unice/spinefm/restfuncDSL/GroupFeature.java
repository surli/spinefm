/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.GroupFeature#getState <em>State</em>}</li>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.GroupFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getGroupFeature()
 * @model
 * @generated
 */
public interface GroupFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see #setState(String)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getGroupFeature_State()
   * @model
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.GroupFeature#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link fr.unice.spinefm.restfuncDSL.FeatureNamed}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getGroupFeature_Feature()
   * @model containment="true"
   * @generated
   */
  EList<FeatureNamed> getFeature();

} // GroupFeature
