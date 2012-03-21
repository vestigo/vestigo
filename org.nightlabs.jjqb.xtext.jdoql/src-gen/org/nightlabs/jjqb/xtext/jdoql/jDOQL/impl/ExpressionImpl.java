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
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getThis <em>This</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl#getParameterName <em>Parameter Name</em>}</li>
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
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        return getUnaryOperator();
      case JDOQLPackage.EXPRESSION__RIGHT:
        return getRight();
      case JDOQLPackage.EXPRESSION__LITERAL:
        return getLiteral();
      case JDOQLPackage.EXPRESSION__THIS:
        return getThis();
      case JDOQLPackage.EXPRESSION__ID:
        return getId();
      case JDOQLPackage.EXPRESSION__PARAMETER_NAME:
        return getParameterName();
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
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        setUnaryOperator((UnaryOperator)newValue);
        return;
      case JDOQLPackage.EXPRESSION__RIGHT:
        setRight((Expression)newValue);
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
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
        return;
      case JDOQLPackage.EXPRESSION__RIGHT:
        setRight((Expression)null);
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
      case JDOQLPackage.EXPRESSION__UNARY_OPERATOR:
        return unaryOperator != UNARY_OPERATOR_EDEFAULT;
      case JDOQLPackage.EXPRESSION__RIGHT:
        return right != null;
      case JDOQLPackage.EXPRESSION__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case JDOQLPackage.EXPRESSION__THIS:
        return THIS_EDEFAULT == null ? this_ != null : !THIS_EDEFAULT.equals(this_);
      case JDOQLPackage.EXPRESSION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case JDOQLPackage.EXPRESSION__PARAMETER_NAME:
        return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
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
    result.append(" (unaryOperator: ");
    result.append(unaryOperator);
    result.append(", literal: ");
    result.append(literal);
    result.append(", this: ");
    result.append(this_);
    result.append(", id: ");
    result.append(id);
    result.append(", parameterName: ");
    result.append(parameterName);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
