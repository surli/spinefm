/**
 */
package fr.unice.spinefm.ProcessModel.exceptions.impl;

import fr.unice.spinefm.ProcessModel.exceptions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ExceptionsFactoryImpl extends EFactoryImpl implements ExceptionsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExceptionsFactory init()
	{
		try
		{
			ExceptionsFactory theExceptionsFactory = (ExceptionsFactory)EPackage.Registry.INSTANCE.getEFactory("exceptions.pm.spinefm.unice.fr"); 
			if (theExceptionsFactory != null)
			{
				return theExceptionsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExceptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsFactoryImpl()
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ExceptionsPackage.CONTEXT_NOT_FOUND_EXCEPTION:
				return createContextNotFoundExceptionFromString(eDataType, initialValue);
			case ExceptionsPackage.FM_NOT_FOUND_EXCEPTION:
				return createFMNotFoundExceptionFromString(eDataType, initialValue);
			case ExceptionsPackage.CONTEXT_MERGING_EXCEPTION:
				return createContextMergingExceptionFromString(eDataType, initialValue);
			case ExceptionsPackage.CPS_NOT_FOUND_EXCEPTION:
				return createCPSNotFoundExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ExceptionsPackage.CONTEXT_NOT_FOUND_EXCEPTION:
				return convertContextNotFoundExceptionToString(eDataType, instanceValue);
			case ExceptionsPackage.FM_NOT_FOUND_EXCEPTION:
				return convertFMNotFoundExceptionToString(eDataType, instanceValue);
			case ExceptionsPackage.CONTEXT_MERGING_EXCEPTION:
				return convertContextMergingExceptionToString(eDataType, instanceValue);
			case ExceptionsPackage.CPS_NOT_FOUND_EXCEPTION:
				return convertCPSNotFoundExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextNotFoundException createContextNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (ContextNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMNotFoundException createFMNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (FMNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextMergingException createContextMergingExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (ContextMergingException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextMergingExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSNotFoundException createCPSNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (CPSNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPSNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionsPackage getExceptionsPackage()
	{
		return (ExceptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExceptionsPackage getPackage()
	{
		return ExceptionsPackage.eINSTANCE;
	}

} //ExceptionsFactoryImpl
