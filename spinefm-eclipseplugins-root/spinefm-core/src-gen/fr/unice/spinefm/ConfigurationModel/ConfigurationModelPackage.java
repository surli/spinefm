/**
 */
package fr.unice.spinefm.ConfigurationModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConfigurationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "cm.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationModelPackage eINSTANCE = fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl
	 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>CPS Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CPS_REF = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Belongs to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BELONGS_TO = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__STATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Domain Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DOMAIN_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Cloned CPS</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CLONED_CPS = 6;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ConfigurationModel.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ConfigurationModel.impl.LinkImpl
	 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Related Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__RELATED_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl <em>Composite Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl
	 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl#getCompositeConfiguration()
	 * @generated
	 */
	int COMPOSITE_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Sub Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONFIGURATION__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONFIGURATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Mspl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONFIGURATION__MSPL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONFIGURATION__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Composite Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONFIGURATION_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ConfigurationModel.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getCPSRef <em>CPS Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CPS Ref</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getCPSRef()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_CPSRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Id();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getBelongs_to <em>Belongs to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Belongs to</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getBelongs_to()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Belongs_to();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getState()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_State();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getDescription()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Description();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getDomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Element</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getDomainElement()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_DomainElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getClonedCPS <em>Cloned CPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cloned CPS</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getClonedCPS()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ClonedCPS();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ConfigurationModel.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.Link#getRelatedAssociation <em>Related Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Association</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Link#getRelatedAssociation()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_RelatedAssociation();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ConfigurationModel.Link#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.Link#getId()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration <em>Composite Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Configuration</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.CompositeConfiguration
	 * @generated
	 */
	EClass getCompositeConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getSubConfigurations <em>Sub Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Configurations</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getSubConfigurations()
	 * @see #getCompositeConfiguration()
	 * @generated
	 */
	EReference getCompositeConfiguration_SubConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getLinks()
	 * @see #getCompositeConfiguration()
	 * @generated
	 */
	EReference getCompositeConfiguration_Links();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getName()
	 * @see #getCompositeConfiguration()
	 * @generated
	 */
	EAttribute getCompositeConfiguration_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getMspl <em>Mspl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mspl</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getMspl()
	 * @see #getCompositeConfiguration()
	 * @generated
	 */
	EReference getCompositeConfiguration_Mspl();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getDescription()
	 * @see #getCompositeConfiguration()
	 * @generated
	 */
	EAttribute getCompositeConfiguration_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationModelFactory getConfigurationModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationImpl
		 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>CPS Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CPS_REF = eINSTANCE.getConfiguration_CPSRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ID = eINSTANCE.getConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Belongs to</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BELONGS_TO = eINSTANCE.getConfiguration_Belongs_to();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__STATE = eINSTANCE.getConfiguration_State();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DESCRIPTION = eINSTANCE.getConfiguration_Description();

		/**
		 * The meta object literal for the '<em><b>Domain Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DOMAIN_ELEMENT = eINSTANCE.getConfiguration_DomainElement();

		/**
		 * The meta object literal for the '<em><b>Cloned CPS</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CLONED_CPS = eINSTANCE.getConfiguration_ClonedCPS();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ConfigurationModel.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ConfigurationModel.impl.LinkImpl
		 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Related Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__RELATED_ASSOCIATION = eINSTANCE.getLink_RelatedAssociation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ID = eINSTANCE.getLink_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl <em>Composite Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ConfigurationModel.impl.CompositeConfigurationImpl
		 * @see fr.unice.spinefm.ConfigurationModel.impl.ConfigurationModelPackageImpl#getCompositeConfiguration()
		 * @generated
		 */
		EClass COMPOSITE_CONFIGURATION = eINSTANCE.getCompositeConfiguration();

		/**
		 * The meta object literal for the '<em><b>Sub Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONFIGURATION__SUB_CONFIGURATIONS = eINSTANCE.getCompositeConfiguration_SubConfigurations();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONFIGURATION__LINKS = eINSTANCE.getCompositeConfiguration_Links();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONFIGURATION__NAME = eINSTANCE.getCompositeConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Mspl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONFIGURATION__MSPL = eINSTANCE.getCompositeConfiguration_Mspl();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONFIGURATION__DESCRIPTION = eINSTANCE.getCompositeConfiguration_Description();

	}

} //ConfigurationModelPackage
