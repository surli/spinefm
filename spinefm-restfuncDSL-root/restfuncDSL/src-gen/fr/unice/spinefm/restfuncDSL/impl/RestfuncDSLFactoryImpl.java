/**
 */
package fr.unice.spinefm.restfuncDSL.impl;

import fr.unice.spinefm.restfuncDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestfuncDSLFactoryImpl extends EFactoryImpl implements RestfuncDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestfuncDSLFactory init()
  {
    try
    {
      RestfuncDSLFactory theRestfuncDSLFactory = (RestfuncDSLFactory)EPackage.Registry.INSTANCE.getEFactory(RestfuncDSLPackage.eNS_URI);
      if (theRestfuncDSLFactory != null)
      {
        return theRestfuncDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestfuncDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfuncDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RestfuncDSLPackage.REST_FUNC: return createRestFunc();
      case RestfuncDSLPackage.RULE_STRING: return createRuleString();
      case RestfuncDSLPackage.SOURCE_AND_TARGET: return createSourceAndTarget();
      case RestfuncDSLPackage.SOURCE: return createSource();
      case RestfuncDSLPackage.TARGET: return createTarget();
      case RestfuncDSLPackage.LEFT_PART: return createLeftPart();
      case RestfuncDSLPackage.GROUP_FEATURE: return createGroupFeature();
      case RestfuncDSLPackage.FEATURE_NAMED: return createFeatureNamed();
      case RestfuncDSLPackage.SINGLE_FEATURE: return createSingleFeature();
      case RestfuncDSLPackage.VARIABLE_FEATURE: return createVariableFeature();
      case RestfuncDSLPackage.VARIABLE: return createVariable();
      case RestfuncDSLPackage.STAR_FEATURE: return createStarFeature();
      case RestfuncDSLPackage.RIGHT_PART: return createRightPart();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestFunc createRestFunc()
  {
    RestFuncImpl restFunc = new RestFuncImpl();
    return restFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleString createRuleString()
  {
    RuleStringImpl ruleString = new RuleStringImpl();
    return ruleString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceAndTarget createSourceAndTarget()
  {
    SourceAndTargetImpl sourceAndTarget = new SourceAndTargetImpl();
    return sourceAndTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftPart createLeftPart()
  {
    LeftPartImpl leftPart = new LeftPartImpl();
    return leftPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupFeature createGroupFeature()
  {
    GroupFeatureImpl groupFeature = new GroupFeatureImpl();
    return groupFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureNamed createFeatureNamed()
  {
    FeatureNamedImpl featureNamed = new FeatureNamedImpl();
    return featureNamed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleFeature createSingleFeature()
  {
    SingleFeatureImpl singleFeature = new SingleFeatureImpl();
    return singleFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableFeature createVariableFeature()
  {
    VariableFeatureImpl variableFeature = new VariableFeatureImpl();
    return variableFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StarFeature createStarFeature()
  {
    StarFeatureImpl starFeature = new StarFeatureImpl();
    return starFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightPart createRightPart()
  {
    RightPartImpl rightPart = new RightPartImpl();
    return rightPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfuncDSLPackage getRestfuncDSLPackage()
  {
    return (RestfuncDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestfuncDSLPackage getPackage()
  {
    return RestfuncDSLPackage.eINSTANCE;
  }

} //RestfuncDSLFactoryImpl
