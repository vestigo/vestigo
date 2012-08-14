/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.vestigo.xtext.jdoql.jDOQL.IntoClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Into Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.impl.IntoClauseImpl#getResultClassName <em>Result Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntoClauseImpl extends MinimalEObjectImpl.Container implements IntoClause
{
  /**
   * The default value of the '{@link #getResultClassName() <em>Result Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultClassName()
   * @generated
   * @ordered
   */
  protected static final String RESULT_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResultClassName() <em>Result Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultClassName()
   * @generated
   * @ordered
   */
  protected String resultClassName = RESULT_CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntoClauseImpl()
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
    return JDOQLPackage.Literals.INTO_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResultClassName()
  {
    return resultClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultClassName(String newResultClassName)
  {
    String oldResultClassName = resultClassName;
    resultClassName = newResultClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.INTO_CLAUSE__RESULT_CLASS_NAME, oldResultClassName, resultClassName));
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
      case JDOQLPackage.INTO_CLAUSE__RESULT_CLASS_NAME:
        return getResultClassName();
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
      case JDOQLPackage.INTO_CLAUSE__RESULT_CLASS_NAME:
        setResultClassName((String)newValue);
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
      case JDOQLPackage.INTO_CLAUSE__RESULT_CLASS_NAME:
        setResultClassName(RESULT_CLASS_NAME_EDEFAULT);
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
      case JDOQLPackage.INTO_CLAUSE__RESULT_CLASS_NAME:
        return RESULT_CLASS_NAME_EDEFAULT == null ? resultClassName != null : !RESULT_CLASS_NAME_EDEFAULT.equals(resultClassName);
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
    result.append(" (resultClassName: ");
    result.append(resultClassName);
    result.append(')');
    return result.toString();
  }

} //IntoClauseImpl
