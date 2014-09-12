/**
 */
package fr.unice.spinefm.RFModel;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.RFModel.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.Rule#getState <em>State</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.Rule#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ActionOnFM)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRule_Action()
	 * @model required="true" transient="true"
	 * @generated
	 */
	ActionOnFM getAction();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.Rule#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionOnFM value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(ConfigurationState)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRule_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigurationState getState();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.Rule#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ConfigurationState value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRule_Id()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.Rule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link fr.unice.spinefm.RFModel.Rule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link fr.unice.spinefm.RFModel.Rule#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException"
	 * @generated
	 */
	Rule createInverseRule() throws FeatureNotFoundException;

} // Rule
