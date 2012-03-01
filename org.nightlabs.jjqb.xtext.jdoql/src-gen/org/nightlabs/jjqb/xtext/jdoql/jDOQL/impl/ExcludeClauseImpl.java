/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclude Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExcludeClauseImpl#getExcludeSubclasses <em>Exclude Subclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExcludeClauseImpl extends MinimalEObjectImpl.Container implements ExcludeClause
{
  /**
   * The default value of the '{@link #getExcludeSubclasses() <em>Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeSubclasses()
   * @generated
   * @ordered
   */
  protected static final String EXCLUDE_SUBCLASSES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExcludeSubclasses() <em>Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeSubclasses()
   * @generated
   * @ordered
   */
  protected String excludeSubclasses = EXCLUDE_SUBCLASSES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExcludeClauseImpl()
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
    return JDOQLPackage.Literals.EXCLUDE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExcludeSubclasses()
  {
    return excludeSubclasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcludeSubclasses(String newExcludeSubclasses)
  {
    String oldExcludeSubclasses = excludeSubclasses;
    excludeSubclasses = newExcludeSubclasses;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES, oldExcludeSubclasses, excludeSubclasses));
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
      case JDOQLPackage.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES:
        return getExcludeSubclasses();
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
      case JDOQLPackage.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES:
        setExcludeSubclasses((String)newValue);
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
      case JDOQLPackage.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES:
        setExcludeSubclasses(EXCLUDE_SUBCLASSES_EDEFAULT);
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
      case JDOQLPackage.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES:
        return EXCLUDE_SUBCLASSES_EDEFAULT == null ? excludeSubclasses != null : !EXCLUDE_SUBCLASSES_EDEFAULT.equals(excludeSubclasses);
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
    result.append(" (excludeSubclasses: ");
    result.append(excludeSubclasses);
    result.append(')');
    return result.toString();
  }

} //ExcludeClauseImpl
