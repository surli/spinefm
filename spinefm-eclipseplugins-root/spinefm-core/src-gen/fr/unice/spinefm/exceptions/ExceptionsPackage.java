/**
 */
package fr.unice.spinefm.exceptions;

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
 * @see fr.unice.spinefm.exceptions.ExceptionsFactory
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
	String eNS_URI = "exceptions.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exceptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsPackage eINSTANCE = fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Illegal Call Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.exceptions.IllegalCallException
	 * @see fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl#getIllegalCallException()
	 * @generated
	 */
	int ILLEGAL_CALL_EXCEPTION = 0;

	/**
	 * The meta object id for the '<em>Element Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.exceptions.ElementNotFoundException
	 * @see fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl#getElementNotFoundException()
	 * @generated
	 */
	int ELEMENT_NOT_FOUND_EXCEPTION = 1;

	/**
	 * The meta object id for the '<em>Fatal Spine FM Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.exceptions.FatalSpineFMException
	 * @see fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl#getFatalSpineFMException()
	 * @generated
	 */
	int FATAL_SPINE_FM_EXCEPTION = 2;


	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.exceptions.IllegalCallException <em>Illegal Call Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Illegal Call Exception</em>'.
	 * @see fr.unice.spinefm.exceptions.IllegalCallException
	 * @model instanceClass="fr.unice.spinefm.exceptions.IllegalCallException"
	 * @generated
	 */
	EDataType getIllegalCallException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.exceptions.ElementNotFoundException <em>Element Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Element Not Found Exception</em>'.
	 * @see fr.unice.spinefm.exceptions.ElementNotFoundException
	 * @model instanceClass="fr.unice.spinefm.exceptions.ElementNotFoundException"
	 * @generated
	 */
	EDataType getElementNotFoundException();

	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.exceptions.FatalSpineFMException <em>Fatal Spine FM Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fatal Spine FM Exception</em>'.
	 * @see fr.unice.spinefm.exceptions.FatalSpineFMException
	 * @model instanceClass="fr.unice.spinefm.exceptions.FatalSpineFMException"
	 * @generated
	 */
	EDataType getFatalSpineFMException();

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
		 * The meta object literal for the '<em>Illegal Call Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.exceptions.IllegalCallException
		 * @see fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl#getIllegalCallException()
		 * @generated
		 */
		EDataType ILLEGAL_CALL_EXCEPTION = eINSTANCE.getIllegalCallException();

		/**
		 * The meta object literal for the '<em>Element Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.exceptions.ElementNotFoundException
		 * @see fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl#getElementNotFoundException()
		 * @generated
		 */
		EDataType ELEMENT_NOT_FOUND_EXCEPTION = eINSTANCE.getElementNotFoundException();

		/**
		 * The meta object literal for the '<em>Fatal Spine FM Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.exceptions.FatalSpineFMException
		 * @see fr.unice.spinefm.exceptions.impl.ExceptionsPackageImpl#getFatalSpineFMException()
		 * @generated
		 */
		EDataType FATAL_SPINE_FM_EXCEPTION = eINSTANCE.getFatalSpineFMException();

	}

} //ExceptionsPackage
