/**
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatImpl#getFractionValue <em>Fraction Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatImpl extends MinimalEObjectImpl.Container implements org.nightlabs.vestigo.xtext.jpql.jPQL.Float
{
  /**
   * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerValue()
   * @generated
   * @ordered
   */
  protected static final int INTEGER_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntegerValue()
   * @generated
   * @ordered
   */
  protected int integerValue = INTEGER_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFractionValue() <em>Fraction Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionValue()
   * @generated
   * @ordered
   */
  protected static final int FRACTION_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFractionValue() <em>Fraction Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionValue()
   * @generated
   * @ordered
   */
  protected int fractionValue = FRACTION_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatImpl()
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
    return JPQLPackage.Literals.FLOAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntegerValue()
  {
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntegerValue(int newIntegerValue)
  {
    int oldIntegerValue = integerValue;
    integerValue = newIntegerValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FLOAT__INTEGER_VALUE, oldIntegerValue, integerValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFractionValue()
  {
    return fractionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFractionValue(int newFractionValue)
  {
    int oldFractionValue = fractionValue;
    fractionValue = newFractionValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FLOAT__FRACTION_VALUE, oldFractionValue, fractionValue));
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
      case JPQLPackage.FLOAT__INTEGER_VALUE:
        return getIntegerValue();
      case JPQLPackage.FLOAT__FRACTION_VALUE:
        return getFractionValue();
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
      case JPQLPackage.FLOAT__INTEGER_VALUE:
        setIntegerValue((Integer)newValue);
        return;
      case JPQLPackage.FLOAT__FRACTION_VALUE:
        setFractionValue((Integer)newValue);
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
      case JPQLPackage.FLOAT__INTEGER_VALUE:
        setIntegerValue(INTEGER_VALUE_EDEFAULT);
        return;
      case JPQLPackage.FLOAT__FRACTION_VALUE:
        setFractionValue(FRACTION_VALUE_EDEFAULT);
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
      case JPQLPackage.FLOAT__INTEGER_VALUE:
        return integerValue != INTEGER_VALUE_EDEFAULT;
      case JPQLPackage.FLOAT__FRACTION_VALUE:
        return fractionValue != FRACTION_VALUE_EDEFAULT;
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
    result.append(" (integerValue: ");
    result.append(integerValue);
    result.append(", fractionValue: ");
    result.append(fractionValue);
    result.append(')');
    return result.toString();
  }

} //FloatImpl
