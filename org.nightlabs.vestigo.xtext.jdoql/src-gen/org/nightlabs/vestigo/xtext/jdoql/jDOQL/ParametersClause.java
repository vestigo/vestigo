/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.ParametersClause#getParameterDeclarations <em>Parameter Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getParametersClause()
 * @model
 * @generated
 */
public interface ParametersClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.ParameterDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Declarations</em>' containment reference list.
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getParametersClause_ParameterDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<ParameterDeclaration> getParameterDeclarations();

} // ParametersClause
