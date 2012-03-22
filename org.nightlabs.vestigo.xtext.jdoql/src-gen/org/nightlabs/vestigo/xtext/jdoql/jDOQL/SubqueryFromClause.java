/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery From Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#getFieldAccessExpression <em>Field Access Expression</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#getCandidateClassName <em>Candidate Class Name</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryFromClause()
 * @model
 * @generated
 */
public interface SubqueryFromClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Field Access Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Access Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Access Expression</em>' containment reference.
   * @see #setFieldAccessExpression(Expression)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryFromClause_FieldAccessExpression()
   * @model containment="true"
   * @generated
   */
  Expression getFieldAccessExpression();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#getFieldAccessExpression <em>Field Access Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Access Expression</em>' containment reference.
   * @see #getFieldAccessExpression()
   * @generated
   */
  void setFieldAccessExpression(Expression value);

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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryFromClause_CandidateClassName()
   * @model
   * @generated
   */
  String getCandidateClassName();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#getCandidateClassName <em>Candidate Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Candidate Class Name</em>' attribute.
   * @see #getCandidateClassName()
   * @generated
   */
  void setCandidateClassName(String value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' containment reference.
   * @see #setAlias(Alias)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryFromClause_Alias()
   * @model containment="true"
   * @generated
   */
  Alias getAlias();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#getAlias <em>Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' containment reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(Alias value);

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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubqueryFromClause_IsExcludeSubclasses()
   * @model
   * @generated
   */
  boolean isIsExcludeSubclasses();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SubqueryFromClause#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Exclude Subclasses</em>' attribute.
   * @see #isIsExcludeSubclasses()
   * @generated
   */
  void setIsExcludeSubclasses(boolean value);

} // SubqueryFromClause
