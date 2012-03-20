/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jpql.jPQL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nightlabs.jjqb.xtext.jpql.jPQL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage
 * @generated
 */
public class JPQLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JPQLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JPQLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JPQLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JPQLPackage.QUERY_MODULE:
      {
        QueryModule queryModule = (QueryModule)theEObject;
        T result = caseQueryModule(queryModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.JPQL_QUERY:
      {
        JPQLQuery jpqlQuery = (JPQLQuery)theEObject;
        T result = caseJPQLQuery(jpqlQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SELECT_STATEMENT:
      {
        SelectStatement selectStatement = (SelectStatement)theEObject;
        T result = caseSelectStatement(selectStatement);
        if (result == null) result = caseJPQLQuery(selectStatement);
        if (result == null) result = caseExpressionTerm(selectStatement);
        if (result == null) result = caseExpression(selectStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.GROUP_CLAUSE:
      {
        GroupClause groupClause = (GroupClause)theEObject;
        T result = caseGroupClause(groupClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.GROUP_ITEM:
      {
        GroupItem groupItem = (GroupItem)theEObject;
        T result = caseGroupItem(groupItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.HAVING_CLAUSE:
      {
        HavingClause havingClause = (HavingClause)theEObject;
        T result = caseHavingClause(havingClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.ORDER_CLAUSE:
      {
        OrderClause orderClause = (OrderClause)theEObject;
        T result = caseOrderClause(orderClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.ORDER_ITEM:
      {
        OrderItem orderItem = (OrderItem)theEObject;
        T result = caseOrderItem(orderItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.UPDATE_STATEMENT:
      {
        UpdateStatement updateStatement = (UpdateStatement)theEObject;
        T result = caseUpdateStatement(updateStatement);
        if (result == null) result = caseJPQLQuery(updateStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.UPDATE_CLAUSE:
      {
        UpdateClause updateClause = (UpdateClause)theEObject;
        T result = caseUpdateClause(updateClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SET_CLAUSE:
      {
        SetClause setClause = (SetClause)theEObject;
        T result = caseSetClause(setClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.UPDATE_ITEM:
      {
        UpdateItem updateItem = (UpdateItem)theEObject;
        T result = caseUpdateItem(updateItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.DELETE_STATEMENT:
      {
        DeleteStatement deleteStatement = (DeleteStatement)theEObject;
        T result = caseDeleteStatement(deleteStatement);
        if (result == null) result = caseJPQLQuery(deleteStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.DELETE_CLAUSE:
      {
        DeleteClause deleteClause = (DeleteClause)theEObject;
        T result = caseDeleteClause(deleteClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SELECT_FROM_CLAUSE:
      {
        SelectFromClause selectFromClause = (SelectFromClause)theEObject;
        T result = caseSelectFromClause(selectFromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SELECT_CLAUSE:
      {
        SelectClause selectClause = (SelectClause)theEObject;
        T result = caseSelectClause(selectClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SELECT_EXPRESSION:
      {
        SelectExpression selectExpression = (SelectExpression)theEObject;
        T result = caseSelectExpression(selectExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SELECT_AGGREGATE_EXPRESSION:
      {
        SelectAggregateExpression selectAggregateExpression = (SelectAggregateExpression)theEObject;
        T result = caseSelectAggregateExpression(selectAggregateExpression);
        if (result == null) result = caseSelectExpression(selectAggregateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.AVG_AGGREGATE:
      {
        AvgAggregate avgAggregate = (AvgAggregate)theEObject;
        T result = caseAvgAggregate(avgAggregate);
        if (result == null) result = caseSelectAggregateExpression(avgAggregate);
        if (result == null) result = caseSelectExpression(avgAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.MAX_AGGREGATE:
      {
        MaxAggregate maxAggregate = (MaxAggregate)theEObject;
        T result = caseMaxAggregate(maxAggregate);
        if (result == null) result = caseSelectAggregateExpression(maxAggregate);
        if (result == null) result = caseSelectExpression(maxAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.MIN_AGGREGATE:
      {
        MinAggregate minAggregate = (MinAggregate)theEObject;
        T result = caseMinAggregate(minAggregate);
        if (result == null) result = caseSelectAggregateExpression(minAggregate);
        if (result == null) result = caseSelectExpression(minAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SUM_AGGREGATE:
      {
        SumAggregate sumAggregate = (SumAggregate)theEObject;
        T result = caseSumAggregate(sumAggregate);
        if (result == null) result = caseSelectAggregateExpression(sumAggregate);
        if (result == null) result = caseSelectExpression(sumAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.COUNT_AGGREGATE:
      {
        CountAggregate countAggregate = (CountAggregate)theEObject;
        T result = caseCountAggregate(countAggregate);
        if (result == null) result = caseSelectAggregateExpression(countAggregate);
        if (result == null) result = caseSelectExpression(countAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SELECT_CONSTRUCTOR_EXPRESSION:
      {
        SelectConstructorExpression selectConstructorExpression = (SelectConstructorExpression)theEObject;
        T result = caseSelectConstructorExpression(selectConstructorExpression);
        if (result == null) result = caseSelectExpression(selectConstructorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.FROM_CLAUSE:
      {
        FromClause fromClause = (FromClause)theEObject;
        T result = caseFromClause(fromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.FROM_ENTRY:
      {
        FromEntry fromEntry = (FromEntry)theEObject;
        T result = caseFromEntry(fromEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.FROM_CLASS:
      {
        FromClass fromClass = (FromClass)theEObject;
        T result = caseFromClass(fromClass);
        if (result == null) result = caseFromEntry(fromClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.FROM_COLLECTION:
      {
        FromCollection fromCollection = (FromCollection)theEObject;
        T result = caseFromCollection(fromCollection);
        if (result == null) result = caseFromEntry(fromCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.FROM_JOIN:
      {
        FromJoin fromJoin = (FromJoin)theEObject;
        T result = caseFromJoin(fromJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.JOIN:
      {
        Join join = (Join)theEObject;
        T result = caseJoin(join);
        if (result == null) result = caseFromJoin(join);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.LEFT_JOIN:
      {
        LeftJoin leftJoin = (LeftJoin)theEObject;
        T result = caseLeftJoin(leftJoin);
        if (result == null) result = caseFromJoin(leftJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.INNER_JOIN:
      {
        InnerJoin innerJoin = (InnerJoin)theEObject;
        T result = caseInnerJoin(innerJoin);
        if (result == null) result = caseFromJoin(innerJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.WHERE_CLAUSE:
      {
        WhereClause whereClause = (WhereClause)theEObject;
        T result = caseWhereClause(whereClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.OPERATOR_EXPRESSION:
      {
        OperatorExpression operatorExpression = (OperatorExpression)theEObject;
        T result = caseOperatorExpression(operatorExpression);
        if (result == null) result = caseExpression(operatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.EXISTS_EXPRESSION:
      {
        ExistsExpression existsExpression = (ExistsExpression)theEObject;
        T result = caseExistsExpression(existsExpression);
        if (result == null) result = caseExpression(existsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.ALL_EXPRESSION:
      {
        AllExpression allExpression = (AllExpression)theEObject;
        T result = caseAllExpression(allExpression);
        if (result == null) result = caseExpression(allExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.ANY_EXPRESSION:
      {
        AnyExpression anyExpression = (AnyExpression)theEObject;
        T result = caseAnyExpression(anyExpression);
        if (result == null) result = caseExpression(anyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.SOME_EXPRESSION:
      {
        SomeExpression someExpression = (SomeExpression)theEObject;
        T result = caseSomeExpression(someExpression);
        if (result == null) result = caseExpression(someExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.COLLECTION_EXPRESSION:
      {
        CollectionExpression collectionExpression = (CollectionExpression)theEObject;
        T result = caseCollectionExpression(collectionExpression);
        if (result == null) result = caseExpression(collectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.NULL_COMPARISON_EXPRESSION:
      {
        NullComparisonExpression nullComparisonExpression = (NullComparisonExpression)theEObject;
        T result = caseNullComparisonExpression(nullComparisonExpression);
        if (result == null) result = caseExpression(nullComparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.EMPTY_COMPARISON_EXPRESSION:
      {
        EmptyComparisonExpression emptyComparisonExpression = (EmptyComparisonExpression)theEObject;
        T result = caseEmptyComparisonExpression(emptyComparisonExpression);
        if (result == null) result = caseExpression(emptyComparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.LIKE_EXPRESSION:
      {
        LikeExpression likeExpression = (LikeExpression)theEObject;
        T result = caseLikeExpression(likeExpression);
        if (result == null) result = caseExpression(likeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.IN_EXPRESSION:
      {
        InExpression inExpression = (InExpression)theEObject;
        T result = caseInExpression(inExpression);
        if (result == null) result = caseExpression(inExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.IN_SEQ_EXPRESSION:
      {
        InSeqExpression inSeqExpression = (InSeqExpression)theEObject;
        T result = caseInSeqExpression(inSeqExpression);
        if (result == null) result = caseInExpression(inSeqExpression);
        if (result == null) result = caseExpression(inSeqExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.IN_QUERY_EXPRESSION:
      {
        InQueryExpression inQueryExpression = (InQueryExpression)theEObject;
        T result = caseInQueryExpression(inQueryExpression);
        if (result == null) result = caseInExpression(inQueryExpression);
        if (result == null) result = caseExpression(inQueryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.BETWEEN_EXPRESSION:
      {
        BetweenExpression betweenExpression = (BetweenExpression)theEObject;
        T result = caseBetweenExpression(betweenExpression);
        if (result == null) result = caseExpression(betweenExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseExpressionTerm(variable);
        if (result == null) result = caseExpression(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.EXPRESSION_TERM:
      {
        ExpressionTerm expressionTerm = (ExpressionTerm)theEObject;
        T result = caseExpressionTerm(expressionTerm);
        if (result == null) result = caseExpression(expressionTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION:
      {
        AliasAttributeExpression aliasAttributeExpression = (AliasAttributeExpression)theEObject;
        T result = caseAliasAttributeExpression(aliasAttributeExpression);
        if (result == null) result = caseSelectExpression(aliasAttributeExpression);
        if (result == null) result = caseVariable(aliasAttributeExpression);
        if (result == null) result = caseExpressionTerm(aliasAttributeExpression);
        if (result == null) result = caseExpression(aliasAttributeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.PARAMETER_EXPRESSION:
      {
        ParameterExpression parameterExpression = (ParameterExpression)theEObject;
        T result = caseParameterExpression(parameterExpression);
        if (result == null) result = caseVariable(parameterExpression);
        if (result == null) result = caseExpressionTerm(parameterExpression);
        if (result == null) result = caseExpression(parameterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseVariable(value);
        if (result == null) result = caseExpressionTerm(value);
        if (result == null) result = caseExpression(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.INTEGER_EXPRESSION:
      {
        IntegerExpression integerExpression = (IntegerExpression)theEObject;
        T result = caseIntegerExpression(integerExpression);
        if (result == null) result = caseValue(integerExpression);
        if (result == null) result = caseVariable(integerExpression);
        if (result == null) result = caseExpressionTerm(integerExpression);
        if (result == null) result = caseExpression(integerExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.STRING_EXPRESSION:
      {
        StringExpression stringExpression = (StringExpression)theEObject;
        T result = caseStringExpression(stringExpression);
        if (result == null) result = caseValue(stringExpression);
        if (result == null) result = caseVariable(stringExpression);
        if (result == null) result = caseExpressionTerm(stringExpression);
        if (result == null) result = caseExpression(stringExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.NULL_EXPRESSION:
      {
        NullExpression nullExpression = (NullExpression)theEObject;
        T result = caseNullExpression(nullExpression);
        if (result == null) result = caseValue(nullExpression);
        if (result == null) result = caseVariable(nullExpression);
        if (result == null) result = caseExpressionTerm(nullExpression);
        if (result == null) result = caseExpression(nullExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = caseValue(booleanExpression);
        if (result == null) result = caseVariable(booleanExpression);
        if (result == null) result = caseExpressionTerm(booleanExpression);
        if (result == null) result = caseExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JPQLPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryModule(QueryModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJPQLQuery(JPQLQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectStatement(SelectStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupClause(GroupClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupItem(GroupItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Having Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Having Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHavingClause(HavingClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderClause(OrderClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderItem(OrderItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateStatement(UpdateStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateClause(UpdateClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetClause(SetClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateItem(UpdateItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteStatement(DeleteStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteClause(DeleteClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select From Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select From Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectFromClause(SelectFromClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectClause(SelectClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectExpression(SelectExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Aggregate Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Aggregate Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectAggregateExpression(SelectAggregateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Avg Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Avg Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAvgAggregate(AvgAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxAggregate(MaxAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinAggregate(MinAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sum Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sum Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSumAggregate(SumAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountAggregate(CountAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Constructor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Constructor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectConstructorExpression(SelectConstructorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromClause(FromClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromEntry(FromEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromClass(FromClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromCollection(FromCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFromJoin(FromJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoin(Join object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftJoin(LeftJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inner Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inner Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInnerJoin(InnerJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhereClause(WhereClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorExpression(OperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exists Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistsExpression(ExistsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllExpression(AllExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyExpression(AnyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Some Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Some Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSomeExpression(SomeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionExpression(CollectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullComparisonExpression(NullComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyComparisonExpression(EmptyComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Like Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Like Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLikeExpression(LikeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInExpression(InExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Seq Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Seq Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInSeqExpression(InSeqExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Query Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Query Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInQueryExpression(InQueryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Between Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Between Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBetweenExpression(BetweenExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionTerm(ExpressionTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Attribute Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Attribute Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasAttributeExpression(AliasAttributeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterExpression(ParameterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerExpression(IntegerExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringExpression(StringExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullExpression(NullExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JPQLSwitch
