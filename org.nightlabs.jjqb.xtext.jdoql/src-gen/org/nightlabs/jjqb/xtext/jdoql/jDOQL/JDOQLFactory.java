/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage
 * @generated
 */
public interface JDOQLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JDOQLFactory eINSTANCE = org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Single String JDOQL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single String JDOQL</em>'.
   * @generated
   */
  SingleStringJDOQL createSingleStringJDOQL();

  /**
   * Returns a new object of class '<em>Select Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Clause</em>'.
   * @generated
   */
  SelectClause createSelectClause();

  /**
   * Returns a new object of class '<em>Result Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Clause</em>'.
   * @generated
   */
  ResultClause createResultClause();

  /**
   * Returns a new object of class '<em>Into Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Into Clause</em>'.
   * @generated
   */
  IntoClause createIntoClause();

  /**
   * Returns a new object of class '<em>Result Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Spec</em>'.
   * @generated
   */
  ResultSpec createResultSpec();

  /**
   * Returns a new object of class '<em>Result Naming</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Naming</em>'.
   * @generated
   */
  ResultNaming createResultNaming();

  /**
   * Returns a new object of class '<em>From Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Clause</em>'.
   * @generated
   */
  FromClause createFromClause();

  /**
   * Returns a new object of class '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Clause</em>'.
   * @generated
   */
  WhereClause createWhereClause();

  /**
   * Returns a new object of class '<em>Variables Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variables Clause</em>'.
   * @generated
   */
  VariablesClause createVariablesClause();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Parameters Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameters Clause</em>'.
   * @generated
   */
  ParametersClause createParametersClause();

  /**
   * Returns a new object of class '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Declaration</em>'.
   * @generated
   */
  ParameterDeclaration createParameterDeclaration();

  /**
   * Returns a new object of class '<em>Declared Parameter Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declared Parameter Name</em>'.
   * @generated
   */
  DeclaredParameterName createDeclaredParameterName();

  /**
   * Returns a new object of class '<em>Import Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Clause</em>'.
   * @generated
   */
  ImportClause createImportClause();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Or Expression</em>'.
   * @generated
   */
  ConditionalOrExpression createConditionalOrExpression();

  /**
   * Returns a new object of class '<em>Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional And Expression</em>'.
   * @generated
   */
  ConditionalAndExpression createConditionalAndExpression();

  /**
   * Returns a new object of class '<em>Simple Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Or Expression</em>'.
   * @generated
   */
  SimpleOrExpression createSimpleOrExpression();

  /**
   * Returns a new object of class '<em>Simple And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple And Expression</em>'.
   * @generated
   */
  SimpleAndExpression createSimpleAndExpression();

  /**
   * Returns a new object of class '<em>Comparison Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Operator Expression</em>'.
   * @generated
   */
  ComparisonOperatorExpression createComparisonOperatorExpression();

  /**
   * Returns a new object of class '<em>Addition Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition Expression</em>'.
   * @generated
   */
  AdditionExpression createAdditionExpression();

  /**
   * Returns a new object of class '<em>Multiplication Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication Expression</em>'.
   * @generated
   */
  MultiplicationExpression createMultiplicationExpression();

  /**
   * Returns a new object of class '<em>Field Access Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Access Expression</em>'.
   * @generated
   */
  FieldAccessExpression createFieldAccessExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JDOQLPackage getJDOQLPackage();

} //JDOQLFactory
