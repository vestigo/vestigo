/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery Result Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryResultClause#isIsDistinct <em>Is Distinct</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryResultClause#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryResultClause()
 * @model
 * @generated
 */
public interface SubqueryResultClause extends EObject
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
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryResultClause_IsDistinct()
   * @model
   * @generated
   */
  boolean isIsDistinct();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryResultClause#isIsDistinct <em>Is Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Distinct</em>' attribute.
   * @see #isIsDistinct()
   * @generated
   */
  void setIsDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>Result Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Expression</em>' containment reference.
   * @see #setResultExpression(Expression)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryResultClause_ResultExpression()
   * @model containment="true"
   * @generated
   */
  Expression getResultExpression();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryResultClause#getResultExpression <em>Result Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Expression</em>' containment reference.
   * @see #getResultExpression()
   * @generated
   */
  void setResultExpression(Expression value);

} // SubqueryResultClause
