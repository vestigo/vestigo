/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderBySpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order By Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderByClauseImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderByClauseImpl extends MinimalEObjectImpl.Container implements OrderByClause
{
  /**
   * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
  protected EList<OrderBySpec> ordering;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderByClauseImpl()
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
    return JDOQLPackage.Literals.ORDER_BY_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OrderBySpec> getOrdering()
  {
    if (ordering == null)
    {
      ordering = new EObjectContainmentEList<OrderBySpec>(OrderBySpec.class, this, JDOQLPackage.ORDER_BY_CLAUSE__ORDERING);
    }
    return ordering;
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
      case JDOQLPackage.ORDER_BY_CLAUSE__ORDERING:
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
      case JDOQLPackage.ORDER_BY_CLAUSE__ORDERING:
        return getOrdering();
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
      case JDOQLPackage.ORDER_BY_CLAUSE__ORDERING:
        getOrdering().clear();
        getOrdering().addAll((Collection<? extends OrderBySpec>)newValue);
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
      case JDOQLPackage.ORDER_BY_CLAUSE__ORDERING:
        getOrdering().clear();
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
      case JDOQLPackage.ORDER_BY_CLAUSE__ORDERING:
        return ordering != null && !ordering.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OrderByClauseImpl
