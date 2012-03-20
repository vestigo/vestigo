/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.GroupClause#getGrouping <em>Grouping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getGroupClause()
 * @model
 * @generated
 */
public interface GroupClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Grouping</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.jjqb.xtext.jpql.jPQL.GroupItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grouping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grouping</em>' containment reference list.
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getGroupClause_Grouping()
   * @model containment="true"
   * @generated
   */
  EList<GroupItem> getGrouping();

} // GroupClause
