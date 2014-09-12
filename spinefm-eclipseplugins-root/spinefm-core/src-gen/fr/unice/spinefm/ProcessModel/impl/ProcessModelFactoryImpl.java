/**
 */
package fr.unice.spinefm.ProcessModel.impl;

import fr.unice.spinefm.ProcessModel.*;

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
public class ProcessModelFactoryImpl extends EFactoryImpl implements ProcessModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProcessModelFactory init()
	{
		try
		{
			ProcessModelFactory theProcessModelFactory = (ProcessModelFactory)EPackage.Registry.INSTANCE.getEFactory("pm.spinefm.unice.fr"); 
			if (theProcessModelFactory != null)
			{
				return theProcessModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProcessModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModelFactoryImpl()
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
			case ProcessModelPackage.CONFIGURATION_PROCESS_STEP: return createConfigurationProcessStep();
			case ProcessModelPackage.GLOBAL_CONTEXT: return createGlobalContext();
			case ProcessModelPackage.LOCAL_CONTEXT: return createLocalContext();
			case ProcessModelPackage.CONTEXT_MANAGER: return createContextManager();
			case ProcessModelPackage.DELETED_CONTEXT_INFORMATIONS: return createDeletedContextInformations();
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
			case ProcessModelPackage.CPS_STATUS:
				return createCPSStatusFromString(eDataType, initialValue);
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
			case ProcessModelPackage.CPS_STATUS:
				return convertCPSStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationProcessStep createConfigurationProcessStep()
	{
		ConfigurationProcessStepImplDelegate configurationProcessStep = new ConfigurationProcessStepImplDelegate();
		return configurationProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalContext createGlobalContext()
	{
		GlobalContextImpl globalContext = new GlobalContextImpl();
		return globalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalContext createLocalContext()
	{
		LocalContextImpl localContext = new LocalContextImpl();
		return localContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextManager createContextManager()
	{
		ContextManagerImplDelegate contextManager = new ContextManagerImplDelegate();
		return contextManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletedContextInformations createDeletedContextInformations()
	{
		DeletedContextInformationsImpl deletedContextInformations = new DeletedContextInformationsImpl();
		return deletedContextInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPSStatus createCPSStatusFromString(EDataType eDataType, String initialValue)
	{
		CPSStatus result = CPSStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPSStatusToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModelPackage getProcessModelPackage()
	{
		return (ProcessModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProcessModelPackage getPackage()
	{
		return ProcessModelPackage.eINSTANCE;
	}

} //ProcessModelFactoryImpl
