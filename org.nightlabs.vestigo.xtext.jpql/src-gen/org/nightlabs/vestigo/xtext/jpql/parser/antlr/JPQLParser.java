/*
* generated by Xtext
*/
package org.nightlabs.vestigo.xtext.jpql.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.nightlabs.vestigo.xtext.jpql.services.JPQLGrammarAccess;

public class JPQLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JPQLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.nightlabs.vestigo.xtext.jpql.parser.antlr.internal.InternalJPQLParser createParser(XtextTokenStream stream) {
		return new org.nightlabs.vestigo.xtext.jpql.parser.antlr.internal.InternalJPQLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "JPQLQuery";
	}
	
	public JPQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JPQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
