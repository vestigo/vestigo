/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLFactory
 * @model kind="package"
 * @generated
 */
public interface JPQLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jPQL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nightlabs.org/vestigo/xtext/jdoql/JPQL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jPQL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JPQLPackage eINSTANCE = org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLQueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLQueryImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getJPQLQuery()
   * @generated
   */
  int JPQL_QUERY = 0;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPQL_QUERY__WHERE_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JPQL_QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__WHERE_CLAUSE = JPQL_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__UNARY_OPERATOR = JPQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__RIGHT = JPQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__LEFT = JPQL_QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__IS_NOT = JPQL_QUERY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__ITEMS = JPQL_QUERY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__QUERY = JPQL_QUERY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__MIN = JPQL_QUERY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__MAX = JPQL_QUERY_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__SELECT_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__FROM_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Group By Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__GROUP_BY_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Order By Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__ORDER_BY_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = JPQL_QUERY_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.GroupByClauseImpl <em>Group By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.GroupByClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getGroupByClause()
   * @generated
   */
  int GROUP_BY_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Grouping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE__GROUPING = 0;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE__HAVING_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Group By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.HavingClauseImpl <em>Having Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.HavingClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getHavingClause()
   * @generated
   */
  int HAVING_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE__HAVING = 0;

  /**
   * The number of structural features of the '<em>Having Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderByClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrderByClause()
   * @generated
   */
  int ORDER_BY_CLAUSE = 4;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE__ORDERING = 0;

  /**
   * The number of structural features of the '<em>Order By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderBySpecImpl <em>Order By Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderBySpecImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrderBySpec()
   * @generated
   */
  int ORDER_BY_SPEC = 5;

  /**
   * The number of structural features of the '<em>Order By Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateStatementImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUpdateStatement()
   * @generated
   */
  int UPDATE_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__WHERE_CLAUSE = JPQL_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Update Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__UPDATE_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Set Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT__SET_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Update Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_STATEMENT_FEATURE_COUNT = JPQL_QUERY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateClauseImpl <em>Update Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUpdateClause()
   * @generated
   */
  int UPDATE_CLAUSE = 7;

  /**
   * The feature id for the '<em><b>From Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_CLAUSE__FROM_ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Update Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SetClauseImpl <em>Set Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SetClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSetClause()
   * @generated
   */
  int SET_CLAUSE = 8;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CLAUSE__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Set Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateItemImpl <em>Update Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateItemImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUpdateItem()
   * @generated
   */
  int UPDATE_ITEM = 9;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_ITEM__ALIAS = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Update Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATE_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteStatementImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getDeleteStatement()
   * @generated
   */
  int DELETE_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT__WHERE_CLAUSE = JPQL_QUERY__WHERE_CLAUSE;

  /**
   * The feature id for the '<em><b>Delete Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT__DELETE_CLAUSE = JPQL_QUERY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delete Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_STATEMENT_FEATURE_COUNT = JPQL_QUERY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteClauseImpl <em>Delete Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getDeleteClause()
   * @generated
   */
  int DELETE_CLAUSE = 11;

  /**
   * The feature id for the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLAUSE__FROM_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Delete Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectClauseImpl <em>Select Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectClause()
   * @generated
   */
  int SELECT_CLAUSE = 12;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__IS_DISTINCT = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__EXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>Select Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectExpression()
   * @generated
   */
  int SELECT_EXPRESSION = 13;

  /**
   * The number of structural features of the '<em>Select Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectAggregateExpressionImpl <em>Select Aggregate Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectAggregateExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectAggregateExpression()
   * @generated
   */
  int SELECT_AGGREGATE_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT = SELECT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_AGGREGATE_EXPRESSION__ITEM = SELECT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Select Aggregate Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT = SELECT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AvgAggregateImpl <em>Avg Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AvgAggregateImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAvgAggregate()
   * @generated
   */
  int AVG_AGGREGATE = 15;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Avg Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AVG_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.CountAggregateImpl <em>Count Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.CountAggregateImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getCountAggregate()
   * @generated
   */
  int COUNT_AGGREGATE = 16;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Count Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MaxAggregateImpl <em>Max Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MaxAggregateImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMaxAggregate()
   * @generated
   */
  int MAX_AGGREGATE = 17;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Max Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MinAggregateImpl <em>Min Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MinAggregateImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMinAggregate()
   * @generated
   */
  int MIN_AGGREGATE = 18;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Min Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SumAggregateImpl <em>Sum Aggregate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SumAggregateImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSumAggregate()
   * @generated
   */
  int SUM_AGGREGATE = 19;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE__IS_DISTINCT = SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Item</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE__ITEM = SELECT_AGGREGATE_EXPRESSION__ITEM;

  /**
   * The number of structural features of the '<em>Sum Aggregate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_AGGREGATE_FEATURE_COUNT = SELECT_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectConstructorExpressionImpl <em>Select Constructor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectConstructorExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectConstructorExpression()
   * @generated
   */
  int SELECT_CONSTRUCTOR_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTRUCTOR_EXPRESSION__NAME = SELECT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTRUCTOR_EXPRESSION__ITEMS = SELECT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Select Constructor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTRUCTOR_EXPRESSION_FEATURE_COUNT = SELECT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClauseImpl <em>From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromClause()
   * @generated
   */
  int FROM_CLAUSE = 21;

  /**
   * The feature id for the '<em><b>From Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE__FROM_ENTRIES = 0;

  /**
   * The number of structural features of the '<em>From Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromEntryImpl <em>From Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromEntryImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromEntry()
   * @generated
   */
  int FROM_ENTRY = 22;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_ENTRY__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>From Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableDeclarationImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClassImpl <em>From Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClassImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromClass()
   * @generated
   */
  int FROM_CLASS = 24;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS__VARIABLE = FROM_ENTRY__VARIABLE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS__TYPE = FROM_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Joins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS__JOINS = FROM_ENTRY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>From Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLASS_FEATURE_COUNT = FROM_ENTRY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromCollectionImpl <em>From Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromCollectionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromCollection()
   * @generated
   */
  int FROM_COLLECTION = 25;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_COLLECTION__VARIABLE = FROM_ENTRY__VARIABLE;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_COLLECTION__PATH = FROM_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>From Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_COLLECTION_FEATURE_COUNT = FROM_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromJoinImpl <em>From Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromJoinImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromJoin()
   * @generated
   */
  int FROM_JOIN = 26;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN__IS_FETCH = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN__PATH = 1;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN__VARIABLE = 2;

  /**
   * The number of structural features of the '<em>From Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_JOIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JoinImpl <em>Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JoinImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getJoin()
   * @generated
   */
  int JOIN = 27;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__IS_FETCH = FROM_JOIN__IS_FETCH;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__PATH = FROM_JOIN__PATH;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__VARIABLE = FROM_JOIN__VARIABLE;

  /**
   * The number of structural features of the '<em>Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LeftJoinImpl <em>Left Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LeftJoinImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getLeftJoin()
   * @generated
   */
  int LEFT_JOIN = 28;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__IS_FETCH = FROM_JOIN__IS_FETCH;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__PATH = FROM_JOIN__PATH;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__VARIABLE = FROM_JOIN__VARIABLE;

  /**
   * The feature id for the '<em><b>Is Outer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN__IS_OUTER = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Left Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_JOIN_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.InnerJoinImpl <em>Inner Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.InnerJoinImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getInnerJoin()
   * @generated
   */
  int INNER_JOIN = 29;

  /**
   * The feature id for the '<em><b>Is Fetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN__IS_FETCH = FROM_JOIN__IS_FETCH;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN__PATH = FROM_JOIN__PATH;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN__VARIABLE = FROM_JOIN__VARIABLE;

  /**
   * The number of structural features of the '<em>Inner Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_JOIN_FEATURE_COUNT = FROM_JOIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.WhereClauseImpl <em>Where Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.WhereClauseImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getWhereClause()
   * @generated
   */
  int WHERE_CLAUSE = 30;

  /**
   * The feature id for the '<em><b>Where Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE__WHERE_ENTRY = 0;

  /**
   * The number of structural features of the '<em>Where Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UNARY_OPERATOR = SELECT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = SELECT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = SELECT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__IS_NOT = SELECT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ITEMS = SELECT_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__QUERY = SELECT_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__MIN = SELECT_EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__MAX = SELECT_EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = SELECT_EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 32;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__MAX = EXPRESSION__MAX;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionTermImpl <em>Expression Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionTermImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getExpressionTerm()
   * @generated
   */
  int EXPRESSION_TERM = 33;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM__MAX = EXPRESSION__MAX;

  /**
   * The number of structural features of the '<em>Expression Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_TERM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl <em>Alias Attribute Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAliasAttributeExpression()
   * @generated
   */
  int ALIAS_ATTRIBUTE_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__UNARY_OPERATOR = ORDER_BY_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__RIGHT = ORDER_BY_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__LEFT = ORDER_BY_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__IS_NOT = ORDER_BY_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__ITEMS = ORDER_BY_SPEC_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__QUERY = ORDER_BY_SPEC_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__MIN = ORDER_BY_SPEC_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__MAX = ORDER_BY_SPEC_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION = ORDER_BY_SPEC_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__ALIAS = ORDER_BY_SPEC_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES = ORDER_BY_SPEC_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Alias Attribute Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_ATTRIBUTE_EXPRESSION_FEATURE_COUNT = ORDER_BY_SPEC_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ParameterExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getParameterExpression()
   * @generated
   */
  int PARAMETER_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__UNARY_OPERATOR = VARIABLE__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__RIGHT = VARIABLE__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__LEFT = VARIABLE__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__IS_NOT = VARIABLE__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__ITEMS = VARIABLE__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__QUERY = VARIABLE__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__MIN = VARIABLE__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__MAX = VARIABLE__MAX;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__NAME = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__INDEX = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFunctionExpression()
   * @generated
   */
  int FUNCTION_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__MAX = EXPRESSION__MAX;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__FIELDS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__FIELD = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Start Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__START_POS = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__LENGTH = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Trim Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__TRIM_SPEC = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Trim Char</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION__TRIM_CHAR = EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LiteralImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 37;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__UNARY_OPERATOR = VARIABLE__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__RIGHT = VARIABLE__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEFT = VARIABLE__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__IS_NOT = VARIABLE__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__ITEMS = VARIABLE__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__QUERY = VARIABLE__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__MIN = VARIABLE__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__MAX = VARIABLE__MAX;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.IntegerLiteralImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 38;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__UNARY_OPERATOR = LITERAL__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__IS_NOT = LITERAL__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__ITEMS = LITERAL__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__QUERY = LITERAL__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__MIN = LITERAL__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__MAX = LITERAL__MAX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatLiteralImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 39;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__UNARY_OPERATOR = LITERAL__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__IS_NOT = LITERAL__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__ITEMS = LITERAL__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__QUERY = LITERAL__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__MIN = LITERAL__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__MAX = LITERAL__MAX;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatImpl <em>Float</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFloat()
   * @generated
   */
  int FLOAT = 40;

  /**
   * The feature id for the '<em><b>Integer Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT__INTEGER_VALUE = 0;

  /**
   * The feature id for the '<em><b>Fraction Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT__FRACTION_VALUE = 1;

  /**
   * The number of structural features of the '<em>Float</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.StringLiteralImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 41;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__UNARY_OPERATOR = LITERAL__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__IS_NOT = LITERAL__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__ITEMS = LITERAL__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__QUERY = LITERAL__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__MIN = LITERAL__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__MAX = LITERAL__MAX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.NullLiteralImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 42;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__UNARY_OPERATOR = LITERAL__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__IS_NOT = LITERAL__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__ITEMS = LITERAL__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__QUERY = LITERAL__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__MIN = LITERAL__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__MAX = LITERAL__MAX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.BooleanLiteralImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__UNARY_OPERATOR = LITERAL__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__IS_NOT = LITERAL__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__ITEMS = LITERAL__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__QUERY = LITERAL__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__MIN = LITERAL__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__MAX = LITERAL__MAX;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__MAX = EXPRESSION__MAX;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__ENTRIES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AndExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__MAX = EXPRESSION__MAX;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__ENTRIES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ComparisonOperatorExpressionImpl <em>Comparison Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ComparisonOperatorExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getComparisonOperatorExpression()
   * @generated
   */
  int COMPARISON_OPERATOR_EXPRESSION = 46;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__MAX = EXPRESSION__MAX;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comparison Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AdditionExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAdditionExpression()
   * @generated
   */
  int ADDITION_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__MAX = EXPRESSION__MAX;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Addition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MultiplicationExpressionImpl
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMultiplicationExpression()
   * @generated
   */
  int MULTIPLICATION_EXPRESSION = 48;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Is Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__IS_NOT = EXPRESSION__IS_NOT;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__QUERY = EXPRESSION__QUERY;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__MIN = EXPRESSION__MIN;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__MAX = EXPRESSION__MAX;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multiplication Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection <em>Order By Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrderByDirection()
   * @generated
   */
  int ORDER_BY_DIRECTION = 49;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec <em>Trim Spec</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getTrimSpec()
   * @generated
   */
  int TRIM_SPEC = 50;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator <em>Unary Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUnaryOperator()
   * @generated
   */
  int UNARY_OPERATOR = 51;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator <em>Addition Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAdditionOperator()
   * @generated
   */
  int ADDITION_OPERATOR = 52;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator <em>Multiplication Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMultiplicationOperator()
   * @generated
   */
  int MULTIPLICATION_OPERATOR = 53;

  /**
   * The meta object id for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator <em>Comparison Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getComparisonOperator()
   * @generated
   */
  int COMPARISON_OPERATOR = 54;


  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLQuery
   * @generated
   */
  EClass getJPQLQuery();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLQuery#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLQuery#getWhereClause()
   * @see #getJPQLQuery()
   * @generated
   */
  EReference getJPQLQuery_WhereClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getSelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getSelectClause()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_SelectClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getFromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getFromClause()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_FromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getGroupByClause <em>Group By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group By Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getGroupByClause()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_GroupByClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getOrderByClause <em>Order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order By Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement#getOrderByClause()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_OrderByClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause <em>Group By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group By Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause
   * @generated
   */
  EClass getGroupByClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getGrouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grouping</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getGrouping()
   * @see #getGroupByClause()
   * @generated
   */
  EReference getGroupByClause_Grouping();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getHavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause#getHavingClause()
   * @see #getGroupByClause()
   * @generated
   */
  EReference getGroupByClause_HavingClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Having Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause
   * @generated
   */
  EClass getHavingClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause#getHaving <em>Having</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause#getHaving()
   * @see #getHavingClause()
   * @generated
   */
  EReference getHavingClause_Having();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause <em>Order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause
   * @generated
   */
  EClass getOrderByClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordering</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause#getOrdering()
   * @see #getOrderByClause()
   * @generated
   */
  EReference getOrderByClause_Ordering();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrderBySpec <em>Order By Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Spec</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrderBySpec
   * @generated
   */
  EClass getOrderBySpec();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement <em>Update Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Statement</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement
   * @generated
   */
  EClass getUpdateStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getUpdateClause <em>Update Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getUpdateClause()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_UpdateClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getSetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Set Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement#getSetClause()
   * @see #getUpdateStatement()
   * @generated
   */
  EReference getUpdateStatement_SetClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause <em>Update Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause
   * @generated
   */
  EClass getUpdateClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause#getFromEntries <em>From Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From Entries</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause#getFromEntries()
   * @see #getUpdateClause()
   * @generated
   */
  EReference getUpdateClause_FromEntries();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause
   * @generated
   */
  EClass getSetClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause#getItems()
   * @see #getSetClause()
   * @generated
   */
  EReference getSetClause_Items();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem <em>Update Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Update Item</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem
   * @generated
   */
  EClass getUpdateItem();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem#getAlias()
   * @see #getUpdateItem()
   * @generated
   */
  EReference getUpdateItem_Alias();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem#getValue()
   * @see #getUpdateItem()
   * @generated
   */
  EReference getUpdateItem_Value();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement <em>Delete Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Statement</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement
   * @generated
   */
  EClass getDeleteStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement#getDeleteClause <em>Delete Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delete Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement#getDeleteClause()
   * @see #getDeleteStatement()
   * @generated
   */
  EReference getDeleteStatement_DeleteClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause <em>Delete Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause
   * @generated
   */
  EClass getDeleteClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause#getFromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause#getFromClause()
   * @see #getDeleteClause()
   * @generated
   */
  EReference getDeleteClause_FromClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause
   * @generated
   */
  EClass getSelectClause();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause#isIsDistinct()
   * @see #getSelectClause()
   * @generated
   */
  EAttribute getSelectClause_IsDistinct();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause#getExpressions()
   * @see #getSelectClause()
   * @generated
   */
  EReference getSelectClause_Expressions();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectExpression <em>Select Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectExpression
   * @generated
   */
  EClass getSelectExpression();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression <em>Select Aggregate Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Aggregate Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression
   * @generated
   */
  EClass getSelectAggregateExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression#isIsDistinct()
   * @see #getSelectAggregateExpression()
   * @generated
   */
  EAttribute getSelectAggregateExpression_IsDistinct();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression#getItem()
   * @see #getSelectAggregateExpression()
   * @generated
   */
  EReference getSelectAggregateExpression_Item();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AvgAggregate <em>Avg Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Avg Aggregate</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AvgAggregate
   * @generated
   */
  EClass getAvgAggregate();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.CountAggregate <em>Count Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count Aggregate</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.CountAggregate
   * @generated
   */
  EClass getCountAggregate();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MaxAggregate <em>Max Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Aggregate</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MaxAggregate
   * @generated
   */
  EClass getMaxAggregate();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MinAggregate <em>Min Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Aggregate</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MinAggregate
   * @generated
   */
  EClass getMinAggregate();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SumAggregate <em>Sum Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sum Aggregate</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SumAggregate
   * @generated
   */
  EClass getSumAggregate();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression <em>Select Constructor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Constructor Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression
   * @generated
   */
  EClass getSelectConstructorExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression#getName()
   * @see #getSelectConstructorExpression()
   * @generated
   */
  EAttribute getSelectConstructorExpression_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression#getItems()
   * @see #getSelectConstructorExpression()
   * @generated
   */
  EReference getSelectConstructorExpression_Items();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause
   * @generated
   */
  EClass getFromClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause#getFromEntries <em>From Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From Entries</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause#getFromEntries()
   * @see #getFromClause()
   * @generated
   */
  EReference getFromClause_FromEntries();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry <em>From Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Entry</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry
   * @generated
   */
  EClass getFromEntry();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry#getVariable()
   * @see #getFromEntry()
   * @generated
   */
  EReference getFromEntry_Variable();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass <em>From Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Class</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass
   * @generated
   */
  EClass getFromClass();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass#getType()
   * @see #getFromClass()
   * @generated
   */
  EAttribute getFromClass_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass#getJoins <em>Joins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Joins</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass#getJoins()
   * @see #getFromClass()
   * @generated
   */
  EReference getFromClass_Joins();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection <em>From Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Collection</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection
   * @generated
   */
  EClass getFromCollection();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection#getPath()
   * @see #getFromCollection()
   * @generated
   */
  EReference getFromCollection_Path();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin <em>From Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Join</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin
   * @generated
   */
  EClass getFromJoin();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin#isIsFetch <em>Is Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Fetch</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin#isIsFetch()
   * @see #getFromJoin()
   * @generated
   */
  EAttribute getFromJoin_IsFetch();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin#getPath()
   * @see #getFromJoin()
   * @generated
   */
  EReference getFromJoin_Path();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin#getVariable()
   * @see #getFromJoin()
   * @generated
   */
  EReference getFromJoin_Variable();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Join
   * @generated
   */
  EClass getJoin();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin <em>Left Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Join</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin
   * @generated
   */
  EClass getLeftJoin();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin#isIsOuter <em>Is Outer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Outer</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin#isIsOuter()
   * @see #getLeftJoin()
   * @generated
   */
  EAttribute getLeftJoin_IsOuter();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.InnerJoin <em>Inner Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Join</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.InnerJoin
   * @generated
   */
  EClass getInnerJoin();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Clause</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause
   * @generated
   */
  EClass getWhereClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause#getWhereEntry <em>Where Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Entry</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause#getWhereEntry()
   * @see #getWhereClause()
   * @generated
   */
  EReference getWhereClause_WhereEntry();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getUnaryOperator <em>Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unary Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getUnaryOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_UnaryOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#isIsNot <em>Is Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Not</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#isIsNot()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_IsNot();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getItems()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Items();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getQuery()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Query();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getMin()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Min();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Expression#getMax()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Max();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ExpressionTerm <em>Expression Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Term</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ExpressionTerm
   * @generated
   */
  EClass getExpressionTerm();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression <em>Alias Attribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias Attribute Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression
   * @generated
   */
  EClass getAliasAttributeExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression#getDirection()
   * @see #getAliasAttributeExpression()
   * @generated
   */
  EAttribute getAliasAttributeExpression_Direction();

  /**
   * Returns the meta object for the reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Alias</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression#getAlias()
   * @see #getAliasAttributeExpression()
   * @generated
   */
  EReference getAliasAttributeExpression_Alias();

  /**
   * Returns the meta object for the attribute list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Attributes</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression#getAttributes()
   * @see #getAliasAttributeExpression()
   * @generated
   */
  EAttribute getAliasAttributeExpression_Attributes();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression
   * @generated
   */
  EClass getParameterExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression#getName()
   * @see #getParameterExpression()
   * @generated
   */
  EAttribute getParameterExpression_Name();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression#getIndex()
   * @see #getParameterExpression()
   * @generated
   */
  EAttribute getParameterExpression_Index();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression <em>Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression
   * @generated
   */
  EClass getFunctionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getName()
   * @see #getFunctionExpression()
   * @generated
   */
  EAttribute getFunctionExpression_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getFields()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Fields();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getField()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Field();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getStartPos <em>Start Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Pos</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getStartPos()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_StartPos();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getLength()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_Length();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimSpec <em>Trim Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trim Spec</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimSpec()
   * @see #getFunctionExpression()
   * @generated
   */
  EAttribute getFunctionExpression_TrimSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimChar <em>Trim Char</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trim Char</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression#getTrimChar()
   * @see #getFunctionExpression()
   * @generated
   */
  EReference getFunctionExpression_TrimChar();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EReference getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float <em>Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Float
   * @generated
   */
  EClass getFloat();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getIntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getIntegerValue()
   * @see #getFloat()
   * @generated
   */
  EAttribute getFloat_IntegerValue();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getFractionValue <em>Fraction Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.Float#getFractionValue()
   * @see #getFloat()
   * @generated
   */
  EAttribute getFloat_FractionValue();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.NullLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.NullLiteral#getValue()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrExpression#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrExpression#getEntries()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Entries();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression#getEntries()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Entries();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression <em>Comparison Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Operator Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression
   * @generated
   */
  EClass getComparisonOperatorExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression#getOperator()
   * @see #getComparisonOperatorExpression()
   * @generated
   */
  EAttribute getComparisonOperatorExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionExpression
   * @generated
   */
  EClass getAdditionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionExpression#getOperator()
   * @see #getAdditionExpression()
   * @generated
   */
  EAttribute getAdditionExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Expression</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationExpression
   * @generated
   */
  EClass getMultiplicationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationExpression#getOperator()
   * @see #getMultiplicationExpression()
   * @generated
   */
  EAttribute getMultiplicationExpression_Operator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection <em>Order By Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Order By Direction</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection
   * @generated
   */
  EEnum getOrderByDirection();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec <em>Trim Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Trim Spec</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec
   * @generated
   */
  EEnum getTrimSpec();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator <em>Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator
   * @generated
   */
  EEnum getUnaryOperator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator <em>Addition Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Addition Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator
   * @generated
   */
  EEnum getAdditionOperator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator <em>Multiplication Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplication Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator
   * @generated
   */
  EEnum getMultiplicationOperator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator <em>Comparison Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparison Operator</em>'.
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator
   * @generated
   */
  EEnum getComparisonOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JPQLFactory getJPQLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLQueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLQueryImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getJPQLQuery()
     * @generated
     */
    EClass JPQL_QUERY = eINSTANCE.getJPQLQuery();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JPQL_QUERY__WHERE_CLAUSE = eINSTANCE.getJPQLQuery_WhereClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl <em>Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectStatementImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectStatement()
     * @generated
     */
    EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

    /**
     * The meta object literal for the '<em><b>Select Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__SELECT_CLAUSE = eINSTANCE.getSelectStatement_SelectClause();

    /**
     * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__FROM_CLAUSE = eINSTANCE.getSelectStatement_FromClause();

    /**
     * The meta object literal for the '<em><b>Group By Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__GROUP_BY_CLAUSE = eINSTANCE.getSelectStatement_GroupByClause();

    /**
     * The meta object literal for the '<em><b>Order By Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__ORDER_BY_CLAUSE = eINSTANCE.getSelectStatement_OrderByClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.GroupByClauseImpl <em>Group By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.GroupByClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getGroupByClause()
     * @generated
     */
    EClass GROUP_BY_CLAUSE = eINSTANCE.getGroupByClause();

    /**
     * The meta object literal for the '<em><b>Grouping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_CLAUSE__GROUPING = eINSTANCE.getGroupByClause_Grouping();

    /**
     * The meta object literal for the '<em><b>Having Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_CLAUSE__HAVING_CLAUSE = eINSTANCE.getGroupByClause_HavingClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.HavingClauseImpl <em>Having Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.HavingClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getHavingClause()
     * @generated
     */
    EClass HAVING_CLAUSE = eINSTANCE.getHavingClause();

    /**
     * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAVING_CLAUSE__HAVING = eINSTANCE.getHavingClause_Having();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderByClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrderByClause()
     * @generated
     */
    EClass ORDER_BY_CLAUSE = eINSTANCE.getOrderByClause();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_BY_CLAUSE__ORDERING = eINSTANCE.getOrderByClause_Ordering();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderBySpecImpl <em>Order By Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrderBySpecImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrderBySpec()
     * @generated
     */
    EClass ORDER_BY_SPEC = eINSTANCE.getOrderBySpec();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateStatementImpl <em>Update Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateStatementImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUpdateStatement()
     * @generated
     */
    EClass UPDATE_STATEMENT = eINSTANCE.getUpdateStatement();

    /**
     * The meta object literal for the '<em><b>Update Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__UPDATE_CLAUSE = eINSTANCE.getUpdateStatement_UpdateClause();

    /**
     * The meta object literal for the '<em><b>Set Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_STATEMENT__SET_CLAUSE = eINSTANCE.getUpdateStatement_SetClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateClauseImpl <em>Update Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUpdateClause()
     * @generated
     */
    EClass UPDATE_CLAUSE = eINSTANCE.getUpdateClause();

    /**
     * The meta object literal for the '<em><b>From Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_CLAUSE__FROM_ENTRIES = eINSTANCE.getUpdateClause_FromEntries();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SetClauseImpl <em>Set Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SetClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSetClause()
     * @generated
     */
    EClass SET_CLAUSE = eINSTANCE.getSetClause();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_CLAUSE__ITEMS = eINSTANCE.getSetClause_Items();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateItemImpl <em>Update Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.UpdateItemImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUpdateItem()
     * @generated
     */
    EClass UPDATE_ITEM = eINSTANCE.getUpdateItem();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_ITEM__ALIAS = eINSTANCE.getUpdateItem_Alias();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATE_ITEM__VALUE = eINSTANCE.getUpdateItem_Value();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteStatementImpl <em>Delete Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteStatementImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getDeleteStatement()
     * @generated
     */
    EClass DELETE_STATEMENT = eINSTANCE.getDeleteStatement();

    /**
     * The meta object literal for the '<em><b>Delete Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_STATEMENT__DELETE_CLAUSE = eINSTANCE.getDeleteStatement_DeleteClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteClauseImpl <em>Delete Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.DeleteClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getDeleteClause()
     * @generated
     */
    EClass DELETE_CLAUSE = eINSTANCE.getDeleteClause();

    /**
     * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_CLAUSE__FROM_CLAUSE = eINSTANCE.getDeleteClause_FromClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectClauseImpl <em>Select Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectClause()
     * @generated
     */
    EClass SELECT_CLAUSE = eINSTANCE.getSelectClause();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CLAUSE__IS_DISTINCT = eINSTANCE.getSelectClause_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CLAUSE__EXPRESSIONS = eINSTANCE.getSelectClause_Expressions();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectExpressionImpl <em>Select Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectExpression()
     * @generated
     */
    EClass SELECT_EXPRESSION = eINSTANCE.getSelectExpression();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectAggregateExpressionImpl <em>Select Aggregate Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectAggregateExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectAggregateExpression()
     * @generated
     */
    EClass SELECT_AGGREGATE_EXPRESSION = eINSTANCE.getSelectAggregateExpression();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT = eINSTANCE.getSelectAggregateExpression_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_AGGREGATE_EXPRESSION__ITEM = eINSTANCE.getSelectAggregateExpression_Item();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AvgAggregateImpl <em>Avg Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AvgAggregateImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAvgAggregate()
     * @generated
     */
    EClass AVG_AGGREGATE = eINSTANCE.getAvgAggregate();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.CountAggregateImpl <em>Count Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.CountAggregateImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getCountAggregate()
     * @generated
     */
    EClass COUNT_AGGREGATE = eINSTANCE.getCountAggregate();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MaxAggregateImpl <em>Max Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MaxAggregateImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMaxAggregate()
     * @generated
     */
    EClass MAX_AGGREGATE = eINSTANCE.getMaxAggregate();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MinAggregateImpl <em>Min Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MinAggregateImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMinAggregate()
     * @generated
     */
    EClass MIN_AGGREGATE = eINSTANCE.getMinAggregate();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SumAggregateImpl <em>Sum Aggregate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SumAggregateImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSumAggregate()
     * @generated
     */
    EClass SUM_AGGREGATE = eINSTANCE.getSumAggregate();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectConstructorExpressionImpl <em>Select Constructor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.SelectConstructorExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getSelectConstructorExpression()
     * @generated
     */
    EClass SELECT_CONSTRUCTOR_EXPRESSION = eINSTANCE.getSelectConstructorExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CONSTRUCTOR_EXPRESSION__NAME = eINSTANCE.getSelectConstructorExpression_Name();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CONSTRUCTOR_EXPRESSION__ITEMS = eINSTANCE.getSelectConstructorExpression_Items();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClauseImpl <em>From Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromClause()
     * @generated
     */
    EClass FROM_CLAUSE = eINSTANCE.getFromClause();

    /**
     * The meta object literal for the '<em><b>From Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLAUSE__FROM_ENTRIES = eINSTANCE.getFromClause_FromEntries();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromEntryImpl <em>From Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromEntryImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromEntry()
     * @generated
     */
    EClass FROM_ENTRY = eINSTANCE.getFromEntry();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_ENTRY__VARIABLE = eINSTANCE.getFromEntry_Variable();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableDeclarationImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClassImpl <em>From Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromClassImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromClass()
     * @generated
     */
    EClass FROM_CLASS = eINSTANCE.getFromClass();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_CLASS__TYPE = eINSTANCE.getFromClass_Type();

    /**
     * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_CLASS__JOINS = eINSTANCE.getFromClass_Joins();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromCollectionImpl <em>From Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromCollectionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromCollection()
     * @generated
     */
    EClass FROM_COLLECTION = eINSTANCE.getFromCollection();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_COLLECTION__PATH = eINSTANCE.getFromCollection_Path();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromJoinImpl <em>From Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FromJoinImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFromJoin()
     * @generated
     */
    EClass FROM_JOIN = eINSTANCE.getFromJoin();

    /**
     * The meta object literal for the '<em><b>Is Fetch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_JOIN__IS_FETCH = eINSTANCE.getFromJoin_IsFetch();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_JOIN__PATH = eINSTANCE.getFromJoin_Path();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM_JOIN__VARIABLE = eINSTANCE.getFromJoin_Variable();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JoinImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getJoin()
     * @generated
     */
    EClass JOIN = eINSTANCE.getJoin();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LeftJoinImpl <em>Left Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LeftJoinImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getLeftJoin()
     * @generated
     */
    EClass LEFT_JOIN = eINSTANCE.getLeftJoin();

    /**
     * The meta object literal for the '<em><b>Is Outer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEFT_JOIN__IS_OUTER = eINSTANCE.getLeftJoin_IsOuter();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.InnerJoinImpl <em>Inner Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.InnerJoinImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getInnerJoin()
     * @generated
     */
    EClass INNER_JOIN = eINSTANCE.getInnerJoin();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.WhereClauseImpl <em>Where Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.WhereClauseImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getWhereClause()
     * @generated
     */
    EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

    /**
     * The meta object literal for the '<em><b>Where Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_CLAUSE__WHERE_ENTRY = eINSTANCE.getWhereClause_WhereEntry();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Unary Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__UNARY_OPERATOR = eINSTANCE.getExpression_UnaryOperator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Is Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__IS_NOT = eINSTANCE.getExpression_IsNot();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ITEMS = eINSTANCE.getExpression_Items();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__QUERY = eINSTANCE.getExpression_Query();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__MIN = eINSTANCE.getExpression_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__MAX = eINSTANCE.getExpression_Max();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.VariableImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionTermImpl <em>Expression Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ExpressionTermImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getExpressionTerm()
     * @generated
     */
    EClass EXPRESSION_TERM = eINSTANCE.getExpressionTerm();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl <em>Alias Attribute Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AliasAttributeExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAliasAttributeExpression()
     * @generated
     */
    EClass ALIAS_ATTRIBUTE_EXPRESSION = eINSTANCE.getAliasAttributeExpression();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION = eINSTANCE.getAliasAttributeExpression_Direction();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS_ATTRIBUTE_EXPRESSION__ALIAS = eINSTANCE.getAliasAttributeExpression_Alias();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES = eINSTANCE.getAliasAttributeExpression_Attributes();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ParameterExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getParameterExpression()
     * @generated
     */
    EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_EXPRESSION__NAME = eINSTANCE.getParameterExpression_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_EXPRESSION__INDEX = eINSTANCE.getParameterExpression_Index();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl <em>Function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FunctionExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFunctionExpression()
     * @generated
     */
    EClass FUNCTION_EXPRESSION = eINSTANCE.getFunctionExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_EXPRESSION__NAME = eINSTANCE.getFunctionExpression_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__FIELDS = eINSTANCE.getFunctionExpression_Fields();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__FIELD = eINSTANCE.getFunctionExpression_Field();

    /**
     * The meta object literal for the '<em><b>Start Pos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__START_POS = eINSTANCE.getFunctionExpression_StartPos();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__LENGTH = eINSTANCE.getFunctionExpression_Length();

    /**
     * The meta object literal for the '<em><b>Trim Spec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_EXPRESSION__TRIM_SPEC = eINSTANCE.getFunctionExpression_TrimSpec();

    /**
     * The meta object literal for the '<em><b>Trim Char</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_EXPRESSION__TRIM_CHAR = eINSTANCE.getFunctionExpression_TrimChar();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.LiteralImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.IntegerLiteralImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatLiteralImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatImpl <em>Float</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.FloatImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getFloat()
     * @generated
     */
    EClass FLOAT = eINSTANCE.getFloat();

    /**
     * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT__INTEGER_VALUE = eINSTANCE.getFloat_IntegerValue();

    /**
     * The meta object literal for the '<em><b>Fraction Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT__FRACTION_VALUE = eINSTANCE.getFloat_FractionValue();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.StringLiteralImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.NullLiteralImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_LITERAL__VALUE = eINSTANCE.getNullLiteral_Value();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.BooleanLiteralImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.OrExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__ENTRIES = eINSTANCE.getOrExpression_Entries();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AndExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__ENTRIES = eINSTANCE.getAndExpression_Entries();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ComparisonOperatorExpressionImpl <em>Comparison Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.ComparisonOperatorExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getComparisonOperatorExpression()
     * @generated
     */
    EClass COMPARISON_OPERATOR_EXPRESSION = eINSTANCE.getComparisonOperatorExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getComparisonOperatorExpression_Operator();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.AdditionExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAdditionExpression()
     * @generated
     */
    EClass ADDITION_EXPRESSION = eINSTANCE.getAdditionExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITION_EXPRESSION__OPERATOR = eINSTANCE.getAdditionExpression_Operator();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.MultiplicationExpressionImpl
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMultiplicationExpression()
     * @generated
     */
    EClass MULTIPLICATION_EXPRESSION = eINSTANCE.getMultiplicationExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION_EXPRESSION__OPERATOR = eINSTANCE.getMultiplicationExpression_Operator();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection <em>Order By Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getOrderByDirection()
     * @generated
     */
    EEnum ORDER_BY_DIRECTION = eINSTANCE.getOrderByDirection();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec <em>Trim Spec</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getTrimSpec()
     * @generated
     */
    EEnum TRIM_SPEC = eINSTANCE.getTrimSpec();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator <em>Unary Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getUnaryOperator()
     * @generated
     */
    EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator <em>Addition Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getAdditionOperator()
     * @generated
     */
    EEnum ADDITION_OPERATOR = eINSTANCE.getAdditionOperator();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator <em>Multiplication Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getMultiplicationOperator()
     * @generated
     */
    EEnum MULTIPLICATION_OPERATOR = eINSTANCE.getMultiplicationOperator();

    /**
     * The meta object literal for the '{@link org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator <em>Comparison Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator
     * @see org.nightlabs.vestigo.xtext.jpql.jPQL.impl.JPQLPackageImpl#getComparisonOperator()
     * @generated
     */
    EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

  }

} //JPQLPackage
