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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectImpl#getResultClause <em>Result Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectImpl#getIntoClause <em>Into Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select
{
  /**
   * The cached value of the '{@link #getResultClause() <em>Result Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultClause()
   * @generated
   * @ordered
   */
  protected ResultClause resultClause;

  /**
   * The cached value of the '{@link #getIntoClause() <em>Into Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntoClause()
   * @generated
   * @ordered
   */
  protected IntoClause intoClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
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
    return JDOQLPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultClause getResultClause()
  {
    return resultClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultClause(ResultClause newResultClause, NotificationChain msgs)
  {
    ResultClause oldResultClause = resultClause;
    resultClause = newResultClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SELECT__RESULT_CLAUSE, oldResultClause, newResultClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultClause(ResultClause newResultClause)
  {
    if (newResultClause != resultClause)
    {
      NotificationChain msgs = null;
      if (resultClause != null)
        msgs = ((InternalEObject)resultClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SELECT__RESULT_CLAUSE, null, msgs);
      if (newResultClause != null)
        msgs = ((InternalEObject)newResultClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SELECT__RESULT_CLAUSE, null, msgs);
      msgs = basicSetResultClause(newResultClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SELECT__RESULT_CLAUSE, newResultClause, newResultClause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntoClause getIntoClause()
  {
    return intoClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntoClause(IntoClause newIntoClause, NotificationChain msgs)
  {
    IntoClause oldIntoClause = intoClause;
    intoClause = newIntoClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JDOQLPackage.SELECT__INTO_CLAUSE, oldIntoClause, newIntoClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntoClause(IntoClause newIntoClause)
  {
    if (newIntoClause != intoClause)
    {
      NotificationChain msgs = null;
      if (intoClause != null)
        msgs = ((InternalEObject)intoClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SELECT__INTO_CLAUSE, null, msgs);
      if (newIntoClause != null)
        msgs = ((InternalEObject)newIntoClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JDOQLPackage.SELECT__INTO_CLAUSE, null, msgs);
      msgs = basicSetIntoClause(newIntoClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JDOQLPackage.SELECT__INTO_CLAUSE, newIntoClause, newIntoClause));
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
      case JDOQLPackage.SELECT__RESULT_CLAUSE:
        return basicSetResultClause(null, msgs);
      case JDOQLPackage.SELECT__INTO_CLAUSE:
        return basicSetIntoClause(null, msgs);
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
      case JDOQLPackage.SELECT__RESULT_CLAUSE:
        return getResultClause();
      case JDOQLPackage.SELECT__INTO_CLAUSE:
        return getIntoClause();
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
      case JDOQLPackage.SELECT__RESULT_CLAUSE:
        setResultClause((ResultClause)newValue);
        return;
      case JDOQLPackage.SELECT__INTO_CLAUSE:
        setIntoClause((IntoClause)newValue);
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
      case JDOQLPackage.SELECT__RESULT_CLAUSE:
        setResultClause((ResultClause)null);
        return;
      case JDOQLPackage.SELECT__INTO_CLAUSE:
        setIntoClause((IntoClause)null);
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
      case JDOQLPackage.SELECT__RESULT_CLAUSE:
        return resultClause != null;
      case JDOQLPackage.SELECT__INTO_CLAUSE:
        return intoClause != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectImpl
