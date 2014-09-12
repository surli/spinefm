/**
 */
package fr.unice.spinefm.ConfigurationModel.exceptions.impl;

import fr.unice.spinefm.ConfigurationModel.exceptions.*;

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
			ExceptionsFactory theExceptionsFactory = (ExceptionsFactory)EPackage.Registry.INSTANCE.getEFactory("exceptions.cm.spinefm.unice.fr"); 
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
			case ExceptionsPackage.CONFIG_NOT_FOUND_EXCEPTION:
				return createConfigNotFoundExceptionFromString(eDataType, initialValue);
			case ExceptionsPackage.INVALID_ASSOCIATION_EXCEPTION:
				return createInvalidAssociationExceptionFromString(eDataType, initialValue);
			case ExceptionsPackage.LINK_NOT_FOUND_EXCEPTION:
				return createLinkNotFoundExceptionFromString(eDataType, initialValue);
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
			case ExceptionsPackage.CONFIG_NOT_FOUND_EXCEPTION:
				return convertConfigNotFoundExceptionToString(eDataType, instanceValue);
			case ExceptionsPackage.INVALID_ASSOCIATION_EXCEPTION:
				return convertInvalidAssociationExceptionToString(eDataType, instanceValue);
			case ExceptionsPackage.LINK_NOT_FOUND_EXCEPTION:
				return convertLinkNotFoundExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigNotFoundException createConfigNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (ConfigNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidAssociationException createInvalidAssociationExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (InvalidAssociationException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidAssociationExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkNotFoundException createLinkNotFoundExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (LinkNotFoundException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkNotFoundExceptionToString(EDataType eDataType, Object instanceValue)
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
