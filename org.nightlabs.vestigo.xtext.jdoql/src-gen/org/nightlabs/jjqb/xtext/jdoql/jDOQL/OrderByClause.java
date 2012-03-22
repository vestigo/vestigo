/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByClause#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getOrderByClause()
 * @model
 * @generated
 */
public interface OrderByClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Ordering</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderBySpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordering</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordering</em>' containment reference list.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getOrderByClause_Ordering()
   * @model containment="true"
   * @generated
   */
  EList<OrderBySpec> getOrdering();

} // OrderByClause
