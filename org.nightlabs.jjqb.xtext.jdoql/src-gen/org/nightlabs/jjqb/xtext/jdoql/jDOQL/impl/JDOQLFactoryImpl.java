/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JDOQLFactoryImpl extends EFactoryImpl implements JDOQLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JDOQLFactory init()
  {
    try
    {
      JDOQLFactory theJDOQLFactory = (JDOQLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.nightlabs.org/jjqb/xtext/jdoql/JDOQL"); 
      if (theJDOQLFactory != null)
      {
        return theJDOQLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JDOQLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JDOQLFactoryImpl()
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
      case JDOQLPackage.SINGLE_STRING_JDOQL: return createSingleStringJDOQL();
      case JDOQLPackage.SUBQUERY: return createSubquery();
      case JDOQLPackage.SELECT_CLAUSE: return createSelectClause();
      case JDOQLPackage.SUBQUERY_SELECT_CLAUSE: return createSubquerySelectClause();
      case JDOQLPackage.RESULT_CLAUSE: return createResultClause();
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE: return createSubqueryResultClause();
      case JDOQLPackage.INTO_CLAUSE: return createIntoClause();
      case JDOQLPackage.RESULT_SPEC: return createResultSpec();
      case JDOQLPackage.RESULT_NAMING: return createResultNaming();
      case JDOQLPackage.FROM_CLAUSE: return createFromClause();
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE: return createSubqueryFromClause();
      case JDOQLPackage.ALIAS: return createAlias();
      case JDOQLPackage.WHERE_CLAUSE: return createWhereClause();
      case JDOQLPackage.VARIABLES_CLAUSE: return createVariablesClause();
      case JDOQLPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case JDOQLPackage.PARAMETERS_CLAUSE: return createParametersClause();
      case JDOQLPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case JDOQLPackage.IMPORT_CLAUSE: return createImportClause();
      case JDOQLPackage.GROUP_BY_CLAUSE: return createGroupByClause();
      case JDOQLPackage.HAVING_CLAUSE: return createHavingClause();
      case JDOQLPackage.ORDER_BY_CLAUSE: return createOrderByClause();
      case JDOQLPackage.ORDER_BY_SPEC: return createOrderBySpec();
      case JDOQLPackage.RANGE_CLAUSE: return createRangeClause();
      case JDOQLPackage.EXPRESSION: return createExpression();
      case JDOQLPackage.CONDITIONAL_OR_EXPRESSION: return createConditionalOrExpression();
      case JDOQLPackage.CONDITIONAL_AND_EXPRESSION: return createConditionalAndExpression();
      case JDOQLPackage.SIMPLE_OR_EXPRESSION: return createSimpleOrExpression();
      case JDOQLPackage.SIMPLE_AND_EXPRESSION: return createSimpleAndExpression();
      case JDOQLPackage.COMPARISON_OPERATOR_EXPRESSION: return createComparisonOperatorExpression();
      case JDOQLPackage.ADDITION_EXPRESSION: return createAdditionExpression();
      case JDOQLPackage.MULTIPLICATION_EXPRESSION: return createMultiplicationExpression();
      case JDOQLPackage.FIELD_ACCESS_EXPRESSION: return createFieldAccessExpression();
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
      case JDOQLPackage.ORDER_BY_DIRECTION:
        return createOrderByDirectionFromString(eDataType, initialValue);
      case JDOQLPackage.UNARY_OPERATOR:
        return createUnaryOperatorFromString(eDataType, initialValue);
      case JDOQLPackage.ADDITION_OPERATOR:
        return createAdditionOperatorFromString(eDataType, initialValue);
      case JDOQLPackage.MULTIPLICATION_OPERATOR:
        return createMultiplicationOperatorFromString(eDataType, initialValue);
      case JDOQLPackage.COMPARISON_OPERATOR:
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
      case JDOQLPackage.ORDER_BY_DIRECTION:
        return convertOrderByDirectionToString(eDataType, instanceValue);
      case JDOQLPackage.UNARY_OPERATOR:
        return convertUnaryOperatorToString(eDataType, instanceValue);
      case JDOQLPackage.ADDITION_OPERATOR:
        return convertAdditionOperatorToString(eDataType, instanceValue);
      case JDOQLPackage.MULTIPLICATION_OPERATOR:
        return convertMultiplicationOperatorToString(eDataType, instanceValue);
      case JDOQLPackage.COMPARISON_OPERATOR:
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
  public SingleStringJDOQL createSingleStringJDOQL()
  {
    SingleStringJDOQLImpl singleStringJDOQL = new SingleStringJDOQLImpl();
    return singleStringJDOQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subquery createSubquery()
  {
    SubqueryImpl subquery = new SubqueryImpl();
    return subquery;
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
  public SubquerySelectClause createSubquerySelectClause()
  {
    SubquerySelectClauseImpl subquerySelectClause = new SubquerySelectClauseImpl();
    return subquerySelectClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultClause createResultClause()
  {
    ResultClauseImpl resultClause = new ResultClauseImpl();
    return resultClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubqueryResultClause createSubqueryResultClause()
  {
    SubqueryResultClauseImpl subqueryResultClause = new SubqueryResultClauseImpl();
    return subqueryResultClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntoClause createIntoClause()
  {
    IntoClauseImpl intoClause = new IntoClauseImpl();
    return intoClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultSpec createResultSpec()
  {
    ResultSpecImpl resultSpec = new ResultSpecImpl();
    return resultSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultNaming createResultNaming()
  {
    ResultNamingImpl resultNaming = new ResultNamingImpl();
    return resultNaming;
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
  public SubqueryFromClause createSubqueryFromClause()
  {
    SubqueryFromClauseImpl subqueryFromClause = new SubqueryFromClauseImpl();
    return subqueryFromClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
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
  public VariablesClause createVariablesClause()
  {
    VariablesClauseImpl variablesClause = new VariablesClauseImpl();
    return variablesClause;
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
  public ParametersClause createParametersClause()
  {
    ParametersClauseImpl parametersClause = new ParametersClauseImpl();
    return parametersClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportClause createImportClause()
  {
    ImportClauseImpl importClause = new ImportClauseImpl();
    return importClause;
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
  public RangeClause createRangeClause()
  {
    RangeClauseImpl rangeClause = new RangeClauseImpl();
    return rangeClause;
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
  public ConditionalOrExpression createConditionalOrExpression()
  {
    ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
    return conditionalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalAndExpression createConditionalAndExpression()
  {
    ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
    return conditionalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleOrExpression createSimpleOrExpression()
  {
    SimpleOrExpressionImpl simpleOrExpression = new SimpleOrExpressionImpl();
    return simpleOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleAndExpression createSimpleAndExpression()
  {
    SimpleAndExpressionImpl simpleAndExpression = new SimpleAndExpressionImpl();
    return simpleAndExpression;
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
  public FieldAccessExpression createFieldAccessExpression()
  {
    FieldAccessExpressionImpl fieldAccessExpression = new FieldAccessExpressionImpl();
    return fieldAccessExpression;
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
  public JDOQLPackage getJDOQLPackage()
  {
    return (JDOQLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JDOQLPackage getPackage()
  {
    return JDOQLPackage.eINSTANCE;
  }

} //JDOQLFactoryImpl
