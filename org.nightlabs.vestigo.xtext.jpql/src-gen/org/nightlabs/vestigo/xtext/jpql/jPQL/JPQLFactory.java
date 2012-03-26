/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage
 * @generated
 */
public interface JPQLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JPQLFactory eINSTANCE = org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  JPQLQuery createJPQLQuery();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>Group By Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group By Clause</em>'.
   * @generated
   */
  GroupByClause createGroupByClause();

  /**
   * Returns a new object of class '<em>Having Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Having Clause</em>'.
   * @generated
   */
  HavingClause createHavingClause();

  /**
   * Returns a new object of class '<em>Order By Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order By Clause</em>'.
   * @generated
   */
  OrderByClause createOrderByClause();

  /**
   * Returns a new object of class '<em>Order By Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order By Spec</em>'.
   * @generated
   */
  OrderBySpec createOrderBySpec();

  /**
   * Returns a new object of class '<em>Update Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Statement</em>'.
   * @generated
   */
  UpdateStatement createUpdateStatement();

  /**
   * Returns a new object of class '<em>Update Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Clause</em>'.
   * @generated
   */
  UpdateClause createUpdateClause();

  /**
   * Returns a new object of class '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Clause</em>'.
   * @generated
   */
  SetClause createSetClause();

  /**
   * Returns a new object of class '<em>Update Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Update Item</em>'.
   * @generated
   */
  UpdateItem createUpdateItem();

  /**
   * Returns a new object of class '<em>Delete Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Statement</em>'.
   * @generated
   */
  DeleteStatement createDeleteStatement();

  /**
   * Returns a new object of class '<em>Delete Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Clause</em>'.
   * @generated
   */
  DeleteClause createDeleteClause();

  /**
   * Returns a new object of class '<em>Select Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Clause</em>'.
   * @generated
   */
  SelectClause createSelectClause();

  /**
   * Returns a new object of class '<em>Select Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Expression</em>'.
   * @generated
   */
  SelectExpression createSelectExpression();

  /**
   * Returns a new object of class '<em>Select Aggregate Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Aggregate Expression</em>'.
   * @generated
   */
  SelectAggregateExpression createSelectAggregateExpression();

  /**
   * Returns a new object of class '<em>Avg Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avg Aggregate</em>'.
   * @generated
   */
  AvgAggregate createAvgAggregate();

  /**
   * Returns a new object of class '<em>Count Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Aggregate</em>'.
   * @generated
   */
  CountAggregate createCountAggregate();

  /**
   * Returns a new object of class '<em>Max Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Aggregate</em>'.
   * @generated
   */
  MaxAggregate createMaxAggregate();

  /**
   * Returns a new object of class '<em>Min Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Aggregate</em>'.
   * @generated
   */
  MinAggregate createMinAggregate();

  /**
   * Returns a new object of class '<em>Sum Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Aggregate</em>'.
   * @generated
   */
  SumAggregate createSumAggregate();

  /**
   * Returns a new object of class '<em>Select Constructor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Constructor Expression</em>'.
   * @generated
   */
  SelectConstructorExpression createSelectConstructorExpression();

  /**
   * Returns a new object of class '<em>From Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Clause</em>'.
   * @generated
   */
  FromClause createFromClause();

  /**
   * Returns a new object of class '<em>From Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Entry</em>'.
   * @generated
   */
  FromEntry createFromEntry();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>From Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Class</em>'.
   * @generated
   */
  FromClass createFromClass();

  /**
   * Returns a new object of class '<em>From Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Collection</em>'.
   * @generated
   */
  FromCollection createFromCollection();

  /**
   * Returns a new object of class '<em>From Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Join</em>'.
   * @generated
   */
  FromJoin createFromJoin();

  /**
   * Returns a new object of class '<em>Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join</em>'.
   * @generated
   */
  Join createJoin();

  /**
   * Returns a new object of class '<em>Left Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Join</em>'.
   * @generated
   */
  LeftJoin createLeftJoin();

  /**
   * Returns a new object of class '<em>Inner Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inner Join</em>'.
   * @generated
   */
  InnerJoin createInnerJoin();

  /**
   * Returns a new object of class '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Clause</em>'.
   * @generated
   */
  WhereClause createWhereClause();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Expression Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Term</em>'.
   * @generated
   */
  ExpressionTerm createExpressionTerm();

  /**
   * Returns a new object of class '<em>Alias Attribute Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alias Attribute Expression</em>'.
   * @generated
   */
  AliasAttributeExpression createAliasAttributeExpression();

  /**
   * Returns a new object of class '<em>Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Expression</em>'.
   * @generated
   */
  ParameterExpression createParameterExpression();

  /**
   * Returns a new object of class '<em>Function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Expression</em>'.
   * @generated
   */
  FunctionExpression createFunctionExpression();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  FloatLiteral createFloatLiteral();

  /**
   * Returns a new object of class '<em>Float</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float</em>'.
   * @generated
   */
  Float createFloat();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JPQLPackage getJPQLPackage();

} //JPQLFactory
