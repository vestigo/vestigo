/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getVariablesClause <em>Variables Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getParametersClause <em>Parameters Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getImportClause <em>Import Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery()
 * @model
 * @generated
 */
public interface Subquery extends Expression
{
  /**
   * Returns the value of the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Clause</em>' containment reference.
   * @see #setSelectClause(SubquerySelectClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery_SelectClause()
   * @model containment="true"
   * @generated
   */
  SubquerySelectClause getSelectClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getSelectClause <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Clause</em>' containment reference.
   * @see #getSelectClause()
   * @generated
   */
  void setSelectClause(SubquerySelectClause value);

  /**
   * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Clause</em>' containment reference.
   * @see #setFromClause(SubqueryFromClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery_FromClause()
   * @model containment="true"
   * @generated
   */
  SubqueryFromClause getFromClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(SubqueryFromClause value);

  /**
   * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Clause</em>' containment reference.
   * @see #setWhereClause(WhereClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getWhereClause <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Clause</em>' containment reference.
   * @see #getWhereClause()
   * @generated
   */
  void setWhereClause(WhereClause value);

  /**
   * Returns the value of the '<em><b>Variables Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables Clause</em>' containment reference.
   * @see #setVariablesClause(VariablesClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery_VariablesClause()
   * @model containment="true"
   * @generated
   */
  VariablesClause getVariablesClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getVariablesClause <em>Variables Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables Clause</em>' containment reference.
   * @see #getVariablesClause()
   * @generated
   */
  void setVariablesClause(VariablesClause value);

  /**
   * Returns the value of the '<em><b>Parameters Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters Clause</em>' containment reference.
   * @see #setParametersClause(ParametersClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery_ParametersClause()
   * @model containment="true"
   * @generated
   */
  ParametersClause getParametersClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getParametersClause <em>Parameters Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters Clause</em>' containment reference.
   * @see #getParametersClause()
   * @generated
   */
  void setParametersClause(ParametersClause value);

  /**
   * Returns the value of the '<em><b>Import Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Clause</em>' containment reference.
   * @see #setImportClause(ImportClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSubquery_ImportClause()
   * @model containment="true"
   * @generated
   */
  ImportClause getImportClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Subquery#getImportClause <em>Import Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Clause</em>' containment reference.
   * @see #getImportClause()
   * @generated
   */
  void setImportClause(ImportClause value);

} // Subquery
