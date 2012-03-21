/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getDeclaredParameterName <em>Declared Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getParameterDeclaration()
 * @model
 * @generated
 */
public interface ParameterDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getParameterDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Declared Parameter Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Parameter Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Parameter Name</em>' containment reference.
   * @see #setDeclaredParameterName(DeclaredParameterName)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getParameterDeclaration_DeclaredParameterName()
   * @model containment="true"
   * @generated
   */
  DeclaredParameterName getDeclaredParameterName();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getDeclaredParameterName <em>Declared Parameter Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Parameter Name</em>' containment reference.
   * @see #getDeclaredParameterName()
   * @generated
   */
  void setDeclaredParameterName(DeclaredParameterName value);

} // ParameterDeclaration
