/**
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AvgAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.CountAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Expression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ExpressionTerm;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.InnerJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLFactory;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLQuery;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Join;
import org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Literal;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MaxAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MinAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.NullLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByDirection;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderBySpec;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectAggregateExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.StringLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SumAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.TrimSpec;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UnaryOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Variable;
import org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration;
import org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause;

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
      JPQLFactory theJPQLFactory = (JPQLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.nightlabs.org/vestigo/xtext/jdoql/JPQL"); 
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
      case JPQLPackage.GROUP_BY_CLAUSE: return createGroupByClause();
      case JPQLPackage.HAVING_CLAUSE: return createHavingClause();
      case JPQLPackage.ORDER_BY_CLAUSE: return createOrderByClause();
      case JPQLPackage.ORDER_BY_SPEC: return createOrderBySpec();
      case JPQLPackage.UPDATE_STATEMENT: return createUpdateStatement();
      case JPQLPackage.UPDATE_CLAUSE: return createUpdateClause();
      case JPQLPackage.SET_CLAUSE: return createSetClause();
      case JPQLPackage.UPDATE_ITEM: return createUpdateItem();
      case JPQLPackage.DELETE_STATEMENT: return createDeleteStatement();
      case JPQLPackage.DELETE_CLAUSE: return createDeleteClause();
      case JPQLPackage.SELECT_CLAUSE: return createSelectClause();
      case JPQLPackage.SELECT_EXPRESSION: return createSelectExpression();
      case JPQLPackage.SELECT_AGGREGATE_EXPRESSION: return createSelectAggregateExpression();
      case JPQLPackage.AVG_AGGREGATE: return createAvgAggregate();
      case JPQLPackage.COUNT_AGGREGATE: return createCountAggregate();
      case JPQLPackage.MAX_AGGREGATE: return createMaxAggregate();
      case JPQLPackage.MIN_AGGREGATE: return createMinAggregate();
      case JPQLPackage.SUM_AGGREGATE: return createSumAggregate();
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
      case JPQLPackage.VARIABLE: return createVariable();
      case JPQLPackage.EXPRESSION_TERM: return createExpressionTerm();
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION: return createAliasAttributeExpression();
      case JPQLPackage.PARAMETER_EXPRESSION: return createParameterExpression();
      case JPQLPackage.FUNCTION_EXPRESSION: return createFunctionExpression();
      case JPQLPackage.LITERAL: return createLiteral();
      case JPQLPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case JPQLPackage.FLOAT_LITERAL: return createFloatLiteral();
      case JPQLPackage.FLOAT: return createFloat();
      case JPQLPackage.STRING_LITERAL: return createStringLiteral();
      case JPQLPackage.NULL_LITERAL: return createNullLiteral();
      case JPQLPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case JPQLPackage.OR_EXPRESSION: return createOrExpression();
      case JPQLPackage.AND_EXPRESSION: return createAndExpression();
      case JPQLPackage.COMPARISON_OPERATOR_EXPRESSION: return createComparisonOperatorExpression();
      case JPQLPackage.ADDITION_EXPRESSION: return createAdditionExpression();
      case JPQLPackage.MULTIPLICATION_EXPRESSION: return createMultiplicationExpression();
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
      case JPQLPackage.ORDER_BY_DIRECTION:
        return createOrderByDirectionFromString(eDataType, initialValue);
      case JPQLPackage.TRIM_SPEC:
        return createTrimSpecFromString(eDataType, initialValue);
      case JPQLPackage.UNARY_OPERATOR:
        return createUnaryOperatorFromString(eDataType, initialValue);
      case JPQLPackage.ADDITION_OPERATOR:
        return createAdditionOperatorFromString(eDataType, initialValue);
      case JPQLPackage.MULTIPLICATION_OPERATOR:
        return createMultiplicationOperatorFromString(eDataType, initialValue);
      case JPQLPackage.COMPARISON_OPERATOR:
        return createComparisonOperatorFromString(eDataType, initialValue);
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
      case JPQLPackage.ORDER_BY_DIRECTION:
        return convertOrderByDirectionToString(eDataType, instanceValue);
      case JPQLPackage.TRIM_SPEC:
        return convertTrimSpecToString(eDataType, instanceValue);
      case JPQLPackage.UNARY_OPERATOR:
        return convertUnaryOperatorToString(eDataType, instanceValue);
      case JPQLPackage.ADDITION_OPERATOR:
        return convertAdditionOperatorToString(eDataType, instanceValue);
      case JPQLPackage.MULTIPLICATION_OPERATOR:
        return convertMultiplicationOperatorToString(eDataType, instanceValue);
      case JPQLPackage.COMPARISON_OPERATOR:
        return convertComparisonOperatorToString(eDataType, instanceValue);
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
  public GroupByClause createGroupByClause()
  {
    GroupByClauseImpl groupByClause = new GroupByClauseImpl();
    return groupByClause;
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
  public OrderByClause createOrderByClause()
  {
    OrderByClauseImpl orderByClause = new OrderByClauseImpl();
    return orderByClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderBySpec createOrderBySpec()
  {
    OrderBySpecImpl orderBySpec = new OrderBySpecImpl();
    return orderBySpec;
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
  public FunctionExpression createFunctionExpression()
  {
    FunctionExpressionImpl functionExpression = new FunctionExpressionImpl();
    return functionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.nightlabs.vestigo.xtext.jpql.jPQL.Float createFloat()
  {
    FloatImpl float_ = new FloatImpl();
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
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
  public ComparisonOperatorExpression createComparisonOperatorExpression()
  {
    ComparisonOperatorExpressionImpl comparisonOperatorExpression = new ComparisonOperatorExpressionImpl();
    return comparisonOperatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionExpression createAdditionExpression()
  {
    AdditionExpressionImpl additionExpression = new AdditionExpressionImpl();
    return additionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationExpression createMultiplicationExpression()
  {
    MultiplicationExpressionImpl multiplicationExpression = new MultiplicationExpressionImpl();
    return multiplicationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderByDirection createOrderByDirectionFromString(EDataType eDataType, String initialValue)
  {
    OrderByDirection result = OrderByDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOrderByDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrimSpec createTrimSpecFromString(EDataType eDataType, String initialValue)
  {
    TrimSpec result = TrimSpec.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTrimSpecToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue)
  {
    UnaryOperator result = UnaryOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionOperator createAdditionOperatorFromString(EDataType eDataType, String initialValue)
  {
    AdditionOperator result = AdditionOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAdditionOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicationOperator createMultiplicationOperatorFromString(EDataType eDataType, String initialValue)
  {
    MultiplicationOperator result = MultiplicationOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicationOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue)
  {
    ComparisonOperator result = ComparisonOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue)
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
