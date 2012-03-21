/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single String JDOQL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getVariablesClause <em>Variables Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getParametersClause <em>Parameters Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getImportClause <em>Import Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getGroupByClause <em>Group By Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getOrderByClause <em>Order By Clause</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getRangeClause <em>Range Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL()
 * @model
 * @generated
 */
public interface SingleStringJDOQL extends EObject
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
   * @see #setSelectClause(SelectClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_SelectClause()
   * @model containment="true"
   * @generated
   */
  SelectClause getSelectClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getSelectClause <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Clause</em>' containment reference.
   * @see #getSelectClause()
   * @generated
   */
  void setSelectClause(SelectClause value);

  /**
   * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Clause</em>' containment reference.
   * @see #setFromClause(FromClause)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_FromClause()
   * @model containment="true"
   * @generated
   */
  FromClause getFromClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(FromClause value);

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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getWhereClause <em>Where Clause</em>}' containment reference.
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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_VariablesClause()
   * @model containment="true"
   * @generated
   */
  VariablesClause getVariablesClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getVariablesClause <em>Variables Clause</em>}' containment reference.
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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_ParametersClause()
   * @model containment="true"
   * @generated
   */
  ParametersClause getParametersClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getParametersClause <em>Parameters Clause</em>}' containment reference.
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
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_ImportClause()
   * @model containment="true"
   * @generated
   */
  ImportClause getImportClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getImportClause <em>Import Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Clause</em>' containment reference.
   * @see #getImportClause()
   * @generated
   */
  void setImportClause(ImportClause value);

  /**
   * Returns the value of the '<em><b>Group By Clause</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group By Clause</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group By Clause</em>' attribute.
   * @see #setGroupByClause(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_GroupByClause()
   * @model
   * @generated
   */
  String getGroupByClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getGroupByClause <em>Group By Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group By Clause</em>' attribute.
   * @see #getGroupByClause()
   * @generated
   */
  void setGroupByClause(String value);

  /**
   * Returns the value of the '<em><b>Order By Clause</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By Clause</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By Clause</em>' attribute.
   * @see #setOrderByClause(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_OrderByClause()
   * @model
   * @generated
   */
  String getOrderByClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getOrderByClause <em>Order By Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order By Clause</em>' attribute.
   * @see #getOrderByClause()
   * @generated
   */
  void setOrderByClause(String value);

  /**
   * Returns the value of the '<em><b>Range Clause</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Clause</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Clause</em>' attribute.
   * @see #setRangeClause(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getSingleStringJDOQL_RangeClause()
   * @model
   * @generated
   */
  String getRangeClause();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getRangeClause <em>Range Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Clause</em>' attribute.
   * @see #getRangeClause()
   * @generated
   */
  void setRangeClause(String value);

} // SingleStringJDOQL
