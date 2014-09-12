/**
 */
package fr.unice.spinefm.MSPLModel.impl;

import fr.unice.spinefm.MSPLModel.*;

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
public class MSPLModelFactoryImpl extends EFactoryImpl implements MSPLModelFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MSPLModelFactory init()
	{
		try
		{
			MSPLModelFactory theMSPLModelFactory = (MSPLModelFactory)EPackage.Registry.INSTANCE.getEFactory("msplm.spinefm.unice.fr"); 
			if (theMSPLModelFactory != null)
			{
				return theMSPLModelFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MSPLModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSPLModelFactoryImpl()
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
			case MSPLModelPackage.MULTIPLE_SOFTWARE_PRODUCT_LINE: return createMultipleSoftwareProductLine();
			case MSPLModelPackage.DE_ASSOCIATION: return createDEAssociation();
			case MSPLModelPackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
			case MSPLModelPackage.DE_ASSOCIATION_END: return createDEAssociationEnd();
			case MSPLModelPackage.DOMAIN_ELEMENT: return createDomainElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSoftwareProductLine createMultipleSoftwareProductLine()
	{
		MultipleSoftwareProductLineImplDelegate multipleSoftwareProductLine = new MultipleSoftwareProductLineImplDelegate();
		return multipleSoftwareProductLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociation createDEAssociation()
	{
		DEAssociationImplDelegate deAssociation = new DEAssociationImplDelegate();
		return deAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement createMultiplicityElement()
	{
		MultiplicityElementImplDelegate multiplicityElement = new MultiplicityElementImplDelegate();
		return multiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEAssociationEnd createDEAssociationEnd()
	{
		DEAssociationEndImplDelegate deAssociationEnd = new DEAssociationEndImplDelegate();
		return deAssociationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement createDomainElement()
	{
		DomainElementImplDelegate domainElement = new DomainElementImplDelegate();
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSPLModelPackage getMSPLModelPackage()
	{
		return (MSPLModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MSPLModelPackage getPackage()
	{
		return MSPLModelPackage.eINSTANCE;
	}

} //MSPLModelFactoryImpl
