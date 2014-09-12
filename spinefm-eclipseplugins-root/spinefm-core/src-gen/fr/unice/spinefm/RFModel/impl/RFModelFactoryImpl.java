/**
 */
package fr.unice.spinefm.RFModel.impl;

import fr.unice.spinefm.RFModel.*;

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
public class RFModelFactoryImpl extends EFactoryImpl implements RFModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RFModelFactory init()
	{
		try
		{
			RFModelFactory theRFModelFactory = (RFModelFactory)EPackage.Registry.INSTANCE.getEFactory("rf.spinefm.unice.fr"); 
			if (theRFModelFactory != null)
			{
				return theRFModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RFModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFModelFactoryImpl()
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
			case RFModelPackage.RESTRICTION_FUNCTION: return createRestrictionFunction();
			case RFModelPackage.CONFIGURATION_STATE: return createConfigurationState();
			case RFModelPackage.RULE: return createRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionFunction createRestrictionFunction()
	{
		RestrictionFunctionImplDelegate restrictionFunction = new RestrictionFunctionImplDelegate();
		return restrictionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationState createConfigurationState()
	{
		ConfigurationStateImplDelegate configurationState = new ConfigurationStateImplDelegate();
		return configurationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule()
	{
		RuleImplDelegate rule = new RuleImplDelegate();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFModelPackage getRFModelPackage()
	{
		return (RFModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RFModelPackage getPackage()
	{
		return RFModelPackage.eINSTANCE;
	}

} //RFModelFactoryImpl
