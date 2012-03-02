/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.impl;

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

import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OrderClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OrderItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.OrderClauseImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.OrderClauseImpl#isIsAsc <em>Is Asc</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.OrderClauseImpl#isIsDesc <em>Is Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderClauseImpl extends MinimalEObjectImpl.Container implements OrderClause
{
  /**
   * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
  protected EList<OrderItem> ordering;

  /**
   * The default value of the '{@link #isIsAsc() <em>Is Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsc()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ASC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAsc() <em>Is Asc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsc()
   * @generated
   * @ordered
   */
  protected boolean isAsc = IS_ASC_EDEFAULT;

  /**
   * The default value of the '{@link #isIsDesc() <em>Is Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDesc()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DESC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDesc() <em>Is Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDesc()
   * @generated
   * @ordered
   */
  protected boolean isDesc = IS_DESC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderClauseImpl()
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
    return JPQLPackage.Literals.ORDER_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrderItem> getOrdering()
  {
    if (ordering == null)
    {
      ordering = new EObjectContainmentEList<OrderItem>(OrderItem.class, this, JPQLPackage.ORDER_CLAUSE__ORDERING);
    }
    return ordering;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAsc()
  {
    return isAsc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAsc(boolean newIsAsc)
  {
    boolean oldIsAsc = isAsc;
    isAsc = newIsAsc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ORDER_CLAUSE__IS_ASC, oldIsAsc, isAsc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDesc()
  {
    return isDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDesc(boolean newIsDesc)
  {
    boolean oldIsDesc = isDesc;
    isDesc = newIsDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.ORDER_CLAUSE__IS_DESC, oldIsDesc, isDesc));
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
      case JPQLPackage.ORDER_CLAUSE__ORDERING:
        return ((InternalEList<?>)getOrdering()).basicRemove(otherEnd, msgs);
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
      case JPQLPackage.ORDER_CLAUSE__ORDERING:
        return getOrdering();
      case JPQLPackage.ORDER_CLAUSE__IS_ASC:
        return isIsAsc();
      case JPQLPackage.ORDER_CLAUSE__IS_DESC:
        return isIsDesc();
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
      case JPQLPackage.ORDER_CLAUSE__ORDERING:
        getOrdering().clear();
        getOrdering().addAll((Collection<? extends OrderItem>)newValue);
        return;
      case JPQLPackage.ORDER_CLAUSE__IS_ASC:
        setIsAsc((Boolean)newValue);
        return;
      case JPQLPackage.ORDER_CLAUSE__IS_DESC:
        setIsDesc((Boolean)newValue);
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
      case JPQLPackage.ORDER_CLAUSE__ORDERING:
        getOrdering().clear();
        return;
      case JPQLPackage.ORDER_CLAUSE__IS_ASC:
        setIsAsc(IS_ASC_EDEFAULT);
        return;
      case JPQLPackage.ORDER_CLAUSE__IS_DESC:
        setIsDesc(IS_DESC_EDEFAULT);
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
      case JPQLPackage.ORDER_CLAUSE__ORDERING:
        return ordering != null && !ordering.isEmpty();
      case JPQLPackage.ORDER_CLAUSE__IS_ASC:
        return isAsc != IS_ASC_EDEFAULT;
      case JPQLPackage.ORDER_CLAUSE__IS_DESC:
        return isDesc != IS_DESC_EDEFAULT;
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
    result.append(" (isAsc: ");
    result.append(isAsc);
    result.append(", isDesc: ");
    result.append(isDesc);
    result.append(')');
    return result.toString();
  }

} //OrderClauseImpl
