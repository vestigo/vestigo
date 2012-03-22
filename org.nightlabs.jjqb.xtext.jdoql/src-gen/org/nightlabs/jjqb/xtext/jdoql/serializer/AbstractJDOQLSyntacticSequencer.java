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
	protected AbstractElementAlias match_Alias_ASKeyword_0_q;
	protected AbstractElementAlias match_GroupByClause_CommaKeyword_4_q;
	protected AbstractElementAlias match_ImportClause_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_MethodExpression___GetDayKeyword_20_1_LeftParenthesisKeyword_20_2_RightParenthesisKeyword_20_3___or___GetHourKeyword_23_1_LeftParenthesisKeyword_23_2_RightParenthesisKeyword_23_3___or___GetMinuteKeyword_24_1_LeftParenthesisKeyword_24_2_RightParenthesisKeyword_24_3___or___GetMonthKeyword_21_1_LeftParenthesisKeyword_21_2_RightParenthesisKeyword_21_3___or___GetSecondKeyword_25_1_LeftParenthesisKeyword_25_2_RightParenthesisKeyword_25_3___or___GetYearKeyword_22_1_LeftParenthesisKeyword_22_2_RightParenthesisKeyword_22_3___or___IsEmptyKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___LengthKeyword_12_1_LeftParenthesisKeyword_12_2_RightParenthesisKeyword_12_3___or___OrdinalKeyword_26_1_LeftParenthesisKeyword_26_2_RightParenthesisKeyword_26_3___or___SizeKeyword_3_1_LeftParenthesisKeyword_3_2_RightParenthesisKeyword_3_3___or___ToLowerCaseKeyword_17_1_LeftParenthesisKeyword_17_2_RightParenthesisKeyword_17_3___or___ToStringKeyword_27_1_LeftParenthesisKeyword_27_2_RightParenthesisKeyword_27_3___or___ToUpperCaseKeyword_18_1_LeftParenthesisKeyword_18_2_RightParenthesisKeyword_18_3___or___TrimKeyword_19_1_LeftParenthesisKeyword_19_2_RightParenthesisKeyword_19_3__;
	protected AbstractElementAlias match_OrderByClause_CommaKeyword_4_q;
	protected AbstractElementAlias match_ParametersClause_CommaKeyword_3_q;
	protected AbstractElementAlias match_ResultClause_CommaKeyword_3_q;
	protected AbstractElementAlias match_SubqueryResultClause_CommaKeyword_2_q;
	protected AbstractElementAlias match_VariablesClause_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JDOQLGrammarAccess) access;
		match_Alias_ASKeyword_0_q = new TokenAlias(false, true, grammarAccess.getAliasAccess().getASKeyword_0());
		match_GroupByClause_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getGroupByClauseAccess().getCommaKeyword_4());
		match_ImportClause_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getImportClauseAccess().getSemicolonKeyword_2());
		match_MethodExpression___GetDayKeyword_20_1_LeftParenthesisKeyword_20_2_RightParenthesisKeyword_20_3___or___GetHourKeyword_23_1_LeftParenthesisKeyword_23_2_RightParenthesisKeyword_23_3___or___GetMinuteKeyword_24_1_LeftParenthesisKeyword_24_2_RightParenthesisKeyword_24_3___or___GetMonthKeyword_21_1_LeftParenthesisKeyword_21_2_RightParenthesisKeyword_21_3___or___GetSecondKeyword_25_1_LeftParenthesisKeyword_25_2_RightParenthesisKeyword_25_3___or___GetYearKeyword_22_1_LeftParenthesisKeyword_22_2_RightParenthesisKeyword_22_3___or___IsEmptyKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___LengthKeyword_12_1_LeftParenthesisKeyword_12_2_RightParenthesisKeyword_12_3___or___OrdinalKeyword_26_1_LeftParenthesisKeyword_26_2_RightParenthesisKeyword_26_3___or___SizeKeyword_3_1_LeftParenthesisKeyword_3_2_RightParenthesisKeyword_3_3___or___ToLowerCaseKeyword_17_1_LeftParenthesisKeyword_17_2_RightParenthesisKeyword_17_3___or___ToStringKeyword_27_1_LeftParenthesisKeyword_27_2_RightParenthesisKeyword_27_3___or___ToUpperCaseKeyword_18_1_LeftParenthesisKeyword_18_2_RightParenthesisKeyword_18_3___or___TrimKeyword_19_1_LeftParenthesisKeyword_19_2_RightParenthesisKeyword_19_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getGetDayKeyword_20_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_20_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_20_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getGetHourKeyword_23_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_23_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_23_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getGetMinuteKeyword_24_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_24_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_24_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getGetMonthKeyword_21_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_21_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_21_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getGetSecondKeyword_25_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_25_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_25_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getGetYearKeyword_22_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_22_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_22_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getIsEmptyKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLengthKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_12_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_12_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getOrdinalKeyword_26_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_26_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_26_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getSizeKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_3_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getToLowerCaseKeyword_17_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_17_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_17_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getToStringKeyword_27_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_27_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_27_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getToUpperCaseKeyword_18_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_18_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_18_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getTrimKeyword_19_1()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_19_2()), new TokenAlias(false, false, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_19_3())));
		match_OrderByClause_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getOrderByClauseAccess().getCommaKeyword_4());
		match_ParametersClause_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getParametersClauseAccess().getCommaKeyword_3());
		match_ResultClause_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getResultClauseAccess().getCommaKeyword_3());
		match_SubqueryResultClause_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getSubqueryResultClauseAccess().getCommaKeyword_2());
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
			if(match_Alias_ASKeyword_0_q.equals(syntax))
				emit_Alias_ASKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GroupByClause_CommaKeyword_4_q.equals(syntax))
				emit_GroupByClause_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImportClause_SemicolonKeyword_2_q.equals(syntax))
				emit_ImportClause_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MethodExpression___GetDayKeyword_20_1_LeftParenthesisKeyword_20_2_RightParenthesisKeyword_20_3___or___GetHourKeyword_23_1_LeftParenthesisKeyword_23_2_RightParenthesisKeyword_23_3___or___GetMinuteKeyword_24_1_LeftParenthesisKeyword_24_2_RightParenthesisKeyword_24_3___or___GetMonthKeyword_21_1_LeftParenthesisKeyword_21_2_RightParenthesisKeyword_21_3___or___GetSecondKeyword_25_1_LeftParenthesisKeyword_25_2_RightParenthesisKeyword_25_3___or___GetYearKeyword_22_1_LeftParenthesisKeyword_22_2_RightParenthesisKeyword_22_3___or___IsEmptyKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___LengthKeyword_12_1_LeftParenthesisKeyword_12_2_RightParenthesisKeyword_12_3___or___OrdinalKeyword_26_1_LeftParenthesisKeyword_26_2_RightParenthesisKeyword_26_3___or___SizeKeyword_3_1_LeftParenthesisKeyword_3_2_RightParenthesisKeyword_3_3___or___ToLowerCaseKeyword_17_1_LeftParenthesisKeyword_17_2_RightParenthesisKeyword_17_3___or___ToStringKeyword_27_1_LeftParenthesisKeyword_27_2_RightParenthesisKeyword_27_3___or___ToUpperCaseKeyword_18_1_LeftParenthesisKeyword_18_2_RightParenthesisKeyword_18_3___or___TrimKeyword_19_1_LeftParenthesisKeyword_19_2_RightParenthesisKeyword_19_3__.equals(syntax))
				emit_MethodExpression___GetDayKeyword_20_1_LeftParenthesisKeyword_20_2_RightParenthesisKeyword_20_3___or___GetHourKeyword_23_1_LeftParenthesisKeyword_23_2_RightParenthesisKeyword_23_3___or___GetMinuteKeyword_24_1_LeftParenthesisKeyword_24_2_RightParenthesisKeyword_24_3___or___GetMonthKeyword_21_1_LeftParenthesisKeyword_21_2_RightParenthesisKeyword_21_3___or___GetSecondKeyword_25_1_LeftParenthesisKeyword_25_2_RightParenthesisKeyword_25_3___or___GetYearKeyword_22_1_LeftParenthesisKeyword_22_2_RightParenthesisKeyword_22_3___or___IsEmptyKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___LengthKeyword_12_1_LeftParenthesisKeyword_12_2_RightParenthesisKeyword_12_3___or___OrdinalKeyword_26_1_LeftParenthesisKeyword_26_2_RightParenthesisKeyword_26_3___or___SizeKeyword_3_1_LeftParenthesisKeyword_3_2_RightParenthesisKeyword_3_3___or___ToLowerCaseKeyword_17_1_LeftParenthesisKeyword_17_2_RightParenthesisKeyword_17_3___or___ToStringKeyword_27_1_LeftParenthesisKeyword_27_2_RightParenthesisKeyword_27_3___or___ToUpperCaseKeyword_18_1_LeftParenthesisKeyword_18_2_RightParenthesisKeyword_18_3___or___TrimKeyword_19_1_LeftParenthesisKeyword_19_2_RightParenthesisKeyword_19_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OrderByClause_CommaKeyword_4_q.equals(syntax))
				emit_OrderByClause_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParametersClause_CommaKeyword_3_q.equals(syntax))
				emit_ParametersClause_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResultClause_CommaKeyword_3_q.equals(syntax))
				emit_ResultClause_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SubqueryResultClause_CommaKeyword_2_q.equals(syntax))
				emit_SubqueryResultClause_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VariablesClause_SemicolonKeyword_3_q.equals(syntax))
				emit_VariablesClause_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'AS'?
	 */
	protected void emit_Alias_ASKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	 *     (
	     ('getYear' '(' ')') | 
	     ('toString' '(' ')') | 
	     ('ordinal' '(' ')') | 
	     ('trim' '(' ')') | 
	     ('toUpperCase' '(' ')') | 
	     ('length' '(' ')') | 
	     ('toLowerCase' '(' ')') | 
	     ('size' '(' ')') | 
	     ('getMinute' '(' ')') | 
	     ('getMonth' '(' ')') | 
	     ('isEmpty' '(' ')') | 
	     ('getSecond' '(' ')') | 
	     ('getHour' '(' ')') | 
	     ('getDay' '(' ')')
	 )
	 */
	protected void emit_MethodExpression___GetDayKeyword_20_1_LeftParenthesisKeyword_20_2_RightParenthesisKeyword_20_3___or___GetHourKeyword_23_1_LeftParenthesisKeyword_23_2_RightParenthesisKeyword_23_3___or___GetMinuteKeyword_24_1_LeftParenthesisKeyword_24_2_RightParenthesisKeyword_24_3___or___GetMonthKeyword_21_1_LeftParenthesisKeyword_21_2_RightParenthesisKeyword_21_3___or___GetSecondKeyword_25_1_LeftParenthesisKeyword_25_2_RightParenthesisKeyword_25_3___or___GetYearKeyword_22_1_LeftParenthesisKeyword_22_2_RightParenthesisKeyword_22_3___or___IsEmptyKeyword_2_1_LeftParenthesisKeyword_2_2_RightParenthesisKeyword_2_3___or___LengthKeyword_12_1_LeftParenthesisKeyword_12_2_RightParenthesisKeyword_12_3___or___OrdinalKeyword_26_1_LeftParenthesisKeyword_26_2_RightParenthesisKeyword_26_3___or___SizeKeyword_3_1_LeftParenthesisKeyword_3_2_RightParenthesisKeyword_3_3___or___ToLowerCaseKeyword_17_1_LeftParenthesisKeyword_17_2_RightParenthesisKeyword_17_3___or___ToStringKeyword_27_1_LeftParenthesisKeyword_27_2_RightParenthesisKeyword_27_3___or___ToUpperCaseKeyword_18_1_LeftParenthesisKeyword_18_2_RightParenthesisKeyword_18_3___or___TrimKeyword_19_1_LeftParenthesisKeyword_19_2_RightParenthesisKeyword_19_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ','?
	 */
	protected void emit_ResultClause_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_SubqueryResultClause_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
