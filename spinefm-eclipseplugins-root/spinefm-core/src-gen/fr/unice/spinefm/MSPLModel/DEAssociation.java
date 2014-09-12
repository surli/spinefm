/**
 */
package fr.unice.spinefm.MSPLModel;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import fr.unice.spinefm.RFModel.RestrictionFunction;

import fr.unice.spinefm.exceptions.IllegalCallException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DE Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DEAssociation#getRestrictionFunction <em>Restriction Function</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DEAssociation#getExtremity <em>Extremity</em>}</li>
 *   <li>{@link fr.unice.spinefm.MSPLModel.DEAssociation#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociation()
 * @model
 * @generated
 */
public interface DEAssociation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Restriction Function</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.RFModel.RestrictionFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Function</em>' containment reference list.
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociation_RestrictionFunction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RestrictionFunction> getRestrictionFunction();

	/**
	 * Returns the value of the '<em><b>Extremity</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.MSPLModel.DEAssociationEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extremity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extremity</em>' containment reference list.
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociation_Extremity()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<DEAssociationEnd> getExtremity();

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
	 * @see fr.unice.spinefm.MSPLModel.MSPLModelPackage#getDEAssociation_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.MSPLModel.DEAssociation#getId <em>Id</em>}' attribute.
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
	 * @model ordered="false" exceptions="fr.unice.spinefm.exceptions.IllegalCallException" CPSSourceRequired="true" CPSTargetRequired="true"
	 * @generated
	 */
	EList<ActionOnFM> computeActionsToDo(ConfigurationProcessStep CPSSource, ConfigurationProcessStep CPSTarget) throws IllegalCallException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException"
	 * @generated
	 */
	void createAndAssociateInverseAssociation() throws FeatureNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" firstExtremityRequired="true" secondExtremityRequired="true"
	 * @generated
	 */
	boolean isLinkBetweenDEs(DomainElement firstExtremity, DomainElement secondExtremity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException" sourceRequired="true"
	 * @generated
	 */
	DEAssociationEnd getOppositeExtremity(DomainElement source) throws DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException" deRequired="true"
	 * @generated
	 */
	DEAssociationEnd getExtremityOfDE(DomainElement de) throws DomainElementNotFoundException;

} // DEAssociation
