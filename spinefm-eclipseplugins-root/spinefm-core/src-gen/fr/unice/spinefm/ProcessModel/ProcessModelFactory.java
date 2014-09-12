/**
 */
package fr.unice.spinefm.ProcessModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage
 * @generated
 */
public interface ProcessModelFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessModelFactory eINSTANCE = fr.unice.spinefm.ProcessModel.impl.ProcessModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Process Step</em>'.
	 * @generated
	 */
	ConfigurationProcessStep createConfigurationProcessStep();

	/**
	 * Returns a new object of class '<em>Global Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Context</em>'.
	 * @generated
	 */
	GlobalContext createGlobalContext();

	/**
	 * Returns a new object of class '<em>Local Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Context</em>'.
	 * @generated
	 */
	LocalContext createLocalContext();

	/**
	 * Returns a new object of class '<em>Context Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Manager</em>'.
	 * @generated
	 */
	ContextManager createContextManager();

	/**
	 * Returns a new object of class '<em>Deleted Context Informations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleted Context Informations</em>'.
	 * @generated
	 */
	DeletedContextInformations createDeletedContextInformations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProcessModelPackage getProcessModelPackage();

} //ProcessModelFactory
