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
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
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
      public Adapter caseFrom(From object)
      {
        return createFromAdapter();
      }
      @Override
      public Adapter caseWhere(Where object)
      {
        return createWhereAdapter();
      }
      @Override
      public Adapter caseExcludeClause(ExcludeClause object)
      {
        return createExcludeClauseAdapter();
      }
      @Override
      public Adapter caseResultSpecs(ResultSpecs object)
      {
        return createResultSpecsAdapter();
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
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
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
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select
   * @generated
   */
  public Adapter createSelectAdapter()
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
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.From
   * @generated
   */
  public Adapter createFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where
   * @generated
   */
  public Adapter createWhereAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause <em>Exclude Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause
   * @generated
   */
  public Adapter createExcludeClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpecs <em>Result Specs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpecs
   * @generated
   */
  public Adapter createResultSpecsAdapter()
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
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
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
