/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Func</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RestFunc#getInit <em>Init</em>}</li>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.RestFunc#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRestFunc()
 * @model
 * @generated
 */
public interface RestFunc extends EObject
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(SourceAndTarget)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRestFunc_Init()
   * @model containment="true"
   * @generated
   */
  SourceAndTarget getInit();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.RestFunc#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(SourceAndTarget value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link fr.unice.spinefm.restfuncDSL.RuleString}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getRestFunc_Rules()
   * @model containment="true"
   * @generated
   */
  EList<RuleString> getRules();

} // RestFunc
