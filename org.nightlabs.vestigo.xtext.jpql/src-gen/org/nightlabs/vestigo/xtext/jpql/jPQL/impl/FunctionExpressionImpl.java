/**
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
import org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getStartPos <em>Start Pos</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getTrimSpec <em>Trim Spec</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl#getTrimChar <em>Trim Char</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionExpressionImpl extends ExpressionImpl implements FunctionExpression
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Expression> fields;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected Expression field;

  /**
   * The cached value of the '{@link #getStartPos() <em>Start Pos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartPos()
   * @generated
   * @ordered
   */
  protected Expression startPos;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected Expression length;

  /**
   * The default value of the '{@link #getTrimSpec() <em>Trim Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrimSpec()
   * @generated
   * @ordered
   */
  protected static final TrimSpec TRIM_SPEC_EDEFAULT = TrimSpec.LEADING;

  /**
   * The cached value of the '{@link #getTrimSpec() <em>Trim Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrimSpec()
   * @generated
   * @ordered
   */
  protected TrimSpec trimSpec = TRIM_SPEC_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrimChar() <em>Trim Char</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrimChar()
   * @generated
   * @ordered
   */
  protected Expression trimChar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionExpressionImpl()
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
    return JPQLPackage.Literals.FUNCTION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Expression>(Expression.class, this, JPQLPackage.FUNCTION_EXPRESSION__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField(Expression newField, NotificationChain msgs)
  {
    Expression oldField = field;
    field = newField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__FIELD, oldField, newField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(Expression newField)
  {
    if (newField != field)
    {
      NotificationChain msgs = null;
      if (field != null)
        msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__FIELD, null, msgs);
      if (newField != null)
        msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__FIELD, null, msgs);
      msgs = basicSetField(newField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__FIELD, newField, newField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStartPos()
  {
    return startPos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartPos(Expression newStartPos, NotificationChain msgs)
  {
    Expression oldStartPos = startPos;
    startPos = newStartPos;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__START_POS, oldStartPos, newStartPos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartPos(Expression newStartPos)
  {
    if (newStartPos != startPos)
    {
      NotificationChain msgs = null;
      if (startPos != null)
        msgs = ((InternalEObject)startPos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__START_POS, null, msgs);
      if (newStartPos != null)
        msgs = ((InternalEObject)newStartPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__START_POS, null, msgs);
      msgs = basicSetStartPos(newStartPos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__START_POS, newStartPos, newStartPos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLength(Expression newLength, NotificationChain msgs)
  {
    Expression oldLength = length;
    length = newLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__LENGTH, oldLength, newLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(Expression newLength)
  {
    if (newLength != length)
    {
      NotificationChain msgs = null;
      if (length != null)
        msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__LENGTH, null, msgs);
      if (newLength != null)
        msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__LENGTH, null, msgs);
      msgs = basicSetLength(newLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__LENGTH, newLength, newLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrimSpec getTrimSpec()
  {
    return trimSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrimSpec(TrimSpec newTrimSpec)
  {
    TrimSpec oldTrimSpec = trimSpec;
    trimSpec = newTrimSpec == null ? TRIM_SPEC_EDEFAULT : newTrimSpec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__TRIM_SPEC, oldTrimSpec, trimSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTrimChar()
  {
    return trimChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrimChar(Expression newTrimChar, NotificationChain msgs)
  {
    Expression oldTrimChar = trimChar;
    trimChar = newTrimChar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR, oldTrimChar, newTrimChar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrimChar(Expression newTrimChar)
  {
    if (newTrimChar != trimChar)
    {
      NotificationChain msgs = null;
      if (trimChar != null)
        msgs = ((InternalEObject)trimChar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR, null, msgs);
      if (newTrimChar != null)
        msgs = ((InternalEObject)newTrimChar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR, null, msgs);
      msgs = basicSetTrimChar(newTrimChar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR, newTrimChar, newTrimChar));
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
      case JPQLPackage.FUNCTION_EXPRESSION__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case JPQLPackage.FUNCTION_EXPRESSION__FIELD:
        return basicSetField(null, msgs);
      case JPQLPackage.FUNCTION_EXPRESSION__START_POS:
        return basicSetStartPos(null, msgs);
      case JPQLPackage.FUNCTION_EXPRESSION__LENGTH:
        return basicSetLength(null, msgs);
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR:
        return basicSetTrimChar(null, msgs);
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
      case JPQLPackage.FUNCTION_EXPRESSION__NAME:
        return getName();
      case JPQLPackage.FUNCTION_EXPRESSION__FIELDS:
        return getFields();
      case JPQLPackage.FUNCTION_EXPRESSION__FIELD:
        return getField();
      case JPQLPackage.FUNCTION_EXPRESSION__START_POS:
        return getStartPos();
      case JPQLPackage.FUNCTION_EXPRESSION__LENGTH:
        return getLength();
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_SPEC:
        return getTrimSpec();
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR:
        return getTrimChar();
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
      case JPQLPackage.FUNCTION_EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Expression>)newValue);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__FIELD:
        setField((Expression)newValue);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__START_POS:
        setStartPos((Expression)newValue);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__LENGTH:
        setLength((Expression)newValue);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_SPEC:
        setTrimSpec((TrimSpec)newValue);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR:
        setTrimChar((Expression)newValue);
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
      case JPQLPackage.FUNCTION_EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__FIELDS:
        getFields().clear();
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__FIELD:
        setField((Expression)null);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__START_POS:
        setStartPos((Expression)null);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__LENGTH:
        setLength((Expression)null);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_SPEC:
        setTrimSpec(TRIM_SPEC_EDEFAULT);
        return;
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR:
        setTrimChar((Expression)null);
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
      case JPQLPackage.FUNCTION_EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JPQLPackage.FUNCTION_EXPRESSION__FIELDS:
        return fields != null && !fields.isEmpty();
      case JPQLPackage.FUNCTION_EXPRESSION__FIELD:
        return field != null;
      case JPQLPackage.FUNCTION_EXPRESSION__START_POS:
        return startPos != null;
      case JPQLPackage.FUNCTION_EXPRESSION__LENGTH:
        return length != null;
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_SPEC:
        return trimSpec != TRIM_SPEC_EDEFAULT;
      case JPQLPackage.FUNCTION_EXPRESSION__TRIM_CHAR:
        return trimChar != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", trimSpec: ");
    result.append(trimSpec);
    result.append(')');
    return result.toString();
  }

} //FunctionExpressionImpl
