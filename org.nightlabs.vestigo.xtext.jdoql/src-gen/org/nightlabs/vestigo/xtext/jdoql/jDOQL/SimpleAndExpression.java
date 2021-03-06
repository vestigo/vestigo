/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SimpleAndExpression#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSimpleAndExpression()
 * @model
 * @generated
 */
public interface SimpleAndExpression extends Expression
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
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSimpleAndExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SimpleAndExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

} // SimpleAndExpression
