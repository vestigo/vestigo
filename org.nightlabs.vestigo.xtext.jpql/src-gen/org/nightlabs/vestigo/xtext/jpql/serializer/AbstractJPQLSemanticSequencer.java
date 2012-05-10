package org.nightlabs.vestigo.xtext.jpql.serializer;

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
import org.nightlabs.vestigo.xtext.jpql.jPQL.AdditionExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AliasAttributeExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AndExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.AvgAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.BooleanLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ComparisonOperatorExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.CountAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.DeleteStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Expression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FloatLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClass;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FromCollection;
import org.nightlabs.vestigo.xtext.jpql.jPQL.FunctionExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.GroupByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.HavingClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.InnerJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.IntegerLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.vestigo.xtext.jpql.jPQL.Join;
import org.nightlabs.vestigo.xtext.jpql.jPQL.LeftJoin;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MaxAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MinAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.MultiplicationExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.NullLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.OrderByClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.ParameterExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectConstructorExpression;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SelectStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SetClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.StringLiteral;
import org.nightlabs.vestigo.xtext.jpql.jPQL.SumAggregate;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateClause;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateItem;
import org.nightlabs.vestigo.xtext.jpql.jPQL.UpdateStatement;
import org.nightlabs.vestigo.xtext.jpql.jPQL.VariableDeclaration;
import org.nightlabs.vestigo.xtext.jpql.jPQL.WhereClause;
import org.nightlabs.vestigo.xtext.jpql.services.JPQLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractJPQLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected JPQLGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == JPQLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JPQLPackage.ADDITION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_AdditionExpression(context, (AdditionExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION:
				if(context == grammarAccess.getAliasAttributeExpressionRule() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_AliasAttributeExpression(context, (AliasAttributeExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOrderBySpecRule()) {
					sequence_OrderBySpec(context, (AliasAttributeExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.AVG_AGGREGATE:
				if(context == grammarAccess.getAvgAggregateRule() ||
				   context == grammarAccess.getSelectAggregateExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_AvgAggregate(context, (AvgAggregate) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.COMPARISON_OPERATOR_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_ComparisonOperatorExpression(context, (ComparisonOperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.COUNT_AGGREGATE:
				if(context == grammarAccess.getCountAggregateRule() ||
				   context == grammarAccess.getSelectAggregateExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_CountAggregate(context, (CountAggregate) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.DELETE_CLAUSE:
				if(context == grammarAccess.getDeleteClauseRule()) {
					sequence_DeleteClause(context, (DeleteClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.DELETE_STATEMENT:
				if(context == grammarAccess.getDeleteStatementRule() ||
				   context == grammarAccess.getJPQLQueryRule()) {
					sequence_DeleteStatement(context, (DeleteStatement) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.EXPRESSION:
				if(context == grammarAccess.getAllExpressionRule()) {
					sequence_AllExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnyExpressionRule()) {
					sequence_AnyExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBetweenExpressionRule()) {
					sequence_BetweenExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCollectionExpressionRule()) {
					sequence_CollectionExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConcreteExpressionRule()) {
					sequence_ConcreteExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEmptyComparisonExpressionRule()) {
					sequence_EmptyComparisonExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExistsExpressionRule()) {
					sequence_ExistsExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInExpressionRule()) {
					sequence_InExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInQueryExpressionRule()) {
					sequence_InQueryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInSeqExpressionRule()) {
					sequence_InSeqExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLikeExpressionRule()) {
					sequence_LikeExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNullComparisonExpressionRule()) {
					sequence_NullComparisonExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSomeExpressionRule()) {
					sequence_SomeExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.FLOAT:
				if(context == grammarAccess.getFloatRule()) {
					sequence_Float(context, (org.nightlabs.vestigo.xtext.jpql.jPQL.Float) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.FLOAT_LITERAL:
				if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getFloatLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_FloatLiteral(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.FROM_CLASS:
				if(context == grammarAccess.getFromClassIdRule()) {
					sequence_FromClassId(context, (FromClass) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFromClassVarRule()) {
					sequence_FromClassVar(context, (FromClass) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFromClassRule() ||
				   context == grammarAccess.getFromEntryRule()) {
					sequence_FromClass(context, (FromClass) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.FROM_CLAUSE:
				if(context == grammarAccess.getFromClauseRule()) {
					sequence_FromClause(context, (FromClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.FROM_COLLECTION:
				if(context == grammarAccess.getFromCollectionRule() ||
				   context == grammarAccess.getFromEntryRule()) {
					sequence_FromCollection(context, (FromCollection) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.FUNCTION_EXPRESSION:
				if(context == grammarAccess.getArithmeticFunctionExpressionRule()) {
					sequence_ArithmeticFunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCollectionFunctionExpressionRule()) {
					sequence_CollectionFunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getFunctionExpressionRule()) {
					sequence_FunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStringFunctionExpressionRule()) {
					sequence_StringFunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTemporalFunctionExpressionRule()) {
					sequence_TemporalFunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.GROUP_BY_CLAUSE:
				if(context == grammarAccess.getGroupByClauseRule()) {
					sequence_GroupByClause(context, (GroupByClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.HAVING_CLAUSE:
				if(context == grammarAccess.getHavingClauseRule()) {
					sequence_HavingClause(context, (HavingClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.INNER_JOIN:
				if(context == grammarAccess.getFromJoinRule() ||
				   context == grammarAccess.getInnerJoinRule()) {
					sequence_InnerJoin(context, (InnerJoin) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getIntegerLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.JOIN:
				if(context == grammarAccess.getFromJoinRule() ||
				   context == grammarAccess.getJoinRule()) {
					sequence_Join(context, (Join) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.LEFT_JOIN:
				if(context == grammarAccess.getFromJoinRule() ||
				   context == grammarAccess.getLeftJoinRule()) {
					sequence_LeftJoin(context, (LeftJoin) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.MAX_AGGREGATE:
				if(context == grammarAccess.getMaxAggregateRule() ||
				   context == grammarAccess.getSelectAggregateExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_MaxAggregate(context, (MaxAggregate) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.MIN_AGGREGATE:
				if(context == grammarAccess.getMinAggregateRule() ||
				   context == grammarAccess.getSelectAggregateExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_MinAggregate(context, (MinAggregate) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.MULTIPLICATION_EXPRESSION:
				if(context == grammarAccess.getAdditionExpressionRule() ||
				   context == grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getComparisonOperatorExpressionRule() ||
				   context == grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0() ||
				   context == grammarAccess.getMultiplicationExpressionRule() ||
				   context == grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_MultiplicationExpression(context, (MultiplicationExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.NULL_LITERAL:
				if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNullLiteralRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.OR_EXPRESSION:
				if(context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.ORDER_BY_CLAUSE:
				if(context == grammarAccess.getOrderByClauseRule()) {
					sequence_OrderByClause(context, (OrderByClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.PARAMETER_EXPRESSION:
				if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getParameterExpressionRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_ParameterExpression(context, (ParameterExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.SELECT_CLAUSE:
				if(context == grammarAccess.getSelectClauseRule()) {
					sequence_SelectClause(context, (SelectClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.SELECT_CONSTRUCTOR_EXPRESSION:
				if(context == grammarAccess.getSelectConstructorExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule()) {
					sequence_SelectConstructorExpression(context, (SelectConstructorExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.SELECT_STATEMENT:
				if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getJPQLQueryRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getSelectStatementRule() ||
				   context == grammarAccess.getSubqueryRule()) {
					sequence_SelectStatement(context, (SelectStatement) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.SET_CLAUSE:
				if(context == grammarAccess.getSetClauseRule()) {
					sequence_SetClause(context, (SetClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.STRING_LITERAL:
				if(context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getParenthesesExpressionRule() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.SUM_AGGREGATE:
				if(context == grammarAccess.getSelectAggregateExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule() ||
				   context == grammarAccess.getSumAggregateRule()) {
					sequence_SumAggregate(context, (SumAggregate) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.UPDATE_CLAUSE:
				if(context == grammarAccess.getUpdateClauseRule()) {
					sequence_UpdateClause(context, (UpdateClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.UPDATE_ITEM:
				if(context == grammarAccess.getUpdateItemRule()) {
					sequence_UpdateItem(context, (UpdateItem) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.UPDATE_STATEMENT:
				if(context == grammarAccess.getJPQLQueryRule() ||
				   context == grammarAccess.getUpdateStatementRule()) {
					sequence_UpdateStatement(context, (UpdateStatement) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.WHERE_CLAUSE:
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
	 *     (alias=[VariableDeclaration|ID] attributes+=ID*)
	 */
	protected void sequence_AliasAttributeExpression(EObject context, AliasAttributeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=Subquery
	 */
	protected void sequence_AllExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=AndExpression_AndExpression_1_0 entries+=ComparisonOperatorExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=Subquery
	 */
	protected void sequence_AnyExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='ABS' field=AdditionExpression) | 
	 *         (name='SQRT' field=AdditionExpression) | 
	 *         (name='MOD' fields+=AdditionExpression fields+=AdditionExpression)
	 *     )
	 */
	protected void sequence_ArithmeticFunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? item=AliasAttributeExpression)
	 */
	protected void sequence_AvgAggregate(EObject context, AvgAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Variable isNot?='NOT'? min=Literal max=Literal)
	 */
	protected void sequence_BetweenExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='TRUE' | value='FALSE')
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Variable isNot?='NOT'? right=AliasAttributeExpression)
	 */
	protected void sequence_CollectionExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name='INDEX' field=Variable) | (name='SIZE' field=Variable))
	 */
	protected void sequence_CollectionFunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (
	 *         right=Subquery | 
	 *         right=Subquery | 
	 *         right=Subquery | 
	 *         right=Subquery | 
	 *         (left=Variable isNot?='NOT'? right=AliasAttributeExpression) | 
	 *         (left=Variable isNot?='NOT'?) | 
	 *         (left=Variable isNot?='NOT'?) | 
	 *         (left=Variable isNot?='NOT'? right=Variable) | 
	 *         (left=Variable isNot?='NOT'? items+=Variable items+=Variable*) | 
	 *         (left=Variable isNot?='NOT'? query=Subquery) | 
	 *         (left=Variable isNot?='NOT'? min=Literal max=Literal)
	 *     )
	 */
	protected void sequence_ConcreteExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? item=AliasAttributeExpression)
	 */
	protected void sequence_CountAggregate(EObject context, CountAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fromClause=FromClause
	 */
	protected void sequence_DeleteClause(EObject context, DeleteClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.DELETE_CLAUSE__FROM_CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.DELETE_CLAUSE__FROM_CLAUSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0(), semanticObject.getFromClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (deleteClause=DeleteClause whereClause=WhereClause?)
	 */
	protected void sequence_DeleteStatement(EObject context, DeleteStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Variable isNot?='NOT'?)
	 */
	protected void sequence_EmptyComparisonExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=Subquery
	 */
	protected void sequence_ExistsExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Float
	 */
	protected void sequence_FloatLiteral(EObject context, FloatLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (integerValue=INT fractionValue=INT)
	 */
	protected void sequence_Float(EObject context, org.nightlabs.vestigo.xtext.jpql.jPQL.Float semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.FLOAT__INTEGER_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.FLOAT__INTEGER_VALUE));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.FLOAT__FRACTION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.FLOAT__FRACTION_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatAccess().getIntegerValueINTTerminalRuleCall_0_0(), semanticObject.getIntegerValue());
		feeder.accept(grammarAccess.getFloatAccess().getFractionValueINTTerminalRuleCall_2_0(), semanticObject.getFractionValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=QualifiedIdentifier
	 */
	protected void sequence_FromClassId(EObject context, FromClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedIdentifier variable=VariableDeclaration joins+=FromJoin*)
	 */
	protected void sequence_FromClassVar(EObject context, FromClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=QualifiedIdentifier | (type=QualifiedIdentifier variable=VariableDeclaration joins+=FromJoin*))
	 */
	protected void sequence_FromClass(EObject context, FromClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromEntries+=FromClass fromEntries+=FromEntry*)
	 */
	protected void sequence_FromClause(EObject context, FromClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (path=AliasAttributeExpression variable=VariableDeclaration)
	 */
	protected void sequence_FromCollection(EObject context, FromCollection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.FROM_ENTRY__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.FROM_ENTRY__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.FROM_COLLECTION__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.FROM_COLLECTION__PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='ABS' field=AdditionExpression) | 
	 *         (name='SQRT' field=AdditionExpression) | 
	 *         (name='MOD' fields+=AdditionExpression fields+=AdditionExpression) | 
	 *         (name='INDEX' field=Variable) | 
	 *         (name='SIZE' field=Variable) | 
	 *         (name='CONCAT' fields+=ConcreteExpression fields+=ConcreteExpression*) | 
	 *         (name='SUBSTRING' field=ConcreteExpression startPos=AdditionExpression length=AdditionExpression?) | 
	 *         (name='TRIM' trimSpec=TrimSpec? trimChar=ConcreteExpression? field=Variable) | 
	 *         (name='LOWER' field=ConcreteExpression) | 
	 *         (name='UPPER' field=ConcreteExpression) | 
	 *         (name='LENGTH' field=ConcreteExpression) | 
	 *         (name='LOCATE' fields+=ConcreteExpression fields+=ConcreteExpression startPos=AdditionExpression?) | 
	 *         name='CURRENT_DATE' | 
	 *         name='CURRENT_TIME' | 
	 *         name='CURRENT_TIMESTAMP' | 
	 *         (name='YEAR' field=AdditionExpression) | 
	 *         (name='MONTH' field=AdditionExpression) | 
	 *         (name='DAY' field=AdditionExpression) | 
	 *         (name='HOUR' field=AdditionExpression) | 
	 *         (name='MINUTE' field=AdditionExpression) | 
	 *         (name='SECOND' field=AdditionExpression)
	 *     )
	 */
	protected void sequence_FunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (grouping+=AliasAttributeExpression grouping+=AliasAttributeExpression* havingClause=HavingClause?)
	 */
	protected void sequence_GroupByClause(EObject context, GroupByClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     having=OrExpression
	 */
	protected void sequence_HavingClause(EObject context, HavingClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.HAVING_CLAUSE__HAVING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.HAVING_CLAUSE__HAVING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0(), semanticObject.getHaving());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Variable isNot?='NOT'? items+=Variable items+=Variable*) | (left=Variable isNot?='NOT'? query=Subquery))
	 */
	protected void sequence_InExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Variable isNot?='NOT'? query=Subquery)
	 */
	protected void sequence_InQueryExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Variable isNot?='NOT'? items+=Variable items+=Variable*)
	 */
	protected void sequence_InSeqExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isFetch?='FETCH'? path=AliasAttributeExpression variable=VariableDeclaration)
	 */
	protected void sequence_InnerJoin(EObject context, InnerJoin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntegerLiteral(EObject context, IntegerLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isFetch?='FETCH'? path=AliasAttributeExpression variable=VariableDeclaration)
	 */
	protected void sequence_Join(EObject context, Join semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isOuter?='OUTER'? isFetch?='FETCH'? path=AliasAttributeExpression variable=VariableDeclaration)
	 */
	protected void sequence_LeftJoin(EObject context, LeftJoin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Variable isNot?='NOT'? right=Variable)
	 */
	protected void sequence_LikeExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? item=AliasAttributeExpression)
	 */
	protected void sequence_MaxAggregate(EObject context, MaxAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? item=AliasAttributeExpression)
	 */
	protected void sequence_MinAggregate(EObject context, MinAggregate semanticObject) {
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
	 *     (left=Variable isNot?='NOT'?)
	 */
	protected void sequence_NullComparisonExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='NULL'
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=OrExpression_OrExpression_1_0 entries+=AndExpression)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
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
	 *     (alias=[VariableDeclaration|ID] attributes+=ID* direction=OrderByDirection)
	 */
	protected void sequence_OrderBySpec(EObject context, AliasAttributeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ParameterName | index=INT)
	 */
	protected void sequence_ParameterExpression(EObject context, ParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? expressions+=SelectExpression expressions+=SelectExpression*)
	 */
	protected void sequence_SelectClause(EObject context, SelectClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID items+=AliasAttributeExpression items+=AliasAttributeExpression*)
	 */
	protected void sequence_SelectConstructorExpression(EObject context, SelectConstructorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectClause=SelectClause? fromClause=FromClause whereClause=WhereClause? groupByClause=GroupByClause? orderByClause=OrderByClause?)
	 */
	protected void sequence_SelectStatement(EObject context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=UpdateItem items+=UpdateItem*)
	 */
	protected void sequence_SetClause(EObject context, SetClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     right=Subquery
	 */
	protected void sequence_SomeExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name='CONCAT' fields+=ConcreteExpression fields+=ConcreteExpression*) | 
	 *         (name='SUBSTRING' field=ConcreteExpression startPos=AdditionExpression length=AdditionExpression?) | 
	 *         (name='TRIM' trimSpec=TrimSpec? trimChar=ConcreteExpression? field=Variable) | 
	 *         (name='LOWER' field=ConcreteExpression) | 
	 *         (name='UPPER' field=ConcreteExpression) | 
	 *         (name='LENGTH' field=ConcreteExpression) | 
	 *         (name='LOCATE' fields+=ConcreteExpression fields+=ConcreteExpression startPos=AdditionExpression?)
	 *     )
	 */
	protected void sequence_StringFunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isDistinct?='DISTINCT'? item=AliasAttributeExpression)
	 */
	protected void sequence_SumAggregate(EObject context, SumAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name='CURRENT_DATE' | 
	 *         name='CURRENT_TIME' | 
	 *         name='CURRENT_TIMESTAMP' | 
	 *         (name='YEAR' field=AdditionExpression) | 
	 *         (name='MONTH' field=AdditionExpression) | 
	 *         (name='DAY' field=AdditionExpression) | 
	 *         (name='HOUR' field=AdditionExpression) | 
	 *         (name='MINUTE' field=AdditionExpression) | 
	 *         (name='SECOND' field=AdditionExpression)
	 *     )
	 */
	protected void sequence_TemporalFunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryOperator=UnaryOperator? right=ConcreteExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromEntries+=FromEntry fromEntries+=FromEntry*)
	 */
	protected void sequence_UpdateClause(EObject context, UpdateClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=AliasAttributeExpression value=Literal)
	 */
	protected void sequence_UpdateItem(EObject context, UpdateItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.UPDATE_ITEM__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.UPDATE_ITEM__ALIAS));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.UPDATE_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.UPDATE_ITEM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0(), semanticObject.getAlias());
		feeder.accept(grammarAccess.getUpdateItemAccess().getValueLiteralParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (updateClause=UpdateClause setClause=SetClause whereClause=WhereClause?)
	 */
	protected void sequence_UpdateStatement(EObject context, UpdateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     whereEntry=OrExpression
	 */
	protected void sequence_WhereClause(EObject context, WhereClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.WHERE_CLAUSE__WHERE_ENTRY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.WHERE_CLAUSE__WHERE_ENTRY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0(), semanticObject.getWhereEntry());
		feeder.finish();
	}
}
