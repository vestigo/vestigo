/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.AnyExpression#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getAnyExpression()
 * @model
 * @generated
 */
public interface AnyExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' containment reference.
   * @see #setQuery(SelectStatement)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getAnyExpression_Query()
   * @model containment="true"
   * @generated
   */
  SelectStatement getQuery();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.AnyExpression#getQuery <em>Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' containment reference.
   * @see #getQuery()
   * @generated
   */
  void setQuery(SelectStatement value);

} // AnyExpression