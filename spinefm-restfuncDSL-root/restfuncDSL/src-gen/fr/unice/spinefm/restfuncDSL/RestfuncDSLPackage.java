/**
 */
package fr.unice.spinefm.restfuncDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RestfuncDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "restfuncDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unice.fr/spinefm/RestfuncDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "restfuncDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RestfuncDSLPackage eINSTANCE = fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.RestFuncImpl <em>Rest Func</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.RestFuncImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getRestFunc()
   * @generated
   */
  int REST_FUNC = 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_FUNC__INIT = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_FUNC__RULES = 1;

  /**
   * The number of structural features of the '<em>Rest Func</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_FUNC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.RuleStringImpl <em>Rule String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.RuleStringImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getRuleString()
   * @generated
   */
  int RULE_STRING = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STRING__ID = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STRING__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STRING__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Rule String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_STRING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.SourceAndTargetImpl <em>Source And Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.SourceAndTargetImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getSourceAndTarget()
   * @generated
   */
  int SOURCE_AND_TARGET = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_AND_TARGET__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_AND_TARGET__TARGET = 1;

  /**
   * The number of structural features of the '<em>Source And Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_AND_TARGET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.SourceImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getSource()
   * @generated
   */
  int SOURCE = 3;

  /**
   * The feature id for the '<em><b>De Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__DE_SRC = 0;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.TargetImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 4;

  /**
   * The feature id for the '<em><b>De Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__DE_TARGET = 0;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.LeftPartImpl <em>Left Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.LeftPartImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getLeftPart()
   * @generated
   */
  int LEFT_PART = 5;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_PART__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Left Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.GroupFeatureImpl <em>Group Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.GroupFeatureImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getGroupFeature()
   * @generated
   */
  int GROUP_FEATURE = 6;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE__STATE = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Group Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.FeatureNamedImpl <em>Feature Named</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.FeatureNamedImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getFeatureNamed()
   * @generated
   */
  int FEATURE_NAMED = 7;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_NAMED__FEATURE_NAME = 0;

  /**
   * The number of structural features of the '<em>Feature Named</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_NAMED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.SingleFeatureImpl <em>Single Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.SingleFeatureImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getSingleFeature()
   * @generated
   */
  int SINGLE_FEATURE = 8;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_FEATURE__FEATURE_NAME = FEATURE_NAMED__FEATURE_NAME;

  /**
   * The number of structural features of the '<em>Single Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_FEATURE_FEATURE_COUNT = FEATURE_NAMED_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.VariableFeatureImpl <em>Variable Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.VariableFeatureImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getVariableFeature()
   * @generated
   */
  int VARIABLE_FEATURE = 9;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE__FEATURE_NAME = FEATURE_NAMED__FEATURE_NAME;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE__VARIABLE = FEATURE_NAMED_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_FEATURE_COUNT = FEATURE_NAMED_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.VariableImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__ID = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.StarFeatureImpl <em>Star Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.StarFeatureImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getStarFeature()
   * @generated
   */
  int STAR_FEATURE = 11;

  /**
   * The feature id for the '<em><b>Feature Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_FEATURE__FEATURE_NAME = FEATURE_NAMED__FEATURE_NAME;

  /**
   * The number of structural features of the '<em>Star Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAR_FEATURE_FEATURE_COUNT = FEATURE_NAMED_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.unice.spinefm.restfuncDSL.impl.RightPartImpl <em>Right Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.unice.spinefm.restfuncDSL.impl.RightPartImpl
   * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getRightPart()
   * @generated
   */
  int RIGHT_PART = 12;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PART__ACTION = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PART__FEATURE = 1;

  /**
   * The number of structural features of the '<em>Right Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PART_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.RestFunc <em>Rest Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest Func</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RestFunc
   * @generated
   */
  EClass getRestFunc();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.RestFunc#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RestFunc#getInit()
   * @see #getRestFunc()
   * @generated
   */
  EReference getRestFunc_Init();

  /**
   * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.restfuncDSL.RestFunc#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RestFunc#getRules()
   * @see #getRestFunc()
   * @generated
   */
  EReference getRestFunc_Rules();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.RuleString <em>Rule String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule String</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RuleString
   * @generated
   */
  EClass getRuleString();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.RuleString#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RuleString#getId()
   * @see #getRuleString()
   * @generated
   */
  EAttribute getRuleString_Id();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.RuleString#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RuleString#getLeft()
   * @see #getRuleString()
   * @generated
   */
  EReference getRuleString_Left();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.RuleString#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RuleString#getRight()
   * @see #getRuleString()
   * @generated
   */
  EReference getRuleString_Right();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget <em>Source And Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source And Target</em>'.
   * @see fr.unice.spinefm.restfuncDSL.SourceAndTarget
   * @generated
   */
  EClass getSourceAndTarget();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see fr.unice.spinefm.restfuncDSL.SourceAndTarget#getSource()
   * @see #getSourceAndTarget()
   * @generated
   */
  EReference getSourceAndTarget_Source();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see fr.unice.spinefm.restfuncDSL.SourceAndTarget#getTarget()
   * @see #getSourceAndTarget()
   * @generated
   */
  EReference getSourceAndTarget_Target();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see fr.unice.spinefm.restfuncDSL.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.Source#getDeSrc <em>De Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>De Src</em>'.
   * @see fr.unice.spinefm.restfuncDSL.Source#getDeSrc()
   * @see #getSource()
   * @generated
   */
  EAttribute getSource_DeSrc();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see fr.unice.spinefm.restfuncDSL.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.Target#getDeTarget <em>De Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>De Target</em>'.
   * @see fr.unice.spinefm.restfuncDSL.Target#getDeTarget()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_DeTarget();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.LeftPart <em>Left Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Part</em>'.
   * @see fr.unice.spinefm.restfuncDSL.LeftPart
   * @generated
   */
  EClass getLeftPart();

  /**
   * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.restfuncDSL.LeftPart#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see fr.unice.spinefm.restfuncDSL.LeftPart#getFeatures()
   * @see #getLeftPart()
   * @generated
   */
  EReference getLeftPart_Features();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.GroupFeature <em>Group Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Feature</em>'.
   * @see fr.unice.spinefm.restfuncDSL.GroupFeature
   * @generated
   */
  EClass getGroupFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.GroupFeature#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see fr.unice.spinefm.restfuncDSL.GroupFeature#getState()
   * @see #getGroupFeature()
   * @generated
   */
  EAttribute getGroupFeature_State();

  /**
   * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.restfuncDSL.GroupFeature#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature</em>'.
   * @see fr.unice.spinefm.restfuncDSL.GroupFeature#getFeature()
   * @see #getGroupFeature()
   * @generated
   */
  EReference getGroupFeature_Feature();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.FeatureNamed <em>Feature Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Named</em>'.
   * @see fr.unice.spinefm.restfuncDSL.FeatureNamed
   * @generated
   */
  EClass getFeatureNamed();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.FeatureNamed#getFeatureName <em>Feature Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature Name</em>'.
   * @see fr.unice.spinefm.restfuncDSL.FeatureNamed#getFeatureName()
   * @see #getFeatureNamed()
   * @generated
   */
  EAttribute getFeatureNamed_FeatureName();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.SingleFeature <em>Single Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Feature</em>'.
   * @see fr.unice.spinefm.restfuncDSL.SingleFeature
   * @generated
   */
  EClass getSingleFeature();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.VariableFeature <em>Variable Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Feature</em>'.
   * @see fr.unice.spinefm.restfuncDSL.VariableFeature
   * @generated
   */
  EClass getVariableFeature();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.VariableFeature#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see fr.unice.spinefm.restfuncDSL.VariableFeature#getVariable()
   * @see #getVariableFeature()
   * @generated
   */
  EReference getVariableFeature_Variable();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see fr.unice.spinefm.restfuncDSL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.Variable#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.unice.spinefm.restfuncDSL.Variable#getId()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Id();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.StarFeature <em>Star Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Star Feature</em>'.
   * @see fr.unice.spinefm.restfuncDSL.StarFeature
   * @generated
   */
  EClass getStarFeature();

  /**
   * Returns the meta object for class '{@link fr.unice.spinefm.restfuncDSL.RightPart <em>Right Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Part</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RightPart
   * @generated
   */
  EClass getRightPart();

  /**
   * Returns the meta object for the attribute '{@link fr.unice.spinefm.restfuncDSL.RightPart#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RightPart#getAction()
   * @see #getRightPart()
   * @generated
   */
  EAttribute getRightPart_Action();

  /**
   * Returns the meta object for the containment reference '{@link fr.unice.spinefm.restfuncDSL.RightPart#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see fr.unice.spinefm.restfuncDSL.RightPart#getFeature()
   * @see #getRightPart()
   * @generated
   */
  EReference getRightPart_Feature();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RestfuncDSLFactory getRestfuncDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.RestFuncImpl <em>Rest Func</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.RestFuncImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getRestFunc()
     * @generated
     */
    EClass REST_FUNC = eINSTANCE.getRestFunc();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_FUNC__INIT = eINSTANCE.getRestFunc_Init();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST_FUNC__RULES = eINSTANCE.getRestFunc_Rules();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.RuleStringImpl <em>Rule String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.RuleStringImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getRuleString()
     * @generated
     */
    EClass RULE_STRING = eINSTANCE.getRuleString();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_STRING__ID = eINSTANCE.getRuleString_Id();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_STRING__LEFT = eINSTANCE.getRuleString_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_STRING__RIGHT = eINSTANCE.getRuleString_Right();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.SourceAndTargetImpl <em>Source And Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.SourceAndTargetImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getSourceAndTarget()
     * @generated
     */
    EClass SOURCE_AND_TARGET = eINSTANCE.getSourceAndTarget();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_AND_TARGET__SOURCE = eINSTANCE.getSourceAndTarget_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_AND_TARGET__TARGET = eINSTANCE.getSourceAndTarget_Target();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.SourceImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '<em><b>De Src</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE__DE_SRC = eINSTANCE.getSource_DeSrc();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.TargetImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>De Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__DE_TARGET = eINSTANCE.getTarget_DeTarget();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.LeftPartImpl <em>Left Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.LeftPartImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getLeftPart()
     * @generated
     */
    EClass LEFT_PART = eINSTANCE.getLeftPart();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT_PART__FEATURES = eINSTANCE.getLeftPart_Features();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.GroupFeatureImpl <em>Group Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.GroupFeatureImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getGroupFeature()
     * @generated
     */
    EClass GROUP_FEATURE = eINSTANCE.getGroupFeature();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_FEATURE__STATE = eINSTANCE.getGroupFeature_State();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_FEATURE__FEATURE = eINSTANCE.getGroupFeature_Feature();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.FeatureNamedImpl <em>Feature Named</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.FeatureNamedImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getFeatureNamed()
     * @generated
     */
    EClass FEATURE_NAMED = eINSTANCE.getFeatureNamed();

    /**
     * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_NAMED__FEATURE_NAME = eINSTANCE.getFeatureNamed_FeatureName();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.SingleFeatureImpl <em>Single Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.SingleFeatureImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getSingleFeature()
     * @generated
     */
    EClass SINGLE_FEATURE = eINSTANCE.getSingleFeature();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.VariableFeatureImpl <em>Variable Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.VariableFeatureImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getVariableFeature()
     * @generated
     */
    EClass VARIABLE_FEATURE = eINSTANCE.getVariableFeature();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_FEATURE__VARIABLE = eINSTANCE.getVariableFeature_Variable();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.VariableImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__ID = eINSTANCE.getVariable_Id();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.StarFeatureImpl <em>Star Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.StarFeatureImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getStarFeature()
     * @generated
     */
    EClass STAR_FEATURE = eINSTANCE.getStarFeature();

    /**
     * The meta object literal for the '{@link fr.unice.spinefm.restfuncDSL.impl.RightPartImpl <em>Right Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.unice.spinefm.restfuncDSL.impl.RightPartImpl
     * @see fr.unice.spinefm.restfuncDSL.impl.RestfuncDSLPackageImpl#getRightPart()
     * @generated
     */
    EClass RIGHT_PART = eINSTANCE.getRightPart();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGHT_PART__ACTION = eINSTANCE.getRightPart_Action();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_PART__FEATURE = eINSTANCE.getRightPart_Feature();

  }

} //RestfuncDSLPackage
