/**
 */
package fr.unice.spinefm.ActionModel.SystemActionModel;

import fr.unice.spinefm.FMModel.FeatureModel;

import fr.unice.spinefm.ProcessModel.ConfigurationProcessStep;

import fr.unice.spinefm.fmengine.FMSpineFMAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action On FM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFm <em>Fm</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getCps <em>Cps</em>}</li>
 *   <li>{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFma <em>Fma</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionOnFM()
 * @model abstract="true"
 * @generated
 */
public interface ActionOnFM extends SystemAction
{
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
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionOnFM_Fm()
	 * @model required="true"
	 * @generated
	 */
	FeatureModel getFm();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFm <em>Fm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fm</em>' reference.
	 * @see #getFm()
	 * @generated
	 */
	void setFm(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Cps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cps</em>' reference.
	 * @see #setCps(ConfigurationProcessStep)
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionOnFM_Cps()
	 * @model required="true"
	 * @generated
	 */
	ConfigurationProcessStep getCps();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getCps <em>Cps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cps</em>' reference.
	 * @see #getCps()
	 * @generated
	 */
	void setCps(ConfigurationProcessStep value);

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
	 * @see fr.unice.spinefm.ActionModel.SystemActionModel.SystemActionModelPackage#getActionOnFM_Fma()
	 * @model dataType="fr.unice.spinefm.fmengine.FMSpineFMAdapter" required="true" transient="true"
	 * @generated
	 */
	FMSpineFMAdapter getFma();

	/**
	 * Sets the value of the '{@link fr.unice.spinefm.ActionModel.SystemActionModel.ActionOnFM#getFma <em>Fma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fma</em>' attribute.
	 * @see #getFma()
	 * @generated
	 */
	void setFma(FMSpineFMAdapter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	ActionOnFM cloneAction();

} // ActionOnFM
