/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.HavingClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group By Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.GroupByClauseImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.GroupByClauseImpl#getHavingClause <em>Having Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupByClauseImpl extends MinimalEObjectImpl.Container implements GroupByClause
{
  /**
   * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrouping()
   * @generated
   * @ordered
   */
  protected EList<Expression> grouping;

  /**
   * The cached value of the '{@link #getHavingClause() <em>Having Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHavingClause()
   * @generated
   * @ordered
   */
  protected HavingClause havingClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupByClauseImpl()
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
    return JDOQLPackage.Literals.GROUP_BY_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getGrouping()
  {
    if (grouping == null)
    {
      grouping = new EObjectContainmentEList<Expression>(Expression.class, this, JDOQLPackage.GROUP_BY_CLAUSE__GROUPING);
    }
    return grouping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingClause getHavingClause()
  {
    return havingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHavingClause(HavingClause newHavingClause, NotificationChain msgs)
  {
    HavingClause oldHavingClause = havingClause;
    havingClause = newHavingClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE, oldHavingClause, newHavingClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHavingClause(HavingClause newHavingClause)
  {
    if (newHavingClause != havingClause)
    {
      NotificationChain msgs = null;
      if (havingClause != null)
        msgs = ((InternalEObject)havingClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE, null, msgs);
      if (newHavingClause != null)
        msgs = ((InternalEObject)newHavingClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE, null, msgs);
      msgs = basicSetHavingClause(newHavingClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE, newHavingClause, newHavingClause));
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
      case JDOQLPackage.GROUP_BY_CLAUSE__GROUPING:
        return ((InternalEList<?>)getGrouping()).basicRemove(otherEnd, msgs);
      case JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE:
        return basicSetHavingClause(null, msgs);
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
      case JDOQLPackage.GROUP_BY_CLAUSE__GROUPING:
        return getGrouping();
      case JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE:
        return getHavingClause();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JDOQLPackage.GROUP_BY_CLAUSE__GROUPING:
        getGrouping().clear();
        getGrouping().addAll((Collection<? extends Expression>)newValue);
        return;
      case JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE:
        setHavingClause((HavingClause)newValue);
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
      case JDOQLPackage.GROUP_BY_CLAUSE__GROUPING:
        getGrouping().clear();
        return;
      case JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE:
        setHavingClause((HavingClause)null);
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
      case JDOQLPackage.GROUP_BY_CLAUSE__GROUPING:
        return grouping != null && !grouping.isEmpty();
      case JDOQLPackage.GROUP_BY_CLAUSE__HAVING_CLAUSE:
        return havingClause != null;
    }
    return super.eIsSet(featureID);
  }

} //GroupByClauseImpl
