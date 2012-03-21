/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperatorExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperatorExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperatorExpression#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getComparisonOperatorExpression()
 * @model
 * @generated
 */
public interface ComparisonOperatorExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Variable)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getComparisonOperatorExpression_Lhs()
   * @model containment="true"
   * @generated
   */
  Variable getLhs();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperatorExpression#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Variable value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperator
   * @see #setOperator(ComparisonOperator)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getComparisonOperatorExpression_Operator()
   * @model
   * @generated
   */
  ComparisonOperator getOperator();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperatorExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(ComparisonOperator value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(ExpressionTerm)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getComparisonOperatorExpression_Rhs()
   * @model containment="true"
   * @generated
   */
  ExpressionTerm getRhs();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.ComparisonOperatorExpression#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(ExpressionTerm value);

} // ComparisonOperatorExpression
