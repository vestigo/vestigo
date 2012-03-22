/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getGroupByClause <em>Group By Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getOrderByClause <em>Order By Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getSelectStatement()
 * @model
 * @generated
 */
public interface SelectStatement extends JPQLQuery, ExpressionTerm
{
  /**
   * Returns the value of the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Clause</em>' containment reference.
   * @see #setSelectClause(SelectClause)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getSelectStatement_SelectClause()
   * @model containment="true"
   * @generated
   */
  SelectClause getSelectClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getSelectClause <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Clause</em>' containment reference.
   * @see #getSelectClause()
   * @generated
   */
  void setSelectClause(SelectClause value);

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
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getSelectStatement_FromClause()
   * @model containment="true"
   * @generated
   */
  FromClause getFromClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(FromClause value);

  /**
   * Returns the value of the '<em><b>Group By Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By Clause</em>' containment reference.
   * @see #setGroupByClause(GroupByClause)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getSelectStatement_GroupByClause()
   * @model containment="true"
   * @generated
   */
  GroupByClause getGroupByClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getGroupByClause <em>Group By Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group By Clause</em>' containment reference.
   * @see #getGroupByClause()
   * @generated
   */
  void setGroupByClause(GroupByClause value);

  /**
   * Returns the value of the '<em><b>Order By Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By Clause</em>' containment reference.
   * @see #setOrderByClause(OrderByClause)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getSelectStatement_OrderByClause()
   * @model containment="true"
   * @generated
   */
  OrderByClause getOrderByClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement#getOrderByClause <em>Order By Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order By Clause</em>' containment reference.
   * @see #getOrderByClause()
   * @generated
   */
  void setOrderByClause(OrderByClause value);

} // SelectStatement
