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

import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateStatementImpl#getUpdateClause <em>Update Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateStatementImpl#getSetClause <em>Set Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateStatementImpl extends JPQLQueryImpl implements UpdateStatement
{
  /**
   * The cached value of the '{@link #getUpdateClause() <em>Update Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdateClause()
   * @generated
   * @ordered
   */
  protected UpdateClause updateClause;

  /**
   * The cached value of the '{@link #getSetClause() <em>Set Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetClause()
   * @generated
   * @ordered
   */
  protected SetClause setClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateStatementImpl()
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
    return JPQLPackage.Literals.UPDATE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateClause getUpdateClause()
  {
    return updateClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpdateClause(UpdateClause newUpdateClause, NotificationChain msgs)
  {
    UpdateClause oldUpdateClause = updateClause;
    updateClause = newUpdateClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE, oldUpdateClause, newUpdateClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpdateClause(UpdateClause newUpdateClause)
  {
    if (newUpdateClause != updateClause)
    {
      NotificationChain msgs = null;
      if (updateClause != null)
        msgs = ((InternalEObject)updateClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE, null, msgs);
      if (newUpdateClause != null)
        msgs = ((InternalEObject)newUpdateClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE, null, msgs);
      msgs = basicSetUpdateClause(newUpdateClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE, newUpdateClause, newUpdateClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetClause getSetClause()
  {
    return setClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetClause(SetClause newSetClause, NotificationChain msgs)
  {
    SetClause oldSetClause = setClause;
    setClause = newSetClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE, oldSetClause, newSetClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetClause(SetClause newSetClause)
  {
    if (newSetClause != setClause)
    {
      NotificationChain msgs = null;
      if (setClause != null)
        msgs = ((InternalEObject)setClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE, null, msgs);
      if (newSetClause != null)
        msgs = ((InternalEObject)newSetClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE, null, msgs);
      msgs = basicSetSetClause(newSetClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE, newSetClause, newSetClause));
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
      case JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE:
        return basicSetUpdateClause(null, msgs);
      case JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE:
        return basicSetSetClause(null, msgs);
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
      case JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE:
        return getUpdateClause();
      case JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE:
        return getSetClause();
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
      case JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE:
        setUpdateClause((UpdateClause)newValue);
        return;
      case JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE:
        setSetClause((SetClause)newValue);
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
      case JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE:
        setUpdateClause((UpdateClause)null);
        return;
      case JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE:
        setSetClause((SetClause)null);
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
      case JPQLPackage.UPDATE_STATEMENT__UPDATE_CLAUSE:
        return updateClause != null;
      case JPQLPackage.UPDATE_STATEMENT__SET_CLAUSE:
        return setClause != null;
    }
    return super.eIsSet(featureID);
  }

} //UpdateStatementImpl
