/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getName <em>Name</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getFields <em>Fields</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getField <em>Field</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getStartPos <em>Start Pos</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getLength <em>Length</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimSpec <em>Trim Spec</em>}</li>
 *   <li>{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimChar <em>Trim Char</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression()
 * @model
 * @generated
 */
public interface FunctionExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getFields();

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(Expression)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_Field()
   * @model containment="true"
   * @generated
   */
  Expression getField();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(Expression value);

  /**
   * Returns the value of the '<em><b>Start Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Pos</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Pos</em>' containment reference.
   * @see #setStartPos(Expression)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_StartPos()
   * @model containment="true"
   * @generated
   */
  Expression getStartPos();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getStartPos <em>Start Pos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Pos</em>' containment reference.
   * @see #getStartPos()
   * @generated
   */
  void setStartPos(Expression value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(Expression)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_Length()
   * @model containment="true"
   * @generated
   */
  Expression getLength();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(Expression value);

  /**
   * Returns the value of the '<em><b>Trim Spec</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trim Spec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trim Spec</em>' attribute.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec
   * @see #setTrimSpec(TrimSpec)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_TrimSpec()
   * @model
   * @generated
   */
  TrimSpec getTrimSpec();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimSpec <em>Trim Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trim Spec</em>' attribute.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec
   * @see #getTrimSpec()
   * @generated
   */
  void setTrimSpec(TrimSpec value);

  /**
   * Returns the value of the '<em><b>Trim Char</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trim Char</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trim Char</em>' containment reference.
   * @see #setTrimChar(Expression)
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#getFunctionExpression_TrimChar()
   * @model containment="true"
   * @generated
   */
  Expression getTrimChar();

  /**
   * Sets the value of the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimChar <em>Trim Char</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trim Char</em>' containment reference.
   * @see #getTrimChar()
   * @generated
   */
  void setTrimChar(Expression value);

} // FunctionExpression
