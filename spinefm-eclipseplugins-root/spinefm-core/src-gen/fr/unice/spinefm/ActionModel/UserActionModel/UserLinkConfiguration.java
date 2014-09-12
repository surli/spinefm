/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Link Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfSourceName <em>Conf Source Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfTargetName <em>Conf Target Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getAssoName <em>Asso Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserLinkConfiguration()
 * @model
 * @generated
 */
public interface UserLinkConfiguration extends UserAction
{
	/**
	 * Returns the value of the '<em><b>Conf Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Source Name</em>' attribute.
	 * @see #setConfSourceName(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserLinkConfiguration_ConfSourceName()
	 * @model required="true"
	 * @generated
	 */
	String getConfSourceName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfSourceName <em>Conf Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Source Name</em>' attribute.
	 * @see #getConfSourceName()
	 * @generated
	 */
	void setConfSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Conf Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Target Name</em>' attribute.
	 * @see #setConfTargetName(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserLinkConfiguration_ConfTargetName()
	 * @model required="true"
	 * @generated
	 */
	String getConfTargetName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getConfTargetName <em>Conf Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Target Name</em>' attribute.
	 * @see #getConfTargetName()
	 * @generated
	 */
	void setConfTargetName(String value);

	/**
	 * Returns the value of the '<em><b>Asso Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asso Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asso Name</em>' attribute.
	 * @see #setAssoName(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserLinkConfiguration_AssoName()
	 * @model required="true"
	 * @generated
	 */
	String getAssoName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserLinkConfiguration#getAssoName <em>Asso Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asso Name</em>' attribute.
	 * @see #getAssoName()
	 * @generated
	 */
	void setAssoName(String value);

} // UserLinkConfiguration
