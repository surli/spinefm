/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RightPart#getAction <em>Action</em>}</li>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RightPart#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRightPart()
 * @model
 * @generated
 */
public interface RightPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRightPart_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.RightPart#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference.
   * @see #setFeature(FeatureNamed)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRightPart_Feature()
   * @model containment="true"
   * @generated
   */
  FeatureNamed getFeature();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.RightPart#getFeature <em>Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' containment reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(FeatureNamed value);

} // RightPart
