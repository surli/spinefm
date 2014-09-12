/**
 */
package fr.unice.spinefm.ActionModel.UserActionModel;

import fr.unice.spinefm.ActionModel.ActionMode;

import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.ProcessModel.ContextManager;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.FatalSpineFMException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getStep <em>Step</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getType <em>Type</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getContextManager <em>Context Manager</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserAction()
 * @model abstract="true"
 * @generated
 */
public interface UserAction extends EObject
{
	/**
	 * Returns the value of the '<em><b>Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.unice.spinefm.HistoryModel.Step#getLaunchingAction <em>Launching Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' container reference.
	 * @see #setStep(Step)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserAction_Step()
	 * @see fr.unice.spinefm.HistoryModel.Step#getLaunchingAction
	 * @model opposite="launchingAction" transient="false"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getStep <em>Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' container reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.spinefm.ActionModel.ActionMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.unice.spinefm.ActionModel.ActionMode
	 * @see #setType(ActionMode)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserAction_Type()
	 * @model required="true"
	 * @generated
	 */
	ActionMode getType();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.unice.spinefm.ActionModel.ActionMode
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionMode value);

	/**
	 * Returns the value of the '<em><b>Context Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Manager</em>' reference.
	 * @see #setContextManager(ContextManager)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserAction_ContextManager()
	 * @model required="true"
	 * @generated
	 */
	ContextManager getContextManager();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getContextManager <em>Context Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Manager</em>' reference.
	 * @see #getContextManager()
	 * @generated
	 */
	void setContextManager(ContextManager value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(EObject)
	 * @see fr.unice.spinefm.ActionModel.UserActionModel.UserActionModelPackage#getUserAction_Result()
	 * @model required="true" transient="true"
	 * @generated
	 */
	EObject getResult();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.UserActionModel.UserAction#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.exceptions.ElementNotFoundException fr.unice.spinefm.exceptions.FatalSpineFMException"
	 * @generated
	 */
	void apply() throws ElementNotFoundException, FatalSpineFMException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextManagerRequired="true"
	 * @generated
	 */
	void initManualAction(ContextManager contextManager);

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
	UserAction cloneActionWithStringAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean precondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void postcondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contextIDRequired="true"
	 * @generated
	 */
	String transformContextNameToSave(String contextID);

} // UserAction
