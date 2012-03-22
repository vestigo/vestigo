/*
* generated by Xtext
*/
package org.nightlabs.vestigo.xtext.jdoql.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.nightlabs.vestigo.xtext.jdoql.services.JDOQLGrammarAccess;

public class JDOQLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JDOQLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.nightlabs.vestigo.xtext.jdoql.parser.antlr.internal.InternalJDOQLParser createParser(XtextTokenStream stream) {
		return new org.nightlabs.vestigo.xtext.jdoql.parser.antlr.internal.InternalJDOQLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SingleStringJDOQL";
	}
	
	public JDOQLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JDOQLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
