/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#getResultSpecs <em>Result Specs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getResultClause()
 * @model
 * @generated
 */
public interface ResultClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Distinct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Distinct</em>' attribute.
   * @see #setIsDistinct(boolean)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getResultClause_IsDistinct()
   * @model
   * @generated
   */
  boolean isIsDistinct();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#isIsDistinct <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Distinct</em>' attribute.
   * @see #isIsDistinct()
   * @generated
   */
  void setIsDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>Result Specs</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Specs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Specs</em>' containment reference list.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getResultClause_ResultSpecs()
   * @model containment="true"
   * @generated
   */
  EList<ResultSpec> getResultSpecs();

} // ResultClause
