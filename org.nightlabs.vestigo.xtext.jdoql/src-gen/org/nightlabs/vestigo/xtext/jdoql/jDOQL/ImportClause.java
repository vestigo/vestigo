/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.ImportClause#getImportDeclarations <em>Import Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getImportClause()
 * @model
 * @generated
 */
public interface ImportClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Declarations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Declarations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Declarations</em>' attribute list.
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getImportClause_ImportDeclarations()
   * @model unique="false"
   * @generated
   */
  EList<String> getImportDeclarations();

} // ImportClause
