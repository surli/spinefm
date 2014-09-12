/**
 */
package fr.unice.spinefm.fmengine;

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
 * @see fr.unice.spinefm.fmengine.FmengineFactory
 * @model kind="package"
 * @generated
 */
public interface FmenginePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fmengine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fmengine.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fmengine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmenginePackage eINSTANCE = fr.unice.spinefm.fmengine.impl.FmenginePackageImpl.init();

	/**
	 * The meta object id for the '<em>FM Spine FM Adapter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.fmengine.FMSpineFMAdapter
	 * @see fr.unice.spinefm.fmengine.impl.FmenginePackageImpl#getFMSpineFMAdapter()
	 * @generated
	 */
	int FM_SPINE_FM_ADAPTER = 0;


	/**
	 * Returns the meta object for data type '{@link fr.unice.spinefm.fmengine.FMSpineFMAdapter <em>FM Spine FM Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FM Spine FM Adapter</em>'.
	 * @see fr.unice.spinefm.fmengine.FMSpineFMAdapter
	 * @model instanceClass="fr.unice.spinefm.fmengine.FMSpineFMAdapter" serializeable="false"
	 * @generated
	 */
	EDataType getFMSpineFMAdapter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmengineFactory getFmengineFactory();

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
		 * The meta object literal for the '<em>FM Spine FM Adapter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.fmengine.FMSpineFMAdapter
		 * @see fr.unice.spinefm.fmengine.impl.FmenginePackageImpl#getFMSpineFMAdapter()
		 * @generated
		 */
		EDataType FM_SPINE_FM_ADAPTER = eINSTANCE.getFMSpineFMAdapter();

	}

} //FmenginePackage
