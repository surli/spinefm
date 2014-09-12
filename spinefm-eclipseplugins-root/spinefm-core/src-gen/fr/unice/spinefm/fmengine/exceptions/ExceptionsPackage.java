/**
 */
package fr.unice.spinefm.fmengine.exceptions;

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
 * @see fr.unice.spinefm.fmengine.exceptions.ExceptionsFactory
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
	String eNS_URI = "exceptions.fmengine.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fmengine.exceptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExceptionsPackage eINSTANCE = fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl.init();

	/**
	 * The meta object id for the '<em>FM Engine Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.fmengine.exceptions.FMEngineException
	 * @see fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl#getFMEngineException()
	 * @generated
	 */
	int FM_ENGINE_EXCEPTION = 0;


	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.fmengine.exceptions.FMEngineException <em>FM Engine Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FM Engine Exception</em>'.
	 * @see fr.unice.spinefm.fmengine.exceptions.FMEngineException
	 * @model instanceClass="fr.unice.spinefm.fmengine.exceptions.FMEngineException"
	 * @generated
	 */
	EDataType getFMEngineException();

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
		 * The meta object literal for the '<em>FM Engine Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.fmengine.exceptions.FMEngineException
		 * @see fr.unice.spinefm.fmengine.exceptions.impl.ExceptionsPackageImpl#getFMEngineException()
		 * @generated
		 */
		EDataType FM_ENGINE_EXCEPTION = eINSTANCE.getFMEngineException();

	}

} //ExceptionsPackage
