/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Save Past</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast#getDestPath <em>Dest Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserSavePast()
 * @model
 * @generated
 */
public interface UserSavePast extends UserAction
{
	/**
	 * Returns the value of the '<em><b>Dest Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Path</em>' attribute.
	 * @see #setDestPath(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserSavePast_DestPath()
	 * @model required="true"
	 * @generated
	 */
	String getDestPath();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserSavePast#getDestPath <em>Dest Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Path</em>' attribute.
	 * @see #getDestPath()
	 * @generated
	 */
	void setDestPath(String value);

} // UserSavePast
