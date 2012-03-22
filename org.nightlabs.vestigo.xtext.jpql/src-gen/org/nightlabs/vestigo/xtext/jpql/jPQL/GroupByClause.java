/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getHavingClause <em>Having Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getGroupByClause()
 * @model
 * @generated
 */
public interface GroupByClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Grouping</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grouping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grouping</em>' containment reference list.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getGroupByClause_Grouping()
   * @model containment="true"
   * @generated
   */
  EList<AliasAttributeExpression> getGrouping();

  /**
   * Returns the value of the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Having Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having Clause</em>' containment reference.
   * @see #setHavingClause(HavingClause)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getGroupByClause_HavingClause()
   * @model containment="true"
   * @generated
   */
  HavingClause getHavingClause();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getHavingClause <em>Having Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having Clause</em>' containment reference.
   * @see #getHavingClause()
   * @generated
   */
  void setHavingClause(HavingClause value);

} // GroupByClause
