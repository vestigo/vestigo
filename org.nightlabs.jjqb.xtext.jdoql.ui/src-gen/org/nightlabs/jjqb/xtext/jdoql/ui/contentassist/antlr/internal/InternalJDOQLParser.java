package org.nightlabs.jjqb.xtext.jdoql.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.nightlabs.jjqb.xtext.jdoql.services.JDOQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJDOQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_42", "KEYWORD_41", "KEYWORD_40", "KEYWORD_39", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_23", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=46;
    public static final int RULE_ANY_OTHER=52;
    public static final int KEYWORD_19=27;
    public static final int KEYWORD_17=25;
    public static final int KEYWORD_18=26;
    public static final int KEYWORD_15=45;
    public static final int KEYWORD_16=24;
    public static final int KEYWORD_13=43;
    public static final int KEYWORD_14=44;
    public static final int KEYWORD_11=41;
    public static final int KEYWORD_12=42;
    public static final int EOF=-1;
    public static final int KEYWORD_10=40;
    public static final int KEYWORD_6=36;
    public static final int KEYWORD_7=37;
    public static final int KEYWORD_8=38;
    public static final int KEYWORD_9=39;
    public static final int KEYWORD_28=19;
    public static final int KEYWORD_29=20;
    public static final int RULE_INT=47;
    public static final int KEYWORD_24=15;
    public static final int KEYWORD_25=16;
    public static final int KEYWORD_26=17;
    public static final int KEYWORD_27=18;
    public static final int KEYWORD_20=28;
    public static final int KEYWORD_21=29;
    public static final int KEYWORD_22=30;
    public static final int KEYWORD_23=23;
    public static final int KEYWORD_30=21;
    public static final int KEYWORD_1=31;
    public static final int KEYWORD_34=13;
    public static final int KEYWORD_5=35;
    public static final int KEYWORD_33=12;
    public static final int KEYWORD_4=34;
    public static final int KEYWORD_32=11;
    public static final int KEYWORD_3=33;
    public static final int KEYWORD_31=22;
    public static final int KEYWORD_2=32;
    public static final int KEYWORD_38=10;
    public static final int RULE_SL_COMMENT=50;
    public static final int KEYWORD_37=9;
    public static final int KEYWORD_36=8;
    public static final int KEYWORD_35=14;
    public static final int RULE_ML_COMMENT=49;
    public static final int KEYWORD_39=7;
    public static final int RULE_STRING=48;
    public static final int KEYWORD_41=5;
    public static final int KEYWORD_40=6;
    public static final int KEYWORD_42=4;
    public static final int RULE_WS=51;

    // delegates
    // delegators


        public InternalJDOQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJDOQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJDOQLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g"; }


     
     	private JDOQLGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'!'");
    		tokenNameToValue.put("KEYWORD_2", "'%'");
    		tokenNameToValue.put("KEYWORD_3", "'&'");
    		tokenNameToValue.put("KEYWORD_4", "'('");
    		tokenNameToValue.put("KEYWORD_5", "')'");
    		tokenNameToValue.put("KEYWORD_6", "'*'");
    		tokenNameToValue.put("KEYWORD_7", "'+'");
    		tokenNameToValue.put("KEYWORD_8", "','");
    		tokenNameToValue.put("KEYWORD_9", "'-'");
    		tokenNameToValue.put("KEYWORD_10", "'.'");
    		tokenNameToValue.put("KEYWORD_11", "'/'");
    		tokenNameToValue.put("KEYWORD_12", "'<'");
    		tokenNameToValue.put("KEYWORD_13", "'>'");
    		tokenNameToValue.put("KEYWORD_14", "'|'");
    		tokenNameToValue.put("KEYWORD_15", "'~'");
    		tokenNameToValue.put("KEYWORD_16", "'!='");
    		tokenNameToValue.put("KEYWORD_17", "'&&'");
    		tokenNameToValue.put("KEYWORD_18", "'<='");
    		tokenNameToValue.put("KEYWORD_19", "'=='");
    		tokenNameToValue.put("KEYWORD_20", "'>='");
    		tokenNameToValue.put("KEYWORD_21", "'as'");
    		tokenNameToValue.put("KEYWORD_22", "'||'");
    		tokenNameToValue.put("KEYWORD_23", "'int'");
    		tokenNameToValue.put("KEYWORD_24", "'byte'");
    		tokenNameToValue.put("KEYWORD_25", "'char'");
    		tokenNameToValue.put("KEYWORD_26", "'from'");
    		tokenNameToValue.put("KEYWORD_27", "'into'");
    		tokenNameToValue.put("KEYWORD_28", "'long'");
    		tokenNameToValue.put("KEYWORD_29", "'null'");
    		tokenNameToValue.put("KEYWORD_30", "'this'");
    		tokenNameToValue.put("KEYWORD_31", "'true'");
    		tokenNameToValue.put("KEYWORD_32", "'false'");
    		tokenNameToValue.put("KEYWORD_33", "'float'");
    		tokenNameToValue.put("KEYWORD_34", "'short'");
    		tokenNameToValue.put("KEYWORD_35", "'where'");
    		tokenNameToValue.put("KEYWORD_36", "'double'");
    		tokenNameToValue.put("KEYWORD_37", "'select'");
    		tokenNameToValue.put("KEYWORD_38", "'unique'");
    		tokenNameToValue.put("KEYWORD_39", "'boolean'");
    		tokenNameToValue.put("KEYWORD_40", "'distinct'");
    		tokenNameToValue.put("KEYWORD_41", "'instanceof'");
    		tokenNameToValue.put("KEYWORD_42", "'exclude subclasses'");
     	}
     	
        public void setGrammarAccess(JDOQLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleSingleStringJDOQL"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:105:1: entryRuleSingleStringJDOQL : ruleSingleStringJDOQL EOF ;
    public final void entryRuleSingleStringJDOQL() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:106:1: ( ruleSingleStringJDOQL EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:107:1: ruleSingleStringJDOQL EOF
            {
             before(grammarAccess.getSingleStringJDOQLRule()); 
            pushFollow(FOLLOW_ruleSingleStringJDOQL_in_entryRuleSingleStringJDOQL54);
            ruleSingleStringJDOQL();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStringJDOQL61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleStringJDOQL"


    // $ANTLR start "ruleSingleStringJDOQL"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:114:1: ruleSingleStringJDOQL : ( ( rule__SingleStringJDOQL__Group__0 ) ) ;
    public final void ruleSingleStringJDOQL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:118:5: ( ( ( rule__SingleStringJDOQL__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:119:1: ( ( rule__SingleStringJDOQL__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:119:1: ( ( rule__SingleStringJDOQL__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:120:1: ( rule__SingleStringJDOQL__Group__0 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:121:1: ( rule__SingleStringJDOQL__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:121:2: rule__SingleStringJDOQL__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__0_in_ruleSingleStringJDOQL91);
            rule__SingleStringJDOQL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStringJDOQLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleStringJDOQL"


    // $ANTLR start "entryRuleSelect"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:133:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:134:1: ( ruleSelect EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:135:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect118);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect125); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:142:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:146:5: ( ( ( rule__Select__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:147:1: ( ( rule__Select__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:147:1: ( ( rule__Select__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:148:1: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:149:1: ( rule__Select__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:149:2: rule__Select__Group__0
            {
            pushFollow(FOLLOW_rule__Select__Group__0_in_ruleSelect155);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleResultClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:161:1: entryRuleResultClause : ruleResultClause EOF ;
    public final void entryRuleResultClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:162:1: ( ruleResultClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:163:1: ruleResultClause EOF
            {
             before(grammarAccess.getResultClauseRule()); 
            pushFollow(FOLLOW_ruleResultClause_in_entryRuleResultClause182);
            ruleResultClause();

            state._fsp--;

             after(grammarAccess.getResultClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultClause189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultClause"


    // $ANTLR start "ruleResultClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:170:1: ruleResultClause : ( ( rule__ResultClause__Group__0 ) ) ;
    public final void ruleResultClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:174:5: ( ( ( rule__ResultClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:175:1: ( ( rule__ResultClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:175:1: ( ( rule__ResultClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:176:1: ( rule__ResultClause__Group__0 )
            {
             before(grammarAccess.getResultClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:177:1: ( rule__ResultClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:177:2: rule__ResultClause__Group__0
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__0_in_ruleResultClause219);
            rule__ResultClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultClause"


    // $ANTLR start "entryRuleIntoClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:189:1: entryRuleIntoClause : ruleIntoClause EOF ;
    public final void entryRuleIntoClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:190:1: ( ruleIntoClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:191:1: ruleIntoClause EOF
            {
             before(grammarAccess.getIntoClauseRule()); 
            pushFollow(FOLLOW_ruleIntoClause_in_entryRuleIntoClause246);
            ruleIntoClause();

            state._fsp--;

             after(grammarAccess.getIntoClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntoClause253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntoClause"


    // $ANTLR start "ruleIntoClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:198:1: ruleIntoClause : ( ( rule__IntoClause__Group__0 ) ) ;
    public final void ruleIntoClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:202:5: ( ( ( rule__IntoClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:203:1: ( ( rule__IntoClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:203:1: ( ( rule__IntoClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:204:1: ( rule__IntoClause__Group__0 )
            {
             before(grammarAccess.getIntoClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:205:1: ( rule__IntoClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:205:2: rule__IntoClause__Group__0
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__0_in_ruleIntoClause283);
            rule__IntoClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntoClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntoClause"


    // $ANTLR start "entryRuleFrom"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:217:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:218:1: ( ruleFrom EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:219:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom310);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom317); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:226:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:230:5: ( ( ( rule__From__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:231:1: ( ( rule__From__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:231:1: ( ( rule__From__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:232:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:233:1: ( rule__From__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:233:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom347);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleWhere"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:245:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:246:1: ( ruleWhere EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:247:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_ruleWhere_in_entryRuleWhere374);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhere381); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:254:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:258:5: ( ( ( rule__Where__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:259:1: ( ( rule__Where__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:259:1: ( ( rule__Where__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:260:1: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:261:1: ( rule__Where__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:261:2: rule__Where__Group__0
            {
            pushFollow(FOLLOW_rule__Where__Group__0_in_ruleWhere411);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleExcludeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:273:1: entryRuleExcludeClause : ruleExcludeClause EOF ;
    public final void entryRuleExcludeClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:274:1: ( ruleExcludeClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:275:1: ruleExcludeClause EOF
            {
             before(grammarAccess.getExcludeClauseRule()); 
            pushFollow(FOLLOW_ruleExcludeClause_in_entryRuleExcludeClause438);
            ruleExcludeClause();

            state._fsp--;

             after(grammarAccess.getExcludeClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExcludeClause445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExcludeClause"


    // $ANTLR start "ruleExcludeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:282:1: ruleExcludeClause : ( ( rule__ExcludeClause__ExcludeSubclassesAssignment ) ) ;
    public final void ruleExcludeClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:286:5: ( ( ( rule__ExcludeClause__ExcludeSubclassesAssignment ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:287:1: ( ( rule__ExcludeClause__ExcludeSubclassesAssignment ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:287:1: ( ( rule__ExcludeClause__ExcludeSubclassesAssignment ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:288:1: ( rule__ExcludeClause__ExcludeSubclassesAssignment )
            {
             before(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesAssignment()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:289:1: ( rule__ExcludeClause__ExcludeSubclassesAssignment )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:289:2: rule__ExcludeClause__ExcludeSubclassesAssignment
            {
            pushFollow(FOLLOW_rule__ExcludeClause__ExcludeSubclassesAssignment_in_ruleExcludeClause475);
            rule__ExcludeClause__ExcludeSubclassesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExcludeClause"


    // $ANTLR start "entryRuleQualifiedIdentifier"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:301:1: entryRuleQualifiedIdentifier : ruleQualifiedIdentifier EOF ;
    public final void entryRuleQualifiedIdentifier() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:302:1: ( ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:303:1: ruleQualifiedIdentifier EOF
            {
             before(grammarAccess.getQualifiedIdentifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier502);
            ruleQualifiedIdentifier();

            state._fsp--;

             after(grammarAccess.getQualifiedIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedIdentifier"


    // $ANTLR start "ruleQualifiedIdentifier"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:310:1: ruleQualifiedIdentifier : ( ( rule__QualifiedIdentifier__Group__0 ) ) ;
    public final void ruleQualifiedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:314:5: ( ( ( rule__QualifiedIdentifier__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:315:1: ( ( rule__QualifiedIdentifier__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:315:1: ( ( rule__QualifiedIdentifier__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:316:1: ( rule__QualifiedIdentifier__Group__0 )
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:317:1: ( rule__QualifiedIdentifier__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:317:2: rule__QualifiedIdentifier__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__0_in_ruleQualifiedIdentifier539);
            rule__QualifiedIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleCandidateClassName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:329:1: entryRuleCandidateClassName : ruleCandidateClassName EOF ;
    public final void entryRuleCandidateClassName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:330:1: ( ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:331:1: ruleCandidateClassName EOF
            {
             before(grammarAccess.getCandidateClassNameRule()); 
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName566);
            ruleCandidateClassName();

            state._fsp--;

             after(grammarAccess.getCandidateClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName573); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCandidateClassName"


    // $ANTLR start "ruleCandidateClassName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:338:1: ruleCandidateClassName : ( ruleQualifiedIdentifier ) ;
    public final void ruleCandidateClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:342:5: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:343:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:343:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:344:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName603);
            ruleQualifiedIdentifier();

            state._fsp--;

             after(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCandidateClassName"


    // $ANTLR start "entryRuleClassOrInterfaceName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:357:1: entryRuleClassOrInterfaceName : ruleClassOrInterfaceName EOF ;
    public final void entryRuleClassOrInterfaceName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:358:1: ( ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:359:1: ruleClassOrInterfaceName EOF
            {
             before(grammarAccess.getClassOrInterfaceNameRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName629);
            ruleClassOrInterfaceName();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName636); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassOrInterfaceName"


    // $ANTLR start "ruleClassOrInterfaceName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:366:1: ruleClassOrInterfaceName : ( ruleQualifiedIdentifier ) ;
    public final void ruleClassOrInterfaceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:370:5: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:371:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:371:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:372:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName666);
            ruleQualifiedIdentifier();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassOrInterfaceName"


    // $ANTLR start "entryRuleResultSpecs"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:385:1: entryRuleResultSpecs : ruleResultSpecs EOF ;
    public final void entryRuleResultSpecs() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:386:1: ( ruleResultSpecs EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:387:1: ruleResultSpecs EOF
            {
             before(grammarAccess.getResultSpecsRule()); 
            pushFollow(FOLLOW_ruleResultSpecs_in_entryRuleResultSpecs692);
            ruleResultSpecs();

            state._fsp--;

             after(grammarAccess.getResultSpecsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultSpecs699); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultSpecs"


    // $ANTLR start "ruleResultSpecs"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:394:1: ruleResultSpecs : ( ( rule__ResultSpecs__Group__0 ) ) ;
    public final void ruleResultSpecs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:398:5: ( ( ( rule__ResultSpecs__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:399:1: ( ( rule__ResultSpecs__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:399:1: ( ( rule__ResultSpecs__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:400:1: ( rule__ResultSpecs__Group__0 )
            {
             before(grammarAccess.getResultSpecsAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:401:1: ( rule__ResultSpecs__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:401:2: rule__ResultSpecs__Group__0
            {
            pushFollow(FOLLOW_rule__ResultSpecs__Group__0_in_ruleResultSpecs729);
            rule__ResultSpecs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultSpecsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultSpecs"


    // $ANTLR start "entryRuleResultSpec"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:413:1: entryRuleResultSpec : ruleResultSpec EOF ;
    public final void entryRuleResultSpec() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:414:1: ( ruleResultSpec EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:415:1: ruleResultSpec EOF
            {
             before(grammarAccess.getResultSpecRule()); 
            pushFollow(FOLLOW_ruleResultSpec_in_entryRuleResultSpec756);
            ruleResultSpec();

            state._fsp--;

             after(grammarAccess.getResultSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultSpec763); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultSpec"


    // $ANTLR start "ruleResultSpec"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:422:1: ruleResultSpec : ( ( rule__ResultSpec__Group__0 ) ) ;
    public final void ruleResultSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:426:5: ( ( ( rule__ResultSpec__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:427:1: ( ( rule__ResultSpec__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:427:1: ( ( rule__ResultSpec__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:428:1: ( rule__ResultSpec__Group__0 )
            {
             before(grammarAccess.getResultSpecAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:429:1: ( rule__ResultSpec__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:429:2: rule__ResultSpec__Group__0
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__0_in_ruleResultSpec793);
            rule__ResultSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultSpec"


    // $ANTLR start "entryRuleResultNaming"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:441:1: entryRuleResultNaming : ruleResultNaming EOF ;
    public final void entryRuleResultNaming() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:442:1: ( ruleResultNaming EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:443:1: ruleResultNaming EOF
            {
             before(grammarAccess.getResultNamingRule()); 
            pushFollow(FOLLOW_ruleResultNaming_in_entryRuleResultNaming820);
            ruleResultNaming();

            state._fsp--;

             after(grammarAccess.getResultNamingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultNaming827); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultNaming"


    // $ANTLR start "ruleResultNaming"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:450:1: ruleResultNaming : ( ( rule__ResultNaming__Group__0 ) ) ;
    public final void ruleResultNaming() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:454:5: ( ( ( rule__ResultNaming__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:455:1: ( ( rule__ResultNaming__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:455:1: ( ( rule__ResultNaming__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:456:1: ( rule__ResultNaming__Group__0 )
            {
             before(grammarAccess.getResultNamingAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:457:1: ( rule__ResultNaming__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:457:2: rule__ResultNaming__Group__0
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__0_in_ruleResultNaming857);
            rule__ResultNaming__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultNamingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultNaming"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:469:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:470:1: ( ruleBooleanExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:471:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression884);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression891); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:478:1: ruleBooleanExpression : ( ( rule__BooleanExpression__Group__0 ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:482:5: ( ( ( rule__BooleanExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:483:1: ( ( rule__BooleanExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:483:1: ( ( rule__BooleanExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:484:1: ( rule__BooleanExpression__Group__0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:485:1: ( rule__BooleanExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:485:2: rule__BooleanExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group__0_in_ruleBooleanExpression921);
            rule__BooleanExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanOp"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:497:1: entryRuleBooleanOp : ruleBooleanOp EOF ;
    public final void entryRuleBooleanOp() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:498:1: ( ruleBooleanOp EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:499:1: ruleBooleanOp EOF
            {
             before(grammarAccess.getBooleanOpRule()); 
            pushFollow(FOLLOW_ruleBooleanOp_in_entryRuleBooleanOp948);
            ruleBooleanOp();

            state._fsp--;

             after(grammarAccess.getBooleanOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanOp955); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanOp"


    // $ANTLR start "ruleBooleanOp"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:506:1: ruleBooleanOp : ( ( rule__BooleanOp__Alternatives ) ) ;
    public final void ruleBooleanOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:510:5: ( ( ( rule__BooleanOp__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:511:1: ( ( rule__BooleanOp__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:511:1: ( ( rule__BooleanOp__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:512:1: ( rule__BooleanOp__Alternatives )
            {
             before(grammarAccess.getBooleanOpAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:513:1: ( rule__BooleanOp__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:513:2: rule__BooleanOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanOp__Alternatives_in_ruleBooleanOp985);
            rule__BooleanOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOp"


    // $ANTLR start "entryRuleExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:525:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:526:1: ( ruleExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:527:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1012);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1019); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:534:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:538:5: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:539:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:539:1: ( ( rule__Expression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:540:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:541:1: ( rule__Expression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:541:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression1049);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleInfixOp"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:553:1: entryRuleInfixOp : ruleInfixOp EOF ;
    public final void entryRuleInfixOp() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:554:1: ( ruleInfixOp EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:555:1: ruleInfixOp EOF
            {
             before(grammarAccess.getInfixOpRule()); 
            pushFollow(FOLLOW_ruleInfixOp_in_entryRuleInfixOp1076);
            ruleInfixOp();

            state._fsp--;

             after(grammarAccess.getInfixOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfixOp1083); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfixOp"


    // $ANTLR start "ruleInfixOp"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:562:1: ruleInfixOp : ( ( rule__InfixOp__Alternatives ) ) ;
    public final void ruleInfixOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:566:5: ( ( ( rule__InfixOp__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:567:1: ( ( rule__InfixOp__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:567:1: ( ( rule__InfixOp__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:568:1: ( rule__InfixOp__Alternatives )
            {
             before(grammarAccess.getInfixOpAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:569:1: ( rule__InfixOp__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:569:2: rule__InfixOp__Alternatives
            {
            pushFollow(FOLLOW_rule__InfixOp__Alternatives_in_ruleInfixOp1113);
            rule__InfixOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInfixOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfixOp"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:581:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:582:1: ( ruleUnaryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:583:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1140);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:590:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:594:5: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:595:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:595:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:596:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:597:1: ( rule__UnaryExpression__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:597:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1177);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleCast"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:609:1: entryRuleCast : ruleCast EOF ;
    public final void entryRuleCast() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:610:1: ( ruleCast EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:611:1: ruleCast EOF
            {
             before(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast1204);
            ruleCast();

            state._fsp--;

             after(grammarAccess.getCastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast1211); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:618:1: ruleCast : ( ( rule__Cast__Group__0 ) ) ;
    public final void ruleCast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:622:5: ( ( ( rule__Cast__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:623:1: ( ( rule__Cast__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:623:1: ( ( rule__Cast__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:624:1: ( rule__Cast__Group__0 )
            {
             before(grammarAccess.getCastAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:625:1: ( rule__Cast__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:625:2: rule__Cast__Group__0
            {
            pushFollow(FOLLOW_rule__Cast__Group__0_in_ruleCast1241);
            rule__Cast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCastAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRulePrefixOp"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:637:1: entryRulePrefixOp : rulePrefixOp EOF ;
    public final void entryRulePrefixOp() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:638:1: ( rulePrefixOp EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:639:1: rulePrefixOp EOF
            {
             before(grammarAccess.getPrefixOpRule()); 
            pushFollow(FOLLOW_rulePrefixOp_in_entryRulePrefixOp1268);
            rulePrefixOp();

            state._fsp--;

             after(grammarAccess.getPrefixOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixOp1275); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixOp"


    // $ANTLR start "rulePrefixOp"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:646:1: rulePrefixOp : ( ( rule__PrefixOp__Alternatives ) ) ;
    public final void rulePrefixOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:650:5: ( ( ( rule__PrefixOp__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:651:1: ( ( rule__PrefixOp__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:651:1: ( ( rule__PrefixOp__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:652:1: ( rule__PrefixOp__Alternatives )
            {
             before(grammarAccess.getPrefixOpAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:653:1: ( rule__PrefixOp__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:653:2: rule__PrefixOp__Alternatives
            {
            pushFollow(FOLLOW_rule__PrefixOp__Alternatives_in_rulePrefixOp1305);
            rule__PrefixOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrefixOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixOp"


    // $ANTLR start "entryRulePrimary"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:665:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:666:1: ( rulePrimary EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:667:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1332);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1339); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:674:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:678:5: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:679:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:679:1: ( ( rule__Primary__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:680:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:681:1: ( rule__Primary__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:681:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1369);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:693:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:694:1: ( ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:695:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1396);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1403); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:702:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:706:5: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:707:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:707:1: ( ( rule__Type__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:708:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:709:1: ( rule__Type__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:709:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1433);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:721:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:722:1: ( rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:723:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1460);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1467); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:730:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:734:5: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:735:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:735:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:736:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:737:1: ( rule__PrimitiveType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:737:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1497);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleNumericType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:749:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:750:1: ( ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:751:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType1524);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType1531); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:758:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:762:5: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:763:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:763:1: ( ( rule__NumericType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:764:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:765:1: ( rule__NumericType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:765:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1561);
            rule__NumericType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegralType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:777:1: entryRuleIntegralType : ruleIntegralType EOF ;
    public final void entryRuleIntegralType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:778:1: ( ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:779:1: ruleIntegralType EOF
            {
             before(grammarAccess.getIntegralTypeRule()); 
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType1588);
            ruleIntegralType();

            state._fsp--;

             after(grammarAccess.getIntegralTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType1595); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegralType"


    // $ANTLR start "ruleIntegralType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:786:1: ruleIntegralType : ( ( rule__IntegralType__Alternatives ) ) ;
    public final void ruleIntegralType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:790:5: ( ( ( rule__IntegralType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:791:1: ( ( rule__IntegralType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:791:1: ( ( rule__IntegralType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:792:1: ( rule__IntegralType__Alternatives )
            {
             before(grammarAccess.getIntegralTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:793:1: ( rule__IntegralType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:793:2: rule__IntegralType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntegralType__Alternatives_in_ruleIntegralType1625);
            rule__IntegralType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegralTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegralType"


    // $ANTLR start "entryRuleFloatingPointType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:805:1: entryRuleFloatingPointType : ruleFloatingPointType EOF ;
    public final void entryRuleFloatingPointType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:806:1: ( ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:807:1: ruleFloatingPointType EOF
            {
             before(grammarAccess.getFloatingPointTypeRule()); 
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType1652);
            ruleFloatingPointType();

            state._fsp--;

             after(grammarAccess.getFloatingPointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType1659); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatingPointType"


    // $ANTLR start "ruleFloatingPointType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:814:1: ruleFloatingPointType : ( ( rule__FloatingPointType__Alternatives ) ) ;
    public final void ruleFloatingPointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:818:5: ( ( ( rule__FloatingPointType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:819:1: ( ( rule__FloatingPointType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:819:1: ( ( rule__FloatingPointType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:820:1: ( rule__FloatingPointType__Alternatives )
            {
             before(grammarAccess.getFloatingPointTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:821:1: ( rule__FloatingPointType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:821:2: rule__FloatingPointType__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatingPointType__Alternatives_in_ruleFloatingPointType1689);
            rule__FloatingPointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatingPointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatingPointType"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:833:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:834:1: ( ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:835:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1716);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral1723); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:842:1: ruleIntegerLiteral : ( RULE_INT ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:846:5: ( ( RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:847:1: ( RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:847:1: ( RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:848:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral1753); 
             after(grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:865:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:866:1: ( ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:867:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1783);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:874:1: ruleStringLiteral : ( RULE_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:878:5: ( ( RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:879:1: ( RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:879:1: ( RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:880:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1820); 
             after(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:893:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:894:1: ( ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:895:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1846);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1853); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:902:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:906:5: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:907:1: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:907:1: ( ( rule__BooleanLiteral__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:908:1: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:909:1: ( rule__BooleanLiteral__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:909:2: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral1883);
            rule__BooleanLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:921:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:922:1: ( ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:923:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1910);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1917); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:930:1: ruleNullLiteral : ( KEYWORD_29 ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:934:5: ( ( KEYWORD_29 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:935:1: ( KEYWORD_29 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:935:1: ( KEYWORD_29 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:936:1: KEYWORD_29
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword()); 
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleNullLiteral1948); 
             after(grammarAccess.getNullLiteralAccess().getNullKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:951:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:952:1: ( ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:953:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1976);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1983); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:960:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:964:5: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:965:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:965:1: ( ( rule__Literal__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:966:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:967:1: ( rule__Literal__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:967:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2013);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__BooleanOp__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:979:1: rule__BooleanOp__Alternatives : ( ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_41 ) | ( KEYWORD_19 ) | ( KEYWORD_16 ) | ( KEYWORD_17 ) | ( KEYWORD_22 ) );
    public final void rule__BooleanOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:983:1: ( ( KEYWORD_13 ) | ( KEYWORD_20 ) | ( KEYWORD_12 ) | ( KEYWORD_18 ) | ( KEYWORD_41 ) | ( KEYWORD_19 ) | ( KEYWORD_16 ) | ( KEYWORD_17 ) | ( KEYWORD_22 ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case KEYWORD_13:
                {
                alt1=1;
                }
                break;
            case KEYWORD_20:
                {
                alt1=2;
                }
                break;
            case KEYWORD_12:
                {
                alt1=3;
                }
                break;
            case KEYWORD_18:
                {
                alt1=4;
                }
                break;
            case KEYWORD_41:
                {
                alt1=5;
                }
                break;
            case KEYWORD_19:
                {
                alt1=6;
                }
                break;
            case KEYWORD_16:
                {
                alt1=7;
                }
                break;
            case KEYWORD_17:
                {
                alt1=8;
                }
                break;
            case KEYWORD_22:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:984:1: ( KEYWORD_13 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:984:1: ( KEYWORD_13 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:985:1: KEYWORD_13
                    {
                     before(grammarAccess.getBooleanOpAccess().getGreaterThanSignKeyword_0()); 
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__BooleanOp__Alternatives2050); 
                     after(grammarAccess.getBooleanOpAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:992:6: ( KEYWORD_20 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:992:6: ( KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:993:1: KEYWORD_20
                    {
                     before(grammarAccess.getBooleanOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__BooleanOp__Alternatives2070); 
                     after(grammarAccess.getBooleanOpAccess().getGreaterThanSignEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1000:6: ( KEYWORD_12 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1000:6: ( KEYWORD_12 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1001:1: KEYWORD_12
                    {
                     before(grammarAccess.getBooleanOpAccess().getLessThanSignKeyword_2()); 
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__BooleanOp__Alternatives2090); 
                     after(grammarAccess.getBooleanOpAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1008:6: ( KEYWORD_18 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1008:6: ( KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1009:1: KEYWORD_18
                    {
                     before(grammarAccess.getBooleanOpAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__BooleanOp__Alternatives2110); 
                     after(grammarAccess.getBooleanOpAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1016:6: ( KEYWORD_41 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1016:6: ( KEYWORD_41 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1017:1: KEYWORD_41
                    {
                     before(grammarAccess.getBooleanOpAccess().getInstanceofKeyword_4()); 
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__BooleanOp__Alternatives2130); 
                     after(grammarAccess.getBooleanOpAccess().getInstanceofKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1024:6: ( KEYWORD_19 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1024:6: ( KEYWORD_19 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1025:1: KEYWORD_19
                    {
                     before(grammarAccess.getBooleanOpAccess().getEqualsSignEqualsSignKeyword_5()); 
                    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__BooleanOp__Alternatives2150); 
                     after(grammarAccess.getBooleanOpAccess().getEqualsSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1032:6: ( KEYWORD_16 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1032:6: ( KEYWORD_16 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1033:1: KEYWORD_16
                    {
                     before(grammarAccess.getBooleanOpAccess().getExclamationMarkEqualsSignKeyword_6()); 
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__BooleanOp__Alternatives2170); 
                     after(grammarAccess.getBooleanOpAccess().getExclamationMarkEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1040:6: ( KEYWORD_17 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1040:6: ( KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1041:1: KEYWORD_17
                    {
                     before(grammarAccess.getBooleanOpAccess().getAmpersandAmpersandKeyword_7()); 
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__BooleanOp__Alternatives2190); 
                     after(grammarAccess.getBooleanOpAccess().getAmpersandAmpersandKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1048:6: ( KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1048:6: ( KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1049:1: KEYWORD_22
                    {
                     before(grammarAccess.getBooleanOpAccess().getVerticalLineVerticalLineKeyword_8()); 
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__BooleanOp__Alternatives2210); 
                     after(grammarAccess.getBooleanOpAccess().getVerticalLineVerticalLineKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOp__Alternatives"


    // $ANTLR start "rule__InfixOp__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1061:1: rule__InfixOp__Alternatives : ( ( KEYWORD_6 ) | ( KEYWORD_11 ) | ( KEYWORD_2 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_3 ) | ( KEYWORD_14 ) );
    public final void rule__InfixOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1065:1: ( ( KEYWORD_6 ) | ( KEYWORD_11 ) | ( KEYWORD_2 ) | ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_3 ) | ( KEYWORD_14 ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt2=1;
                }
                break;
            case KEYWORD_11:
                {
                alt2=2;
                }
                break;
            case KEYWORD_2:
                {
                alt2=3;
                }
                break;
            case KEYWORD_7:
                {
                alt2=4;
                }
                break;
            case KEYWORD_9:
                {
                alt2=5;
                }
                break;
            case KEYWORD_3:
                {
                alt2=6;
                }
                break;
            case KEYWORD_14:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1066:1: ( KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1066:1: ( KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1067:1: KEYWORD_6
                    {
                     before(grammarAccess.getInfixOpAccess().getAsteriskKeyword_0()); 
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__InfixOp__Alternatives2245); 
                     after(grammarAccess.getInfixOpAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1074:6: ( KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1074:6: ( KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1075:1: KEYWORD_11
                    {
                     before(grammarAccess.getInfixOpAccess().getSolidusKeyword_1()); 
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__InfixOp__Alternatives2265); 
                     after(grammarAccess.getInfixOpAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1082:6: ( KEYWORD_2 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1082:6: ( KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1083:1: KEYWORD_2
                    {
                     before(grammarAccess.getInfixOpAccess().getPercentSignKeyword_2()); 
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__InfixOp__Alternatives2285); 
                     after(grammarAccess.getInfixOpAccess().getPercentSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1090:6: ( KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1090:6: ( KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1091:1: KEYWORD_7
                    {
                     before(grammarAccess.getInfixOpAccess().getPlusSignKeyword_3()); 
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__InfixOp__Alternatives2305); 
                     after(grammarAccess.getInfixOpAccess().getPlusSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1098:6: ( KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1098:6: ( KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1099:1: KEYWORD_9
                    {
                     before(grammarAccess.getInfixOpAccess().getHyphenMinusKeyword_4()); 
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__InfixOp__Alternatives2325); 
                     after(grammarAccess.getInfixOpAccess().getHyphenMinusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1106:6: ( KEYWORD_3 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1106:6: ( KEYWORD_3 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1107:1: KEYWORD_3
                    {
                     before(grammarAccess.getInfixOpAccess().getAmpersandKeyword_5()); 
                    match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__InfixOp__Alternatives2345); 
                     after(grammarAccess.getInfixOpAccess().getAmpersandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1114:6: ( KEYWORD_14 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1114:6: ( KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1115:1: KEYWORD_14
                    {
                     before(grammarAccess.getInfixOpAccess().getVerticalLineKeyword_6()); 
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__InfixOp__Alternatives2365); 
                     after(grammarAccess.getInfixOpAccess().getVerticalLineKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfixOp__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1127:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__ExpressionAssignment_2 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1131:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__ExpressionAssignment_2 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1132:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1132:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1133:1: ( rule__UnaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1134:1: ( rule__UnaryExpression__Group_0__0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1134:2: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_0__0_in_rule__UnaryExpression__Alternatives2399);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1138:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1138:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1139:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1140:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1140:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives2417);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1144:6: ( ( rule__UnaryExpression__ExpressionAssignment_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1144:6: ( ( rule__UnaryExpression__ExpressionAssignment_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1145:1: ( rule__UnaryExpression__ExpressionAssignment_2 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1146:1: ( rule__UnaryExpression__ExpressionAssignment_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1146:2: rule__UnaryExpression__ExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__ExpressionAssignment_2_in_rule__UnaryExpression__Alternatives2435);
                    rule__UnaryExpression__ExpressionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__PrefixOp__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1155:1: rule__PrefixOp__Alternatives : ( ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_15 ) | ( KEYWORD_1 ) );
    public final void rule__PrefixOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1159:1: ( ( KEYWORD_7 ) | ( KEYWORD_9 ) | ( KEYWORD_15 ) | ( KEYWORD_1 ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt4=1;
                }
                break;
            case KEYWORD_9:
                {
                alt4=2;
                }
                break;
            case KEYWORD_15:
                {
                alt4=3;
                }
                break;
            case KEYWORD_1:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1160:1: ( KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1160:1: ( KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1161:1: KEYWORD_7
                    {
                     before(grammarAccess.getPrefixOpAccess().getPlusSignKeyword_0()); 
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__PrefixOp__Alternatives2469); 
                     after(grammarAccess.getPrefixOpAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1168:6: ( KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1168:6: ( KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1169:1: KEYWORD_9
                    {
                     before(grammarAccess.getPrefixOpAccess().getHyphenMinusKeyword_1()); 
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__PrefixOp__Alternatives2489); 
                     after(grammarAccess.getPrefixOpAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1176:6: ( KEYWORD_15 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1176:6: ( KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1177:1: KEYWORD_15
                    {
                     before(grammarAccess.getPrefixOpAccess().getTildeKeyword_2()); 
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__PrefixOp__Alternatives2509); 
                     after(grammarAccess.getPrefixOpAccess().getTildeKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1184:6: ( KEYWORD_1 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1184:6: ( KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1185:1: KEYWORD_1
                    {
                     before(grammarAccess.getPrefixOpAccess().getExclamationMarkKeyword_3()); 
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__PrefixOp__Alternatives2529); 
                     after(grammarAccess.getPrefixOpAccess().getExclamationMarkKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrefixOp__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1197:1: rule__Primary__Alternatives : ( ( ( rule__Primary__LiteralAssignment_0 ) ) | ( ( rule__Primary__ThisAssignment_1 ) ) | ( ( rule__Primary__ClassOrInterfaceAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1201:1: ( ( ( rule__Primary__LiteralAssignment_0 ) ) | ( ( rule__Primary__ThisAssignment_1 ) ) | ( ( rule__Primary__ClassOrInterfaceAssignment_2 ) ) | ( ( rule__Primary__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case KEYWORD_32:
            case KEYWORD_29:
            case KEYWORD_31:
            case RULE_INT:
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case KEYWORD_30:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case KEYWORD_4:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1202:1: ( ( rule__Primary__LiteralAssignment_0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1202:1: ( ( rule__Primary__LiteralAssignment_0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1203:1: ( rule__Primary__LiteralAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getLiteralAssignment_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1204:1: ( rule__Primary__LiteralAssignment_0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1204:2: rule__Primary__LiteralAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Primary__LiteralAssignment_0_in_rule__Primary__Alternatives2563);
                    rule__Primary__LiteralAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getLiteralAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1208:6: ( ( rule__Primary__ThisAssignment_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1208:6: ( ( rule__Primary__ThisAssignment_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1209:1: ( rule__Primary__ThisAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryAccess().getThisAssignment_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1210:1: ( rule__Primary__ThisAssignment_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1210:2: rule__Primary__ThisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Primary__ThisAssignment_1_in_rule__Primary__Alternatives2581);
                    rule__Primary__ThisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getThisAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1214:6: ( ( rule__Primary__ClassOrInterfaceAssignment_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1214:6: ( ( rule__Primary__ClassOrInterfaceAssignment_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1215:1: ( rule__Primary__ClassOrInterfaceAssignment_2 )
                    {
                     before(grammarAccess.getPrimaryAccess().getClassOrInterfaceAssignment_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1216:1: ( rule__Primary__ClassOrInterfaceAssignment_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1216:2: rule__Primary__ClassOrInterfaceAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Primary__ClassOrInterfaceAssignment_2_in_rule__Primary__Alternatives2599);
                    rule__Primary__ClassOrInterfaceAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getClassOrInterfaceAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1220:6: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1220:6: ( ( rule__Primary__Group_3__0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1221:1: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1222:1: ( rule__Primary__Group_3__0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1222:2: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives2617);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1231:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleClassOrInterfaceName ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1235:1: ( ( rulePrimitiveType ) | ( ruleClassOrInterfaceName ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=KEYWORD_39 && LA6_0<=KEYWORD_36)||(LA6_0>=KEYWORD_33 && LA6_0<=KEYWORD_34)||(LA6_0>=KEYWORD_24 && LA6_0<=KEYWORD_25)||LA6_0==KEYWORD_28||LA6_0==KEYWORD_23) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1236:1: ( rulePrimitiveType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1236:1: ( rulePrimitiveType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1237:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives2650);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1242:6: ( ruleClassOrInterfaceName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1242:6: ( ruleClassOrInterfaceName )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1243:1: ruleClassOrInterfaceName
                    {
                     before(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__Type__Alternatives2667);
                    ruleClassOrInterfaceName();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1253:1: rule__PrimitiveType__Alternatives : ( ( ruleNumericType ) | ( KEYWORD_39 ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1257:1: ( ( ruleNumericType ) | ( KEYWORD_39 ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_36||(LA7_0>=KEYWORD_33 && LA7_0<=KEYWORD_34)||(LA7_0>=KEYWORD_24 && LA7_0<=KEYWORD_25)||LA7_0==KEYWORD_28||LA7_0==KEYWORD_23) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1258:1: ( ruleNumericType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1258:1: ( ruleNumericType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1259:1: ruleNumericType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__PrimitiveType__Alternatives2699);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1264:6: ( KEYWORD_39 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1264:6: ( KEYWORD_39 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1265:1: KEYWORD_39
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1()); 
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__PrimitiveType__Alternatives2717); 
                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__NumericType__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1277:1: rule__NumericType__Alternatives : ( ( ruleIntegralType ) | ( ruleFloatingPointType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1281:1: ( ( ruleIntegralType ) | ( ruleFloatingPointType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_34||(LA8_0>=KEYWORD_24 && LA8_0<=KEYWORD_25)||LA8_0==KEYWORD_28||LA8_0==KEYWORD_23) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_36||LA8_0==KEYWORD_33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1282:1: ( ruleIntegralType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1282:1: ( ruleIntegralType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1283:1: ruleIntegralType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegralType_in_rule__NumericType__Alternatives2751);
                    ruleIntegralType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1288:6: ( ruleFloatingPointType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1288:6: ( ruleFloatingPointType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1289:1: ruleFloatingPointType
                    {
                     before(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFloatingPointType_in_rule__NumericType__Alternatives2768);
                    ruleFloatingPointType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Alternatives"


    // $ANTLR start "rule__IntegralType__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1299:1: rule__IntegralType__Alternatives : ( ( KEYWORD_24 ) | ( KEYWORD_34 ) | ( KEYWORD_23 ) | ( KEYWORD_28 ) | ( KEYWORD_25 ) );
    public final void rule__IntegralType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1303:1: ( ( KEYWORD_24 ) | ( KEYWORD_34 ) | ( KEYWORD_23 ) | ( KEYWORD_28 ) | ( KEYWORD_25 ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case KEYWORD_24:
                {
                alt9=1;
                }
                break;
            case KEYWORD_34:
                {
                alt9=2;
                }
                break;
            case KEYWORD_23:
                {
                alt9=3;
                }
                break;
            case KEYWORD_28:
                {
                alt9=4;
                }
                break;
            case KEYWORD_25:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1304:1: ( KEYWORD_24 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1304:1: ( KEYWORD_24 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1305:1: KEYWORD_24
                    {
                     before(grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__IntegralType__Alternatives2801); 
                     after(grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1312:6: ( KEYWORD_34 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1312:6: ( KEYWORD_34 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1313:1: KEYWORD_34
                    {
                     before(grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__IntegralType__Alternatives2821); 
                     after(grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1320:6: ( KEYWORD_23 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1320:6: ( KEYWORD_23 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1321:1: KEYWORD_23
                    {
                     before(grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                    match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__IntegralType__Alternatives2841); 
                     after(grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1328:6: ( KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1328:6: ( KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1329:1: KEYWORD_28
                    {
                     before(grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__IntegralType__Alternatives2861); 
                     after(grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1336:6: ( KEYWORD_25 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1336:6: ( KEYWORD_25 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1337:1: KEYWORD_25
                    {
                     before(grammarAccess.getIntegralTypeAccess().getCharKeyword_4()); 
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__IntegralType__Alternatives2881); 
                     after(grammarAccess.getIntegralTypeAccess().getCharKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegralType__Alternatives"


    // $ANTLR start "rule__FloatingPointType__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1349:1: rule__FloatingPointType__Alternatives : ( ( KEYWORD_33 ) | ( KEYWORD_36 ) );
    public final void rule__FloatingPointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1353:1: ( ( KEYWORD_33 ) | ( KEYWORD_36 ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_33) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_36) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1354:1: ( KEYWORD_33 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1354:1: ( KEYWORD_33 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1355:1: KEYWORD_33
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__FloatingPointType__Alternatives2916); 
                     after(grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1362:6: ( KEYWORD_36 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1362:6: ( KEYWORD_36 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1363:1: KEYWORD_36
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getDoubleKeyword_1()); 
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__FloatingPointType__Alternatives2936); 
                     after(grammarAccess.getFloatingPointTypeAccess().getDoubleKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatingPointType__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1375:1: rule__BooleanLiteral__Alternatives : ( ( KEYWORD_31 ) | ( KEYWORD_32 ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1379:1: ( ( KEYWORD_31 ) | ( KEYWORD_32 ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_31) ) {
                alt11=1;
            }
            else if ( (LA11_0==KEYWORD_32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1380:1: ( KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1380:1: ( KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1381:1: KEYWORD_31
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__BooleanLiteral__Alternatives2971); 
                     after(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1388:6: ( KEYWORD_32 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1388:6: ( KEYWORD_32 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1389:1: KEYWORD_32
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__BooleanLiteral__Alternatives2991); 
                     after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1401:1: rule__Literal__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1405:1: ( ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case KEYWORD_32:
            case KEYWORD_31:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case KEYWORD_29:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1406:1: ( ruleIntegerLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1406:1: ( ruleIntegerLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1407:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives3025);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1412:6: ( ruleBooleanLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1412:6: ( ruleBooleanLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1413:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3042);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1418:6: ( ruleStringLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1418:6: ( ruleStringLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1419:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3059);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1424:6: ( ruleNullLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1424:6: ( ruleNullLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1425:1: ruleNullLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives3076);
                    ruleNullLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__SingleStringJDOQL__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1437:1: rule__SingleStringJDOQL__Group__0 : rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1 ;
    public final void rule__SingleStringJDOQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1441:1: ( rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1442:2: rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__0__Impl_in_rule__SingleStringJDOQL__Group__03106);
            rule__SingleStringJDOQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__1_in_rule__SingleStringJDOQL__Group__03109);
            rule__SingleStringJDOQL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__Group__0"


    // $ANTLR start "rule__SingleStringJDOQL__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1449:1: rule__SingleStringJDOQL__Group__0__Impl : ( ( rule__SingleStringJDOQL__SelectAssignment_0 ) ) ;
    public final void rule__SingleStringJDOQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1453:1: ( ( ( rule__SingleStringJDOQL__SelectAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1454:1: ( ( rule__SingleStringJDOQL__SelectAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1454:1: ( ( rule__SingleStringJDOQL__SelectAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1455:1: ( rule__SingleStringJDOQL__SelectAssignment_0 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getSelectAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1456:1: ( rule__SingleStringJDOQL__SelectAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1456:2: rule__SingleStringJDOQL__SelectAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__SelectAssignment_0_in_rule__SingleStringJDOQL__Group__0__Impl3136);
            rule__SingleStringJDOQL__SelectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStringJDOQLAccess().getSelectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__Group__0__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1466:1: rule__SingleStringJDOQL__Group__1 : rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2 ;
    public final void rule__SingleStringJDOQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1470:1: ( rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1471:2: rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__1__Impl_in_rule__SingleStringJDOQL__Group__13166);
            rule__SingleStringJDOQL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__2_in_rule__SingleStringJDOQL__Group__13169);
            rule__SingleStringJDOQL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__Group__1"


    // $ANTLR start "rule__SingleStringJDOQL__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1478:1: rule__SingleStringJDOQL__Group__1__Impl : ( ( rule__SingleStringJDOQL__FromAssignment_1 ) ) ;
    public final void rule__SingleStringJDOQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1482:1: ( ( ( rule__SingleStringJDOQL__FromAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1483:1: ( ( rule__SingleStringJDOQL__FromAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1483:1: ( ( rule__SingleStringJDOQL__FromAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1484:1: ( rule__SingleStringJDOQL__FromAssignment_1 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getFromAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1485:1: ( rule__SingleStringJDOQL__FromAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1485:2: rule__SingleStringJDOQL__FromAssignment_1
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__FromAssignment_1_in_rule__SingleStringJDOQL__Group__1__Impl3196);
            rule__SingleStringJDOQL__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleStringJDOQLAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__Group__1__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1495:1: rule__SingleStringJDOQL__Group__2 : rule__SingleStringJDOQL__Group__2__Impl ;
    public final void rule__SingleStringJDOQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1499:1: ( rule__SingleStringJDOQL__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1500:2: rule__SingleStringJDOQL__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__2__Impl_in_rule__SingleStringJDOQL__Group__23226);
            rule__SingleStringJDOQL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__Group__2"


    // $ANTLR start "rule__SingleStringJDOQL__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1506:1: rule__SingleStringJDOQL__Group__2__Impl : ( ( rule__SingleStringJDOQL__WhereAssignment_2 )? ) ;
    public final void rule__SingleStringJDOQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1510:1: ( ( ( rule__SingleStringJDOQL__WhereAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1511:1: ( ( rule__SingleStringJDOQL__WhereAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1511:1: ( ( rule__SingleStringJDOQL__WhereAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1512:1: ( rule__SingleStringJDOQL__WhereAssignment_2 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getWhereAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1513:1: ( rule__SingleStringJDOQL__WhereAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1513:2: rule__SingleStringJDOQL__WhereAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__WhereAssignment_2_in_rule__SingleStringJDOQL__Group__2__Impl3253);
                    rule__SingleStringJDOQL__WhereAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getWhereAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1529:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1533:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1534:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__03290);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__1_in_rule__Select__Group__03293);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1541:1: rule__Select__Group__0__Impl : ( KEYWORD_37 ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1545:1: ( ( KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1546:1: ( KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1546:1: ( KEYWORD_37 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1547:1: KEYWORD_37
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__Select__Group__0__Impl3321); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1560:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1564:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1565:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__13352);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__2_in_rule__Select__Group__13355);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1572:1: rule__Select__Group__1__Impl : ( ( KEYWORD_38 )? ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1576:1: ( ( ( KEYWORD_38 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1577:1: ( ( KEYWORD_38 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1577:1: ( ( KEYWORD_38 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1578:1: ( KEYWORD_38 )?
            {
             before(grammarAccess.getSelectAccess().getUniqueKeyword_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1579:1: ( KEYWORD_38 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1580:2: KEYWORD_38
                    {
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__Select__Group__1__Impl3384); 

                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getUniqueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1591:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1595:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1596:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__23417);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__3_in_rule__Select__Group__23420);
            rule__Select__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1603:1: rule__Select__Group__2__Impl : ( ( rule__Select__ResultClauseAssignment_2 )? ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1607:1: ( ( ( rule__Select__ResultClauseAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1608:1: ( ( rule__Select__ResultClauseAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1608:1: ( ( rule__Select__ResultClauseAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1609:1: ( rule__Select__ResultClauseAssignment_2 )?
            {
             before(grammarAccess.getSelectAccess().getResultClauseAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1610:1: ( rule__Select__ResultClauseAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_40||LA15_0==KEYWORD_32||(LA15_0>=KEYWORD_29 && LA15_0<=KEYWORD_31)||LA15_0==KEYWORD_1||LA15_0==KEYWORD_4||LA15_0==KEYWORD_7||LA15_0==KEYWORD_9||(LA15_0>=KEYWORD_15 && LA15_0<=RULE_STRING)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1610:2: rule__Select__ResultClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Select__ResultClauseAssignment_2_in_rule__Select__Group__2__Impl3447);
                    rule__Select__ResultClauseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getResultClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1620:1: rule__Select__Group__3 : rule__Select__Group__3__Impl ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1624:1: ( rule__Select__Group__3__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1625:2: rule__Select__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group__3__Impl_in_rule__Select__Group__33478);
            rule__Select__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1631:1: rule__Select__Group__3__Impl : ( ( rule__Select__IntoClauseAssignment_3 )? ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1635:1: ( ( ( rule__Select__IntoClauseAssignment_3 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1636:1: ( ( rule__Select__IntoClauseAssignment_3 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1636:1: ( ( rule__Select__IntoClauseAssignment_3 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1637:1: ( rule__Select__IntoClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectAccess().getIntoClauseAssignment_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1638:1: ( rule__Select__IntoClauseAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1638:2: rule__Select__IntoClauseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Select__IntoClauseAssignment_3_in_rule__Select__Group__3__Impl3505);
                    rule__Select__IntoClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getIntoClauseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__ResultClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1656:1: rule__ResultClause__Group__0 : rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1 ;
    public final void rule__ResultClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1660:1: ( rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1661:2: rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__0__Impl_in_rule__ResultClause__Group__03544);
            rule__ResultClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group__1_in_rule__ResultClause__Group__03547);
            rule__ResultClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__Group__0"


    // $ANTLR start "rule__ResultClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1668:1: rule__ResultClause__Group__0__Impl : ( ( KEYWORD_40 )? ) ;
    public final void rule__ResultClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1672:1: ( ( ( KEYWORD_40 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1673:1: ( ( KEYWORD_40 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1673:1: ( ( KEYWORD_40 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1674:1: ( KEYWORD_40 )?
            {
             before(grammarAccess.getResultClauseAccess().getDistinctKeyword_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1675:1: ( KEYWORD_40 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1676:2: KEYWORD_40
                    {
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__ResultClause__Group__0__Impl3576); 

                    }
                    break;

            }

             after(grammarAccess.getResultClauseAccess().getDistinctKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__Group__0__Impl"


    // $ANTLR start "rule__ResultClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1687:1: rule__ResultClause__Group__1 : rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2 ;
    public final void rule__ResultClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1691:1: ( rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1692:2: rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__1__Impl_in_rule__ResultClause__Group__13609);
            rule__ResultClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group__2_in_rule__ResultClause__Group__13612);
            rule__ResultClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__Group__1"


    // $ANTLR start "rule__ResultClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1699:1: rule__ResultClause__Group__1__Impl : ( ( rule__ResultClause__ResultSpecsAssignment_1 ) ) ;
    public final void rule__ResultClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1703:1: ( ( ( rule__ResultClause__ResultSpecsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1704:1: ( ( rule__ResultClause__ResultSpecsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1704:1: ( ( rule__ResultClause__ResultSpecsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1705:1: ( rule__ResultClause__ResultSpecsAssignment_1 )
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1706:1: ( rule__ResultClause__ResultSpecsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1706:2: rule__ResultClause__ResultSpecsAssignment_1
            {
            pushFollow(FOLLOW_rule__ResultClause__ResultSpecsAssignment_1_in_rule__ResultClause__Group__1__Impl3639);
            rule__ResultClause__ResultSpecsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__Group__1__Impl"


    // $ANTLR start "rule__ResultClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1716:1: rule__ResultClause__Group__2 : rule__ResultClause__Group__2__Impl ;
    public final void rule__ResultClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1720:1: ( rule__ResultClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1721:2: rule__ResultClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__2__Impl_in_rule__ResultClause__Group__23669);
            rule__ResultClause__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__Group__2"


    // $ANTLR start "rule__ResultClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1727:1: rule__ResultClause__Group__2__Impl : ( ( KEYWORD_8 )? ) ;
    public final void rule__ResultClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1731:1: ( ( ( KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1732:1: ( ( KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1732:1: ( ( KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1733:1: ( KEYWORD_8 )?
            {
             before(grammarAccess.getResultClauseAccess().getCommaKeyword_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1734:1: ( KEYWORD_8 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_8) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1735:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ResultClause__Group__2__Impl3698); 

                    }
                    break;

            }

             after(grammarAccess.getResultClauseAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__Group__2__Impl"


    // $ANTLR start "rule__IntoClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1752:1: rule__IntoClause__Group__0 : rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1 ;
    public final void rule__IntoClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1756:1: ( rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1757:2: rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__0__Impl_in_rule__IntoClause__Group__03737);
            rule__IntoClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntoClause__Group__1_in_rule__IntoClause__Group__03740);
            rule__IntoClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntoClause__Group__0"


    // $ANTLR start "rule__IntoClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1764:1: rule__IntoClause__Group__0__Impl : ( KEYWORD_27 ) ;
    public final void rule__IntoClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1768:1: ( ( KEYWORD_27 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1769:1: ( KEYWORD_27 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1769:1: ( KEYWORD_27 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1770:1: KEYWORD_27
            {
             before(grammarAccess.getIntoClauseAccess().getIntoKeyword_0()); 
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__IntoClause__Group__0__Impl3768); 
             after(grammarAccess.getIntoClauseAccess().getIntoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntoClause__Group__0__Impl"


    // $ANTLR start "rule__IntoClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1783:1: rule__IntoClause__Group__1 : rule__IntoClause__Group__1__Impl ;
    public final void rule__IntoClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1787:1: ( rule__IntoClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1788:2: rule__IntoClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__1__Impl_in_rule__IntoClause__Group__13799);
            rule__IntoClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntoClause__Group__1"


    // $ANTLR start "rule__IntoClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1794:1: rule__IntoClause__Group__1__Impl : ( ( rule__IntoClause__ResultClassNameAssignment_1 ) ) ;
    public final void rule__IntoClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1798:1: ( ( ( rule__IntoClause__ResultClassNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1799:1: ( ( rule__IntoClause__ResultClassNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1799:1: ( ( rule__IntoClause__ResultClassNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1800:1: ( rule__IntoClause__ResultClassNameAssignment_1 )
            {
             before(grammarAccess.getIntoClauseAccess().getResultClassNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1801:1: ( rule__IntoClause__ResultClassNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1801:2: rule__IntoClause__ResultClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__IntoClause__ResultClassNameAssignment_1_in_rule__IntoClause__Group__1__Impl3826);
            rule__IntoClause__ResultClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntoClauseAccess().getResultClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntoClause__Group__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1815:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1819:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1820:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__03860);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__03863);
            rule__From__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1827:1: rule__From__Group__0__Impl : ( KEYWORD_26 ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1831:1: ( ( KEYWORD_26 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1832:1: ( KEYWORD_26 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1832:1: ( KEYWORD_26 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1833:1: KEYWORD_26
            {
             before(grammarAccess.getFromAccess().getFromKeyword_0()); 
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__From__Group__0__Impl3891); 
             after(grammarAccess.getFromAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1846:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1850:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1851:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__13922);
            rule__From__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__2_in_rule__From__Group__13925);
            rule__From__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1858:1: rule__From__Group__1__Impl : ( ( rule__From__CandidateClassNameAssignment_1 ) ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1862:1: ( ( ( rule__From__CandidateClassNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1863:1: ( ( rule__From__CandidateClassNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1863:1: ( ( rule__From__CandidateClassNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1864:1: ( rule__From__CandidateClassNameAssignment_1 )
            {
             before(grammarAccess.getFromAccess().getCandidateClassNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1865:1: ( rule__From__CandidateClassNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1865:2: rule__From__CandidateClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__From__CandidateClassNameAssignment_1_in_rule__From__Group__1__Impl3952);
            rule__From__CandidateClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getCandidateClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1875:1: rule__From__Group__2 : rule__From__Group__2__Impl ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1879:1: ( rule__From__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1880:2: rule__From__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__23982);
            rule__From__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2"


    // $ANTLR start "rule__From__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1886:1: rule__From__Group__2__Impl : ( ( rule__From__ExcludeClauseAssignment_2 )? ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1890:1: ( ( ( rule__From__ExcludeClauseAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1891:1: ( ( rule__From__ExcludeClauseAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1891:1: ( ( rule__From__ExcludeClauseAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1892:1: ( rule__From__ExcludeClauseAssignment_2 )?
            {
             before(grammarAccess.getFromAccess().getExcludeClauseAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1893:1: ( rule__From__ExcludeClauseAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1893:2: rule__From__ExcludeClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__From__ExcludeClauseAssignment_2_in_rule__From__Group__2__Impl4009);
                    rule__From__ExcludeClauseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromAccess().getExcludeClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1909:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1913:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1914:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_rule__Where__Group__0__Impl_in_rule__Where__Group__04046);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Where__Group__1_in_rule__Where__Group__04049);
            rule__Where__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1921:1: rule__Where__Group__0__Impl : ( KEYWORD_35 ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1925:1: ( ( KEYWORD_35 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1926:1: ( KEYWORD_35 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1926:1: ( KEYWORD_35 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1927:1: KEYWORD_35
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__Where__Group__0__Impl4077); 
             after(grammarAccess.getWhereAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1940:1: rule__Where__Group__1 : rule__Where__Group__1__Impl ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1944:1: ( rule__Where__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1945:2: rule__Where__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Where__Group__1__Impl_in_rule__Where__Group__14108);
            rule__Where__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1951:1: rule__Where__Group__1__Impl : ( ( rule__Where__EAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1955:1: ( ( ( rule__Where__EAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1956:1: ( ( rule__Where__EAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1956:1: ( ( rule__Where__EAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1957:1: ( rule__Where__EAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getEAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1958:1: ( rule__Where__EAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1958:2: rule__Where__EAssignment_1
            {
            pushFollow(FOLLOW_rule__Where__EAssignment_1_in_rule__Where__Group__1__Impl4135);
            rule__Where__EAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getEAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__QualifiedIdentifier__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1972:1: rule__QualifiedIdentifier__Group__0 : rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1 ;
    public final void rule__QualifiedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1976:1: ( rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1977:2: rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__0__Impl_in_rule__QualifiedIdentifier__Group__04169);
            rule__QualifiedIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__1_in_rule__QualifiedIdentifier__Group__04172);
            rule__QualifiedIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group__0"


    // $ANTLR start "rule__QualifiedIdentifier__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1984:1: rule__QualifiedIdentifier__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1988:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1989:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1989:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1990:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group__0__Impl4199); 
             after(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group__0__Impl"


    // $ANTLR start "rule__QualifiedIdentifier__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2001:1: rule__QualifiedIdentifier__Group__1 : rule__QualifiedIdentifier__Group__1__Impl ;
    public final void rule__QualifiedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2005:1: ( rule__QualifiedIdentifier__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2006:2: rule__QualifiedIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__1__Impl_in_rule__QualifiedIdentifier__Group__14228);
            rule__QualifiedIdentifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group__1"


    // $ANTLR start "rule__QualifiedIdentifier__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2012:1: rule__QualifiedIdentifier__Group__1__Impl : ( ( rule__QualifiedIdentifier__Group_1__0 )* ) ;
    public final void rule__QualifiedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2016:1: ( ( ( rule__QualifiedIdentifier__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2017:1: ( ( rule__QualifiedIdentifier__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2017:1: ( ( rule__QualifiedIdentifier__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2018:1: ( rule__QualifiedIdentifier__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2019:1: ( rule__QualifiedIdentifier__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==KEYWORD_10) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2019:2: rule__QualifiedIdentifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__0_in_rule__QualifiedIdentifier__Group__1__Impl4255);
            	    rule__QualifiedIdentifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedIdentifierAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group__1__Impl"


    // $ANTLR start "rule__QualifiedIdentifier__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2033:1: rule__QualifiedIdentifier__Group_1__0 : rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1 ;
    public final void rule__QualifiedIdentifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2037:1: ( rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2038:2: rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__0__Impl_in_rule__QualifiedIdentifier__Group_1__04290);
            rule__QualifiedIdentifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__1_in_rule__QualifiedIdentifier__Group_1__04293);
            rule__QualifiedIdentifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group_1__0"


    // $ANTLR start "rule__QualifiedIdentifier__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2045:1: rule__QualifiedIdentifier__Group_1__0__Impl : ( KEYWORD_10 ) ;
    public final void rule__QualifiedIdentifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2049:1: ( ( KEYWORD_10 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2050:1: ( KEYWORD_10 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2050:1: ( KEYWORD_10 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2051:1: KEYWORD_10
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__QualifiedIdentifier__Group_1__0__Impl4321); 
             after(grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedIdentifier__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2064:1: rule__QualifiedIdentifier__Group_1__1 : rule__QualifiedIdentifier__Group_1__1__Impl ;
    public final void rule__QualifiedIdentifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2068:1: ( rule__QualifiedIdentifier__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2069:2: rule__QualifiedIdentifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__1__Impl_in_rule__QualifiedIdentifier__Group_1__14352);
            rule__QualifiedIdentifier__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group_1__1"


    // $ANTLR start "rule__QualifiedIdentifier__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2075:1: rule__QualifiedIdentifier__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedIdentifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2079:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2080:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2080:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2081:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group_1__1__Impl4379); 
             after(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedIdentifier__Group_1__1__Impl"


    // $ANTLR start "rule__ResultSpecs__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2096:1: rule__ResultSpecs__Group__0 : rule__ResultSpecs__Group__0__Impl rule__ResultSpecs__Group__1 ;
    public final void rule__ResultSpecs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2100:1: ( rule__ResultSpecs__Group__0__Impl rule__ResultSpecs__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2101:2: rule__ResultSpecs__Group__0__Impl rule__ResultSpecs__Group__1
            {
            pushFollow(FOLLOW_rule__ResultSpecs__Group__0__Impl_in_rule__ResultSpecs__Group__04412);
            rule__ResultSpecs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultSpecs__Group__1_in_rule__ResultSpecs__Group__04415);
            rule__ResultSpecs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpecs__Group__0"


    // $ANTLR start "rule__ResultSpecs__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2108:1: rule__ResultSpecs__Group__0__Impl : ( ruleResultSpec ) ;
    public final void rule__ResultSpecs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2112:1: ( ( ruleResultSpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2113:1: ( ruleResultSpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2113:1: ( ruleResultSpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2114:1: ruleResultSpec
            {
             before(grammarAccess.getResultSpecsAccess().getResultSpecParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleResultSpec_in_rule__ResultSpecs__Group__0__Impl4442);
            ruleResultSpec();

            state._fsp--;

             after(grammarAccess.getResultSpecsAccess().getResultSpecParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpecs__Group__0__Impl"


    // $ANTLR start "rule__ResultSpecs__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2125:1: rule__ResultSpecs__Group__1 : rule__ResultSpecs__Group__1__Impl ;
    public final void rule__ResultSpecs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2129:1: ( rule__ResultSpecs__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2130:2: rule__ResultSpecs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultSpecs__Group__1__Impl_in_rule__ResultSpecs__Group__14471);
            rule__ResultSpecs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpecs__Group__1"


    // $ANTLR start "rule__ResultSpecs__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2136:1: rule__ResultSpecs__Group__1__Impl : ( ( KEYWORD_8 )? ) ;
    public final void rule__ResultSpecs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2140:1: ( ( ( KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2141:1: ( ( KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2141:1: ( ( KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2142:1: ( KEYWORD_8 )?
            {
             before(grammarAccess.getResultSpecsAccess().getCommaKeyword_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2143:1: ( KEYWORD_8 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_8) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2144:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ResultSpecs__Group__1__Impl4500); 

                    }
                    break;

            }

             after(grammarAccess.getResultSpecsAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpecs__Group__1__Impl"


    // $ANTLR start "rule__ResultSpec__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2159:1: rule__ResultSpec__Group__0 : rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1 ;
    public final void rule__ResultSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2163:1: ( rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2164:2: rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__0__Impl_in_rule__ResultSpec__Group__04537);
            rule__ResultSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultSpec__Group__1_in_rule__ResultSpec__Group__04540);
            rule__ResultSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpec__Group__0"


    // $ANTLR start "rule__ResultSpec__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2171:1: rule__ResultSpec__Group__0__Impl : ( ruleExpression ) ;
    public final void rule__ResultSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2175:1: ( ( ruleExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2176:1: ( ruleExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2176:1: ( ruleExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2177:1: ruleExpression
            {
             before(grammarAccess.getResultSpecAccess().getExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ResultSpec__Group__0__Impl4567);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getResultSpecAccess().getExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpec__Group__0__Impl"


    // $ANTLR start "rule__ResultSpec__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2188:1: rule__ResultSpec__Group__1 : rule__ResultSpec__Group__1__Impl ;
    public final void rule__ResultSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2192:1: ( rule__ResultSpec__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2193:2: rule__ResultSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__1__Impl_in_rule__ResultSpec__Group__14596);
            rule__ResultSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpec__Group__1"


    // $ANTLR start "rule__ResultSpec__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2199:1: rule__ResultSpec__Group__1__Impl : ( ( rule__ResultSpec__ResultNamingAssignment_1 )? ) ;
    public final void rule__ResultSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2203:1: ( ( ( rule__ResultSpec__ResultNamingAssignment_1 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2204:1: ( ( rule__ResultSpec__ResultNamingAssignment_1 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2204:1: ( ( rule__ResultSpec__ResultNamingAssignment_1 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2205:1: ( rule__ResultSpec__ResultNamingAssignment_1 )?
            {
             before(grammarAccess.getResultSpecAccess().getResultNamingAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2206:1: ( rule__ResultSpec__ResultNamingAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2206:2: rule__ResultSpec__ResultNamingAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ResultSpec__ResultNamingAssignment_1_in_rule__ResultSpec__Group__1__Impl4623);
                    rule__ResultSpec__ResultNamingAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResultSpecAccess().getResultNamingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpec__Group__1__Impl"


    // $ANTLR start "rule__ResultNaming__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2220:1: rule__ResultNaming__Group__0 : rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1 ;
    public final void rule__ResultNaming__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2224:1: ( rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2225:2: rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__0__Impl_in_rule__ResultNaming__Group__04658);
            rule__ResultNaming__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultNaming__Group__1_in_rule__ResultNaming__Group__04661);
            rule__ResultNaming__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultNaming__Group__0"


    // $ANTLR start "rule__ResultNaming__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2232:1: rule__ResultNaming__Group__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__ResultNaming__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2236:1: ( ( KEYWORD_21 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2237:1: ( KEYWORD_21 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2237:1: ( KEYWORD_21 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2238:1: KEYWORD_21
            {
             before(grammarAccess.getResultNamingAccess().getAsKeyword_0()); 
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__ResultNaming__Group__0__Impl4689); 
             after(grammarAccess.getResultNamingAccess().getAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultNaming__Group__0__Impl"


    // $ANTLR start "rule__ResultNaming__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2251:1: rule__ResultNaming__Group__1 : rule__ResultNaming__Group__1__Impl ;
    public final void rule__ResultNaming__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2255:1: ( rule__ResultNaming__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2256:2: rule__ResultNaming__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__1__Impl_in_rule__ResultNaming__Group__14720);
            rule__ResultNaming__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultNaming__Group__1"


    // $ANTLR start "rule__ResultNaming__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2262:1: rule__ResultNaming__Group__1__Impl : ( ( rule__ResultNaming__IdentifierAssignment_1 ) ) ;
    public final void rule__ResultNaming__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2266:1: ( ( ( rule__ResultNaming__IdentifierAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2267:1: ( ( rule__ResultNaming__IdentifierAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2267:1: ( ( rule__ResultNaming__IdentifierAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2268:1: ( rule__ResultNaming__IdentifierAssignment_1 )
            {
             before(grammarAccess.getResultNamingAccess().getIdentifierAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2269:1: ( rule__ResultNaming__IdentifierAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2269:2: rule__ResultNaming__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__ResultNaming__IdentifierAssignment_1_in_rule__ResultNaming__Group__1__Impl4747);
            rule__ResultNaming__IdentifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResultNamingAccess().getIdentifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultNaming__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2283:1: rule__BooleanExpression__Group__0 : rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 ;
    public final void rule__BooleanExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2287:1: ( rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2288:2: rule__BooleanExpression__Group__0__Impl rule__BooleanExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group__0__Impl_in_rule__BooleanExpression__Group__04781);
            rule__BooleanExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanExpression__Group__1_in_rule__BooleanExpression__Group__04784);
            rule__BooleanExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0"


    // $ANTLR start "rule__BooleanExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2295:1: rule__BooleanExpression__Group__0__Impl : ( ( rule__BooleanExpression__LeftAssignment_0 ) ) ;
    public final void rule__BooleanExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2299:1: ( ( ( rule__BooleanExpression__LeftAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2300:1: ( ( rule__BooleanExpression__LeftAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2300:1: ( ( rule__BooleanExpression__LeftAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2301:1: ( rule__BooleanExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getLeftAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2302:1: ( rule__BooleanExpression__LeftAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2302:2: rule__BooleanExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__LeftAssignment_0_in_rule__BooleanExpression__Group__0__Impl4811);
            rule__BooleanExpression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2312:1: rule__BooleanExpression__Group__1 : rule__BooleanExpression__Group__1__Impl ;
    public final void rule__BooleanExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2316:1: ( rule__BooleanExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2317:2: rule__BooleanExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group__1__Impl_in_rule__BooleanExpression__Group__14841);
            rule__BooleanExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1"


    // $ANTLR start "rule__BooleanExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2323:1: rule__BooleanExpression__Group__1__Impl : ( ( rule__BooleanExpression__Group_1__0 ) ) ;
    public final void rule__BooleanExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2327:1: ( ( ( rule__BooleanExpression__Group_1__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2328:1: ( ( rule__BooleanExpression__Group_1__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2328:1: ( ( rule__BooleanExpression__Group_1__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2329:1: ( rule__BooleanExpression__Group_1__0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2330:1: ( rule__BooleanExpression__Group_1__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2330:2: rule__BooleanExpression__Group_1__0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__0_in_rule__BooleanExpression__Group__1__Impl4868);
            rule__BooleanExpression__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2344:1: rule__BooleanExpression__Group_1__0 : rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 ;
    public final void rule__BooleanExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2348:1: ( rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2349:2: rule__BooleanExpression__Group_1__0__Impl rule__BooleanExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__0__Impl_in_rule__BooleanExpression__Group_1__04902);
            rule__BooleanExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__1_in_rule__BooleanExpression__Group_1__04905);
            rule__BooleanExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__0"


    // $ANTLR start "rule__BooleanExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2356:1: rule__BooleanExpression__Group_1__0__Impl : ( ( rule__BooleanExpression__OpAssignment_1_0 ) ) ;
    public final void rule__BooleanExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2360:1: ( ( ( rule__BooleanExpression__OpAssignment_1_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2361:1: ( ( rule__BooleanExpression__OpAssignment_1_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2361:1: ( ( rule__BooleanExpression__OpAssignment_1_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2362:1: ( rule__BooleanExpression__OpAssignment_1_0 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getOpAssignment_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2363:1: ( rule__BooleanExpression__OpAssignment_1_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2363:2: rule__BooleanExpression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BooleanExpression__OpAssignment_1_0_in_rule__BooleanExpression__Group_1__0__Impl4932);
            rule__BooleanExpression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2373:1: rule__BooleanExpression__Group_1__1 : rule__BooleanExpression__Group_1__1__Impl ;
    public final void rule__BooleanExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2377:1: ( rule__BooleanExpression__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2378:2: rule__BooleanExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanExpression__Group_1__1__Impl_in_rule__BooleanExpression__Group_1__14962);
            rule__BooleanExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__1"


    // $ANTLR start "rule__BooleanExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2384:1: rule__BooleanExpression__Group_1__1__Impl : ( ( rule__BooleanExpression__RightAssignment_1_1 ) ) ;
    public final void rule__BooleanExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2388:1: ( ( ( rule__BooleanExpression__RightAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2389:1: ( ( rule__BooleanExpression__RightAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2389:1: ( ( rule__BooleanExpression__RightAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2390:1: ( rule__BooleanExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2391:1: ( rule__BooleanExpression__RightAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2391:2: rule__BooleanExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__BooleanExpression__RightAssignment_1_1_in_rule__BooleanExpression__Group_1__1__Impl4989);
            rule__BooleanExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2405:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2409:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2410:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05023);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05026);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2417:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__LeftAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2421:1: ( ( ( rule__Expression__LeftAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2422:1: ( ( rule__Expression__LeftAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2422:1: ( ( rule__Expression__LeftAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2423:1: ( rule__Expression__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2424:1: ( rule__Expression__LeftAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2424:2: rule__Expression__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Expression__LeftAssignment_0_in_rule__Expression__Group__0__Impl5053);
            rule__Expression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2434:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2438:1: ( rule__Expression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2439:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15083);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2445:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2449:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2450:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2450:1: ( ( rule__Expression__Group_1__0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2451:1: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2452:1: ( rule__Expression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=KEYWORD_2 && LA23_0<=KEYWORD_3)||(LA23_0>=KEYWORD_6 && LA23_0<=KEYWORD_7)||LA23_0==KEYWORD_9||LA23_0==KEYWORD_11||LA23_0==KEYWORD_14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2452:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5110);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2466:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2470:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2471:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05145);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05148);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2478:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__OpAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2482:1: ( ( ( rule__Expression__OpAssignment_1_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2483:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2483:1: ( ( rule__Expression__OpAssignment_1_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2484:1: ( rule__Expression__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2485:1: ( rule__Expression__OpAssignment_1_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2485:2: rule__Expression__OpAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Expression__OpAssignment_1_0_in_rule__Expression__Group_1__0__Impl5175);
            rule__Expression__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2495:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2499:1: ( rule__Expression__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2500:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15205);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2506:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__RightAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2510:1: ( ( ( rule__Expression__RightAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2511:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2511:1: ( ( rule__Expression__RightAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2512:1: ( rule__Expression__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2513:1: ( rule__Expression__RightAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2513:2: rule__Expression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__RightAssignment_1_1_in_rule__Expression__Group_1__1__Impl5232);
            rule__Expression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2527:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2531:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2532:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__0__Impl_in_rule__UnaryExpression__Group_0__05266);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__1_in_rule__UnaryExpression__Group_0__05269);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2539:1: rule__UnaryExpression__Group_0__0__Impl : ( ( rule__UnaryExpression__ModifierAssignment_0_0 ) ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2543:1: ( ( ( rule__UnaryExpression__ModifierAssignment_0_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2544:1: ( ( rule__UnaryExpression__ModifierAssignment_0_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2544:1: ( ( rule__UnaryExpression__ModifierAssignment_0_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2545:1: ( rule__UnaryExpression__ModifierAssignment_0_0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getModifierAssignment_0_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2546:1: ( rule__UnaryExpression__ModifierAssignment_0_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2546:2: rule__UnaryExpression__ModifierAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UnaryExpression__ModifierAssignment_0_0_in_rule__UnaryExpression__Group_0__0__Impl5296);
            rule__UnaryExpression__ModifierAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getModifierAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2556:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2560:1: ( rule__UnaryExpression__Group_0__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2561:2: rule__UnaryExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0__1__Impl_in_rule__UnaryExpression__Group_0__15326);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2567:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2571:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_0_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2572:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2572:1: ( ( rule__UnaryExpression__ExpressionAssignment_0_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2573:1: ( rule__UnaryExpression__ExpressionAssignment_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2574:1: ( rule__UnaryExpression__ExpressionAssignment_0_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2574:2: rule__UnaryExpression__ExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__ExpressionAssignment_0_1_in_rule__UnaryExpression__Group_0__1__Impl5353);
            rule__UnaryExpression__ExpressionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2588:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2592:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2593:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__05387);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__05390);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2600:1: rule__UnaryExpression__Group_1__0__Impl : ( ( rule__UnaryExpression__CastAssignment_1_0 ) ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2604:1: ( ( ( rule__UnaryExpression__CastAssignment_1_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2605:1: ( ( rule__UnaryExpression__CastAssignment_1_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2605:1: ( ( rule__UnaryExpression__CastAssignment_1_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2606:1: ( rule__UnaryExpression__CastAssignment_1_0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getCastAssignment_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2607:1: ( rule__UnaryExpression__CastAssignment_1_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2607:2: rule__UnaryExpression__CastAssignment_1_0
            {
            pushFollow(FOLLOW_rule__UnaryExpression__CastAssignment_1_0_in_rule__UnaryExpression__Group_1__0__Impl5417);
            rule__UnaryExpression__CastAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getCastAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2617:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2621:1: ( rule__UnaryExpression__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2622:2: rule__UnaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__15447);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2628:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2632:1: ( ( ( rule__UnaryExpression__ExpressionAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2633:1: ( ( rule__UnaryExpression__ExpressionAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2633:1: ( ( rule__UnaryExpression__ExpressionAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2634:1: ( rule__UnaryExpression__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2635:1: ( rule__UnaryExpression__ExpressionAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2635:2: rule__UnaryExpression__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__ExpressionAssignment_1_1_in_rule__UnaryExpression__Group_1__1__Impl5474);
            rule__UnaryExpression__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__Cast__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2649:1: rule__Cast__Group__0 : rule__Cast__Group__0__Impl rule__Cast__Group__1 ;
    public final void rule__Cast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2653:1: ( rule__Cast__Group__0__Impl rule__Cast__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2654:2: rule__Cast__Group__0__Impl rule__Cast__Group__1
            {
            pushFollow(FOLLOW_rule__Cast__Group__0__Impl_in_rule__Cast__Group__05508);
            rule__Cast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cast__Group__1_in_rule__Cast__Group__05511);
            rule__Cast__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__0"


    // $ANTLR start "rule__Cast__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2661:1: rule__Cast__Group__0__Impl : ( KEYWORD_4 ) ;
    public final void rule__Cast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2665:1: ( ( KEYWORD_4 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2666:1: ( KEYWORD_4 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2666:1: ( KEYWORD_4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2667:1: KEYWORD_4
            {
             before(grammarAccess.getCastAccess().getLeftParenthesisKeyword_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Cast__Group__0__Impl5539); 
             after(grammarAccess.getCastAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__0__Impl"


    // $ANTLR start "rule__Cast__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2680:1: rule__Cast__Group__1 : rule__Cast__Group__1__Impl rule__Cast__Group__2 ;
    public final void rule__Cast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2684:1: ( rule__Cast__Group__1__Impl rule__Cast__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2685:2: rule__Cast__Group__1__Impl rule__Cast__Group__2
            {
            pushFollow(FOLLOW_rule__Cast__Group__1__Impl_in_rule__Cast__Group__15570);
            rule__Cast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cast__Group__2_in_rule__Cast__Group__15573);
            rule__Cast__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__1"


    // $ANTLR start "rule__Cast__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2692:1: rule__Cast__Group__1__Impl : ( ruleType ) ;
    public final void rule__Cast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2696:1: ( ( ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2697:1: ( ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2697:1: ( ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2698:1: ruleType
            {
             before(grammarAccess.getCastAccess().getTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleType_in_rule__Cast__Group__1__Impl5600);
            ruleType();

            state._fsp--;

             after(grammarAccess.getCastAccess().getTypeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__1__Impl"


    // $ANTLR start "rule__Cast__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2709:1: rule__Cast__Group__2 : rule__Cast__Group__2__Impl ;
    public final void rule__Cast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2713:1: ( rule__Cast__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2714:2: rule__Cast__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cast__Group__2__Impl_in_rule__Cast__Group__25629);
            rule__Cast__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__2"


    // $ANTLR start "rule__Cast__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2720:1: rule__Cast__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__Cast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2724:1: ( ( KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2725:1: ( KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2725:1: ( KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2726:1: KEYWORD_5
            {
             before(grammarAccess.getCastAccess().getRightParenthesisKeyword_2()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Cast__Group__2__Impl5657); 
             after(grammarAccess.getCastAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2745:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2749:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2750:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__05694);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__05697);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2757:1: rule__Primary__Group_3__0__Impl : ( KEYWORD_4 ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2761:1: ( ( KEYWORD_4 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2762:1: ( KEYWORD_4 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2762:1: ( KEYWORD_4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2763:1: KEYWORD_4
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Primary__Group_3__0__Impl5725); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2776:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2780:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2781:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__15756);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__15759);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2788:1: rule__Primary__Group_3__1__Impl : ( ( rule__Primary__ExpressionAssignment_3_1 ) ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2792:1: ( ( ( rule__Primary__ExpressionAssignment_3_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2793:1: ( ( rule__Primary__ExpressionAssignment_3_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2793:1: ( ( rule__Primary__ExpressionAssignment_3_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2794:1: ( rule__Primary__ExpressionAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2795:1: ( rule__Primary__ExpressionAssignment_3_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2795:2: rule__Primary__ExpressionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_3_1_in_rule__Primary__Group_3__1__Impl5786);
            rule__Primary__ExpressionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2805:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2809:1: ( rule__Primary__Group_3__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2810:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__25816);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2816:1: rule__Primary__Group_3__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2820:1: ( ( KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2821:1: ( KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2821:1: ( KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2822:1: KEYWORD_5
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Primary__Group_3__2__Impl5844); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__SelectAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2842:1: rule__SingleStringJDOQL__SelectAssignment_0 : ( ruleSelect ) ;
    public final void rule__SingleStringJDOQL__SelectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2846:1: ( ( ruleSelect ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2847:1: ( ruleSelect )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2847:1: ( ruleSelect )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2848:1: ruleSelect
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getSelectSelectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelect_in_rule__SingleStringJDOQL__SelectAssignment_05886);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getSelectSelectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__SelectAssignment_0"


    // $ANTLR start "rule__SingleStringJDOQL__FromAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2857:1: rule__SingleStringJDOQL__FromAssignment_1 : ( ruleFrom ) ;
    public final void rule__SingleStringJDOQL__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2861:1: ( ( ruleFrom ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2862:1: ( ruleFrom )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2862:1: ( ruleFrom )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2863:1: ruleFrom
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getFromFromParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFrom_in_rule__SingleStringJDOQL__FromAssignment_15917);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getFromFromParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__FromAssignment_1"


    // $ANTLR start "rule__SingleStringJDOQL__WhereAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2872:1: rule__SingleStringJDOQL__WhereAssignment_2 : ( ruleWhere ) ;
    public final void rule__SingleStringJDOQL__WhereAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2876:1: ( ( ruleWhere ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2877:1: ( ruleWhere )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2877:1: ( ruleWhere )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2878:1: ruleWhere
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getWhereWhereParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhere_in_rule__SingleStringJDOQL__WhereAssignment_25948);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getWhereWhereParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStringJDOQL__WhereAssignment_2"


    // $ANTLR start "rule__Select__ResultClauseAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2887:1: rule__Select__ResultClauseAssignment_2 : ( ruleResultClause ) ;
    public final void rule__Select__ResultClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2891:1: ( ( ruleResultClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2892:1: ( ruleResultClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2892:1: ( ruleResultClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2893:1: ruleResultClause
            {
             before(grammarAccess.getSelectAccess().getResultClauseResultClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleResultClause_in_rule__Select__ResultClauseAssignment_25979);
            ruleResultClause();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getResultClauseResultClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ResultClauseAssignment_2"


    // $ANTLR start "rule__Select__IntoClauseAssignment_3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2902:1: rule__Select__IntoClauseAssignment_3 : ( ruleIntoClause ) ;
    public final void rule__Select__IntoClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2906:1: ( ( ruleIntoClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2907:1: ( ruleIntoClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2907:1: ( ruleIntoClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2908:1: ruleIntoClause
            {
             before(grammarAccess.getSelectAccess().getIntoClauseIntoClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIntoClause_in_rule__Select__IntoClauseAssignment_36010);
            ruleIntoClause();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getIntoClauseIntoClauseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__IntoClauseAssignment_3"


    // $ANTLR start "rule__ResultClause__ResultSpecsAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2917:1: rule__ResultClause__ResultSpecsAssignment_1 : ( ruleResultSpecs ) ;
    public final void rule__ResultClause__ResultSpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2921:1: ( ( ruleResultSpecs ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2922:1: ( ruleResultSpecs )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2922:1: ( ruleResultSpecs )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2923:1: ruleResultSpecs
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResultSpecs_in_rule__ResultClause__ResultSpecsAssignment_16041);
            ruleResultSpecs();

            state._fsp--;

             after(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultClause__ResultSpecsAssignment_1"


    // $ANTLR start "rule__IntoClause__ResultClassNameAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2932:1: rule__IntoClause__ResultClassNameAssignment_1 : ( ruleClassOrInterfaceName ) ;
    public final void rule__IntoClause__ResultClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2936:1: ( ( ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2937:1: ( ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2937:1: ( ruleClassOrInterfaceName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2938:1: ruleClassOrInterfaceName
            {
             before(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__IntoClause__ResultClassNameAssignment_16072);
            ruleClassOrInterfaceName();

            state._fsp--;

             after(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntoClause__ResultClassNameAssignment_1"


    // $ANTLR start "rule__From__CandidateClassNameAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2947:1: rule__From__CandidateClassNameAssignment_1 : ( ruleCandidateClassName ) ;
    public final void rule__From__CandidateClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2951:1: ( ( ruleCandidateClassName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2952:1: ( ruleCandidateClassName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2952:1: ( ruleCandidateClassName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2953:1: ruleCandidateClassName
            {
             before(grammarAccess.getFromAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCandidateClassName_in_rule__From__CandidateClassNameAssignment_16103);
            ruleCandidateClassName();

            state._fsp--;

             after(grammarAccess.getFromAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__CandidateClassNameAssignment_1"


    // $ANTLR start "rule__From__ExcludeClauseAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2962:1: rule__From__ExcludeClauseAssignment_2 : ( ruleExcludeClause ) ;
    public final void rule__From__ExcludeClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2966:1: ( ( ruleExcludeClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2967:1: ( ruleExcludeClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2967:1: ( ruleExcludeClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2968:1: ruleExcludeClause
            {
             before(grammarAccess.getFromAccess().getExcludeClauseExcludeClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExcludeClause_in_rule__From__ExcludeClauseAssignment_26134);
            ruleExcludeClause();

            state._fsp--;

             after(grammarAccess.getFromAccess().getExcludeClauseExcludeClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__ExcludeClauseAssignment_2"


    // $ANTLR start "rule__Where__EAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2977:1: rule__Where__EAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__Where__EAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2981:1: ( ( ruleBooleanExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2982:1: ( ruleBooleanExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2982:1: ( ruleBooleanExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2983:1: ruleBooleanExpression
            {
             before(grammarAccess.getWhereAccess().getEBooleanExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_rule__Where__EAssignment_16165);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getEBooleanExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__EAssignment_1"


    // $ANTLR start "rule__ExcludeClause__ExcludeSubclassesAssignment"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2992:1: rule__ExcludeClause__ExcludeSubclassesAssignment : ( ( KEYWORD_42 ) ) ;
    public final void rule__ExcludeClause__ExcludeSubclassesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2996:1: ( ( ( KEYWORD_42 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2997:1: ( ( KEYWORD_42 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2997:1: ( ( KEYWORD_42 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2998:1: ( KEYWORD_42 )
            {
             before(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesExcludeSubclassesKeyword_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2999:1: ( KEYWORD_42 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3000:1: KEYWORD_42
            {
             before(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesExcludeSubclassesKeyword_0()); 
            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__ExcludeClause__ExcludeSubclassesAssignment6201); 
             after(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesExcludeSubclassesKeyword_0()); 

            }

             after(grammarAccess.getExcludeClauseAccess().getExcludeSubclassesExcludeSubclassesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcludeClause__ExcludeSubclassesAssignment"


    // $ANTLR start "rule__ResultSpec__ResultNamingAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3015:1: rule__ResultSpec__ResultNamingAssignment_1 : ( ruleResultNaming ) ;
    public final void rule__ResultSpec__ResultNamingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3019:1: ( ( ruleResultNaming ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3020:1: ( ruleResultNaming )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3020:1: ( ruleResultNaming )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3021:1: ruleResultNaming
            {
             before(grammarAccess.getResultSpecAccess().getResultNamingResultNamingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResultNaming_in_rule__ResultSpec__ResultNamingAssignment_16240);
            ruleResultNaming();

            state._fsp--;

             after(grammarAccess.getResultSpecAccess().getResultNamingResultNamingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultSpec__ResultNamingAssignment_1"


    // $ANTLR start "rule__ResultNaming__IdentifierAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3030:1: rule__ResultNaming__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResultNaming__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3034:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3035:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3035:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3036:1: RULE_ID
            {
             before(grammarAccess.getResultNamingAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResultNaming__IdentifierAssignment_16271); 
             after(grammarAccess.getResultNamingAccess().getIdentifierIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultNaming__IdentifierAssignment_1"


    // $ANTLR start "rule__BooleanExpression__LeftAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3045:1: rule__BooleanExpression__LeftAssignment_0 : ( ruleExpression ) ;
    public final void rule__BooleanExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3049:1: ( ( ruleExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3050:1: ( ruleExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3050:1: ( ruleExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3051:1: ruleExpression
            {
             before(grammarAccess.getBooleanExpressionAccess().getLeftExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__BooleanExpression__LeftAssignment_06302);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getLeftExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__LeftAssignment_0"


    // $ANTLR start "rule__BooleanExpression__OpAssignment_1_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3060:1: rule__BooleanExpression__OpAssignment_1_0 : ( ruleBooleanOp ) ;
    public final void rule__BooleanExpression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3064:1: ( ( ruleBooleanOp ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3065:1: ( ruleBooleanOp )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3065:1: ( ruleBooleanOp )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3066:1: ruleBooleanOp
            {
             before(grammarAccess.getBooleanExpressionAccess().getOpBooleanOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleBooleanOp_in_rule__BooleanExpression__OpAssignment_1_06333);
            ruleBooleanOp();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getOpBooleanOpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__OpAssignment_1_0"


    // $ANTLR start "rule__BooleanExpression__RightAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3075:1: rule__BooleanExpression__RightAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__BooleanExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3079:1: ( ( ruleExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3080:1: ( ruleExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3080:1: ( ruleExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3081:1: ruleExpression
            {
             before(grammarAccess.getBooleanExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__BooleanExpression__RightAssignment_1_16364);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionAccess().getRightExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__RightAssignment_1_1"


    // $ANTLR start "rule__Expression__LeftAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3090:1: rule__Expression__LeftAssignment_0 : ( ruleUnaryExpression ) ;
    public final void rule__Expression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3094:1: ( ( ruleUnaryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3095:1: ( ruleUnaryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3095:1: ( ruleUnaryExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3096:1: ruleUnaryExpression
            {
             before(grammarAccess.getExpressionAccess().getLeftUnaryExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__Expression__LeftAssignment_06395);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLeftUnaryExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__LeftAssignment_0"


    // $ANTLR start "rule__Expression__OpAssignment_1_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3105:1: rule__Expression__OpAssignment_1_0 : ( ruleInfixOp ) ;
    public final void rule__Expression__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3109:1: ( ( ruleInfixOp ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3110:1: ( ruleInfixOp )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3110:1: ( ruleInfixOp )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3111:1: ruleInfixOp
            {
             before(grammarAccess.getExpressionAccess().getOpInfixOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleInfixOp_in_rule__Expression__OpAssignment_1_06426);
            ruleInfixOp();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOpInfixOpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OpAssignment_1_0"


    // $ANTLR start "rule__Expression__RightAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3120:1: rule__Expression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__Expression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3124:1: ( ( ruleUnaryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3125:1: ( ruleUnaryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3125:1: ( ruleUnaryExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3126:1: ruleUnaryExpression
            {
             before(grammarAccess.getExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__Expression__RightAssignment_1_16457);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__ModifierAssignment_0_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3135:1: rule__UnaryExpression__ModifierAssignment_0_0 : ( rulePrefixOp ) ;
    public final void rule__UnaryExpression__ModifierAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3139:1: ( ( rulePrefixOp ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3140:1: ( rulePrefixOp )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3140:1: ( rulePrefixOp )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3141:1: rulePrefixOp
            {
             before(grammarAccess.getUnaryExpressionAccess().getModifierPrefixOpParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_rulePrefixOp_in_rule__UnaryExpression__ModifierAssignment_0_06488);
            rulePrefixOp();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getModifierPrefixOpParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ModifierAssignment_0_0"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_0_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3150:1: rule__UnaryExpression__ExpressionAssignment_0_1 : ( rulePrimary ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3154:1: ( ( rulePrimary ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3155:1: ( rulePrimary )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3155:1: ( rulePrimary )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3156:1: rulePrimary
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__UnaryExpression__ExpressionAssignment_0_16519);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__CastAssignment_1_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3165:1: rule__UnaryExpression__CastAssignment_1_0 : ( ruleCast ) ;
    public final void rule__UnaryExpression__CastAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3169:1: ( ( ruleCast ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3170:1: ( ruleCast )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3170:1: ( ruleCast )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3171:1: ruleCast
            {
             before(grammarAccess.getUnaryExpressionAccess().getCastCastParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCast_in_rule__UnaryExpression__CastAssignment_1_06550);
            ruleCast();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getCastCastParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__CastAssignment_1_0"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3180:1: rule__UnaryExpression__ExpressionAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3184:1: ( ( rulePrimary ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3185:1: ( rulePrimary )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3185:1: ( rulePrimary )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3186:1: rulePrimary
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__UnaryExpression__ExpressionAssignment_1_16581);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__ExpressionAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3195:1: rule__UnaryExpression__ExpressionAssignment_2 : ( rulePrimary ) ;
    public final void rule__UnaryExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3199:1: ( ( rulePrimary ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3200:1: ( rulePrimary )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3200:1: ( rulePrimary )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3201:1: rulePrimary
            {
             before(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__UnaryExpression__ExpressionAssignment_26612);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getExpressionPrimaryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__Primary__LiteralAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3210:1: rule__Primary__LiteralAssignment_0 : ( ruleLiteral ) ;
    public final void rule__Primary__LiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3214:1: ( ( ruleLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3215:1: ( ruleLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3215:1: ( ruleLiteral )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3216:1: ruleLiteral
            {
             before(grammarAccess.getPrimaryAccess().getLiteralLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Primary__LiteralAssignment_06643);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getLiteralLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__LiteralAssignment_0"


    // $ANTLR start "rule__Primary__ThisAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3225:1: rule__Primary__ThisAssignment_1 : ( ( KEYWORD_30 ) ) ;
    public final void rule__Primary__ThisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3229:1: ( ( ( KEYWORD_30 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3230:1: ( ( KEYWORD_30 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3230:1: ( ( KEYWORD_30 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3231:1: ( KEYWORD_30 )
            {
             before(grammarAccess.getPrimaryAccess().getThisThisKeyword_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3232:1: ( KEYWORD_30 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3233:1: KEYWORD_30
            {
             before(grammarAccess.getPrimaryAccess().getThisThisKeyword_1_0()); 
            match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__Primary__ThisAssignment_16679); 
             after(grammarAccess.getPrimaryAccess().getThisThisKeyword_1_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getThisThisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ThisAssignment_1"


    // $ANTLR start "rule__Primary__ClassOrInterfaceAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3248:1: rule__Primary__ClassOrInterfaceAssignment_2 : ( ruleClassOrInterfaceName ) ;
    public final void rule__Primary__ClassOrInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3252:1: ( ( ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3253:1: ( ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3253:1: ( ruleClassOrInterfaceName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3254:1: ruleClassOrInterfaceName
            {
             before(grammarAccess.getPrimaryAccess().getClassOrInterfaceClassOrInterfaceNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__Primary__ClassOrInterfaceAssignment_26718);
            ruleClassOrInterfaceName();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getClassOrInterfaceClassOrInterfaceNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ClassOrInterfaceAssignment_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_3_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3263:1: rule__Primary__ExpressionAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3267:1: ( ( ruleExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3268:1: ( ruleExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3268:1: ( ruleExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3269:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__ExpressionAssignment_3_16749);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_3_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\11\uffff";
    static final String DFA3_eofS =
        "\7\uffff\1\3\1\uffff";
    static final String DFA3_minS =
        "\1\13\1\uffff\1\7\1\uffff\1\40\1\uffff\1\56\1\5\1\40";
    static final String DFA3_maxS =
        "\1\60\1\uffff\1\60\1\uffff\1\54\1\uffff\1\56\1\60\1\54";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\3\uffff";
    static final String DFA3_specialS =
        "\11\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\10\uffff\3\3\10\uffff\1\1\2\uffff\1\2\2\uffff\1\1\1\uffff"+
            "\1\1\5\uffff\1\1\3\3",
            "",
            "\2\5\2\uffff\1\3\2\5\1\uffff\2\5\2\uffff\1\5\3\3\1\5\7\uffff"+
            "\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\5\uffff\1\3\1\4\2\3",
            "",
            "\2\3\1\uffff\1\7\2\3\1\uffff\1\3\1\6\1\3\2\uffff\1\3",
            "",
            "\1\10",
            "\1\3\5\uffff\1\5\5\uffff\2\3\1\uffff\3\5\1\uffff\7\3\1\uffff"+
            "\2\3\1\5\5\3\1\uffff\4\3\1\uffff\3\5",
            "\2\3\1\uffff\1\7\2\3\1\uffff\1\3\1\6\1\3\2\uffff\1\3"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1127:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__ExpressionAssignment_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSingleStringJDOQL_in_entryRuleSingleStringJDOQL54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStringJDOQL61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__0_in_ruleSingleStringJDOQL91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0_in_ruleSelect155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__0_in_ruleResultClause219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__0_in_ruleIntoClause283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhere_in_entryRuleWhere374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhere381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__0_in_ruleWhere411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExcludeClause_in_entryRuleExcludeClause438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExcludeClause445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExcludeClause__ExcludeSubclassesAssignment_in_ruleExcludeClause475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__0_in_ruleQualifiedIdentifier539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpecs_in_entryRuleResultSpecs692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpecs699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpecs__Group__0_in_ruleResultSpecs729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__0_in_ruleResultSpec793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__0_in_ruleResultNaming857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__0_in_ruleBooleanExpression921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOp_in_entryRuleBooleanOp948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanOp955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanOp__Alternatives_in_ruleBooleanOp985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixOp_in_entryRuleInfixOp1076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfixOp1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfixOp__Alternatives_in_ruleInfixOp1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__0_in_ruleCast1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixOp_in_entryRulePrefixOp1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixOp1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrefixOp__Alternatives_in_rulePrefixOp1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType1588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegralType__Alternatives_in_ruleIntegralType1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatingPointType__Alternatives_in_ruleFloatingPointType1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleNullLiteral1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__BooleanOp__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__BooleanOp__Alternatives2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__BooleanOp__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__BooleanOp__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__BooleanOp__Alternatives2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__BooleanOp__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__BooleanOp__Alternatives2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__BooleanOp__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__BooleanOp__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__InfixOp__Alternatives2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__InfixOp__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__InfixOp__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__InfixOp__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__InfixOp__Alternatives2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__InfixOp__Alternatives2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__InfixOp__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__0_in_rule__UnaryExpression__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__ExpressionAssignment_2_in_rule__UnaryExpression__Alternatives2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__PrefixOp__Alternatives2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__PrefixOp__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__PrefixOp__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__PrefixOp__Alternatives2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__LiteralAssignment_0_in_rule__Primary__Alternatives2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ThisAssignment_1_in_rule__Primary__Alternatives2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ClassOrInterfaceAssignment_2_in_rule__Primary__Alternatives2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0_in_rule__Primary__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__Type__Alternatives2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__PrimitiveType__Alternatives2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__PrimitiveType__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_rule__NumericType__Alternatives2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_rule__NumericType__Alternatives2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__IntegralType__Alternatives2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__IntegralType__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__IntegralType__Alternatives2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__IntegralType__Alternatives2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__IntegralType__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__FloatingPointType__Alternatives2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__FloatingPointType__Alternatives2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__BooleanLiteral__Alternatives2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__BooleanLiteral__Alternatives2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__0__Impl_in_rule__SingleStringJDOQL__Group__03106 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__1_in_rule__SingleStringJDOQL__Group__03109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__SelectAssignment_0_in_rule__SingleStringJDOQL__Group__0__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__1__Impl_in_rule__SingleStringJDOQL__Group__13166 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__2_in_rule__SingleStringJDOQL__Group__13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__FromAssignment_1_in_rule__SingleStringJDOQL__Group__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__2__Impl_in_rule__SingleStringJDOQL__Group__23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__WhereAssignment_2_in_rule__SingleStringJDOQL__Group__2__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__03290 = new BitSet(new long[]{0x0001E0A480740C40L});
    public static final BitSet FOLLOW_rule__Select__Group__1_in_rule__Select__Group__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__Select__Group__0__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__13352 = new BitSet(new long[]{0x0001E0A480740C40L});
    public static final BitSet FOLLOW_rule__Select__Group__2_in_rule__Select__Group__13355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__Select__Group__1__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__23417 = new BitSet(new long[]{0x0001E0A480740C40L});
    public static final BitSet FOLLOW_rule__Select__Group__3_in_rule__Select__Group__23420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__ResultClauseAssignment_2_in_rule__Select__Group__2__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__3__Impl_in_rule__Select__Group__33478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__IntoClauseAssignment_3_in_rule__Select__Group__3__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__0__Impl_in_rule__ResultClause__Group__03544 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__1_in_rule__ResultClause__Group__03547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__ResultClause__Group__0__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__1__Impl_in_rule__ResultClause__Group__13609 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__2_in_rule__ResultClause__Group__13612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__ResultSpecsAssignment_1_in_rule__ResultClause__Group__1__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__2__Impl_in_rule__ResultClause__Group__23669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ResultClause__Group__2__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__0__Impl_in_rule__IntoClause__Group__03737 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__1_in_rule__IntoClause__Group__03740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__IntoClause__Group__0__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__1__Impl_in_rule__IntoClause__Group__13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__ResultClassNameAssignment_1_in_rule__IntoClause__Group__1__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__03860 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__03863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__From__Group__0__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__13922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__From__Group__2_in_rule__From__Group__13925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__CandidateClassNameAssignment_1_in_rule__From__Group__1__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__23982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__ExcludeClauseAssignment_2_in_rule__From__Group__2__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__0__Impl_in_rule__Where__Group__04046 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__Where__Group__1_in_rule__Where__Group__04049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__Where__Group__0__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__Group__1__Impl_in_rule__Where__Group__14108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Where__EAssignment_1_in_rule__Where__Group__1__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__0__Impl_in_rule__QualifiedIdentifier__Group__04169 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__1_in_rule__QualifiedIdentifier__Group__04172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group__0__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__1__Impl_in_rule__QualifiedIdentifier__Group__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__0_in_rule__QualifiedIdentifier__Group__1__Impl4255 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__0__Impl_in_rule__QualifiedIdentifier__Group_1__04290 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__1_in_rule__QualifiedIdentifier__Group_1__04293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__QualifiedIdentifier__Group_1__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__1__Impl_in_rule__QualifiedIdentifier__Group_1__14352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group_1__1__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpecs__Group__0__Impl_in_rule__ResultSpecs__Group__04412 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ResultSpecs__Group__1_in_rule__ResultSpecs__Group__04415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_rule__ResultSpecs__Group__0__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpecs__Group__1__Impl_in_rule__ResultSpecs__Group__14471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ResultSpecs__Group__1__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__0__Impl_in_rule__ResultSpec__Group__04537 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__1_in_rule__ResultSpec__Group__04540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ResultSpec__Group__0__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__1__Impl_in_rule__ResultSpec__Group__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__ResultNamingAssignment_1_in_rule__ResultSpec__Group__1__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__0__Impl_in_rule__ResultNaming__Group__04658 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__1_in_rule__ResultNaming__Group__04661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__ResultNaming__Group__0__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__1__Impl_in_rule__ResultNaming__Group__14720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__IdentifierAssignment_1_in_rule__ResultNaming__Group__1__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__0__Impl_in_rule__BooleanExpression__Group__04781 = new BitSet(new long[]{0x00000C005F000020L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__1_in_rule__BooleanExpression__Group__04784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__LeftAssignment_0_in_rule__BooleanExpression__Group__0__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group__1__Impl_in_rule__BooleanExpression__Group__14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__0_in_rule__BooleanExpression__Group__1__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__0__Impl_in_rule__BooleanExpression__Group_1__04902 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__1_in_rule__BooleanExpression__Group_1__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__OpAssignment_1_0_in_rule__BooleanExpression__Group_1__0__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__Group_1__1__Impl_in_rule__BooleanExpression__Group_1__14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanExpression__RightAssignment_1_1_in_rule__BooleanExpression__Group_1__1__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05023 = new BitSet(new long[]{0x000012B300000000L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__LeftAssignment_0_in_rule__Expression__Group__0__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05145 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__OpAssignment_1_0_in_rule__Expression__Group_1__0__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__RightAssignment_1_1_in_rule__Expression__Group_1__1__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__0__Impl_in_rule__UnaryExpression__Group_0__05266 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__1_in_rule__UnaryExpression__Group_0__05269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__ModifierAssignment_0_0_in_rule__UnaryExpression__Group_0__0__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0__1__Impl_in_rule__UnaryExpression__Group_0__15326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__ExpressionAssignment_0_1_in_rule__UnaryExpression__Group_0__1__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__05387 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__05390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__CastAssignment_1_0_in_rule__UnaryExpression__Group_1__0__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__15447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__ExpressionAssignment_1_1_in_rule__UnaryExpression__Group_1__1__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__0__Impl_in_rule__Cast__Group__05508 = new BitSet(new long[]{0x000040000089B180L});
    public static final BitSet FOLLOW_rule__Cast__Group__1_in_rule__Cast__Group__05511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Cast__Group__0__Impl5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__1__Impl_in_rule__Cast__Group__15570 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Cast__Group__2_in_rule__Cast__Group__15573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Cast__Group__1__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__2__Impl_in_rule__Cast__Group__25629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Cast__Group__2__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__0__Impl_in_rule__Primary__Group_3__05694 = new BitSet(new long[]{0x0001E0A480700840L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1_in_rule__Primary__Group_3__05697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Primary__Group_3__0__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__1__Impl_in_rule__Primary__Group_3__15756 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2_in_rule__Primary__Group_3__15759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_3_1_in_rule__Primary__Group_3__1__Impl5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_3__2__Impl_in_rule__Primary__Group_3__25816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Primary__Group_3__2__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__SingleStringJDOQL__SelectAssignment_05886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__SingleStringJDOQL__FromAssignment_15917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhere_in_rule__SingleStringJDOQL__WhereAssignment_25948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_rule__Select__ResultClauseAssignment_25979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_rule__Select__IntoClauseAssignment_36010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpecs_in_rule__ResultClause__ResultSpecsAssignment_16041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__IntoClause__ResultClassNameAssignment_16072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_rule__From__CandidateClassNameAssignment_16103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExcludeClause_in_rule__From__ExcludeClauseAssignment_26134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rule__Where__EAssignment_16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__ExcludeClause__ExcludeSubclassesAssignment6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_rule__ResultSpec__ResultNamingAssignment_16240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResultNaming__IdentifierAssignment_16271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BooleanExpression__LeftAssignment_06302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanOp_in_rule__BooleanExpression__OpAssignment_1_06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BooleanExpression__RightAssignment_1_16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__Expression__LeftAssignment_06395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfixOp_in_rule__Expression__OpAssignment_1_06426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__Expression__RightAssignment_1_16457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixOp_in_rule__UnaryExpression__ModifierAssignment_0_06488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__UnaryExpression__ExpressionAssignment_0_16519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_rule__UnaryExpression__CastAssignment_1_06550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__UnaryExpression__ExpressionAssignment_1_16581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__UnaryExpression__ExpressionAssignment_26612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Primary__LiteralAssignment_06643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__Primary__ThisAssignment_16679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__Primary__ClassOrInterfaceAssignment_26718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__ExpressionAssignment_3_16749 = new BitSet(new long[]{0x0000000000000002L});

}