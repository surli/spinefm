/**
 */
package fr.unice.spinefm.ProcessModel;

import fr.unice.spinefm.HistoryModel.Past;
import fr.unice.spinefm.HistoryModel.Step;

import fr.unice.spinefm.MSPLModel.MultipleSoftwareProductLine;

import fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException;

import fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException;
import fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException;

import fr.unice.spinefm.exceptions.ElementNotFoundException;
import fr.unice.spinefm.exceptions.IllegalCallException;

import fr.unice.spinefm.fmengine.FMSpineFMAdapter;

import fr.unice.spinefm.fmengine.exceptions.FMEngineException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ContextManager#getMspl <em>Mspl</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ContextManager#getGlobalContext <em>Global Context</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ContextManager#getLocalContexts <em>Local Contexts</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ContextManager#getFma <em>Fma</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ContextManager#getPast <em>Past</em>}</li>
 *   <li>{@link fr.unice.spinefm.ProcessModel.ContextManager#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager()
 * @model
 * @generated
 */
public interface ContextManager extends EObject
{
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
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager_Mspl()
	 * @model required="true"
	 * @generated
	 */
	MultipleSoftwareProductLine getMspl();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ContextManager#getMspl <em>Mspl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mspl</em>' reference.
	 * @see #getMspl()
	 * @generated
	 */
	void setMspl(MultipleSoftwareProductLine value);

	/**
	 * Returns the value of the '<em><b>Global Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Context</em>' containment reference.
	 * @see #setGlobalContext(GlobalContext)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager_GlobalContext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalContext getGlobalContext();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ContextManager#getGlobalContext <em>Global Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Context</em>' containment reference.
	 * @see #getGlobalContext()
	 * @generated
	 */
	void setGlobalContext(GlobalContext value);

	/**
	 * Returns the value of the '<em><b>Local Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.ProcessModel.LocalContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Contexts</em>' containment reference list.
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager_LocalContexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<LocalContext> getLocalContexts();

	/**
	 * Returns the value of the '<em><b>Fma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fma</em>' attribute.
	 * @see #setFma(FMSpineFMAdapter)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager_Fma()
	 * @model dataType="fr.unice.spinefm.fmengine.FMSpineFMAdapter" required="true" transient="true"
	 * @generated
	 */
	FMSpineFMAdapter getFma();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ContextManager#getFma <em>Fma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fma</em>' attribute.
	 * @see #getFma()
	 * @generated
	 */
	void setFma(FMSpineFMAdapter value);

	/**
	 * Returns the value of the '<em><b>Past</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Past</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past</em>' containment reference.
	 * @see #setPast(Past)
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager_Past()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Past getPast();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ContextManager#getPast <em>Past</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past</em>' containment reference.
	 * @see #getPast()
	 * @generated
	 */
	void setPast(Past value);

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
	 * @see fr.unice.spinefm.ProcessModel.ProcessModelPackage#getContextManager_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ProcessModel.ContextManager#getId <em>Id</em>}' attribute.
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
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.IllegalCallException fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException fr.unice.spinefm.MSPLModel.exceptions.DomainElementNotFoundException" CPSRequired="true" contextRequired="true" stepRequired="true"
	 * @generated
	 */
	void propagate(ConfigurationProcessStep CPS, Context context, Step step) throws FMEngineException, IllegalCallException, CPSNotFoundException, DomainElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.ElementNotFoundException" stepRequired="true"
	 * @generated
	 */
	void init(Step step) throws FMEngineException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.exceptions.ElementNotFoundException" stepRequired="true"
	 * @generated
	 */
	Context createNewContext(Step step) throws FMEngineException, ElementNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.ProcessModel.exceptions.ContextNotFoundException" idRequired="true"
	 * @generated
	 */
	Context getContextFromId(String id) throws ContextNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.fmengine.exceptions.FMEngineException fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException" contextSourceRequired="true"
	 * @generated
	 */
	Context cloningExistingContext(Context contextSource) throws FMEngineException, CPSNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	void removeContext(Context context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	void restoreContext(Context context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.unice.spinefm.ProcessModel.exceptions.CPSNotFoundException" idRequired="true"
	 * @generated
	 */
	ConfigurationProcessStep getCPSFromId(String id) throws CPSNotFoundException;

} // ContextManager
