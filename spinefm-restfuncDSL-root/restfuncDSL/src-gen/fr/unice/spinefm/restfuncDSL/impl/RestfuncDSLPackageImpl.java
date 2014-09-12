/**
 */
package fr.unice.spinefm.restfuncDSL.impl;

import fr.unice.spinefm.restfuncDSL.FeatureNamed;
import fr.unice.spinefm.restfuncDSL.GroupFeature;
import fr.unice.spinefm.restfuncDSL.LeftPart;
import fr.unice.spinefm.restfuncDSL.RestFunc;
import fr.unice.spinefm.restfuncDSL.RestfuncDSLFactory;
import fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage;
import fr.unice.spinefm.restfuncDSL.RightPart;
import fr.unice.spinefm.restfuncDSL.RuleString;
import fr.unice.spinefm.restfuncDSL.SingleFeature;
import fr.unice.spinefm.restfuncDSL.Source;
import fr.unice.spinefm.restfuncDSL.SourceAndTarget;
import fr.unice.spinefm.restfuncDSL.StarFeature;
import fr.unice.spinefm.restfuncDSL.Target;
import fr.unice.spinefm.restfuncDSL.Variable;
import fr.unice.spinefm.restfuncDSL.VariableFeature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestfuncDSLPackageImpl extends EPackageImpl implements RestfuncDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restFuncEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceAndTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leftPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureNamedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass starFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightPartEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RestfuncDSLPackageImpl()
  {
    super(eNS_URI, RestfuncDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RestfuncDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RestfuncDSLPackage init()
  {
    if (isInited) return (RestfuncDSLPackage)EPackage.Registry.INSTANCE.getEPackage(RestfuncDSLPackage.eNS_URI);

    // Obtain or create and register package
    RestfuncDSLPackageImpl theRestfuncDSLPackage = (RestfuncDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestfuncDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestfuncDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRestfuncDSLPackage.createPackageContents();

    // Initialize created meta-data
    theRestfuncDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRestfuncDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RestfuncDSLPackage.eNS_URI, theRestfuncDSLPackage);
    return theRestfuncDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRestFunc()
  {
    return restFuncEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestFunc_Init()
  {
    return (EReference)restFuncEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRestFunc_Rules()
  {
    return (EReference)restFuncEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleString()
  {
    return ruleStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleString_Id()
  {
    return (EAttribute)ruleStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleString_Left()
  {
    return (EReference)ruleStringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleString_Right()
  {
    return (EReference)ruleStringEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSourceAndTarget()
  {
    return sourceAndTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSourceAndTarget_Source()
  {
    return (EReference)sourceAndTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSourceAndTarget_Target()
  {
    return (EReference)sourceAndTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSource()
  {
    return sourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSource_DeSrc()
  {
    return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTarget()
  {
    return targetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTarget_DeTarget()
  {
    return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeftPart()
  {
    return leftPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeftPart_Features()
  {
    return (EReference)leftPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupFeature()
  {
    return groupFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupFeature_State()
  {
    return (EAttribute)groupFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupFeature_Feature()
  {
    return (EReference)groupFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureNamed()
  {
    return featureNamedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureNamed_FeatureName()
  {
    return (EAttribute)featureNamedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleFeature()
  {
    return singleFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableFeature()
  {
    return variableFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableFeature_Variable()
  {
    return (EReference)variableFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Id()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStarFeature()
  {
    return starFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRightPart()
  {
    return rightPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRightPart_Action()
  {
    return (EAttribute)rightPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightPart_Feature()
  {
    return (EReference)rightPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfuncDSLFactory getRestfuncDSLFactory()
  {
    return (RestfuncDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    restFuncEClass = createEClass(REST_FUNC);
    createEReference(restFuncEClass, REST_FUNC__INIT);
    createEReference(restFuncEClass, REST_FUNC__RULES);

    ruleStringEClass = createEClass(RULE_STRING);
    createEAttribute(ruleStringEClass, RULE_STRING__ID);
    createEReference(ruleStringEClass, RULE_STRING__LEFT);
    createEReference(ruleStringEClass, RULE_STRING__RIGHT);

    sourceAndTargetEClass = createEClass(SOURCE_AND_TARGET);
    createEReference(sourceAndTargetEClass, SOURCE_AND_TARGET__SOURCE);
    createEReference(sourceAndTargetEClass, SOURCE_AND_TARGET__TARGET);

    sourceEClass = createEClass(SOURCE);
    createEAttribute(sourceEClass, SOURCE__DE_SRC);

    targetEClass = createEClass(TARGET);
    createEAttribute(targetEClass, TARGET__DE_TARGET);

    leftPartEClass = createEClass(LEFT_PART);
    createEReference(leftPartEClass, LEFT_PART__FEATURES);

    groupFeatureEClass = createEClass(GROUP_FEATURE);
    createEAttribute(groupFeatureEClass, GROUP_FEATURE__STATE);
    createEReference(groupFeatureEClass, GROUP_FEATURE__FEATURE);

    featureNamedEClass = createEClass(FEATURE_NAMED);
    createEAttribute(featureNamedEClass, FEATURE_NAMED__FEATURE_NAME);

    singleFeatureEClass = createEClass(SINGLE_FEATURE);

    variableFeatureEClass = createEClass(VARIABLE_FEATURE);
    createEReference(variableFeatureEClass, VARIABLE_FEATURE__VARIABLE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__ID);

    starFeatureEClass = createEClass(STAR_FEATURE);

    rightPartEClass = createEClass(RIGHT_PART);
    createEAttribute(rightPartEClass, RIGHT_PART__ACTION);
    createEReference(rightPartEClass, RIGHT_PART__FEATURE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    singleFeatureEClass.getESuperTypes().add(this.getFeatureNamed());
    variableFeatureEClass.getESuperTypes().add(this.getFeatureNamed());
    starFeatureEClass.getESuperTypes().add(this.getFeatureNamed());

    // Initialize classes and features; add operations and parameters
    initEClass(restFuncEClass, RestFunc.class, "RestFunc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRestFunc_Init(), this.getSourceAndTarget(), null, "init", null, 0, 1, RestFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRestFunc_Rules(), this.getRuleString(), null, "rules", null, 0, -1, RestFunc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleStringEClass, RuleString.class, "RuleString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRuleString_Id(), ecorePackage.getEString(), "id", null, 0, 1, RuleString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleString_Left(), this.getLeftPart(), null, "left", null, 0, 1, RuleString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleString_Right(), this.getRightPart(), null, "right", null, 0, 1, RuleString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceAndTargetEClass, SourceAndTarget.class, "SourceAndTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSourceAndTarget_Source(), this.getSource(), null, "source", null, 0, 1, SourceAndTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSourceAndTarget_Target(), this.getTarget(), null, "target", null, 0, 1, SourceAndTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSource_DeSrc(), ecorePackage.getEString(), "deSrc", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTarget_DeTarget(), ecorePackage.getEString(), "deTarget", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(leftPartEClass, LeftPart.class, "LeftPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLeftPart_Features(), this.getGroupFeature(), null, "features", null, 0, -1, LeftPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupFeatureEClass, GroupFeature.class, "GroupFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupFeature_State(), ecorePackage.getEString(), "state", null, 0, 1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupFeature_Feature(), this.getFeatureNamed(), null, "feature", null, 0, -1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureNamedEClass, FeatureNamed.class, "FeatureNamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeatureNamed_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, FeatureNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleFeatureEClass, SingleFeature.class, "SingleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableFeatureEClass, VariableFeature.class, "VariableFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableFeature_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(starFeatureEClass, StarFeature.class, "StarFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rightPartEClass, RightPart.class, "RightPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRightPart_Action(), ecorePackage.getEString(), "action", null, 0, 1, RightPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRightPart_Feature(), this.getFeatureNamed(), null, "feature", null, 0, 1, RightPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RestfuncDSLPackageImpl
