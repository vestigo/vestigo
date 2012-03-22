/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLFactory
 * @model kind="package"
 * @generated
 */
public interface JDOQLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jDOQL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nightlabs.org/jjqb/xtext/jdoql/JDOQL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jDOQL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JDOQLPackage eINSTANCE = org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl <em>Single String JDOQL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSingleStringJDOQL()
   * @generated
   */
  int SINGLE_STRING_JDOQL = 0;

  /**
   * The feature id for the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__SELECT_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__FROM_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__WHERE_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Variables Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__VARIABLES_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Parameters Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE = 4;

  /**
   * The feature id for the '<em><b>Import Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__IMPORT_CLAUSE = 5;

  /**
   * The feature id for the '<em><b>Group By Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE = 6;

  /**
   * The feature id for the '<em><b>Order By Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE = 7;

  /**
   * The feature id for the '<em><b>Range Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__RANGE_CLAUSE = 8;

  /**
   * The number of structural features of the '<em>Single String JDOQL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectClauseImpl <em>Select Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSelectClause()
   * @generated
   */
  int SELECT_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Is Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__IS_UNIQUE = 0;

  /**
   * The feature id for the '<em><b>Result Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__RESULT_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Into Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE__INTO_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Select Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultClauseImpl <em>Result Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultClause()
   * @generated
   */
  int RESULT_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CLAUSE__IS_DISTINCT = 0;

  /**
   * The feature id for the '<em><b>Result Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CLAUSE__RESULT_SPECS = 1;

  /**
   * The number of structural features of the '<em>Result Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.IntoClauseImpl <em>Into Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.IntoClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getIntoClause()
   * @generated
   */
  int INTO_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Result Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTO_CLAUSE__RESULT_CLASS_NAME = 0;

  /**
   * The number of structural features of the '<em>Into Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTO_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecImpl <em>Result Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultSpec()
   * @generated
   */
  int RESULT_SPEC = 4;

  /**
   * The number of structural features of the '<em>Result Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultNamingImpl <em>Result Naming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultNamingImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultNaming()
   * @generated
   */
  int RESULT_NAMING = 5;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_NAMING__IDENTIFIER = 0;

  /**
   * The number of structural features of the '<em>Result Naming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_NAMING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromClauseImpl <em>From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getFromClause()
   * @generated
   */
  int FROM_CLAUSE = 6;

  /**
   * The feature id for the '<em><b>Candidate Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE__CANDIDATE_CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Is Exclude Subclasses</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES = 1;

  /**
   * The number of structural features of the '<em>From Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereClauseImpl <em>Where Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getWhereClause()
   * @generated
   */
  int WHERE_CLAUSE = 7;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE__FILTER = 0;

  /**
   * The number of structural features of the '<em>Where Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariablesClauseImpl <em>Variables Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariablesClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getVariablesClause()
   * @generated
   */
  int VARIABLES_CLAUSE = 8;

  /**
   * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_CLAUSE__VARIABLE_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Variables Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariableDeclarationImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Variable Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VARIABLE_NAME = 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParametersClauseImpl <em>Parameters Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParametersClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getParametersClause()
   * @generated
   */
  int PARAMETERS_CLAUSE = 10;

  /**
   * The feature id for the '<em><b>Parameter Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Parameters Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getParameterDeclaration()
   * @generated
   */
  int PARAMETER_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Declared Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ImportClauseImpl <em>Import Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ImportClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getImportClause()
   * @generated
   */
  int IMPORT_CLAUSE = 12;

  /**
   * The feature id for the '<em><b>Import Declarations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CLAUSE__IMPORT_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Import Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.GroupByClauseImpl <em>Group By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.GroupByClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getGroupByClause()
   * @generated
   */
  int GROUP_BY_CLAUSE = 13;

  /**
   * The feature id for the '<em><b>Grouping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE__GROUPING = 0;

  /**
   * The feature id for the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE__HAVING_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Group By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.HavingClauseImpl <em>Having Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.HavingClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getHavingClause()
   * @generated
   */
  int HAVING_CLAUSE = 14;

  /**
   * The feature id for the '<em><b>Having</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE__HAVING = 0;

  /**
   * The number of structural features of the '<em>Having Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAVING_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderByClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getOrderByClause()
   * @generated
   */
  int ORDER_BY_CLAUSE = 15;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE__ORDERING = 0;

  /**
   * The number of structural features of the '<em>Order By Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderBySpecImpl <em>Order By Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderBySpecImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getOrderBySpec()
   * @generated
   */
  int ORDER_BY_SPEC = 16;

  /**
   * The number of structural features of the '<em>Order By Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_BY_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.RangeClauseImpl <em>Range Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.RangeClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getRangeClause()
   * @generated
   */
  int RANGE_CLAUSE = 17;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_CLAUSE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_CLAUSE__END = 1;

  /**
   * The number of structural features of the '<em>Range Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RESULT_NAMING = RESULT_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__DIRECTION = RESULT_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CAST_TYPE = RESULT_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = RESULT_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UNARY_OPERATOR = RESULT_SPEC_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LITERAL = RESULT_SPEC_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__THIS = RESULT_SPEC_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ID = RESULT_SPEC_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PARAMETER_NAME = RESULT_SPEC_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__METHOD = RESULT_SPEC_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NUMBER = RESULT_SPEC_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PERSISTABLE = RESULT_SPEC_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__IS_DISTINCT = RESULT_SPEC_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__AGGREGATE_ARGUMENT = RESULT_SPEC_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ELEMENT = RESULT_SPEC_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ARG = RESULT_SPEC_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__KEY = RESULT_SPEC_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = RESULT_SPEC_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__INDEX = RESULT_SPEC_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__STRING = RESULT_SPEC_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__FROM_INDEX = RESULT_SPEC_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__REGEX = RESULT_SPEC_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__REPLACEMENT = RESULT_SPEC_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BEGIN_INDEX = RESULT_SPEC_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__END_INDEX = RESULT_SPEC_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = RESULT_SPEC_FEATURE_COUNT + 25;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = RESULT_SPEC_FEATURE_COUNT + 26;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalOrExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getConditionalOrExpression()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The number of structural features of the '<em>Conditional Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalAndExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getConditionalAndExpression()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The number of structural features of the '<em>Conditional And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleOrExpressionImpl <em>Simple Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleOrExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSimpleOrExpression()
   * @generated
   */
  int SIMPLE_OR_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The number of structural features of the '<em>Simple Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleAndExpressionImpl <em>Simple And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleAndExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSimpleAndExpression()
   * @generated
   */
  int SIMPLE_AND_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The number of structural features of the '<em>Simple And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ComparisonOperatorExpressionImpl <em>Comparison Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ComparisonOperatorExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getComparisonOperatorExpression()
   * @generated
   */
  int COMPARISON_OPERATOR_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comparison Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.AdditionExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getAdditionExpression()
   * @generated
   */
  int ADDITION_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Addition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.MultiplicationExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getMultiplicationExpression()
   * @generated
   */
  int MULTIPLICATION_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multiplication Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FieldAccessExpressionImpl <em>Field Access Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FieldAccessExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getFieldAccessExpression()
   * @generated
   */
  int FIELD_ACCESS_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__RESULT_NAMING = EXPRESSION__RESULT_NAMING;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__DIRECTION = EXPRESSION__DIRECTION;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__CAST_TYPE = EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Unary Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__UNARY_OPERATOR = EXPRESSION__UNARY_OPERATOR;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__LITERAL = EXPRESSION__LITERAL;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__THIS = EXPRESSION__THIS;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__ID = EXPRESSION__ID;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__PARAMETER_NAME = EXPRESSION__PARAMETER_NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__METHOD = EXPRESSION__METHOD;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__NUMBER = EXPRESSION__NUMBER;

  /**
   * The feature id for the '<em><b>Persistable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__PERSISTABLE = EXPRESSION__PERSISTABLE;

  /**
   * The feature id for the '<em><b>Is Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__IS_DISTINCT = EXPRESSION__IS_DISTINCT;

  /**
   * The feature id for the '<em><b>Aggregate Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__AGGREGATE_ARGUMENT = EXPRESSION__AGGREGATE_ARGUMENT;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__ARG = EXPRESSION__ARG;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__KEY = EXPRESSION__KEY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__VALUE = EXPRESSION__VALUE;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__INDEX = EXPRESSION__INDEX;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__STRING = EXPRESSION__STRING;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__FROM_INDEX = EXPRESSION__FROM_INDEX;

  /**
   * The feature id for the '<em><b>Regex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__REGEX = EXPRESSION__REGEX;

  /**
   * The feature id for the '<em><b>Replacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__REPLACEMENT = EXPRESSION__REPLACEMENT;

  /**
   * The feature id for the '<em><b>Begin Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__BEGIN_INDEX = EXPRESSION__BEGIN_INDEX;

  /**
   * The feature id for the '<em><b>End Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__END_INDEX = EXPRESSION__END_INDEX;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The number of structural features of the '<em>Field Access Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ACCESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection <em>Order By Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getOrderByDirection()
   * @generated
   */
  int ORDER_BY_DIRECTION = 27;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator <em>Unary Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getUnaryOperator()
   * @generated
   */
  int UNARY_OPERATOR = 28;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator <em>Addition Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getAdditionOperator()
   * @generated
   */
  int ADDITION_OPERATOR = 29;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator <em>Multiplication Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getMultiplicationOperator()
   * @generated
   */
  int MULTIPLICATION_OPERATOR = 30;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator <em>Comparison Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getComparisonOperator()
   * @generated
   */
  int COMPARISON_OPERATOR = 31;


  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL <em>Single String JDOQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single String JDOQL</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL
   * @generated
   */
  EClass getSingleStringJDOQL();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getSelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getSelectClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_SelectClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getFromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getFromClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_FromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getWhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getWhereClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_WhereClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getVariablesClause <em>Variables Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variables Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getVariablesClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_VariablesClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getParametersClause <em>Parameters Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getParametersClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_ParametersClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getImportClause <em>Import Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getImportClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_ImportClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getGroupByClause <em>Group By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Group By Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getGroupByClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_GroupByClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getOrderByClause <em>Order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order By Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getOrderByClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_OrderByClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getRangeClause <em>Range Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getRangeClause()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_RangeClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause <em>Select Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause
   * @generated
   */
  EClass getSelectClause();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause#isIsUnique <em>Is Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Unique</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause#isIsUnique()
   * @see #getSelectClause()
   * @generated
   */
  EAttribute getSelectClause_IsUnique();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause#getResultClause <em>Result Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause#getResultClause()
   * @see #getSelectClause()
   * @generated
   */
  EReference getSelectClause_ResultClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause#getIntoClause <em>Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Into Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SelectClause#getIntoClause()
   * @see #getSelectClause()
   * @generated
   */
  EReference getSelectClause_IntoClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause <em>Result Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause
   * @generated
   */
  EClass getResultClause();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#isIsDistinct()
   * @see #getResultClause()
   * @generated
   */
  EAttribute getResultClause_IsDistinct();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#getResultSpecs <em>Result Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Result Specs</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause#getResultSpecs()
   * @see #getResultClause()
   * @generated
   */
  EReference getResultClause_ResultSpecs();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause <em>Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Into Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause
   * @generated
   */
  EClass getIntoClause();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause#getResultClassName <em>Result Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result Class Name</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause#getResultClassName()
   * @see #getIntoClause()
   * @generated
   */
  EAttribute getIntoClause_ResultClassName();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpec <em>Result Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Spec</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpec
   * @generated
   */
  EClass getResultSpec();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming <em>Result Naming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Naming</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming
   * @generated
   */
  EClass getResultNaming();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming#getIdentifier()
   * @see #getResultNaming()
   * @generated
   */
  EAttribute getResultNaming_Identifier();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause <em>From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause
   * @generated
   */
  EClass getFromClause();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause#getCandidateClassName <em>Candidate Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Candidate Class Name</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause#getCandidateClassName()
   * @see #getFromClause()
   * @generated
   */
  EAttribute getFromClause_CandidateClassName();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause#isIsExcludeSubclasses <em>Is Exclude Subclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Exclude Subclasses</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.FromClause#isIsExcludeSubclasses()
   * @see #getFromClause()
   * @generated
   */
  EAttribute getFromClause_IsExcludeSubclasses();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause <em>Where Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause
   * @generated
   */
  EClass getWhereClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.WhereClause#getFilter()
   * @see #getWhereClause()
   * @generated
   */
  EReference getWhereClause_Filter();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause <em>Variables Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause
   * @generated
   */
  EClass getVariablesClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause#getVariableDeclarations <em>Variable Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariablesClause#getVariableDeclarations()
   * @see #getVariablesClause()
   * @generated
   */
  EReference getVariablesClause_VariableDeclarations();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration#getVariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable Name</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.VariableDeclaration#getVariableName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_VariableName();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause <em>Parameters Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause
   * @generated
   */
  EClass getParametersClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause#getParameterDeclarations <em>Parameter Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Declarations</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParametersClause#getParameterDeclarations()
   * @see #getParametersClause()
   * @generated
   */
  EReference getParametersClause_ParameterDeclarations();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Declaration</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration
   * @generated
   */
  EClass getParameterDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getType()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getDeclaredParameterName <em>Declared Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Declared Parameter Name</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ParameterDeclaration#getDeclaredParameterName()
   * @see #getParameterDeclaration()
   * @generated
   */
  EAttribute getParameterDeclaration_DeclaredParameterName();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause <em>Import Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause
   * @generated
   */
  EClass getImportClause();

  /**
   * Returns the meta object for the attribute list '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause#getImportDeclarations <em>Import Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Import Declarations</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ImportClause#getImportDeclarations()
   * @see #getImportClause()
   * @generated
   */
  EAttribute getImportClause_ImportDeclarations();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause <em>Group By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group By Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause
   * @generated
   */
  EClass getGroupByClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause#getGrouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Grouping</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause#getGrouping()
   * @see #getGroupByClause()
   * @generated
   */
  EReference getGroupByClause_Grouping();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause#getHavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.GroupByClause#getHavingClause()
   * @see #getGroupByClause()
   * @generated
   */
  EReference getGroupByClause_HavingClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.HavingClause <em>Having Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Having Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.HavingClause
   * @generated
   */
  EClass getHavingClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.HavingClause#getHaving <em>Having</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Having</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.HavingClause#getHaving()
   * @see #getHavingClause()
   * @generated
   */
  EReference getHavingClause_Having();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByClause <em>Order By Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByClause
   * @generated
   */
  EClass getOrderByClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByClause#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ordering</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByClause#getOrdering()
   * @see #getOrderByClause()
   * @generated
   */
  EReference getOrderByClause_Ordering();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderBySpec <em>Order By Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order By Spec</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderBySpec
   * @generated
   */
  EClass getOrderBySpec();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause <em>Range Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause
   * @generated
   */
  EClass getRangeClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getStart()
   * @see #getRangeClause()
   * @generated
   */
  EReference getRangeClause_Start();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.RangeClause#getEnd()
   * @see #getRangeClause()
   * @generated
   */
  EReference getRangeClause_End();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getResultNaming <em>Result Naming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Naming</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getResultNaming()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ResultNaming();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getDirection()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getCastType <em>Cast Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cast Type</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getCastType()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_CastType();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getUnaryOperator <em>Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unary Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getUnaryOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_UnaryOperator();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLiteral()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Literal();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getThis <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>This</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getThis()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_This();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getId()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Id();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Name</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getParameterName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_ParameterName();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getMethod()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Method();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getNumber()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Number();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getPersistable <em>Persistable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Persistable</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getPersistable()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Persistable();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#isIsDistinct <em>Is Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Distinct</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#isIsDistinct()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_IsDistinct();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getAggregateArgument <em>Aggregate Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggregate Argument</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getAggregateArgument()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_AggregateArgument();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getElement()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Element();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getArg()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getKey()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getIndex()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>String</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getString()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_String();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getFromIndex <em>From Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Index</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getFromIndex()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_FromIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getRegex <em>Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Regex</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getRegex()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Regex();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getReplacement <em>Replacement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replacement</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getReplacement()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Replacement();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getBeginIndex <em>Begin Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Begin Index</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getBeginIndex()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_BeginIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getEndIndex <em>End Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Index</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getEndIndex()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_EndIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalOrExpression
   * @generated
   */
  EClass getConditionalOrExpression();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ConditionalAndExpression
   * @generated
   */
  EClass getConditionalAndExpression();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleOrExpression <em>Simple Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Or Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleOrExpression
   * @generated
   */
  EClass getSimpleOrExpression();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleAndExpression <em>Simple And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple And Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SimpleAndExpression
   * @generated
   */
  EClass getSimpleAndExpression();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression <em>Comparison Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Operator Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression
   * @generated
   */
  EClass getComparisonOperatorExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperatorExpression#getOperator()
   * @see #getComparisonOperatorExpression()
   * @generated
   */
  EAttribute getComparisonOperatorExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression <em>Addition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression
   * @generated
   */
  EClass getAdditionExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionExpression#getOperator()
   * @see #getAdditionExpression()
   * @generated
   */
  EAttribute getAdditionExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression <em>Multiplication Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression
   * @generated
   */
  EClass getMultiplicationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationExpression#getOperator()
   * @see #getMultiplicationExpression()
   * @generated
   */
  EAttribute getMultiplicationExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.FieldAccessExpression <em>Field Access Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Access Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.FieldAccessExpression
   * @generated
   */
  EClass getFieldAccessExpression();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection <em>Order By Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Order By Direction</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection
   * @generated
   */
  EEnum getOrderByDirection();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator <em>Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator
   * @generated
   */
  EEnum getUnaryOperator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator <em>Addition Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Addition Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator
   * @generated
   */
  EEnum getAdditionOperator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator <em>Multiplication Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplication Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator
   * @generated
   */
  EEnum getMultiplicationOperator();

  /**
   * Returns the meta object for enum '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator <em>Comparison Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparison Operator</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator
   * @generated
   */
  EEnum getComparisonOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JDOQLFactory getJDOQLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl <em>Single String JDOQL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SingleStringJDOQLImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSingleStringJDOQL()
     * @generated
     */
    EClass SINGLE_STRING_JDOQL = eINSTANCE.getSingleStringJDOQL();

    /**
     * The meta object literal for the '<em><b>Select Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__SELECT_CLAUSE = eINSTANCE.getSingleStringJDOQL_SelectClause();

    /**
     * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__FROM_CLAUSE = eINSTANCE.getSingleStringJDOQL_FromClause();

    /**
     * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__WHERE_CLAUSE = eINSTANCE.getSingleStringJDOQL_WhereClause();

    /**
     * The meta object literal for the '<em><b>Variables Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__VARIABLES_CLAUSE = eINSTANCE.getSingleStringJDOQL_VariablesClause();

    /**
     * The meta object literal for the '<em><b>Parameters Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__PARAMETERS_CLAUSE = eINSTANCE.getSingleStringJDOQL_ParametersClause();

    /**
     * The meta object literal for the '<em><b>Import Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__IMPORT_CLAUSE = eINSTANCE.getSingleStringJDOQL_ImportClause();

    /**
     * The meta object literal for the '<em><b>Group By Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__GROUP_BY_CLAUSE = eINSTANCE.getSingleStringJDOQL_GroupByClause();

    /**
     * The meta object literal for the '<em><b>Order By Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__ORDER_BY_CLAUSE = eINSTANCE.getSingleStringJDOQL_OrderByClause();

    /**
     * The meta object literal for the '<em><b>Range Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__RANGE_CLAUSE = eINSTANCE.getSingleStringJDOQL_RangeClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectClauseImpl <em>Select Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSelectClause()
     * @generated
     */
    EClass SELECT_CLAUSE = eINSTANCE.getSelectClause();

    /**
     * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CLAUSE__IS_UNIQUE = eINSTANCE.getSelectClause_IsUnique();

    /**
     * The meta object literal for the '<em><b>Result Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CLAUSE__RESULT_CLAUSE = eINSTANCE.getSelectClause_ResultClause();

    /**
     * The meta object literal for the '<em><b>Into Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CLAUSE__INTO_CLAUSE = eINSTANCE.getSelectClause_IntoClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultClauseImpl <em>Result Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultClause()
     * @generated
     */
    EClass RESULT_CLAUSE = eINSTANCE.getResultClause();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_CLAUSE__IS_DISTINCT = eINSTANCE.getResultClause_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Result Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_CLAUSE__RESULT_SPECS = eINSTANCE.getResultClause_ResultSpecs();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.IntoClauseImpl <em>Into Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.IntoClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getIntoClause()
     * @generated
     */
    EClass INTO_CLAUSE = eINSTANCE.getIntoClause();

    /**
     * The meta object literal for the '<em><b>Result Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTO_CLAUSE__RESULT_CLASS_NAME = eINSTANCE.getIntoClause_ResultClassName();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecImpl <em>Result Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultSpec()
     * @generated
     */
    EClass RESULT_SPEC = eINSTANCE.getResultSpec();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultNamingImpl <em>Result Naming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultNamingImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultNaming()
     * @generated
     */
    EClass RESULT_NAMING = eINSTANCE.getResultNaming();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_NAMING__IDENTIFIER = eINSTANCE.getResultNaming_Identifier();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromClauseImpl <em>From Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getFromClause()
     * @generated
     */
    EClass FROM_CLAUSE = eINSTANCE.getFromClause();

    /**
     * The meta object literal for the '<em><b>Candidate Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_CLAUSE__CANDIDATE_CLASS_NAME = eINSTANCE.getFromClause_CandidateClassName();

    /**
     * The meta object literal for the '<em><b>Is Exclude Subclasses</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM_CLAUSE__IS_EXCLUDE_SUBCLASSES = eINSTANCE.getFromClause_IsExcludeSubclasses();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereClauseImpl <em>Where Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getWhereClause()
     * @generated
     */
    EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE_CLAUSE__FILTER = eINSTANCE.getWhereClause_Filter();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariablesClauseImpl <em>Variables Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariablesClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getVariablesClause()
     * @generated
     */
    EClass VARIABLES_CLAUSE = eINSTANCE.getVariablesClause();

    /**
     * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES_CLAUSE__VARIABLE_DECLARATIONS = eINSTANCE.getVariablesClause_VariableDeclarations();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.VariableDeclarationImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__VARIABLE_NAME = eINSTANCE.getVariableDeclaration_VariableName();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParametersClauseImpl <em>Parameters Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParametersClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getParametersClause()
     * @generated
     */
    EClass PARAMETERS_CLAUSE = eINSTANCE.getParametersClause();

    /**
     * The meta object literal for the '<em><b>Parameter Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERS_CLAUSE__PARAMETER_DECLARATIONS = eINSTANCE.getParametersClause_ParameterDeclarations();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ParameterDeclarationImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getParameterDeclaration()
     * @generated
     */
    EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__TYPE = eINSTANCE.getParameterDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Declared Parameter Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME = eINSTANCE.getParameterDeclaration_DeclaredParameterName();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ImportClauseImpl <em>Import Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ImportClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getImportClause()
     * @generated
     */
    EClass IMPORT_CLAUSE = eINSTANCE.getImportClause();

    /**
     * The meta object literal for the '<em><b>Import Declarations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CLAUSE__IMPORT_DECLARATIONS = eINSTANCE.getImportClause_ImportDeclarations();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.GroupByClauseImpl <em>Group By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.GroupByClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getGroupByClause()
     * @generated
     */
    EClass GROUP_BY_CLAUSE = eINSTANCE.getGroupByClause();

    /**
     * The meta object literal for the '<em><b>Grouping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_CLAUSE__GROUPING = eINSTANCE.getGroupByClause_Grouping();

    /**
     * The meta object literal for the '<em><b>Having Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_CLAUSE__HAVING_CLAUSE = eINSTANCE.getGroupByClause_HavingClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.HavingClauseImpl <em>Having Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.HavingClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getHavingClause()
     * @generated
     */
    EClass HAVING_CLAUSE = eINSTANCE.getHavingClause();

    /**
     * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAVING_CLAUSE__HAVING = eINSTANCE.getHavingClause_Having();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderByClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getOrderByClause()
     * @generated
     */
    EClass ORDER_BY_CLAUSE = eINSTANCE.getOrderByClause();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_BY_CLAUSE__ORDERING = eINSTANCE.getOrderByClause_Ordering();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderBySpecImpl <em>Order By Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.OrderBySpecImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getOrderBySpec()
     * @generated
     */
    EClass ORDER_BY_SPEC = eINSTANCE.getOrderBySpec();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.RangeClauseImpl <em>Range Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.RangeClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getRangeClause()
     * @generated
     */
    EClass RANGE_CLAUSE = eINSTANCE.getRangeClause();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_CLAUSE__START = eINSTANCE.getRangeClause_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_CLAUSE__END = eINSTANCE.getRangeClause_End();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Result Naming</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RESULT_NAMING = eINSTANCE.getExpression_ResultNaming();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__DIRECTION = eINSTANCE.getExpression_Direction();

    /**
     * The meta object literal for the '<em><b>Cast Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__CAST_TYPE = eINSTANCE.getExpression_CastType();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Unary Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__UNARY_OPERATOR = eINSTANCE.getExpression_UnaryOperator();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__LITERAL = eINSTANCE.getExpression_Literal();

    /**
     * The meta object literal for the '<em><b>This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__THIS = eINSTANCE.getExpression_This();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__ID = eINSTANCE.getExpression_Id();

    /**
     * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__PARAMETER_NAME = eINSTANCE.getExpression_ParameterName();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__METHOD = eINSTANCE.getExpression_Method();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__NUMBER = eINSTANCE.getExpression_Number();

    /**
     * The meta object literal for the '<em><b>Persistable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PERSISTABLE = eINSTANCE.getExpression_Persistable();

    /**
     * The meta object literal for the '<em><b>Is Distinct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__IS_DISTINCT = eINSTANCE.getExpression_IsDistinct();

    /**
     * The meta object literal for the '<em><b>Aggregate Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__AGGREGATE_ARGUMENT = eINSTANCE.getExpression_AggregateArgument();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ELEMENT = eINSTANCE.getExpression_Element();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ARG = eINSTANCE.getExpression_Arg();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__KEY = eINSTANCE.getExpression_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__INDEX = eINSTANCE.getExpression_Index();

    /**
     * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__STRING = eINSTANCE.getExpression_String();

    /**
     * The meta object literal for the '<em><b>From Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__FROM_INDEX = eINSTANCE.getExpression_FromIndex();

    /**
     * The meta object literal for the '<em><b>Regex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__REGEX = eINSTANCE.getExpression_Regex();

    /**
     * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__REPLACEMENT = eINSTANCE.getExpression_Replacement();

    /**
     * The meta object literal for the '<em><b>Begin Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BEGIN_INDEX = eINSTANCE.getExpression_BeginIndex();

    /**
     * The meta object literal for the '<em><b>End Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__END_INDEX = eINSTANCE.getExpression_EndIndex();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalOrExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getConditionalOrExpression()
     * @generated
     */
    EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ConditionalAndExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getConditionalAndExpression()
     * @generated
     */
    EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleOrExpressionImpl <em>Simple Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleOrExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSimpleOrExpression()
     * @generated
     */
    EClass SIMPLE_OR_EXPRESSION = eINSTANCE.getSimpleOrExpression();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleAndExpressionImpl <em>Simple And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SimpleAndExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSimpleAndExpression()
     * @generated
     */
    EClass SIMPLE_AND_EXPRESSION = eINSTANCE.getSimpleAndExpression();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ComparisonOperatorExpressionImpl <em>Comparison Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ComparisonOperatorExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getComparisonOperatorExpression()
     * @generated
     */
    EClass COMPARISON_OPERATOR_EXPRESSION = eINSTANCE.getComparisonOperatorExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getComparisonOperatorExpression_Operator();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.AdditionExpressionImpl <em>Addition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.AdditionExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getAdditionExpression()
     * @generated
     */
    EClass ADDITION_EXPRESSION = eINSTANCE.getAdditionExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITION_EXPRESSION__OPERATOR = eINSTANCE.getAdditionExpression_Operator();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.MultiplicationExpressionImpl <em>Multiplication Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.MultiplicationExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getMultiplicationExpression()
     * @generated
     */
    EClass MULTIPLICATION_EXPRESSION = eINSTANCE.getMultiplicationExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION_EXPRESSION__OPERATOR = eINSTANCE.getMultiplicationExpression_Operator();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FieldAccessExpressionImpl <em>Field Access Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FieldAccessExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getFieldAccessExpression()
     * @generated
     */
    EClass FIELD_ACCESS_EXPRESSION = eINSTANCE.getFieldAccessExpression();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection <em>Order By Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.OrderByDirection
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getOrderByDirection()
     * @generated
     */
    EEnum ORDER_BY_DIRECTION = eINSTANCE.getOrderByDirection();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator <em>Unary Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryOperator
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getUnaryOperator()
     * @generated
     */
    EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator <em>Addition Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.AdditionOperator
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getAdditionOperator()
     * @generated
     */
    EEnum ADDITION_OPERATOR = eINSTANCE.getAdditionOperator();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator <em>Multiplication Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.MultiplicationOperator
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getMultiplicationOperator()
     * @generated
     */
    EEnum MULTIPLICATION_OPERATOR = eINSTANCE.getMultiplicationOperator();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator <em>Comparison Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ComparisonOperator
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getComparisonOperator()
     * @generated
     */
    EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

  }

} //JDOQLPackage
