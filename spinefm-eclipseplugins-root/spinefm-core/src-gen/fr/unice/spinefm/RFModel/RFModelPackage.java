/**
 */
package fr.unice.spinefm.RFModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.unice.spinefm.RFModel.RFModelFactory
 * @model kind="package"
 * @generated
 */
public interface RFModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RFModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rf.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RFModelPackage eINSTANCE = fr.unice.spinefm.RFModel.impl.RFModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl <em>Restriction Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl
	 * @see fr.unice.spinefm.RFModel.impl.RFModelPackageImpl#getRestrictionFunction()
	 * @generated
	 */
	int RESTRICTION_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FUNCTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FUNCTION__RULES = 1;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FUNCTION__INVERSE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FUNCTION__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FUNCTION__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Restriction Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl <em>Configuration State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl
	 * @see fr.unice.spinefm.RFModel.impl.RFModelPackageImpl#getConfigurationState()
	 * @generated
	 */
	int CONFIGURATION_STATE = 1;

	/**
	 * The feature id for the '<em><b>Selected Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STATE__SELECTED_FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Deselected Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STATE__DESELECTED_FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STATE__FM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STATE__ID = 3;

	/**
	 * The number of structural features of the '<em>Configuration State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_STATE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.RFModel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.RFModel.impl.RuleImpl
	 * @see fr.unice.spinefm.RFModel.impl.RFModelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.RFModel.RestrictionFunction <em>Restriction Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction Function</em>'.
	 * @see fr.unice.spinefm.RFModel.RestrictionFunction
	 * @generated
	 */
	EClass getRestrictionFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.RFModel.RestrictionFunction#getId()
	 * @see #getRestrictionFunction()
	 * @generated
	 */
	EAttribute getRestrictionFunction_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.unice.spinefm.RFModel.RestrictionFunction#getRules()
	 * @see #getRestrictionFunction()
	 * @generated
	 */
	EReference getRestrictionFunction_Rules();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse</em>'.
	 * @see fr.unice.spinefm.RFModel.RestrictionFunction#getInverse()
	 * @see #getRestrictionFunction()
	 * @generated
	 */
	EReference getRestrictionFunction_Inverse();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.unice.spinefm.RFModel.RestrictionFunction#getSource()
	 * @see #getRestrictionFunction()
	 * @generated
	 */
	EReference getRestrictionFunction_Source();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.RFModel.RestrictionFunction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.unice.spinefm.RFModel.RestrictionFunction#getTarget()
	 * @see #getRestrictionFunction()
	 * @generated
	 */
	EReference getRestrictionFunction_Target();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.RFModel.ConfigurationState <em>Configuration State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration State</em>'.
	 * @see fr.unice.spinefm.RFModel.ConfigurationState
	 * @generated
	 */
	EClass getConfigurationState();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.RFModel.ConfigurationState#getSelectedFeatures <em>Selected Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selected Features</em>'.
	 * @see fr.unice.spinefm.RFModel.ConfigurationState#getSelectedFeatures()
	 * @see #getConfigurationState()
	 * @generated
	 */
	EReference getConfigurationState_SelectedFeatures();

	/**
	 * Returns the meta object for the reference list '{@link fr.unice.spinefm.RFModel.ConfigurationState#getDeselectedFeatures <em>Deselected Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deselected Features</em>'.
	 * @see fr.unice.spinefm.RFModel.ConfigurationState#getDeselectedFeatures()
	 * @see #getConfigurationState()
	 * @generated
	 */
	EReference getConfigurationState_DeselectedFeatures();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.RFModel.ConfigurationState#getFm <em>Fm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fm</em>'.
	 * @see fr.unice.spinefm.RFModel.ConfigurationState#getFm()
	 * @see #getConfigurationState()
	 * @generated
	 */
	EReference getConfigurationState_Fm();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.RFModel.ConfigurationState#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.RFModel.ConfigurationState#getId()
	 * @see #getConfigurationState()
	 * @generated
	 */
	EAttribute getConfigurationState_Id();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.RFModel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.unice.spinefm.RFModel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link fr.unice.spinefm.RFModel.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see fr.unice.spinefm.RFModel.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Action();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.RFModel.Rule#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see fr.unice.spinefm.RFModel.Rule#getState()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_State();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.RFModel.Rule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.RFModel.Rule#getId()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RFModelFactory getRFModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl <em>Restriction Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.RFModel.impl.RestrictionFunctionImpl
		 * @see fr.unice.spinefm.RFModel.impl.RFModelPackageImpl#getRestrictionFunction()
		 * @generated
		 */
		EClass RESTRICTION_FUNCTION = eINSTANCE.getRestrictionFunction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICTION_FUNCTION__ID = eINSTANCE.getRestrictionFunction_Id();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_FUNCTION__RULES = eINSTANCE.getRestrictionFunction_Rules();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_FUNCTION__INVERSE = eINSTANCE.getRestrictionFunction_Inverse();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_FUNCTION__SOURCE = eINSTANCE.getRestrictionFunction_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION_FUNCTION__TARGET = eINSTANCE.getRestrictionFunction_Target();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl <em>Configuration State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.RFModel.impl.ConfigurationStateImpl
		 * @see fr.unice.spinefm.RFModel.impl.RFModelPackageImpl#getConfigurationState()
		 * @generated
		 */
		EClass CONFIGURATION_STATE = eINSTANCE.getConfigurationState();

		/**
		 * The meta object literal for the '<em><b>Selected Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_STATE__SELECTED_FEATURES = eINSTANCE.getConfigurationState_SelectedFeatures();

		/**
		 * The meta object literal for the '<em><b>Deselected Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_STATE__DESELECTED_FEATURES = eINSTANCE.getConfigurationState_DeselectedFeatures();

		/**
		 * The meta object literal for the '<em><b>Fm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_STATE__FM = eINSTANCE.getConfigurationState_Fm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_STATE__ID = eINSTANCE.getConfigurationState_Id();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.RFModel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.RFModel.impl.RuleImpl
		 * @see fr.unice.spinefm.RFModel.impl.RFModelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTION = eINSTANCE.getRule_Action();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__STATE = eINSTANCE.getRule_State();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_Id();

	}

} //RFModelPackage
