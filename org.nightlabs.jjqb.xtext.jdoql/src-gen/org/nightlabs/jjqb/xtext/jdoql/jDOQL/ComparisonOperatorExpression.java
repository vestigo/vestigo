/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getComparisonOperatorExpression()
 * @model
 * @generated
 */
public interface ComparisonOperatorExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator
   * @see #setOperator(ComparisonOperator)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getComparisonOperatorExpression_Operator()
   * @model
   * @generated
   */
  ComparisonOperator getOperator();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(ComparisonOperator value);

} // ComparisonOperatorExpression
