/**
 */
package fr.unice.spinefm.RFModel;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

import fr.unice.spinefm.MSPLModel.DomainElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.RFModel.RestrictionFunction#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.RestrictionFunction#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.RestrictionFunction#getInverse <em>Inverse</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.RestrictionFunction#getSource <em>Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.RestrictionFunction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRestrictionFunction()
 * @model
 * @generated
 */
public interface RestrictionFunction extends EObject
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
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRestrictionFunction_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.RFModel.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRestrictionFunction_Rules()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' reference.
	 * @see #setInverse(RestrictionFunction)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRestrictionFunction_Inverse()
	 * @model required="true"
	 * @generated
	 */
	RestrictionFunction getInverse();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getInverse <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' reference.
	 * @see #getInverse()
	 * @generated
	 */
	void setInverse(RestrictionFunction value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DomainElement)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRestrictionFunction_Source()
	 * @model required="true"
	 * @generated
	 */
	DomainElement getSource();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DomainElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DomainElement)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getRestrictionFunction_Target()
	 * @model required="true"
	 * @generated
	 */
	DomainElement getTarget();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DomainElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException"
	 * @generated
	 */
	RestrictionFunction createAndAssociateInverseRestFunc() throws FeatureNotFoundException;

} // RestrictionFunction
