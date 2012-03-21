/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getStart <em>Start</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getRangeClause()
 * @model
 * @generated
 */
public interface RangeClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Expression)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getRangeClause_Start()
   * @model containment="true"
   * @generated
   */
  Expression getStart();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Expression value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(Expression)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getRangeClause_End()
   * @model containment="true"
   * @generated
   */
  Expression getEnd();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Expression value);

} // RangeClause
