/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.From;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromImpl#getCandidateClassName <em>Candidate Class Name</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromImpl#getExcludeClause <em>Exclude Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FromImpl extends MinimalEObjectImpl.Container implements From
{
  /**
   * The default value of the '{@link #getCandidateClassName() <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCandidateClassName()
   * @generated
   * @ordered
   */
  protected static final String CANDIDATE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCandidateClassName() <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCandidateClassName()
   * @generated
   * @ordered
   */
  protected String candidateClassName = CANDIDATE_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getExcludeClause() <em>Exclude Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludeClause()
   * @generated
   * @ordered
   */
  protected ExcludeClause excludeClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FromImpl()
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
    return JDOQLPackage.Literals.FROM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCandidateClassName()
  {
    return candidateClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCandidateClassName(String newCandidateClassName)
  {
    String oldCandidateClassName = candidateClassName;
    candidateClassName = newCandidateClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.FROM__CANDIDATE_CLASS_NAME, oldCandidateClassName, candidateClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcludeClause getExcludeClause()
  {
    return excludeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExcludeClause(ExcludeClause newExcludeClause, NotificationChain msgs)
  {
    ExcludeClause oldExcludeClause = excludeClause;
    excludeClause = newExcludeClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.FROM__EXCLUDE_CLAUSE, oldExcludeClause, newExcludeClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcludeClause(ExcludeClause newExcludeClause)
  {
    if (newExcludeClause != excludeClause)
    {
      NotificationChain msgs = null;
      if (excludeClause != null)
        msgs = ((InternalEObject)excludeClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.FROM__EXCLUDE_CLAUSE, null, msgs);
      if (newExcludeClause != null)
        msgs = ((InternalEObject)newExcludeClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.FROM__EXCLUDE_CLAUSE, null, msgs);
      msgs = basicSetExcludeClause(newExcludeClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.FROM__EXCLUDE_CLAUSE, newExcludeClause, newExcludeClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JDOQLPackage.FROM__EXCLUDE_CLAUSE:
        return basicSetExcludeClause(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case JDOQLPackage.FROM__CANDIDATE_CLASS_NAME:
        return getCandidateClassName();
      case JDOQLPackage.FROM__EXCLUDE_CLAUSE:
        return getExcludeClause();
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
      case JDOQLPackage.FROM__CANDIDATE_CLASS_NAME:
        setCandidateClassName((String)newValue);
        return;
      case JDOQLPackage.FROM__EXCLUDE_CLAUSE:
        setExcludeClause((ExcludeClause)newValue);
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
      case JDOQLPackage.FROM__CANDIDATE_CLASS_NAME:
        setCandidateClassName(CANDIDATE_CLASS_NAME_EDEFAULT);
        return;
      case JDOQLPackage.FROM__EXCLUDE_CLAUSE:
        setExcludeClause((ExcludeClause)null);
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
      case JDOQLPackage.FROM__CANDIDATE_CLASS_NAME:
        return CANDIDATE_CLASS_NAME_EDEFAULT == null ? candidateClassName != null : !CANDIDATE_CLASS_NAME_EDEFAULT.equals(candidateClassName);
      case JDOQLPackage.FROM__EXCLUDE_CLAUSE:
        return excludeClause != null;
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
    result.append(" (candidateClassName: ");
    result.append(candidateClassName);
    result.append(')');
    return result.toString();
  }

} //FromImpl
