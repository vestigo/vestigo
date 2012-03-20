/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nightlabs.jjqb.xtext.jpql.jPQL.GroupClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.HavingClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OrderClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectFromClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.SelectStatementImpl#getSelectFromClause <em>Select From Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.SelectStatementImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.SelectStatementImpl#getHaving <em>Having</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.SelectStatementImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectStatementImpl extends JPQLQueryImpl implements SelectStatement
{
  /**
   * The cached value of the '{@link #getSelectFromClause() <em>Select From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectFromClause()
   * @generated
   * @ordered
   */
  protected SelectFromClause selectFromClause;

  /**
   * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupBy()
   * @generated
   * @ordered
   */
  protected GroupClause groupBy;

  /**
   * The cached value of the '{@link #getHaving() <em>Having</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHaving()
   * @generated
   * @ordered
   */
  protected HavingClause having;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected OrderClause order;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectStatementImpl()
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
    return JPQLPackage.Literals.SELECT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectFromClause getSelectFromClause()
  {
    return selectFromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectFromClause(SelectFromClause newSelectFromClause, NotificationChain msgs)
  {
    SelectFromClause oldSelectFromClause = selectFromClause;
    selectFromClause = newSelectFromClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, oldSelectFromClause, newSelectFromClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectFromClause(SelectFromClause newSelectFromClause)
  {
    if (newSelectFromClause != selectFromClause)
    {
      NotificationChain msgs = null;
      if (selectFromClause != null)
        msgs = ((InternalEObject)selectFromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, null, msgs);
      if (newSelectFromClause != null)
        msgs = ((InternalEObject)newSelectFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, null, msgs);
      msgs = basicSetSelectFromClause(newSelectFromClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE, newSelectFromClause, newSelectFromClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupClause getGroupBy()
  {
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupBy(GroupClause newGroupBy, NotificationChain msgs)
  {
    GroupClause oldGroupBy = groupBy;
    groupBy = newGroupBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__GROUP_BY, oldGroupBy, newGroupBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupBy(GroupClause newGroupBy)
  {
    if (newGroupBy != groupBy)
    {
      NotificationChain msgs = null;
      if (groupBy != null)
        msgs = ((InternalEObject)groupBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__GROUP_BY, null, msgs);
      if (newGroupBy != null)
        msgs = ((InternalEObject)newGroupBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__GROUP_BY, null, msgs);
      msgs = basicSetGroupBy(newGroupBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__GROUP_BY, newGroupBy, newGroupBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingClause getHaving()
  {
    return having;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHaving(HavingClause newHaving, NotificationChain msgs)
  {
    HavingClause oldHaving = having;
    having = newHaving;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__HAVING, oldHaving, newHaving);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHaving(HavingClause newHaving)
  {
    if (newHaving != having)
    {
      NotificationChain msgs = null;
      if (having != null)
        msgs = ((InternalEObject)having).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__HAVING, null, msgs);
      if (newHaving != null)
        msgs = ((InternalEObject)newHaving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__HAVING, null, msgs);
      msgs = basicSetHaving(newHaving, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__HAVING, newHaving, newHaving));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderClause getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrder(OrderClause newOrder, NotificationChain msgs)
  {
    OrderClause oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__ORDER, oldOrder, newOrder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(OrderClause newOrder)
  {
    if (newOrder != order)
    {
      NotificationChain msgs = null;
      if (order != null)
        msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__ORDER, null, msgs);
      if (newOrder != null)
        msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__ORDER, null, msgs);
      msgs = basicSetOrder(newOrder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__ORDER, newOrder, newOrder));
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
      case JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        return basicSetSelectFromClause(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY:
        return basicSetGroupBy(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__HAVING:
        return basicSetHaving(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__ORDER:
        return basicSetOrder(null, msgs);
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
      case JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        return getSelectFromClause();
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY:
        return getGroupBy();
      case JPQLPackage.SELECT_STATEMENT__HAVING:
        return getHaving();
      case JPQLPackage.SELECT_STATEMENT__ORDER:
        return getOrder();
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
      case JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        setSelectFromClause((SelectFromClause)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY:
        setGroupBy((GroupClause)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__HAVING:
        setHaving((HavingClause)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__ORDER:
        setOrder((OrderClause)newValue);
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
      case JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        setSelectFromClause((SelectFromClause)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY:
        setGroupBy((GroupClause)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__HAVING:
        setHaving((HavingClause)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__ORDER:
        setOrder((OrderClause)null);
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
      case JPQLPackage.SELECT_STATEMENT__SELECT_FROM_CLAUSE:
        return selectFromClause != null;
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY:
        return groupBy != null;
      case JPQLPackage.SELECT_STATEMENT__HAVING:
        return having != null;
      case JPQLPackage.SELECT_STATEMENT__ORDER:
        return order != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
