/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel.util;

import fr.unice.spinefm.ActionModel.UserActionModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage
 * @generated
 */
public class UserActionModelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UserActionModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserActionModelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = UserActionModelPackage.eINSTANCE;
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
	protected UserActionModelSwitch<Adapter> modelSwitch =
		new UserActionModelSwitch<Adapter>()
		{
			@Override
			public Adapter caseUserSelect(UserSelect object)
			{
				return createUserSelectAdapter();
			}
			@Override
			public Adapter caseUserAction(UserAction object)
			{
				return createUserActionAdapter();
			}
			@Override
			public Adapter caseUserCreateContext(UserCreateContext object)
			{
				return createUserCreateContextAdapter();
			}
			@Override
			public Adapter caseUserDeselect(UserDeselect object)
			{
				return createUserDeselectAdapter();
			}
			@Override
			public Adapter caseUserPropagate(UserPropagate object)
			{
				return createUserPropagateAdapter();
			}
			@Override
			public Adapter caseUserValidConfiguration(UserValidConfiguration object)
			{
				return createUserValidConfigurationAdapter();
			}
			@Override
			public Adapter caseUserLinkConfiguration(UserLinkConfiguration object)
			{
				return createUserLinkConfigurationAdapter();
			}
			@Override
			public Adapter caseUserInit(UserInit object)
			{
				return createUserInitAdapter();
			}
			@Override
			public Adapter caseUserGenerate(UserGenerate object)
			{
				return createUserGenerateAdapter();
			}
			@Override
			public Adapter caseUserSavePast(UserSavePast object)
			{
				return createUserSavePastAdapter();
			}
			@Override
			public Adapter caseUserRenameElement(UserRenameElement object)
			{
				return createUserRenameElementAdapter();
			}
			@Override
			public Adapter caseUserCloneContext(UserCloneContext object)
			{
				return createUserCloneContextAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSelect <em>User Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSelect
	 * @generated
	 */
	public Adapter createUserSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction <em>User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction
	 * @generated
	 */
	public Adapter createUserActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext <em>User Create Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserCreateContext
	 * @generated
	 */
	public Adapter createUserCreateContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect <em>User Deselect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect
	 * @generated
	 */
	public Adapter createUserDeselectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate <em>User Propagate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserPropagate
	 * @generated
	 */
	public Adapter createUserPropagateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration <em>User Valid Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserValidConfiguration
	 * @generated
	 */
	public Adapter createUserValidConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration <em>User Link Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration
	 * @generated
	 */
	public Adapter createUserLinkConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit <em>User Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserInit
	 * @generated
	 */
	public Adapter createUserInitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate <em>User Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate
	 * @generated
	 */
	public Adapter createUserGenerateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast <em>User Save Past</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast
	 * @generated
	 */
	public Adapter createUserSavePastAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement <em>User Rename Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserRenameElement
	 * @generated
	 */
	public Adapter createUserRenameElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext <em>User Clone Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserCloneContext
	 * @generated
	 */
	public Adapter createUserCloneContextAdapter()
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

} //UserActionModelAdapterFactory
