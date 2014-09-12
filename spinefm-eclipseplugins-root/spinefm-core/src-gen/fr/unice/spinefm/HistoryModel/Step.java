/**
 */
package fr.unice.spinefm.HistoryModel;

import fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Step#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Step#getLaunchingAction <em>Launching Action</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Step#getLaunchedActions <em>Launched Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getStep_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.HistoryModel.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Launching Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launching Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launching Action</em>' containment reference.
	 * @see #setLaunchingAction(UserAction)
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getStep_LaunchingAction()
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getStep
	 * @model opposite="step" containment="true" required="true"
	 * @generated
	 */
	UserAction getLaunchingAction();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.HistoryModel.Step#getLaunchingAction <em>Launching Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launching Action</em>' containment reference.
	 * @see #getLaunchingAction()
	 * @generated
	 */
	void setLaunchingAction(UserAction value);

	/**
	 * Returns the value of the '<em><b>Launched Actions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction}.
	 * It is bidirectional and its opposite is '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launched Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launched Actions</em>' containment reference list.
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getStep_LaunchedActions()
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getStep
	 * @model opposite="step" containment="true" transient="true"
	 * @generated
	 */
	EList<SystemAction> getLaunchedActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undoActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Step cloneStepWithoutSystemActions();

} // Step
