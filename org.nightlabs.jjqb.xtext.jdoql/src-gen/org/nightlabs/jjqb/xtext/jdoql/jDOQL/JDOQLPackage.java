/**
 * <copyright>
 * </copyright>
 *
 */
package org.nightlabs.jjqb.xtext.jdoql.jDOQL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__SELECT = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__FROM = 1;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL__WHERE = 2;

  /**
   * The number of structural features of the '<em>Single String JDOQL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STRING_JDOQL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 1;

  /**
   * The feature id for the '<em><b>Result Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__RESULT_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Into Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__INTO_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Result Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CLAUSE__RESULT_SPECS = 0;

  /**
   * The number of structural features of the '<em>Result Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_CLAUSE_FEATURE_COUNT = 1;

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
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromImpl <em>From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getFrom()
   * @generated
   */
  int FROM = 4;

  /**
   * The feature id for the '<em><b>Candidate Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__CANDIDATE_CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Exclude Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__EXCLUDE_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereImpl <em>Where</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getWhere()
   * @generated
   */
  int WHERE = 5;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE__E = 0;

  /**
   * The number of structural features of the '<em>Where</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHERE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExcludeClauseImpl <em>Exclude Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExcludeClauseImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getExcludeClause()
   * @generated
   */
  int EXCLUDE_CLAUSE = 6;

  /**
   * The feature id for the '<em><b>Exclude Subclasses</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES = 0;

  /**
   * The number of structural features of the '<em>Exclude Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUDE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecsImpl <em>Result Specs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecsImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultSpecs()
   * @generated
   */
  int RESULT_SPECS = 7;

  /**
   * The number of structural features of the '<em>Result Specs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_SPECS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecImpl <em>Result Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultSpec()
   * @generated
   */
  int RESULT_SPEC = 8;

  /**
   * The number of structural features of the '<em>Result Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_SPEC_FEATURE_COUNT = RESULT_SPECS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultNamingImpl <em>Result Naming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultNamingImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultNaming()
   * @generated
   */
  int RESULT_NAMING = 9;

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
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.BooleanExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getBooleanExpression()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Result Naming</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RESULT_NAMING = RESULT_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = RESULT_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = RESULT_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = RESULT_SPEC_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = RESULT_SPEC_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.UnaryExpressionImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Cast</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__CAST = 2;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.PrimaryImpl
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 13;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__LITERAL = 0;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__THIS = 1;

  /**
   * The feature id for the '<em><b>Class Or Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__CLASS_OR_INTERFACE = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = 4;


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
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getSelect()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_Select();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getFrom()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_From();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Where</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL#getWhere()
   * @see #getSingleStringJDOQL()
   * @generated
   */
  EReference getSingleStringJDOQL_Where();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getResultClause <em>Result Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getResultClause()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_ResultClause();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getIntoClause <em>Into Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Into Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select#getIntoClause()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_IntoClause();

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
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.From
   * @generated
   */
  EClass getFrom();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getCandidateClassName <em>Candidate Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Candidate Class Name</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getCandidateClassName()
   * @see #getFrom()
   * @generated
   */
  EAttribute getFrom_CandidateClassName();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getExcludeClause <em>Exclude Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.From#getExcludeClause()
   * @see #getFrom()
   * @generated
   */
  EReference getFrom_ExcludeClause();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Where</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where
   * @generated
   */
  EClass getWhere();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where#getE()
   * @see #getWhere()
   * @generated
   */
  EReference getWhere_E();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause <em>Exclude Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclude Clause</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause
   * @generated
   */
  EClass getExcludeClause();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause#getExcludeSubclasses <em>Exclude Subclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclude Subclasses</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause#getExcludeSubclasses()
   * @see #getExcludeClause()
   * @generated
   */
  EAttribute getExcludeClause_ExcludeSubclasses();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpecs <em>Result Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Specs</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultSpecs
   * @generated
   */
  EClass getResultSpecs();

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
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression
   * @generated
   */
  EClass getBooleanExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression#getLeft()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression#getOp()
   * @see #getBooleanExpression()
   * @generated
   */
  EAttribute getBooleanExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression#getRight()
   * @see #getBooleanExpression()
   * @generated
   */
  EReference getBooleanExpression_Right();

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
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

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
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression#getModifier()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression#getExpression()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression#getCast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cast</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression#getCast()
   * @see #getUnaryExpression()
   * @generated
   */
  EAttribute getUnaryExpression_Cast();

  /**
   * Returns the meta object for class '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getLiteral()
   * @see #getPrimary()
   * @generated
   */
  EAttribute getPrimary_Literal();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getThis <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>This</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getThis()
   * @see #getPrimary()
   * @generated
   */
  EAttribute getPrimary_This();

  /**
   * Returns the meta object for the attribute '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getClassOrInterface <em>Class Or Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Or Interface</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getClassOrInterface()
   * @see #getPrimary()
   * @generated
   */
  EAttribute getPrimary_ClassOrInterface();

  /**
   * Returns the meta object for the containment reference '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary#getExpression()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Expression();

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
     * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__SELECT = eINSTANCE.getSingleStringJDOQL_Select();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__FROM = eINSTANCE.getSingleStringJDOQL_From();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STRING_JDOQL__WHERE = eINSTANCE.getSingleStringJDOQL_Where();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.SelectImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Result Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__RESULT_CLAUSE = eINSTANCE.getSelect_ResultClause();

    /**
     * The meta object literal for the '<em><b>Into Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__INTO_CLAUSE = eINSTANCE.getSelect_IntoClause();

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
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromImpl <em>From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.FromImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getFrom()
     * @generated
     */
    EClass FROM = eINSTANCE.getFrom();

    /**
     * The meta object literal for the '<em><b>Candidate Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM__CANDIDATE_CLASS_NAME = eINSTANCE.getFrom_CandidateClassName();

    /**
     * The meta object literal for the '<em><b>Exclude Clause</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM__EXCLUDE_CLAUSE = eINSTANCE.getFrom_ExcludeClause();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereImpl <em>Where</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.WhereImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getWhere()
     * @generated
     */
    EClass WHERE = eINSTANCE.getWhere();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHERE__E = eINSTANCE.getWhere_E();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExcludeClauseImpl <em>Exclude Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ExcludeClauseImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getExcludeClause()
     * @generated
     */
    EClass EXCLUDE_CLAUSE = eINSTANCE.getExcludeClause();

    /**
     * The meta object literal for the '<em><b>Exclude Subclasses</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES = eINSTANCE.getExcludeClause_ExcludeSubclasses();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecsImpl <em>Result Specs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.ResultSpecsImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getResultSpecs()
     * @generated
     */
    EClass RESULT_SPECS = eINSTANCE.getResultSpecs();

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
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.BooleanExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getBooleanExpression()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__LEFT = eINSTANCE.getBooleanExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXPRESSION__OP = eINSTANCE.getBooleanExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__RIGHT = eINSTANCE.getBooleanExpression_Right();

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
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.UnaryExpressionImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__MODIFIER = eINSTANCE.getUnaryExpression_Modifier();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Cast</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPRESSION__CAST = eINSTANCE.getUnaryExpression_Cast();

    /**
     * The meta object literal for the '{@link org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.PrimaryImpl <em>Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.PrimaryImpl
     * @see org.nightlabs.jjqb.xtext.jdoql.jDOQL.impl.JDOQLPackageImpl#getPrimary()
     * @generated
     */
    EClass PRIMARY = eINSTANCE.getPrimary();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY__LITERAL = eINSTANCE.getPrimary_Literal();

    /**
     * The meta object literal for the '<em><b>This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY__THIS = eINSTANCE.getPrimary_This();

    /**
     * The meta object literal for the '<em><b>Class Or Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY__CLASS_OR_INTERFACE = eINSTANCE.getPrimary_ClassOrInterface();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__EXPRESSION = eINSTANCE.getPrimary_Expression();

  }

} //JDOQLPackage
