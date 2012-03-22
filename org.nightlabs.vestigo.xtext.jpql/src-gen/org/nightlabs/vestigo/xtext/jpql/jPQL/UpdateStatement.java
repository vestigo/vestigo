/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getUpdateClause <em>Update Clause</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getSetClause <em>Set Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getUpdateStatement()
 * @model
 * @generated
 */
public interface UpdateStatement extends JPQLQuery
{
  /**
   * Returns the value of the '<em><b>Update Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Clause</em>' containment reference.
   * @see #setUpdateClause(UpdateClause)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getUpdateStatement_UpdateClause()
   * @model containment="true"
   * @generated
   */
  UpdateClause getUpdateClause();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getUpdateClause <em>Update Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Update Clause</em>' containment reference.
   * @see #getUpdateClause()
   * @generated
   */
  void setUpdateClause(UpdateClause value);

  /**
   * Returns the value of the '<em><b>Set Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Clause</em>' containment reference.
   * @see #setSetClause(SetClause)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getUpdateStatement_SetClause()
   * @model containment="true"
   * @generated
   */
  SetClause getSetClause();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getSetClause <em>Set Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Clause</em>' containment reference.
   * @see #getSetClause()
   * @generated
   */
  void setSetClause(SetClause value);

} // UpdateStatement
