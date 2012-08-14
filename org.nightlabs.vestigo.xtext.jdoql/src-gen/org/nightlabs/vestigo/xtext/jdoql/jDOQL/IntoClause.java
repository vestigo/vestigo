/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Into Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.IntoClause#getResultClassName <em>Result Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getIntoClause()
 * @model
 * @generated
 */
public interface IntoClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Result Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Class Name</em>' attribute.
   * @see #setResultClassName(String)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getIntoClause_ResultClassName()
   * @model
   * @generated
   */
  String getResultClassName();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.IntoClause#getResultClassName <em>Result Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Class Name</em>' attribute.
   * @see #getResultClassName()
   * @generated
   */
  void setResultClassName(String value);

} // IntoClause
