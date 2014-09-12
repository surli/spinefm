/**
 */
package fr.unice.spinefm.ConfigurationModel;

import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;

import fr.unice.spinefm.MSPLModel.DEAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Link#getSource <em>Source</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Link#getRelatedAssociation <em>Related Association</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Link#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Configuration)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getLink_Source()
	 * @model required="true"
	 * @generated
	 */
	Configuration getSource();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Configuration value);

	/**
	 * Returns the value of the '<em><b>Related Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Association</em>' reference.
	 * @see #setRelatedAssociation(DEAssociation)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getLink_RelatedAssociation()
	 * @model required="true"
	 * @generated
	 */
	DEAssociation getRelatedAssociation();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Link#getRelatedAssociation <em>Related Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Association</em>' reference.
	 * @see #getRelatedAssociation()
	 * @generated
	 */
	void setRelatedAssociation(DEAssociation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Configuration)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Configuration getTarget();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Configuration value);

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
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getLink_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Link#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException" confRequired="true"
	 * @generated
	 */
	Configuration getAssociatedConfiguration(Configuration conf) throws ConfigNotFoundException;

} // Link
