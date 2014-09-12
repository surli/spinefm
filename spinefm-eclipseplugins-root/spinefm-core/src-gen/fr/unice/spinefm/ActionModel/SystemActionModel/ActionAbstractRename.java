/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Abstract Rename</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getOldName <em>Old Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionAbstractRename()
 * @model
 * @generated
 */
public interface ActionAbstractRename extends SystemAction
{
	/**
	 * Returns the value of the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Name</em>' attribute.
	 * @see #setOldName(String)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionAbstractRename_OldName()
	 * @model required="true"
	 * @generated
	 */
	String getOldName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getOldName <em>Old Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Name</em>' attribute.
	 * @see #getOldName()
	 * @generated
	 */
	void setOldName(String value);

	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionAbstractRename_NewName()
	 * @model required="true"
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionAbstractRename#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // ActionAbstractRename
