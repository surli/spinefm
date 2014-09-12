/**
 */
package fr.unice.spinefm.RFModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.RFModel.RFModelPackage
 * @generated
 */
public interface RFModelFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RFModelFactory eINSTANCE = fr.unice.spinefm.RFModel.impl.RFModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Restriction Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction Function</em>'.
	 * @generated
	 */
	RestrictionFunction createRestrictionFunction();

	/**
	 * Returns a new object of class '<em>Configuration State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration State</em>'.
	 * @generated
	 */
	ConfigurationState createConfigurationState();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RFModelPackage getRFModelPackage();

} //RFModelFactory
