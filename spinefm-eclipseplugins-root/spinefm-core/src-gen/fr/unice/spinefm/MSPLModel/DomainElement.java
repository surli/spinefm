/**
 */
package fr.unice.spinefm.MSPLModel;

import fr.unice.spinefm.FMModel.FeatureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DomainElement#getMultiplicityElement <em>Multiplicity Element</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DomainElement#getRefers_on <em>Refers on</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DomainElement#getBelongs_to <em>Belongs to</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DomainElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDomainElement()
 * @model
 * @generated
 */
public interface DomainElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Multiplicity Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity Element</em>' containment reference.
	 * @see #setMultiplicityElement(MultiplicityElement)
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDomainElement_MultiplicityElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiplicityElement getMultiplicityElement();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DomainElement#getMultiplicityElement <em>Multiplicity Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity Element</em>' containment reference.
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	void setMultiplicityElement(MultiplicityElement value);

	/**
	 * Returns the value of the '<em><b>Refers on</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers on</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers on</em>' containment reference.
	 * @see #setRefers_on(FeatureModel)
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDomainElement_Refers_on()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureModel getRefers_on();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DomainElement#getRefers_on <em>Refers on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers on</em>' containment reference.
	 * @see #getRefers_on()
	 * @generated
	 */
	void setRefers_on(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Belongs to</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.MSPLModel.DEAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs to</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs to</em>' reference list.
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDomainElement_Belongs_to()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DEAssociation> getBelongs_to();

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
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDomainElement_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DomainElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DomainElement
