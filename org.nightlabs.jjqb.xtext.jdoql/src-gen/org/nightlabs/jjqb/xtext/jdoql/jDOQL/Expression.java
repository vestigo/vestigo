/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getResultNaming <em>Result Naming</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getUnaryOperator <em>Unary Operator</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getThis <em>This</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getId <em>Id</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends ResultSpec, OrderBySpec
{
  /**
   * Returns the value of the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Naming</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Naming</em>' containment reference.
   * @see #setResultNaming(ResultNaming)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_ResultNaming()
   * @model containment="true"
   * @generated
   */
  ResultNaming getResultNaming();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getResultNaming <em>Result Naming</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Naming</em>' containment reference.
   * @see #getResultNaming()
   * @generated
   */
  void setResultNaming(ResultNaming value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection
   * @see #setDirection(OrderByDirection)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_Direction()
   * @model
   * @generated
   */
  OrderByDirection getDirection();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(OrderByDirection value);

  /**
   * Returns the value of the '<em><b>Unary Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator
   * @see #setUnaryOperator(UnaryOperator)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_UnaryOperator()
   * @model
   * @generated
   */
  UnaryOperator getUnaryOperator();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getUnaryOperator <em>Unary Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Operator</em>' attribute.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator
   * @see #getUnaryOperator()
   * @generated
   */
  void setUnaryOperator(UnaryOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

  /**
   * Returns the value of the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>This</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>This</em>' attribute.
   * @see #setThis(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_This()
   * @model
   * @generated
   */
  String getThis();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getThis <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>This</em>' attribute.
   * @see #getThis()
   * @generated
   */
  void setThis(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Name</em>' attribute.
   * @see #setParameterName(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_ParameterName()
   * @model
   * @generated
   */
  String getParameterName();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getParameterName <em>Parameter Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Name</em>' attribute.
   * @see #getParameterName()
   * @generated
   */
  void setParameterName(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

} // Expression
