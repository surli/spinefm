/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.ActionModel.ActionMode;

import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getCpsHistory <em>Cps History</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getStep <em>Step</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getSystemAction()
 * @model abstract="true"
 * @generated
 */
public interface SystemAction extends EObject
{
	/**
	 * Returns the value of the '<em><b>Cps History</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cps History</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps History</em>' attribute list.
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getSystemAction_CpsHistory()
	 * @model
	 * @generated
	 */
	EList<String> getCpsHistory();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.unice.spinefm.HistoryModel.Step#getLaunchedActions <em>Launched Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' container reference.
	 * @see #setStep(Step)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getSystemAction_Step()
	 * @see fr.unice.spinefm.HistoryModel.Step#getLaunchedActions
	 * @model opposite="launchedActions" required="true"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getStep <em>Step</em>}' container reference.
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
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getSystemAction_Type()
	 * @model required="true"
	 * @generated
	 */
	ActionMode getType();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.SystemAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.unice.spinefm.ActionModel.ActionMode
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionMode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.ElementNotFoundException"
	 * @generated
	 */
	void apply() throws FMEngineException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" oRequired="true"
	 * @generated
	 */
	boolean isSameObject(EObject o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

} // SystemAction
