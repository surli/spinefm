/**
 */
package fr.unice.spinefm.MSPLModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage
 * @generated
 */
public interface MSPLModelFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MSPLModelFactory eINSTANCE = fr.unice.spinefm.MSPLModel.impl.MSPLModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Multiple Software Product Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Software Product Line</em>'.
	 * @generated
	 */
	MultipleSoftwareProductLine createMultipleSoftwareProductLine();

	/**
	 * Returns a new object of class '<em>DE Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DE Association</em>'.
	 * @generated
	 */
	DEAssociation createDEAssociation();

	/**
	 * Returns a new object of class '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Element</em>'.
	 * @generated
	 */
	MultiplicityElement createMultiplicityElement();

	/**
	 * Returns a new object of class '<em>DE Association End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DE Association End</em>'.
	 * @generated
	 */
	DEAssociationEnd createDEAssociationEnd();

	/**
	 * Returns a new object of class '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Element</em>'.
	 * @generated
	 */
	DomainElement createDomainElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MSPLModelPackage getMSPLModelPackage();

} //MSPLModelFactory
