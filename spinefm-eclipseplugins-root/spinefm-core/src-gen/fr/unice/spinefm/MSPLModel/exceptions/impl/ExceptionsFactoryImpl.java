/**
 */
package fr.unice.spinefm.MSPLModel.exceptions.impl;

import fr.unice.spinefm.MSPLModel.exceptions.*;

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
			ExceptionsFactory theExceptionsFactory = (ExceptionsFactory)EPackage.Registry.INSTANCE.getEFactory("exceptions.msplm.spinefm.unice.fr"); 
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
			case ExceptionsPackage.DOMAIN_ELEMENT_NOT_FOUND_EXCEPTION:
				return createDomainElementNotFoundExceptionFromString(eDataType, initialValue);
			case ExceptionsPackage.DE_ASSOCIATION_NOT_FOUND_EXCEPTION:
				return createDEAssociationNotFoundExceptionFromString(eDataType, initialValue);
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
			case ExceptionsPackage.DOMAIN_ELEMENT_NOT_FOUND_EXCEPTION:
				return convertDomainElementNotFoundExceptionToString(eDataType, instanceValue);
			case ExceptionsPackage.DE_ASSOCIATION_NOT_FOUND_EXCEPTION:
				return convertDEAssociationNotFoundExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElementNotFoundException createDomainElementNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (DomainElementNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainElementNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociationNotFoundException createDEAssociationNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (DEAssociationNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDEAssociationNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
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
