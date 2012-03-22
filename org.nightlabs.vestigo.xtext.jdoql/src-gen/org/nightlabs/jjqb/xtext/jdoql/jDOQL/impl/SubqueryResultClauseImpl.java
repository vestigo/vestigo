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

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryResultClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subquery Result Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SubqueryResultClauseImpl#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SubqueryResultClauseImpl#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubqueryResultClauseImpl extends MinimalEObjectImpl.Container implements SubqueryResultClause
{
  /**
   * The default value of the '{@link #isIsDistinct() <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDistinct()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DISTINCT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDistinct() <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDistinct()
   * @generated
   * @ordered
   */
  protected boolean isDistinct = IS_DISTINCT_EDEFAULT;

  /**
   * The cached value of the '{@link #getResultExpression() <em>Result Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultExpression()
   * @generated
   * @ordered
   */
  protected Expression resultExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubqueryResultClauseImpl()
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
    return JDOQLPackage.Literals.SUBQUERY_RESULT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDistinct()
  {
    return isDistinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDistinct(boolean newIsDistinct)
  {
    boolean oldIsDistinct = isDistinct;
    isDistinct = newIsDistinct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_RESULT_CLAUSE__IS_DISTINCT, oldIsDistinct, isDistinct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getResultExpression()
  {
    return resultExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultExpression(Expression newResultExpression, NotificationChain msgs)
  {
    Expression oldResultExpression = resultExpression;
    resultExpression = newResultExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION, oldResultExpression, newResultExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultExpression(Expression newResultExpression)
  {
    if (newResultExpression != resultExpression)
    {
      NotificationChain msgs = null;
      if (resultExpression != null)
        msgs = ((InternalEObject)resultExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION, null, msgs);
      if (newResultExpression != null)
        msgs = ((InternalEObject)newResultExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION, null, msgs);
      msgs = basicSetResultExpression(newResultExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION, newResultExpression, newResultExpression));
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
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION:
        return basicSetResultExpression(null, msgs);
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
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__IS_DISTINCT:
        return isIsDistinct();
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION:
        return getResultExpression();
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
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__IS_DISTINCT:
        setIsDistinct((Boolean)newValue);
        return;
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION:
        setResultExpression((Expression)newValue);
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
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__IS_DISTINCT:
        setIsDistinct(IS_DISTINCT_EDEFAULT);
        return;
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION:
        setResultExpression((Expression)null);
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
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__IS_DISTINCT:
        return isDistinct != IS_DISTINCT_EDEFAULT;
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE__RESULT_EXPRESSION:
        return resultExpression != null;
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
    result.append(" (isDistinct: ");
    result.append(isDistinct);
    result.append(')');
    return result.toString();
  }

} //SubqueryResultClauseImpl
