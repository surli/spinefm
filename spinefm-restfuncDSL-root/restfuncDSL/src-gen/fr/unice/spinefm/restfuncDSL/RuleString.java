/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RuleString#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RuleString#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RuleString#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRuleString()
 * @model
 * @generated
 */
public interface RuleString extends EObject
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
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRuleString_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.RuleString#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LeftPart)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRuleString_Left()
   * @model containment="true"
   * @generated
   */
  LeftPart getLeft();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.RuleString#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LeftPart value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(RightPart)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRuleString_Right()
   * @model containment="true"
   * @generated
   */
  RightPart getRight();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.RuleString#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(RightPart value);

} // RuleString
