/**
 */
package fr.unice.spinefm.ProcessModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deleted Context Informations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations#getDeletedContext <em>Deleted Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations#getReplacedBy <em>Replaced By</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getDeletedContextInformations()
 * @model
 * @generated
 */
public interface DeletedContextInformations extends EObject
{
	/**
	 * Returns the value of the '<em><b>Deleted Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Context</em>' attribute.
	 * @see #setDeletedContext(String)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getDeletedContextInformations_DeletedContext()
	 * @model
	 * @generated
	 */
	String getDeletedContext();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations#getDeletedContext <em>Deleted Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Context</em>' attribute.
	 * @see #getDeletedContext()
	 * @generated
	 */
	void setDeletedContext(String value);

	/**
	 * Returns the value of the '<em><b>Replaced By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaced By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced By</em>' reference.
	 * @see #setReplacedBy(Context)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getDeletedContextInformations_ReplacedBy()
	 * @model
	 * @generated
	 */
	Context getReplacedBy();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.DeletedContextInformations#getReplacedBy <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced By</em>' reference.
	 * @see #getReplacedBy()
	 * @generated
	 */
	void setReplacedBy(Context value);

} // DeletedContextInformations
