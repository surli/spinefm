/**
 */
package fr.unice.spinefm.MSPLModel.util;

import fr.unice.spinefm.MSPLModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage
 * @generated
 */
public class MSPLModelAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MSPLModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSPLModelAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = MSPLModelPackage.eINSTANCE;
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
	protected MSPLModelSwitch<Adapter> modelSwitch =
		new MSPLModelSwitch<Adapter>()
		{
			@Override
			public Adapter caseMultipleSoftwareProductLine(MultipleSoftwareProductLine object)
			{
				return createMultipleSoftwareProductLineAdapter();
			}
			@Override
			public Adapter caseDEAssociation(DEAssociation object)
			{
				return createDEAssociationAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object)
			{
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseDEAssociationEnd(DEAssociationEnd object)
			{
				return createDEAssociationEndAdapter();
			}
			@Override
			public Adapter caseDomainElement(DomainElement object)
			{
				return createDomainElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine <em>Multiple Software Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine
	 * @generated
	 */
	public Adapter createMultipleSoftwareProductLineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.MSPLModel.DEAssociation <em>DE Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociation
	 * @generated
	 */
	public Adapter createDEAssociationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.MSPLModel.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.MSPLModel.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd <em>DE Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociationEnd
	 * @generated
	 */
	public Adapter createDEAssociationEndAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.unice.spinefm.MSPLModel.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.unice.spinefm.MSPLModel.DomainElement
	 * @generated
	 */
	public Adapter createDomainElementAdapter()
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

} //MSPLModelAdapterFactory
