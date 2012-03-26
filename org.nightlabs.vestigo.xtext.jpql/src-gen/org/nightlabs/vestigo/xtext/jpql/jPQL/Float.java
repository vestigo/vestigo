/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getFractionValue <em>Fraction Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFloat()
 * @model
 * @generated
 */
public interface Float extends EObject
{
  /**
   * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer Value</em>' attribute.
   * @see #setIntegerValue(int)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFloat_IntegerValue()
   * @model
   * @generated
   */
  int getIntegerValue();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getIntegerValue <em>Integer Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer Value</em>' attribute.
   * @see #getIntegerValue()
   * @generated
   */
  void setIntegerValue(int value);

  /**
   * Returns the value of the '<em><b>Fraction Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fraction Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fraction Value</em>' attribute.
   * @see #setFractionValue(int)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFloat_FractionValue()
   * @model
   * @generated
   */
  int getFractionValue();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getFractionValue <em>Fraction Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fraction Value</em>' attribute.
   * @see #getFractionValue()
   * @generated
   */
  void setFractionValue(int value);

} // Float
