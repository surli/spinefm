/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Deselect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getDomainElementName <em>Domain Element Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getContextID <em>Context ID</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserDeselect()
 * @model
 * @generated
 */
public interface UserDeselect extends UserAction
{
	/**
	 * Returns the value of the '<em><b>Domain Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element Name</em>' attribute.
	 * @see #setDomainElementName(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserDeselect_DomainElementName()
	 * @model required="true"
	 * @generated
	 */
	String getDomainElementName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getDomainElementName <em>Domain Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Element Name</em>' attribute.
	 * @see #getDomainElementName()
	 * @generated
	 */
	void setDomainElementName(String value);

	/**
	 * Returns the value of the '<em><b>Context ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context ID</em>' attribute.
	 * @see #setContextID(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserDeselect_ContextID()
	 * @model required="true"
	 * @generated
	 */
	String getContextID();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getContextID <em>Context ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context ID</em>' attribute.
	 * @see #getContextID()
	 * @generated
	 */
	void setContextID(String value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserDeselect_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserDeselect#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // UserDeselect
