/**
 */
package fr.unice.spinefm.MSPLModel.exceptions;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see fr.unice.spinefm.MSPLModel.exceptions.ExceptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExceptionsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exceptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "exceptions.msplm.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msplm.exceptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsPackage eINSTANCE = fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Domain Element Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException
	 * @see fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl#getDomainElementNotFoundException()
	 * @generated
	 */
	int DOMAIN_ELEMENT_NOT_FOUND_EXCEPTION = 0;

	/**
	 * The meta object id for the '<em>DE Association Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException
	 * @see fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl#getDEAssociationNotFoundException()
	 * @generated
	 */
	int DE_ASSOCIATION_NOT_FOUND_EXCEPTION = 1;


	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException <em>Domain Element Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Domain Element Not Found Exception</em>'.
	 * @see fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException
	 * @model instanceClass="fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException"
	 * @generated
	 */
	EDataType getDomainElementNotFoundException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException <em>DE Association Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DE Association Not Found Exception</em>'.
	 * @see fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException
	 * @model instanceClass="fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException"
	 * @generated
	 */
	EDataType getDEAssociationNotFoundException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExceptionsFactory getExceptionsFactory();

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
		 * The meta object literal for the '<em>Domain Element Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException
		 * @see fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl#getDomainElementNotFoundException()
		 * @generated
		 */
		EDataType DOMAIN_ELEMENT_NOT_FOUND_EXCEPTION = eINSTANCE.getDomainElementNotFoundException();

		/**
		 * The meta object literal for the '<em>DE Association Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException
		 * @see fr.unice.spinefm.MSPLModel.exceptions.impl.ExceptionsPackageImpl#getDEAssociationNotFoundException()
		 * @generated
		 */
		EDataType DE_ASSOCIATION_NOT_FOUND_EXCEPTION = eINSTANCE.getDEAssociationNotFoundException();

	}

} //ExceptionsPackage
