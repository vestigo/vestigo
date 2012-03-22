/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getCollectionExpression()
 * @model
 * @generated
 */
public interface CollectionExpression extends Expression
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
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getCollectionExpression_Left()
   * @model containment="true"
   * @generated
   */
  Variable getLeft();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression#getLeft <em>Left</em>}' containment reference.
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
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getCollectionExpression_IsNot()
   * @model
   * @generated
   */
  boolean isIsNot();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression#isIsNot <em>Is Not</em>}' attribute.
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
   * @see #setRight(AliasAttributeExpression)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getCollectionExpression_Right()
   * @model containment="true"
   * @generated
   */
  AliasAttributeExpression getRight();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AliasAttributeExpression value);

} // CollectionExpression
