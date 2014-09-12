/**
 */
package fr.unice.spinefm.ProcessModel;

import fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM;

import fr.unice.spinefm.ConfigurationModel.Configuration;

import fr.unice.spinefm.FMModel.Feature;

import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.MSPLModel.DomainElement;

import fr.unice.spinefm.RFModel.ConfigurationState;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;

import fr.unice.spinefm.fmengine.FMSpineFMAdapter;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDomainElement <em>Domain Element</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getContext <em>Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#isUserConfig <em>User Config</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getHistory <em>History</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getState <em>State</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getActionsDone <em>Actions Done</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep()
 * @model
 * @generated
 */
public interface ConfigurationProcessStep extends EObject
{
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
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_DomainElement()
	 * @model required="true"
	 * @generated
	 */
	DomainElement getDomainElement();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDomainElement <em>Domain Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Element</em>' reference.
	 * @see #getDomainElement()
	 * @generated
	 */
	void setDomainElement(DomainElement value);

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
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.unice.spinefm.ConfigurationModel.Configuration#getCPSRef <em>CPS Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_Configuration()
	 * @see fr.unice.spinefm.ConfigurationModel.Configuration#getCPSRef
	 * @model opposite="CPSRef"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>User Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Config</em>' attribute.
	 * @see #setUserConfig(boolean)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_UserConfig()
	 * @model required="true"
	 * @generated
	 */
	boolean isUserConfig();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#isUserConfig <em>User Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Config</em>' attribute.
	 * @see #isUserConfig()
	 * @generated
	 */
	void setUserConfig(boolean value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute list.
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_History()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getHistory();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(ConfigurationState)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigurationState getState();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ConfigurationState value);

	/**
	 * Returns the value of the '<em><b>Actions Done</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Done</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Done</em>' reference list.
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_ActionsDone()
	 * @model transient="true"
	 * @generated
	 */
	EList<ActionOnFM> getActionsDone();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.unice.spinefm.ProcessModel.CPSStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see fr.unice.spinefm.ProcessModel.CPSStatus
	 * @see #setStatus(CPSStatus)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getConfigurationProcessStep_Status()
	 * @model required="true"
	 * @generated
	 */
	CPSStatus getStatus();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ConfigurationProcessStep#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see fr.unice.spinefm.ProcessModel.CPSStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CPSStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException"
	 * @generated
	 */
	boolean isComplete() throws FMEngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException" aRequired="true"
	 * @generated
	 */
	boolean alreadyHaveAction(ActionOnFM a) throws FMEngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getConfName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException" fmaDataType="fr.unice.spinefm.fmengine.FMSpineFMAdapter" fmaRequired="true" stepRequired="true"
	 * @generated
	 */
	void setFMA(FMSpineFMAdapter fma, Step step) throws FMEngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.IllegalCallException fr.unice.spinefm.exceptions.ElementNotFoundException" cpsRequired="true"
	 * @generated
	 */
	boolean isMergeableWithCPS(ConfigurationProcessStep cps) throws FMEngineException, IllegalCallException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.ElementNotFoundException" confCPSRequired="true" stepRequired="true" cmRequired="true"
	 * @generated
	 */
	void mergeWithExternalCPS(ConfigurationProcessStep confCPS, Step step, ContextManager cm) throws FMEngineException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException" aofRequired="true" stepRequired="true"
	 * @generated
	 */
	void captureImplicitActions(ActionOnFM aof, Step step) throws FMEngineException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model aofRequired="true" featureRequired="true"
	 * @generated
	 */
	void recordActionDone(ActionOnFM aof, Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureRequired="true"
	 * @generated
	 */
	void setFeatureUnselected(Feature feature);

} // ConfigurationProcessStep
