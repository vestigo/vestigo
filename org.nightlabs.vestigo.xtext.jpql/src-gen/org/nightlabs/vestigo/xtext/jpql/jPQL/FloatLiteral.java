/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFloatLiteral()
 * @model
 * @generated
 */
public interface FloatLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(org.nightlabs.vestigo.xtext.jpql.jPQL.Float)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFloatLiteral_Value()
   * @model containment="true"
   * @generated
   */
  org.nightlabs.vestigo.xtext.jpql.jPQL.Float getValue();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(org.nightlabs.vestigo.xtext.jpql.jPQL.Float value);

} // FloatLiteral
