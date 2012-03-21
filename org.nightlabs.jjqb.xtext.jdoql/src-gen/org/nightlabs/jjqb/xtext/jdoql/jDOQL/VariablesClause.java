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
 * A representation of the model object '<em><b>Variables Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getVariablesClause()
 * @model
 * @generated
 */
public interface VariablesClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declarations</em>' containment reference list.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getVariablesClause_VariableDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariableDeclarations();

} // VariablesClause
