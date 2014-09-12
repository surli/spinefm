/**
 */
package fr.unice.spinefm.ConfigurationModel.exceptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsPackage
 * @generated
 */
public interface ExceptionsFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsFactory eINSTANCE = fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExceptionsPackage getExceptionsPackage();

} //ExceptionsFactory
