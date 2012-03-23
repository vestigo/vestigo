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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Expression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ExpressionTerm;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Value;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Variable;
import org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasAttributeExpressionImpl extends OrderBySpecImpl implements AliasAttributeExpression
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
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final OrderByDirection DIRECTION_EDEFAULT = OrderByDirection.ASC;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected OrderByDirection direction = DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected VariableDeclaration alias;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<String> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasAttributeExpressionImpl()
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
    return JPQLPackage.Literals.ALIAS_ATTRIBUTE_EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR, oldUnaryOperator, unaryOperator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT, newRight, newRight));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT, oldIsNot, isNot));
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
      items = new EObjectContainmentEList<Variable>(Variable.class, this, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY, oldQuery, newQuery);
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
        msgs = ((InternalEObject)query).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY, null, msgs);
      if (newQuery != null)
        msgs = ((InternalEObject)newQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY, null, msgs);
      msgs = basicSetQuery(newQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY, newQuery, newQuery));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN, oldMin, newMin);
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
        msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN, null, msgs);
      if (newMin != null)
        msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN, null, msgs);
      msgs = basicSetMin(newMin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN, newMin, newMin));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX, oldMax, newMax);
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
        msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX, null, msgs);
      if (newMax != null)
        msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX, null, msgs);
      msgs = basicSetMax(newMax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX, newMax, newMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderByDirection getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(OrderByDirection newDirection)
  {
    OrderByDirection oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getAlias()
  {
    if (alias != null && alias.eIsProxy())
    {
      InternalEObject oldAlias = (InternalEObject)alias;
      alias = (VariableDeclaration)eResolveProxy(oldAlias);
      if (alias != oldAlias)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS, oldAlias, alias));
      }
    }
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(VariableDeclaration newAlias)
  {
    VariableDeclaration oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EDataTypeEList<String>(String.class, this, JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES);
    }
    return attributes;
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY:
        return basicSetQuery(null, msgs);
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN:
        return basicSetMin(null, msgs);
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX:
        return basicSetMax(null, msgs);
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR:
        return getUnaryOperator();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT:
        return getRight();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT:
        return getLeft();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT:
        return isIsNot();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS:
        return getItems();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY:
        return getQuery();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN:
        return getMin();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX:
        return getMax();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        return getDirection();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        if (resolve) return getAlias();
        return basicGetAlias();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        return getAttributes();
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR:
        setUnaryOperator((UnaryOperator)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT:
        setLeft((Expression)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT:
        setIsNot((Boolean)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends Variable>)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY:
        setQuery((SelectStatement)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN:
        setMin((Value)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX:
        setMax((Value)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        setDirection((OrderByDirection)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        setAlias((VariableDeclaration)newValue);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends String>)newValue);
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR:
        setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT:
        setLeft((Expression)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT:
        setIsNot(IS_NOT_EDEFAULT);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS:
        getItems().clear();
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY:
        setQuery((SelectStatement)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN:
        setMin((Value)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX:
        setMax((Value)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        setAlias((VariableDeclaration)null);
        return;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        getAttributes().clear();
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
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR:
        return unaryOperator != UNARY_OPERATOR_EDEFAULT;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT:
        return right != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT:
        return left != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT:
        return isNot != IS_NOT_EDEFAULT;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS:
        return items != null && !items.isEmpty();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY:
        return query != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN:
        return min != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX:
        return max != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ALIAS:
        return alias != null;
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
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
    if (baseClass == SelectExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR: return JPQLPackage.EXPRESSION__UNARY_OPERATOR;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT: return JPQLPackage.EXPRESSION__RIGHT;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT: return JPQLPackage.EXPRESSION__LEFT;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT: return JPQLPackage.EXPRESSION__IS_NOT;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS: return JPQLPackage.EXPRESSION__ITEMS;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY: return JPQLPackage.EXPRESSION__QUERY;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN: return JPQLPackage.EXPRESSION__MIN;
        case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX: return JPQLPackage.EXPRESSION__MAX;
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
    if (baseClass == Variable.class)
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
    if (baseClass == SelectExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case JPQLPackage.EXPRESSION__UNARY_OPERATOR: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR;
        case JPQLPackage.EXPRESSION__RIGHT: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__RIGHT;
        case JPQLPackage.EXPRESSION__LEFT: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__LEFT;
        case JPQLPackage.EXPRESSION__IS_NOT: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT;
        case JPQLPackage.EXPRESSION__ITEMS: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__ITEMS;
        case JPQLPackage.EXPRESSION__QUERY: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__QUERY;
        case JPQLPackage.EXPRESSION__MIN: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MIN;
        case JPQLPackage.EXPRESSION__MAX: return JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION__MAX;
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
    if (baseClass == Variable.class)
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
    result.append(", direction: ");
    result.append(direction);
    result.append(", attributes: ");
    result.append(attributes);
    result.append(')');
    return result.toString();
  }

} //AliasAttributeExpressionImpl
