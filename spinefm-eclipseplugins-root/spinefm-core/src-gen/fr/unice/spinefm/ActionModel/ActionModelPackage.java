/**
 */
package fr.unice.spinefm.ActionModel;

import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.unice.spinefm.ActionModel.ActionModelFactory
 * @model kind="package"
 * @generated
 */
public interface ActionModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ActionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "action.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionModelPackage eINSTANCE = fr.unice.spinefm.ActionModel.impl.ActionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.ActionModel.ActionMode <em>Action Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.ActionModel.ActionMode
	 * @see fr.unice.spinefm.ActionModel.impl.ActionModelPackageImpl#getActionMode()
	 * @generated
	 */
	int ACTION_MODE = 0;


	/**
	 * Returns the meta object for enum '{@link fr.unice.spinefm.ActionModel.ActionMode <em>Action Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Mode</em>'.
	 * @see fr.unice.spinefm.ActionModel.ActionMode
	 * @generated
	 */
	EEnum getActionMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionModelFactory getActionModelFactory();

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
		 * The meta object literal for the '{@link fr.unice.spinefm.ActionModel.ActionMode <em>Action Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.ActionModel.ActionMode
		 * @see fr.unice.spinefm.ActionModel.impl.ActionModelPackageImpl#getActionMode()
		 * @generated
		 */
		EEnum ACTION_MODE = eINSTANCE.getActionMode();

	}

} //ActionModelPackage
