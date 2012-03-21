/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage
 * @generated
 */
public class JDOQLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JDOQLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JDOQLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JDOQLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JDOQLSwitch<Adapter> modelSwitch =
    new JDOQLSwitch<Adapter>()
    {
      @Override
      public Adapter caseSingleStringJDOQL(SingleStringJDOQL object)
      {
        return createSingleStringJDOQLAdapter();
      }
      @Override
      public Adapter caseSelectClause(SelectClause object)
      {
        return createSelectClauseAdapter();
      }
      @Override
      public Adapter caseResultClause(ResultClause object)
      {
        return createResultClauseAdapter();
      }
      @Override
      public Adapter caseIntoClause(IntoClause object)
      {
        return createIntoClauseAdapter();
      }
      @Override
      public Adapter caseResultSpec(ResultSpec object)
      {
        return createResultSpecAdapter();
      }
      @Override
      public Adapter caseResultNaming(ResultNaming object)
      {
        return createResultNamingAdapter();
      }
      @Override
      public Adapter caseFromClause(FromClause object)
      {
        return createFromClauseAdapter();
      }
      @Override
      public Adapter caseWhereClause(WhereClause object)
      {
        return createWhereClauseAdapter();
      }
      @Override
      public Adapter caseVariablesClause(VariablesClause object)
      {
        return createVariablesClauseAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseParametersClause(ParametersClause object)
      {
        return createParametersClauseAdapter();
      }
      @Override
      public Adapter caseParameterDeclaration(ParameterDeclaration object)
      {
        return createParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseDeclaredParameterName(DeclaredParameterName object)
      {
        return createDeclaredParameterNameAdapter();
      }
      @Override
      public Adapter caseImportClause(ImportClause object)
      {
        return createImportClauseAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalOrExpression(ConditionalOrExpression object)
      {
        return createConditionalOrExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalAndExpression(ConditionalAndExpression object)
      {
        return createConditionalAndExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleOrExpression(SimpleOrExpression object)
      {
        return createSimpleOrExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleAndExpression(SimpleAndExpression object)
      {
        return createSimpleAndExpressionAdapter();
      }
      @Override
      public Adapter caseComparisonOperatorExpression(ComparisonOperatorExpression object)
      {
        return createComparisonOperatorExpressionAdapter();
      }
      @Override
      public Adapter caseAdditionExpression(AdditionExpression object)
      {
        return createAdditionExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicationExpression(MultiplicationExpression object)
      {
        return createMultiplicationExpressionAdapter();
      }
      @Override
      public Adapter caseFieldAccessExpression(FieldAccessExpression object)
      {
        return createFieldAccessExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL <em>Single String JDOQL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL
   * @generated
   */
  public Adapter createSingleStringJDOQLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause
   * @generated
   */
  public Adapter createSelectClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause <em>Result Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause
   * @generated
   */
  public Adapter createResultClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause <em>Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause
   * @generated
   */
  public Adapter createIntoClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpec <em>Result Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpec
   * @generated
   */
  public Adapter createResultSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming <em>Result Naming</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming
   * @generated
   */
  public Adapter createResultNamingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause
   * @generated
   */
  public Adapter createFromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause
   * @generated
   */
  public Adapter createWhereClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause <em>Variables Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause
   * @generated
   */
  public Adapter createVariablesClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause <em>Parameters Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause
   * @generated
   */
  public Adapter createParametersClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration
   * @generated
   */
  public Adapter createParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.DeclaredParameterName <em>Declared Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.DeclaredParameterName
   * @generated
   */
  public Adapter createDeclaredParameterNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause <em>Import Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause
   * @generated
   */
  public Adapter createImportClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalOrExpression
   * @generated
   */
  public Adapter createConditionalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalAndExpression
   * @generated
   */
  public Adapter createConditionalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleOrExpression <em>Simple Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleOrExpression
   * @generated
   */
  public Adapter createSimpleOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleAndExpression <em>Simple And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleAndExpression
   * @generated
   */
  public Adapter createSimpleAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression <em>Comparison Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression
   * @generated
   */
  public Adapter createComparisonOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression
   * @generated
   */
  public Adapter createAdditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression
   * @generated
   */
  public Adapter createMultiplicationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.FieldAccessExpression <em>Field Access Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.FieldAccessExpression
   * @generated
   */
  public Adapter createFieldAccessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JDOQLAdapterFactory
