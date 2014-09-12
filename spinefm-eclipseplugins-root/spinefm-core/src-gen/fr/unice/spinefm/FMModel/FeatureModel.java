/**
 */
package fr.unice.spinefm.FMModel;

import fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.FMModel.FeatureModel#getRoot <em>Root</em>}</li>
 *   <li>{@link fr.unice.spinefm.FMModel.FeatureModel#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link fr.unice.spinefm.FMModel.FeatureModel#getId <em>Id</em>}</li>
 *   <li>{@link fr.unice.spinefm.FMModel.FeatureModel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.FMModel.FMModelPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Feature)
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getFeatureModel_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getRoot();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.FMModel.FeatureModel#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Feature value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.unice.spinefm.FMModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getFeatureModel_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConstraints();

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
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getFeatureModel_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.FMModel.FeatureModel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see fr.unice.spinefm.FMModel.FMModelPackage#getFeatureModel_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.FMModel.FeatureModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" featureRequired="true"
	 * @generated
	 */
	GroupState getStateFT(Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="fr.unice.spinefm.FMModel.exceptions.FeatureNotFoundException"
	 * @generated
	 */
	Feature getFeatureFromName(String name) throws FeatureNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" featureRequired="true" stateRequired="true"
	 * @generated
	 */
	void addFeature(String name, Feature feature, GroupState state);

} // FeatureModel
