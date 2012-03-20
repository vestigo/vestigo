/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nightlabs.jjqb.xtext.jpql.jPQL.GroupClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.GroupItem;
import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.GroupClauseImpl#getGrouping <em>Grouping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupClauseImpl extends MinimalEObjectImpl.Container implements GroupClause
{
  /**
   * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrouping()
   * @generated
   * @ordered
   */
  protected EList<GroupItem> grouping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupClauseImpl()
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
    return JPQLPackage.Literals.GROUP_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupItem> getGrouping()
  {
    if (grouping == null)
    {
      grouping = new EObjectContainmentEList<GroupItem>(GroupItem.class, this, JPQLPackage.GROUP_CLAUSE__GROUPING);
    }
    return grouping;
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
      case JPQLPackage.GROUP_CLAUSE__GROUPING:
        return ((InternalEList<?>)getGrouping()).basicRemove(otherEnd, msgs);
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
      case JPQLPackage.GROUP_CLAUSE__GROUPING:
        return getGrouping();
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
      case JPQLPackage.GROUP_CLAUSE__GROUPING:
        getGrouping().clear();
        getGrouping().addAll((Collection<? extends GroupItem>)newValue);
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
      case JPQLPackage.GROUP_CLAUSE__GROUPING:
        getGrouping().clear();
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
      case JPQLPackage.GROUP_CLAUSE__GROUPING:
        return grouping != null && !grouping.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GroupClauseImpl
