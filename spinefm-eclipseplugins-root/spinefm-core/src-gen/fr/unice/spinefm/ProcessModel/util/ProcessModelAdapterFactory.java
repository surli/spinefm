/**
 */
package fr.unice.spinefm.ProcessModel.util;

import fr.unice.spinefm.ProcessModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage
 * @generated
 */
public class ProcessModelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = ProcessModelPackage.eINSTANCE;
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
	protected ProcessModelSwitch<Adapter> modelSwitch =
		new ProcessModelSwitch<Adapter>()
		{
			@Override
			public Adapter caseConfigurationProcessStep(ConfigurationProcessStep object)
			{
				return createConfigurationProcessStepAdapter();
			}
			@Override
			public Adapter caseContext(Context object)
			{
				return createContextAdapter();
			}
			@Override
			public Adapter caseGlobalContext(GlobalContext object)
			{
				return createGlobalContextAdapter();
			}
			@Override
			public Adapter caseLocalContext(LocalContext object)
			{
				return createLocalContextAdapter();
			}
			@Override
			public Adapter caseContextManager(ContextManager object)
			{
				return createContextManagerAdapter();
			}
			@Override
			public Adapter caseDeletedContextInformations(DeletedContextInformations object)
			{
				return createDeletedContextInformationsAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep <em>Configuration Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep
	 * @generated
	 */
	public Adapter createConfigurationProcessStepAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ProcessModel.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ProcessModel.Context
	 * @generated
	 */
	public Adapter createContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ProcessModel.GlobalContext <em>Global Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ProcessModel.GlobalContext
	 * @generated
	 */
	public Adapter createGlobalContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ProcessModel.LocalContext <em>Local Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ProcessModel.LocalContext
	 * @generated
	 */
	public Adapter createLocalContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ProcessModel.ContextManager <em>Context Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ProcessModel.ContextManager
	 * @generated
	 */
	public Adapter createContextManagerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations <em>Deleted Context Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.ProcessModel.DeletedContextInformations
	 * @generated
	 */
	public Adapter createDeletedContextInformationsAdapter()
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

} //ProcessModelAdapterFactory
