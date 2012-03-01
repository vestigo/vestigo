/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getResultClause <em>Result Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getIntoClause <em>Into Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject
{
  /**
   * Returns the value of the '<em><b>Result Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Clause</em>' containment reference.
   * @see #setResultClause(ResultClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSelect_ResultClause()
   * @model containment="true"
   * @generated
   */
  ResultClause getResultClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getResultClause <em>Result Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Clause</em>' containment reference.
   * @see #getResultClause()
   * @generated
   */
  void setResultClause(ResultClause value);

  /**
   * Returns the value of the '<em><b>Into Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Into Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Into Clause</em>' containment reference.
   * @see #setIntoClause(IntoClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSelect_IntoClause()
   * @model containment="true"
   * @generated
   */
  IntoClause getIntoClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getIntoClause <em>Into Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Into Clause</em>' containment reference.
   * @see #getIntoClause()
   * @generated
   */
  void setIntoClause(IntoClause value);

} // Select
