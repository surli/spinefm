/**
 */
package fr.unice.spinefm.restfuncDSL.util;

import fr.unice.spinefm.restfuncDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage
 * @generated
 */
public class RestfuncDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RestfuncDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfuncDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RestfuncDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestfuncDSLSwitch<Adapter> modelSwitch =
    new RestfuncDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseRestFunc(RestFunc object)
      {
        return createRestFuncAdapter();
      }
      @Override
      public Adapter caseRuleString(RuleString object)
      {
        return createRuleStringAdapter();
      }
      @Override
      public Adapter caseSourceAndTarget(SourceAndTarget object)
      {
        return createSourceAndTargetAdapter();
      }
      @Override
      public Adapter caseSource(Source object)
      {
        return createSourceAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseLeftPart(LeftPart object)
      {
        return createLeftPartAdapter();
      }
      @Override
      public Adapter caseGroupFeature(GroupFeature object)
      {
        return createGroupFeatureAdapter();
      }
      @Override
      public Adapter caseFeatureNamed(FeatureNamed object)
      {
        return createFeatureNamedAdapter();
      }
      @Override
      public Adapter caseSingleFeature(SingleFeature object)
      {
        return createSingleFeatureAdapter();
      }
      @Override
      public Adapter caseVariableFeature(VariableFeature object)
      {
        return createVariableFeatureAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseStarFeature(StarFeature object)
      {
        return createStarFeatureAdapter();
      }
      @Override
      public Adapter caseRightPart(RightPart object)
      {
        return createRightPartAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.RestFunc <em>Rest Func</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.RestFunc
   * @generated
   */
  public Adapter createRestFuncAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.RuleString <em>Rule String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.RuleString
   * @generated
   */
  public Adapter createRuleStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.SourceAndTarget <em>Source And Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.SourceAndTarget
   * @generated
   */
  public Adapter createSourceAndTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.Source
   * @generated
   */
  public Adapter createSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.LeftPart <em>Left Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.LeftPart
   * @generated
   */
  public Adapter createLeftPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.GroupFeature <em>Group Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.GroupFeature
   * @generated
   */
  public Adapter createGroupFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.FeatureNamed <em>Feature Named</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.FeatureNamed
   * @generated
   */
  public Adapter createFeatureNamedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.SingleFeature <em>Single Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.SingleFeature
   * @generated
   */
  public Adapter createSingleFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.VariableFeature <em>Variable Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.VariableFeature
   * @generated
   */
  public Adapter createVariableFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.StarFeature <em>Star Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.StarFeature
   * @generated
   */
  public Adapter createStarFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.unice.spinefm.restfuncDSL.RightPart <em>Right Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.unice.spinefm.restfuncDSL.RightPart
   * @generated
   */
  public Adapter createRightPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RestfuncDSLAdapterFactory
