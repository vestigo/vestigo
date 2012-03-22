/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Like Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getLikeExpression()
 * @model
 * @generated
 */
public interface LikeExpression extends Expression
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
   * @see #setLeft(Variable)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getLikeExpression_Left()
   * @model containment="true"
   * @generated
   */
  Variable getLeft();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Variable value);

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
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getLikeExpression_IsNot()
   * @model
   * @generated
   */
  boolean isIsNot();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression#isIsNot <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Not</em>' attribute.
   * @see #isIsNot()
   * @generated
   */
  void setIsNot(boolean value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(String)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getLikeExpression_Right()
   * @model
   * @generated
   */
  String getRight();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(String value);

} // LikeExpression
