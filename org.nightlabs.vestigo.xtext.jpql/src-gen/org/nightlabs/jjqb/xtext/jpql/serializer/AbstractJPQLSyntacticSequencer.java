package org.nightlabs.jjqb.xtext.jpql.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.nightlabs.jjqb.xtext.jpql.services.JPQLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractJPQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JPQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CollectionExpression_OFKeyword_3_q;
	protected AbstractElementAlias match_VariableDeclaration_ASKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JPQLGrammarAccess) access;
		match_CollectionExpression_OFKeyword_3_q = new TokenAlias(false, true, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
		match_VariableDeclaration_ASKeyword_0_q = new TokenAlias(false, true, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_CollectionExpression_OFKeyword_3_q.equals(syntax))
				emit_CollectionExpression_OFKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariableDeclaration_ASKeyword_0_q.equals(syntax))
				emit_VariableDeclaration_ASKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'OF'?
	 */
	protected void emit_CollectionExpression_OFKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'AS'?
	 */
	protected void emit_VariableDeclaration_ASKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
