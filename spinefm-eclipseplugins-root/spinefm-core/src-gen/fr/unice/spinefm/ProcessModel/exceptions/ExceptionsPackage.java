/**
 */
package fr.unice.spinefm.ProcessModel.exceptions;

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
 * @see fr.unice.spinefm.ProcessModel.exceptions.ExceptionsFactory
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
	String eNS_URI = "exceptions.pm.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pm.exceptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsPackage eINSTANCE = fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Context Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException
	 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getContextNotFoundException()
	 * @generated
	 */
	int CONTEXT_NOT_FOUND_EXCEPTION = 0;

	/**
	 * The meta object id for the '<em>FM Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.exceptions.FMNotFoundException
	 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getFMNotFoundException()
	 * @generated
	 */
	int FM_NOT_FOUND_EXCEPTION = 1;

	/**
	 * The meta object id for the '<em>Context Merging Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.exceptions.ContextMergingException
	 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getContextMergingException()
	 * @generated
	 */
	int CONTEXT_MERGING_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>CPS Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException
	 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getCPSNotFoundException()
	 * @generated
	 */
	int CPS_NOT_FOUND_EXCEPTION = 3;


	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException <em>Context Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Context Not Found Exception</em>'.
	 * @see fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException
	 * @model instanceClass="fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException"
	 * @generated
	 */
	EDataType getContextNotFoundException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ProcessModel.exceptions.FMNotFoundException <em>FM Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FM Not Found Exception</em>'.
	 * @see fr.unice.spinefm.ProcessModel.exceptions.FMNotFoundException
	 * @model instanceClass="fr.unice.spinefm.ProcessModel.exceptions.FMNotFoundException"
	 * @generated
	 */
	EDataType getFMNotFoundException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ProcessModel.exceptions.ContextMergingException <em>Context Merging Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Context Merging Exception</em>'.
	 * @see fr.unice.spinefm.ProcessModel.exceptions.ContextMergingException
	 * @model instanceClass="fr.unice.spinefm.ProcessModel.exceptions.ContextMergingException"
	 * @generated
	 */
	EDataType getContextMergingException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException <em>CPS Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CPS Not Found Exception</em>'.
	 * @see fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException
	 * @model instanceClass="fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException"
	 * @generated
	 */
	EDataType getCPSNotFoundException();

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
		 * The meta object literal for the '<em>Context Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException
		 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getContextNotFoundException()
		 * @generated
		 */
		EDataType CONTEXT_NOT_FOUND_EXCEPTION = eINSTANCE.getContextNotFoundException();

		/**
		 * The meta object literal for the '<em>FM Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.exceptions.FMNotFoundException
		 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getFMNotFoundException()
		 * @generated
		 */
		EDataType FM_NOT_FOUND_EXCEPTION = eINSTANCE.getFMNotFoundException();

		/**
		 * The meta object literal for the '<em>Context Merging Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.exceptions.ContextMergingException
		 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getContextMergingException()
		 * @generated
		 */
		EDataType CONTEXT_MERGING_EXCEPTION = eINSTANCE.getContextMergingException();

		/**
		 * The meta object literal for the '<em>CPS Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException
		 * @see fr.unice.spinefm.ProcessModel.exceptions.impl.ExceptionsPackageImpl#getCPSNotFoundException()
		 * @generated
		 */
		EDataType CPS_NOT_FOUND_EXCEPTION = eINSTANCE.getCPSNotFoundException();

	}

} //ExceptionsPackage
