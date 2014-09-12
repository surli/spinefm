/**
 */
package fr.unice.spinefm.MSPLModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DE Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getLinkMultiplicity <em>Link Multiplicity</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getApply_on <em>Apply on</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociationEnd()
 * @model
 * @generated
 */
public interface DEAssociationEnd extends EObject
{
	/**
	 * Returns the value of the '<em><b>Link Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Multiplicity</em>' containment reference.
	 * @see #setLinkMultiplicity(MultiplicityElement)
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociationEnd_LinkMultiplicity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiplicityElement getLinkMultiplicity();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getLinkMultiplicity <em>Link Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Multiplicity</em>' containment reference.
	 * @see #getLinkMultiplicity()
	 * @generated
	 */
	void setLinkMultiplicity(MultiplicityElement value);

	/**
	 * Returns the value of the '<em><b>Apply on</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply on</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply on</em>' reference.
	 * @see #setApply_on(DomainElement)
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociationEnd_Apply_on()
	 * @model required="true"
	 * @generated
	 */
	DomainElement getApply_on();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getApply_on <em>Apply on</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply on</em>' reference.
	 * @see #getApply_on()
	 * @generated
	 */
	void setApply_on(DomainElement value);

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
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociationEnd_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DEAssociationEnd#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DEAssociationEnd
