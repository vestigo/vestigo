/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getMultiplicationExpression()
 * @model
 * @generated
 */
public interface MultiplicationExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator
   * @see #setOperator(MultiplicationOperator)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getMultiplicationExpression_Operator()
   * @model
   * @generated
   */
  MultiplicationOperator getOperator();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(MultiplicationOperator value);

} // MultiplicationExpression
