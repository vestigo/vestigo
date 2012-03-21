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
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variables Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariablesClauseImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariablesClauseImpl extends MinimalEObjectImpl.Container implements VariablesClause
{
  /**
   * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarations()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> variableDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariablesClauseImpl()
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
    return JDOQLPackage.Literals.VARIABLES_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getVariableDeclarations()
  {
    if (variableDeclarations == null)
    {
      variableDeclarations = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, JDOQLPackage.VARIABLES_CLAUSE__VARIABLE_DECLARATIONS);
    }
    return variableDeclarations;
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
      case JDOQLPackage.VARIABLES_CLAUSE__VARIABLE_DECLARATIONS:
        return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
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
      case JDOQLPackage.VARIABLES_CLAUSE__VARIABLE_DECLARATIONS:
        return getVariableDeclarations();
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
      case JDOQLPackage.VARIABLES_CLAUSE__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
        getVariableDeclarations().addAll((Collection<? extends VariableDeclaration>)newValue);
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
      case JDOQLPackage.VARIABLES_CLAUSE__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
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
      case JDOQLPackage.VARIABLES_CLAUSE__VARIABLE_DECLARATIONS:
        return variableDeclarations != null && !variableDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariablesClauseImpl
