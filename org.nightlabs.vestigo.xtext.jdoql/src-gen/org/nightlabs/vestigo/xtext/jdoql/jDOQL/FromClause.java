/**
 */
package org.nightlabs.vestigo.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.FromClause#getCandidateClassName <em>Candidate Class Name</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.FromClause#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getFromClause()
 * @model
 * @generated
 */
public interface FromClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Candidate Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Candidate Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Candidate Class Name</em>' attribute.
   * @see #setCandidateClassName(String)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getFromClause_CandidateClassName()
   * @model
   * @generated
   */
  String getCandidateClassName();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.FromClause#getCandidateClassName <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Candidate Class Name</em>' attribute.
   * @see #getCandidateClassName()
   * @generated
   */
  void setCandidateClassName(String value);

  /**
   * Returns the value of the '<em><b>Is Exclude Subclasses</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Exclude Subclasses</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Exclude Subclasses</em>' attribute.
   * @see #setIsExcludeSubclasses(boolean)
   * @see org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage#getFromClause_IsExcludeSubclasses()
   * @model
   * @generated
   */
  boolean isIsExcludeSubclasses();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jdoql.jDOQL.FromClause#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Exclude Subclasses</em>' attribute.
   * @see #isIsExcludeSubclasses()
   * @generated
   */
  void setIsExcludeSubclasses(boolean value);

} // FromClause
