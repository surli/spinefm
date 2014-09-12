/**
 */
package fr.unice.spinefm.ConfigurationModel;

import fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException;
import fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException;

import fr.unice.spinefm.MSPLModel.DEAssociation;
import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getSubConfigurations <em>Sub Configurations</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getLinks <em>Links</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getMspl <em>Mspl</em>}</li>
 *   <li>{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getCompositeConfiguration()
 * @model
 * @generated
 */
public interface CompositeConfiguration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Sub Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ConfigurationModel.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Configurations</em>' containment reference list.
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getCompositeConfiguration_SubConfigurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Configuration> getSubConfigurations();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ConfigurationModel.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getCompositeConfiguration_Links()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getCompositeConfiguration_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mspl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mspl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mspl</em>' reference.
	 * @see #setMspl(MultipleSoftwareProductLine)
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getCompositeConfiguration_Mspl()
	 * @model required="true"
	 * @generated
	 */
	MultipleSoftwareProductLine getMspl();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getMspl <em>Mspl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mspl</em>' reference.
	 * @see #getMspl()
	 * @generated
	 */
	void setMspl(MultipleSoftwareProductLine value);

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
	 * @see fr.unice.spinefm.ConfigurationModel.ConfigurationModelPackage#getCompositeConfiguration_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ConfigurationModel.CompositeConfiguration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException"
	 * @generated
	 */
	boolean isValid() throws DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model confRequired="true"
	 * @generated
	 */
	void addConfiguration(Configuration conf);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.ConfigurationModel.exceptions.ConfigNotFoundException" confNameRequired="true"
	 * @generated
	 */
	Configuration getConfigurationByName(String confName) throws ConfigNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException" confSourceRequired="true" confTargetRequired="true" assoRequired="true"
	 * @generated
	 */
	void createConfigurationLink(Configuration confSource, Configuration confTarget, DEAssociation asso) throws InvalidAssociationException, DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" exceptions="fr.unice.spinefm.ConfigurationModel.exceptions.InvalidAssociationException fr.unice.spinefm.exceptions.IllegalCallException fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException fr.unice.spinefm.exceptions.ElementNotFoundException" confSourceRequired="true" assoRequired="true"
	 * @generated
	 */
	EList<Configuration> getCompatibleConfigurations(Configuration confSource, DEAssociation asso) throws InvalidAssociationException, IllegalCallException, FMEngineException, CPSNotFoundException, ElementNotFoundException;

} // CompositeConfiguration
