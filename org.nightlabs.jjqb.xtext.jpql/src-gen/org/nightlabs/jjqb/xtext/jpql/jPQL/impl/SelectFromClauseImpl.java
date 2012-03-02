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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.jjqb.xtext.jpql.jPQL.FromClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectFromClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select From Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.SelectFromClauseImpl#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.SelectFromClauseImpl#getFromClause <em>From Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectFromClauseImpl extends MinimalEObjectImpl.Container implements SelectFromClause
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectFromClauseImpl()
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
    return JPQLPackage.Literals.SELECT_FROM_CLAUSE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE, oldSelectClause, newSelectClause);
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
        msgs = ((InternalEObject)selectClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE, null, msgs);
      if (newSelectClause != null)
        msgs = ((InternalEObject)newSelectClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE, null, msgs);
      msgs = basicSetSelectClause(newSelectClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE, newSelectClause, newSelectClause));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE, oldFromClause, newFromClause);
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
        msgs = ((InternalEObject)fromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE, null, msgs);
      if (newFromClause != null)
        msgs = ((InternalEObject)newFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE, null, msgs);
      msgs = basicSetFromClause(newFromClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE, newFromClause, newFromClause));
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
      case JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE:
        return basicSetSelectClause(null, msgs);
      case JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE:
        return basicSetFromClause(null, msgs);
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
      case JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE:
        return getSelectClause();
      case JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE:
        return getFromClause();
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
      case JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE:
        setSelectClause((SelectClause)newValue);
        return;
      case JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE:
        setFromClause((FromClause)newValue);
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
      case JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE:
        setSelectClause((SelectClause)null);
        return;
      case JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE:
        setFromClause((FromClause)null);
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
      case JPQLPackage.SELECT_FROM_CLAUSE__SELECT_CLAUSE:
        return selectClause != null;
      case JPQLPackage.SELECT_FROM_CLAUSE__FROM_CLAUSE:
        return fromClause != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectFromClauseImpl
