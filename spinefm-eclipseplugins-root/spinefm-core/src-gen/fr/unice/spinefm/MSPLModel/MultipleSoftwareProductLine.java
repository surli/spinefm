/**
 */
package fr.unice.spinefm.MSPLModel;

import fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException;
import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Software Product Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getDomainElements <em>Domain Elements</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getAssociations <em>Associations</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getMultipleSoftwareProductLine()
 * @model
 * @generated
 */
public interface MultipleSoftwareProductLine extends EObject
{
	/**
	 * Returns the value of the '<em><b>Domain Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.MSPLModel.DomainElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Elements</em>' containment reference list.
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getMultipleSoftwareProductLine_DomainElements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DomainElement> getDomainElements();

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.MSPLModel.DEAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getMultipleSoftwareProductLine_Associations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DEAssociation> getAssociations();

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
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getMultipleSoftwareProductLine_Id()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine#getId <em>Id</em>}' attribute is set.
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
	 * @model required="true" exceptions="fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException" nameRequired="true"
	 * @generated
	 */
	DomainElement getDomainElementByName(String name) throws DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" exceptions="fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException" sourceRequired="true" targetRequired="true"
	 * @generated
	 */
	EList<DEAssociation> getValidAssociationsForDEs(DomainElement source, DomainElement target) throws DEAssociationNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.MSPLModel.exceptions.DEAssociationNotFoundException" assoNameRequired="true"
	 * @generated
	 */
	DEAssociation getAssociationByName(String assoName) throws DEAssociationNotFoundException;

} // MultipleSoftwareProductLine
