/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause#getFromClause <em>From Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getDeleteClause()
 * @model
 * @generated
 */
public interface DeleteClause extends EObject
{
  /**
   * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Clause</em>' containment reference.
   * @see #setFromClause(FromClause)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getDeleteClause_FromClause()
   * @model containment="true"
   * @generated
   */
  FromClause getFromClause();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(FromClause value);

} // DeleteClause
