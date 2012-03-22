/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.impl;

import org.eclipse.emf.ecore.EClass;

import org.nightlabs.jjqb.xtext.jpql.jPQL.CountAggregate;
import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CountAggregateImpl extends SelectAggregateExpressionImpl implements CountAggregate
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountAggregateImpl()
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
    return JPQLPackage.Literals.COUNT_AGGREGATE;
  }

} //CountAggregateImpl
