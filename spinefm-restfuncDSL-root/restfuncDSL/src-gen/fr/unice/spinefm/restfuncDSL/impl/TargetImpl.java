/**
 */
package fr.unice.spinefm.restfuncDSL.impl;

import fr.unice.spinefm.restfuncDSL.RestfuncDSLPackage;
import fr.unice.spinefm.restfuncDSL.Target;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.unice.spinefm.restfuncDSL.impl.TargetImpl#getDeTarget <em>De Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target
{
  /**
   * The default value of the '{@link #getDeTarget() <em>De Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeTarget()
   * @generated
   * @ordered
   */
  protected static final String DE_TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeTarget() <em>De Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeTarget()
   * @generated
   * @ordered
   */
  protected String deTarget = DE_TARGET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RestfuncDSLPackage.Literals.TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeTarget()
  {
    return deTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeTarget(String newDeTarget)
  {
    String oldDeTarget = deTarget;
    deTarget = newDeTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfuncDSLPackage.TARGET__DE_TARGET, oldDeTarget, deTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RestfuncDSLPackage.TARGET__DE_TARGET:
        return getDeTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestfuncDSLPackage.TARGET__DE_TARGET:
        setDeTarget((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RestfuncDSLPackage.TARGET__DE_TARGET:
        setDeTarget(DE_TARGET_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RestfuncDSLPackage.TARGET__DE_TARGET:
        return DE_TARGET_EDEFAULT == null ? deTarget != null : !DE_TARGET_EDEFAULT.equals(deTarget);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (deTarget: ");
    result.append(deTarget);
    result.append(')');
    return result.toString();
  }

} //TargetImpl
