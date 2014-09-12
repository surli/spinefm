/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage
 * @generated
 */
public interface RestfuncDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RestfuncDSLFactory eINSTANCE = fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rest Func</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rest Func</em>'.
   * @generated
   */
  RestFunc createRestFunc();

  /**
   * Returns a new object of class '<em>Rule String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule String</em>'.
   * @generated
   */
  RuleString createRuleString();

  /**
   * Returns a new object of class '<em>Source And Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source And Target</em>'.
   * @generated
   */
  SourceAndTarget createSourceAndTarget();

  /**
   * Returns a new object of class '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source</em>'.
   * @generated
   */
  Source createSource();

  /**
   * Returns a new object of class '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target</em>'.
   * @generated
   */
  Target createTarget();

  /**
   * Returns a new object of class '<em>Left Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Part</em>'.
   * @generated
   */
  LeftPart createLeftPart();

  /**
   * Returns a new object of class '<em>Group Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Feature</em>'.
   * @generated
   */
  GroupFeature createGroupFeature();

  /**
   * Returns a new object of class '<em>Feature Named</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Named</em>'.
   * @generated
   */
  FeatureNamed createFeatureNamed();

  /**
   * Returns a new object of class '<em>Single Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Feature</em>'.
   * @generated
   */
  SingleFeature createSingleFeature();

  /**
   * Returns a new object of class '<em>Variable Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Feature</em>'.
   * @generated
   */
  VariableFeature createVariableFeature();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Star Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Star Feature</em>'.
   * @generated
   */
  StarFeature createStarFeature();

  /**
   * Returns a new object of class '<em>Right Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Part</em>'.
   * @generated
   */
  RightPart createRightPart();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RestfuncDSLPackage getRestfuncDSLPackage();

} //RestfuncDSLFactory
