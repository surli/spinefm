/**
 */
package fr.unice.spinefm.ConfigurationModel;

import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;

import fr.unice.spinefm.FMModel.FeatureModel;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.DomainElement;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import fr.unice.spinefm.RFModel.ConfigurationState;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getCPSRef <em>CPS Ref</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getBelongs_to <em>Belongs to</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getState <em>State</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getDomainElement <em>Domain Element</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.Configuration#getClonedCPS <em>Cloned CPS</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
	/**
	 * Returns the value of the '<em><b>CPS Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPS Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPS Ref</em>' reference.
	 * @see #setCPSRef(ConfigurationProcessStep)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_CPSRef()
	 * @see fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getConfiguration
	 * @model opposite="configuration" required="true"
	 * @generated
	 */
	ConfigurationProcessStep getCPSRef();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getCPSRef <em>CPS Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPS Ref</em>' reference.
	 * @see #getCPSRef()
	 * @generated
	 */
	void setCPSRef(ConfigurationProcessStep value);

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
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Belongs to</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ConfigurationModel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs to</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs to</em>' reference list.
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_Belongs_to()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Link> getBelongs_to();

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ConfigurationState)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_State()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationState getState();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ConfigurationState value);

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
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Domain Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element</em>' reference.
	 * @see #setDomainElement(DomainElement)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_DomainElement()
	 * @model required="true"
	 * @generated
	 */
	DomainElement getDomainElement();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getDomainElement <em>Domain Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Element</em>' reference.
	 * @see #getDomainElement()
	 * @generated
	 */
	void setDomainElement(DomainElement value);

	/**
	 * Returns the value of the '<em><b>Cloned CPS</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloned CPS</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloned CPS</em>' reference list.
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getConfiguration_ClonedCPS()
	 * @model
	 * @generated
	 */
	EList<ConfigurationProcessStep> getClonedCPS();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException" associationRequired="true"
	 * @generated
	 */
	boolean canBeLinked(DEAssociation association) throws DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	FeatureModel getFeatureModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" exceptions="fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException" deRequired="true"
	 * @generated
	 */
	EList<Configuration> getLinkedConfigurationsOfDomainElement(DomainElement de) throws ConfigNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException"
	 * @generated
	 */
	boolean isCompletlyLinked() throws ConfigNotFoundException, DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EList<ConfigurationProcessStep> getAllCPS();

} // Configuration
