/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getFilePath <em>File Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getPastPath <em>Past Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getConfDescription <em>Conf Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserInit()
 * @model
 * @generated
 */
public interface UserInit extends UserAction
{
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserInit_FilePath()
	 * @model required="true"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Past Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Past Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past Path</em>' attribute.
	 * @see #setPastPath(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserInit_PastPath()
	 * @model required="true"
	 * @generated
	 */
	String getPastPath();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getPastPath <em>Past Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past Path</em>' attribute.
	 * @see #getPastPath()
	 * @generated
	 */
	void setPastPath(String value);

	/**
	 * Returns the value of the '<em><b>Conf Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Description</em>' attribute.
	 * @see #setConfDescription(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserInit_ConfDescription()
	 * @model required="true"
	 * @generated
	 */
	String getConfDescription();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserInit#getConfDescription <em>Conf Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Description</em>' attribute.
	 * @see #getConfDescription()
	 * @generated
	 */
	void setConfDescription(String value);

} // UserInit
