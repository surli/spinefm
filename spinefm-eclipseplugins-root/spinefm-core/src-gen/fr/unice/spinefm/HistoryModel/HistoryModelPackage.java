/**
 */
package fr.unice.spinefm.HistoryModel;

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
 * @see fr.unice.spinefm.HistoryModel.HistoryModelFactory
 * @model kind="package"
 * @generated
 */
public interface HistoryModelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HistoryModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "history.spinefm.unice.fr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "history";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HistoryModelPackage eINSTANCE = fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.HistoryModel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.HistoryModel.impl.StepImpl
	 * @see fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Launching Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LAUNCHING_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Launched Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LAUNCHED_ACTIONS = 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.unice.spinefm.HistoryModel.impl.PastImpl <em>Past</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.unice.spinefm.HistoryModel.impl.PastImpl
	 * @see fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl#getPast()
	 * @generated
	 */
	int PAST = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Deleted Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__DELETED_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__ID = 2;

	/**
	 * The feature id for the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__ROOT_PATH = 3;

	/**
	 * The feature id for the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__MODEL_PATH = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Past</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.HistoryModel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.HistoryModel.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the containment reference '{@link fr.unice.spinefm.HistoryModel.Step#getLaunchingAction <em>Launching Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Launching Action</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Step#getLaunchingAction()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_LaunchingAction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.HistoryModel.Step#getLaunchedActions <em>Launched Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Launched Actions</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Step#getLaunchedActions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_LaunchedActions();

	/**
	 * Returns the meta object for class '{@link fr.unice.spinefm.HistoryModel.Past <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Past</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past
	 * @generated
	 */
	EClass getPast();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.HistoryModel.Past#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past#getSteps()
	 * @see #getPast()
	 * @generated
	 */
	EReference getPast_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.unice.spinefm.HistoryModel.Past#getDeletedContext <em>Deleted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deleted Context</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past#getDeletedContext()
	 * @see #getPast()
	 * @generated
	 */
	EReference getPast_DeletedContext();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.HistoryModel.Past#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past#getId()
	 * @see #getPast()
	 * @generated
	 */
	EAttribute getPast_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.HistoryModel.Past#getRootPath <em>Root Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Path</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past#getRootPath()
	 * @see #getPast()
	 * @generated
	 */
	EAttribute getPast_RootPath();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.HistoryModel.Past#getModelPath <em>Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Path</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past#getModelPath()
	 * @see #getPast()
	 * @generated
	 */
	EAttribute getPast_ModelPath();

	/**
	 * Returns the meta object for the attribute '{@link fr.unice.spinefm.HistoryModel.Past#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.unice.spinefm.HistoryModel.Past#getDescription()
	 * @see #getPast()
	 * @generated
	 */
	EAttribute getPast_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HistoryModelFactory getHistoryModelFactory();

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
		 * The meta object literal for the '{@link fr.unice.spinefm.HistoryModel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.HistoryModel.impl.StepImpl
		 * @see fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>Launching Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__LAUNCHING_ACTION = eINSTANCE.getStep_LaunchingAction();

		/**
		 * The meta object literal for the '<em><b>Launched Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__LAUNCHED_ACTIONS = eINSTANCE.getStep_LaunchedActions();

		/**
		 * The meta object literal for the '{@link fr.unice.spinefm.HistoryModel.impl.PastImpl <em>Past</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.unice.spinefm.HistoryModel.impl.PastImpl
		 * @see fr.unice.spinefm.HistoryModel.impl.HistoryModelPackageImpl#getPast()
		 * @generated
		 */
		EClass PAST = eINSTANCE.getPast();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAST__STEPS = eINSTANCE.getPast_Steps();

		/**
		 * The meta object literal for the '<em><b>Deleted Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAST__DELETED_CONTEXT = eINSTANCE.getPast_DeletedContext();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAST__ID = eINSTANCE.getPast_Id();

		/**
		 * The meta object literal for the '<em><b>Root Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAST__ROOT_PATH = eINSTANCE.getPast_RootPath();

		/**
		 * The meta object literal for the '<em><b>Model Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAST__MODEL_PATH = eINSTANCE.getPast_ModelPath();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAST__DESCRIPTION = eINSTANCE.getPast_Description();

	}

} //HistoryModelPackage
