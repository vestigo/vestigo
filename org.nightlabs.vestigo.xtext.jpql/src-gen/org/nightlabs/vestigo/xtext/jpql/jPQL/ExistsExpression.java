/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ExistsExpression#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ExistsExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getExistsExpression()
 * @model
 * @generated
 */
public interface ExistsExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Not</em>' attribute.
   * @see #setIsNot(boolean)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getExistsExpression_IsNot()
   * @model
   * @generated
   */
  boolean isIsNot();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ExistsExpression#isIsNot <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Not</em>' attribute.
   * @see #isIsNot()
   * @generated
   */
  void setIsNot(boolean value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SelectStatement)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getExistsExpression_Right()
   * @model containment="true"
   * @generated
   */
  SelectStatement getRight();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ExistsExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SelectStatement value);

} // ExistsExpression
