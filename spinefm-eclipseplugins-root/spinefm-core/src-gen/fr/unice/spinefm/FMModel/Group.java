/**
 */
package fr.unice.spinefm.FMModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.FMModel.Group#getFeatures <em>Features</em>}</li>
 *   <li>{@link fr.unice.spinefm.FMModel.Group#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.FMModel.FMModelPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject
{
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.FMModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getGroup_Features()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"man"</code>.
	 * The literals are from the enumeration {@link fr.unice.spinefm.FMModel.GroupState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see fr.unice.spinefm.FMModel.GroupState
	 * @see #setState(GroupState)
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getGroup_State()
	 * @model default="man" required="true"
	 * @generated
	 */
	GroupState getState();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.FMModel.Group#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see fr.unice.spinefm.FMModel.GroupState
	 * @see #getState()
	 * @generated
	 */
	void setState(GroupState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Feature> getAllChildren();

} // Group
