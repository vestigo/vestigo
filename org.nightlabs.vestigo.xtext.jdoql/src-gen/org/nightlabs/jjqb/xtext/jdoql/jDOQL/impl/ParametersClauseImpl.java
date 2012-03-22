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
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameters Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParametersClauseImpl#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParametersClauseImpl extends MinimalEObjectImpl.Container implements ParametersClause
{
  /**
   * The cached value of the '{@link #getParameterDeclarations() <em>Parameter Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ParameterDeclaration> parameterDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParametersClauseImpl()
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
    return JDOQLPackage.Literals.PARAMETERS_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterDeclaration> getParameterDeclarations()
  {
    if (parameterDeclarations == null)
    {
      parameterDeclarations = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, JDOQLPackage.PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS);
    }
    return parameterDeclarations;
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
      case JDOQLPackage.PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS:
        return ((InternalEList<?>)getParameterDeclarations()).basicRemove(otherEnd, msgs);
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
      case JDOQLPackage.PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS:
        return getParameterDeclarations();
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
      case JDOQLPackage.PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS:
        getParameterDeclarations().clear();
        getParameterDeclarations().addAll((Collection<? extends ParameterDeclaration>)newValue);
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
      case JDOQLPackage.PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS:
        getParameterDeclarations().clear();
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
      case JDOQLPackage.PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS:
        return parameterDeclarations != null && !parameterDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParametersClauseImpl
