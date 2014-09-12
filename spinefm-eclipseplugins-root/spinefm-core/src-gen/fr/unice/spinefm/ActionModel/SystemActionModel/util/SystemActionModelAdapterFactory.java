/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel.util;

import fr.unice.spinefm.ActionModel.SystemActionModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage
 * @generated
 */
public class SystemActionModelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemActionModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActionModelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SystemActionModelPackage.eINSTANCE;
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
	protected SystemActionModelSwitch<Adapter> modelSwitch =
		new SystemActionModelSwitch<Adapter>()
		{
			@Override
			public Adapter caseSystemAction(SystemAction object)
			{
				return createSystemActionAdapter();
			}
			@Override
			public Adapter caseActionCreateConfiguration(ActionCreateConfiguration object)
			{
				return createActionCreateConfigurationAdapter();
			}
			@Override
			public Adapter caseActionLink(ActionLink object)
			{
				return createActionLinkAdapter();
			}
			@Override
			public Adapter caseActionCreateContext(ActionCreateContext object)
			{
				return createActionCreateContextAdapter();
			}
			@Override
			public Adapter caseActionMoveConfiguration(ActionMoveConfiguration object)
			{
				return createActionMoveConfigurationAdapter();
			}
			@Override
			public Adapter caseActionDeleteContext(ActionDeleteContext object)
			{
				return createActionDeleteContextAdapter();
			}
			@Override
			public Adapter caseActionOnFM(ActionOnFM object)
			{
				return createActionOnFMAdapter();
			}
			@Override
			public Adapter caseActionSelect(ActionSelect object)
			{
				return createActionSelectAdapter();
			}
			@Override
			public Adapter caseActionDeselect(ActionDeselect object)
			{
				return createActionDeselectAdapter();
			}
			@Override
			public Adapter caseActionAddCTConstraint(ActionAddCTConstraint object)
			{
				return createActionAddCTConstraintAdapter();
			}
			@Override
			public Adapter caseActionAbstractRename(ActionAbstractRename object)
			{
				return createActionAbstractRenameAdapter();
			}
			@Override
			public Adapter caseActionRenameCPS(ActionRenameCPS object)
			{
				return createActionRenameCPSAdapter();
			}
			@Override
			public Adapter caseActionRenameConfig(ActionRenameConfig object)
			{
				return createActionRenameConfigAdapter();
			}
			@Override
			public Adapter caseActionRenameProduct(ActionRenameProduct object)
			{
				return createActionRenameProductAdapter();
			}
			@Override
			public Adapter caseActionSetProductDescription(ActionSetProductDescription object)
			{
				return createActionSetProductDescriptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction <em>System Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction
	 * @generated
	 */
	public Adapter createSystemActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration <em>Action Create Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateConfiguration
	 * @generated
	 */
	public Adapter createActionCreateConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionLink
	 * @generated
	 */
	public Adapter createActionLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext <em>Action Create Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionCreateContext
	 * @generated
	 */
	public Adapter createActionCreateContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration <em>Action Move Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionMoveConfiguration
	 * @generated
	 */
	public Adapter createActionMoveConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext <em>Action Delete Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeleteContext
	 * @generated
	 */
	public Adapter createActionDeleteContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM <em>Action On FM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM
	 * @generated
	 */
	public Adapter createActionOnFMAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect <em>Action Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionSelect
	 * @generated
	 */
	public Adapter createActionSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect <em>Action Deselect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionDeselect
	 * @generated
	 */
	public Adapter createActionDeselectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint <em>Action Add CT Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAddCTConstraint
	 * @generated
	 */
	public Adapter createActionAddCTConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename <em>Action Abstract Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename
	 * @generated
	 */
	public Adapter createActionAbstractRenameAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS <em>Action Rename CPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameCPS
	 * @generated
	 */
	public Adapter createActionRenameCPSAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig <em>Action Rename Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameConfig
	 * @generated
	 */
	public Adapter createActionRenameConfigAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct <em>Action Rename Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionRenameProduct
	 * @generated
	 */
	public Adapter createActionRenameProductAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription <em>Action Set Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.ActionSetProductDescription
	 * @generated
	 */
	public Adapter createActionSetProductDescriptionAdapter()
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

} //SystemActionModelAdapterFactory
