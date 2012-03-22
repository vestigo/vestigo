/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.jjqb.xtext.jpql.jPQL.LeftJoin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.LeftJoinImpl#isIsOuter <em>Is Outer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftJoinImpl extends FromJoinImpl implements LeftJoin
{
  /**
   * The default value of the '{@link #isIsOuter() <em>Is Outer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOuter()
   * @generated
   * @ordered
   */
  protected static final boolean IS_OUTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsOuter() <em>Is Outer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOuter()
   * @generated
   * @ordered
   */
  protected boolean isOuter = IS_OUTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftJoinImpl()
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
    return JPQLPackage.Literals.LEFT_JOIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsOuter()
  {
    return isOuter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOuter(boolean newIsOuter)
  {
    boolean oldIsOuter = isOuter;
    isOuter = newIsOuter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.LEFT_JOIN__IS_OUTER, oldIsOuter, isOuter));
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
      case JPQLPackage.LEFT_JOIN__IS_OUTER:
        return isIsOuter();
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
      case JPQLPackage.LEFT_JOIN__IS_OUTER:
        setIsOuter((Boolean)newValue);
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
      case JPQLPackage.LEFT_JOIN__IS_OUTER:
        setIsOuter(IS_OUTER_EDEFAULT);
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
      case JPQLPackage.LEFT_JOIN__IS_OUTER:
        return isOuter != IS_OUTER_EDEFAULT;
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
    result.append(" (isOuter: ");
    result.append(isOuter);
    result.append(')');
    return result.toString();
  }

} //LeftJoinImpl
