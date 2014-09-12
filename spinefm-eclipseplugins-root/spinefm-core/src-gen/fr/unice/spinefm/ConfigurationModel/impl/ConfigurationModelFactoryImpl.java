/**
 */
package fr.unice.spinefm.ConfigurationModel.impl;

import fr.unice.spinefm.ConfigurationModel.*;

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
public class ConfigurationModelFactoryImpl extends EFactoryImpl implements ConfigurationModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigurationModelFactory init()
	{
		try
		{
			ConfigurationModelFactory theConfigurationModelFactory = (ConfigurationModelFactory)EPackage.Registry.INSTANCE.getEFactory("cm.spinefm.unice.fr"); 
			if (theConfigurationModelFactory != null)
			{
				return theConfigurationModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigurationModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationModelFactoryImpl()
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
			case ConfigurationModelPackage.CONFIGURATION: return createConfiguration();
			case ConfigurationModelPackage.LINK: return createLink();
			case ConfigurationModelPackage.COMPOSITE_CONFIGURATION: return createCompositeConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration()
	{
		ConfigurationImplDelegate configuration = new ConfigurationImplDelegate();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink()
	{
		LinkImplDelegate link = new LinkImplDelegate();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConfiguration createCompositeConfiguration()
	{
		CompositeConfigurationImplDelegate compositeConfiguration = new CompositeConfigurationImplDelegate();
		return compositeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationModelPackage getConfigurationModelPackage()
	{
		return (ConfigurationModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigurationModelPackage getPackage()
	{
		return ConfigurationModelPackage.eINSTANCE;
	}

} //ConfigurationModelFactoryImpl
