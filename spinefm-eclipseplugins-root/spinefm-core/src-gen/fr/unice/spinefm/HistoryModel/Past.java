/**
 */
package fr.unice.spinefm.HistoryModel;

import fr.unice.spinefm.ActionModel.UserActionModel.UserAction;

import fr.unice.spinefm.ProcessModel.LocalContext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Past</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Past#getSteps <em>Steps</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Past#getDeletedContext <em>Deleted Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Past#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Past#getRootPath <em>Root Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Past#getModelPath <em>Model Path</em>}</li>
 *   <li>{@link fr.unice.spinefm.HistoryModel.Past#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast()
 * @model
 * @generated
 */
public interface Past extends EObject
{
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.HistoryModel.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Deleted Context</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ProcessModel.LocalContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Context</em>' containment reference list.
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast_DeletedContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalContext> getDeletedContext();

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
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.HistoryModel.Past#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Path</em>' attribute.
	 * @see #setRootPath(String)
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast_RootPath()
	 * @model required="true"
	 * @generated
	 */
	String getRootPath();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.HistoryModel.Past#getRootPath <em>Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Path</em>' attribute.
	 * @see #getRootPath()
	 * @generated
	 */
	void setRootPath(String value);

	/**
	 * Returns the value of the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Path</em>' attribute.
	 * @see #setModelPath(String)
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast_ModelPath()
	 * @model required="true"
	 * @generated
	 */
	String getModelPath();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.HistoryModel.Past#getModelPath <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Path</em>' attribute.
	 * @see #getModelPath()
	 * @generated
	 */
	void setModelPath(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.unice.spinefm.HistoryModel.HistoryModelPackage#getPast_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.HistoryModel.Past#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" actionRequired="true"
	 * @generated
	 */
	Step createStep(UserAction action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undoLastAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Past clonePastWithoutSystemActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stepRequired="true"
	 * @generated
	 */
	void undoAction(Step step);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stepIdRequired="true"
	 * @generated
	 */
	Step getStepFromId(String stepId);

} // Past
