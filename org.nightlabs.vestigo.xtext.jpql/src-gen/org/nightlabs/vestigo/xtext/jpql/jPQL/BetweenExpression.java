/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Between Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#isIsNot <em>Is Not</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#getMin <em>Min</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getBetweenExpression()
 * @model
 * @generated
 */
public interface BetweenExpression extends Expression
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
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getBetweenExpression_Left()
   * @model containment="true"
   * @generated
   */
  Variable getLeft();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#getLeft <em>Left</em>}' containment reference.
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
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getBetweenExpression_IsNot()
   * @model
   * @generated
   */
  boolean isIsNot();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#isIsNot <em>Is Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Not</em>' attribute.
   * @see #isIsNot()
   * @generated
   */
  void setIsNot(boolean value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(Value)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getBetweenExpression_Min()
   * @model containment="true"
   * @generated
   */
  Value getMin();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(Value value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(Value)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getBetweenExpression_Max()
   * @model containment="true"
   * @generated
   */
  Value getMax();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(Value value);

} // BetweenExpression
