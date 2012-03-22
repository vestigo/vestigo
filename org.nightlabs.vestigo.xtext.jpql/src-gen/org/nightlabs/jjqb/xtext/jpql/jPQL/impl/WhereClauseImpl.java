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

import org.nightlabs.jjqb.xtext.jpql.jPQL.Expression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.jjqb.xtext.jpql.jPQL.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.impl.WhereClauseImpl#getWhereEntry <em>Where Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhereClauseImpl extends MinimalEObjectImpl.Container implements WhereClause
{
  /**
   * The cached value of the '{@link #getWhereEntry() <em>Where Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereEntry()
   * @generated
   * @ordered
   */
  protected Expression whereEntry;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereClauseImpl()
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
    return JPQLPackage.Literals.WHERE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWhereEntry()
  {
    return whereEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereEntry(Expression newWhereEntry, NotificationChain msgs)
  {
    Expression oldWhereEntry = whereEntry;
    whereEntry = newWhereEntry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY, oldWhereEntry, newWhereEntry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhereEntry(Expression newWhereEntry)
  {
    if (newWhereEntry != whereEntry)
    {
      NotificationChain msgs = null;
      if (whereEntry != null)
        msgs = ((InternalEObject)whereEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY, null, msgs);
      if (newWhereEntry != null)
        msgs = ((InternalEObject)newWhereEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY, null, msgs);
      msgs = basicSetWhereEntry(newWhereEntry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY, newWhereEntry, newWhereEntry));
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
      case JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY:
        return basicSetWhereEntry(null, msgs);
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
      case JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY:
        return getWhereEntry();
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
      case JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY:
        setWhereEntry((Expression)newValue);
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
      case JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY:
        setWhereEntry((Expression)null);
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
      case JPQLPackage.WHERE_CLAUSE__WHERE_ENTRY:
        return whereEntry != null;
    }
    return super.eIsSet(featureID);
  }

} //WhereClauseImpl
