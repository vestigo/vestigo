/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.*;

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
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage
 * @generated
 */
public class JDOQLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JDOQLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JDOQLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JDOQLPackage.eINSTANCE;
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
      case JDOQLPackage.SINGLE_STRING_JDOQL:
      {
        SingleStringJDOQL singleStringJDOQL = (SingleStringJDOQL)theEObject;
        T result = caseSingleStringJDOQL(singleStringJDOQL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SUBQUERY:
      {
        Subquery subquery = (Subquery)theEObject;
        T result = caseSubquery(subquery);
        if (result == null) result = caseExpression(subquery);
        if (result == null) result = caseResultSpec(subquery);
        if (result == null) result = caseOrderBySpec(subquery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SELECT_CLAUSE:
      {
        SelectClause selectClause = (SelectClause)theEObject;
        T result = caseSelectClause(selectClause);
        if (result == null) result = caseSubquerySelectClause(selectClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SUBQUERY_SELECT_CLAUSE:
      {
        SubquerySelectClause subquerySelectClause = (SubquerySelectClause)theEObject;
        T result = caseSubquerySelectClause(subquerySelectClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.RESULT_CLAUSE:
      {
        ResultClause resultClause = (ResultClause)theEObject;
        T result = caseResultClause(resultClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SUBQUERY_RESULT_CLAUSE:
      {
        SubqueryResultClause subqueryResultClause = (SubqueryResultClause)theEObject;
        T result = caseSubqueryResultClause(subqueryResultClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.INTO_CLAUSE:
      {
        IntoClause intoClause = (IntoClause)theEObject;
        T result = caseIntoClause(intoClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.RESULT_SPEC:
      {
        ResultSpec resultSpec = (ResultSpec)theEObject;
        T result = caseResultSpec(resultSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.RESULT_NAMING:
      {
        ResultNaming resultNaming = (ResultNaming)theEObject;
        T result = caseResultNaming(resultNaming);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.FROM_CLAUSE:
      {
        FromClause fromClause = (FromClause)theEObject;
        T result = caseFromClause(fromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SUBQUERY_FROM_CLAUSE:
      {
        SubqueryFromClause subqueryFromClause = (SubqueryFromClause)theEObject;
        T result = caseSubqueryFromClause(subqueryFromClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.ALIAS:
      {
        Alias alias = (Alias)theEObject;
        T result = caseAlias(alias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.WHERE_CLAUSE:
      {
        WhereClause whereClause = (WhereClause)theEObject;
        T result = caseWhereClause(whereClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.VARIABLES_CLAUSE:
      {
        VariablesClause variablesClause = (VariablesClause)theEObject;
        T result = caseVariablesClause(variablesClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.PARAMETERS_CLAUSE:
      {
        ParametersClause parametersClause = (ParametersClause)theEObject;
        T result = caseParametersClause(parametersClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.PARAMETER_DECLARATION:
      {
        ParameterDeclaration parameterDeclaration = (ParameterDeclaration)theEObject;
        T result = caseParameterDeclaration(parameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.IMPORT_CLAUSE:
      {
        ImportClause importClause = (ImportClause)theEObject;
        T result = caseImportClause(importClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.GROUP_BY_CLAUSE:
      {
        GroupByClause groupByClause = (GroupByClause)theEObject;
        T result = caseGroupByClause(groupByClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.HAVING_CLAUSE:
      {
        HavingClause havingClause = (HavingClause)theEObject;
        T result = caseHavingClause(havingClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.ORDER_BY_CLAUSE:
      {
        OrderByClause orderByClause = (OrderByClause)theEObject;
        T result = caseOrderByClause(orderByClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.ORDER_BY_SPEC:
      {
        OrderBySpec orderBySpec = (OrderBySpec)theEObject;
        T result = caseOrderBySpec(orderBySpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.RANGE_CLAUSE:
      {
        RangeClause rangeClause = (RangeClause)theEObject;
        T result = caseRangeClause(rangeClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseResultSpec(expression);
        if (result == null) result = caseOrderBySpec(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.CONDITIONAL_OR_EXPRESSION:
      {
        ConditionalOrExpression conditionalOrExpression = (ConditionalOrExpression)theEObject;
        T result = caseConditionalOrExpression(conditionalOrExpression);
        if (result == null) result = caseExpression(conditionalOrExpression);
        if (result == null) result = caseResultSpec(conditionalOrExpression);
        if (result == null) result = caseOrderBySpec(conditionalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.CONDITIONAL_AND_EXPRESSION:
      {
        ConditionalAndExpression conditionalAndExpression = (ConditionalAndExpression)theEObject;
        T result = caseConditionalAndExpression(conditionalAndExpression);
        if (result == null) result = caseExpression(conditionalAndExpression);
        if (result == null) result = caseResultSpec(conditionalAndExpression);
        if (result == null) result = caseOrderBySpec(conditionalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SIMPLE_OR_EXPRESSION:
      {
        SimpleOrExpression simpleOrExpression = (SimpleOrExpression)theEObject;
        T result = caseSimpleOrExpression(simpleOrExpression);
        if (result == null) result = caseExpression(simpleOrExpression);
        if (result == null) result = caseResultSpec(simpleOrExpression);
        if (result == null) result = caseOrderBySpec(simpleOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.SIMPLE_AND_EXPRESSION:
      {
        SimpleAndExpression simpleAndExpression = (SimpleAndExpression)theEObject;
        T result = caseSimpleAndExpression(simpleAndExpression);
        if (result == null) result = caseExpression(simpleAndExpression);
        if (result == null) result = caseResultSpec(simpleAndExpression);
        if (result == null) result = caseOrderBySpec(simpleAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.COMPARISON_OPERATOR_EXPRESSION:
      {
        ComparisonOperatorExpression comparisonOperatorExpression = (ComparisonOperatorExpression)theEObject;
        T result = caseComparisonOperatorExpression(comparisonOperatorExpression);
        if (result == null) result = caseExpression(comparisonOperatorExpression);
        if (result == null) result = caseResultSpec(comparisonOperatorExpression);
        if (result == null) result = caseOrderBySpec(comparisonOperatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.ADDITION_EXPRESSION:
      {
        AdditionExpression additionExpression = (AdditionExpression)theEObject;
        T result = caseAdditionExpression(additionExpression);
        if (result == null) result = caseExpression(additionExpression);
        if (result == null) result = caseResultSpec(additionExpression);
        if (result == null) result = caseOrderBySpec(additionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.MULTIPLICATION_EXPRESSION:
      {
        MultiplicationExpression multiplicationExpression = (MultiplicationExpression)theEObject;
        T result = caseMultiplicationExpression(multiplicationExpression);
        if (result == null) result = caseExpression(multiplicationExpression);
        if (result == null) result = caseResultSpec(multiplicationExpression);
        if (result == null) result = caseOrderBySpec(multiplicationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JDOQLPackage.FIELD_ACCESS_EXPRESSION:
      {
        FieldAccessExpression fieldAccessExpression = (FieldAccessExpression)theEObject;
        T result = caseFieldAccessExpression(fieldAccessExpression);
        if (result == null) result = caseExpression(fieldAccessExpression);
        if (result == null) result = caseResultSpec(fieldAccessExpression);
        if (result == null) result = caseOrderBySpec(fieldAccessExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single String JDOQL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single String JDOQL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleStringJDOQL(SingleStringJDOQL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subquery</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subquery</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubquery(Subquery object)
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
   * Returns the result of interpreting the object as an instance of '<em>Subquery Select Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subquery Select Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubquerySelectClause(SubquerySelectClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultClause(ResultClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subquery Result Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subquery Result Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubqueryResultClause(SubqueryResultClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Into Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Into Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntoClause(IntoClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultSpec(ResultSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Result Naming</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Result Naming</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResultNaming(ResultNaming object)
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
   * Returns the result of interpreting the object as an instance of '<em>Subquery From Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subquery From Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubqueryFromClause(SubqueryFromClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlias(Alias object)
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
   * Returns the result of interpreting the object as an instance of '<em>Variables Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariablesClause(VariablesClause object)
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
   * Returns the result of interpreting the object as an instance of '<em>Parameters Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameters Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametersClause(ParametersClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDeclaration(ParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportClause(ImportClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group By Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group By Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupByClause(GroupByClause object)
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
   * Returns the result of interpreting the object as an instance of '<em>Order By Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order By Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderByClause(OrderByClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order By Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order By Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderBySpec(OrderBySpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeClause(RangeClause object)
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
   * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalOrExpression(ConditionalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalAndExpression(ConditionalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleOrExpression(SimpleOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleAndExpression(SimpleAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonOperatorExpression(ComparisonOperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionExpression(AdditionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicationExpression(MultiplicationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Access Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Access Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldAccessExpression(FieldAccessExpression object)
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

} //JDOQLSwitch
