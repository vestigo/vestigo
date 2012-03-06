package org.nightlabs.jjqb.xtext.jpql.serializer;

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
import org.nightlabs.jjqb.xtext.jpql.jPQL.AliasAttributeExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.AllExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.AndExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.AnyExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.AvgAggregate;
import org.nightlabs.jjqb.xtext.jpql.jPQL.BetweenExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.BooleanExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.CollectionExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.CountAggregate;
import org.nightlabs.jjqb.xtext.jpql.jPQL.DateTimeExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.DeleteClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.DeleteStatement;
import org.nightlabs.jjqb.xtext.jpql.jPQL.EmptyComparisonExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.ExistsExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.FromClass;
import org.nightlabs.jjqb.xtext.jpql.jPQL.FromClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.FromCollection;
import org.nightlabs.jjqb.xtext.jpql.jPQL.Function;
import org.nightlabs.jjqb.xtext.jpql.jPQL.HavingClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.Import;
import org.nightlabs.jjqb.xtext.jpql.jPQL.InQueryExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.InSeqExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.InnerJoin;
import org.nightlabs.jjqb.xtext.jpql.jPQL.IntegerExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.JPQLPackage;
import org.nightlabs.jjqb.xtext.jpql.jPQL.Join;
import org.nightlabs.jjqb.xtext.jpql.jPQL.LeftJoin;
import org.nightlabs.jjqb.xtext.jpql.jPQL.LikeExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.MaxAggregate;
import org.nightlabs.jjqb.xtext.jpql.jPQL.MinAggregate;
import org.nightlabs.jjqb.xtext.jpql.jPQL.NamedQuery;
import org.nightlabs.jjqb.xtext.jpql.jPQL.NullComparisonExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.NullExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OperatorExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OrExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OrderClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.OrderItem;
import org.nightlabs.jjqb.xtext.jpql.jPQL.ParameterExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.QueryModule;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectConstructorExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectFromClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SelectStatement;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SetClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SomeExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.StringExpression;
import org.nightlabs.jjqb.xtext.jpql.jPQL.SumAggregate;
import org.nightlabs.jjqb.xtext.jpql.jPQL.UpdateClause;
import org.nightlabs.jjqb.xtext.jpql.jPQL.UpdateItem;
import org.nightlabs.jjqb.xtext.jpql.jPQL.UpdateStatement;
import org.nightlabs.jjqb.xtext.jpql.jPQL.VariableDeclaration;
import org.nightlabs.jjqb.xtext.jpql.jPQL.WhereClause;
import org.nightlabs.jjqb.xtext.jpql.services.JPQLGrammarAccess;

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
			case JPQLPackage.ALIAS_ATTRIBUTE_EXPRESSION:
				if(context == grammarAccess.getAliasAttributeExpressionRule() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getSelectExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_AliasAttributeExpression(context, (AliasAttributeExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.ALL_EXPRESSION:
				if(context == grammarAccess.getAllExpressionRule() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_AllExpression(context, (AllExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.ANY_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getAnyExpressionRule() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_AnyExpression(context, (AnyExpression) semanticObject); 
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
			case JPQLPackage.BETWEEN_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getBetweenExpressionRule() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_BetweenExpression(context, (BetweenExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.COLLECTION_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getCollectionExpressionRule() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_CollectionExpression(context, (CollectionExpression) semanticObject); 
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
			case JPQLPackage.DATE_TIME_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getDateTimeExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_DateTimeExpression(context, (DateTimeExpression) semanticObject); 
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
			case JPQLPackage.EMPTY_COMPARISON_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getEmptyComparisonExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_EmptyComparisonExpression(context, (EmptyComparisonExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.EXISTS_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExistsExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_ExistsExpression(context, (ExistsExpression) semanticObject); 
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
			case JPQLPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNumericFunctionRule()) {
					sequence_NumericFunction(context, (Function) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStringFunctionRule()) {
					sequence_StringFunction(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.HAVING_CLAUSE:
				if(context == grammarAccess.getHavingClauseRule()) {
					sequence_HavingClause(context, (HavingClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.IN_QUERY_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getInExpressionRule() ||
				   context == grammarAccess.getInQueryExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_InQueryExpression(context, (InQueryExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.IN_SEQ_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getInExpressionRule() ||
				   context == grammarAccess.getInSeqExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_InSeqExpression(context, (InSeqExpression) semanticObject); 
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
			case JPQLPackage.INTEGER_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getIntegerExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_IntegerExpression(context, (IntegerExpression) semanticObject); 
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
			case JPQLPackage.LIKE_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getLikeExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_LikeExpression(context, (LikeExpression) semanticObject); 
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
			case JPQLPackage.NAMED_QUERY:
				if(context == grammarAccess.getNamedQueryRule()) {
					sequence_NamedQuery(context, (NamedQuery) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.NULL_COMPARISON_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getNullComparisonExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_NullComparisonExpression(context, (NullComparisonExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.NULL_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getNullExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_NullExpression(context, (NullExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.OPERATOR_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getOperatorExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0()) {
					sequence_OperatorExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.OR_EXPRESSION:
				if(context == grammarAccess.getOrExpressionRule()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.ORDER_CLAUSE:
				if(context == grammarAccess.getOrderClauseRule()) {
					sequence_OrderClause(context, (OrderClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.ORDER_ITEM:
				if(context == grammarAccess.getOrderItemRule()) {
					sequence_OrderItem(context, (OrderItem) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.PARAMETER_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getParameterExpressionRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_ParameterExpression(context, (ParameterExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.QUERY_MODULE:
				if(context == grammarAccess.getQueryModuleRule()) {
					sequence_QueryModule(context, (QueryModule) semanticObject); 
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
			case JPQLPackage.SELECT_FROM_CLAUSE:
				if(context == grammarAccess.getSelectFromClauseRule()) {
					sequence_SelectFromClause(context, (SelectFromClause) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.SELECT_STATEMENT:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getJPQLQueryRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getQueryExpressionRule() ||
				   context == grammarAccess.getSelectStatementRule()) {
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
			case JPQLPackage.SOME_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getSomeExpressionRule()) {
					sequence_SomeExpression(context, (SomeExpression) semanticObject); 
					return; 
				}
				else break;
			case JPQLPackage.STRING_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getConcreteExpressionRule() ||
				   context == grammarAccess.getExpressionTermRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0() ||
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getStringExpressionRule() ||
				   context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_StringExpression(context, (StringExpression) semanticObject); 
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
	 *     (alias=[VariableDeclaration|ID] attributes+=ID*)
	 */
	protected void sequence_AliasAttributeExpression(EObject context, AliasAttributeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     query=QueryExpression
	 */
	protected void sequence_AllExpression(EObject context, AllExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.ALL_EXPRESSION__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.ALL_EXPRESSION__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=AndExpression_AndExpression_1_0 entries+=ConcreteExpression+)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     query=QueryExpression
	 */
	protected void sequence_AnyExpression(EObject context, AnyExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.ANY_EXPRESSION__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.ANY_EXPRESSION__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
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
	 *     (lhs=Variable isNot?='NOT'? min=Value max=Value)
	 */
	protected void sequence_BetweenExpression(EObject context, BetweenExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value?='TRUE' | value?='FALSE')
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Variable isNot?='NOT'? rhs=AliasAttributeExpression)
	 */
	protected void sequence_CollectionExpression(EObject context, CollectionExpression semanticObject) {
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
	 *     value=LiteralTemporal
	 */
	protected void sequence_DateTimeExpression(EObject context, DateTimeExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.DATE_TIME_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.DATE_TIME_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDateTimeExpressionAccess().getValueLiteralTemporalTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (lhs=Variable isNot?='NOT'?)
	 */
	protected void sequence_EmptyComparisonExpression(EObject context, EmptyComparisonExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isNot?='NOT'? query=QueryExpression)
	 */
	protected void sequence_ExistsExpression(EObject context, ExistsExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ((name=StringFunctionName params+=Variable params+=Variable) | (name=NumericFunctionName params+=Variable params+=Variable))
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
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
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Variable isNot?='NOT'? query=QueryExpression)
	 */
	protected void sequence_InQueryExpression(EObject context, InQueryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Variable isNot?='NOT'? items+=Variable items+=Variable*)
	 */
	protected void sequence_InSeqExpression(EObject context, InSeqExpression semanticObject) {
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
	protected void sequence_IntegerExpression(EObject context, IntegerExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.INTEGER_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.INTEGER_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerExpressionAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (lhs=Variable isNot?='NOT'? pattern=STRING)
	 */
	protected void sequence_LikeExpression(EObject context, LikeExpression semanticObject) {
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
	 *     (name=ID query=JPQLQuery)
	 */
	protected void sequence_NamedQuery(EObject context, NamedQuery semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.NAMED_QUERY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.NAMED_QUERY__NAME));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.NAMED_QUERY__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.NAMED_QUERY__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedQueryAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedQueryAccess().getQueryJPQLQueryParserRuleCall_2_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Variable isNot?='NOT'?)
	 */
	protected void sequence_NullComparisonExpression(EObject context, NullComparisonExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='NULL'
	 */
	protected void sequence_NullExpression(EObject context, NullExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.NULL_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.NULL_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullExpressionAccess().getValueNULLKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=NumericFunctionName params+=Variable params+=Variable)
	 */
	protected void sequence_NumericFunction(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Variable operator=Operator rhs=ExpressionTerm)
	 */
	protected void sequence_OperatorExpression(EObject context, OperatorExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.OPERATOR_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.OPERATOR_EXPRESSION__LHS));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.OPERATOR_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.OPERATOR_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.OPERATOR_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.OPERATOR_EXPRESSION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getOperatorExpressionAccess().getOperatorOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=OrExpression_OrExpression_1_0 entries+=AndExpression+)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ordering+=OrderItem ordering+=OrderItem* (isAsc?='ASC' | isDesc?='DESC')?)
	 */
	protected void sequence_OrderClause(EObject context, OrderClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=[FromEntry|ID] feature=ID)
	 */
	protected void sequence_OrderItem(EObject context, OrderItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.ORDER_ITEM__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.ORDER_ITEM__VAR));
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.ORDER_ITEM__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.ORDER_ITEM__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrderItemAccess().getVarFromEntryIDTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getOrderItemAccess().getFeatureIDTerminalRuleCall_2_0(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ParameterExpression(EObject context, ParameterExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.PARAMETER_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.PARAMETER_EXPRESSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* defaultQuery=JPQLQuery? namedQueries+=NamedQuery*)
	 */
	protected void sequence_QueryModule(EObject context, QueryModule semanticObject) {
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
	 *     (selectClause=SelectClause? fromClause=FromClause)
	 */
	protected void sequence_SelectFromClause(EObject context, SelectFromClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectFromClause=SelectFromClause whereClause=WhereClause? having=HavingClause? order=OrderClause?)
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
	 *     query=QueryExpression
	 */
	protected void sequence_SomeExpression(EObject context, SomeExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.SOME_EXPRESSION__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.SOME_EXPRESSION__QUERY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0(), semanticObject.getQuery());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringExpression(EObject context, StringExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JPQLPackage.Literals.STRING_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JPQLPackage.Literals.STRING_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=StringFunctionName params+=Variable params+=Variable)
	 */
	protected void sequence_StringFunction(EObject context, Function semanticObject) {
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
	 *     (fromEntries+=FromEntry fromEntries+=FromEntry*)
	 */
	protected void sequence_UpdateClause(EObject context, UpdateClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (alias=AliasAttributeExpression value=Value)
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
		feeder.accept(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
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
