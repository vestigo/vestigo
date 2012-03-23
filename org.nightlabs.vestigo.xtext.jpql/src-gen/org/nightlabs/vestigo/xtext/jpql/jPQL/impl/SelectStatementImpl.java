/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nightlabs.vestigo.xtext.jpql.jPQL.Expression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ExpressionTerm;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Value;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getGroupByClause <em>Group By Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl#getOrderByClause <em>Order By Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectStatementImpl extends JPQLQueryImpl implements SelectStatement
{
  /**
   * The default value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryOperator()
   * @generated
   * @ordered
   */
  protected static final UnaryOperator UNARY_OPERATOR_EDEFAULT = UnaryOperator.POSITIVE;

  /**
   * The cached value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryOperator()
   * @generated
   * @ordered
   */
  protected UnaryOperator unaryOperator = UNARY_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The default value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNot() <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNot()
   * @generated
   * @ordered
   */
  protected boolean isNot = IS_NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<Variable> items;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected SelectStatement query;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected Value min;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected Value max;

  /**
   * The cached value of the '{@link #getSelectClause() <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectClause()
   * @generated
   * @ordered
   */
  protected SelectClause selectClause;

  /**
   * The cached value of the '{@link #getFromClause() <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromClause()
   * @generated
   * @ordered
   */
  protected FromClause fromClause;

  /**
   * The cached value of the '{@link #getGroupByClause() <em>Group By Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupByClause()
   * @generated
   * @ordered
   */
  protected GroupByClause groupByClause;

  /**
   * The cached value of the '{@link #getOrderByClause() <em>Order By Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderByClause()
   * @generated
   * @ordered
   */
  protected OrderByClause orderByClause;

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
  public UnaryOperator getUnaryOperator()
  {
    return unaryOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryOperator(UnaryOperator newUnaryOperator)
  {
    UnaryOperator oldUnaryOperator = unaryOperator;
    unaryOperator = newUnaryOperator == null ? UNARY_OPERATOR_EDEFAULT : newUnaryOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR, oldUnaryOperator, unaryOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNot()
  {
    return isNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNot(boolean newIsNot)
  {
    boolean oldIsNot = isNot;
    isNot = newIsNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__IS_NOT, oldIsNot, isNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<Variable>(Variable.class, this, JPQLPackage.SELECT_STATEMENT__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery(SelectStatement newQuery, NotificationChain msgs)
  {
    SelectStatement oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__QUERY, oldQuery, newQuery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(SelectStatement newQuery)
  {
    if (newQuery != query)
    {
      NotificationChain msgs = null;
      if (query != null)
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__QUERY, newQuery, newQuery));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin(Value newMin, NotificationChain msgs)
  {
    Value oldMin = min;
    min = newMin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__MIN, oldMin, newMin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(Value newMin)
  {
    if (newMin != min)
    {
      NotificationChain msgs = null;
      if (min != null)
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__MIN, newMin, newMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax(Value newMax, NotificationChain msgs)
  {
    Value oldMax = max;
    max = newMax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__MAX, oldMax, newMax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(Value newMax)
  {
    if (newMax != max)
    {
      NotificationChain msgs = null;
      if (max != null)
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__MAX, newMax, newMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectClause getSelectClause()
  {
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectClause(SelectClause newSelectClause, NotificationChain msgs)
  {
    SelectClause oldSelectClause = selectClause;
    selectClause = newSelectClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE, oldSelectClause, newSelectClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectClause(SelectClause newSelectClause)
  {
    if (newSelectClause != selectClause)
    {
      NotificationChain msgs = null;
      if (selectClause != null)
        msgs = ((InternalEObject)selectClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE, null, msgs);
      if (newSelectClause != null)
        msgs = ((InternalEObject)newSelectClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE, null, msgs);
      msgs = basicSetSelectClause(newSelectClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE, newSelectClause, newSelectClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromClause getFromClause()
  {
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromClause(FromClause newFromClause, NotificationChain msgs)
  {
    FromClause oldFromClause = fromClause;
    fromClause = newFromClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE, oldFromClause, newFromClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromClause(FromClause newFromClause)
  {
    if (newFromClause != fromClause)
    {
      NotificationChain msgs = null;
      if (fromClause != null)
        msgs = ((InternalEObject)fromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE, null, msgs);
      if (newFromClause != null)
        msgs = ((InternalEObject)newFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE, null, msgs);
      msgs = basicSetFromClause(newFromClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE, newFromClause, newFromClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupByClause getGroupByClause()
  {
    return groupByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupByClause(GroupByClause newGroupByClause, NotificationChain msgs)
  {
    GroupByClause oldGroupByClause = groupByClause;
    groupByClause = newGroupByClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE, oldGroupByClause, newGroupByClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupByClause(GroupByClause newGroupByClause)
  {
    if (newGroupByClause != groupByClause)
    {
      NotificationChain msgs = null;
      if (groupByClause != null)
        msgs = ((InternalEObject)groupByClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE, null, msgs);
      if (newGroupByClause != null)
        msgs = ((InternalEObject)newGroupByClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE, null, msgs);
      msgs = basicSetGroupByClause(newGroupByClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE, newGroupByClause, newGroupByClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderByClause getOrderByClause()
  {
    return orderByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderByClause(OrderByClause newOrderByClause, NotificationChain msgs)
  {
    OrderByClause oldOrderByClause = orderByClause;
    orderByClause = newOrderByClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE, oldOrderByClause, newOrderByClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderByClause(OrderByClause newOrderByClause)
  {
    if (newOrderByClause != orderByClause)
    {
      NotificationChain msgs = null;
      if (orderByClause != null)
        msgs = ((InternalEObject)orderByClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE, null, msgs);
      if (newOrderByClause != null)
        msgs = ((InternalEObject)newOrderByClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE, null, msgs);
      msgs = basicSetOrderByClause(newOrderByClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE, newOrderByClause, newOrderByClause));
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
      case JPQLPackage.SELECT_STATEMENT__RIGHT:
        return basicSetRight(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__LEFT:
        return basicSetLeft(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
      case JPQLPackage.SELECT_STATEMENT__QUERY:
        return basicSetQuery(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__MIN:
        return basicSetMin(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__MAX:
        return basicSetMax(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE:
        return basicSetSelectClause(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE:
        return basicSetFromClause(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE:
        return basicSetGroupByClause(null, msgs);
      case JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE:
        return basicSetOrderByClause(null, msgs);
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
      case JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR:
        return getUnaryOperator();
      case JPQLPackage.SELECT_STATEMENT__RIGHT:
        return getRight();
      case JPQLPackage.SELECT_STATEMENT__LEFT:
        return getLeft();
      case JPQLPackage.SELECT_STATEMENT__IS_NOT:
        return isIsNot();
      case JPQLPackage.SELECT_STATEMENT__ITEMS:
        return getItems();
      case JPQLPackage.SELECT_STATEMENT__QUERY:
        return getQuery();
      case JPQLPackage.SELECT_STATEMENT__MIN:
        return getMin();
      case JPQLPackage.SELECT_STATEMENT__MAX:
        return getMax();
      case JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE:
        return getSelectClause();
      case JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE:
        return getFromClause();
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE:
        return getGroupByClause();
      case JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE:
        return getOrderByClause();
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
      case JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR:
        setUnaryOperator((UnaryOperator)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__RIGHT:
        setRight((Expression)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__LEFT:
        setLeft((Expression)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__IS_NOT:
        setIsNot((Boolean)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends Variable>)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__QUERY:
        setQuery((SelectStatement)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__MIN:
        setMin((Value)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__MAX:
        setMax((Value)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE:
        setSelectClause((SelectClause)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE:
        setFromClause((FromClause)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE:
        setGroupByClause((GroupByClause)newValue);
        return;
      case JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE:
        setOrderByClause((OrderByClause)newValue);
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
      case JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR:
        setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
        return;
      case JPQLPackage.SELECT_STATEMENT__RIGHT:
        setRight((Expression)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__LEFT:
        setLeft((Expression)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__IS_NOT:
        setIsNot(IS_NOT_EDEFAULT);
        return;
      case JPQLPackage.SELECT_STATEMENT__ITEMS:
        getItems().clear();
        return;
      case JPQLPackage.SELECT_STATEMENT__QUERY:
        setQuery((SelectStatement)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__MIN:
        setMin((Value)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__MAX:
        setMax((Value)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE:
        setSelectClause((SelectClause)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE:
        setFromClause((FromClause)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE:
        setGroupByClause((GroupByClause)null);
        return;
      case JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE:
        setOrderByClause((OrderByClause)null);
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
      case JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR:
        return unaryOperator != UNARY_OPERATOR_EDEFAULT;
      case JPQLPackage.SELECT_STATEMENT__RIGHT:
        return right != null;
      case JPQLPackage.SELECT_STATEMENT__LEFT:
        return left != null;
      case JPQLPackage.SELECT_STATEMENT__IS_NOT:
        return isNot != IS_NOT_EDEFAULT;
      case JPQLPackage.SELECT_STATEMENT__ITEMS:
        return items != null && !items.isEmpty();
      case JPQLPackage.SELECT_STATEMENT__QUERY:
        return query != null;
      case JPQLPackage.SELECT_STATEMENT__MIN:
        return min != null;
      case JPQLPackage.SELECT_STATEMENT__MAX:
        return max != null;
      case JPQLPackage.SELECT_STATEMENT__SELECT_CLAUSE:
        return selectClause != null;
      case JPQLPackage.SELECT_STATEMENT__FROM_CLAUSE:
        return fromClause != null;
      case JPQLPackage.SELECT_STATEMENT__GROUP_BY_CLAUSE:
        return groupByClause != null;
      case JPQLPackage.SELECT_STATEMENT__ORDER_BY_CLAUSE:
        return orderByClause != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR: return JPQLPackage.EXPRESSION__UNARY_OPERATOR;
        case JPQLPackage.SELECT_STATEMENT__RIGHT: return JPQLPackage.EXPRESSION__RIGHT;
        case JPQLPackage.SELECT_STATEMENT__LEFT: return JPQLPackage.EXPRESSION__LEFT;
        case JPQLPackage.SELECT_STATEMENT__IS_NOT: return JPQLPackage.EXPRESSION__IS_NOT;
        case JPQLPackage.SELECT_STATEMENT__ITEMS: return JPQLPackage.EXPRESSION__ITEMS;
        case JPQLPackage.SELECT_STATEMENT__QUERY: return JPQLPackage.EXPRESSION__QUERY;
        case JPQLPackage.SELECT_STATEMENT__MIN: return JPQLPackage.EXPRESSION__MIN;
        case JPQLPackage.SELECT_STATEMENT__MAX: return JPQLPackage.EXPRESSION__MAX;
        default: return -1;
      }
    }
    if (baseClass == ExpressionTerm.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case JPQLPackage.EXPRESSION__UNARY_OPERATOR: return JPQLPackage.SELECT_STATEMENT__UNARY_OPERATOR;
        case JPQLPackage.EXPRESSION__RIGHT: return JPQLPackage.SELECT_STATEMENT__RIGHT;
        case JPQLPackage.EXPRESSION__LEFT: return JPQLPackage.SELECT_STATEMENT__LEFT;
        case JPQLPackage.EXPRESSION__IS_NOT: return JPQLPackage.SELECT_STATEMENT__IS_NOT;
        case JPQLPackage.EXPRESSION__ITEMS: return JPQLPackage.SELECT_STATEMENT__ITEMS;
        case JPQLPackage.EXPRESSION__QUERY: return JPQLPackage.SELECT_STATEMENT__QUERY;
        case JPQLPackage.EXPRESSION__MIN: return JPQLPackage.SELECT_STATEMENT__MIN;
        case JPQLPackage.EXPRESSION__MAX: return JPQLPackage.SELECT_STATEMENT__MAX;
        default: return -1;
      }
    }
    if (baseClass == ExpressionTerm.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (unaryOperator: ");
    result.append(unaryOperator);
    result.append(", isNot: ");
    result.append(isNot);
    result.append(')');
    return result.toString();
  }

} //SelectStatementImpl
