/**
 */
package fr.unice.spinefm.MSPLModel;

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
 * @see fr.unice.spinefm.MSPLModel.MSPLModelFactory
 * @model kind="package"
 * @generated
 */
public interface MSPLModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MSPLModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "msplm.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msplm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MSPLModelPackage eINSTANCE = fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl <em>Multiple Software Product Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl
	 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getMultipleSoftwareProductLine()
	 * @generated
	 */
	int MULTIPLE_SOFTWARE_PRODUCT_LINE = 0;

	/**
	 * The feature id for the '<em><b>Domain Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SOFTWARE_PRODUCT_LINE__ID = 2;

	/**
	 * The number of structural features of the '<em>Multiple Software Product Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_SOFTWARE_PRODUCT_LINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl <em>DE Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl
	 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getDEAssociation()
	 * @generated
	 */
	int DE_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Restriction Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION__RESTRICTION_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Extremity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION__EXTREMITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION__ID = 2;

	/**
	 * The number of structural features of the '<em>DE Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.MSPLModel.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.impl.MultiplicityElementImpl
	 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl <em>DE Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl
	 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getDEAssociationEnd()
	 * @generated
	 */
	int DE_ASSOCIATION_END = 3;

	/**
	 * The feature id for the '<em><b>Link Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION_END__LINK_MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>Apply on</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION_END__APPLY_ON = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION_END__ID = 2;

	/**
	 * The number of structural features of the '<em>DE Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_ASSOCIATION_END_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.MSPLModel.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.impl.DomainElementImpl
	 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Multiplicity Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Refers on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__REFERS_ON = 1;

	/**
	 * The feature id for the '<em><b>Belongs to</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__BELONGS_TO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__ID = 3;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine <em>Multiple Software Product Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Software Product Line</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine
	 * @generated
	 */
	EClass getMultipleSoftwareProductLine();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getDomainElements <em>Domain Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Elements</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getDomainElements()
	 * @see #getMultipleSoftwareProductLine()
	 * @generated
	 */
	EReference getMultipleSoftwareProductLine_DomainElements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getAssociations()
	 * @see #getMultipleSoftwareProductLine()
	 * @generated
	 */
	EReference getMultipleSoftwareProductLine_Associations();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getId()
	 * @see #getMultipleSoftwareProductLine()
	 * @generated
	 */
	EAttribute getMultipleSoftwareProductLine_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.MSPLModel.DEAssociation <em>DE Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DE Association</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociation
	 * @generated
	 */
	EClass getDEAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.MSPLModel.DEAssociation#getRestrictionFunction <em>Restriction Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restriction Function</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociation#getRestrictionFunction()
	 * @see #getDEAssociation()
	 * @generated
	 */
	EReference getDEAssociation_RestrictionFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.MSPLModel.DEAssociation#getExtremity <em>Extremity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extremity</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociation#getExtremity()
	 * @see #getDEAssociation()
	 * @generated
	 */
	EReference getDEAssociation_Extremity();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.DEAssociation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociation#getId()
	 * @see #getDEAssociation()
	 * @generated
	 */
	EAttribute getDEAssociation_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.MSPLModel.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.MultiplicityElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultiplicityElement#getLowerBound()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.MultiplicityElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultiplicityElement#getUpperBound()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.MultiplicityElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.MSPLModel.MultiplicityElement#getId()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd <em>DE Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DE Association End</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociationEnd
	 * @generated
	 */
	EClass getDEAssociationEnd();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getLinkMultiplicity <em>Link Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Multiplicity</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociationEnd#getLinkMultiplicity()
	 * @see #getDEAssociationEnd()
	 * @generated
	 */
	EReference getDEAssociationEnd_LinkMultiplicity();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getApply_on <em>Apply on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apply on</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociationEnd#getApply_on()
	 * @see #getDEAssociationEnd()
	 * @generated
	 */
	EReference getDEAssociationEnd_Apply_on();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DEAssociationEnd#getId()
	 * @see #getDEAssociationEnd()
	 * @generated
	 */
	EAttribute getDEAssociationEnd_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.MSPLModel.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.MSPLModel.DomainElement#getMultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity Element</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DomainElement#getMultiplicityElement()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_MultiplicityElement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.MSPLModel.DomainElement#getRefers_on <em>Refers on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refers on</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DomainElement#getRefers_on()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_Refers_on();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.MSPLModel.DomainElement#getBelongs_to <em>Belongs to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Belongs to</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DomainElement#getBelongs_to()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_Belongs_to();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.MSPLModel.DomainElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.MSPLModel.DomainElement#getId()
	 * @see #getDomainElement()
	 * @generated
	 */
	EAttribute getDomainElement_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MSPLModelFactory getMSPLModelFactory();

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
		 * The meta object literal for the '{@link fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl <em>Multiple Software Product Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.impl.MultipleSoftwareProductLineImpl
		 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getMultipleSoftwareProductLine()
		 * @generated
		 */
		EClass MULTIPLE_SOFTWARE_PRODUCT_LINE = eINSTANCE.getMultipleSoftwareProductLine();

		/**
		 * The meta object literal for the '<em><b>Domain Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_SOFTWARE_PRODUCT_LINE__DOMAIN_ELEMENTS = eINSTANCE.getMultipleSoftwareProductLine_DomainElements();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_SOFTWARE_PRODUCT_LINE__ASSOCIATIONS = eINSTANCE.getMultipleSoftwareProductLine_Associations();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_SOFTWARE_PRODUCT_LINE__ID = eINSTANCE.getMultipleSoftwareProductLine_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl <em>DE Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.impl.DEAssociationImpl
		 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getDEAssociation()
		 * @generated
		 */
		EClass DE_ASSOCIATION = eINSTANCE.getDEAssociation();

		/**
		 * The meta object literal for the '<em><b>Restriction Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_ASSOCIATION__RESTRICTION_FUNCTION = eINSTANCE.getDEAssociation_RestrictionFunction();

		/**
		 * The meta object literal for the '<em><b>Extremity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_ASSOCIATION__EXTREMITY = eINSTANCE.getDEAssociation_Extremity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DE_ASSOCIATION__ID = eINSTANCE.getDEAssociation_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.MSPLModel.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.impl.MultiplicityElementImpl
		 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER_BOUND = eINSTANCE.getMultiplicityElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER_BOUND = eINSTANCE.getMultiplicityElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__ID = eINSTANCE.getMultiplicityElement_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl <em>DE Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.impl.DEAssociationEndImpl
		 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getDEAssociationEnd()
		 * @generated
		 */
		EClass DE_ASSOCIATION_END = eINSTANCE.getDEAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Link Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_ASSOCIATION_END__LINK_MULTIPLICITY = eINSTANCE.getDEAssociationEnd_LinkMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Apply on</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_ASSOCIATION_END__APPLY_ON = eINSTANCE.getDEAssociationEnd_Apply_on();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DE_ASSOCIATION_END__ID = eINSTANCE.getDEAssociationEnd_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.MSPLModel.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.impl.DomainElementImpl
		 * @see fr.unice.spinefm.MSPLModel.impl.MSPLModelPackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENT__MULTIPLICITY_ELEMENT = eINSTANCE.getDomainElement_MultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Refers on</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENT__REFERS_ON = eINSTANCE.getDomainElement_Refers_on();

		/**
		 * The meta object literal for the '<em><b>Belongs to</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENT__BELONGS_TO = eINSTANCE.getDomainElement_Belongs_to();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ELEMENT__ID = eINSTANCE.getDomainElement_Id();

	}

} //MSPLModelPackage
