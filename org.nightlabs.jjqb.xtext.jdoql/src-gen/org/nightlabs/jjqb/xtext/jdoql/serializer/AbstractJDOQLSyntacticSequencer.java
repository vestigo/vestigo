package org.nightlabs.jjqb.xtext.jdoql.serializer;

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
import org.nightlabs.jjqb.xtext.jdoql.services.JDOQLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractJDOQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JDOQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ResultClause_CommaKeyword_2_q;
	protected AbstractElementAlias match_ResultClause_DistinctKeyword_0_q;
	protected AbstractElementAlias match_ResultSpecs_CommaKeyword_1_q;
	protected AbstractElementAlias match_Select_UniqueKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JDOQLGrammarAccess) access;
		match_ResultClause_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getResultClauseAccess().getCommaKeyword_2());
		match_ResultClause_DistinctKeyword_0_q = new TokenAlias(false, true, grammarAccess.getResultClauseAccess().getDistinctKeyword_0());
		match_ResultSpecs_CommaKeyword_1_q = new TokenAlias(false, true, grammarAccess.getResultSpecsAccess().getCommaKeyword_1());
		match_Select_UniqueKeyword_1_q = new TokenAlias(false, true, grammarAccess.getSelectAccess().getUniqueKeyword_1());
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
			if(match_ResultClause_CommaKeyword_2_q.equals(syntax))
				emit_ResultClause_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResultClause_DistinctKeyword_0_q.equals(syntax))
				emit_ResultClause_DistinctKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResultSpecs_CommaKeyword_1_q.equals(syntax))
				emit_ResultSpecs_CommaKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Select_UniqueKeyword_1_q.equals(syntax))
				emit_Select_UniqueKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ResultClause_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'distinct'?
	 */
	protected void emit_ResultClause_DistinctKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ResultSpecs_CommaKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unique'?
	 */
	protected void emit_Select_UniqueKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
