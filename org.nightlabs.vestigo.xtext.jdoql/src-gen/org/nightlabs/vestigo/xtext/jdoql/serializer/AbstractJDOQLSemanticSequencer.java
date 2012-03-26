package org.nightlabs.vestigo.xtext.jdoql.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.AdditionExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.Alias;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ComparisonOperatorExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ConditionalAndExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ConditionalOrExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.FieldAccessExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.FromClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.GroupByClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.HavingClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ImportClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.IntoClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.MultiplicationExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.OrderByClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ParameterDeclaration;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ParametersClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.RangeClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ResultClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.ResultNaming;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SelectClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SimpleAndExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SimpleOrExpression;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SingleStringJDOQL;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.Subquery;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryFromClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.SubqueryResultClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.VariableDeclaration;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.VariablesClause;
import org.nightlabs.vestigo.xtext.jdoql.jDOQL.WhereClause;
import org.nightlabs.vestigo.xtext.jdoql.services.JDOQLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractJDOQLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected JDOQLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JDOQLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JDOQLPackage.ADDITION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleOrExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()) {
					sequence_AdditionExpression(context, (AdditionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (AdditionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (AdditionExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.ALIAS:
				if(context == grammarAccess.getAliasRule()) {
					sequence_Alias(context, (Alias) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.COMPARISON_OPERATOR_EXPRESSION:
				if(context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleOrExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()) {
					sequence_ComparisonOperatorExpression(context, (ComparisonOperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (ComparisonOperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (ComparisonOperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.CONDITIONAL_AND_EXPRESSION:
				if(context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule()) {
					sequence_ConditionalAndExpression(context, (ConditionalAndExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (ConditionalAndExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (ConditionalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.CONDITIONAL_OR_EXPRESSION:
				if(context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule()) {
					sequence_ConditionalOrExpression(context, (ConditionalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (ConditionalOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (ConditionalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.EXPRESSION:
				if(context == grammarAccess.getMethodExpressionRule()) {
					sequence_MethodExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStaticMethodExpressionRule()) {
					sequence_StaticMethodExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFieldAccessExpressionRule()) {
					sequence_StaticMethodExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleOrExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.FIELD_ACCESS_EXPRESSION:
				if(context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0()) {
					sequence_FieldAccessExpression(context, (FieldAccessExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.FROM_CLAUSE:
				if(context == grammarAccess.getFromClauseRule()) {
					sequence_FromClause(context, (FromClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.GROUP_BY_CLAUSE:
				if(context == grammarAccess.getGroupByClauseRule()) {
					sequence_GroupByClause(context, (GroupByClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.HAVING_CLAUSE:
				if(context == grammarAccess.getHavingClauseRule()) {
					sequence_HavingClause(context, (HavingClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.IMPORT_CLAUSE:
				if(context == grammarAccess.getImportClauseRule()) {
					sequence_ImportClause(context, (ImportClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.INTO_CLAUSE:
				if(context == grammarAccess.getIntoClauseRule()) {
					sequence_IntoClause(context, (IntoClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.MULTIPLICATION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleOrExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()) {
					sequence_MultiplicationExpression(context, (MultiplicationExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (MultiplicationExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (MultiplicationExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.ORDER_BY_CLAUSE:
				if(context == grammarAccess.getOrderByClauseRule()) {
					sequence_OrderByClause(context, (OrderByClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.PARAMETER_DECLARATION:
				if(context == grammarAccess.getParameterDeclarationRule()) {
					sequence_ParameterDeclaration(context, (ParameterDeclaration) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.PARAMETERS_CLAUSE:
				if(context == grammarAccess.getParametersClauseRule()) {
					sequence_ParametersClause(context, (ParametersClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.RANGE_CLAUSE:
				if(context == grammarAccess.getRangeClauseRule()) {
					sequence_RangeClause(context, (RangeClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.RESULT_CLAUSE:
				if(context == grammarAccess.getResultClauseRule()) {
					sequence_ResultClause(context, (ResultClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.RESULT_NAMING:
				if(context == grammarAccess.getResultNamingRule()) {
					sequence_ResultNaming(context, (ResultNaming) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SELECT_CLAUSE:
				if(context == grammarAccess.getSelectClauseRule()) {
					sequence_SelectClause(context, (SelectClause) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubquerySelectClauseRule()) {
					sequence_SubquerySelectClause(context, (SelectClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SIMPLE_AND_EXPRESSION:
				if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (SimpleAndExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (SimpleAndExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionRule() ||
				   context == grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleOrExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()) {
					sequence_SimpleAndExpression(context, (SimpleAndExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SIMPLE_OR_EXPRESSION:
				if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (SimpleOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule()) {
					sequence_ResultSpec(context, (SimpleOrExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionalAndExpressionRule() ||
				   context == grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getConditionalOrExpressionRule() ||
				   context == grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionRule() ||
				   context == grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()) {
					sequence_SimpleOrExpression(context, (SimpleOrExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SINGLE_STRING_JDOQL:
				if(context == grammarAccess.getSingleStringJDOQLRule()) {
					sequence_SingleStringJDOQL(context, (SingleStringJDOQL) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SUBQUERY:
				if(context == grammarAccess.getFieldAccessExpressionRule() ||
				   context == grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParameterOrFieldOrMethodExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSubqueryRule()) {
					sequence_Subquery(context, (Subquery) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SUBQUERY_FROM_CLAUSE:
				if(context == grammarAccess.getSubqueryFromClauseRule()) {
					sequence_SubqueryFromClause(context, (SubqueryFromClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SUBQUERY_RESULT_CLAUSE:
				if(context == grammarAccess.getSubqueryResultClauseRule()) {
					sequence_SubqueryResultClause(context, (SubqueryResultClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.VARIABLES_CLAUSE:
				if(context == grammarAccess.getVariablesClauseRule()) {
					sequence_VariablesClause(context, (VariablesClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.WHERE_CLAUSE:
				if(context == grammarAccess.getWhereClauseRule()) {
					sequence_WhereClause(context, (WhereClause) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AdditionExpression_AdditionExpression_1_0 operator=AdditionOperator right=MultiplicationExpression)
	 */
	protected void sequence_AdditionExpression(EObject context, AdditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     identifier=ID
	 */
	protected void sequence_Alias(EObject context, Alias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.ALIAS__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.ALIAS__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasAccess().getIdentifierIDTerminalRuleCall_1_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonOperatorExpression_ComparisonOperatorExpression_1_0 operator=ComparisonOperator right=AdditionExpression)
	 */
	protected void sequence_ComparisonOperatorExpression(EObject context, ComparisonOperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalAndExpression_ConditionalAndExpression_1_0 right=SimpleOrExpression)
	 */
	protected void sequence_ConditionalAndExpression(EObject context, ConditionalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalOrExpression_ConditionalOrExpression_1_0 right=ConditionalAndExpression)
	 */
	protected void sequence_ConditionalOrExpression(EObject context, ConditionalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FieldAccessExpression_FieldAccessExpression_1_1_0 right=FieldOrMethodExpression)
	 */
	protected void sequence_FieldAccessExpression(EObject context, FieldAccessExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (candidateClassName=CandidateClassName isExcludeSubclasses?='EXCLUDE'?)
	 */
	protected void sequence_FromClause(EObject context, FromClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (grouping+=ConditionalOrExpression grouping+=ConditionalOrExpression* havingClause=HavingClause?)
	 */
	protected void sequence_GroupByClause(EObject context, GroupByClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     having=ConditionalOrExpression
	 */
	protected void sequence_HavingClause(EObject context, HavingClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.HAVING_CLAUSE__HAVING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.HAVING_CLAUSE__HAVING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHavingClauseAccess().getHavingConditionalOrExpressionParserRuleCall_1_0(), semanticObject.getHaving());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (importDeclarations+=ImportDeclaration importDeclarations+=ImportDeclaration*)
	 */
	protected void sequence_ImportClause(EObject context, ImportClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     resultClassName=ClassOrInterfaceName
	 */
	protected void sequence_IntoClause(EObject context, IntoClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.INTO_CLAUSE__RESULT_CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.INTO_CLAUSE__RESULT_CLASS_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0(), semanticObject.getResultClassName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='contains' element=ConditionalOrExpression) | 
	 *         (name='get' arg=ConditionalOrExpression) | 
	 *         name='isEmpty' | 
	 *         name='size' | 
	 *         (name='containsKey' key=ConditionalOrExpression) | 
	 *         (name='containsValue' value=ConditionalOrExpression) | 
	 *         (name='containsEntry' key=ConditionalOrExpression value=ConditionalOrExpression) | 
	 *         (name='charAt' index=ConditionalOrExpression) | 
	 *         (name='endsWith' string=ConditionalOrExpression) | 
	 *         (name='equals' string=ConditionalOrExpression) | 
	 *         (name='equalsIgnoreCase' string=ConditionalOrExpression) | 
	 *         (name='indexOf' string=ConditionalOrExpression fromIndex=ConditionalOrExpression?) | 
	 *         name='length' | 
	 *         (name='matches' regex=ConditionalOrExpression) | 
	 *         (name='replaceAll' regex=ConditionalOrExpression replacement=ConditionalOrExpression) | 
	 *         (name='startsWith' string=ConditionalOrExpression) | 
	 *         (name='substring' beginIndex=ConditionalOrExpression endIndex=ConditionalOrExpression?) | 
	 *         name='toLowerCase' | 
	 *         name='toUpperCase' | 
	 *         name='trim' | 
	 *         name='getDay' | 
	 *         name='getMonth' | 
	 *         name='getYear' | 
	 *         name='getHour' | 
	 *         name='getMinute' | 
	 *         name='getSecond' | 
	 *         name='ordinal' | 
	 *         name='toString'
	 *     )
	 */
	protected void sequence_MethodExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationExpression_MultiplicationExpression_1_0 operator=MultiplicationOperator right=UnaryExpression)
	 */
	protected void sequence_MultiplicationExpression(EObject context, MultiplicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ordering+=OrderBySpec ordering+=OrderBySpec*)
	 */
	protected void sequence_OrderByClause(EObject context, OrderByClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditionExpression_AdditionExpression_1_0 operator=AdditionOperator right=MultiplicationExpression direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, AdditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=ComparisonOperatorExpression_ComparisonOperatorExpression_1_0 
	 *         operator=ComparisonOperator 
	 *         right=AdditionExpression 
	 *         direction=OrderByDirection
	 *     )
	 */
	protected void sequence_OrderBySpec(EObject context, ComparisonOperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalAndExpression_ConditionalAndExpression_1_0 right=SimpleOrExpression direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, ConditionalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalOrExpression_ConditionalOrExpression_1_0 right=ConditionalAndExpression direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, ConditionalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((castType=Type right=FieldAccessExpression) | (unaryOperator=UnaryOperator? right=FieldAccessExpression)) direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationExpression_MultiplicationExpression_1_0 operator=MultiplicationOperator right=UnaryExpression direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, MultiplicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleAndExpression_SimpleAndExpression_1_0 right=ComparisonOperatorExpression direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, SimpleAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleOrExpression_SimpleOrExpression_1_0 right=SimpleAndExpression direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, SimpleOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type declaredParameterName=DeclaredParameterName)
	 */
	protected void sequence_ParameterDeclaration(EObject context, ParameterDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.PARAMETER_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.PARAMETER_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.PARAMETER_DECLARATION__DECLARED_PARAMETER_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameDeclaredParameterNameParserRuleCall_1_0(), semanticObject.getDeclaredParameterName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameterDeclarations+=ParameterDeclaration parameterDeclarations+=ParameterDeclaration*)
	 */
	protected void sequence_ParametersClause(EObject context, ParametersClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=ConditionalOrExpression end=ConditionalOrExpression)
	 */
	protected void sequence_RangeClause(EObject context, RangeClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.RANGE_CLAUSE__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.RANGE_CLAUSE__START));
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.RANGE_CLAUSE__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.RANGE_CLAUSE__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeClauseAccess().getStartConditionalOrExpressionParserRuleCall_1_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getRangeClauseAccess().getEndConditionalOrExpressionParserRuleCall_3_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? resultSpecs+=ResultSpec resultSpecs+=ResultSpec*)
	 */
	protected void sequence_ResultClause(EObject context, ResultClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     identifier=ID
	 */
	protected void sequence_ResultNaming(EObject context, ResultNaming semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.RESULT_NAMING__IDENTIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.RESULT_NAMING__IDENTIFIER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResultNamingAccess().getIdentifierIDTerminalRuleCall_1_0(), semanticObject.getIdentifier());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditionExpression_AdditionExpression_1_0 operator=AdditionOperator right=MultiplicationExpression resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, AdditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=ComparisonOperatorExpression_ComparisonOperatorExpression_1_0 
	 *         operator=ComparisonOperator 
	 *         right=AdditionExpression 
	 *         resultNaming=ResultNaming?
	 *     )
	 */
	protected void sequence_ResultSpec(EObject context, ComparisonOperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalAndExpression_ConditionalAndExpression_1_0 right=SimpleOrExpression resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, ConditionalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConditionalOrExpression_ConditionalOrExpression_1_0 right=ConditionalAndExpression resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, ConditionalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((castType=Type right=FieldAccessExpression) | (unaryOperator=UnaryOperator? right=FieldAccessExpression)) resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicationExpression_MultiplicationExpression_1_0 operator=MultiplicationOperator right=UnaryExpression resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, MultiplicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleAndExpression_SimpleAndExpression_1_0 right=ComparisonOperatorExpression resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, SimpleAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleOrExpression_SimpleOrExpression_1_0 right=SimpleAndExpression resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, SimpleOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isUnique?='UNIQUE'? resultClause=ResultClause? intoClause=IntoClause?)
	 */
	protected void sequence_SelectClause(EObject context, SelectClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleAndExpression_SimpleAndExpression_1_0 right=ComparisonOperatorExpression)
	 */
	protected void sequence_SimpleAndExpression(EObject context, SimpleAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleOrExpression_SimpleOrExpression_1_0 right=SimpleAndExpression)
	 */
	protected void sequence_SimpleOrExpression(EObject context, SimpleOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         selectClause=SelectClause 
	 *         fromClause=FromClause 
	 *         whereClause=WhereClause? 
	 *         variablesClause=VariablesClause? 
	 *         parametersClause=ParametersClause? 
	 *         importClause=ImportClause? 
	 *         groupByClause=GroupByClause? 
	 *         orderByClause=OrderByClause? 
	 *         rangeClause=RangeClause?
	 *     )
	 */
	protected void sequence_SingleStringJDOQL(EObject context, SingleStringJDOQL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='Math.abs' number=ConditionalOrExpression) | 
	 *         (name='Math.sqrt' number=ConditionalOrExpression) | 
	 *         (name='Math.cos' number=ConditionalOrExpression) | 
	 *         (name='Math.sin' number=ConditionalOrExpression) | 
	 *         (name='Math.tan' number=ConditionalOrExpression) | 
	 *         (name='Math.acos' number=ConditionalOrExpression) | 
	 *         (name='Math.asin' number=ConditionalOrExpression) | 
	 *         (name='Math.atan' number=ConditionalOrExpression) | 
	 *         (name='Math.ceil' number=ConditionalOrExpression) | 
	 *         (name='Math.exp' number=ConditionalOrExpression) | 
	 *         (name='Math.floor' number=ConditionalOrExpression) | 
	 *         (name='Math.log' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.abs' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.sqrt' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.cos' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.sin' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.tan' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.acos' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.asin' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.atan' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.ceil' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.exp' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.floor' number=ConditionalOrExpression) | 
	 *         (name='java.lang.Math.log' number=ConditionalOrExpression) | 
	 *         (name='JDOHelper.getObjectId' persistable=ConditionalOrExpression) | 
	 *         (name='JDOHelper.getVersion' persistable=ConditionalOrExpression) | 
	 *         (name='javax.jdo.JDOHelper.getObjectId' persistable=ConditionalOrExpression) | 
	 *         (name='javax.jdo.JDOHelper.getVersion' persistable=ConditionalOrExpression) | 
	 *         (name='count' isDistinct?='DISTINCT'? aggregateArgument=ConditionalOrExpression) | 
	 *         (name='sum' isDistinct?='DISTINCT'? aggregateArgument=ConditionalOrExpression) | 
	 *         (name='min' aggregateArgument=ConditionalOrExpression) | 
	 *         (name='max' aggregateArgument=ConditionalOrExpression) | 
	 *         (name='avg' isDistinct?='DISTINCT'? aggregateArgument=ConditionalOrExpression) | 
	 *         ((castType=Type right=FieldAccessExpression) | (unaryOperator=UnaryOperator? right=FieldAccessExpression))
	 *     )
	 */
	protected void sequence_StaticMethodExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((fieldAccessExpression=FieldAccessExpression | candidateClassName=CandidateClassName) alias=Alias? isExcludeSubclasses?='EXCLUDE'?)
	 */
	protected void sequence_SubqueryFromClause(EObject context, SubqueryFromClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? resultExpression=ConditionalOrExpression)
	 */
	protected void sequence_SubqueryResultClause(EObject context, SubqueryResultClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isUnique?='UNIQUE'? resultClause=SubqueryResultClause? intoClause=IntoClause?)
	 */
	protected void sequence_SubquerySelectClause(EObject context, SelectClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         selectClause=SubquerySelectClause 
	 *         fromClause=SubqueryFromClause 
	 *         whereClause=WhereClause? 
	 *         variablesClause=VariablesClause? 
	 *         parametersClause=ParametersClause? 
	 *         importClause=ImportClause?
	 *     )
	 */
	protected void sequence_Subquery(EObject context, Subquery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((castType=Type right=FieldAccessExpression) | (unaryOperator=UnaryOperator? right=FieldAccessExpression))
	 */
	protected void sequence_UnaryExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type variableName=VariableName)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.VARIABLE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.VARIABLE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.VARIABLE_DECLARATION__VARIABLE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.VARIABLE_DECLARATION__VARIABLE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_1_0(), semanticObject.getVariableName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variableDeclarations+=VariableDeclaration variableDeclarations+=VariableDeclaration*)
	 */
	protected void sequence_VariablesClause(EObject context, VariablesClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     filter=ConditionalOrExpression
	 */
	protected void sequence_WhereClause(EObject context, WhereClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.WHERE_CLAUSE__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.WHERE_CLAUSE__FILTER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhereClauseAccess().getFilterConditionalOrExpressionParserRuleCall_1_0(), semanticObject.getFilter());
		feeder.finish();
	}
}
