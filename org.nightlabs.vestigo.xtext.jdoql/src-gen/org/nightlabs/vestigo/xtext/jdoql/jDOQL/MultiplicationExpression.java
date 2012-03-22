/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getMultiplicationExpression()
 * @model
 * @generated
 */
public interface MultiplicationExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getMultiplicationExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationOperator
   * @see #setOperator(MultiplicationOperator)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getMultiplicationExpression_Operator()
   * @model
   * @generated
   */
  MultiplicationOperator getOperator();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(MultiplicationOperator value);

} // MultiplicationExpression
