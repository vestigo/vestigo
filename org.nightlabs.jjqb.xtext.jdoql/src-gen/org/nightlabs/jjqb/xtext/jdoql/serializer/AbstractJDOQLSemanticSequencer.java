package org.nightlabs.jjqb.xtext.jdoql.serializer;

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
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.BooleanExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ExcludeClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Expression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.From;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.IntoClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.JDOQLPackage;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Primary;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultClause;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.ResultNaming;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Select;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.SingleStringJDOQL;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.UnaryExpression;
import org.nightlabs.jjqb.xtext.jdoql.jDOQL.Where;
import org.nightlabs.jjqb.xtext.jdoql.services.JDOQLGrammarAccess;

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
			case JDOQLPackage.BOOLEAN_EXPRESSION:
				if(context == grammarAccess.getBooleanExpressionRule()) {
					sequence_BooleanExpression(context, (BooleanExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.EXCLUDE_CLAUSE:
				if(context == grammarAccess.getExcludeClauseRule()) {
					sequence_ExcludeClause(context, (ExcludeClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getResultSpecRule() ||
				   context == grammarAccess.getResultSpecsRule()) {
					sequence_ResultSpec(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.FROM:
				if(context == grammarAccess.getFromRule()) {
					sequence_From(context, (From) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.INTO_CLAUSE:
				if(context == grammarAccess.getIntoClauseRule()) {
					sequence_IntoClause(context, (IntoClause) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.PRIMARY:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Primary) semanticObject); 
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
			case JDOQLPackage.SELECT:
				if(context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.SINGLE_STRING_JDOQL:
				if(context == grammarAccess.getSingleStringJDOQLRule()) {
					sequence_SingleStringJDOQL(context, (SingleStringJDOQL) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case JDOQLPackage.WHERE:
				if(context == grammarAccess.getWhereRule()) {
					sequence_Where(context, (Where) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Expression op=BooleanOp right=Expression)
	 */
	protected void sequence_BooleanExpression(EObject context, BooleanExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.BOOLEAN_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.BOOLEAN_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.BOOLEAN_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.BOOLEAN_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.BOOLEAN_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.BOOLEAN_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getLeftExpressionParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getOpBooleanOpParserRuleCall_1_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBooleanExpressionAccess().getRightExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     excludeSubclasses='exclude subclasses'
	 */
	protected void sequence_ExcludeClause(EObject context, ExcludeClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.EXCLUDE_CLAUSE__EXCLUDE_SUBCLASSES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesExcludeSubclassesKeyword_0(), semanticObject.getExcludeSubclasses());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UnaryExpression (op=InfixOp right=UnaryExpression)?)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (candidateClassName=CandidateClassName excludeClause=ExcludeClause?)
	 */
	protected void sequence_From(EObject context, From semanticObject) {
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
	 *     (literal=Literal | this='this' | classOrInterface=ClassOrInterfaceName | expression=Expression)
	 */
	protected void sequence_Primary(EObject context, Primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     resultSpecs+=ResultSpecs
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
	 *     (left=UnaryExpression (op=InfixOp right=UnaryExpression)? resultNaming=ResultNaming?)
	 */
	protected void sequence_ResultSpec(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resultClause=ResultClause? intoClause=IntoClause?)
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (select=Select from=From where=Where?)
	 */
	protected void sequence_SingleStringJDOQL(EObject context, SingleStringJDOQL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((modifier=PrefixOp expression=Primary) | (cast=Cast expression=Primary) | expression=Primary)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     e=BooleanExpression
	 */
	protected void sequence_Where(EObject context, Where semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JDOQLPackage.Literals.WHERE__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JDOQLPackage.Literals.WHERE__E));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhereAccess().getEBooleanExpressionParserRuleCall_1_0(), semanticObject.getE());
		feeder.finish();
	}
}
