/**
 */
package fr.unice.spinefm.HistoryModel.impl;

import fr.unice.spinefm.HistoryModel.*;

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
public class HistoryModelFactoryImpl extends EFactoryImpl implements HistoryModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HistoryModelFactory init()
	{
		try
		{
			HistoryModelFactory theHistoryModelFactory = (HistoryModelFactory)EPackage.Registry.INSTANCE.getEFactory("history.spinefm.unice.fr"); 
			if (theHistoryModelFactory != null)
			{
				return theHistoryModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HistoryModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryModelFactoryImpl()
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
			case HistoryModelPackage.STEP: return createStep();
			case HistoryModelPackage.PAST: return createPast();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep()
	{
		StepImplDelegate step = new StepImplDelegate();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Past createPast()
	{
		PastImplDelegate past = new PastImplDelegate();
		return past;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryModelPackage getHistoryModelPackage()
	{
		return (HistoryModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HistoryModelPackage getPackage()
	{
		return HistoryModelPackage.eINSTANCE;
	}

} //HistoryModelFactoryImpl
