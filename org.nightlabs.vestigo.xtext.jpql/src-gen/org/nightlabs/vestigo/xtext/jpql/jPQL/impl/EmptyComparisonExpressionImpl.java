/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nightlabs.vestigo.xtext.jpql.jPQL.EmptyComparisonExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empty Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.EmptyComparisonExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.EmptyComparisonExpressionImpl#isIsNot <em>Is Not</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmptyComparisonExpressionImpl extends ExpressionImpl implements EmptyComparisonExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Variable left;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmptyComparisonExpressionImpl()
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
    return JPQLPackage.Literals.EMPTY_COMPARISON_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Variable newLeft, NotificationChain msgs)
  {
    Variable oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Variable newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.EMPTY_COMPARISON_EXPRESSION__IS_NOT, oldIsNot, isNot));
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
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT:
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
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT:
        return getLeft();
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__IS_NOT:
        return isIsNot();
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
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT:
        setLeft((Variable)newValue);
        return;
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__IS_NOT:
        setIsNot((Boolean)newValue);
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
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT:
        setLeft((Variable)null);
        return;
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__IS_NOT:
        setIsNot(IS_NOT_EDEFAULT);
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
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__LEFT:
        return left != null;
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION__IS_NOT:
        return isNot != IS_NOT_EDEFAULT;
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
    result.append(" (isNot: ");
    result.append(isNot);
    result.append(')');
    return result.toString();
  }

} //EmptyComparisonExpressionImpl
