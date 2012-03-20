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
 * A representation of the model object '<em><b>Query Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.QueryModule#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jpql.jPQL.QueryModule#getDefaultQuery <em>Default Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getQueryModule()
 * @model
 * @generated
 */
public interface QueryModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.jjqb.xtext.jpql.jPQL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getQueryModule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Default Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Query</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Query</em>' containment reference.
   * @see #setDefaultQuery(JPQLQuery)
   * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage#getQueryModule_DefaultQuery()
   * @model containment="true"
   * @generated
   */
  JPQLQuery getDefaultQuery();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jpql.jPQL.QueryModule#getDefaultQuery <em>Default Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Query</em>' containment reference.
   * @see #getDefaultQuery()
   * @generated
   */
  void setDefaultQuery(JPQLQuery value);

} // QueryModule
