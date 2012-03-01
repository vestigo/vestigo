/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause#getExcludeSubclasses <em>Exclude Subclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExcludeClause()
 * @model
 * @generated
 */
public interface ExcludeClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Exclude Subclasses</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Subclasses</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Subclasses</em>' attribute.
   * @see #setExcludeSubclasses(String)
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#getExcludeClause_ExcludeSubclasses()
   * @model
   * @generated
   */
  String getExcludeSubclasses();

  /**
   * Sets the value of the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause#getExcludeSubclasses <em>Exclude Subclasses</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Subclasses</em>' attribute.
   * @see #getExcludeSubclasses()
   * @generated
   */
  void setExcludeSubclasses(String value);

} // ExcludeClause
