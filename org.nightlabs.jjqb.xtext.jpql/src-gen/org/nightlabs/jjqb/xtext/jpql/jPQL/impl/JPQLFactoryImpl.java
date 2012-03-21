/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nightlabs.jjqb.xtext.jpql.jPQL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JPQLFactoryImpl extends EFactoryImpl implements JPQLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JPQLFactory init()
  {
    try
    {
      JPQLFactory theJPQLFactory = (JPQLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.nightlabs.org/jjqb/xtext/jdoql/JPQL"); 
      if (theJPQLFactory != null)
      {
        return theJPQLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JPQLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPQLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JPQLPackage.JPQL_QUERY: return createJPQLQuery();
      case JPQLPackage.SELECT_STATEMENT: return createSelectStatement();
      case JPQLPackage.GROUP_CLAUSE: return createGroupClause();
      case JPQLPackage.GROUP_ITEM: return createGroupItem();
      case JPQLPackage.HAVING_CLAUSE: return createHavingClause();
      case JPQLPackage.ORDER_CLAUSE: return createOrderClause();
      case JPQLPackage.ORDER_ITEM: return createOrderItem();
      case JPQLPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case JPQLPackage.UPDATE_CLAUSE: return createUpdateClause();
      case JPQLPackage.SET_CLAUSE: return createSetClause();
      case JPQLPackage.UPDATE_ITEM: return createUpdateItem();
      case JPQLPackage.DELETE_STATEMENT: return createDeleteStatement();
      case JPQLPackage.DELETE_CLAUSE: return createDeleteClause();
      case JPQLPackage.SELECT_FROM_CLAUSE: return createSelectFromClause();
      case JPQLPackage.SELECT_CLAUSE: return createSelectClause();
      case JPQLPackage.SELECT_EXPRESSION: return createSelectExpression();
      case JPQLPackage.SELECT_AGGREGATE_EXPRESSION: return createSelectAggregateExpression();
      case JPQLPackage.AVG_AGGREGATE: return createAvgAggregate();
      case JPQLPackage.MAX_AGGREGATE: return createMaxAggregate();
      case JPQLPackage.MIN_AGGREGATE: return createMinAggregate();
      case JPQLPackage.SUM_AGGREGATE: return createSumAggregate();
      case JPQLPackage.COUNT_AGGREGATE: return createCountAggregate();
      case JPQLPackage.SELECT_CONSTRUCTOR_EXPRESSION: return createSelectConstructorExpression();
      case JPQLPackage.FROM_CLAUSE: return createFromClause();
      case JPQLPackage.FROM_ENTRY: return createFromEntry();
      case JPQLPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case JPQLPackage.FROM_CLASS: return createFromClass();
      case JPQLPackage.FROM_COLLECTION: return createFromCollection();
      case JPQLPackage.FROM_JOIN: return createFromJoin();
      case JPQLPackage.JOIN: return createJoin();
      case JPQLPackage.LEFT_JOIN: return createLeftJoin();
      case JPQLPackage.INNER_JOIN: return createInnerJoin();
      case JPQLPackage.WHERE_CLAUSE: return createWhereClause();
      case JPQLPackage.EXPRESSION: return createExpression();
      case JPQLPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
      case JPQLPackage.EXISTS_EXPRESSION: return createExistsExpression();
      case JPQLPackage.ALL_EXPRESSION: return createAllExpression();
      case JPQLPackage.ANY_EXPRESSION: return createAnyExpression();
      case JPQLPackage.SOME_EXPRESSION: return createSomeExpression();
      case JPQLPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
      case JPQLPackage.NULL_COMPARISON_EXPRESSION: return createNullComparisonExpression();
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION: return createEmptyComparisonExpression();
      case JPQLPackage.LIKE_EXPRESSION: return createLikeExpression();
      case JPQLPackage.IN_EXPRESSION: return createInExpression();
      case JPQLPackage.IN_SEQ_EXPRESSION: return createInSeqExpression();
      case JPQLPackage.IN_QUERY_EXPRESSION: return createInQueryExpression();
      case JPQLPackage.BETWEEN_EXPRESSION: return createBetweenExpression();
      case JPQLPackage.VARIABLE: return createVariable();
      case JPQLPackage.EXPRESSION_TERM: return createExpressionTerm();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION: return createAliasAttributeExpression();
      case JPQLPackage.PARAMETER_EXPRESSION: return createParameterExpression();
      case JPQLPackage.FUNCTION: return createFunction();
      case JPQLPackage.VALUE: return createValue();
      case JPQLPackage.INTEGER_EXPRESSION: return createIntegerExpression();
      case JPQLPackage.STRING_EXPRESSION: return createStringExpression();
      case JPQLPackage.NULL_EXPRESSION: return createNullExpression();
      case JPQLPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case JPQLPackage.OR_EXPRESSION: return createOrExpression();
      case JPQLPackage.AND_EXPRESSION: return createAndExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JPQLPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JPQLPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPQLQuery createJPQLQuery()
  {
    JPQLQueryImpl jpqlQuery = new JPQLQueryImpl();
    return jpqlQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupClause createGroupClause()
  {
    GroupClauseImpl groupClause = new GroupClauseImpl();
    return groupClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupItem createGroupItem()
  {
    GroupItemImpl groupItem = new GroupItemImpl();
    return groupItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HavingClause createHavingClause()
  {
    HavingClauseImpl havingClause = new HavingClauseImpl();
    return havingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderClause createOrderClause()
  {
    OrderClauseImpl orderClause = new OrderClauseImpl();
    return orderClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderItem createOrderItem()
  {
    OrderItemImpl orderItem = new OrderItemImpl();
    return orderItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateStatement createUpdateStatement()
  {
    UpdateStatementImpl updateStatement = new UpdateStatementImpl();
    return updateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateClause createUpdateClause()
  {
    UpdateClauseImpl updateClause = new UpdateClauseImpl();
    return updateClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetClause createSetClause()
  {
    SetClauseImpl setClause = new SetClauseImpl();
    return setClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UpdateItem createUpdateItem()
  {
    UpdateItemImpl updateItem = new UpdateItemImpl();
    return updateItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteStatement createDeleteStatement()
  {
    DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
    return deleteStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteClause createDeleteClause()
  {
    DeleteClauseImpl deleteClause = new DeleteClauseImpl();
    return deleteClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectFromClause createSelectFromClause()
  {
    SelectFromClauseImpl selectFromClause = new SelectFromClauseImpl();
    return selectFromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectClause createSelectClause()
  {
    SelectClauseImpl selectClause = new SelectClauseImpl();
    return selectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectExpression createSelectExpression()
  {
    SelectExpressionImpl selectExpression = new SelectExpressionImpl();
    return selectExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAggregateExpression createSelectAggregateExpression()
  {
    SelectAggregateExpressionImpl selectAggregateExpression = new SelectAggregateExpressionImpl();
    return selectAggregateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AvgAggregate createAvgAggregate()
  {
    AvgAggregateImpl avgAggregate = new AvgAggregateImpl();
    return avgAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxAggregate createMaxAggregate()
  {
    MaxAggregateImpl maxAggregate = new MaxAggregateImpl();
    return maxAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinAggregate createMinAggregate()
  {
    MinAggregateImpl minAggregate = new MinAggregateImpl();
    return minAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SumAggregate createSumAggregate()
  {
    SumAggregateImpl sumAggregate = new SumAggregateImpl();
    return sumAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountAggregate createCountAggregate()
  {
    CountAggregateImpl countAggregate = new CountAggregateImpl();
    return countAggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectConstructorExpression createSelectConstructorExpression()
  {
    SelectConstructorExpressionImpl selectConstructorExpression = new SelectConstructorExpressionImpl();
    return selectConstructorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromClause createFromClause()
  {
    FromClauseImpl fromClause = new FromClauseImpl();
    return fromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromEntry createFromEntry()
  {
    FromEntryImpl fromEntry = new FromEntryImpl();
    return fromEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromClass createFromClass()
  {
    FromClassImpl fromClass = new FromClassImpl();
    return fromClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromCollection createFromCollection()
  {
    FromCollectionImpl fromCollection = new FromCollectionImpl();
    return fromCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FromJoin createFromJoin()
  {
    FromJoinImpl fromJoin = new FromJoinImpl();
    return fromJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftJoin createLeftJoin()
  {
    LeftJoinImpl leftJoin = new LeftJoinImpl();
    return leftJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerJoin createInnerJoin()
  {
    InnerJoinImpl innerJoin = new InnerJoinImpl();
    return innerJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereClause createWhereClause()
  {
    WhereClauseImpl whereClause = new WhereClauseImpl();
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorExpression createOperatorExpression()
  {
    OperatorExpressionImpl operatorExpression = new OperatorExpressionImpl();
    return operatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsExpression createExistsExpression()
  {
    ExistsExpressionImpl existsExpression = new ExistsExpressionImpl();
    return existsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllExpression createAllExpression()
  {
    AllExpressionImpl allExpression = new AllExpressionImpl();
    return allExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyExpression createAnyExpression()
  {
    AnyExpressionImpl anyExpression = new AnyExpressionImpl();
    return anyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SomeExpression createSomeExpression()
  {
    SomeExpressionImpl someExpression = new SomeExpressionImpl();
    return someExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionExpression createCollectionExpression()
  {
    CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
    return collectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullComparisonExpression createNullComparisonExpression()
  {
    NullComparisonExpressionImpl nullComparisonExpression = new NullComparisonExpressionImpl();
    return nullComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyComparisonExpression createEmptyComparisonExpression()
  {
    EmptyComparisonExpressionImpl emptyComparisonExpression = new EmptyComparisonExpressionImpl();
    return emptyComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikeExpression createLikeExpression()
  {
    LikeExpressionImpl likeExpression = new LikeExpressionImpl();
    return likeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InExpression createInExpression()
  {
    InExpressionImpl inExpression = new InExpressionImpl();
    return inExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InSeqExpression createInSeqExpression()
  {
    InSeqExpressionImpl inSeqExpression = new InSeqExpressionImpl();
    return inSeqExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InQueryExpression createInQueryExpression()
  {
    InQueryExpressionImpl inQueryExpression = new InQueryExpressionImpl();
    return inQueryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BetweenExpression createBetweenExpression()
  {
    BetweenExpressionImpl betweenExpression = new BetweenExpressionImpl();
    return betweenExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionTerm createExpressionTerm()
  {
    ExpressionTermImpl expressionTerm = new ExpressionTermImpl();
    return expressionTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasAttributeExpression createAliasAttributeExpression()
  {
    AliasAttributeExpressionImpl aliasAttributeExpression = new AliasAttributeExpressionImpl();
    return aliasAttributeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression createParameterExpression()
  {
    ParameterExpressionImpl parameterExpression = new ParameterExpressionImpl();
    return parameterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerExpression createIntegerExpression()
  {
    IntegerExpressionImpl integerExpression = new IntegerExpressionImpl();
    return integerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullExpression createNullExpression()
  {
    NullExpressionImpl nullExpression = new NullExpressionImpl();
    return nullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPQLPackage getJPQLPackage()
  {
    return (JPQLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JPQLPackage getPackage()
  {
    return JPQLPackage.eINSTANCE;
  }

} //JPQLFactoryImpl
