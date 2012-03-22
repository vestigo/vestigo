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

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getResultNaming <em>Result Naming</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getCastType <em>Cast Type</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getThis <em>This</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getPersistable <em>Persistable</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getAggregateArgument <em>Aggregate Argument</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getFromIndex <em>From Index</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getReplacement <em>Replacement</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getBeginIndex <em>Begin Index</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getEndIndex <em>End Index</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends ResultSpecImpl implements Expression
{
  /**
   * The cached value of the '{@link #getResultNaming() <em>Result Naming</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultNaming()
   * @generated
   * @ordered
   */
  protected ResultNaming resultNaming;

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
   * The default value of the '{@link #getCastType() <em>Cast Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastType()
   * @generated
   * @ordered
   */
  protected static final String CAST_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCastType() <em>Cast Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastType()
   * @generated
   * @ordered
   */
  protected String castType = CAST_TYPE_EDEFAULT;

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
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The default value of the '{@link #getThis() <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected static final String THIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThis() <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected String this_ = THIS_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterName()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterName()
   * @generated
   * @ordered
   */
  protected String parameterName = PARAMETER_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Expression method;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected Expression number;

  /**
   * The cached value of the '{@link #getPersistable() <em>Persistable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistable()
   * @generated
   * @ordered
   */
  protected Expression persistable;

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
   * The cached value of the '{@link #getAggregateArgument() <em>Aggregate Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregateArgument()
   * @generated
   * @ordered
   */
  protected Expression aggregateArgument;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Expression element;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected Expression arg;

  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected Expression key;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Expression index;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected Expression string;

  /**
   * The cached value of the '{@link #getFromIndex() <em>From Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromIndex()
   * @generated
   * @ordered
   */
  protected Expression fromIndex;

  /**
   * The cached value of the '{@link #getRegex() <em>Regex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegex()
   * @generated
   * @ordered
   */
  protected Expression regex;

  /**
   * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplacement()
   * @generated
   * @ordered
   */
  protected Expression replacement;

  /**
   * The cached value of the '{@link #getBeginIndex() <em>Begin Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeginIndex()
   * @generated
   * @ordered
   */
  protected Expression beginIndex;

  /**
   * The cached value of the '{@link #getEndIndex() <em>End Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndIndex()
   * @generated
   * @ordered
   */
  protected Expression endIndex;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return JDOQLPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultNaming getResultNaming()
  {
    return resultNaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultNaming(ResultNaming newResultNaming, NotificationChain msgs)
  {
    ResultNaming oldResultNaming = resultNaming;
    resultNaming = newResultNaming;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__RESULT_NAMING, oldResultNaming, newResultNaming);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultNaming(ResultNaming newResultNaming)
  {
    if (newResultNaming != resultNaming)
    {
      NotificationChain msgs = null;
      if (resultNaming != null)
        msgs = ((InternalEObject)resultNaming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__RESULT_NAMING, null, msgs);
      if (newResultNaming != null)
        msgs = ((InternalEObject)newResultNaming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__RESULT_NAMING, null, msgs);
      msgs = basicSetResultNaming(newResultNaming, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__RESULT_NAMING, newResultNaming, newResultNaming));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCastType()
  {
    return castType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastType(String newCastType)
  {
    String oldCastType = castType;
    castType = newCastType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__CAST_TYPE, oldCastType, castType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__RIGHT, newRight, newRight));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__UNARY_OPERATOR, oldUnaryOperator, unaryOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThis()
  {
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThis(String newThis)
  {
    String oldThis = this_;
    this_ = newThis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__THIS, oldThis, this_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameterName()
  {
    return parameterName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterName(String newParameterName)
  {
    String oldParameterName = parameterName;
    parameterName = newParameterName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__PARAMETER_NAME, oldParameterName, parameterName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(Expression newMethod, NotificationChain msgs)
  {
    Expression oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Expression newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__METHOD, newMethod, newMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(Expression newNumber, NotificationChain msgs)
  {
    Expression oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(Expression newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getPersistable()
  {
    return persistable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersistable(Expression newPersistable, NotificationChain msgs)
  {
    Expression oldPersistable = persistable;
    persistable = newPersistable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__PERSISTABLE, oldPersistable, newPersistable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersistable(Expression newPersistable)
  {
    if (newPersistable != persistable)
    {
      NotificationChain msgs = null;
      if (persistable != null)
        msgs = ((InternalEObject)persistable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__PERSISTABLE, null, msgs);
      if (newPersistable != null)
        msgs = ((InternalEObject)newPersistable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__PERSISTABLE, null, msgs);
      msgs = basicSetPersistable(newPersistable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__PERSISTABLE, newPersistable, newPersistable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__IS_DISTINCT, oldIsDistinct, isDistinct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAggregateArgument()
  {
    return aggregateArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggregateArgument(Expression newAggregateArgument, NotificationChain msgs)
  {
    Expression oldAggregateArgument = aggregateArgument;
    aggregateArgument = newAggregateArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT, oldAggregateArgument, newAggregateArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregateArgument(Expression newAggregateArgument)
  {
    if (newAggregateArgument != aggregateArgument)
    {
      NotificationChain msgs = null;
      if (aggregateArgument != null)
        msgs = ((InternalEObject)aggregateArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT, null, msgs);
      if (newAggregateArgument != null)
        msgs = ((InternalEObject)newAggregateArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT, null, msgs);
      msgs = basicSetAggregateArgument(newAggregateArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT, newAggregateArgument, newAggregateArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(Expression newElement, NotificationChain msgs)
  {
    Expression oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(Expression newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(Expression newArg, NotificationChain msgs)
  {
    Expression oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(Expression newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(Expression newKey, NotificationChain msgs)
  {
    Expression oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(Expression newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs)
  {
    Expression oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Expression newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__INDEX, newIndex, newIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetString(Expression newString, NotificationChain msgs)
  {
    Expression oldString = string;
    string = newString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__STRING, oldString, newString);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(Expression newString)
  {
    if (newString != string)
    {
      NotificationChain msgs = null;
      if (string != null)
        msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__STRING, null, msgs);
      if (newString != null)
        msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__STRING, null, msgs);
      msgs = basicSetString(newString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__STRING, newString, newString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFromIndex()
  {
    return fromIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromIndex(Expression newFromIndex, NotificationChain msgs)
  {
    Expression oldFromIndex = fromIndex;
    fromIndex = newFromIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__FROM_INDEX, oldFromIndex, newFromIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromIndex(Expression newFromIndex)
  {
    if (newFromIndex != fromIndex)
    {
      NotificationChain msgs = null;
      if (fromIndex != null)
        msgs = ((InternalEObject)fromIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__FROM_INDEX, null, msgs);
      if (newFromIndex != null)
        msgs = ((InternalEObject)newFromIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__FROM_INDEX, null, msgs);
      msgs = basicSetFromIndex(newFromIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__FROM_INDEX, newFromIndex, newFromIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRegex()
  {
    return regex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegex(Expression newRegex, NotificationChain msgs)
  {
    Expression oldRegex = regex;
    regex = newRegex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__REGEX, oldRegex, newRegex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegex(Expression newRegex)
  {
    if (newRegex != regex)
    {
      NotificationChain msgs = null;
      if (regex != null)
        msgs = ((InternalEObject)regex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__REGEX, null, msgs);
      if (newRegex != null)
        msgs = ((InternalEObject)newRegex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__REGEX, null, msgs);
      msgs = basicSetRegex(newRegex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__REGEX, newRegex, newRegex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getReplacement()
  {
    return replacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReplacement(Expression newReplacement, NotificationChain msgs)
  {
    Expression oldReplacement = replacement;
    replacement = newReplacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__REPLACEMENT, oldReplacement, newReplacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplacement(Expression newReplacement)
  {
    if (newReplacement != replacement)
    {
      NotificationChain msgs = null;
      if (replacement != null)
        msgs = ((InternalEObject)replacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__REPLACEMENT, null, msgs);
      if (newReplacement != null)
        msgs = ((InternalEObject)newReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__REPLACEMENT, null, msgs);
      msgs = basicSetReplacement(newReplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__REPLACEMENT, newReplacement, newReplacement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getBeginIndex()
  {
    return beginIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBeginIndex(Expression newBeginIndex, NotificationChain msgs)
  {
    Expression oldBeginIndex = beginIndex;
    beginIndex = newBeginIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__BEGIN_INDEX, oldBeginIndex, newBeginIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeginIndex(Expression newBeginIndex)
  {
    if (newBeginIndex != beginIndex)
    {
      NotificationChain msgs = null;
      if (beginIndex != null)
        msgs = ((InternalEObject)beginIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__BEGIN_INDEX, null, msgs);
      if (newBeginIndex != null)
        msgs = ((InternalEObject)newBeginIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__BEGIN_INDEX, null, msgs);
      msgs = basicSetBeginIndex(newBeginIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__BEGIN_INDEX, newBeginIndex, newBeginIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEndIndex()
  {
    return endIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndIndex(Expression newEndIndex, NotificationChain msgs)
  {
    Expression oldEndIndex = endIndex;
    endIndex = newEndIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__END_INDEX, oldEndIndex, newEndIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndIndex(Expression newEndIndex)
  {
    if (newEndIndex != endIndex)
    {
      NotificationChain msgs = null;
      if (endIndex != null)
        msgs = ((InternalEObject)endIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__END_INDEX, null, msgs);
      if (newEndIndex != null)
        msgs = ((InternalEObject)newEndIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__END_INDEX, null, msgs);
      msgs = basicSetEndIndex(newEndIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__END_INDEX, newEndIndex, newEndIndex));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.EXPRESSION__LEFT, newLeft, newLeft));
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
      case JDOQLPackage.EXPRESSION__RESULT_NAMING:
        return basicSetResultNaming(null, msgs);
      case JDOQLPackage.EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case JDOQLPackage.EXPRESSION__METHOD:
        return basicSetMethod(null, msgs);
      case JDOQLPackage.EXPRESSION__NUMBER:
        return basicSetNumber(null, msgs);
      case JDOQLPackage.EXPRESSION__PERSISTABLE:
        return basicSetPersistable(null, msgs);
      case JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT:
        return basicSetAggregateArgument(null, msgs);
      case JDOQLPackage.EXPRESSION__ELEMENT:
        return basicSetElement(null, msgs);
      case JDOQLPackage.EXPRESSION__ARG:
        return basicSetArg(null, msgs);
      case JDOQLPackage.EXPRESSION__KEY:
        return basicSetKey(null, msgs);
      case JDOQLPackage.EXPRESSION__VALUE:
        return basicSetValue(null, msgs);
      case JDOQLPackage.EXPRESSION__INDEX:
        return basicSetIndex(null, msgs);
      case JDOQLPackage.EXPRESSION__STRING:
        return basicSetString(null, msgs);
      case JDOQLPackage.EXPRESSION__FROM_INDEX:
        return basicSetFromIndex(null, msgs);
      case JDOQLPackage.EXPRESSION__REGEX:
        return basicSetRegex(null, msgs);
      case JDOQLPackage.EXPRESSION__REPLACEMENT:
        return basicSetReplacement(null, msgs);
      case JDOQLPackage.EXPRESSION__BEGIN_INDEX:
        return basicSetBeginIndex(null, msgs);
      case JDOQLPackage.EXPRESSION__END_INDEX:
        return basicSetEndIndex(null, msgs);
      case JDOQLPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
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
      case JDOQLPackage.EXPRESSION__RESULT_NAMING:
        return getResultNaming();
      case JDOQLPackage.EXPRESSION__DIRECTION:
        return getDirection();
      case JDOQLPackage.EXPRESSION__CAST_TYPE:
        return getCastType();
      case JDOQLPackage.EXPRESSION__RIGHT:
        return getRight();
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        return getUnaryOperator();
      case JDOQLPackage.EXPRESSION__LITERAL:
        return getLiteral();
      case JDOQLPackage.EXPRESSION__THIS:
        return getThis();
      case JDOQLPackage.EXPRESSION__ID:
        return getId();
      case JDOQLPackage.EXPRESSION__PARAMETER_NAME:
        return getParameterName();
      case JDOQLPackage.EXPRESSION__METHOD:
        return getMethod();
      case JDOQLPackage.EXPRESSION__NUMBER:
        return getNumber();
      case JDOQLPackage.EXPRESSION__PERSISTABLE:
        return getPersistable();
      case JDOQLPackage.EXPRESSION__IS_DISTINCT:
        return isIsDistinct();
      case JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT:
        return getAggregateArgument();
      case JDOQLPackage.EXPRESSION__ELEMENT:
        return getElement();
      case JDOQLPackage.EXPRESSION__ARG:
        return getArg();
      case JDOQLPackage.EXPRESSION__KEY:
        return getKey();
      case JDOQLPackage.EXPRESSION__VALUE:
        return getValue();
      case JDOQLPackage.EXPRESSION__INDEX:
        return getIndex();
      case JDOQLPackage.EXPRESSION__STRING:
        return getString();
      case JDOQLPackage.EXPRESSION__FROM_INDEX:
        return getFromIndex();
      case JDOQLPackage.EXPRESSION__REGEX:
        return getRegex();
      case JDOQLPackage.EXPRESSION__REPLACEMENT:
        return getReplacement();
      case JDOQLPackage.EXPRESSION__BEGIN_INDEX:
        return getBeginIndex();
      case JDOQLPackage.EXPRESSION__END_INDEX:
        return getEndIndex();
      case JDOQLPackage.EXPRESSION__LEFT:
        return getLeft();
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
      case JDOQLPackage.EXPRESSION__RESULT_NAMING:
        setResultNaming((ResultNaming)newValue);
        return;
      case JDOQLPackage.EXPRESSION__DIRECTION:
        setDirection((OrderByDirection)newValue);
        return;
      case JDOQLPackage.EXPRESSION__CAST_TYPE:
        setCastType((String)newValue);
        return;
      case JDOQLPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        setUnaryOperator((UnaryOperator)newValue);
        return;
      case JDOQLPackage.EXPRESSION__LITERAL:
        setLiteral((String)newValue);
        return;
      case JDOQLPackage.EXPRESSION__THIS:
        setThis((String)newValue);
        return;
      case JDOQLPackage.EXPRESSION__ID:
        setId((String)newValue);
        return;
      case JDOQLPackage.EXPRESSION__PARAMETER_NAME:
        setParameterName((String)newValue);
        return;
      case JDOQLPackage.EXPRESSION__METHOD:
        setMethod((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__NUMBER:
        setNumber((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__PERSISTABLE:
        setPersistable((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__IS_DISTINCT:
        setIsDistinct((Boolean)newValue);
        return;
      case JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT:
        setAggregateArgument((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__ELEMENT:
        setElement((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__ARG:
        setArg((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__KEY:
        setKey((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__VALUE:
        setValue((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__INDEX:
        setIndex((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__STRING:
        setString((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__FROM_INDEX:
        setFromIndex((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__REGEX:
        setRegex((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__REPLACEMENT:
        setReplacement((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__BEGIN_INDEX:
        setBeginIndex((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__END_INDEX:
        setEndIndex((Expression)newValue);
        return;
      case JDOQLPackage.EXPRESSION__LEFT:
        setLeft((Expression)newValue);
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
      case JDOQLPackage.EXPRESSION__RESULT_NAMING:
        setResultNaming((ResultNaming)null);
        return;
      case JDOQLPackage.EXPRESSION__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__CAST_TYPE:
        setCastType(CAST_TYPE_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__THIS:
        setThis(THIS_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__ID:
        setId(ID_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__PARAMETER_NAME:
        setParameterName(PARAMETER_NAME_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__METHOD:
        setMethod((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__NUMBER:
        setNumber((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__PERSISTABLE:
        setPersistable((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__IS_DISTINCT:
        setIsDistinct(IS_DISTINCT_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT:
        setAggregateArgument((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__ELEMENT:
        setElement((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__ARG:
        setArg((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__KEY:
        setKey((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__VALUE:
        setValue((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__INDEX:
        setIndex((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__STRING:
        setString((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__FROM_INDEX:
        setFromIndex((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__REGEX:
        setRegex((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__REPLACEMENT:
        setReplacement((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__BEGIN_INDEX:
        setBeginIndex((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__END_INDEX:
        setEndIndex((Expression)null);
        return;
      case JDOQLPackage.EXPRESSION__LEFT:
        setLeft((Expression)null);
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
      case JDOQLPackage.EXPRESSION__RESULT_NAMING:
        return resultNaming != null;
      case JDOQLPackage.EXPRESSION__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case JDOQLPackage.EXPRESSION__CAST_TYPE:
        return CAST_TYPE_EDEFAULT == null ? castType != null : !CAST_TYPE_EDEFAULT.equals(castType);
      case JDOQLPackage.EXPRESSION__RIGHT:
        return right != null;
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        return unaryOperator != UNARY_OPERATOR_EDEFAULT;
      case JDOQLPackage.EXPRESSION__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case JDOQLPackage.EXPRESSION__THIS:
        return THIS_EDEFAULT == null ? this_ != null : !THIS_EDEFAULT.equals(this_);
      case JDOQLPackage.EXPRESSION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case JDOQLPackage.EXPRESSION__PARAMETER_NAME:
        return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
      case JDOQLPackage.EXPRESSION__METHOD:
        return method != null;
      case JDOQLPackage.EXPRESSION__NUMBER:
        return number != null;
      case JDOQLPackage.EXPRESSION__PERSISTABLE:
        return persistable != null;
      case JDOQLPackage.EXPRESSION__IS_DISTINCT:
        return isDistinct != IS_DISTINCT_EDEFAULT;
      case JDOQLPackage.EXPRESSION__AGGREGATE_ARGUMENT:
        return aggregateArgument != null;
      case JDOQLPackage.EXPRESSION__ELEMENT:
        return element != null;
      case JDOQLPackage.EXPRESSION__ARG:
        return arg != null;
      case JDOQLPackage.EXPRESSION__KEY:
        return key != null;
      case JDOQLPackage.EXPRESSION__VALUE:
        return value != null;
      case JDOQLPackage.EXPRESSION__INDEX:
        return index != null;
      case JDOQLPackage.EXPRESSION__STRING:
        return string != null;
      case JDOQLPackage.EXPRESSION__FROM_INDEX:
        return fromIndex != null;
      case JDOQLPackage.EXPRESSION__REGEX:
        return regex != null;
      case JDOQLPackage.EXPRESSION__REPLACEMENT:
        return replacement != null;
      case JDOQLPackage.EXPRESSION__BEGIN_INDEX:
        return beginIndex != null;
      case JDOQLPackage.EXPRESSION__END_INDEX:
        return endIndex != null;
      case JDOQLPackage.EXPRESSION__LEFT:
        return left != null;
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
    result.append(" (direction: ");
    result.append(direction);
    result.append(", castType: ");
    result.append(castType);
    result.append(", unaryOperator: ");
    result.append(unaryOperator);
    result.append(", literal: ");
    result.append(literal);
    result.append(", this: ");
    result.append(this_);
    result.append(", id: ");
    result.append(id);
    result.append(", parameterName: ");
    result.append(parameterName);
    result.append(", isDistinct: ");
    result.append(isDistinct);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
