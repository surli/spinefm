/**
 */
package fr.unice.spinefm.RFModel;

import fr.unice.spinefm.FMModel.Feature;
import fr.unice.spinefm.FMModel.FeatureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.RFModel.ConfigurationState#getSelectedFeatures <em>Selected Features</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.ConfigurationState#getDeselectedFeatures <em>Deselected Features</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.ConfigurationState#getFm <em>Fm</em>}</li>
 *   <li>{@link fr.unice.spinefm.RFModel.ConfigurationState#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.RFModel.RFModelPackage#getConfigurationState()
 * @model
 * @generated
 */
public interface ConfigurationState extends EObject
{
	/**
	 * Returns the value of the '<em><b>Selected Features</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.FMModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Features</em>' reference list.
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getConfigurationState_SelectedFeatures()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getSelectedFeatures();

	/**
	 * Returns the value of the '<em><b>Deselected Features</b></em>' reference list.
	 * The list contents are of type {@link fr.unice.spinefm.FMModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deselected Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deselected Features</em>' reference list.
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getConfigurationState_DeselectedFeatures()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> getDeselectedFeatures();

	/**
	 * Returns the value of the '<em><b>Fm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fm</em>' reference.
	 * @see #setFm(FeatureModel)
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getConfigurationState_Fm()
	 * @model required="true"
	 * @generated
	 */
	FeatureModel getFm();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.ConfigurationState#getFm <em>Fm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fm</em>' reference.
	 * @see #getFm()
	 * @generated
	 */
	void setFm(FeatureModel value);

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
	 * @see fr.unice.spinefm.RFModel.RFModelPackage#getConfigurationState_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.RFModel.ConfigurationState#getId <em>Id</em>}' attribute.
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
	 * @model required="true" otherStateRequired="true"
	 * @generated
	 */
	boolean isIncludedIn(ConfigurationState otherState);

} // ConfigurationState
