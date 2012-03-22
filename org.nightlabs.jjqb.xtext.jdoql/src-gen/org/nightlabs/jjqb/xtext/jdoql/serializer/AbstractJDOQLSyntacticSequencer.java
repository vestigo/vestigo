package org.nightlabs.jjqb.xtext.jdoql.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.nightlabs.jjqb.xtext.jdoql.services.JDOQLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractJDOQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JDOQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_GroupByClause_CommaKeyword_4_q;
	protected AbstractElementAlias match_ImportClause_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_MethodExpression___IsEmptyKeyword_1_1_LeftParenthesisKeyword_1_2_RightParenthesisKeyword_1_3___or___SizeKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___ToLowerCaseKeyword_9_1_LeftParenthesisKeyword_9_2_RightParenthesisKeyword_9_3___or___ToUpperCaseKeyword_10_1_LeftParenthesisKeyword_10_2_RightParenthesisKeyword_10_3__;
	protected AbstractElementAlias match_OrderByClause_CommaKeyword_4_q;
	protected AbstractElementAlias match_ParametersClause_CommaKeyword_3_q;
	protected AbstractElementAlias match_VariablesClause_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JDOQLGrammarAccess) access;
		match_GroupByClause_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getGroupByClauseAccess().getCommaKeyword_4());
		match_ImportClause_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getImportClauseAccess().getSemicolonKeyword_2());
		match_MethodExpression___IsEmptyKeyword_1_1_LeftParenthesisKeyword_1_2_RightParenthesisKeyword_1_3___or___SizeKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___ToLowerCaseKeyword_9_1_LeftParenthesisKeyword_9_2_RightParenthesisKeyword_9_3___or___ToUpperCaseKeyword_10_1_LeftParenthesisKeyword_10_2_RightParenthesisKeyword_10_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getIsEmptyKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getSizeKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getToLowerCaseKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_9_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_9_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getToUpperCaseKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_10_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_10_3())));
		match_OrderByClause_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getOrderByClauseAccess().getCommaKeyword_4());
		match_ParametersClause_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getParametersClauseAccess().getCommaKeyword_3());
		match_VariablesClause_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_3());
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
			if(match_GroupByClause_CommaKeyword_4_q.equals(syntax))
				emit_GroupByClause_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImportClause_SemicolonKeyword_2_q.equals(syntax))
				emit_ImportClause_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MethodExpression___IsEmptyKeyword_1_1_LeftParenthesisKeyword_1_2_RightParenthesisKeyword_1_3___or___SizeKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___ToLowerCaseKeyword_9_1_LeftParenthesisKeyword_9_2_RightParenthesisKeyword_9_3___or___ToUpperCaseKeyword_10_1_LeftParenthesisKeyword_10_2_RightParenthesisKeyword_10_3__.equals(syntax))
				emit_MethodExpression___IsEmptyKeyword_1_1_LeftParenthesisKeyword_1_2_RightParenthesisKeyword_1_3___or___SizeKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___ToLowerCaseKeyword_9_1_LeftParenthesisKeyword_9_2_RightParenthesisKeyword_9_3___or___ToUpperCaseKeyword_10_1_LeftParenthesisKeyword_10_2_RightParenthesisKeyword_10_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OrderByClause_CommaKeyword_4_q.equals(syntax))
				emit_OrderByClause_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParametersClause_CommaKeyword_3_q.equals(syntax))
				emit_ParametersClause_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariablesClause_SemicolonKeyword_3_q.equals(syntax))
				emit_VariablesClause_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_GroupByClause_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ImportClause_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('toLowerCase' '(' ')') | ('size' '(' ')') | ('toUpperCase' '(' ')') | ('isEmpty' '(' ')')
	 */
	protected void emit_MethodExpression___IsEmptyKeyword_1_1_LeftParenthesisKeyword_1_2_RightParenthesisKeyword_1_3___or___SizeKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___ToLowerCaseKeyword_9_1_LeftParenthesisKeyword_9_2_RightParenthesisKeyword_9_3___or___ToUpperCaseKeyword_10_1_LeftParenthesisKeyword_10_2_RightParenthesisKeyword_10_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OrderByClause_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ParametersClause_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_VariablesClause_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
