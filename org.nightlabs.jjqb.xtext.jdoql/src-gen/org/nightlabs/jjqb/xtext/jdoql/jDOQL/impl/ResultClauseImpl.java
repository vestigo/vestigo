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
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpecs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultClauseImpl#getResultSpecs <em>Result Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultClauseImpl extends MinimalEObjectImpl.Container implements ResultClause
{
  /**
   * The cached value of the '{@link #getResultSpecs() <em>Result Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultSpecs()
   * @generated
   * @ordered
   */
  protected EList<ResultSpecs> resultSpecs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResultClauseImpl()
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
    return JDOQLPackage.Literals.RESULT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResultSpecs> getResultSpecs()
  {
    if (resultSpecs == null)
    {
      resultSpecs = new EObjectContainmentEList<ResultSpecs>(ResultSpecs.class, this, JDOQLPackage.RESULT_CLAUSE__RESULT_SPECS);
    }
    return resultSpecs;
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
      case JDOQLPackage.RESULT_CLAUSE__RESULT_SPECS:
        return ((InternalEList<?>)getResultSpecs()).basicRemove(otherEnd, msgs);
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
      case JDOQLPackage.RESULT_CLAUSE__RESULT_SPECS:
        return getResultSpecs();
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
      case JDOQLPackage.RESULT_CLAUSE__RESULT_SPECS:
        getResultSpecs().clear();
        getResultSpecs().addAll((Collection<? extends ResultSpecs>)newValue);
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
      case JDOQLPackage.RESULT_CLAUSE__RESULT_SPECS:
        getResultSpecs().clear();
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
      case JDOQLPackage.RESULT_CLAUSE__RESULT_SPECS:
        return resultSpecs != null && !resultSpecs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ResultClauseImpl
