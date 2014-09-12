/**
 */
package fr.unice.spinefm.ConfigurationModel.exceptions;

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
 * @see fr.unice.spinefm.ConfigurationModel.exceptions.ExceptionsFactory
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
	String eNS_URI = "exceptions.cm.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cm.exceptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsPackage eINSTANCE = fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Config Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl#getConfigNotFoundException()
	 * @generated
	 */
	int CONFIG_NOT_FOUND_EXCEPTION = 0;

	/**
	 * The meta object id for the '<em>Invalid Association Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl#getInvalidAssociationException()
	 * @generated
	 */
	int INVALID_ASSOCIATION_EXCEPTION = 1;

	/**
	 * The meta object id for the '<em>Link Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.LinkNotFoundException
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl#getLinkNotFoundException()
	 * @generated
	 */
	int LINK_NOT_FOUND_EXCEPTION = 2;


	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException <em>Config Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Config Not Found Exception</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException
	 * @model instanceClass="fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException"
	 * @generated
	 */
	EDataType getConfigNotFoundException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException <em>Invalid Association Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Invalid Association Exception</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException
	 * @model instanceClass="fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException"
	 * @generated
	 */
	EDataType getInvalidAssociationException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ConfigurationModel.exceptions.LinkNotFoundException <em>Link Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Link Not Found Exception</em>'.
	 * @see fr.unice.spinefm.ConfigurationModel.exceptions.LinkNotFoundException
	 * @model instanceClass="fr.unice.spinefm.ConfigurationModel.exceptions.LinkNotFoundException"
	 * @generated
	 */
	EDataType getLinkNotFoundException();

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
		 * The meta object literal for the '<em>Config Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException
		 * @see fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl#getConfigNotFoundException()
		 * @generated
		 */
		EDataType CONFIG_NOT_FOUND_EXCEPTION = eINSTANCE.getConfigNotFoundException();

		/**
		 * The meta object literal for the '<em>Invalid Association Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException
		 * @see fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl#getInvalidAssociationException()
		 * @generated
		 */
		EDataType INVALID_ASSOCIATION_EXCEPTION = eINSTANCE.getInvalidAssociationException();

		/**
		 * The meta object literal for the '<em>Link Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ConfigurationModel.exceptions.LinkNotFoundException
		 * @see fr.unice.spinefm.ConfigurationModel.exceptions.impl.ExceptionsPackageImpl#getLinkNotFoundException()
		 * @generated
		 */
		EDataType LINK_NOT_FOUND_EXCEPTION = eINSTANCE.getLinkNotFoundException();

	}

} //ExceptionsPackage
