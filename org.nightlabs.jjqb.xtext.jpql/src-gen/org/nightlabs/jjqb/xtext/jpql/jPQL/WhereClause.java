/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.WhereClause#getWhereEntry <em>Where Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Where Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Entry</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Entry</em>' containment reference.
   * @see #setWhereEntry(Expression)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getWhereClause_WhereEntry()
   * @model containment="true"
   * @generated
   */
  Expression getWhereEntry();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.WhereClause#getWhereEntry <em>Where Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Entry</em>' containment reference.
   * @see #getWhereEntry()
   * @generated
   */
  void setWhereEntry(Expression value);

} // WhereClause
