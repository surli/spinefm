/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage
 * @generated
 */
public interface UserActionModelFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserActionModelFactory eINSTANCE = fr.unice.spinefm.ActionModel.UserActionModel.impl.UserActionModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Select</em>'.
	 * @generated
	 */
	UserSelect createUserSelect();

	/**
	 * Returns a new object of class '<em>User Create Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Create Context</em>'.
	 * @generated
	 */
	UserCreateContext createUserCreateContext();

	/**
	 * Returns a new object of class '<em>User Deselect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Deselect</em>'.
	 * @generated
	 */
	UserDeselect createUserDeselect();

	/**
	 * Returns a new object of class '<em>User Propagate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Propagate</em>'.
	 * @generated
	 */
	UserPropagate createUserPropagate();

	/**
	 * Returns a new object of class '<em>User Valid Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Valid Configuration</em>'.
	 * @generated
	 */
	UserValidConfiguration createUserValidConfiguration();

	/**
	 * Returns a new object of class '<em>User Link Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Link Configuration</em>'.
	 * @generated
	 */
	UserLinkConfiguration createUserLinkConfiguration();

	/**
	 * Returns a new object of class '<em>User Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Init</em>'.
	 * @generated
	 */
	UserInit createUserInit();

	/**
	 * Returns a new object of class '<em>User Generate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Generate</em>'.
	 * @generated
	 */
	UserGenerate createUserGenerate();

	/**
	 * Returns a new object of class '<em>User Save Past</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Save Past</em>'.
	 * @generated
	 */
	UserSavePast createUserSavePast();

	/**
	 * Returns a new object of class '<em>User Rename Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Rename Element</em>'.
	 * @generated
	 */
	UserRenameElement createUserRenameElement();

	/**
	 * Returns a new object of class '<em>User Clone Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Clone Context</em>'.
	 * @generated
	 */
	UserCloneContext createUserCloneContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UserActionModelPackage getUserActionModelPackage();

} //UserActionModelFactory
