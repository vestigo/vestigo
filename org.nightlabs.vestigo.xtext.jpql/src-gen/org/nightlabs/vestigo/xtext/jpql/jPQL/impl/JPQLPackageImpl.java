/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.vestigo.xtext.jpql.jPQL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AllExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AnyExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AvgAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.BetweenExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.CollectionExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperator;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.CountAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.EmptyComparisonExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ExistsExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Expression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ExpressionTerm;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromEntry;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Function;
import org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.InExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.InQueryExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.InSeqExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.InnerJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLFactory;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLQuery;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Join;
import org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.LikeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MaxAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MinAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.NullComparisonExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.NullExpression;
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
import org.nightlabs.vestigo.xtext.jpql.jPQL.SomeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.StringExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SumAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Value;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Variable;
import org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration;
import org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JPQLPackageImpl extends EPackageImpl implements JPQLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jpqlQueryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupByClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass havingClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderByClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderBySpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass updateItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteClauseEClass = null;

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
  private EClass selectExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectAggregateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass avgAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countAggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectConstructorExpressionEClass = null;

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
  private EClass fromEntryEClass = null;

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
  private EClass fromClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leftJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass innerJoinEClass = null;

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
  private EClass expressionEClass = null;

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
  private EClass existsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass someExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullComparisonExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyComparisonExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass likeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inSeqExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inQueryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass betweenExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasAttributeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum orderByDirectionEEnum = null;

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
   * @see org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JPQLPackageImpl()
  {
    super(eNS_URI, JPQLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link JPQLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JPQLPackage init()
  {
    if (isInited) return (JPQLPackage)EPackage.Registry.INSTANCE.getEPackage(JPQLPackage.eNS_URI);

    // Obtain or create and register package
    JPQLPackageImpl theJPQLPackage = (JPQLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JPQLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JPQLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJPQLPackage.createPackageContents();

    // Initialize created meta-data
    theJPQLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJPQLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JPQLPackage.eNS_URI, theJPQLPackage);
    return theJPQLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJPQLQuery()
  {
    return jpqlQueryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJPQLQuery_WhereClause()
  {
    return (EReference)jpqlQueryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectStatement()
  {
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_SelectClause()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_FromClause()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_GroupByClause()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectStatement_OrderByClause()
  {
    return (EReference)selectStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupByClause()
  {
    return groupByClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupByClause_Grouping()
  {
    return (EReference)groupByClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupByClause_HavingClause()
  {
    return (EReference)groupByClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHavingClause()
  {
    return havingClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHavingClause_Having()
  {
    return (EReference)havingClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderByClause()
  {
    return orderByClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderByClause_Ordering()
  {
    return (EReference)orderByClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderBySpec()
  {
    return orderBySpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateStatement()
  {
    return updateStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateStatement_UpdateClause()
  {
    return (EReference)updateStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateStatement_SetClause()
  {
    return (EReference)updateStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateClause()
  {
    return updateClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateClause_FromEntries()
  {
    return (EReference)updateClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetClause()
  {
    return setClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetClause_Items()
  {
    return (EReference)setClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUpdateItem()
  {
    return updateItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateItem_Alias()
  {
    return (EReference)updateItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUpdateItem_Value()
  {
    return (EReference)updateItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteStatement()
  {
    return deleteStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteStatement_DeleteClause()
  {
    return (EReference)deleteStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteClause()
  {
    return deleteClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteClause_FromClause()
  {
    return (EReference)deleteClauseEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getSelectClause_IsDistinct()
  {
    return (EAttribute)selectClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectClause_Expressions()
  {
    return (EReference)selectClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectExpression()
  {
    return selectExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectAggregateExpression()
  {
    return selectAggregateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectAggregateExpression_IsDistinct()
  {
    return (EAttribute)selectAggregateExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectAggregateExpression_Item()
  {
    return (EReference)selectAggregateExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAvgAggregate()
  {
    return avgAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxAggregate()
  {
    return maxAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinAggregate()
  {
    return minAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSumAggregate()
  {
    return sumAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountAggregate()
  {
    return countAggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectConstructorExpression()
  {
    return selectConstructorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectConstructorExpression_Name()
  {
    return (EAttribute)selectConstructorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectConstructorExpression_Items()
  {
    return (EReference)selectConstructorExpressionEClass.getEStructuralFeatures().get(1);
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
  public EReference getFromClause_FromEntries()
  {
    return (EReference)fromClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromEntry()
  {
    return fromEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromEntry_Variable()
  {
    return (EReference)fromEntryEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromClass()
  {
    return fromClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromClass_Type()
  {
    return (EAttribute)fromClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromClass_Joins()
  {
    return (EReference)fromClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromCollection()
  {
    return fromCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromCollection_Path()
  {
    return (EReference)fromCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFromJoin()
  {
    return fromJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFromJoin_IsFetch()
  {
    return (EAttribute)fromJoinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromJoin_Path()
  {
    return (EReference)fromJoinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFromJoin_Variable()
  {
    return (EReference)fromJoinEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoin()
  {
    return joinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeftJoin()
  {
    return leftJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLeftJoin_IsOuter()
  {
    return (EAttribute)leftJoinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInnerJoin()
  {
    return innerJoinEClass;
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
  public EReference getWhereClause_WhereEntry()
  {
    return (EReference)whereClauseEClass.getEStructuralFeatures().get(0);
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
  public EClass getComparisonOperatorExpression()
  {
    return comparisonOperatorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonOperatorExpression_Left()
  {
    return (EReference)comparisonOperatorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonOperatorExpression_Operator()
  {
    return (EAttribute)comparisonOperatorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonOperatorExpression_Right()
  {
    return (EReference)comparisonOperatorExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistsExpression()
  {
    return existsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExistsExpression_IsNot()
  {
    return (EAttribute)existsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExistsExpression_Right()
  {
    return (EReference)existsExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllExpression()
  {
    return allExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllExpression_Right()
  {
    return (EReference)allExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyExpression()
  {
    return anyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnyExpression_Right()
  {
    return (EReference)anyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSomeExpression()
  {
    return someExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSomeExpression_Right()
  {
    return (EReference)someExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionExpression()
  {
    return collectionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionExpression_Left()
  {
    return (EReference)collectionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCollectionExpression_IsNot()
  {
    return (EAttribute)collectionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionExpression_Right()
  {
    return (EReference)collectionExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullComparisonExpression()
  {
    return nullComparisonExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNullComparisonExpression_Left()
  {
    return (EReference)nullComparisonExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullComparisonExpression_IsNot()
  {
    return (EAttribute)nullComparisonExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyComparisonExpression()
  {
    return emptyComparisonExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmptyComparisonExpression_Left()
  {
    return (EReference)emptyComparisonExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmptyComparisonExpression_IsNot()
  {
    return (EAttribute)emptyComparisonExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLikeExpression()
  {
    return likeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLikeExpression_Left()
  {
    return (EReference)likeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikeExpression_IsNot()
  {
    return (EAttribute)likeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikeExpression_Right()
  {
    return (EAttribute)likeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInExpression()
  {
    return inExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInExpression_Left()
  {
    return (EReference)inExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInExpression_IsNot()
  {
    return (EAttribute)inExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInSeqExpression()
  {
    return inSeqExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInSeqExpression_Items()
  {
    return (EReference)inSeqExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInQueryExpression()
  {
    return inQueryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInQueryExpression_Query()
  {
    return (EReference)inQueryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBetweenExpression()
  {
    return betweenExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBetweenExpression_Left()
  {
    return (EReference)betweenExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBetweenExpression_IsNot()
  {
    return (EAttribute)betweenExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBetweenExpression_Min()
  {
    return (EReference)betweenExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBetweenExpression_Max()
  {
    return (EReference)betweenExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionTerm()
  {
    return expressionTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAliasAttributeExpression()
  {
    return aliasAttributeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAliasAttributeExpression_Direction()
  {
    return (EAttribute)aliasAttributeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAliasAttributeExpression_Alias()
  {
    return (EReference)aliasAttributeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAliasAttributeExpression_Attributes()
  {
    return (EAttribute)aliasAttributeExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterExpression()
  {
    return parameterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterExpression_Name()
  {
    return (EAttribute)parameterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Params()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerExpression()
  {
    return integerExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerExpression_Value()
  {
    return (EAttribute)integerExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringExpression()
  {
    return stringExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringExpression_Value()
  {
    return (EAttribute)stringExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullExpression()
  {
    return nullExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullExpression_Value()
  {
    return (EAttribute)nullExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanExpression_Value()
  {
    return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression()
  {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpression_Entries()
  {
    return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Entries()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOrderByDirection()
  {
    return orderByDirectionEEnum;
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
  public JPQLFactory getJPQLFactory()
  {
    return (JPQLFactory)getEFactoryInstance();
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
    jpqlQueryEClass = createEClass(JPQL_QUERY);
    createEReference(jpqlQueryEClass, JPQL_QUERY__WHERE_CLAUSE);

    selectStatementEClass = createEClass(SELECT_STATEMENT);
    createEReference(selectStatementEClass, SELECT_STATEMENT__SELECT_CLAUSE);
    createEReference(selectStatementEClass, SELECT_STATEMENT__FROM_CLAUSE);
    createEReference(selectStatementEClass, SELECT_STATEMENT__GROUP_BY_CLAUSE);
    createEReference(selectStatementEClass, SELECT_STATEMENT__ORDER_BY_CLAUSE);

    groupByClauseEClass = createEClass(GROUP_BY_CLAUSE);
    createEReference(groupByClauseEClass, GROUP_BY_CLAUSE__GROUPING);
    createEReference(groupByClauseEClass, GROUP_BY_CLAUSE__HAVING_CLAUSE);

    havingClauseEClass = createEClass(HAVING_CLAUSE);
    createEReference(havingClauseEClass, HAVING_CLAUSE__HAVING);

    orderByClauseEClass = createEClass(ORDER_BY_CLAUSE);
    createEReference(orderByClauseEClass, ORDER_BY_CLAUSE__ORDERING);

    orderBySpecEClass = createEClass(ORDER_BY_SPEC);

    updateStatementEClass = createEClass(UPDATE_STATEMENT);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__UPDATE_CLAUSE);
    createEReference(updateStatementEClass, UPDATE_STATEMENT__SET_CLAUSE);

    updateClauseEClass = createEClass(UPDATE_CLAUSE);
    createEReference(updateClauseEClass, UPDATE_CLAUSE__FROM_ENTRIES);

    setClauseEClass = createEClass(SET_CLAUSE);
    createEReference(setClauseEClass, SET_CLAUSE__ITEMS);

    updateItemEClass = createEClass(UPDATE_ITEM);
    createEReference(updateItemEClass, UPDATE_ITEM__ALIAS);
    createEReference(updateItemEClass, UPDATE_ITEM__VALUE);

    deleteStatementEClass = createEClass(DELETE_STATEMENT);
    createEReference(deleteStatementEClass, DELETE_STATEMENT__DELETE_CLAUSE);

    deleteClauseEClass = createEClass(DELETE_CLAUSE);
    createEReference(deleteClauseEClass, DELETE_CLAUSE__FROM_CLAUSE);

    selectClauseEClass = createEClass(SELECT_CLAUSE);
    createEAttribute(selectClauseEClass, SELECT_CLAUSE__IS_DISTINCT);
    createEReference(selectClauseEClass, SELECT_CLAUSE__EXPRESSIONS);

    selectExpressionEClass = createEClass(SELECT_EXPRESSION);

    selectAggregateExpressionEClass = createEClass(SELECT_AGGREGATE_EXPRESSION);
    createEAttribute(selectAggregateExpressionEClass, SELECT_AGGREGATE_EXPRESSION__IS_DISTINCT);
    createEReference(selectAggregateExpressionEClass, SELECT_AGGREGATE_EXPRESSION__ITEM);

    avgAggregateEClass = createEClass(AVG_AGGREGATE);

    maxAggregateEClass = createEClass(MAX_AGGREGATE);

    minAggregateEClass = createEClass(MIN_AGGREGATE);

    sumAggregateEClass = createEClass(SUM_AGGREGATE);

    countAggregateEClass = createEClass(COUNT_AGGREGATE);

    selectConstructorExpressionEClass = createEClass(SELECT_CONSTRUCTOR_EXPRESSION);
    createEAttribute(selectConstructorExpressionEClass, SELECT_CONSTRUCTOR_EXPRESSION__NAME);
    createEReference(selectConstructorExpressionEClass, SELECT_CONSTRUCTOR_EXPRESSION__ITEMS);

    fromClauseEClass = createEClass(FROM_CLAUSE);
    createEReference(fromClauseEClass, FROM_CLAUSE__FROM_ENTRIES);

    fromEntryEClass = createEClass(FROM_ENTRY);
    createEReference(fromEntryEClass, FROM_ENTRY__VARIABLE);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

    fromClassEClass = createEClass(FROM_CLASS);
    createEAttribute(fromClassEClass, FROM_CLASS__TYPE);
    createEReference(fromClassEClass, FROM_CLASS__JOINS);

    fromCollectionEClass = createEClass(FROM_COLLECTION);
    createEReference(fromCollectionEClass, FROM_COLLECTION__PATH);

    fromJoinEClass = createEClass(FROM_JOIN);
    createEAttribute(fromJoinEClass, FROM_JOIN__IS_FETCH);
    createEReference(fromJoinEClass, FROM_JOIN__PATH);
    createEReference(fromJoinEClass, FROM_JOIN__VARIABLE);

    joinEClass = createEClass(JOIN);

    leftJoinEClass = createEClass(LEFT_JOIN);
    createEAttribute(leftJoinEClass, LEFT_JOIN__IS_OUTER);

    innerJoinEClass = createEClass(INNER_JOIN);

    whereClauseEClass = createEClass(WHERE_CLAUSE);
    createEReference(whereClauseEClass, WHERE_CLAUSE__WHERE_ENTRY);

    expressionEClass = createEClass(EXPRESSION);

    comparisonOperatorExpressionEClass = createEClass(COMPARISON_OPERATOR_EXPRESSION);
    createEReference(comparisonOperatorExpressionEClass, COMPARISON_OPERATOR_EXPRESSION__LEFT);
    createEAttribute(comparisonOperatorExpressionEClass, COMPARISON_OPERATOR_EXPRESSION__OPERATOR);
    createEReference(comparisonOperatorExpressionEClass, COMPARISON_OPERATOR_EXPRESSION__RIGHT);

    existsExpressionEClass = createEClass(EXISTS_EXPRESSION);
    createEAttribute(existsExpressionEClass, EXISTS_EXPRESSION__IS_NOT);
    createEReference(existsExpressionEClass, EXISTS_EXPRESSION__RIGHT);

    allExpressionEClass = createEClass(ALL_EXPRESSION);
    createEReference(allExpressionEClass, ALL_EXPRESSION__RIGHT);

    anyExpressionEClass = createEClass(ANY_EXPRESSION);
    createEReference(anyExpressionEClass, ANY_EXPRESSION__RIGHT);

    someExpressionEClass = createEClass(SOME_EXPRESSION);
    createEReference(someExpressionEClass, SOME_EXPRESSION__RIGHT);

    collectionExpressionEClass = createEClass(COLLECTION_EXPRESSION);
    createEReference(collectionExpressionEClass, COLLECTION_EXPRESSION__LEFT);
    createEAttribute(collectionExpressionEClass, COLLECTION_EXPRESSION__IS_NOT);
    createEReference(collectionExpressionEClass, COLLECTION_EXPRESSION__RIGHT);

    nullComparisonExpressionEClass = createEClass(NULL_COMPARISON_EXPRESSION);
    createEReference(nullComparisonExpressionEClass, NULL_COMPARISON_EXPRESSION__LEFT);
    createEAttribute(nullComparisonExpressionEClass, NULL_COMPARISON_EXPRESSION__IS_NOT);

    emptyComparisonExpressionEClass = createEClass(EMPTY_COMPARISON_EXPRESSION);
    createEReference(emptyComparisonExpressionEClass, EMPTY_COMPARISON_EXPRESSION__LEFT);
    createEAttribute(emptyComparisonExpressionEClass, EMPTY_COMPARISON_EXPRESSION__IS_NOT);

    likeExpressionEClass = createEClass(LIKE_EXPRESSION);
    createEReference(likeExpressionEClass, LIKE_EXPRESSION__LEFT);
    createEAttribute(likeExpressionEClass, LIKE_EXPRESSION__IS_NOT);
    createEAttribute(likeExpressionEClass, LIKE_EXPRESSION__RIGHT);

    inExpressionEClass = createEClass(IN_EXPRESSION);
    createEReference(inExpressionEClass, IN_EXPRESSION__LEFT);
    createEAttribute(inExpressionEClass, IN_EXPRESSION__IS_NOT);

    inSeqExpressionEClass = createEClass(IN_SEQ_EXPRESSION);
    createEReference(inSeqExpressionEClass, IN_SEQ_EXPRESSION__ITEMS);

    inQueryExpressionEClass = createEClass(IN_QUERY_EXPRESSION);
    createEReference(inQueryExpressionEClass, IN_QUERY_EXPRESSION__QUERY);

    betweenExpressionEClass = createEClass(BETWEEN_EXPRESSION);
    createEReference(betweenExpressionEClass, BETWEEN_EXPRESSION__LEFT);
    createEAttribute(betweenExpressionEClass, BETWEEN_EXPRESSION__IS_NOT);
    createEReference(betweenExpressionEClass, BETWEEN_EXPRESSION__MIN);
    createEReference(betweenExpressionEClass, BETWEEN_EXPRESSION__MAX);

    variableEClass = createEClass(VARIABLE);

    expressionTermEClass = createEClass(EXPRESSION_TERM);

    aliasAttributeExpressionEClass = createEClass(ALIAS_ATTRIBUTE_EXPRESSION);
    createEAttribute(aliasAttributeExpressionEClass, ALIAS_ATTRIBUTE_EXPRESSION__DIRECTION);
    createEReference(aliasAttributeExpressionEClass, ALIAS_ATTRIBUTE_EXPRESSION__ALIAS);
    createEAttribute(aliasAttributeExpressionEClass, ALIAS_ATTRIBUTE_EXPRESSION__ATTRIBUTES);

    parameterExpressionEClass = createEClass(PARAMETER_EXPRESSION);
    createEAttribute(parameterExpressionEClass, PARAMETER_EXPRESSION__NAME);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEReference(functionEClass, FUNCTION__PARAMS);

    valueEClass = createEClass(VALUE);

    integerExpressionEClass = createEClass(INTEGER_EXPRESSION);
    createEAttribute(integerExpressionEClass, INTEGER_EXPRESSION__VALUE);

    stringExpressionEClass = createEClass(STRING_EXPRESSION);
    createEAttribute(stringExpressionEClass, STRING_EXPRESSION__VALUE);

    nullExpressionEClass = createEClass(NULL_EXPRESSION);
    createEAttribute(nullExpressionEClass, NULL_EXPRESSION__VALUE);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
    createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__VALUE);

    orExpressionEClass = createEClass(OR_EXPRESSION);
    createEReference(orExpressionEClass, OR_EXPRESSION__ENTRIES);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEReference(andExpressionEClass, AND_EXPRESSION__ENTRIES);

    // Create enums
    orderByDirectionEEnum = createEEnum(ORDER_BY_DIRECTION);
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
    selectStatementEClass.getESuperTypes().add(this.getJPQLQuery());
    selectStatementEClass.getESuperTypes().add(this.getExpressionTerm());
    updateStatementEClass.getESuperTypes().add(this.getJPQLQuery());
    deleteStatementEClass.getESuperTypes().add(this.getJPQLQuery());
    selectAggregateExpressionEClass.getESuperTypes().add(this.getSelectExpression());
    avgAggregateEClass.getESuperTypes().add(this.getSelectAggregateExpression());
    maxAggregateEClass.getESuperTypes().add(this.getSelectAggregateExpression());
    minAggregateEClass.getESuperTypes().add(this.getSelectAggregateExpression());
    sumAggregateEClass.getESuperTypes().add(this.getSelectAggregateExpression());
    countAggregateEClass.getESuperTypes().add(this.getSelectAggregateExpression());
    selectConstructorExpressionEClass.getESuperTypes().add(this.getSelectExpression());
    fromClassEClass.getESuperTypes().add(this.getFromEntry());
    fromCollectionEClass.getESuperTypes().add(this.getFromEntry());
    joinEClass.getESuperTypes().add(this.getFromJoin());
    leftJoinEClass.getESuperTypes().add(this.getFromJoin());
    innerJoinEClass.getESuperTypes().add(this.getFromJoin());
    comparisonOperatorExpressionEClass.getESuperTypes().add(this.getExpression());
    existsExpressionEClass.getESuperTypes().add(this.getExpression());
    allExpressionEClass.getESuperTypes().add(this.getExpression());
    anyExpressionEClass.getESuperTypes().add(this.getExpression());
    someExpressionEClass.getESuperTypes().add(this.getExpression());
    collectionExpressionEClass.getESuperTypes().add(this.getExpression());
    nullComparisonExpressionEClass.getESuperTypes().add(this.getExpression());
    emptyComparisonExpressionEClass.getESuperTypes().add(this.getExpression());
    likeExpressionEClass.getESuperTypes().add(this.getExpression());
    inExpressionEClass.getESuperTypes().add(this.getExpression());
    inSeqExpressionEClass.getESuperTypes().add(this.getInExpression());
    inQueryExpressionEClass.getESuperTypes().add(this.getInExpression());
    betweenExpressionEClass.getESuperTypes().add(this.getExpression());
    variableEClass.getESuperTypes().add(this.getExpressionTerm());
    expressionTermEClass.getESuperTypes().add(this.getExpression());
    aliasAttributeExpressionEClass.getESuperTypes().add(this.getOrderBySpec());
    aliasAttributeExpressionEClass.getESuperTypes().add(this.getSelectExpression());
    aliasAttributeExpressionEClass.getESuperTypes().add(this.getVariable());
    parameterExpressionEClass.getESuperTypes().add(this.getVariable());
    valueEClass.getESuperTypes().add(this.getVariable());
    integerExpressionEClass.getESuperTypes().add(this.getValue());
    stringExpressionEClass.getESuperTypes().add(this.getValue());
    nullExpressionEClass.getESuperTypes().add(this.getValue());
    booleanExpressionEClass.getESuperTypes().add(this.getValue());
    orExpressionEClass.getESuperTypes().add(this.getExpression());
    andExpressionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(jpqlQueryEClass, JPQLQuery.class, "JPQLQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJPQLQuery_WhereClause(), this.getWhereClause(), null, "whereClause", null, 0, 1, JPQLQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementEClass, SelectStatement.class, "SelectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelectStatement_SelectClause(), this.getSelectClause(), null, "selectClause", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_FromClause(), this.getFromClause(), null, "fromClause", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_GroupByClause(), this.getGroupByClause(), null, "groupByClause", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectStatement_OrderByClause(), this.getOrderByClause(), null, "orderByClause", null, 0, 1, SelectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupByClauseEClass, GroupByClause.class, "GroupByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroupByClause_Grouping(), this.getAliasAttributeExpression(), null, "grouping", null, 0, -1, GroupByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupByClause_HavingClause(), this.getHavingClause(), null, "havingClause", null, 0, 1, GroupByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(havingClauseEClass, HavingClause.class, "HavingClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHavingClause_Having(), this.getExpression(), null, "having", null, 0, 1, HavingClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderByClauseEClass, OrderByClause.class, "OrderByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrderByClause_Ordering(), this.getOrderBySpec(), null, "ordering", null, 0, -1, OrderByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderBySpecEClass, OrderBySpec.class, "OrderBySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(updateStatementEClass, UpdateStatement.class, "UpdateStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateStatement_UpdateClause(), this.getUpdateClause(), null, "updateClause", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateStatement_SetClause(), this.getSetClause(), null, "setClause", null, 0, 1, UpdateStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateClauseEClass, UpdateClause.class, "UpdateClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateClause_FromEntries(), this.getFromEntry(), null, "fromEntries", null, 0, -1, UpdateClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setClauseEClass, SetClause.class, "SetClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetClause_Items(), this.getUpdateItem(), null, "items", null, 0, -1, SetClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(updateItemEClass, UpdateItem.class, "UpdateItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUpdateItem_Alias(), this.getAliasAttributeExpression(), null, "alias", null, 0, 1, UpdateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUpdateItem_Value(), this.getValue(), null, "value", null, 0, 1, UpdateItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteStatementEClass, DeleteStatement.class, "DeleteStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeleteStatement_DeleteClause(), this.getDeleteClause(), null, "deleteClause", null, 0, 1, DeleteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteClauseEClass, DeleteClause.class, "DeleteClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeleteClause_FromClause(), this.getFromClause(), null, "fromClause", null, 0, 1, DeleteClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectClauseEClass, SelectClause.class, "SelectClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectClause_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, SelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectClause_Expressions(), this.getSelectExpression(), null, "expressions", null, 0, -1, SelectClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectExpressionEClass, SelectExpression.class, "SelectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectAggregateExpressionEClass, SelectAggregateExpression.class, "SelectAggregateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectAggregateExpression_IsDistinct(), ecorePackage.getEBoolean(), "isDistinct", null, 0, 1, SelectAggregateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectAggregateExpression_Item(), this.getAliasAttributeExpression(), null, "item", null, 0, 1, SelectAggregateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(avgAggregateEClass, AvgAggregate.class, "AvgAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(maxAggregateEClass, MaxAggregate.class, "MaxAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minAggregateEClass, MinAggregate.class, "MinAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sumAggregateEClass, SumAggregate.class, "SumAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(countAggregateEClass, CountAggregate.class, "CountAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(selectConstructorExpressionEClass, SelectConstructorExpression.class, "SelectConstructorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelectConstructorExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, SelectConstructorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelectConstructorExpression_Items(), this.getAliasAttributeExpression(), null, "items", null, 0, -1, SelectConstructorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromClauseEClass, FromClause.class, "FromClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFromClause_FromEntries(), this.getFromEntry(), null, "fromEntries", null, 0, -1, FromClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromEntryEClass, FromEntry.class, "FromEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFromEntry_Variable(), this.getVariableDeclaration(), null, "variable", null, 0, 1, FromEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromClassEClass, FromClass.class, "FromClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFromClass_Type(), ecorePackage.getEString(), "type", null, 0, 1, FromClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFromClass_Joins(), this.getFromJoin(), null, "joins", null, 0, -1, FromClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromCollectionEClass, FromCollection.class, "FromCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFromCollection_Path(), this.getAliasAttributeExpression(), null, "path", null, 0, 1, FromCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromJoinEClass, FromJoin.class, "FromJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFromJoin_IsFetch(), ecorePackage.getEBoolean(), "isFetch", null, 0, 1, FromJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFromJoin_Path(), this.getAliasAttributeExpression(), null, "path", null, 0, 1, FromJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFromJoin_Variable(), this.getVariableDeclaration(), null, "variable", null, 0, 1, FromJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leftJoinEClass, LeftJoin.class, "LeftJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLeftJoin_IsOuter(), ecorePackage.getEBoolean(), "isOuter", null, 0, 1, LeftJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(innerJoinEClass, InnerJoin.class, "InnerJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whereClauseEClass, WhereClause.class, "WhereClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhereClause_WhereEntry(), this.getExpression(), null, "whereEntry", null, 0, 1, WhereClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparisonOperatorExpressionEClass, ComparisonOperatorExpression.class, "ComparisonOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparisonOperatorExpression_Left(), this.getVariable(), null, "left", null, 0, 1, ComparisonOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonOperatorExpression_Operator(), this.getComparisonOperator(), "operator", null, 0, 1, ComparisonOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparisonOperatorExpression_Right(), this.getExpressionTerm(), null, "right", null, 0, 1, ComparisonOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existsExpressionEClass, ExistsExpression.class, "ExistsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExistsExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, ExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExistsExpression_Right(), this.getSelectStatement(), null, "right", null, 0, 1, ExistsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(allExpressionEClass, AllExpression.class, "AllExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAllExpression_Right(), this.getSelectStatement(), null, "right", null, 0, 1, AllExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyExpressionEClass, AnyExpression.class, "AnyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnyExpression_Right(), this.getSelectStatement(), null, "right", null, 0, 1, AnyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(someExpressionEClass, SomeExpression.class, "SomeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSomeExpression_Right(), this.getSelectStatement(), null, "right", null, 0, 1, SomeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(collectionExpressionEClass, CollectionExpression.class, "CollectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollectionExpression_Left(), this.getVariable(), null, "left", null, 0, 1, CollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCollectionExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, CollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCollectionExpression_Right(), this.getAliasAttributeExpression(), null, "right", null, 0, 1, CollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullComparisonExpressionEClass, NullComparisonExpression.class, "NullComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNullComparisonExpression_Left(), this.getVariable(), null, "left", null, 0, 1, NullComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNullComparisonExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, NullComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyComparisonExpressionEClass, EmptyComparisonExpression.class, "EmptyComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmptyComparisonExpression_Left(), this.getVariable(), null, "left", null, 0, 1, EmptyComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmptyComparisonExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, EmptyComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(likeExpressionEClass, LikeExpression.class, "LikeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLikeExpression_Left(), this.getVariable(), null, "left", null, 0, 1, LikeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLikeExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, LikeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLikeExpression_Right(), ecorePackage.getEString(), "right", null, 0, 1, LikeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inExpressionEClass, InExpression.class, "InExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInExpression_Left(), this.getVariable(), null, "left", null, 0, 1, InExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, InExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inSeqExpressionEClass, InSeqExpression.class, "InSeqExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInSeqExpression_Items(), this.getVariable(), null, "items", null, 0, -1, InSeqExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inQueryExpressionEClass, InQueryExpression.class, "InQueryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInQueryExpression_Query(), this.getSelectStatement(), null, "query", null, 0, 1, InQueryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(betweenExpressionEClass, BetweenExpression.class, "BetweenExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBetweenExpression_Left(), this.getVariable(), null, "left", null, 0, 1, BetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBetweenExpression_IsNot(), ecorePackage.getEBoolean(), "isNot", null, 0, 1, BetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBetweenExpression_Min(), this.getValue(), null, "min", null, 0, 1, BetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBetweenExpression_Max(), this.getValue(), null, "max", null, 0, 1, BetweenExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionTermEClass, ExpressionTerm.class, "ExpressionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aliasAttributeExpressionEClass, AliasAttributeExpression.class, "AliasAttributeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAliasAttributeExpression_Direction(), this.getOrderByDirection(), "direction", null, 0, 1, AliasAttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAliasAttributeExpression_Alias(), this.getVariableDeclaration(), null, "alias", null, 0, 1, AliasAttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAliasAttributeExpression_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, AliasAttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterExpressionEClass, ParameterExpression.class, "ParameterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Params(), this.getVariable(), null, "params", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerExpression_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, NullExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanExpression_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpression_Entries(), this.getExpression(), null, "entries", null, 0, -1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpression_Entries(), this.getExpression(), null, "entries", null, 0, -1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(orderByDirectionEEnum, OrderByDirection.class, "OrderByDirection");
    addEEnumLiteral(orderByDirectionEEnum, OrderByDirection.ASC);
    addEEnumLiteral(orderByDirectionEEnum, OrderByDirection.DESC);

    initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_THEN);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_THEN);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER_EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.NOT_EQUAL);

    // Create resource
    createResource(eNS_URI);
  }

} //JPQLPackageImpl
