/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage
 * @generated
 */
public interface SystemActionModelFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemActionModelFactory eINSTANCE = fr.unice.spinefm.ActionModel.SystemActionModel.impl.SystemActionModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Create Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Create Configuration</em>'.
	 * @generated
	 */
	ActionCreateConfiguration createActionCreateConfiguration();

	/**
	 * Returns a new object of class '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Link</em>'.
	 * @generated
	 */
	ActionLink createActionLink();

	/**
	 * Returns a new object of class '<em>Action Create Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Create Context</em>'.
	 * @generated
	 */
	ActionCreateContext createActionCreateContext();

	/**
	 * Returns a new object of class '<em>Action Move Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Move Configuration</em>'.
	 * @generated
	 */
	ActionMoveConfiguration createActionMoveConfiguration();

	/**
	 * Returns a new object of class '<em>Action Delete Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Delete Context</em>'.
	 * @generated
	 */
	ActionDeleteContext createActionDeleteContext();

	/**
	 * Returns a new object of class '<em>Action Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Select</em>'.
	 * @generated
	 */
	ActionSelect createActionSelect();

	/**
	 * Returns a new object of class '<em>Action Deselect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Deselect</em>'.
	 * @generated
	 */
	ActionDeselect createActionDeselect();

	/**
	 * Returns a new object of class '<em>Action Add CT Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Add CT Constraint</em>'.
	 * @generated
	 */
	ActionAddCTConstraint createActionAddCTConstraint();

	/**
	 * Returns a new object of class '<em>Action Abstract Rename</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Abstract Rename</em>'.
	 * @generated
	 */
	ActionAbstractRename createActionAbstractRename();

	/**
	 * Returns a new object of class '<em>Action Rename CPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Rename CPS</em>'.
	 * @generated
	 */
	ActionRenameCPS createActionRenameCPS();

	/**
	 * Returns a new object of class '<em>Action Rename Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Rename Config</em>'.
	 * @generated
	 */
	ActionRenameConfig createActionRenameConfig();

	/**
	 * Returns a new object of class '<em>Action Rename Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Rename Product</em>'.
	 * @generated
	 */
	ActionRenameProduct createActionRenameProduct();

	/**
	 * Returns a new object of class '<em>Action Set Product Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Set Product Description</em>'.
	 * @generated
	 */
	ActionSetProductDescription createActionSetProductDescription();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemActionModelPackage getSystemActionModelPackage();

} //SystemActionModelFactory
