/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause#getResultClause <em>Result Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause#getIntoClause <em>Into Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSelectClause()
 * @model
 * @generated
 */
public interface SelectClause extends SubquerySelectClause
{
  /**
   * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Unique</em>' attribute.
   * @see #setIsUnique(boolean)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSelectClause_IsUnique()
   * @model
   * @generated
   */
  boolean isIsUnique();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause#isIsUnique <em>Is Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Unique</em>' attribute.
   * @see #isIsUnique()
   * @generated
   */
  void setIsUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Result Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Clause</em>' containment reference.
   * @see #setResultClause(EObject)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSelectClause_ResultClause()
   * @model containment="true"
   * @generated
   */
  EObject getResultClause();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause#getResultClause <em>Result Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Clause</em>' containment reference.
   * @see #getResultClause()
   * @generated
   */
  void setResultClause(EObject value);

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
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getSelectClause_IntoClause()
   * @model containment="true"
   * @generated
   */
  IntoClause getIntoClause();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause#getIntoClause <em>Into Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Into Clause</em>' containment reference.
   * @see #getIntoClause()
   * @generated
   */
  void setIntoClause(IntoClause value);

} // SelectClause
