/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Generate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserGenerate()
 * @model
 * @generated
 */
public interface UserGenerate extends UserAction
{
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserGenerate_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserGenerate#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // UserGenerate
