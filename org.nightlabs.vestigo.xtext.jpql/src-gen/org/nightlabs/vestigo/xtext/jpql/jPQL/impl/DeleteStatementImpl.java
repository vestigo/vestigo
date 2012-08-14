/**
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteStatementImpl#getDeleteClause <em>Delete Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeleteStatementImpl extends JPQLQueryImpl implements DeleteStatement
{
  /**
   * The cached value of the '{@link #getDeleteClause() <em>Delete Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteClause()
   * @generated
   * @ordered
   */
  protected DeleteClause deleteClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeleteStatementImpl()
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
    return JPQLPackage.Literals.DELETE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteClause getDeleteClause()
  {
    return deleteClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeleteClause(DeleteClause newDeleteClause, NotificationChain msgs)
  {
    DeleteClause oldDeleteClause = deleteClause;
    deleteClause = newDeleteClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE, oldDeleteClause, newDeleteClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeleteClause(DeleteClause newDeleteClause)
  {
    if (newDeleteClause != deleteClause)
    {
      NotificationChain msgs = null;
      if (deleteClause != null)
        msgs = ((InternalEObject)deleteClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE, null, msgs);
      if (newDeleteClause != null)
        msgs = ((InternalEObject)newDeleteClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE, null, msgs);
      msgs = basicSetDeleteClause(newDeleteClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE, newDeleteClause, newDeleteClause));
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
      case JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE:
        return basicSetDeleteClause(null, msgs);
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
      case JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE:
        return getDeleteClause();
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
      case JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE:
        setDeleteClause((DeleteClause)newValue);
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
      case JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE:
        setDeleteClause((DeleteClause)null);
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
      case JPQLPackage.DELETE_STATEMENT__DELETE_CLAUSE:
        return deleteClause != null;
    }
    return super.eIsSet(featureID);
  }

} //DeleteStatementImpl
