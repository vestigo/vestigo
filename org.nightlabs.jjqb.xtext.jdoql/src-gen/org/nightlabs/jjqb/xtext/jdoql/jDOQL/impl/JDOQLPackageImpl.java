/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalAndExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalOrExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.DeclaredParameterName;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.FieldAccessExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLFactory;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpec;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleAndExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleOrExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JDOQLPackageImpl extends EPackageImpl implements JDOQLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleStringJDOQLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intoClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultNamingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whereClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablesClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaredParameterNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonOperatorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldAccessExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum additionOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicationOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparisonOperatorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JDOQLPackageImpl()
  {
    super(eNS_URI, JDOQLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JDOQLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JDOQLPackage init()
  {
    if (isInited) return (JDOQLPackage)EPackage.Registry.INSTANCE.getEPackage(JDOQLPackage.eNS_URI);

    // Obtain or create and register package
    JDOQLPackageImpl theJDOQLPackage = (JDOQLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JDOQLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JDOQLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJDOQLPackage.createPackageContents();

    // Initialize created meta-data
    theJDOQLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJDOQLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JDOQLPackage.eNS_URI, theJDOQLPackage);
    return theJDOQLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleStringJDOQL()
  {
    return singleStringJDOQLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleStringJDOQL_SelectClause()
  {
    return (EReference)singleStringJDOQLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleStringJDOQL_FromClause()
  {
    return (EReference)singleStringJDOQLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleStringJDOQL_WhereClause()
  {
    return (EReference)singleStringJDOQLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleStringJDOQL_VariablesClause()
  {
    return (EReference)singleStringJDOQLEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleStringJDOQL_ParametersClause()
  {
    return (EReference)singleStringJDOQLEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleStringJDOQL_ImportClause()
  {
    return (EReference)singleStringJDOQLEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleStringJDOQL_GroupByClause()
  {
    return (EAttribute)singleStringJDOQLEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleStringJDOQL_OrderByClause()
  {
    return (EAttribute)singleStringJDOQLEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleStringJDOQL_RangeClause()
  {
    return (EAttribute)singleStringJDOQLEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectClause()
  {
    return selectClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectClause_IsUnique()
  {
    return (EAttribute)selectClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectClause_ResultClause()
  {
    return (EReference)selectClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectClause_IntoClause()
  {
    return (EReference)selectClauseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultClause()
  {
    return resultClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultClause_IsDistinct()
  {
    return (EAttribute)resultClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResultClause_ResultSpecs()
  {
    return (EReference)resultClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntoClause()
  {
    return intoClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntoClause_ResultClassName()
  {
    return (EAttribute)intoClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultSpec()
  {
    return resultSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultNaming()
  {
    return resultNamingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultNaming_Identifier()
  {
    return (EAttribute)resultNamingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromClause()
  {
    return fromClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromClause_CandidateClassName()
  {
    return (EAttribute)fromClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromClause_IsExcludeSubclasses()
  {
    return (EAttribute)fromClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhereClause()
  {
    return whereClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhereClause_Filter()
  {
    return (EReference)whereClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariablesClause()
  {
    return variablesClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariablesClause_VariableDeclarations()
  {
    return (EReference)variablesClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Type()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_VariableName()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametersClause()
  {
    return parametersClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParametersClause_ParameterDeclarations()
  {
    return (EReference)parametersClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterDeclaration()
  {
    return parameterDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterDeclaration_Type()
  {
    return (EAttribute)parameterDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterDeclaration_DeclaredParameterName()
  {
    return (EReference)parameterDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaredParameterName()
  {
    return declaredParameterNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaredParameterName_Name()
  {
    return (EAttribute)declaredParameterNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportClause()
  {
    return importClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportClause_ImportDeclarations()
  {
    return (EAttribute)importClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_ResultNaming()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_UnaryOperator()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Right()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Literal()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_This()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Id()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_ParameterName()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Left()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalOrExpression()
  {
    return conditionalOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalAndExpression()
  {
    return conditionalAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleOrExpression()
  {
    return simpleOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleAndExpression()
  {
    return simpleAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonOperatorExpression()
  {
    return comparisonOperatorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonOperatorExpression_Operator()
  {
    return (EAttribute)comparisonOperatorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditionExpression()
  {
    return additionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditionExpression_Operator()
  {
    return (EAttribute)additionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicationExpression()
  {
    return multiplicationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicationExpression_Operator()
  {
    return (EAttribute)multiplicationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldAccessExpression()
  {
    return fieldAccessExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryOperator()
  {
    return unaryOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAdditionOperator()
  {
    return additionOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiplicationOperator()
  {
    return multiplicationOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getComparisonOperator()
  {
    return comparisonOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JDOQLFactory getJDOQLFactory()
  {
    return (JDOQLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    singleStringJDOQLEClass = createEClass(SINGLE_STRING_JDOQL);
    createEReference(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__SELECT_CLAUSE);
    createEReference(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__FROM_CLAUSE);
    createEReference(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__WHERE_CLAUSE);
    createEReference(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__VARIABLES_CLAUSE);
    createEReference(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE);
    createEReference(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__IMPORT_CLAUSE);
    createEAttribute(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE);
    createEAttribute(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE);
    createEAttribute(singleStringJDOQLEClass, SINGLE_STRING_JDOQL__RANGE_CLAUSE);

    selectClauseEClass = createEClass(SELECT_CLAUSE);
    createEAttribute(selectClauseEClass, SELECT_CLAUSE__IS_UNIQUE);
    createEReference(selectClauseEClass, SELECT_CLAUSE__RESULT_CLAUSE);
    createEReference(selectClauseEClass, SELECT_CLAUSE__INTO_CLAUSE);

    resultClauseEClass = createEClass(RESULT_CLAUSE);
    createEAttribute(resultClauseEClass, RESULT_CLAUSE__IS_DISTINCT);
    createEReference(resultClauseEClass, RESULT_CLAUSE__RESULT_SPECS);

    intoClauseEClass = createEClass(INTO_CLAUSE);
    createEAttribute(intoClauseEClass, INTO_CLAUSE__RESULT_CLASS_NAME);

    resultSpecEClass = createEClass(RESULT_SPEC);

    resultNamingEClass = createEClass(RESULT_NAMING);
    createEAttribute(resultNamingEClass, RESULT_NAMING__IDENTIFIER);

    fromClauseEClass = createEClass(FROM_CLAUSE);
    createEAttribute(fromClauseEClass, FROM_CLAUSE__CANDIDATE_CLASS_NAME);
    createEAttribute(fromClauseEClass, FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES);

    whereClauseEClass = createEClass(WHERE_CLAUSE);
    createEReference(whereClauseEClass, WHERE_CLAUSE__FILTER);

    variablesClauseEClass = createEClass(VARIABLES_CLAUSE);
    createEReference(variablesClauseEClass, VARIABLES_CLAUSE__VARIABLE_DECLARATIONS);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE_NAME);

    parametersClauseEClass = createEClass(PARAMETERS_CLAUSE);
    createEReference(parametersClauseEClass, PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS);

    parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);
    createEAttribute(parameterDeclarationEClass, PARAMETER_DECLARATION__TYPE);
    createEReference(parameterDeclarationEClass, PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME);

    declaredParameterNameEClass = createEClass(DECLARED_PARAMETER_NAME);
    createEAttribute(declaredParameterNameEClass, DECLARED_PARAMETER_NAME__NAME);

    importClauseEClass = createEClass(IMPORT_CLAUSE);
    createEAttribute(importClauseEClass, IMPORT_CLAUSE__IMPORT_DECLARATIONS);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__RESULT_NAMING);
    createEAttribute(expressionEClass, EXPRESSION__UNARY_OPERATOR);
    createEReference(expressionEClass, EXPRESSION__RIGHT);
    createEAttribute(expressionEClass, EXPRESSION__LITERAL);
    createEAttribute(expressionEClass, EXPRESSION__THIS);
    createEAttribute(expressionEClass, EXPRESSION__ID);
    createEAttribute(expressionEClass, EXPRESSION__PARAMETER_NAME);
    createEReference(expressionEClass, EXPRESSION__LEFT);

    conditionalOrExpressionEClass = createEClass(CONDITIONAL_OR_EXPRESSION);

    conditionalAndExpressionEClass = createEClass(CONDITIONAL_AND_EXPRESSION);

    simpleOrExpressionEClass = createEClass(SIMPLE_OR_EXPRESSION);

    simpleAndExpressionEClass = createEClass(SIMPLE_AND_EXPRESSION);

    comparisonOperatorExpressionEClass = createEClass(COMPARISON_OPERATOR_EXPRESSION);
    createEAttribute(comparisonOperatorExpressionEClass, COMPARISON_OPERATOR_EXPRESSION__OPERATOR);

    additionExpressionEClass = createEClass(ADDITION_EXPRESSION);
    createEAttribute(additionExpressionEClass, ADDITION_EXPRESSION__OPERATOR);

    multiplicationExpressionEClass = createEClass(MULTIPLICATION_EXPRESSION);
    createEAttribute(multiplicationExpressionEClass, MULTIPLICATION_EXPRESSION__OPERATOR);

    fieldAccessExpressionEClass = createEClass(FIELD_ACCESS_EXPRESSION);

    // Create enums
    unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
    additionOperatorEEnum = createEEnum(ADDITION_OPERATOR);
    multiplicationOperatorEEnum = createEEnum(MULTIPLICATION_OPERATOR);
    comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    expressionEClass.getESuperTypes().add(this.getResultSpec());
    conditionalOrExpressionEClass.getESuperTypes().add(this.getExpression());
    conditionalAndExpressionEClass.getESuperTypes().add(this.getExpression());
    simpleOrExpressionEClass.getESuperTypes().add(this.getExpression());
    simpleAndExpressionEClass.getESuperTypes().add(this.getExpression());
    comparisonOperatorExpressionEClass.getESuperTypes().add(this.getExpression());
    additionExpressionEClass.getESuperTypes().add(this.getExpression());
    multiplicationExpressionEClass.getESuperTypes().add(this.getExpression());
    fieldAccessExpressionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(singleStringJDOQLEClass, SingleStringJDOQL.class, "SingleStringJDOQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleStringJDOQL_SelectClause(), this.getSelectClause(), null, "selectClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSingleStringJDOQL_FromClause(), this.getFromClause(), null, "fromClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSingleStringJDOQL_WhereClause(), this.getWhereClause(), null, "whereClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSingleStringJDOQL_VariablesClause(), this.getVariablesClause(), null, "variablesClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSingleStringJDOQL_ParametersClause(), this.getParametersClause(), null, "parametersClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSingleStringJDOQL_ImportClause(), this.getImportClause(), null, "importClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleStringJDOQL_GroupByClause(), ecorePackage.getEString(), "groupByClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleStringJDOQL_OrderByClause(), ecorePackage.getEString(), "orderByClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleStringJDOQL_RangeClause(), ecorePackage.getEString(), "rangeClause", null, 0, 1, SingleStringJDOQL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectClauseEClass, SelectClause.class, "SelectClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectClause_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, SelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectClause_ResultClause(), this.getResultClause(), null, "resultClause", null, 0, 1, SelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectClause_IntoClause(), this.getIntoClause(), null, "intoClause", null, 0, 1, SelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultClauseEClass, ResultClause.class, "ResultClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResultClause_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, ResultClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResultClause_ResultSpecs(), this.getResultSpec(), null, "resultSpecs", null, 0, -1, ResultClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intoClauseEClass, IntoClause.class, "IntoClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntoClause_ResultClassName(), ecorePackage.getEString(), "resultClassName", null, 0, 1, IntoClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resultSpecEClass, ResultSpec.class, "ResultSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resultNamingEClass, ResultNaming.class, "ResultNaming", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResultNaming_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ResultNaming.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromClauseEClass, FromClause.class, "FromClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFromClause_CandidateClassName(), ecorePackage.getEString(), "candidateClassName", null, 0, 1, FromClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFromClause_IsExcludeSubclasses(), ecorePackage.getEBoolean(), "isExcludeSubclasses", null, 0, 1, FromClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whereClauseEClass, WhereClause.class, "WhereClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhereClause_Filter(), this.getExpression(), null, "filter", null, 0, 1, WhereClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablesClauseEClass, VariablesClause.class, "VariablesClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariablesClause_VariableDeclarations(), this.getVariableDeclaration(), null, "variableDeclarations", null, 0, -1, VariablesClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametersClauseEClass, ParametersClause.class, "ParametersClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParametersClause_ParameterDeclarations(), this.getParameterDeclaration(), null, "parameterDeclarations", null, 0, -1, ParametersClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterDeclaration_Type(), ecorePackage.getEString(), "type", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterDeclaration_DeclaredParameterName(), this.getDeclaredParameterName(), null, "declaredParameterName", null, 0, 1, ParameterDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaredParameterNameEClass, DeclaredParameterName.class, "DeclaredParameterName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaredParameterName_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeclaredParameterName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importClauseEClass, ImportClause.class, "ImportClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportClause_ImportDeclarations(), ecorePackage.getEString(), "importDeclarations", null, 0, -1, ImportClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_ResultNaming(), this.getResultNaming(), null, "resultNaming", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_UnaryOperator(), this.getUnaryOperator(), "unaryOperator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Right(), this.getExpression(), null, "right", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_This(), ecorePackage.getEString(), "this", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Id(), ecorePackage.getEString(), "id", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Left(), this.getExpression(), null, "left", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalOrExpressionEClass, ConditionalOrExpression.class, "ConditionalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionalAndExpressionEClass, ConditionalAndExpression.class, "ConditionalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleOrExpressionEClass, SimpleOrExpression.class, "SimpleOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleAndExpressionEClass, SimpleAndExpression.class, "SimpleAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparisonOperatorExpressionEClass, ComparisonOperatorExpression.class, "ComparisonOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComparisonOperatorExpression_Operator(), this.getComparisonOperator(), "operator", null, 0, 1, ComparisonOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additionExpressionEClass, AdditionExpression.class, "AdditionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdditionExpression_Operator(), this.getAdditionOperator(), "operator", null, 0, 1, AdditionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationExpressionEClass, MultiplicationExpression.class, "MultiplicationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicationExpression_Operator(), this.getMultiplicationOperator(), "operator", null, 0, 1, MultiplicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldAccessExpressionEClass, FieldAccessExpression.class, "FieldAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.POSITIVE);
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NEGATIVE);
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.BITWISE_NOT);
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.LOGICAL_NOT);

    initEEnum(additionOperatorEEnum, AdditionOperator.class, "AdditionOperator");
    addEEnumLiteral(additionOperatorEEnum, AdditionOperator.ADD);
    addEEnumLiteral(additionOperatorEEnum, AdditionOperator.SUBTRACT);

    initEEnum(multiplicationOperatorEEnum, MultiplicationOperator.class, "MultiplicationOperator");
    addEEnumLiteral(multiplicationOperatorEEnum, MultiplicationOperator.MULTIPLY);
    addEEnumLiteral(multiplicationOperatorEEnum, MultiplicationOperator.DIVIDE);
    addEEnumLiteral(multiplicationOperatorEEnum, MultiplicationOperator.MODULO);

    initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THEN);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THEN);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.NOT_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.INSTANCEOF);

    // Create resource
    createResource(eNS_URI);
  }

} //JDOQLPackageImpl
