/**
 */
package fr.unice.spinefm.ProcessModel;

import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.MSPLModel.DomainElement;

import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;

import fr.unice.spinefm.exceptions.ElementNotFoundException;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.Context#getCPS <em>CPS</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.Context#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends EObject
{
	/**
	 * Returns the value of the '<em><b>CPS</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPS</em>' containment reference list.
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContext_CPS()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ConfigurationProcessStep> getCPS();

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
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContext_Id()
	 * @model unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.Context#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.unice.spinefm.ProcessModel.Context#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link fr.unice.spinefm.ProcessModel.Context#getId <em>Id</em>}' attribute is set.
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
	 * @model cpsRequired="true"
	 * @generated
	 */
	void addCPS(ConfigurationProcessStep cps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException" deRequired="true"
	 * @generated
	 */
	ConfigurationProcessStep getCPSOfDE(DomainElement de) throws CPSNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.ElementNotFoundException" externalCPSRequired="true" stepRequired="true" cmRequired="true"
	 * @generated
	 */
	void mergeExternalCPS(ConfigurationProcessStep externalCPS, Step step, ContextManager cm) throws FMEngineException, ElementNotFoundException;

} // Context
