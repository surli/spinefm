/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source And Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget#getSource <em>Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getSourceAndTarget()
 * @model
 * @generated
 */
public interface SourceAndTarget extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Source)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getSourceAndTarget_Source()
   * @model containment="true"
   * @generated
   */
  Source getSource();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Source value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Target)
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#getSourceAndTarget_Target()
   * @model containment="true"
   * @generated
   */
  Target getTarget();

  /**
   * Sets the value of the '{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Target value);

} // SourceAndTarget
