/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.ecore.EClass;
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
      case JDOQLPackage.SELECT: return createSelect();
      case JDOQLPackage.RESULT_CLAUSE: return createResultClause();
      case JDOQLPackage.INTO_CLAUSE: return createIntoClause();
      case JDOQLPackage.FROM: return createFrom();
      case JDOQLPackage.WHERE: return createWhere();
      case JDOQLPackage.EXCLUDE_CLAUSE: return createExcludeClause();
      case JDOQLPackage.RESULT_SPECS: return createResultSpecs();
      case JDOQLPackage.RESULT_SPEC: return createResultSpec();
      case JDOQLPackage.RESULT_NAMING: return createResultNaming();
      case JDOQLPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case JDOQLPackage.EXPRESSION: return createExpression();
      case JDOQLPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case JDOQLPackage.PRIMARY: return createPrimary();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
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
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Where createWhere()
  {
    WhereImpl where = new WhereImpl();
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcludeClause createExcludeClause()
  {
    ExcludeClauseImpl excludeClause = new ExcludeClauseImpl();
    return excludeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultSpecs createResultSpecs()
  {
    ResultSpecsImpl resultSpecs = new ResultSpecsImpl();
    return resultSpecs;
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
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
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
