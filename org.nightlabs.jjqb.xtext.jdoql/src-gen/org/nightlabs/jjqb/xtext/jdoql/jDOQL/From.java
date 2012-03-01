/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getCandidateClassName <em>Candidate Class Name</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getExcludeClause <em>Exclude Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends EObject
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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getFrom_CandidateClassName()
   * @model
   * @generated
   */
  String getCandidateClassName();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getCandidateClassName <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Candidate Class Name</em>' attribute.
   * @see #getCandidateClassName()
   * @generated
   */
  void setCandidateClassName(String value);

  /**
   * Returns the value of the '<em><b>Exclude Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Clause</em>' containment reference.
   * @see #setExcludeClause(ExcludeClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getFrom_ExcludeClause()
   * @model containment="true"
   * @generated
   */
  ExcludeClause getExcludeClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getExcludeClause <em>Exclude Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Clause</em>' containment reference.
   * @see #getExcludeClause()
   * @generated
   */
  void setExcludeClause(ExcludeClause value);

} // From
