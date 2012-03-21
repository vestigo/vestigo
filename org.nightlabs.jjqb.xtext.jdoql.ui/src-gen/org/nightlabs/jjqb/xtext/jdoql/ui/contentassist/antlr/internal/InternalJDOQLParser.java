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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_49", "KEYWORD_48", "KEYWORD_46", "KEYWORD_47", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_26", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=56;
    public static final int RULE_ANY_OTHER=62;
    public static final int KEYWORD_19=32;
    public static final int KEYWORD_17=55;
    public static final int KEYWORD_18=31;
    public static final int KEYWORD_52=6;
    public static final int KEYWORD_15=53;
    public static final int KEYWORD_51=5;
    public static final int KEYWORD_16=54;
    public static final int KEYWORD_50=4;
    public static final int KEYWORD_13=51;
    public static final int KEYWORD_14=52;
    public static final int KEYWORD_11=49;
    public static final int KEYWORD_12=50;
    public static final int EOF=-1;
    public static final int KEYWORD_10=48;
    public static final int KEYWORD_6=44;
    public static final int KEYWORD_7=45;
    public static final int KEYWORD_8=46;
    public static final int KEYWORD_9=47;
    public static final int KEYWORD_28=23;
    public static final int KEYWORD_29=24;
    public static final int RULE_INT=57;
    public static final int KEYWORD_24=37;
    public static final int KEYWORD_25=38;
    public static final int KEYWORD_26=30;
    public static final int KEYWORD_27=22;
    public static final int KEYWORD_20=33;
    public static final int KEYWORD_21=34;
    public static final int KEYWORD_22=35;
    public static final int KEYWORD_23=36;
    public static final int KEYWORD_30=25;
    public static final int KEYWORD_1=39;
    public static final int KEYWORD_34=29;
    public static final int KEYWORD_5=43;
    public static final int KEYWORD_33=28;
    public static final int KEYWORD_4=42;
    public static final int KEYWORD_32=27;
    public static final int KEYWORD_3=41;
    public static final int KEYWORD_31=26;
    public static final int KEYWORD_2=40;
    public static final int KEYWORD_38=18;
    public static final int KEYWORD_37=17;
    public static final int RULE_SL_COMMENT=60;
    public static final int KEYWORD_36=16;
    public static final int KEYWORD_35=15;
    public static final int RULE_ML_COMMENT=59;
    public static final int KEYWORD_39=19;
    public static final int RULE_STRING=58;
    public static final int KEYWORD_41=21;
    public static final int KEYWORD_40=20;
    public static final int KEYWORD_43=12;
    public static final int KEYWORD_42=11;
    public static final int KEYWORD_45=14;
    public static final int KEYWORD_44=13;
    public static final int KEYWORD_47=10;
    public static final int RULE_WS=61;
    public static final int KEYWORD_46=9;
    public static final int KEYWORD_49=7;
    public static final int KEYWORD_48=8;

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
    		tokenNameToValue.put("KEYWORD_12", "':'");
    		tokenNameToValue.put("KEYWORD_13", "';'");
    		tokenNameToValue.put("KEYWORD_14", "'<'");
    		tokenNameToValue.put("KEYWORD_15", "'>'");
    		tokenNameToValue.put("KEYWORD_16", "'|'");
    		tokenNameToValue.put("KEYWORD_17", "'~'");
    		tokenNameToValue.put("KEYWORD_18", "'!='");
    		tokenNameToValue.put("KEYWORD_19", "'&&'");
    		tokenNameToValue.put("KEYWORD_20", "'<='");
    		tokenNameToValue.put("KEYWORD_21", "'=='");
    		tokenNameToValue.put("KEYWORD_22", "'>='");
    		tokenNameToValue.put("KEYWORD_23", "'AS'");
    		tokenNameToValue.put("KEYWORD_24", "'BY'");
    		tokenNameToValue.put("KEYWORD_25", "'||'");
    		tokenNameToValue.put("KEYWORD_26", "'int'");
    		tokenNameToValue.put("KEYWORD_27", "'FROM'");
    		tokenNameToValue.put("KEYWORD_28", "'INTO'");
    		tokenNameToValue.put("KEYWORD_29", "'byte'");
    		tokenNameToValue.put("KEYWORD_30", "'char'");
    		tokenNameToValue.put("KEYWORD_31", "'long'");
    		tokenNameToValue.put("KEYWORD_32", "'null'");
    		tokenNameToValue.put("KEYWORD_33", "'this'");
    		tokenNameToValue.put("KEYWORD_34", "'true'");
    		tokenNameToValue.put("KEYWORD_35", "'GROUP'");
    		tokenNameToValue.put("KEYWORD_36", "'ORDER'");
    		tokenNameToValue.put("KEYWORD_37", "'RANGE'");
    		tokenNameToValue.put("KEYWORD_38", "'WHERE'");
    		tokenNameToValue.put("KEYWORD_39", "'false'");
    		tokenNameToValue.put("KEYWORD_40", "'float'");
    		tokenNameToValue.put("KEYWORD_41", "'short'");
    		tokenNameToValue.put("KEYWORD_42", "'SELECT'");
    		tokenNameToValue.put("KEYWORD_43", "'UNIQUE'");
    		tokenNameToValue.put("KEYWORD_44", "'double'");
    		tokenNameToValue.put("KEYWORD_45", "'import'");
    		tokenNameToValue.put("KEYWORD_46", "'EXCLUDE'");
    		tokenNameToValue.put("KEYWORD_47", "'boolean'");
    		tokenNameToValue.put("KEYWORD_48", "'DISTINCT'");
    		tokenNameToValue.put("KEYWORD_49", "'VARIABLES'");
    		tokenNameToValue.put("KEYWORD_50", "'PARAMETERS'");
    		tokenNameToValue.put("KEYWORD_51", "'SUBCLASSES'");
    		tokenNameToValue.put("KEYWORD_52", "'instanceof'");
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:115:1: entryRuleSingleStringJDOQL : ruleSingleStringJDOQL EOF ;
    public final void entryRuleSingleStringJDOQL() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:116:1: ( ruleSingleStringJDOQL EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:117:1: ruleSingleStringJDOQL EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:124:1: ruleSingleStringJDOQL : ( ( rule__SingleStringJDOQL__Group__0 ) ) ;
    public final void ruleSingleStringJDOQL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:128:5: ( ( ( rule__SingleStringJDOQL__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:129:1: ( ( rule__SingleStringJDOQL__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:129:1: ( ( rule__SingleStringJDOQL__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:130:1: ( rule__SingleStringJDOQL__Group__0 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:131:1: ( rule__SingleStringJDOQL__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:131:2: rule__SingleStringJDOQL__Group__0
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


    // $ANTLR start "entryRuleSelectClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:143:1: entryRuleSelectClause : ruleSelectClause EOF ;
    public final void entryRuleSelectClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:144:1: ( ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:145:1: ruleSelectClause EOF
            {
             before(grammarAccess.getSelectClauseRule()); 
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause118);
            ruleSelectClause();

            state._fsp--;

             after(grammarAccess.getSelectClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause125); 

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
    // $ANTLR end "entryRuleSelectClause"


    // $ANTLR start "ruleSelectClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:152:1: ruleSelectClause : ( ( rule__SelectClause__Group__0 ) ) ;
    public final void ruleSelectClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:156:5: ( ( ( rule__SelectClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:157:1: ( ( rule__SelectClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:157:1: ( ( rule__SelectClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:158:1: ( rule__SelectClause__Group__0 )
            {
             before(grammarAccess.getSelectClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:159:1: ( rule__SelectClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:159:2: rule__SelectClause__Group__0
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__0_in_ruleSelectClause155);
            rule__SelectClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectClause"


    // $ANTLR start "entryRuleResultClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:171:1: entryRuleResultClause : ruleResultClause EOF ;
    public final void entryRuleResultClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:172:1: ( ruleResultClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:173:1: ruleResultClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:180:1: ruleResultClause : ( ( rule__ResultClause__Group__0 ) ) ;
    public final void ruleResultClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:184:5: ( ( ( rule__ResultClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:185:1: ( ( rule__ResultClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:185:1: ( ( rule__ResultClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:186:1: ( rule__ResultClause__Group__0 )
            {
             before(grammarAccess.getResultClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:187:1: ( rule__ResultClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:187:2: rule__ResultClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:199:1: entryRuleIntoClause : ruleIntoClause EOF ;
    public final void entryRuleIntoClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:200:1: ( ruleIntoClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:201:1: ruleIntoClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:208:1: ruleIntoClause : ( ( rule__IntoClause__Group__0 ) ) ;
    public final void ruleIntoClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:212:5: ( ( ( rule__IntoClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:213:1: ( ( rule__IntoClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:213:1: ( ( rule__IntoClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:214:1: ( rule__IntoClause__Group__0 )
            {
             before(grammarAccess.getIntoClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:215:1: ( rule__IntoClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:215:2: rule__IntoClause__Group__0
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


    // $ANTLR start "entryRuleResultSpec"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:227:1: entryRuleResultSpec : ruleResultSpec EOF ;
    public final void entryRuleResultSpec() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:228:1: ( ruleResultSpec EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:229:1: ruleResultSpec EOF
            {
             before(grammarAccess.getResultSpecRule()); 
            pushFollow(FOLLOW_ruleResultSpec_in_entryRuleResultSpec310);
            ruleResultSpec();

            state._fsp--;

             after(grammarAccess.getResultSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultSpec317); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:236:1: ruleResultSpec : ( ( rule__ResultSpec__Group__0 ) ) ;
    public final void ruleResultSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:240:5: ( ( ( rule__ResultSpec__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:241:1: ( ( rule__ResultSpec__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:241:1: ( ( rule__ResultSpec__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:242:1: ( rule__ResultSpec__Group__0 )
            {
             before(grammarAccess.getResultSpecAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:243:1: ( rule__ResultSpec__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:243:2: rule__ResultSpec__Group__0
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__0_in_ruleResultSpec347);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:255:1: entryRuleResultNaming : ruleResultNaming EOF ;
    public final void entryRuleResultNaming() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:256:1: ( ruleResultNaming EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:257:1: ruleResultNaming EOF
            {
             before(grammarAccess.getResultNamingRule()); 
            pushFollow(FOLLOW_ruleResultNaming_in_entryRuleResultNaming374);
            ruleResultNaming();

            state._fsp--;

             after(grammarAccess.getResultNamingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultNaming381); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:264:1: ruleResultNaming : ( ( rule__ResultNaming__Group__0 ) ) ;
    public final void ruleResultNaming() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:268:5: ( ( ( rule__ResultNaming__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:269:1: ( ( rule__ResultNaming__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:269:1: ( ( rule__ResultNaming__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:270:1: ( rule__ResultNaming__Group__0 )
            {
             before(grammarAccess.getResultNamingAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:271:1: ( rule__ResultNaming__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:271:2: rule__ResultNaming__Group__0
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__0_in_ruleResultNaming411);
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


    // $ANTLR start "entryRuleFromClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:283:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:284:1: ( ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:285:1: ruleFromClause EOF
            {
             before(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause438);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getFromClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause445); 

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
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:292:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:296:5: ( ( ( rule__FromClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:297:1: ( ( rule__FromClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:297:1: ( ( rule__FromClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:298:1: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:299:1: ( rule__FromClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:299:2: rule__FromClause__Group__0
            {
            pushFollow(FOLLOW_rule__FromClause__Group__0_in_ruleFromClause475);
            rule__FromClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleWhereClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:311:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:312:1: ( ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:313:1: ruleWhereClause EOF
            {
             before(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause502);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getWhereClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause509); 

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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:320:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:324:5: ( ( ( rule__WhereClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:325:1: ( ( rule__WhereClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:325:1: ( ( rule__WhereClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:326:1: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:327:1: ( rule__WhereClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:327:2: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_rule__WhereClause__Group__0_in_ruleWhereClause539);
            rule__WhereClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleVariablesClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:339:1: entryRuleVariablesClause : ruleVariablesClause EOF ;
    public final void entryRuleVariablesClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:340:1: ( ruleVariablesClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:341:1: ruleVariablesClause EOF
            {
             before(grammarAccess.getVariablesClauseRule()); 
            pushFollow(FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause566);
            ruleVariablesClause();

            state._fsp--;

             after(grammarAccess.getVariablesClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesClause573); 

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
    // $ANTLR end "entryRuleVariablesClause"


    // $ANTLR start "ruleVariablesClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:348:1: ruleVariablesClause : ( ( rule__VariablesClause__Group__0 ) ) ;
    public final void ruleVariablesClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:352:5: ( ( ( rule__VariablesClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:353:1: ( ( rule__VariablesClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:353:1: ( ( rule__VariablesClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:354:1: ( rule__VariablesClause__Group__0 )
            {
             before(grammarAccess.getVariablesClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:355:1: ( rule__VariablesClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:355:2: rule__VariablesClause__Group__0
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__0_in_ruleVariablesClause603);
            rule__VariablesClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariablesClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleVariablesClause"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:367:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:368:1: ( ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:369:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration630);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration637); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:376:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:380:5: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:381:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:381:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:382:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:383:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:383:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration667);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:395:1: entryRuleVariableName : ruleVariableName EOF ;
    public final void entryRuleVariableName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:396:1: ( ruleVariableName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:397:1: ruleVariableName EOF
            {
             before(grammarAccess.getVariableNameRule()); 
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName694);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getVariableNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName701); 

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
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:404:1: ruleVariableName : ( RULE_ID ) ;
    public final void ruleVariableName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:408:5: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:409:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:409:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:410:1: RULE_ID
            {
             before(grammarAccess.getVariableNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName731); 
             after(grammarAccess.getVariableNameAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleParametersClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:423:1: entryRuleParametersClause : ruleParametersClause EOF ;
    public final void entryRuleParametersClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:424:1: ( ruleParametersClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:425:1: ruleParametersClause EOF
            {
             before(grammarAccess.getParametersClauseRule()); 
            pushFollow(FOLLOW_ruleParametersClause_in_entryRuleParametersClause757);
            ruleParametersClause();

            state._fsp--;

             after(grammarAccess.getParametersClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersClause764); 

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
    // $ANTLR end "entryRuleParametersClause"


    // $ANTLR start "ruleParametersClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:432:1: ruleParametersClause : ( ( rule__ParametersClause__Group__0 ) ) ;
    public final void ruleParametersClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:436:5: ( ( ( rule__ParametersClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:437:1: ( ( rule__ParametersClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:437:1: ( ( rule__ParametersClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:438:1: ( rule__ParametersClause__Group__0 )
            {
             before(grammarAccess.getParametersClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:439:1: ( rule__ParametersClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:439:2: rule__ParametersClause__Group__0
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__0_in_ruleParametersClause794);
            rule__ParametersClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleParametersClause"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:451:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:452:1: ( ruleParameterDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:453:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration821);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration828); 

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:460:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:464:5: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:465:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:465:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:466:1: ( rule__ParameterDeclaration__Group__0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:467:1: ( rule__ParameterDeclaration__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:467:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration858);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleDeclaredParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:479:1: entryRuleDeclaredParameterName : ruleDeclaredParameterName EOF ;
    public final void entryRuleDeclaredParameterName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:480:1: ( ruleDeclaredParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:481:1: ruleDeclaredParameterName EOF
            {
             before(grammarAccess.getDeclaredParameterNameRule()); 
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName885);
            ruleDeclaredParameterName();

            state._fsp--;

             after(grammarAccess.getDeclaredParameterNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameterName892); 

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
    // $ANTLR end "entryRuleDeclaredParameterName"


    // $ANTLR start "ruleDeclaredParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:488:1: ruleDeclaredParameterName : ( ( rule__DeclaredParameterName__NameAssignment ) ) ;
    public final void ruleDeclaredParameterName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:492:5: ( ( ( rule__DeclaredParameterName__NameAssignment ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:493:1: ( ( rule__DeclaredParameterName__NameAssignment ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:493:1: ( ( rule__DeclaredParameterName__NameAssignment ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:494:1: ( rule__DeclaredParameterName__NameAssignment )
            {
             before(grammarAccess.getDeclaredParameterNameAccess().getNameAssignment()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:495:1: ( rule__DeclaredParameterName__NameAssignment )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:495:2: rule__DeclaredParameterName__NameAssignment
            {
            pushFollow(FOLLOW_rule__DeclaredParameterName__NameAssignment_in_ruleDeclaredParameterName922);
            rule__DeclaredParameterName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredParameterNameAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDeclaredParameterName"


    // $ANTLR start "entryRuleParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:507:1: entryRuleParameterName : ruleParameterName EOF ;
    public final void entryRuleParameterName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:508:1: ( ruleParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:509:1: ruleParameterName EOF
            {
             before(grammarAccess.getParameterNameRule()); 
            pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName949);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getParameterNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName956); 

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
    // $ANTLR end "entryRuleParameterName"


    // $ANTLR start "ruleParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:516:1: ruleParameterName : ( RULE_ID ) ;
    public final void ruleParameterName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:520:5: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:521:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:521:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:522:1: RULE_ID
            {
             before(grammarAccess.getParameterNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName986); 
             after(grammarAccess.getParameterNameAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleParameterName"


    // $ANTLR start "entryRuleImportClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:535:1: entryRuleImportClause : ruleImportClause EOF ;
    public final void entryRuleImportClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:536:1: ( ruleImportClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:537:1: ruleImportClause EOF
            {
             before(grammarAccess.getImportClauseRule()); 
            pushFollow(FOLLOW_ruleImportClause_in_entryRuleImportClause1012);
            ruleImportClause();

            state._fsp--;

             after(grammarAccess.getImportClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportClause1019); 

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
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:544:1: ruleImportClause : ( ( rule__ImportClause__Group__0 ) ) ;
    public final void ruleImportClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:548:5: ( ( ( rule__ImportClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:549:1: ( ( rule__ImportClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:549:1: ( ( rule__ImportClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:550:1: ( rule__ImportClause__Group__0 )
            {
             before(grammarAccess.getImportClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:551:1: ( rule__ImportClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:551:2: rule__ImportClause__Group__0
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__0_in_ruleImportClause1049);
            rule__ImportClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:563:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:564:1: ( ruleImportDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:565:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1076);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration1083); 

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
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:572:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:576:5: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:577:1: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:577:1: ( ( rule__ImportDeclaration__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:578:1: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:579:1: ( rule__ImportDeclaration__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:579:2: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration1113);
            rule__ImportDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleGroupByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:591:1: entryRuleGroupByClause : ruleGroupByClause EOF ;
    public final void entryRuleGroupByClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:592:1: ( ruleGroupByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:593:1: ruleGroupByClause EOF
            {
             before(grammarAccess.getGroupByClauseRule()); 
            pushFollow(FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause1140);
            ruleGroupByClause();

            state._fsp--;

             after(grammarAccess.getGroupByClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByClause1147); 

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
    // $ANTLR end "entryRuleGroupByClause"


    // $ANTLR start "ruleGroupByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:600:1: ruleGroupByClause : ( ( rule__GroupByClause__Group__0 ) ) ;
    public final void ruleGroupByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:604:5: ( ( ( rule__GroupByClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:605:1: ( ( rule__GroupByClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:605:1: ( ( rule__GroupByClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:606:1: ( rule__GroupByClause__Group__0 )
            {
             before(grammarAccess.getGroupByClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:607:1: ( rule__GroupByClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:607:2: rule__GroupByClause__Group__0
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__0_in_ruleGroupByClause1177);
            rule__GroupByClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupByClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleGroupByClause"


    // $ANTLR start "entryRuleOrderByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:619:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:620:1: ( ruleOrderByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:621:1: ruleOrderByClause EOF
            {
             before(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause1204);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getOrderByClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderByClause1211); 

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
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:628:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:632:5: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:633:1: ( ( rule__OrderByClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:633:1: ( ( rule__OrderByClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:634:1: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:635:1: ( rule__OrderByClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:635:2: rule__OrderByClause__Group__0
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__0_in_ruleOrderByClause1241);
            rule__OrderByClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleRangeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:647:1: entryRuleRangeClause : ruleRangeClause EOF ;
    public final void entryRuleRangeClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:648:1: ( ruleRangeClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:649:1: ruleRangeClause EOF
            {
             before(grammarAccess.getRangeClauseRule()); 
            pushFollow(FOLLOW_ruleRangeClause_in_entryRuleRangeClause1268);
            ruleRangeClause();

            state._fsp--;

             after(grammarAccess.getRangeClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeClause1275); 

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
    // $ANTLR end "entryRuleRangeClause"


    // $ANTLR start "ruleRangeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:656:1: ruleRangeClause : ( KEYWORD_37 ) ;
    public final void ruleRangeClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:660:5: ( ( KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:661:1: ( KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:661:1: ( KEYWORD_37 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:662:1: KEYWORD_37
            {
             before(grammarAccess.getRangeClauseAccess().getRANGEKeyword()); 
            match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleRangeClause1306); 
             after(grammarAccess.getRangeClauseAccess().getRANGEKeyword()); 

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
    // $ANTLR end "ruleRangeClause"


    // $ANTLR start "entryRuleConditionalOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:677:1: entryRuleConditionalOrExpression : ruleConditionalOrExpression EOF ;
    public final void entryRuleConditionalOrExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:678:1: ( ruleConditionalOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:679:1: ruleConditionalOrExpression EOF
            {
             before(grammarAccess.getConditionalOrExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression1334);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression1341); 

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
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:686:1: ruleConditionalOrExpression : ( ( rule__ConditionalOrExpression__Group__0 ) ) ;
    public final void ruleConditionalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:690:5: ( ( ( rule__ConditionalOrExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:691:1: ( ( rule__ConditionalOrExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:691:1: ( ( rule__ConditionalOrExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:692:1: ( rule__ConditionalOrExpression__Group__0 )
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:693:1: ( rule__ConditionalOrExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:693:2: rule__ConditionalOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__0_in_ruleConditionalOrExpression1371);
            rule__ConditionalOrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalOrExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:705:1: entryRuleConditionalAndExpression : ruleConditionalAndExpression EOF ;
    public final void entryRuleConditionalAndExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:706:1: ( ruleConditionalAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:707:1: ruleConditionalAndExpression EOF
            {
             before(grammarAccess.getConditionalAndExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression1398);
            ruleConditionalAndExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression1405); 

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
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:714:1: ruleConditionalAndExpression : ( ( rule__ConditionalAndExpression__Group__0 ) ) ;
    public final void ruleConditionalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:718:5: ( ( ( rule__ConditionalAndExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:719:1: ( ( rule__ConditionalAndExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:719:1: ( ( rule__ConditionalAndExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:720:1: ( rule__ConditionalAndExpression__Group__0 )
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:721:1: ( rule__ConditionalAndExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:721:2: rule__ConditionalAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__0_in_ruleConditionalAndExpression1435);
            rule__ConditionalAndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleSimpleOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:733:1: entryRuleSimpleOrExpression : ruleSimpleOrExpression EOF ;
    public final void entryRuleSimpleOrExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:734:1: ( ruleSimpleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:735:1: ruleSimpleOrExpression EOF
            {
             before(grammarAccess.getSimpleOrExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression1462);
            ruleSimpleOrExpression();

            state._fsp--;

             after(grammarAccess.getSimpleOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrExpression1469); 

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
    // $ANTLR end "entryRuleSimpleOrExpression"


    // $ANTLR start "ruleSimpleOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:742:1: ruleSimpleOrExpression : ( ( rule__SimpleOrExpression__Group__0 ) ) ;
    public final void ruleSimpleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:746:5: ( ( ( rule__SimpleOrExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:747:1: ( ( rule__SimpleOrExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:747:1: ( ( rule__SimpleOrExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:748:1: ( rule__SimpleOrExpression__Group__0 )
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:749:1: ( rule__SimpleOrExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:749:2: rule__SimpleOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__0_in_ruleSimpleOrExpression1499);
            rule__SimpleOrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOrExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleOrExpression"


    // $ANTLR start "entryRuleSimpleAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:761:1: entryRuleSimpleAndExpression : ruleSimpleAndExpression EOF ;
    public final void entryRuleSimpleAndExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:762:1: ( ruleSimpleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:763:1: ruleSimpleAndExpression EOF
            {
             before(grammarAccess.getSimpleAndExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression1526);
            ruleSimpleAndExpression();

            state._fsp--;

             after(grammarAccess.getSimpleAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAndExpression1533); 

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
    // $ANTLR end "entryRuleSimpleAndExpression"


    // $ANTLR start "ruleSimpleAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:770:1: ruleSimpleAndExpression : ( ( rule__SimpleAndExpression__Group__0 ) ) ;
    public final void ruleSimpleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:774:5: ( ( ( rule__SimpleAndExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:775:1: ( ( rule__SimpleAndExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:775:1: ( ( rule__SimpleAndExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:776:1: ( rule__SimpleAndExpression__Group__0 )
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:777:1: ( rule__SimpleAndExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:777:2: rule__SimpleAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__0_in_ruleSimpleAndExpression1563);
            rule__SimpleAndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleAndExpression"


    // $ANTLR start "entryRuleComparisonOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:789:1: entryRuleComparisonOperatorExpression : ruleComparisonOperatorExpression EOF ;
    public final void entryRuleComparisonOperatorExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:790:1: ( ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:791:1: ruleComparisonOperatorExpression EOF
            {
             before(grammarAccess.getComparisonOperatorExpressionRule()); 
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression1590);
            ruleComparisonOperatorExpression();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression1597); 

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
    // $ANTLR end "entryRuleComparisonOperatorExpression"


    // $ANTLR start "ruleComparisonOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:798:1: ruleComparisonOperatorExpression : ( ( rule__ComparisonOperatorExpression__Group__0 ) ) ;
    public final void ruleComparisonOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:802:5: ( ( ( rule__ComparisonOperatorExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:803:1: ( ( rule__ComparisonOperatorExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:803:1: ( ( rule__ComparisonOperatorExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:804:1: ( rule__ComparisonOperatorExpression__Group__0 )
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:805:1: ( rule__ComparisonOperatorExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:805:2: rule__ComparisonOperatorExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__0_in_ruleComparisonOperatorExpression1627);
            rule__ComparisonOperatorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleComparisonOperatorExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:817:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:818:1: ( ruleAdditionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:819:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1654);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression1661); 

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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:826:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:830:5: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:831:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:831:1: ( ( rule__AdditionExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:832:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:833:1: ( rule__AdditionExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:833:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1691);
            rule__AdditionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:845:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:846:1: ( ruleMultiplicationExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:847:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1718);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression1725); 

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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:854:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:858:5: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:859:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:859:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:860:1: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:861:1: ( rule__MultiplicationExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:861:2: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression1755);
            rule__MultiplicationExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:873:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:874:1: ( ruleUnaryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:875:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1782);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1789); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:882:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:886:5: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:887:1: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:887:1: ( ( rule__UnaryExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:888:1: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:889:1: ( rule__UnaryExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:889:2: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group__0_in_ruleUnaryExpression1819);
            rule__UnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleFieldAccessExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:901:1: entryRuleFieldAccessExpression : ruleFieldAccessExpression EOF ;
    public final void entryRuleFieldAccessExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:902:1: ( ruleFieldAccessExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:903:1: ruleFieldAccessExpression EOF
            {
             before(grammarAccess.getFieldAccessExpressionRule()); 
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression1846);
            ruleFieldAccessExpression();

            state._fsp--;

             after(grammarAccess.getFieldAccessExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAccessExpression1853); 

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
    // $ANTLR end "entryRuleFieldAccessExpression"


    // $ANTLR start "ruleFieldAccessExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:910:1: ruleFieldAccessExpression : ( ( rule__FieldAccessExpression__Group__0 ) ) ;
    public final void ruleFieldAccessExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:914:5: ( ( ( rule__FieldAccessExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:915:1: ( ( rule__FieldAccessExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:915:1: ( ( rule__FieldAccessExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:916:1: ( rule__FieldAccessExpression__Group__0 )
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:917:1: ( rule__FieldAccessExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:917:2: rule__FieldAccessExpression__Group__0
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__0_in_ruleFieldAccessExpression1883);
            rule__FieldAccessExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccessExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldAccessExpression"


    // $ANTLR start "entryRuleParameterOrFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:929:1: entryRuleParameterOrFieldOrMethodExpression : ruleParameterOrFieldOrMethodExpression EOF ;
    public final void entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:930:1: ( ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:931:1: ruleParameterOrFieldOrMethodExpression EOF
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression1910);
            ruleParameterOrFieldOrMethodExpression();

            state._fsp--;

             after(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression1917); 

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
    // $ANTLR end "entryRuleParameterOrFieldOrMethodExpression"


    // $ANTLR start "ruleParameterOrFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:938:1: ruleParameterOrFieldOrMethodExpression : ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) ) ;
    public final void ruleParameterOrFieldOrMethodExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:942:5: ( ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:943:1: ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:943:1: ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:944:1: ( rule__ParameterOrFieldOrMethodExpression__Alternatives )
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:945:1: ( rule__ParameterOrFieldOrMethodExpression__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:945:2: rule__ParameterOrFieldOrMethodExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Alternatives_in_ruleParameterOrFieldOrMethodExpression1947);
            rule__ParameterOrFieldOrMethodExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameterOrFieldOrMethodExpression"


    // $ANTLR start "entryRuleFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:957:1: entryRuleFieldOrMethodExpression : ruleFieldOrMethodExpression EOF ;
    public final void entryRuleFieldOrMethodExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:958:1: ( ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:959:1: ruleFieldOrMethodExpression EOF
            {
             before(grammarAccess.getFieldOrMethodExpressionRule()); 
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression1974);
            ruleFieldOrMethodExpression();

            state._fsp--;

             after(grammarAccess.getFieldOrMethodExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression1981); 

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
    // $ANTLR end "entryRuleFieldOrMethodExpression"


    // $ANTLR start "ruleFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:966:1: ruleFieldOrMethodExpression : ( ( rule__FieldOrMethodExpression__Alternatives ) ) ;
    public final void ruleFieldOrMethodExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:970:5: ( ( ( rule__FieldOrMethodExpression__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:971:1: ( ( rule__FieldOrMethodExpression__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:971:1: ( ( rule__FieldOrMethodExpression__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:972:1: ( rule__FieldOrMethodExpression__Alternatives )
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:973:1: ( rule__FieldOrMethodExpression__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:973:2: rule__FieldOrMethodExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOrMethodExpression__Alternatives_in_ruleFieldOrMethodExpression2011);
            rule__FieldOrMethodExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldOrMethodExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFieldOrMethodExpression"


    // $ANTLR start "entryRuleParenthesesExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:985:1: entryRuleParenthesesExpression : ruleParenthesesExpression EOF ;
    public final void entryRuleParenthesesExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:986:1: ( ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:987:1: ruleParenthesesExpression EOF
            {
             before(grammarAccess.getParenthesesExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression2038);
            ruleParenthesesExpression();

            state._fsp--;

             after(grammarAccess.getParenthesesExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression2045); 

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
    // $ANTLR end "entryRuleParenthesesExpression"


    // $ANTLR start "ruleParenthesesExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:994:1: ruleParenthesesExpression : ( ( rule__ParenthesesExpression__Group__0 ) ) ;
    public final void ruleParenthesesExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:998:5: ( ( ( rule__ParenthesesExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:999:1: ( ( rule__ParenthesesExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:999:1: ( ( rule__ParenthesesExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1000:1: ( rule__ParenthesesExpression__Group__0 )
            {
             before(grammarAccess.getParenthesesExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1001:1: ( rule__ParenthesesExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1001:2: rule__ParenthesesExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__0_in_ruleParenthesesExpression2075);
            rule__ParenthesesExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesesExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleParenthesesExpression"


    // $ANTLR start "entryRuleType"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1015:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1016:1: ( ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1017:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2104);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2111); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1024:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1028:5: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1029:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1029:1: ( ( rule__Type__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1030:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1031:1: ( rule__Type__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1031:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType2141);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1043:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1044:1: ( rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1045:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType2168);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType2175); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1052:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1056:5: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1057:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1057:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1058:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1059:1: ( rule__PrimitiveType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1059:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType2205);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1071:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1072:1: ( ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1073:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType2232);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType2239); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1080:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1084:5: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1085:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1085:1: ( ( rule__NumericType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1086:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1087:1: ( rule__NumericType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1087:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType2269);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1099:1: entryRuleIntegralType : ruleIntegralType EOF ;
    public final void entryRuleIntegralType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1100:1: ( ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1101:1: ruleIntegralType EOF
            {
             before(grammarAccess.getIntegralTypeRule()); 
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType2296);
            ruleIntegralType();

            state._fsp--;

             after(grammarAccess.getIntegralTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType2303); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1108:1: ruleIntegralType : ( ( rule__IntegralType__Alternatives ) ) ;
    public final void ruleIntegralType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1112:5: ( ( ( rule__IntegralType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1113:1: ( ( rule__IntegralType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1113:1: ( ( rule__IntegralType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1114:1: ( rule__IntegralType__Alternatives )
            {
             before(grammarAccess.getIntegralTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1115:1: ( rule__IntegralType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1115:2: rule__IntegralType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntegralType__Alternatives_in_ruleIntegralType2333);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1127:1: entryRuleFloatingPointType : ruleFloatingPointType EOF ;
    public final void entryRuleFloatingPointType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1128:1: ( ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1129:1: ruleFloatingPointType EOF
            {
             before(grammarAccess.getFloatingPointTypeRule()); 
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType2360);
            ruleFloatingPointType();

            state._fsp--;

             after(grammarAccess.getFloatingPointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType2367); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1136:1: ruleFloatingPointType : ( ( rule__FloatingPointType__Alternatives ) ) ;
    public final void ruleFloatingPointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1140:5: ( ( ( rule__FloatingPointType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1141:1: ( ( rule__FloatingPointType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1141:1: ( ( rule__FloatingPointType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1142:1: ( rule__FloatingPointType__Alternatives )
            {
             before(grammarAccess.getFloatingPointTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1143:1: ( rule__FloatingPointType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1143:2: rule__FloatingPointType__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatingPointType__Alternatives_in_ruleFloatingPointType2397);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1155:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1156:1: ( ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1157:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2424);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral2431); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1164:1: ruleIntegerLiteral : ( RULE_INT ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1168:5: ( ( RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1169:1: ( RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1169:1: ( RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1170:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral2461); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1187:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1188:1: ( ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1189:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2491);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2498); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1196:1: ruleStringLiteral : ( RULE_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1200:5: ( ( RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1201:1: ( RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1201:1: ( RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1202:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2528); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1215:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1216:1: ( ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1217:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2554);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2561); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1224:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1228:5: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1229:1: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1229:1: ( ( rule__BooleanLiteral__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1230:1: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1231:1: ( rule__BooleanLiteral__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1231:2: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral2591);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1243:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1244:1: ( ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1245:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2618);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral2625); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1252:1: ruleNullLiteral : ( KEYWORD_32 ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1256:5: ( ( KEYWORD_32 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1257:1: ( KEYWORD_32 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1257:1: ( KEYWORD_32 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1258:1: KEYWORD_32
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword()); 
            match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleNullLiteral2656); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1273:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1274:1: ( ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1275:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2684);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2691); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1282:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1286:5: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1287:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1287:1: ( ( rule__Literal__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1288:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1289:1: ( rule__Literal__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1289:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2721);
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


    // $ANTLR start "entryRuleQualifiedIdentifier"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1301:1: entryRuleQualifiedIdentifier : ruleQualifiedIdentifier EOF ;
    public final void entryRuleQualifiedIdentifier() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1302:1: ( ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1303:1: ruleQualifiedIdentifier EOF
            {
             before(grammarAccess.getQualifiedIdentifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier2748);
            ruleQualifiedIdentifier();

            state._fsp--;

             after(grammarAccess.getQualifiedIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier2755); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1310:1: ruleQualifiedIdentifier : ( ( rule__QualifiedIdentifier__Group__0 ) ) ;
    public final void ruleQualifiedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1314:5: ( ( ( rule__QualifiedIdentifier__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1315:1: ( ( rule__QualifiedIdentifier__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1315:1: ( ( rule__QualifiedIdentifier__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1316:1: ( rule__QualifiedIdentifier__Group__0 )
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1317:1: ( rule__QualifiedIdentifier__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1317:2: rule__QualifiedIdentifier__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__0_in_ruleQualifiedIdentifier2785);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1329:1: entryRuleCandidateClassName : ruleCandidateClassName EOF ;
    public final void entryRuleCandidateClassName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1330:1: ( ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1331:1: ruleCandidateClassName EOF
            {
             before(grammarAccess.getCandidateClassNameRule()); 
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName2812);
            ruleCandidateClassName();

            state._fsp--;

             after(grammarAccess.getCandidateClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName2819); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1338:1: ruleCandidateClassName : ( ruleQualifiedIdentifier ) ;
    public final void ruleCandidateClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1342:5: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1343:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1343:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1344:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName2849);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1357:1: entryRuleClassOrInterfaceName : ruleClassOrInterfaceName EOF ;
    public final void entryRuleClassOrInterfaceName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1358:1: ( ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1359:1: ruleClassOrInterfaceName EOF
            {
             before(grammarAccess.getClassOrInterfaceNameRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName2875);
            ruleClassOrInterfaceName();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName2882); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1366:1: ruleClassOrInterfaceName : ( ruleQualifiedIdentifier ) ;
    public final void ruleClassOrInterfaceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1370:5: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1371:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1371:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1372:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName2912);
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


    // $ANTLR start "ruleUnaryOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1386:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1390:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1391:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1391:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1392:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1393:1: ( rule__UnaryOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1393:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator2948);
            rule__UnaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleAdditionOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1405:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1409:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1410:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1410:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1411:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1412:1: ( rule__AdditionOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1412:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator2984);
            rule__AdditionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1424:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1428:1: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1429:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1429:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1430:1: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1431:1: ( rule__MultiplicationOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1431:2: rule__MultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicationOperator__Alternatives_in_ruleMultiplicationOperator3020);
            rule__MultiplicationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1443:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1447:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1448:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1448:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1449:1: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1450:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1450:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator3056);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1461:1: rule__ParameterOrFieldOrMethodExpression__Alternatives : ( ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) ) | ( ruleParenthesesExpression ) );
    public final void rule__ParameterOrFieldOrMethodExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1465:1: ( ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) ) | ( ruleParenthesesExpression ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case KEYWORD_39:
            case KEYWORD_32:
            case KEYWORD_34:
            case RULE_INT:
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case KEYWORD_33:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            case KEYWORD_12:
                {
                alt1=4;
                }
                break;
            case KEYWORD_4:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1466:1: ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1466:1: ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1467:1: ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1468:1: ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1468:2: rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3091);
                    rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1472:6: ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1472:6: ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1473:1: ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisAssignment_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1474:1: ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1474:2: rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3109);
                    rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1478:6: ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1478:6: ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1479:1: ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdAssignment_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1480:1: ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1480:2: rule__ParameterOrFieldOrMethodExpression__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__IdAssignment_2_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3127);
                    rule__ParameterOrFieldOrMethodExpression__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1484:6: ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1484:6: ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1485:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getGroup_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1486:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1486:2: rule__ParameterOrFieldOrMethodExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3145);
                    rule__ParameterOrFieldOrMethodExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1490:6: ( ruleParenthesesExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1490:6: ( ruleParenthesesExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1491:1: ruleParenthesesExpression
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3163);
                    ruleParenthesesExpression();

                    state._fsp--;

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__Alternatives"


    // $ANTLR start "rule__FieldOrMethodExpression__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1501:1: rule__FieldOrMethodExpression__Alternatives : ( ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) ) | ( ruleParenthesesExpression ) );
    public final void rule__FieldOrMethodExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1505:1: ( ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) ) | ( ruleParenthesesExpression ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case KEYWORD_39:
            case KEYWORD_32:
            case KEYWORD_34:
            case RULE_INT:
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case KEYWORD_33:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case KEYWORD_4:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1506:1: ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1506:1: ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1507:1: ( rule__FieldOrMethodExpression__LiteralAssignment_0 )
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1508:1: ( rule__FieldOrMethodExpression__LiteralAssignment_0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1508:2: rule__FieldOrMethodExpression__LiteralAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldOrMethodExpression__LiteralAssignment_0_in_rule__FieldOrMethodExpression__Alternatives3195);
                    rule__FieldOrMethodExpression__LiteralAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1512:6: ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1512:6: ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1513:1: ( rule__FieldOrMethodExpression__ThisAssignment_1 )
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getThisAssignment_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1514:1: ( rule__FieldOrMethodExpression__ThisAssignment_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1514:2: rule__FieldOrMethodExpression__ThisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldOrMethodExpression__ThisAssignment_1_in_rule__FieldOrMethodExpression__Alternatives3213);
                    rule__FieldOrMethodExpression__ThisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getThisAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1518:6: ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1518:6: ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1519:1: ( rule__FieldOrMethodExpression__IdAssignment_2 )
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getIdAssignment_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1520:1: ( rule__FieldOrMethodExpression__IdAssignment_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1520:2: rule__FieldOrMethodExpression__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldOrMethodExpression__IdAssignment_2_in_rule__FieldOrMethodExpression__Alternatives3231);
                    rule__FieldOrMethodExpression__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1524:6: ( ruleParenthesesExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1524:6: ( ruleParenthesesExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1525:1: ruleParenthesesExpression
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_rule__FieldOrMethodExpression__Alternatives3249);
                    ruleParenthesesExpression();

                    state._fsp--;

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__FieldOrMethodExpression__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1535:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleClassOrInterfaceName ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1539:1: ( ( rulePrimitiveType ) | ( ruleClassOrInterfaceName ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_47||LA3_0==KEYWORD_44||(LA3_0>=KEYWORD_40 && LA3_0<=KEYWORD_41)||(LA3_0>=KEYWORD_29 && LA3_0<=KEYWORD_31)||LA3_0==KEYWORD_26) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1540:1: ( rulePrimitiveType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1540:1: ( rulePrimitiveType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1541:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives3281);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1546:6: ( ruleClassOrInterfaceName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1546:6: ( ruleClassOrInterfaceName )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1547:1: ruleClassOrInterfaceName
                    {
                     before(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__Type__Alternatives3298);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1557:1: rule__PrimitiveType__Alternatives : ( ( ruleNumericType ) | ( KEYWORD_47 ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1561:1: ( ( ruleNumericType ) | ( KEYWORD_47 ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_44||(LA4_0>=KEYWORD_40 && LA4_0<=KEYWORD_41)||(LA4_0>=KEYWORD_29 && LA4_0<=KEYWORD_31)||LA4_0==KEYWORD_26) ) {
                alt4=1;
            }
            else if ( (LA4_0==KEYWORD_47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1562:1: ( ruleNumericType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1562:1: ( ruleNumericType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1563:1: ruleNumericType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__PrimitiveType__Alternatives3330);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1568:6: ( KEYWORD_47 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1568:6: ( KEYWORD_47 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1569:1: KEYWORD_47
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1()); 
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__PrimitiveType__Alternatives3348); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1581:1: rule__NumericType__Alternatives : ( ( ruleIntegralType ) | ( ruleFloatingPointType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1585:1: ( ( ruleIntegralType ) | ( ruleFloatingPointType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_41||(LA5_0>=KEYWORD_29 && LA5_0<=KEYWORD_31)||LA5_0==KEYWORD_26) ) {
                alt5=1;
            }
            else if ( (LA5_0==KEYWORD_44||LA5_0==KEYWORD_40) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1586:1: ( ruleIntegralType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1586:1: ( ruleIntegralType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1587:1: ruleIntegralType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegralType_in_rule__NumericType__Alternatives3382);
                    ruleIntegralType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1592:6: ( ruleFloatingPointType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1592:6: ( ruleFloatingPointType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1593:1: ruleFloatingPointType
                    {
                     before(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFloatingPointType_in_rule__NumericType__Alternatives3399);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1603:1: rule__IntegralType__Alternatives : ( ( KEYWORD_29 ) | ( KEYWORD_41 ) | ( KEYWORD_26 ) | ( KEYWORD_31 ) | ( KEYWORD_30 ) );
    public final void rule__IntegralType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1607:1: ( ( KEYWORD_29 ) | ( KEYWORD_41 ) | ( KEYWORD_26 ) | ( KEYWORD_31 ) | ( KEYWORD_30 ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt6=1;
                }
                break;
            case KEYWORD_41:
                {
                alt6=2;
                }
                break;
            case KEYWORD_26:
                {
                alt6=3;
                }
                break;
            case KEYWORD_31:
                {
                alt6=4;
                }
                break;
            case KEYWORD_30:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1608:1: ( KEYWORD_29 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1608:1: ( KEYWORD_29 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1609:1: KEYWORD_29
                    {
                     before(grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__IntegralType__Alternatives3432); 
                     after(grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1616:6: ( KEYWORD_41 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1616:6: ( KEYWORD_41 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1617:1: KEYWORD_41
                    {
                     before(grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__IntegralType__Alternatives3452); 
                     after(grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1624:6: ( KEYWORD_26 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1624:6: ( KEYWORD_26 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1625:1: KEYWORD_26
                    {
                     before(grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__IntegralType__Alternatives3472); 
                     after(grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1632:6: ( KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1632:6: ( KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1633:1: KEYWORD_31
                    {
                     before(grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__IntegralType__Alternatives3492); 
                     after(grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1640:6: ( KEYWORD_30 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1640:6: ( KEYWORD_30 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1641:1: KEYWORD_30
                    {
                     before(grammarAccess.getIntegralTypeAccess().getCharKeyword_4()); 
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__IntegralType__Alternatives3512); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1653:1: rule__FloatingPointType__Alternatives : ( ( KEYWORD_40 ) | ( KEYWORD_44 ) );
    public final void rule__FloatingPointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1657:1: ( ( KEYWORD_40 ) | ( KEYWORD_44 ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_40) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1658:1: ( KEYWORD_40 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1658:1: ( KEYWORD_40 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1659:1: KEYWORD_40
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__FloatingPointType__Alternatives3547); 
                     after(grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1666:6: ( KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1666:6: ( KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1667:1: KEYWORD_44
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getDoubleKeyword_1()); 
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__FloatingPointType__Alternatives3567); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1679:1: rule__BooleanLiteral__Alternatives : ( ( KEYWORD_34 ) | ( KEYWORD_39 ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1683:1: ( ( KEYWORD_34 ) | ( KEYWORD_39 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_34) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1684:1: ( KEYWORD_34 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1684:1: ( KEYWORD_34 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1685:1: KEYWORD_34
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__BooleanLiteral__Alternatives3602); 
                     after(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1692:6: ( KEYWORD_39 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1692:6: ( KEYWORD_39 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1693:1: KEYWORD_39
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__BooleanLiteral__Alternatives3622); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1705:1: rule__Literal__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1709:1: ( ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case KEYWORD_39:
            case KEYWORD_34:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case KEYWORD_32:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1710:1: ( ruleIntegerLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1710:1: ( ruleIntegerLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1711:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives3656);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1716:6: ( ruleBooleanLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1716:6: ( ruleBooleanLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1717:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3673);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1722:6: ( ruleStringLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1722:6: ( ruleStringLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1723:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3690);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1728:6: ( ruleNullLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1728:6: ( ruleNullLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1729:1: ruleNullLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives3707);
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


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1739:1: rule__UnaryOperator__Alternatives : ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) | ( ( KEYWORD_17 ) ) | ( ( KEYWORD_1 ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1743:1: ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) | ( ( KEYWORD_17 ) ) | ( ( KEYWORD_1 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt10=1;
                }
                break;
            case KEYWORD_9:
                {
                alt10=2;
                }
                break;
            case KEYWORD_17:
                {
                alt10=3;
                }
                break;
            case KEYWORD_1:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1744:1: ( ( KEYWORD_7 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1744:1: ( ( KEYWORD_7 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1745:1: ( KEYWORD_7 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1746:1: ( KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1746:3: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__UnaryOperator__Alternatives3740); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1751:6: ( ( KEYWORD_9 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1751:6: ( ( KEYWORD_9 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1752:1: ( KEYWORD_9 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1753:1: ( KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1753:3: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__UnaryOperator__Alternatives3760); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1758:6: ( ( KEYWORD_17 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1758:6: ( ( KEYWORD_17 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1759:1: ( KEYWORD_17 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1760:1: ( KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1760:3: KEYWORD_17
                    {
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__UnaryOperator__Alternatives3780); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1765:6: ( ( KEYWORD_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1765:6: ( ( KEYWORD_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1766:1: ( KEYWORD_1 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1767:1: ( KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1767:3: KEYWORD_1
                    {
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__UnaryOperator__Alternatives3800); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1777:1: rule__AdditionOperator__Alternatives : ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1781:1: ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_7) ) {
                alt11=1;
            }
            else if ( (LA11_0==KEYWORD_9) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1782:1: ( ( KEYWORD_7 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1782:1: ( ( KEYWORD_7 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1783:1: ( KEYWORD_7 )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1784:1: ( KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1784:3: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__AdditionOperator__Alternatives3835); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1789:6: ( ( KEYWORD_9 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1789:6: ( ( KEYWORD_9 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1790:1: ( KEYWORD_9 )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1791:1: ( KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1791:3: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__AdditionOperator__Alternatives3855); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AdditionOperator__Alternatives"


    // $ANTLR start "rule__MultiplicationOperator__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1801:1: rule__MultiplicationOperator__Alternatives : ( ( ( KEYWORD_6 ) ) | ( ( KEYWORD_11 ) ) | ( ( KEYWORD_2 ) ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1805:1: ( ( ( KEYWORD_6 ) ) | ( ( KEYWORD_11 ) ) | ( ( KEYWORD_2 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt12=1;
                }
                break;
            case KEYWORD_11:
                {
                alt12=2;
                }
                break;
            case KEYWORD_2:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1806:1: ( ( KEYWORD_6 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1806:1: ( ( KEYWORD_6 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1807:1: ( KEYWORD_6 )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1808:1: ( KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1808:3: KEYWORD_6
                    {
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__MultiplicationOperator__Alternatives3890); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1813:6: ( ( KEYWORD_11 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1813:6: ( ( KEYWORD_11 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1814:1: ( KEYWORD_11 )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1815:1: ( KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1815:3: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__MultiplicationOperator__Alternatives3910); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1820:6: ( ( KEYWORD_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1820:6: ( ( KEYWORD_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1821:1: ( KEYWORD_2 )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getModuloEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1822:1: ( KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1822:3: KEYWORD_2
                    {
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__MultiplicationOperator__Alternatives3930); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getModuloEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__MultiplicationOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1832:1: rule__ComparisonOperator__Alternatives : ( ( ( KEYWORD_14 ) ) | ( ( KEYWORD_15 ) ) | ( ( KEYWORD_20 ) ) | ( ( KEYWORD_22 ) ) | ( ( KEYWORD_21 ) ) | ( ( KEYWORD_18 ) ) | ( ( KEYWORD_52 ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1836:1: ( ( ( KEYWORD_14 ) ) | ( ( KEYWORD_15 ) ) | ( ( KEYWORD_20 ) ) | ( ( KEYWORD_22 ) ) | ( ( KEYWORD_21 ) ) | ( ( KEYWORD_18 ) ) | ( ( KEYWORD_52 ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt13=1;
                }
                break;
            case KEYWORD_15:
                {
                alt13=2;
                }
                break;
            case KEYWORD_20:
                {
                alt13=3;
                }
                break;
            case KEYWORD_22:
                {
                alt13=4;
                }
                break;
            case KEYWORD_21:
                {
                alt13=5;
                }
                break;
            case KEYWORD_18:
                {
                alt13=6;
                }
                break;
            case KEYWORD_52:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1837:1: ( ( KEYWORD_14 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1837:1: ( ( KEYWORD_14 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1838:1: ( KEYWORD_14 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1839:1: ( KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1839:3: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__ComparisonOperator__Alternatives3965); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1844:6: ( ( KEYWORD_15 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1844:6: ( ( KEYWORD_15 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1845:1: ( KEYWORD_15 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1846:1: ( KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1846:3: KEYWORD_15
                    {
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__ComparisonOperator__Alternatives3985); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1851:6: ( ( KEYWORD_20 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1851:6: ( ( KEYWORD_20 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1852:1: ( KEYWORD_20 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1853:1: ( KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1853:3: KEYWORD_20
                    {
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__ComparisonOperator__Alternatives4005); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1858:6: ( ( KEYWORD_22 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1858:6: ( ( KEYWORD_22 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1859:1: ( KEYWORD_22 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1860:1: ( KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1860:3: KEYWORD_22
                    {
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__ComparisonOperator__Alternatives4025); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1865:6: ( ( KEYWORD_21 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1865:6: ( ( KEYWORD_21 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1866:1: ( KEYWORD_21 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1867:1: ( KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1867:3: KEYWORD_21
                    {
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__ComparisonOperator__Alternatives4045); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1872:6: ( ( KEYWORD_18 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1872:6: ( ( KEYWORD_18 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1873:1: ( KEYWORD_18 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1874:1: ( KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1874:3: KEYWORD_18
                    {
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__ComparisonOperator__Alternatives4065); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1879:6: ( ( KEYWORD_52 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1879:6: ( ( KEYWORD_52 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1880:1: ( KEYWORD_52 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getInstanceofEnumLiteralDeclaration_6()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1881:1: ( KEYWORD_52 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1881:3: KEYWORD_52
                    {
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__ComparisonOperator__Alternatives4085); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getInstanceofEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__SingleStringJDOQL__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1893:1: rule__SingleStringJDOQL__Group__0 : rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1 ;
    public final void rule__SingleStringJDOQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1897:1: ( rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1898:2: rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__0__Impl_in_rule__SingleStringJDOQL__Group__04117);
            rule__SingleStringJDOQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__1_in_rule__SingleStringJDOQL__Group__04120);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1905:1: rule__SingleStringJDOQL__Group__0__Impl : ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) ) ;
    public final void rule__SingleStringJDOQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1909:1: ( ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1910:1: ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1910:1: ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1911:1: ( rule__SingleStringJDOQL__SelectClauseAssignment_0 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1912:1: ( rule__SingleStringJDOQL__SelectClauseAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1912:2: rule__SingleStringJDOQL__SelectClauseAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__SelectClauseAssignment_0_in_rule__SingleStringJDOQL__Group__0__Impl4147);
            rule__SingleStringJDOQL__SelectClauseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseAssignment_0()); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1922:1: rule__SingleStringJDOQL__Group__1 : rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2 ;
    public final void rule__SingleStringJDOQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1926:1: ( rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1927:2: rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__1__Impl_in_rule__SingleStringJDOQL__Group__14177);
            rule__SingleStringJDOQL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__2_in_rule__SingleStringJDOQL__Group__14180);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1934:1: rule__SingleStringJDOQL__Group__1__Impl : ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) ) ;
    public final void rule__SingleStringJDOQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1938:1: ( ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1939:1: ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1939:1: ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1940:1: ( rule__SingleStringJDOQL__FromClauseAssignment_1 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getFromClauseAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1941:1: ( rule__SingleStringJDOQL__FromClauseAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1941:2: rule__SingleStringJDOQL__FromClauseAssignment_1
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__FromClauseAssignment_1_in_rule__SingleStringJDOQL__Group__1__Impl4207);
            rule__SingleStringJDOQL__FromClauseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleStringJDOQLAccess().getFromClauseAssignment_1()); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1951:1: rule__SingleStringJDOQL__Group__2 : rule__SingleStringJDOQL__Group__2__Impl rule__SingleStringJDOQL__Group__3 ;
    public final void rule__SingleStringJDOQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1955:1: ( rule__SingleStringJDOQL__Group__2__Impl rule__SingleStringJDOQL__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1956:2: rule__SingleStringJDOQL__Group__2__Impl rule__SingleStringJDOQL__Group__3
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__2__Impl_in_rule__SingleStringJDOQL__Group__24237);
            rule__SingleStringJDOQL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__3_in_rule__SingleStringJDOQL__Group__24240);
            rule__SingleStringJDOQL__Group__3();

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1963:1: rule__SingleStringJDOQL__Group__2__Impl : ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? ) ;
    public final void rule__SingleStringJDOQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1967:1: ( ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1968:1: ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1968:1: ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1969:1: ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1970:1: ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1970:2: rule__SingleStringJDOQL__WhereClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__WhereClauseAssignment_2_in_rule__SingleStringJDOQL__Group__2__Impl4267);
                    rule__SingleStringJDOQL__WhereClauseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseAssignment_2()); 

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


    // $ANTLR start "rule__SingleStringJDOQL__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1980:1: rule__SingleStringJDOQL__Group__3 : rule__SingleStringJDOQL__Group__3__Impl rule__SingleStringJDOQL__Group__4 ;
    public final void rule__SingleStringJDOQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1984:1: ( rule__SingleStringJDOQL__Group__3__Impl rule__SingleStringJDOQL__Group__4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1985:2: rule__SingleStringJDOQL__Group__3__Impl rule__SingleStringJDOQL__Group__4
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__3__Impl_in_rule__SingleStringJDOQL__Group__34298);
            rule__SingleStringJDOQL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__4_in_rule__SingleStringJDOQL__Group__34301);
            rule__SingleStringJDOQL__Group__4();

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__3"


    // $ANTLR start "rule__SingleStringJDOQL__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1992:1: rule__SingleStringJDOQL__Group__3__Impl : ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? ) ;
    public final void rule__SingleStringJDOQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1996:1: ( ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1997:1: ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1997:1: ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1998:1: ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseAssignment_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1999:1: ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1999:2: rule__SingleStringJDOQL__VariablesClauseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__VariablesClauseAssignment_3_in_rule__SingleStringJDOQL__Group__3__Impl4328);
                    rule__SingleStringJDOQL__VariablesClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseAssignment_3()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__3__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__4"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2009:1: rule__SingleStringJDOQL__Group__4 : rule__SingleStringJDOQL__Group__4__Impl rule__SingleStringJDOQL__Group__5 ;
    public final void rule__SingleStringJDOQL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2013:1: ( rule__SingleStringJDOQL__Group__4__Impl rule__SingleStringJDOQL__Group__5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2014:2: rule__SingleStringJDOQL__Group__4__Impl rule__SingleStringJDOQL__Group__5
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__4__Impl_in_rule__SingleStringJDOQL__Group__44359);
            rule__SingleStringJDOQL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__5_in_rule__SingleStringJDOQL__Group__44362);
            rule__SingleStringJDOQL__Group__5();

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__4"


    // $ANTLR start "rule__SingleStringJDOQL__Group__4__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2021:1: rule__SingleStringJDOQL__Group__4__Impl : ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? ) ;
    public final void rule__SingleStringJDOQL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2025:1: ( ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2026:1: ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2026:1: ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2027:1: ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseAssignment_4()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2028:1: ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2028:2: rule__SingleStringJDOQL__ParametersClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__ParametersClauseAssignment_4_in_rule__SingleStringJDOQL__Group__4__Impl4389);
                    rule__SingleStringJDOQL__ParametersClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseAssignment_4()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__4__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__5"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2038:1: rule__SingleStringJDOQL__Group__5 : rule__SingleStringJDOQL__Group__5__Impl rule__SingleStringJDOQL__Group__6 ;
    public final void rule__SingleStringJDOQL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2042:1: ( rule__SingleStringJDOQL__Group__5__Impl rule__SingleStringJDOQL__Group__6 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2043:2: rule__SingleStringJDOQL__Group__5__Impl rule__SingleStringJDOQL__Group__6
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__5__Impl_in_rule__SingleStringJDOQL__Group__54420);
            rule__SingleStringJDOQL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__6_in_rule__SingleStringJDOQL__Group__54423);
            rule__SingleStringJDOQL__Group__6();

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__5"


    // $ANTLR start "rule__SingleStringJDOQL__Group__5__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2050:1: rule__SingleStringJDOQL__Group__5__Impl : ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? ) ;
    public final void rule__SingleStringJDOQL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2054:1: ( ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2055:1: ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2055:1: ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2056:1: ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getImportClauseAssignment_5()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2057:1: ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2057:2: rule__SingleStringJDOQL__ImportClauseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__ImportClauseAssignment_5_in_rule__SingleStringJDOQL__Group__5__Impl4450);
                    rule__SingleStringJDOQL__ImportClauseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getImportClauseAssignment_5()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__5__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__6"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2067:1: rule__SingleStringJDOQL__Group__6 : rule__SingleStringJDOQL__Group__6__Impl rule__SingleStringJDOQL__Group__7 ;
    public final void rule__SingleStringJDOQL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2071:1: ( rule__SingleStringJDOQL__Group__6__Impl rule__SingleStringJDOQL__Group__7 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2072:2: rule__SingleStringJDOQL__Group__6__Impl rule__SingleStringJDOQL__Group__7
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__6__Impl_in_rule__SingleStringJDOQL__Group__64481);
            rule__SingleStringJDOQL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__7_in_rule__SingleStringJDOQL__Group__64484);
            rule__SingleStringJDOQL__Group__7();

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__6"


    // $ANTLR start "rule__SingleStringJDOQL__Group__6__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2079:1: rule__SingleStringJDOQL__Group__6__Impl : ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? ) ;
    public final void rule__SingleStringJDOQL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2083:1: ( ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2084:1: ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2084:1: ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2085:1: ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseAssignment_6()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2086:1: ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2086:2: rule__SingleStringJDOQL__GroupByClauseAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__GroupByClauseAssignment_6_in_rule__SingleStringJDOQL__Group__6__Impl4511);
                    rule__SingleStringJDOQL__GroupByClauseAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseAssignment_6()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__6__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__7"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2096:1: rule__SingleStringJDOQL__Group__7 : rule__SingleStringJDOQL__Group__7__Impl rule__SingleStringJDOQL__Group__8 ;
    public final void rule__SingleStringJDOQL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2100:1: ( rule__SingleStringJDOQL__Group__7__Impl rule__SingleStringJDOQL__Group__8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2101:2: rule__SingleStringJDOQL__Group__7__Impl rule__SingleStringJDOQL__Group__8
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__7__Impl_in_rule__SingleStringJDOQL__Group__74542);
            rule__SingleStringJDOQL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__8_in_rule__SingleStringJDOQL__Group__74545);
            rule__SingleStringJDOQL__Group__8();

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__7"


    // $ANTLR start "rule__SingleStringJDOQL__Group__7__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2108:1: rule__SingleStringJDOQL__Group__7__Impl : ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? ) ;
    public final void rule__SingleStringJDOQL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2112:1: ( ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2113:1: ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2113:1: ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2114:1: ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseAssignment_7()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2115:1: ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2115:2: rule__SingleStringJDOQL__OrderByClauseAssignment_7
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__OrderByClauseAssignment_7_in_rule__SingleStringJDOQL__Group__7__Impl4572);
                    rule__SingleStringJDOQL__OrderByClauseAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseAssignment_7()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__7__Impl"


    // $ANTLR start "rule__SingleStringJDOQL__Group__8"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2125:1: rule__SingleStringJDOQL__Group__8 : rule__SingleStringJDOQL__Group__8__Impl ;
    public final void rule__SingleStringJDOQL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2129:1: ( rule__SingleStringJDOQL__Group__8__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2130:2: rule__SingleStringJDOQL__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__8__Impl_in_rule__SingleStringJDOQL__Group__84603);
            rule__SingleStringJDOQL__Group__8__Impl();

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__8"


    // $ANTLR start "rule__SingleStringJDOQL__Group__8__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2136:1: rule__SingleStringJDOQL__Group__8__Impl : ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? ) ;
    public final void rule__SingleStringJDOQL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2140:1: ( ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2141:1: ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2141:1: ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2142:1: ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseAssignment_8()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2143:1: ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2143:2: rule__SingleStringJDOQL__RangeClauseAssignment_8
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__RangeClauseAssignment_8_in_rule__SingleStringJDOQL__Group__8__Impl4630);
                    rule__SingleStringJDOQL__RangeClauseAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseAssignment_8()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__Group__8__Impl"


    // $ANTLR start "rule__SelectClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2171:1: rule__SelectClause__Group__0 : rule__SelectClause__Group__0__Impl rule__SelectClause__Group__1 ;
    public final void rule__SelectClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2175:1: ( rule__SelectClause__Group__0__Impl rule__SelectClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2176:2: rule__SelectClause__Group__0__Impl rule__SelectClause__Group__1
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__0__Impl_in_rule__SelectClause__Group__04679);
            rule__SelectClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__1_in_rule__SelectClause__Group__04682);
            rule__SelectClause__Group__1();

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
    // $ANTLR end "rule__SelectClause__Group__0"


    // $ANTLR start "rule__SelectClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2183:1: rule__SelectClause__Group__0__Impl : ( () ) ;
    public final void rule__SelectClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2187:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2188:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2188:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2189:1: ()
            {
             before(grammarAccess.getSelectClauseAccess().getSelectClauseAction_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2190:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2192:1: 
            {
            }

             after(grammarAccess.getSelectClauseAccess().getSelectClauseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectClause__Group__0__Impl"


    // $ANTLR start "rule__SelectClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2202:1: rule__SelectClause__Group__1 : rule__SelectClause__Group__1__Impl rule__SelectClause__Group__2 ;
    public final void rule__SelectClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2206:1: ( rule__SelectClause__Group__1__Impl rule__SelectClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2207:2: rule__SelectClause__Group__1__Impl rule__SelectClause__Group__2
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__1__Impl_in_rule__SelectClause__Group__14740);
            rule__SelectClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__2_in_rule__SelectClause__Group__14743);
            rule__SelectClause__Group__2();

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
    // $ANTLR end "rule__SelectClause__Group__1"


    // $ANTLR start "rule__SelectClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2214:1: rule__SelectClause__Group__1__Impl : ( KEYWORD_42 ) ;
    public final void rule__SelectClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2218:1: ( ( KEYWORD_42 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2219:1: ( KEYWORD_42 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2219:1: ( KEYWORD_42 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2220:1: KEYWORD_42
            {
             before(grammarAccess.getSelectClauseAccess().getSELECTKeyword_1()); 
            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__SelectClause__Group__1__Impl4771); 
             after(grammarAccess.getSelectClauseAccess().getSELECTKeyword_1()); 

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
    // $ANTLR end "rule__SelectClause__Group__1__Impl"


    // $ANTLR start "rule__SelectClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2233:1: rule__SelectClause__Group__2 : rule__SelectClause__Group__2__Impl rule__SelectClause__Group__3 ;
    public final void rule__SelectClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2237:1: ( rule__SelectClause__Group__2__Impl rule__SelectClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2238:2: rule__SelectClause__Group__2__Impl rule__SelectClause__Group__3
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__2__Impl_in_rule__SelectClause__Group__24802);
            rule__SelectClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__3_in_rule__SelectClause__Group__24805);
            rule__SelectClause__Group__3();

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
    // $ANTLR end "rule__SelectClause__Group__2"


    // $ANTLR start "rule__SelectClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2245:1: rule__SelectClause__Group__2__Impl : ( ( rule__SelectClause__IsUniqueAssignment_2 )? ) ;
    public final void rule__SelectClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2249:1: ( ( ( rule__SelectClause__IsUniqueAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2250:1: ( ( rule__SelectClause__IsUniqueAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2250:1: ( ( rule__SelectClause__IsUniqueAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2251:1: ( rule__SelectClause__IsUniqueAssignment_2 )?
            {
             before(grammarAccess.getSelectClauseAccess().getIsUniqueAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2252:1: ( rule__SelectClause__IsUniqueAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2252:2: rule__SelectClause__IsUniqueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SelectClause__IsUniqueAssignment_2_in_rule__SelectClause__Group__2__Impl4832);
                    rule__SelectClause__IsUniqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectClauseAccess().getIsUniqueAssignment_2()); 

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
    // $ANTLR end "rule__SelectClause__Group__2__Impl"


    // $ANTLR start "rule__SelectClause__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2262:1: rule__SelectClause__Group__3 : rule__SelectClause__Group__3__Impl rule__SelectClause__Group__4 ;
    public final void rule__SelectClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2266:1: ( rule__SelectClause__Group__3__Impl rule__SelectClause__Group__4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2267:2: rule__SelectClause__Group__3__Impl rule__SelectClause__Group__4
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__3__Impl_in_rule__SelectClause__Group__34863);
            rule__SelectClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__4_in_rule__SelectClause__Group__34866);
            rule__SelectClause__Group__4();

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
    // $ANTLR end "rule__SelectClause__Group__3"


    // $ANTLR start "rule__SelectClause__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2274:1: rule__SelectClause__Group__3__Impl : ( ( rule__SelectClause__ResultClauseAssignment_3 )? ) ;
    public final void rule__SelectClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2278:1: ( ( ( rule__SelectClause__ResultClauseAssignment_3 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2279:1: ( ( rule__SelectClause__ResultClauseAssignment_3 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2279:1: ( ( rule__SelectClause__ResultClauseAssignment_3 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2280:1: ( rule__SelectClause__ResultClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectClauseAccess().getResultClauseAssignment_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2281:1: ( rule__SelectClause__ResultClauseAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_48||LA22_0==KEYWORD_39||(LA22_0>=KEYWORD_32 && LA22_0<=KEYWORD_34)||LA22_0==KEYWORD_1||LA22_0==KEYWORD_4||LA22_0==KEYWORD_7||LA22_0==KEYWORD_9||LA22_0==KEYWORD_12||(LA22_0>=KEYWORD_17 && LA22_0<=RULE_STRING)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2281:2: rule__SelectClause__ResultClauseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SelectClause__ResultClauseAssignment_3_in_rule__SelectClause__Group__3__Impl4893);
                    rule__SelectClause__ResultClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectClauseAccess().getResultClauseAssignment_3()); 

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
    // $ANTLR end "rule__SelectClause__Group__3__Impl"


    // $ANTLR start "rule__SelectClause__Group__4"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2291:1: rule__SelectClause__Group__4 : rule__SelectClause__Group__4__Impl ;
    public final void rule__SelectClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2295:1: ( rule__SelectClause__Group__4__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2296:2: rule__SelectClause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__4__Impl_in_rule__SelectClause__Group__44924);
            rule__SelectClause__Group__4__Impl();

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
    // $ANTLR end "rule__SelectClause__Group__4"


    // $ANTLR start "rule__SelectClause__Group__4__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2302:1: rule__SelectClause__Group__4__Impl : ( ( rule__SelectClause__IntoClauseAssignment_4 )? ) ;
    public final void rule__SelectClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2306:1: ( ( ( rule__SelectClause__IntoClauseAssignment_4 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2307:1: ( ( rule__SelectClause__IntoClauseAssignment_4 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2307:1: ( ( rule__SelectClause__IntoClauseAssignment_4 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2308:1: ( rule__SelectClause__IntoClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectClauseAccess().getIntoClauseAssignment_4()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2309:1: ( rule__SelectClause__IntoClauseAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2309:2: rule__SelectClause__IntoClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SelectClause__IntoClauseAssignment_4_in_rule__SelectClause__Group__4__Impl4951);
                    rule__SelectClause__IntoClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectClauseAccess().getIntoClauseAssignment_4()); 

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
    // $ANTLR end "rule__SelectClause__Group__4__Impl"


    // $ANTLR start "rule__ResultClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2329:1: rule__ResultClause__Group__0 : rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1 ;
    public final void rule__ResultClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2333:1: ( rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2334:2: rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__0__Impl_in_rule__ResultClause__Group__04992);
            rule__ResultClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group__1_in_rule__ResultClause__Group__04995);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2341:1: rule__ResultClause__Group__0__Impl : ( ( rule__ResultClause__IsDistinctAssignment_0 )? ) ;
    public final void rule__ResultClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2345:1: ( ( ( rule__ResultClause__IsDistinctAssignment_0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2346:1: ( ( rule__ResultClause__IsDistinctAssignment_0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2346:1: ( ( rule__ResultClause__IsDistinctAssignment_0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2347:1: ( rule__ResultClause__IsDistinctAssignment_0 )?
            {
             before(grammarAccess.getResultClauseAccess().getIsDistinctAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2348:1: ( rule__ResultClause__IsDistinctAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2348:2: rule__ResultClause__IsDistinctAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ResultClause__IsDistinctAssignment_0_in_rule__ResultClause__Group__0__Impl5022);
                    rule__ResultClause__IsDistinctAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResultClauseAccess().getIsDistinctAssignment_0()); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2358:1: rule__ResultClause__Group__1 : rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2 ;
    public final void rule__ResultClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2362:1: ( rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2363:2: rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__1__Impl_in_rule__ResultClause__Group__15053);
            rule__ResultClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group__2_in_rule__ResultClause__Group__15056);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2370:1: rule__ResultClause__Group__1__Impl : ( ( rule__ResultClause__ResultSpecsAssignment_1 ) ) ;
    public final void rule__ResultClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2374:1: ( ( ( rule__ResultClause__ResultSpecsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2375:1: ( ( rule__ResultClause__ResultSpecsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2375:1: ( ( rule__ResultClause__ResultSpecsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2376:1: ( rule__ResultClause__ResultSpecsAssignment_1 )
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2377:1: ( rule__ResultClause__ResultSpecsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2377:2: rule__ResultClause__ResultSpecsAssignment_1
            {
            pushFollow(FOLLOW_rule__ResultClause__ResultSpecsAssignment_1_in_rule__ResultClause__Group__1__Impl5083);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2387:1: rule__ResultClause__Group__2 : rule__ResultClause__Group__2__Impl ;
    public final void rule__ResultClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2391:1: ( rule__ResultClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2392:2: rule__ResultClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__2__Impl_in_rule__ResultClause__Group__25113);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2398:1: rule__ResultClause__Group__2__Impl : ( ( rule__ResultClause__Group_2__0 )* ) ;
    public final void rule__ResultClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2402:1: ( ( ( rule__ResultClause__Group_2__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2403:1: ( ( rule__ResultClause__Group_2__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2403:1: ( ( rule__ResultClause__Group_2__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2404:1: ( rule__ResultClause__Group_2__0 )*
            {
             before(grammarAccess.getResultClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2405:1: ( rule__ResultClause__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==KEYWORD_8) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2405:2: rule__ResultClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ResultClause__Group_2__0_in_rule__ResultClause__Group__2__Impl5140);
            	    rule__ResultClause__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getResultClauseAccess().getGroup_2()); 

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


    // $ANTLR start "rule__ResultClause__Group_2__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2421:1: rule__ResultClause__Group_2__0 : rule__ResultClause__Group_2__0__Impl rule__ResultClause__Group_2__1 ;
    public final void rule__ResultClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2425:1: ( rule__ResultClause__Group_2__0__Impl rule__ResultClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2426:2: rule__ResultClause__Group_2__0__Impl rule__ResultClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResultClause__Group_2__0__Impl_in_rule__ResultClause__Group_2__05177);
            rule__ResultClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group_2__1_in_rule__ResultClause__Group_2__05180);
            rule__ResultClause__Group_2__1();

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
    // $ANTLR end "rule__ResultClause__Group_2__0"


    // $ANTLR start "rule__ResultClause__Group_2__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2433:1: rule__ResultClause__Group_2__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__ResultClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2437:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2438:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2438:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2439:1: KEYWORD_8
            {
             before(grammarAccess.getResultClauseAccess().getCommaKeyword_2_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ResultClause__Group_2__0__Impl5208); 
             after(grammarAccess.getResultClauseAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ResultClause__Group_2__0__Impl"


    // $ANTLR start "rule__ResultClause__Group_2__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2452:1: rule__ResultClause__Group_2__1 : rule__ResultClause__Group_2__1__Impl ;
    public final void rule__ResultClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2456:1: ( rule__ResultClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2457:2: rule__ResultClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultClause__Group_2__1__Impl_in_rule__ResultClause__Group_2__15239);
            rule__ResultClause__Group_2__1__Impl();

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
    // $ANTLR end "rule__ResultClause__Group_2__1"


    // $ANTLR start "rule__ResultClause__Group_2__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2463:1: rule__ResultClause__Group_2__1__Impl : ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) ) ;
    public final void rule__ResultClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2467:1: ( ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2468:1: ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2468:1: ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2469:1: ( rule__ResultClause__ResultSpecsAssignment_2_1 )
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_2_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2470:1: ( rule__ResultClause__ResultSpecsAssignment_2_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2470:2: rule__ResultClause__ResultSpecsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResultClause__ResultSpecsAssignment_2_1_in_rule__ResultClause__Group_2__1__Impl5266);
            rule__ResultClause__ResultSpecsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_2_1()); 

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
    // $ANTLR end "rule__ResultClause__Group_2__1__Impl"


    // $ANTLR start "rule__IntoClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2484:1: rule__IntoClause__Group__0 : rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1 ;
    public final void rule__IntoClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2488:1: ( rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2489:2: rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__0__Impl_in_rule__IntoClause__Group__05300);
            rule__IntoClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntoClause__Group__1_in_rule__IntoClause__Group__05303);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2496:1: rule__IntoClause__Group__0__Impl : ( KEYWORD_28 ) ;
    public final void rule__IntoClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2500:1: ( ( KEYWORD_28 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2501:1: ( KEYWORD_28 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2501:1: ( KEYWORD_28 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2502:1: KEYWORD_28
            {
             before(grammarAccess.getIntoClauseAccess().getINTOKeyword_0()); 
            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__IntoClause__Group__0__Impl5331); 
             after(grammarAccess.getIntoClauseAccess().getINTOKeyword_0()); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2515:1: rule__IntoClause__Group__1 : rule__IntoClause__Group__1__Impl ;
    public final void rule__IntoClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2519:1: ( rule__IntoClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2520:2: rule__IntoClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__1__Impl_in_rule__IntoClause__Group__15362);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2526:1: rule__IntoClause__Group__1__Impl : ( ( rule__IntoClause__ResultClassNameAssignment_1 ) ) ;
    public final void rule__IntoClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2530:1: ( ( ( rule__IntoClause__ResultClassNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2531:1: ( ( rule__IntoClause__ResultClassNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2531:1: ( ( rule__IntoClause__ResultClassNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2532:1: ( rule__IntoClause__ResultClassNameAssignment_1 )
            {
             before(grammarAccess.getIntoClauseAccess().getResultClassNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2533:1: ( rule__IntoClause__ResultClassNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2533:2: rule__IntoClause__ResultClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__IntoClause__ResultClassNameAssignment_1_in_rule__IntoClause__Group__1__Impl5389);
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


    // $ANTLR start "rule__ResultSpec__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2547:1: rule__ResultSpec__Group__0 : rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1 ;
    public final void rule__ResultSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2551:1: ( rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2552:2: rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__0__Impl_in_rule__ResultSpec__Group__05423);
            rule__ResultSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultSpec__Group__1_in_rule__ResultSpec__Group__05426);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2559:1: rule__ResultSpec__Group__0__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__ResultSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2563:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2564:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2564:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2565:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getResultSpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__ResultSpec__Group__0__Impl5453);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getResultSpecAccess().getConditionalOrExpressionParserRuleCall_0()); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2576:1: rule__ResultSpec__Group__1 : rule__ResultSpec__Group__1__Impl ;
    public final void rule__ResultSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2580:1: ( rule__ResultSpec__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2581:2: rule__ResultSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__1__Impl_in_rule__ResultSpec__Group__15482);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2587:1: rule__ResultSpec__Group__1__Impl : ( ( rule__ResultSpec__ResultNamingAssignment_1 )? ) ;
    public final void rule__ResultSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2591:1: ( ( ( rule__ResultSpec__ResultNamingAssignment_1 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2592:1: ( ( rule__ResultSpec__ResultNamingAssignment_1 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2592:1: ( ( rule__ResultSpec__ResultNamingAssignment_1 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2593:1: ( rule__ResultSpec__ResultNamingAssignment_1 )?
            {
             before(grammarAccess.getResultSpecAccess().getResultNamingAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2594:1: ( rule__ResultSpec__ResultNamingAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2594:2: rule__ResultSpec__ResultNamingAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ResultSpec__ResultNamingAssignment_1_in_rule__ResultSpec__Group__1__Impl5509);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2608:1: rule__ResultNaming__Group__0 : rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1 ;
    public final void rule__ResultNaming__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2612:1: ( rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2613:2: rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__0__Impl_in_rule__ResultNaming__Group__05544);
            rule__ResultNaming__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultNaming__Group__1_in_rule__ResultNaming__Group__05547);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2620:1: rule__ResultNaming__Group__0__Impl : ( KEYWORD_23 ) ;
    public final void rule__ResultNaming__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2624:1: ( ( KEYWORD_23 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2625:1: ( KEYWORD_23 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2625:1: ( KEYWORD_23 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2626:1: KEYWORD_23
            {
             before(grammarAccess.getResultNamingAccess().getASKeyword_0()); 
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__ResultNaming__Group__0__Impl5575); 
             after(grammarAccess.getResultNamingAccess().getASKeyword_0()); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2639:1: rule__ResultNaming__Group__1 : rule__ResultNaming__Group__1__Impl ;
    public final void rule__ResultNaming__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2643:1: ( rule__ResultNaming__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2644:2: rule__ResultNaming__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__1__Impl_in_rule__ResultNaming__Group__15606);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2650:1: rule__ResultNaming__Group__1__Impl : ( ( rule__ResultNaming__IdentifierAssignment_1 ) ) ;
    public final void rule__ResultNaming__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2654:1: ( ( ( rule__ResultNaming__IdentifierAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2655:1: ( ( rule__ResultNaming__IdentifierAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2655:1: ( ( rule__ResultNaming__IdentifierAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2656:1: ( rule__ResultNaming__IdentifierAssignment_1 )
            {
             before(grammarAccess.getResultNamingAccess().getIdentifierAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2657:1: ( rule__ResultNaming__IdentifierAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2657:2: rule__ResultNaming__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__ResultNaming__IdentifierAssignment_1_in_rule__ResultNaming__Group__1__Impl5633);
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


    // $ANTLR start "rule__FromClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2671:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2675:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2676:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
            {
            pushFollow(FOLLOW_rule__FromClause__Group__0__Impl_in_rule__FromClause__Group__05667);
            rule__FromClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FromClause__Group__1_in_rule__FromClause__Group__05670);
            rule__FromClause__Group__1();

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
    // $ANTLR end "rule__FromClause__Group__0"


    // $ANTLR start "rule__FromClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2683:1: rule__FromClause__Group__0__Impl : ( KEYWORD_27 ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2687:1: ( ( KEYWORD_27 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2688:1: ( KEYWORD_27 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2688:1: ( KEYWORD_27 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2689:1: KEYWORD_27
            {
             before(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__FromClause__Group__0__Impl5698); 
             after(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 

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
    // $ANTLR end "rule__FromClause__Group__0__Impl"


    // $ANTLR start "rule__FromClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2702:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl rule__FromClause__Group__2 ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2706:1: ( rule__FromClause__Group__1__Impl rule__FromClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2707:2: rule__FromClause__Group__1__Impl rule__FromClause__Group__2
            {
            pushFollow(FOLLOW_rule__FromClause__Group__1__Impl_in_rule__FromClause__Group__15729);
            rule__FromClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FromClause__Group__2_in_rule__FromClause__Group__15732);
            rule__FromClause__Group__2();

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
    // $ANTLR end "rule__FromClause__Group__1"


    // $ANTLR start "rule__FromClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2714:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__CandidateClassNameAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2718:1: ( ( ( rule__FromClause__CandidateClassNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2719:1: ( ( rule__FromClause__CandidateClassNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2719:1: ( ( rule__FromClause__CandidateClassNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2720:1: ( rule__FromClause__CandidateClassNameAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getCandidateClassNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2721:1: ( rule__FromClause__CandidateClassNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2721:2: rule__FromClause__CandidateClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__FromClause__CandidateClassNameAssignment_1_in_rule__FromClause__Group__1__Impl5759);
            rule__FromClause__CandidateClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getCandidateClassNameAssignment_1()); 

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
    // $ANTLR end "rule__FromClause__Group__1__Impl"


    // $ANTLR start "rule__FromClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2731:1: rule__FromClause__Group__2 : rule__FromClause__Group__2__Impl ;
    public final void rule__FromClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2735:1: ( rule__FromClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2736:2: rule__FromClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FromClause__Group__2__Impl_in_rule__FromClause__Group__25789);
            rule__FromClause__Group__2__Impl();

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
    // $ANTLR end "rule__FromClause__Group__2"


    // $ANTLR start "rule__FromClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2742:1: rule__FromClause__Group__2__Impl : ( ( rule__FromClause__Group_2__0 )? ) ;
    public final void rule__FromClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2746:1: ( ( ( rule__FromClause__Group_2__0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2747:1: ( ( rule__FromClause__Group_2__0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2747:1: ( ( rule__FromClause__Group_2__0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2748:1: ( rule__FromClause__Group_2__0 )?
            {
             before(grammarAccess.getFromClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2749:1: ( rule__FromClause__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2749:2: rule__FromClause__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FromClause__Group_2__0_in_rule__FromClause__Group__2__Impl5816);
                    rule__FromClause__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromClauseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FromClause__Group__2__Impl"


    // $ANTLR start "rule__FromClause__Group_2__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2765:1: rule__FromClause__Group_2__0 : rule__FromClause__Group_2__0__Impl rule__FromClause__Group_2__1 ;
    public final void rule__FromClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2769:1: ( rule__FromClause__Group_2__0__Impl rule__FromClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2770:2: rule__FromClause__Group_2__0__Impl rule__FromClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__FromClause__Group_2__0__Impl_in_rule__FromClause__Group_2__05853);
            rule__FromClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FromClause__Group_2__1_in_rule__FromClause__Group_2__05856);
            rule__FromClause__Group_2__1();

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
    // $ANTLR end "rule__FromClause__Group_2__0"


    // $ANTLR start "rule__FromClause__Group_2__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2777:1: rule__FromClause__Group_2__0__Impl : ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) ) ;
    public final void rule__FromClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2781:1: ( ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2782:1: ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2782:1: ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2783:1: ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 )
            {
             before(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesAssignment_2_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2784:1: ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2784:2: rule__FromClause__IsExcludeSubclassesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FromClause__IsExcludeSubclassesAssignment_2_0_in_rule__FromClause__Group_2__0__Impl5883);
            rule__FromClause__IsExcludeSubclassesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesAssignment_2_0()); 

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
    // $ANTLR end "rule__FromClause__Group_2__0__Impl"


    // $ANTLR start "rule__FromClause__Group_2__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2794:1: rule__FromClause__Group_2__1 : rule__FromClause__Group_2__1__Impl ;
    public final void rule__FromClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2798:1: ( rule__FromClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2799:2: rule__FromClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FromClause__Group_2__1__Impl_in_rule__FromClause__Group_2__15913);
            rule__FromClause__Group_2__1__Impl();

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
    // $ANTLR end "rule__FromClause__Group_2__1"


    // $ANTLR start "rule__FromClause__Group_2__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2805:1: rule__FromClause__Group_2__1__Impl : ( KEYWORD_51 ) ;
    public final void rule__FromClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2809:1: ( ( KEYWORD_51 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2810:1: ( KEYWORD_51 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2810:1: ( KEYWORD_51 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2811:1: KEYWORD_51
            {
             before(grammarAccess.getFromClauseAccess().getSUBCLASSESKeyword_2_1()); 
            match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__FromClause__Group_2__1__Impl5941); 
             after(grammarAccess.getFromClauseAccess().getSUBCLASSESKeyword_2_1()); 

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
    // $ANTLR end "rule__FromClause__Group_2__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2828:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2832:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2833:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_rule__WhereClause__Group__0__Impl_in_rule__WhereClause__Group__05976);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereClause__Group__1_in_rule__WhereClause__Group__05979);
            rule__WhereClause__Group__1();

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
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2840:1: rule__WhereClause__Group__0__Impl : ( KEYWORD_38 ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2844:1: ( ( KEYWORD_38 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2845:1: ( KEYWORD_38 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2845:1: ( KEYWORD_38 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2846:1: KEYWORD_38
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__WhereClause__Group__0__Impl6007); 
             after(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 

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
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2859:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2863:1: ( rule__WhereClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2864:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereClause__Group__1__Impl_in_rule__WhereClause__Group__16038);
            rule__WhereClause__Group__1__Impl();

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
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2870:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__FilterAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2874:1: ( ( ( rule__WhereClause__FilterAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2875:1: ( ( rule__WhereClause__FilterAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2875:1: ( ( rule__WhereClause__FilterAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2876:1: ( rule__WhereClause__FilterAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getFilterAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2877:1: ( rule__WhereClause__FilterAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2877:2: rule__WhereClause__FilterAssignment_1
            {
            pushFollow(FOLLOW_rule__WhereClause__FilterAssignment_1_in_rule__WhereClause__Group__1__Impl6065);
            rule__WhereClause__FilterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getFilterAssignment_1()); 

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
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__VariablesClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2891:1: rule__VariablesClause__Group__0 : rule__VariablesClause__Group__0__Impl rule__VariablesClause__Group__1 ;
    public final void rule__VariablesClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2895:1: ( rule__VariablesClause__Group__0__Impl rule__VariablesClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2896:2: rule__VariablesClause__Group__0__Impl rule__VariablesClause__Group__1
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__0__Impl_in_rule__VariablesClause__Group__06099);
            rule__VariablesClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group__1_in_rule__VariablesClause__Group__06102);
            rule__VariablesClause__Group__1();

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
    // $ANTLR end "rule__VariablesClause__Group__0"


    // $ANTLR start "rule__VariablesClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2903:1: rule__VariablesClause__Group__0__Impl : ( KEYWORD_49 ) ;
    public final void rule__VariablesClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2907:1: ( ( KEYWORD_49 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2908:1: ( KEYWORD_49 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2908:1: ( KEYWORD_49 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2909:1: KEYWORD_49
            {
             before(grammarAccess.getVariablesClauseAccess().getVARIABLESKeyword_0()); 
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__VariablesClause__Group__0__Impl6130); 
             after(grammarAccess.getVariablesClauseAccess().getVARIABLESKeyword_0()); 

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
    // $ANTLR end "rule__VariablesClause__Group__0__Impl"


    // $ANTLR start "rule__VariablesClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2922:1: rule__VariablesClause__Group__1 : rule__VariablesClause__Group__1__Impl rule__VariablesClause__Group__2 ;
    public final void rule__VariablesClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2926:1: ( rule__VariablesClause__Group__1__Impl rule__VariablesClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2927:2: rule__VariablesClause__Group__1__Impl rule__VariablesClause__Group__2
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__1__Impl_in_rule__VariablesClause__Group__16161);
            rule__VariablesClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group__2_in_rule__VariablesClause__Group__16164);
            rule__VariablesClause__Group__2();

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
    // $ANTLR end "rule__VariablesClause__Group__1"


    // $ANTLR start "rule__VariablesClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2934:1: rule__VariablesClause__Group__1__Impl : ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) ) ;
    public final void rule__VariablesClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2938:1: ( ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2939:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2939:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2940:1: ( rule__VariablesClause__VariableDeclarationsAssignment_1 )
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2941:1: ( rule__VariablesClause__VariableDeclarationsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2941:2: rule__VariablesClause__VariableDeclarationsAssignment_1
            {
            pushFollow(FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_1_in_rule__VariablesClause__Group__1__Impl6191);
            rule__VariablesClause__VariableDeclarationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsAssignment_1()); 

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
    // $ANTLR end "rule__VariablesClause__Group__1__Impl"


    // $ANTLR start "rule__VariablesClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2951:1: rule__VariablesClause__Group__2 : rule__VariablesClause__Group__2__Impl rule__VariablesClause__Group__3 ;
    public final void rule__VariablesClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2955:1: ( rule__VariablesClause__Group__2__Impl rule__VariablesClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2956:2: rule__VariablesClause__Group__2__Impl rule__VariablesClause__Group__3
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__2__Impl_in_rule__VariablesClause__Group__26221);
            rule__VariablesClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group__3_in_rule__VariablesClause__Group__26224);
            rule__VariablesClause__Group__3();

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
    // $ANTLR end "rule__VariablesClause__Group__2"


    // $ANTLR start "rule__VariablesClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2963:1: rule__VariablesClause__Group__2__Impl : ( ( rule__VariablesClause__Group_2__0 )* ) ;
    public final void rule__VariablesClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2967:1: ( ( ( rule__VariablesClause__Group_2__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2968:1: ( ( rule__VariablesClause__Group_2__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2968:1: ( ( rule__VariablesClause__Group_2__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2969:1: ( rule__VariablesClause__Group_2__0 )*
            {
             before(grammarAccess.getVariablesClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2970:1: ( rule__VariablesClause__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_13) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==KEYWORD_47||LA28_1==KEYWORD_44||(LA28_1>=KEYWORD_40 && LA28_1<=KEYWORD_41)||(LA28_1>=KEYWORD_29 && LA28_1<=KEYWORD_31)||LA28_1==KEYWORD_26||LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2970:2: rule__VariablesClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariablesClause__Group_2__0_in_rule__VariablesClause__Group__2__Impl6251);
            	    rule__VariablesClause__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getVariablesClauseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VariablesClause__Group__2__Impl"


    // $ANTLR start "rule__VariablesClause__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2980:1: rule__VariablesClause__Group__3 : rule__VariablesClause__Group__3__Impl ;
    public final void rule__VariablesClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2984:1: ( rule__VariablesClause__Group__3__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2985:2: rule__VariablesClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__3__Impl_in_rule__VariablesClause__Group__36282);
            rule__VariablesClause__Group__3__Impl();

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
    // $ANTLR end "rule__VariablesClause__Group__3"


    // $ANTLR start "rule__VariablesClause__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2991:1: rule__VariablesClause__Group__3__Impl : ( ( KEYWORD_13 )? ) ;
    public final void rule__VariablesClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2995:1: ( ( ( KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2996:1: ( ( KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2996:1: ( ( KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2997:1: ( KEYWORD_13 )?
            {
             before(grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2998:1: ( KEYWORD_13 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2999:2: KEYWORD_13
                    {
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group__3__Impl6311); 

                    }
                    break;

            }

             after(grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__VariablesClause__Group__3__Impl"


    // $ANTLR start "rule__VariablesClause__Group_2__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3018:1: rule__VariablesClause__Group_2__0 : rule__VariablesClause__Group_2__0__Impl rule__VariablesClause__Group_2__1 ;
    public final void rule__VariablesClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3022:1: ( rule__VariablesClause__Group_2__0__Impl rule__VariablesClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3023:2: rule__VariablesClause__Group_2__0__Impl rule__VariablesClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group_2__0__Impl_in_rule__VariablesClause__Group_2__06352);
            rule__VariablesClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group_2__1_in_rule__VariablesClause__Group_2__06355);
            rule__VariablesClause__Group_2__1();

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
    // $ANTLR end "rule__VariablesClause__Group_2__0"


    // $ANTLR start "rule__VariablesClause__Group_2__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3030:1: rule__VariablesClause__Group_2__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__VariablesClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3034:1: ( ( KEYWORD_13 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3035:1: ( KEYWORD_13 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3035:1: ( KEYWORD_13 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3036:1: KEYWORD_13
            {
             before(grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_2_0()); 
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group_2__0__Impl6383); 
             after(grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_2_0()); 

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
    // $ANTLR end "rule__VariablesClause__Group_2__0__Impl"


    // $ANTLR start "rule__VariablesClause__Group_2__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3049:1: rule__VariablesClause__Group_2__1 : rule__VariablesClause__Group_2__1__Impl ;
    public final void rule__VariablesClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3053:1: ( rule__VariablesClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3054:2: rule__VariablesClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group_2__1__Impl_in_rule__VariablesClause__Group_2__16414);
            rule__VariablesClause__Group_2__1__Impl();

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
    // $ANTLR end "rule__VariablesClause__Group_2__1"


    // $ANTLR start "rule__VariablesClause__Group_2__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3060:1: rule__VariablesClause__Group_2__1__Impl : ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) ) ;
    public final void rule__VariablesClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3064:1: ( ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3065:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3065:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3066:1: ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsAssignment_2_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3067:1: ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3067:2: rule__VariablesClause__VariableDeclarationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_2_1_in_rule__VariablesClause__Group_2__1__Impl6441);
            rule__VariablesClause__VariableDeclarationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsAssignment_2_1()); 

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
    // $ANTLR end "rule__VariablesClause__Group_2__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3081:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3085:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3086:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__06475);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__06478);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3093:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3097:1: ( ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3098:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3098:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3099:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3100:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3100:2: rule__VariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl6505);
            rule__VariableDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3110:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3114:1: ( rule__VariableDeclaration__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3115:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__16535);
            rule__VariableDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3121:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3125:1: ( ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3126:1: ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3126:1: ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3127:1: ( rule__VariableDeclaration__VariableNameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3128:1: ( rule__VariableDeclaration__VariableNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3128:2: rule__VariableDeclaration__VariableNameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__VariableNameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl6562);
            rule__VariableDeclaration__VariableNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getVariableNameAssignment_1()); 

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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ParametersClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3142:1: rule__ParametersClause__Group__0 : rule__ParametersClause__Group__0__Impl rule__ParametersClause__Group__1 ;
    public final void rule__ParametersClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3146:1: ( rule__ParametersClause__Group__0__Impl rule__ParametersClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3147:2: rule__ParametersClause__Group__0__Impl rule__ParametersClause__Group__1
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__0__Impl_in_rule__ParametersClause__Group__06596);
            rule__ParametersClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group__1_in_rule__ParametersClause__Group__06599);
            rule__ParametersClause__Group__1();

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
    // $ANTLR end "rule__ParametersClause__Group__0"


    // $ANTLR start "rule__ParametersClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3154:1: rule__ParametersClause__Group__0__Impl : ( KEYWORD_50 ) ;
    public final void rule__ParametersClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3158:1: ( ( KEYWORD_50 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3159:1: ( KEYWORD_50 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3159:1: ( KEYWORD_50 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3160:1: KEYWORD_50
            {
             before(grammarAccess.getParametersClauseAccess().getPARAMETERSKeyword_0()); 
            match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__ParametersClause__Group__0__Impl6627); 
             after(grammarAccess.getParametersClauseAccess().getPARAMETERSKeyword_0()); 

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
    // $ANTLR end "rule__ParametersClause__Group__0__Impl"


    // $ANTLR start "rule__ParametersClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3173:1: rule__ParametersClause__Group__1 : rule__ParametersClause__Group__1__Impl rule__ParametersClause__Group__2 ;
    public final void rule__ParametersClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3177:1: ( rule__ParametersClause__Group__1__Impl rule__ParametersClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3178:2: rule__ParametersClause__Group__1__Impl rule__ParametersClause__Group__2
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__1__Impl_in_rule__ParametersClause__Group__16658);
            rule__ParametersClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group__2_in_rule__ParametersClause__Group__16661);
            rule__ParametersClause__Group__2();

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
    // $ANTLR end "rule__ParametersClause__Group__1"


    // $ANTLR start "rule__ParametersClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3185:1: rule__ParametersClause__Group__1__Impl : ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) ) ;
    public final void rule__ParametersClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3189:1: ( ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3190:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3190:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3191:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_1 )
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3192:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3192:2: rule__ParametersClause__ParameterDeclarationsAssignment_1
            {
            pushFollow(FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_1_in_rule__ParametersClause__Group__1__Impl6688);
            rule__ParametersClause__ParameterDeclarationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametersClauseAccess().getParameterDeclarationsAssignment_1()); 

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
    // $ANTLR end "rule__ParametersClause__Group__1__Impl"


    // $ANTLR start "rule__ParametersClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3202:1: rule__ParametersClause__Group__2 : rule__ParametersClause__Group__2__Impl rule__ParametersClause__Group__3 ;
    public final void rule__ParametersClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3206:1: ( rule__ParametersClause__Group__2__Impl rule__ParametersClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3207:2: rule__ParametersClause__Group__2__Impl rule__ParametersClause__Group__3
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__2__Impl_in_rule__ParametersClause__Group__26718);
            rule__ParametersClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group__3_in_rule__ParametersClause__Group__26721);
            rule__ParametersClause__Group__3();

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
    // $ANTLR end "rule__ParametersClause__Group__2"


    // $ANTLR start "rule__ParametersClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3214:1: rule__ParametersClause__Group__2__Impl : ( ( rule__ParametersClause__Group_2__0 )* ) ;
    public final void rule__ParametersClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3218:1: ( ( ( rule__ParametersClause__Group_2__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3219:1: ( ( rule__ParametersClause__Group_2__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3219:1: ( ( rule__ParametersClause__Group_2__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3220:1: ( rule__ParametersClause__Group_2__0 )*
            {
             before(grammarAccess.getParametersClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3221:1: ( rule__ParametersClause__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==KEYWORD_8) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==KEYWORD_47||LA30_1==KEYWORD_44||(LA30_1>=KEYWORD_40 && LA30_1<=KEYWORD_41)||(LA30_1>=KEYWORD_29 && LA30_1<=KEYWORD_31)||LA30_1==KEYWORD_26||LA30_1==RULE_ID) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3221:2: rule__ParametersClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ParametersClause__Group_2__0_in_rule__ParametersClause__Group__2__Impl6748);
            	    rule__ParametersClause__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getParametersClauseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ParametersClause__Group__2__Impl"


    // $ANTLR start "rule__ParametersClause__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3231:1: rule__ParametersClause__Group__3 : rule__ParametersClause__Group__3__Impl ;
    public final void rule__ParametersClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3235:1: ( rule__ParametersClause__Group__3__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3236:2: rule__ParametersClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__3__Impl_in_rule__ParametersClause__Group__36779);
            rule__ParametersClause__Group__3__Impl();

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
    // $ANTLR end "rule__ParametersClause__Group__3"


    // $ANTLR start "rule__ParametersClause__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3242:1: rule__ParametersClause__Group__3__Impl : ( ( KEYWORD_8 )? ) ;
    public final void rule__ParametersClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3246:1: ( ( ( KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3247:1: ( ( KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3247:1: ( ( KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3248:1: ( KEYWORD_8 )?
            {
             before(grammarAccess.getParametersClauseAccess().getCommaKeyword_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3249:1: ( KEYWORD_8 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_8) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3250:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group__3__Impl6808); 

                    }
                    break;

            }

             after(grammarAccess.getParametersClauseAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ParametersClause__Group__3__Impl"


    // $ANTLR start "rule__ParametersClause__Group_2__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3269:1: rule__ParametersClause__Group_2__0 : rule__ParametersClause__Group_2__0__Impl rule__ParametersClause__Group_2__1 ;
    public final void rule__ParametersClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3273:1: ( rule__ParametersClause__Group_2__0__Impl rule__ParametersClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3274:2: rule__ParametersClause__Group_2__0__Impl rule__ParametersClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group_2__0__Impl_in_rule__ParametersClause__Group_2__06849);
            rule__ParametersClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group_2__1_in_rule__ParametersClause__Group_2__06852);
            rule__ParametersClause__Group_2__1();

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
    // $ANTLR end "rule__ParametersClause__Group_2__0"


    // $ANTLR start "rule__ParametersClause__Group_2__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3281:1: rule__ParametersClause__Group_2__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__ParametersClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3285:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3286:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3286:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3287:1: KEYWORD_8
            {
             before(grammarAccess.getParametersClauseAccess().getCommaKeyword_2_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group_2__0__Impl6880); 
             after(grammarAccess.getParametersClauseAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ParametersClause__Group_2__0__Impl"


    // $ANTLR start "rule__ParametersClause__Group_2__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3300:1: rule__ParametersClause__Group_2__1 : rule__ParametersClause__Group_2__1__Impl ;
    public final void rule__ParametersClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3304:1: ( rule__ParametersClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3305:2: rule__ParametersClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group_2__1__Impl_in_rule__ParametersClause__Group_2__16911);
            rule__ParametersClause__Group_2__1__Impl();

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
    // $ANTLR end "rule__ParametersClause__Group_2__1"


    // $ANTLR start "rule__ParametersClause__Group_2__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3311:1: rule__ParametersClause__Group_2__1__Impl : ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) ) ;
    public final void rule__ParametersClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3315:1: ( ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3316:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3316:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3317:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsAssignment_2_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3318:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3318:2: rule__ParametersClause__ParameterDeclarationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_2_1_in_rule__ParametersClause__Group_2__1__Impl6938);
            rule__ParametersClause__ParameterDeclarationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParametersClauseAccess().getParameterDeclarationsAssignment_2_1()); 

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
    // $ANTLR end "rule__ParametersClause__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3332:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3336:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3337:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06972);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06975);
            rule__ParameterDeclaration__Group__1();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3344:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3348:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3349:1: ( ( rule__ParameterDeclaration__TypeAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3349:1: ( ( rule__ParameterDeclaration__TypeAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3350:1: ( rule__ParameterDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3351:1: ( rule__ParameterDeclaration__TypeAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3351:2: rule__ParameterDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__TypeAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl7002);
            rule__ParameterDeclaration__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3361:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3365:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3366:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__17032);
            rule__ParameterDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3372:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3376:1: ( ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3377:1: ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3377:1: ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3378:1: ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3379:1: ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3379:2: rule__ParameterDeclaration__DeclaredParameterNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__DeclaredParameterNameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl7059);
            rule__ParameterDeclaration__DeclaredParameterNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameAssignment_1()); 

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
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ImportClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3393:1: rule__ImportClause__Group__0 : rule__ImportClause__Group__0__Impl rule__ImportClause__Group__1 ;
    public final void rule__ImportClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3397:1: ( rule__ImportClause__Group__0__Impl rule__ImportClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3398:2: rule__ImportClause__Group__0__Impl rule__ImportClause__Group__1
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__0__Impl_in_rule__ImportClause__Group__07093);
            rule__ImportClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportClause__Group__1_in_rule__ImportClause__Group__07096);
            rule__ImportClause__Group__1();

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
    // $ANTLR end "rule__ImportClause__Group__0"


    // $ANTLR start "rule__ImportClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3405:1: rule__ImportClause__Group__0__Impl : ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) ) ;
    public final void rule__ImportClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3409:1: ( ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3410:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3410:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3411:1: ( rule__ImportClause__ImportDeclarationsAssignment_0 )
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3412:1: ( rule__ImportClause__ImportDeclarationsAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3412:2: rule__ImportClause__ImportDeclarationsAssignment_0
            {
            pushFollow(FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_0_in_rule__ImportClause__Group__0__Impl7123);
            rule__ImportClause__ImportDeclarationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportClauseAccess().getImportDeclarationsAssignment_0()); 

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
    // $ANTLR end "rule__ImportClause__Group__0__Impl"


    // $ANTLR start "rule__ImportClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3422:1: rule__ImportClause__Group__1 : rule__ImportClause__Group__1__Impl rule__ImportClause__Group__2 ;
    public final void rule__ImportClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3426:1: ( rule__ImportClause__Group__1__Impl rule__ImportClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3427:2: rule__ImportClause__Group__1__Impl rule__ImportClause__Group__2
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__1__Impl_in_rule__ImportClause__Group__17153);
            rule__ImportClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportClause__Group__2_in_rule__ImportClause__Group__17156);
            rule__ImportClause__Group__2();

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
    // $ANTLR end "rule__ImportClause__Group__1"


    // $ANTLR start "rule__ImportClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3434:1: rule__ImportClause__Group__1__Impl : ( ( rule__ImportClause__Group_1__0 )* ) ;
    public final void rule__ImportClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3438:1: ( ( ( rule__ImportClause__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3439:1: ( ( rule__ImportClause__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3439:1: ( ( rule__ImportClause__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3440:1: ( rule__ImportClause__Group_1__0 )*
            {
             before(grammarAccess.getImportClauseAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3441:1: ( rule__ImportClause__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==KEYWORD_13) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==KEYWORD_45) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3441:2: rule__ImportClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ImportClause__Group_1__0_in_rule__ImportClause__Group__1__Impl7183);
            	    rule__ImportClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getImportClauseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ImportClause__Group__1__Impl"


    // $ANTLR start "rule__ImportClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3451:1: rule__ImportClause__Group__2 : rule__ImportClause__Group__2__Impl ;
    public final void rule__ImportClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3455:1: ( rule__ImportClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3456:2: rule__ImportClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__2__Impl_in_rule__ImportClause__Group__27214);
            rule__ImportClause__Group__2__Impl();

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
    // $ANTLR end "rule__ImportClause__Group__2"


    // $ANTLR start "rule__ImportClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3462:1: rule__ImportClause__Group__2__Impl : ( ( KEYWORD_13 )? ) ;
    public final void rule__ImportClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3466:1: ( ( ( KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3467:1: ( ( KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3467:1: ( ( KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3468:1: ( KEYWORD_13 )?
            {
             before(grammarAccess.getImportClauseAccess().getSemicolonKeyword_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3469:1: ( KEYWORD_13 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3470:2: KEYWORD_13
                    {
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__ImportClause__Group__2__Impl7243); 

                    }
                    break;

            }

             after(grammarAccess.getImportClauseAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__ImportClause__Group__2__Impl"


    // $ANTLR start "rule__ImportClause__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3487:1: rule__ImportClause__Group_1__0 : rule__ImportClause__Group_1__0__Impl rule__ImportClause__Group_1__1 ;
    public final void rule__ImportClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3491:1: ( rule__ImportClause__Group_1__0__Impl rule__ImportClause__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3492:2: rule__ImportClause__Group_1__0__Impl rule__ImportClause__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportClause__Group_1__0__Impl_in_rule__ImportClause__Group_1__07282);
            rule__ImportClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportClause__Group_1__1_in_rule__ImportClause__Group_1__07285);
            rule__ImportClause__Group_1__1();

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
    // $ANTLR end "rule__ImportClause__Group_1__0"


    // $ANTLR start "rule__ImportClause__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3499:1: rule__ImportClause__Group_1__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__ImportClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3503:1: ( ( KEYWORD_13 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3504:1: ( KEYWORD_13 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3504:1: ( KEYWORD_13 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3505:1: KEYWORD_13
            {
             before(grammarAccess.getImportClauseAccess().getSemicolonKeyword_1_0()); 
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__ImportClause__Group_1__0__Impl7313); 
             after(grammarAccess.getImportClauseAccess().getSemicolonKeyword_1_0()); 

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
    // $ANTLR end "rule__ImportClause__Group_1__0__Impl"


    // $ANTLR start "rule__ImportClause__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3518:1: rule__ImportClause__Group_1__1 : rule__ImportClause__Group_1__1__Impl ;
    public final void rule__ImportClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3522:1: ( rule__ImportClause__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3523:2: rule__ImportClause__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportClause__Group_1__1__Impl_in_rule__ImportClause__Group_1__17344);
            rule__ImportClause__Group_1__1__Impl();

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
    // $ANTLR end "rule__ImportClause__Group_1__1"


    // $ANTLR start "rule__ImportClause__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3529:1: rule__ImportClause__Group_1__1__Impl : ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) ) ;
    public final void rule__ImportClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3533:1: ( ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3534:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3534:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3535:1: ( rule__ImportClause__ImportDeclarationsAssignment_1_1 )
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3536:1: ( rule__ImportClause__ImportDeclarationsAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3536:2: rule__ImportClause__ImportDeclarationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_1_1_in_rule__ImportClause__Group_1__1__Impl7371);
            rule__ImportClause__ImportDeclarationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImportClauseAccess().getImportDeclarationsAssignment_1_1()); 

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
    // $ANTLR end "rule__ImportClause__Group_1__1__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3550:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3554:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3555:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__07405);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__07408);
            rule__ImportDeclaration__Group__1();

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
    // $ANTLR end "rule__ImportDeclaration__Group__0"


    // $ANTLR start "rule__ImportDeclaration__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3562:1: rule__ImportDeclaration__Group__0__Impl : ( KEYWORD_45 ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3566:1: ( ( KEYWORD_45 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3567:1: ( KEYWORD_45 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3567:1: ( KEYWORD_45 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3568:1: KEYWORD_45
            {
             before(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__ImportDeclaration__Group__0__Impl7436); 
             after(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__ImportDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ImportDeclaration__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3581:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3585:1: ( rule__ImportDeclaration__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3586:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__17467);
            rule__ImportDeclaration__Group__1__Impl();

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
    // $ANTLR end "rule__ImportDeclaration__Group__1"


    // $ANTLR start "rule__ImportDeclaration__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3592:1: rule__ImportDeclaration__Group__1__Impl : ( ruleQualifiedIdentifier ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3596:1: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3597:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3597:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3598:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getImportDeclarationAccess().getQualifiedIdentifierParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_rule__ImportDeclaration__Group__1__Impl7494);
            ruleQualifiedIdentifier();

            state._fsp--;

             after(grammarAccess.getImportDeclarationAccess().getQualifiedIdentifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__ImportDeclaration__Group__1__Impl"


    // $ANTLR start "rule__GroupByClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3613:1: rule__GroupByClause__Group__0 : rule__GroupByClause__Group__0__Impl rule__GroupByClause__Group__1 ;
    public final void rule__GroupByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3617:1: ( rule__GroupByClause__Group__0__Impl rule__GroupByClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3618:2: rule__GroupByClause__Group__0__Impl rule__GroupByClause__Group__1
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__0__Impl_in_rule__GroupByClause__Group__07527);
            rule__GroupByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group__1_in_rule__GroupByClause__Group__07530);
            rule__GroupByClause__Group__1();

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
    // $ANTLR end "rule__GroupByClause__Group__0"


    // $ANTLR start "rule__GroupByClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3625:1: rule__GroupByClause__Group__0__Impl : ( KEYWORD_35 ) ;
    public final void rule__GroupByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3629:1: ( ( KEYWORD_35 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3630:1: ( KEYWORD_35 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3630:1: ( KEYWORD_35 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3631:1: KEYWORD_35
            {
             before(grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0()); 
            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__GroupByClause__Group__0__Impl7558); 
             after(grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0()); 

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
    // $ANTLR end "rule__GroupByClause__Group__0__Impl"


    // $ANTLR start "rule__GroupByClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3644:1: rule__GroupByClause__Group__1 : rule__GroupByClause__Group__1__Impl ;
    public final void rule__GroupByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3648:1: ( rule__GroupByClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3649:2: rule__GroupByClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__1__Impl_in_rule__GroupByClause__Group__17589);
            rule__GroupByClause__Group__1__Impl();

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
    // $ANTLR end "rule__GroupByClause__Group__1"


    // $ANTLR start "rule__GroupByClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3655:1: rule__GroupByClause__Group__1__Impl : ( KEYWORD_24 ) ;
    public final void rule__GroupByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3659:1: ( ( KEYWORD_24 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3660:1: ( KEYWORD_24 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3660:1: ( KEYWORD_24 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3661:1: KEYWORD_24
            {
             before(grammarAccess.getGroupByClauseAccess().getBYKeyword_1()); 
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__GroupByClause__Group__1__Impl7617); 
             after(grammarAccess.getGroupByClauseAccess().getBYKeyword_1()); 

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
    // $ANTLR end "rule__GroupByClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3678:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3682:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3683:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__0__Impl_in_rule__OrderByClause__Group__07652);
            rule__OrderByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderByClause__Group__1_in_rule__OrderByClause__Group__07655);
            rule__OrderByClause__Group__1();

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
    // $ANTLR end "rule__OrderByClause__Group__0"


    // $ANTLR start "rule__OrderByClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3690:1: rule__OrderByClause__Group__0__Impl : ( KEYWORD_36 ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3694:1: ( ( KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3695:1: ( KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3695:1: ( KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3696:1: KEYWORD_36
            {
             before(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 
            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__OrderByClause__Group__0__Impl7683); 
             after(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 

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
    // $ANTLR end "rule__OrderByClause__Group__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3709:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3713:1: ( rule__OrderByClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3714:2: rule__OrderByClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__1__Impl_in_rule__OrderByClause__Group__17714);
            rule__OrderByClause__Group__1__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group__1"


    // $ANTLR start "rule__OrderByClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3720:1: rule__OrderByClause__Group__1__Impl : ( KEYWORD_24 ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3724:1: ( ( KEYWORD_24 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3725:1: ( KEYWORD_24 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3725:1: ( KEYWORD_24 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3726:1: KEYWORD_24
            {
             before(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__OrderByClause__Group__1__Impl7742); 
             after(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 

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
    // $ANTLR end "rule__OrderByClause__Group__1__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3743:1: rule__ConditionalOrExpression__Group__0 : rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 ;
    public final void rule__ConditionalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3747:1: ( rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3748:2: rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__0__Impl_in_rule__ConditionalOrExpression__Group__07777);
            rule__ConditionalOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__1_in_rule__ConditionalOrExpression__Group__07780);
            rule__ConditionalOrExpression__Group__1();

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
    // $ANTLR end "rule__ConditionalOrExpression__Group__0"


    // $ANTLR start "rule__ConditionalOrExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3755:1: rule__ConditionalOrExpression__Group__0__Impl : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3759:1: ( ( ruleConditionalAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3760:1: ( ruleConditionalAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3760:1: ( ruleConditionalAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3761:1: ruleConditionalAndExpression
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__Group__0__Impl7807);
            ruleConditionalAndExpression();

            state._fsp--;

             after(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConditionalOrExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3772:1: rule__ConditionalOrExpression__Group__1 : rule__ConditionalOrExpression__Group__1__Impl ;
    public final void rule__ConditionalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3776:1: ( rule__ConditionalOrExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3777:2: rule__ConditionalOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__1__Impl_in_rule__ConditionalOrExpression__Group__17836);
            rule__ConditionalOrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionalOrExpression__Group__1"


    // $ANTLR start "rule__ConditionalOrExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3783:1: rule__ConditionalOrExpression__Group__1__Impl : ( ( rule__ConditionalOrExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3787:1: ( ( ( rule__ConditionalOrExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3788:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3788:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3789:1: ( rule__ConditionalOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3790:1: ( rule__ConditionalOrExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==KEYWORD_25) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3790:2: rule__ConditionalOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__0_in_rule__ConditionalOrExpression__Group__1__Impl7863);
            	    rule__ConditionalOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getConditionalOrExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionalOrExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3804:1: rule__ConditionalOrExpression__Group_1__0 : rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 ;
    public final void rule__ConditionalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3808:1: ( rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3809:2: rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__0__Impl_in_rule__ConditionalOrExpression__Group_1__07898);
            rule__ConditionalOrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__1_in_rule__ConditionalOrExpression__Group_1__07901);
            rule__ConditionalOrExpression__Group_1__1();

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
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__0"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3816:1: rule__ConditionalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3820:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3821:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3821:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3822:1: ()
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3823:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3825:1: 
            {
            }

             after(grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3835:1: rule__ConditionalOrExpression__Group_1__1 : rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 ;
    public final void rule__ConditionalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3839:1: ( rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3840:2: rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__1__Impl_in_rule__ConditionalOrExpression__Group_1__17959);
            rule__ConditionalOrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__2_in_rule__ConditionalOrExpression__Group_1__17962);
            rule__ConditionalOrExpression__Group_1__2();

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
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__1"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3847:1: rule__ConditionalOrExpression__Group_1__1__Impl : ( KEYWORD_25 ) ;
    public final void rule__ConditionalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3851:1: ( ( KEYWORD_25 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3852:1: ( KEYWORD_25 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3852:1: ( KEYWORD_25 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3853:1: KEYWORD_25
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__ConditionalOrExpression__Group_1__1__Impl7990); 
             after(grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3866:1: rule__ConditionalOrExpression__Group_1__2 : rule__ConditionalOrExpression__Group_1__2__Impl ;
    public final void rule__ConditionalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3870:1: ( rule__ConditionalOrExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3871:2: rule__ConditionalOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__2__Impl_in_rule__ConditionalOrExpression__Group_1__28021);
            rule__ConditionalOrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__2"


    // $ANTLR start "rule__ConditionalOrExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3877:1: rule__ConditionalOrExpression__Group_1__2__Impl : ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConditionalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3881:1: ( ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3882:1: ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3882:1: ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3883:1: ( rule__ConditionalOrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3884:1: ( rule__ConditionalOrExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3884:2: rule__ConditionalOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__RightAssignment_1_2_in_rule__ConditionalOrExpression__Group_1__2__Impl8048);
            rule__ConditionalOrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalOrExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ConditionalOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3900:1: rule__ConditionalAndExpression__Group__0 : rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 ;
    public final void rule__ConditionalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3904:1: ( rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3905:2: rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__0__Impl_in_rule__ConditionalAndExpression__Group__08084);
            rule__ConditionalAndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__1_in_rule__ConditionalAndExpression__Group__08087);
            rule__ConditionalAndExpression__Group__1();

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
    // $ANTLR end "rule__ConditionalAndExpression__Group__0"


    // $ANTLR start "rule__ConditionalAndExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3912:1: rule__ConditionalAndExpression__Group__0__Impl : ( ruleSimpleOrExpression ) ;
    public final void rule__ConditionalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3916:1: ( ( ruleSimpleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3917:1: ( ruleSimpleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3917:1: ( ruleSimpleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3918:1: ruleSimpleOrExpression
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getSimpleOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__Group__0__Impl8114);
            ruleSimpleOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAndExpressionAccess().getSimpleOrExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ConditionalAndExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3929:1: rule__ConditionalAndExpression__Group__1 : rule__ConditionalAndExpression__Group__1__Impl ;
    public final void rule__ConditionalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3933:1: ( rule__ConditionalAndExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3934:2: rule__ConditionalAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__1__Impl_in_rule__ConditionalAndExpression__Group__18143);
            rule__ConditionalAndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionalAndExpression__Group__1"


    // $ANTLR start "rule__ConditionalAndExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3940:1: rule__ConditionalAndExpression__Group__1__Impl : ( ( rule__ConditionalAndExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3944:1: ( ( ( rule__ConditionalAndExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3945:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3945:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3946:1: ( rule__ConditionalAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3947:1: ( rule__ConditionalAndExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3947:2: rule__ConditionalAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__0_in_rule__ConditionalAndExpression__Group__1__Impl8170);
            	    rule__ConditionalAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getConditionalAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionalAndExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3961:1: rule__ConditionalAndExpression__Group_1__0 : rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 ;
    public final void rule__ConditionalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3965:1: ( rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3966:2: rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__0__Impl_in_rule__ConditionalAndExpression__Group_1__08205);
            rule__ConditionalAndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__1_in_rule__ConditionalAndExpression__Group_1__08208);
            rule__ConditionalAndExpression__Group_1__1();

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
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__0"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3973:1: rule__ConditionalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3977:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3978:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3978:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3979:1: ()
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3980:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3982:1: 
            {
            }

             after(grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3992:1: rule__ConditionalAndExpression__Group_1__1 : rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 ;
    public final void rule__ConditionalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3996:1: ( rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3997:2: rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__1__Impl_in_rule__ConditionalAndExpression__Group_1__18266);
            rule__ConditionalAndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__2_in_rule__ConditionalAndExpression__Group_1__18269);
            rule__ConditionalAndExpression__Group_1__2();

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
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__1"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4004:1: rule__ConditionalAndExpression__Group_1__1__Impl : ( KEYWORD_19 ) ;
    public final void rule__ConditionalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4008:1: ( ( KEYWORD_19 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4009:1: ( KEYWORD_19 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4009:1: ( KEYWORD_19 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4010:1: KEYWORD_19
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__ConditionalAndExpression__Group_1__1__Impl8297); 
             after(grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4023:1: rule__ConditionalAndExpression__Group_1__2 : rule__ConditionalAndExpression__Group_1__2__Impl ;
    public final void rule__ConditionalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4027:1: ( rule__ConditionalAndExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4028:2: rule__ConditionalAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__2__Impl_in_rule__ConditionalAndExpression__Group_1__28328);
            rule__ConditionalAndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__2"


    // $ANTLR start "rule__ConditionalAndExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4034:1: rule__ConditionalAndExpression__Group_1__2__Impl : ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConditionalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4038:1: ( ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4039:1: ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4039:1: ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4040:1: ( rule__ConditionalAndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4041:1: ( rule__ConditionalAndExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4041:2: rule__ConditionalAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__RightAssignment_1_2_in_rule__ConditionalAndExpression__Group_1__2__Impl8355);
            rule__ConditionalAndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAndExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ConditionalAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SimpleOrExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4057:1: rule__SimpleOrExpression__Group__0 : rule__SimpleOrExpression__Group__0__Impl rule__SimpleOrExpression__Group__1 ;
    public final void rule__SimpleOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4061:1: ( rule__SimpleOrExpression__Group__0__Impl rule__SimpleOrExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4062:2: rule__SimpleOrExpression__Group__0__Impl rule__SimpleOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__0__Impl_in_rule__SimpleOrExpression__Group__08391);
            rule__SimpleOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__1_in_rule__SimpleOrExpression__Group__08394);
            rule__SimpleOrExpression__Group__1();

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
    // $ANTLR end "rule__SimpleOrExpression__Group__0"


    // $ANTLR start "rule__SimpleOrExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4069:1: rule__SimpleOrExpression__Group__0__Impl : ( ruleSimpleAndExpression ) ;
    public final void rule__SimpleOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4073:1: ( ( ruleSimpleAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4074:1: ( ruleSimpleAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4074:1: ( ruleSimpleAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4075:1: ruleSimpleAndExpression
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getSimpleAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__Group__0__Impl8421);
            ruleSimpleAndExpression();

            state._fsp--;

             after(grammarAccess.getSimpleOrExpressionAccess().getSimpleAndExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SimpleOrExpression__Group__0__Impl"


    // $ANTLR start "rule__SimpleOrExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4086:1: rule__SimpleOrExpression__Group__1 : rule__SimpleOrExpression__Group__1__Impl ;
    public final void rule__SimpleOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4090:1: ( rule__SimpleOrExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4091:2: rule__SimpleOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__1__Impl_in_rule__SimpleOrExpression__Group__18450);
            rule__SimpleOrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleOrExpression__Group__1"


    // $ANTLR start "rule__SimpleOrExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4097:1: rule__SimpleOrExpression__Group__1__Impl : ( ( rule__SimpleOrExpression__Group_1__0 )* ) ;
    public final void rule__SimpleOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4101:1: ( ( ( rule__SimpleOrExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4102:1: ( ( rule__SimpleOrExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4102:1: ( ( rule__SimpleOrExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4103:1: ( rule__SimpleOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4104:1: ( rule__SimpleOrExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==KEYWORD_16) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4104:2: rule__SimpleOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__0_in_rule__SimpleOrExpression__Group__1__Impl8477);
            	    rule__SimpleOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSimpleOrExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SimpleOrExpression__Group__1__Impl"


    // $ANTLR start "rule__SimpleOrExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4118:1: rule__SimpleOrExpression__Group_1__0 : rule__SimpleOrExpression__Group_1__0__Impl rule__SimpleOrExpression__Group_1__1 ;
    public final void rule__SimpleOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4122:1: ( rule__SimpleOrExpression__Group_1__0__Impl rule__SimpleOrExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4123:2: rule__SimpleOrExpression__Group_1__0__Impl rule__SimpleOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__0__Impl_in_rule__SimpleOrExpression__Group_1__08512);
            rule__SimpleOrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__1_in_rule__SimpleOrExpression__Group_1__08515);
            rule__SimpleOrExpression__Group_1__1();

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
    // $ANTLR end "rule__SimpleOrExpression__Group_1__0"


    // $ANTLR start "rule__SimpleOrExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4130:1: rule__SimpleOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SimpleOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4134:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4135:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4135:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4136:1: ()
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4137:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4139:1: 
            {
            }

             after(grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SimpleOrExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4149:1: rule__SimpleOrExpression__Group_1__1 : rule__SimpleOrExpression__Group_1__1__Impl rule__SimpleOrExpression__Group_1__2 ;
    public final void rule__SimpleOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4153:1: ( rule__SimpleOrExpression__Group_1__1__Impl rule__SimpleOrExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4154:2: rule__SimpleOrExpression__Group_1__1__Impl rule__SimpleOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__1__Impl_in_rule__SimpleOrExpression__Group_1__18573);
            rule__SimpleOrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__2_in_rule__SimpleOrExpression__Group_1__18576);
            rule__SimpleOrExpression__Group_1__2();

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
    // $ANTLR end "rule__SimpleOrExpression__Group_1__1"


    // $ANTLR start "rule__SimpleOrExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4161:1: rule__SimpleOrExpression__Group_1__1__Impl : ( KEYWORD_16 ) ;
    public final void rule__SimpleOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4165:1: ( ( KEYWORD_16 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4166:1: ( KEYWORD_16 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4166:1: ( KEYWORD_16 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4167:1: KEYWORD_16
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getVerticalLineKeyword_1_1()); 
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__SimpleOrExpression__Group_1__1__Impl8604); 
             after(grammarAccess.getSimpleOrExpressionAccess().getVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__SimpleOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SimpleOrExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4180:1: rule__SimpleOrExpression__Group_1__2 : rule__SimpleOrExpression__Group_1__2__Impl ;
    public final void rule__SimpleOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4184:1: ( rule__SimpleOrExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4185:2: rule__SimpleOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__2__Impl_in_rule__SimpleOrExpression__Group_1__28635);
            rule__SimpleOrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__SimpleOrExpression__Group_1__2"


    // $ANTLR start "rule__SimpleOrExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4191:1: rule__SimpleOrExpression__Group_1__2__Impl : ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SimpleOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4195:1: ( ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4196:1: ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4196:1: ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4197:1: ( rule__SimpleOrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4198:1: ( rule__SimpleOrExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4198:2: rule__SimpleOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__RightAssignment_1_2_in_rule__SimpleOrExpression__Group_1__2__Impl8662);
            rule__SimpleOrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOrExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__SimpleOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SimpleAndExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4214:1: rule__SimpleAndExpression__Group__0 : rule__SimpleAndExpression__Group__0__Impl rule__SimpleAndExpression__Group__1 ;
    public final void rule__SimpleAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4218:1: ( rule__SimpleAndExpression__Group__0__Impl rule__SimpleAndExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4219:2: rule__SimpleAndExpression__Group__0__Impl rule__SimpleAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__0__Impl_in_rule__SimpleAndExpression__Group__08698);
            rule__SimpleAndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__1_in_rule__SimpleAndExpression__Group__08701);
            rule__SimpleAndExpression__Group__1();

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
    // $ANTLR end "rule__SimpleAndExpression__Group__0"


    // $ANTLR start "rule__SimpleAndExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4226:1: rule__SimpleAndExpression__Group__0__Impl : ( ruleComparisonOperatorExpression ) ;
    public final void rule__SimpleAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4230:1: ( ( ruleComparisonOperatorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4231:1: ( ruleComparisonOperatorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4231:1: ( ruleComparisonOperatorExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4232:1: ruleComparisonOperatorExpression
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__Group__0__Impl8728);
            ruleComparisonOperatorExpression();

            state._fsp--;

             after(grammarAccess.getSimpleAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__SimpleAndExpression__Group__0__Impl"


    // $ANTLR start "rule__SimpleAndExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4243:1: rule__SimpleAndExpression__Group__1 : rule__SimpleAndExpression__Group__1__Impl ;
    public final void rule__SimpleAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4247:1: ( rule__SimpleAndExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4248:2: rule__SimpleAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__1__Impl_in_rule__SimpleAndExpression__Group__18757);
            rule__SimpleAndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__SimpleAndExpression__Group__1"


    // $ANTLR start "rule__SimpleAndExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4254:1: rule__SimpleAndExpression__Group__1__Impl : ( ( rule__SimpleAndExpression__Group_1__0 )* ) ;
    public final void rule__SimpleAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4258:1: ( ( ( rule__SimpleAndExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4259:1: ( ( rule__SimpleAndExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4259:1: ( ( rule__SimpleAndExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4260:1: ( rule__SimpleAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4261:1: ( rule__SimpleAndExpression__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==KEYWORD_3) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4261:2: rule__SimpleAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__0_in_rule__SimpleAndExpression__Group__1__Impl8784);
            	    rule__SimpleAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getSimpleAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SimpleAndExpression__Group__1__Impl"


    // $ANTLR start "rule__SimpleAndExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4275:1: rule__SimpleAndExpression__Group_1__0 : rule__SimpleAndExpression__Group_1__0__Impl rule__SimpleAndExpression__Group_1__1 ;
    public final void rule__SimpleAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4279:1: ( rule__SimpleAndExpression__Group_1__0__Impl rule__SimpleAndExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4280:2: rule__SimpleAndExpression__Group_1__0__Impl rule__SimpleAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__0__Impl_in_rule__SimpleAndExpression__Group_1__08819);
            rule__SimpleAndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__1_in_rule__SimpleAndExpression__Group_1__08822);
            rule__SimpleAndExpression__Group_1__1();

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
    // $ANTLR end "rule__SimpleAndExpression__Group_1__0"


    // $ANTLR start "rule__SimpleAndExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4287:1: rule__SimpleAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SimpleAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4291:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4292:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4292:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4293:1: ()
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4294:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4296:1: 
            {
            }

             after(grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SimpleAndExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4306:1: rule__SimpleAndExpression__Group_1__1 : rule__SimpleAndExpression__Group_1__1__Impl rule__SimpleAndExpression__Group_1__2 ;
    public final void rule__SimpleAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4310:1: ( rule__SimpleAndExpression__Group_1__1__Impl rule__SimpleAndExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4311:2: rule__SimpleAndExpression__Group_1__1__Impl rule__SimpleAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__1__Impl_in_rule__SimpleAndExpression__Group_1__18880);
            rule__SimpleAndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__2_in_rule__SimpleAndExpression__Group_1__18883);
            rule__SimpleAndExpression__Group_1__2();

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
    // $ANTLR end "rule__SimpleAndExpression__Group_1__1"


    // $ANTLR start "rule__SimpleAndExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4318:1: rule__SimpleAndExpression__Group_1__1__Impl : ( KEYWORD_3 ) ;
    public final void rule__SimpleAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4322:1: ( ( KEYWORD_3 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4323:1: ( KEYWORD_3 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4323:1: ( KEYWORD_3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4324:1: KEYWORD_3
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getAmpersandKeyword_1_1()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SimpleAndExpression__Group_1__1__Impl8911); 
             after(grammarAccess.getSimpleAndExpressionAccess().getAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__SimpleAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SimpleAndExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4337:1: rule__SimpleAndExpression__Group_1__2 : rule__SimpleAndExpression__Group_1__2__Impl ;
    public final void rule__SimpleAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4341:1: ( rule__SimpleAndExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4342:2: rule__SimpleAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__2__Impl_in_rule__SimpleAndExpression__Group_1__28942);
            rule__SimpleAndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__SimpleAndExpression__Group_1__2"


    // $ANTLR start "rule__SimpleAndExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4348:1: rule__SimpleAndExpression__Group_1__2__Impl : ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SimpleAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4352:1: ( ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4353:1: ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4353:1: ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4354:1: ( rule__SimpleAndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4355:1: ( rule__SimpleAndExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4355:2: rule__SimpleAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__RightAssignment_1_2_in_rule__SimpleAndExpression__Group_1__2__Impl8969);
            rule__SimpleAndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAndExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__SimpleAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4371:1: rule__ComparisonOperatorExpression__Group__0 : rule__ComparisonOperatorExpression__Group__0__Impl rule__ComparisonOperatorExpression__Group__1 ;
    public final void rule__ComparisonOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4375:1: ( rule__ComparisonOperatorExpression__Group__0__Impl rule__ComparisonOperatorExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4376:2: rule__ComparisonOperatorExpression__Group__0__Impl rule__ComparisonOperatorExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__0__Impl_in_rule__ComparisonOperatorExpression__Group__09005);
            rule__ComparisonOperatorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__1_in_rule__ComparisonOperatorExpression__Group__09008);
            rule__ComparisonOperatorExpression__Group__1();

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group__0"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4383:1: rule__ComparisonOperatorExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisonOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4387:1: ( ( ruleAdditionExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4388:1: ( ruleAdditionExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4388:1: ( ruleAdditionExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4389:1: ruleAdditionExpression
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__Group__0__Impl9035);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4400:1: rule__ComparisonOperatorExpression__Group__1 : rule__ComparisonOperatorExpression__Group__1__Impl ;
    public final void rule__ComparisonOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4404:1: ( rule__ComparisonOperatorExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4405:2: rule__ComparisonOperatorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__1__Impl_in_rule__ComparisonOperatorExpression__Group__19064);
            rule__ComparisonOperatorExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group__1"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4411:1: rule__ComparisonOperatorExpression__Group__1__Impl : ( ( rule__ComparisonOperatorExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4415:1: ( ( ( rule__ComparisonOperatorExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4416:1: ( ( rule__ComparisonOperatorExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4416:1: ( ( rule__ComparisonOperatorExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4417:1: ( rule__ComparisonOperatorExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4418:1: ( rule__ComparisonOperatorExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_52||LA38_0==KEYWORD_18||(LA38_0>=KEYWORD_20 && LA38_0<=KEYWORD_22)||(LA38_0>=KEYWORD_14 && LA38_0<=KEYWORD_15)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4418:2: rule__ComparisonOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__0_in_rule__ComparisonOperatorExpression__Group__1__Impl9091);
            	    rule__ComparisonOperatorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getComparisonOperatorExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4432:1: rule__ComparisonOperatorExpression__Group_1__0 : rule__ComparisonOperatorExpression__Group_1__0__Impl rule__ComparisonOperatorExpression__Group_1__1 ;
    public final void rule__ComparisonOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4436:1: ( rule__ComparisonOperatorExpression__Group_1__0__Impl rule__ComparisonOperatorExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4437:2: rule__ComparisonOperatorExpression__Group_1__0__Impl rule__ComparisonOperatorExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__0__Impl_in_rule__ComparisonOperatorExpression__Group_1__09126);
            rule__ComparisonOperatorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__1_in_rule__ComparisonOperatorExpression__Group_1__09129);
            rule__ComparisonOperatorExpression__Group_1__1();

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4444:1: rule__ComparisonOperatorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4448:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4449:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4449:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4450:1: ()
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4451:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4453:1: 
            {
            }

             after(grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperatorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4463:1: rule__ComparisonOperatorExpression__Group_1__1 : rule__ComparisonOperatorExpression__Group_1__1__Impl rule__ComparisonOperatorExpression__Group_1__2 ;
    public final void rule__ComparisonOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4467:1: ( rule__ComparisonOperatorExpression__Group_1__1__Impl rule__ComparisonOperatorExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4468:2: rule__ComparisonOperatorExpression__Group_1__1__Impl rule__ComparisonOperatorExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__1__Impl_in_rule__ComparisonOperatorExpression__Group_1__19187);
            rule__ComparisonOperatorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__2_in_rule__ComparisonOperatorExpression__Group_1__19190);
            rule__ComparisonOperatorExpression__Group_1__2();

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4475:1: rule__ComparisonOperatorExpression__Group_1__1__Impl : ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4479:1: ( ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4480:1: ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4480:1: ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4481:1: ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4482:1: ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4482:2: rule__ComparisonOperatorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__OperatorAssignment_1_1_in_rule__ComparisonOperatorExpression__Group_1__1__Impl9217);
            rule__ComparisonOperatorExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4492:1: rule__ComparisonOperatorExpression__Group_1__2 : rule__ComparisonOperatorExpression__Group_1__2__Impl ;
    public final void rule__ComparisonOperatorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4496:1: ( rule__ComparisonOperatorExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4497:2: rule__ComparisonOperatorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__2__Impl_in_rule__ComparisonOperatorExpression__Group_1__29247);
            rule__ComparisonOperatorExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonOperatorExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4503:1: rule__ComparisonOperatorExpression__Group_1__2__Impl : ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonOperatorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4507:1: ( ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4508:1: ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4508:1: ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4509:1: ( rule__ComparisonOperatorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4510:1: ( rule__ComparisonOperatorExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4510:2: rule__ComparisonOperatorExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__RightAssignment_1_2_in_rule__ComparisonOperatorExpression__Group_1__2__Impl9274);
            rule__ComparisonOperatorExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ComparisonOperatorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4526:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4530:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4531:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__09310);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__09313);
            rule__AdditionExpression__Group__1();

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
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4538:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4542:1: ( ( ruleMultiplicationExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4543:1: ( ruleMultiplicationExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4543:1: ( ruleMultiplicationExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4544:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl9340);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4555:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4559:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4560:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__19369);
            rule__AdditionExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4566:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4570:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4571:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4571:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4572:1: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4573:1: ( rule__AdditionExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==KEYWORD_7||LA39_0==KEYWORD_9) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4573:2: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl9396);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4587:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4591:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4592:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__09431);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__09434);
            rule__AdditionExpression__Group_1__1();

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
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4599:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4603:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4604:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4604:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4605:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4606:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4608:1: 
            {
            }

             after(grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4618:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4622:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4623:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__19492);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__19495);
            rule__AdditionExpression__Group_1__2();

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
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4630:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4634:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4635:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4635:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4636:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4637:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4637:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl9522);
            rule__AdditionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4647:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4651:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4652:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__29552);
            rule__AdditionExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AdditionExpression__Group_1__2"


    // $ANTLR start "rule__AdditionExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4658:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4662:1: ( ( ( rule__AdditionExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4663:1: ( ( rule__AdditionExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4663:1: ( ( rule__AdditionExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4664:1: ( rule__AdditionExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4665:1: ( rule__AdditionExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4665:2: rule__AdditionExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AdditionExpression__RightAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl9579);
            rule__AdditionExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4681:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4685:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4686:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__09615);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__09618);
            rule__MultiplicationExpression__Group__1();

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
    // $ANTLR end "rule__MultiplicationExpression__Group__0"


    // $ANTLR start "rule__MultiplicationExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4693:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4697:1: ( ( ruleUnaryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4698:1: ( ruleUnaryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4698:1: ( ruleUnaryExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4699:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__Group__0__Impl9645);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4710:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4714:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4715:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__19674);
            rule__MultiplicationExpression__Group__1__Impl();

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
    // $ANTLR end "rule__MultiplicationExpression__Group__1"


    // $ANTLR start "rule__MultiplicationExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4721:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4725:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4726:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4726:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4727:1: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4728:1: ( rule__MultiplicationExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_2||LA40_0==KEYWORD_6||LA40_0==KEYWORD_11) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4728:2: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl9701);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4742:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4746:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4747:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__09736);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__09739);
            rule__MultiplicationExpression__Group_1__1();

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4754:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4758:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4759:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4759:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4760:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4761:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4763:1: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4773:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4777:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4778:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__19797);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__19800);
            rule__MultiplicationExpression__Group_1__2();

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4785:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4789:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4790:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4790:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4791:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4792:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4792:2: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl9827);
            rule__MultiplicationExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4802:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4806:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4807:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__29857);
            rule__MultiplicationExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4813:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4817:1: ( ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4818:1: ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4818:1: ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4819:1: ( rule__MultiplicationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4820:1: ( rule__MultiplicationExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4820:2: rule__MultiplicationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__RightAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl9884);
            rule__MultiplicationExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4836:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4840:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4841:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group__0__Impl_in_rule__UnaryExpression__Group__09920);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpression__Group__1_in_rule__UnaryExpression__Group__09923);
            rule__UnaryExpression__Group__1();

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
    // $ANTLR end "rule__UnaryExpression__Group__0"


    // $ANTLR start "rule__UnaryExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4848:1: rule__UnaryExpression__Group__0__Impl : ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4852:1: ( ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4853:1: ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4853:1: ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4854:1: ( rule__UnaryExpression__UnaryOperatorAssignment_0 )?
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4855:1: ( rule__UnaryExpression__UnaryOperatorAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_1||LA41_0==KEYWORD_7||LA41_0==KEYWORD_9||LA41_0==KEYWORD_17) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4855:2: rule__UnaryExpression__UnaryOperatorAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__UnaryOperatorAssignment_0_in_rule__UnaryExpression__Group__0__Impl9950);
                    rule__UnaryExpression__UnaryOperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorAssignment_0()); 

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
    // $ANTLR end "rule__UnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4865:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4869:1: ( rule__UnaryExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4870:2: rule__UnaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group__1__Impl_in_rule__UnaryExpression__Group__19981);
            rule__UnaryExpression__Group__1__Impl();

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
    // $ANTLR end "rule__UnaryExpression__Group__1"


    // $ANTLR start "rule__UnaryExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4876:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__RightAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4880:1: ( ( ( rule__UnaryExpression__RightAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4881:1: ( ( rule__UnaryExpression__RightAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4881:1: ( ( rule__UnaryExpression__RightAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4882:1: ( rule__UnaryExpression__RightAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getRightAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4883:1: ( rule__UnaryExpression__RightAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4883:2: rule__UnaryExpression__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__RightAssignment_1_in_rule__UnaryExpression__Group__1__Impl10008);
            rule__UnaryExpression__RightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getRightAssignment_1()); 

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
    // $ANTLR end "rule__UnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__FieldAccessExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4897:1: rule__FieldAccessExpression__Group__0 : rule__FieldAccessExpression__Group__0__Impl rule__FieldAccessExpression__Group__1 ;
    public final void rule__FieldAccessExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4901:1: ( rule__FieldAccessExpression__Group__0__Impl rule__FieldAccessExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4902:2: rule__FieldAccessExpression__Group__0__Impl rule__FieldAccessExpression__Group__1
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__0__Impl_in_rule__FieldAccessExpression__Group__010042);
            rule__FieldAccessExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__1_in_rule__FieldAccessExpression__Group__010045);
            rule__FieldAccessExpression__Group__1();

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
    // $ANTLR end "rule__FieldAccessExpression__Group__0"


    // $ANTLR start "rule__FieldAccessExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4909:1: rule__FieldAccessExpression__Group__0__Impl : ( ruleParameterOrFieldOrMethodExpression ) ;
    public final void rule__FieldAccessExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4913:1: ( ( ruleParameterOrFieldOrMethodExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4914:1: ( ruleParameterOrFieldOrMethodExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4914:1: ( ruleParameterOrFieldOrMethodExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4915:1: ruleParameterOrFieldOrMethodExpression
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_rule__FieldAccessExpression__Group__0__Impl10072);
            ruleParameterOrFieldOrMethodExpression();

            state._fsp--;

             after(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__FieldAccessExpression__Group__0__Impl"


    // $ANTLR start "rule__FieldAccessExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4926:1: rule__FieldAccessExpression__Group__1 : rule__FieldAccessExpression__Group__1__Impl ;
    public final void rule__FieldAccessExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4930:1: ( rule__FieldAccessExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4931:2: rule__FieldAccessExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__1__Impl_in_rule__FieldAccessExpression__Group__110101);
            rule__FieldAccessExpression__Group__1__Impl();

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
    // $ANTLR end "rule__FieldAccessExpression__Group__1"


    // $ANTLR start "rule__FieldAccessExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4937:1: rule__FieldAccessExpression__Group__1__Impl : ( ( rule__FieldAccessExpression__Group_1__0 )* ) ;
    public final void rule__FieldAccessExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4941:1: ( ( ( rule__FieldAccessExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4942:1: ( ( rule__FieldAccessExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4942:1: ( ( rule__FieldAccessExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4943:1: ( rule__FieldAccessExpression__Group_1__0 )*
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4944:1: ( rule__FieldAccessExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==KEYWORD_10) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4944:2: rule__FieldAccessExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__0_in_rule__FieldAccessExpression__Group__1__Impl10128);
            	    rule__FieldAccessExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getFieldAccessExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FieldAccessExpression__Group__1__Impl"


    // $ANTLR start "rule__FieldAccessExpression__Group_1__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4958:1: rule__FieldAccessExpression__Group_1__0 : rule__FieldAccessExpression__Group_1__0__Impl rule__FieldAccessExpression__Group_1__1 ;
    public final void rule__FieldAccessExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4962:1: ( rule__FieldAccessExpression__Group_1__0__Impl rule__FieldAccessExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4963:2: rule__FieldAccessExpression__Group_1__0__Impl rule__FieldAccessExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__0__Impl_in_rule__FieldAccessExpression__Group_1__010163);
            rule__FieldAccessExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__1_in_rule__FieldAccessExpression__Group_1__010166);
            rule__FieldAccessExpression__Group_1__1();

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
    // $ANTLR end "rule__FieldAccessExpression__Group_1__0"


    // $ANTLR start "rule__FieldAccessExpression__Group_1__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4970:1: rule__FieldAccessExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__FieldAccessExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4974:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4975:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4975:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4976:1: ()
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4977:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4979:1: 
            {
            }

             after(grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldAccessExpression__Group_1__0__Impl"


    // $ANTLR start "rule__FieldAccessExpression__Group_1__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4989:1: rule__FieldAccessExpression__Group_1__1 : rule__FieldAccessExpression__Group_1__1__Impl rule__FieldAccessExpression__Group_1__2 ;
    public final void rule__FieldAccessExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4993:1: ( rule__FieldAccessExpression__Group_1__1__Impl rule__FieldAccessExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4994:2: rule__FieldAccessExpression__Group_1__1__Impl rule__FieldAccessExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__1__Impl_in_rule__FieldAccessExpression__Group_1__110224);
            rule__FieldAccessExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__2_in_rule__FieldAccessExpression__Group_1__110227);
            rule__FieldAccessExpression__Group_1__2();

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
    // $ANTLR end "rule__FieldAccessExpression__Group_1__1"


    // $ANTLR start "rule__FieldAccessExpression__Group_1__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5001:1: rule__FieldAccessExpression__Group_1__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__FieldAccessExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5005:1: ( ( KEYWORD_10 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5006:1: ( KEYWORD_10 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5006:1: ( KEYWORD_10 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5007:1: KEYWORD_10
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__FieldAccessExpression__Group_1__1__Impl10255); 
             after(grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__FieldAccessExpression__Group_1__1__Impl"


    // $ANTLR start "rule__FieldAccessExpression__Group_1__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5020:1: rule__FieldAccessExpression__Group_1__2 : rule__FieldAccessExpression__Group_1__2__Impl ;
    public final void rule__FieldAccessExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5024:1: ( rule__FieldAccessExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5025:2: rule__FieldAccessExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__2__Impl_in_rule__FieldAccessExpression__Group_1__210286);
            rule__FieldAccessExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__FieldAccessExpression__Group_1__2"


    // $ANTLR start "rule__FieldAccessExpression__Group_1__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5031:1: rule__FieldAccessExpression__Group_1__2__Impl : ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) ) ;
    public final void rule__FieldAccessExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5035:1: ( ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5036:1: ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5036:1: ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5037:1: ( rule__FieldAccessExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5038:1: ( rule__FieldAccessExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5038:2: rule__FieldAccessExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__RightAssignment_1_2_in_rule__FieldAccessExpression__Group_1__2__Impl10313);
            rule__FieldAccessExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccessExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__FieldAccessExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__Group_3__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5054:1: rule__ParameterOrFieldOrMethodExpression__Group_3__0 : rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl rule__ParameterOrFieldOrMethodExpression__Group_3__1 ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5058:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl rule__ParameterOrFieldOrMethodExpression__Group_3__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5059:2: rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl rule__ParameterOrFieldOrMethodExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__010349);
            rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__010352);
            rule__ParameterOrFieldOrMethodExpression__Group_3__1();

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__Group_3__0"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5066:1: rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl : ( KEYWORD_12 ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5070:1: ( ( KEYWORD_12 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5071:1: ( KEYWORD_12 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5071:1: ( KEYWORD_12 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5072:1: KEYWORD_12
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0()); 
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl10380); 
             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__Group_3__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5085:1: rule__ParameterOrFieldOrMethodExpression__Group_3__1 : rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5089:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5090:2: rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__110411);
            rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl();

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__Group_3__1"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5096:1: rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl : ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5100:1: ( ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5101:1: ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5101:1: ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5102:1: ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 )
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameAssignment_3_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5103:1: ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5103:2: rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl10438);
            rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameAssignment_3_1()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl"


    // $ANTLR start "rule__ParenthesesExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5117:1: rule__ParenthesesExpression__Group__0 : rule__ParenthesesExpression__Group__0__Impl rule__ParenthesesExpression__Group__1 ;
    public final void rule__ParenthesesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5121:1: ( rule__ParenthesesExpression__Group__0__Impl rule__ParenthesesExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5122:2: rule__ParenthesesExpression__Group__0__Impl rule__ParenthesesExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__0__Impl_in_rule__ParenthesesExpression__Group__010472);
            rule__ParenthesesExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__1_in_rule__ParenthesesExpression__Group__010475);
            rule__ParenthesesExpression__Group__1();

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
    // $ANTLR end "rule__ParenthesesExpression__Group__0"


    // $ANTLR start "rule__ParenthesesExpression__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5129:1: rule__ParenthesesExpression__Group__0__Impl : ( KEYWORD_4 ) ;
    public final void rule__ParenthesesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5133:1: ( ( KEYWORD_4 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5134:1: ( KEYWORD_4 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5134:1: ( KEYWORD_4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5135:1: KEYWORD_4
            {
             before(grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__ParenthesesExpression__Group__0__Impl10503); 
             after(grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ParenthesesExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesesExpression__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5148:1: rule__ParenthesesExpression__Group__1 : rule__ParenthesesExpression__Group__1__Impl rule__ParenthesesExpression__Group__2 ;
    public final void rule__ParenthesesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5152:1: ( rule__ParenthesesExpression__Group__1__Impl rule__ParenthesesExpression__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5153:2: rule__ParenthesesExpression__Group__1__Impl rule__ParenthesesExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__1__Impl_in_rule__ParenthesesExpression__Group__110534);
            rule__ParenthesesExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__2_in_rule__ParenthesesExpression__Group__110537);
            rule__ParenthesesExpression__Group__2();

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
    // $ANTLR end "rule__ParenthesesExpression__Group__1"


    // $ANTLR start "rule__ParenthesesExpression__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5160:1: rule__ParenthesesExpression__Group__1__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__ParenthesesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5164:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5165:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5165:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5166:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__ParenthesesExpression__Group__1__Impl10564);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParenthesesExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesesExpression__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5177:1: rule__ParenthesesExpression__Group__2 : rule__ParenthesesExpression__Group__2__Impl ;
    public final void rule__ParenthesesExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5181:1: ( rule__ParenthesesExpression__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5182:2: rule__ParenthesesExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__2__Impl_in_rule__ParenthesesExpression__Group__210593);
            rule__ParenthesesExpression__Group__2__Impl();

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
    // $ANTLR end "rule__ParenthesesExpression__Group__2"


    // $ANTLR start "rule__ParenthesesExpression__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5188:1: rule__ParenthesesExpression__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__ParenthesesExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5192:1: ( ( KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5193:1: ( KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5193:1: ( KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5194:1: KEYWORD_5
            {
             before(grammarAccess.getParenthesesExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__ParenthesesExpression__Group__2__Impl10621); 
             after(grammarAccess.getParenthesesExpressionAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ParenthesesExpression__Group__2__Impl"


    // $ANTLR start "rule__QualifiedIdentifier__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5214:1: rule__QualifiedIdentifier__Group__0 : rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1 ;
    public final void rule__QualifiedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5218:1: ( rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5219:2: rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__0__Impl_in_rule__QualifiedIdentifier__Group__010659);
            rule__QualifiedIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__1_in_rule__QualifiedIdentifier__Group__010662);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5226:1: rule__QualifiedIdentifier__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5230:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5231:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5231:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5232:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group__0__Impl10689); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5243:1: rule__QualifiedIdentifier__Group__1 : rule__QualifiedIdentifier__Group__1__Impl ;
    public final void rule__QualifiedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5247:1: ( rule__QualifiedIdentifier__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5248:2: rule__QualifiedIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__1__Impl_in_rule__QualifiedIdentifier__Group__110718);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5254:1: rule__QualifiedIdentifier__Group__1__Impl : ( ( rule__QualifiedIdentifier__Group_1__0 )* ) ;
    public final void rule__QualifiedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5258:1: ( ( ( rule__QualifiedIdentifier__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5259:1: ( ( rule__QualifiedIdentifier__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5259:1: ( ( rule__QualifiedIdentifier__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5260:1: ( rule__QualifiedIdentifier__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5261:1: ( rule__QualifiedIdentifier__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==KEYWORD_10) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5261:2: rule__QualifiedIdentifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__0_in_rule__QualifiedIdentifier__Group__1__Impl10745);
            	    rule__QualifiedIdentifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5275:1: rule__QualifiedIdentifier__Group_1__0 : rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1 ;
    public final void rule__QualifiedIdentifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5279:1: ( rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5280:2: rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__0__Impl_in_rule__QualifiedIdentifier__Group_1__010780);
            rule__QualifiedIdentifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__1_in_rule__QualifiedIdentifier__Group_1__010783);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5287:1: rule__QualifiedIdentifier__Group_1__0__Impl : ( KEYWORD_10 ) ;
    public final void rule__QualifiedIdentifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5291:1: ( ( KEYWORD_10 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5292:1: ( KEYWORD_10 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5292:1: ( KEYWORD_10 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5293:1: KEYWORD_10
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__QualifiedIdentifier__Group_1__0__Impl10811); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5306:1: rule__QualifiedIdentifier__Group_1__1 : rule__QualifiedIdentifier__Group_1__1__Impl ;
    public final void rule__QualifiedIdentifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5310:1: ( rule__QualifiedIdentifier__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5311:2: rule__QualifiedIdentifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__1__Impl_in_rule__QualifiedIdentifier__Group_1__110842);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5317:1: rule__QualifiedIdentifier__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedIdentifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5321:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5322:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5322:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5323:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group_1__1__Impl10869); 
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


    // $ANTLR start "rule__SingleStringJDOQL__SelectClauseAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5339:1: rule__SingleStringJDOQL__SelectClauseAssignment_0 : ( ruleSelectClause ) ;
    public final void rule__SingleStringJDOQL__SelectClauseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5343:1: ( ( ruleSelectClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5344:1: ( ruleSelectClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5344:1: ( ruleSelectClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5345:1: ruleSelectClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelectClause_in_rule__SingleStringJDOQL__SelectClauseAssignment_010907);
            ruleSelectClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__SelectClauseAssignment_0"


    // $ANTLR start "rule__SingleStringJDOQL__FromClauseAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5354:1: rule__SingleStringJDOQL__FromClauseAssignment_1 : ( ruleFromClause ) ;
    public final void rule__SingleStringJDOQL__FromClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5358:1: ( ( ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5359:1: ( ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5359:1: ( ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5360:1: ruleFromClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFromClause_in_rule__SingleStringJDOQL__FromClauseAssignment_110938);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getFromClauseFromClauseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__FromClauseAssignment_1"


    // $ANTLR start "rule__SingleStringJDOQL__WhereClauseAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5369:1: rule__SingleStringJDOQL__WhereClauseAssignment_2 : ( ruleWhereClause ) ;
    public final void rule__SingleStringJDOQL__WhereClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5373:1: ( ( ruleWhereClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5374:1: ( ruleWhereClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5374:1: ( ruleWhereClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5375:1: ruleWhereClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhereClause_in_rule__SingleStringJDOQL__WhereClauseAssignment_210969);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__WhereClauseAssignment_2"


    // $ANTLR start "rule__SingleStringJDOQL__VariablesClauseAssignment_3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5384:1: rule__SingleStringJDOQL__VariablesClauseAssignment_3 : ( ruleVariablesClause ) ;
    public final void rule__SingleStringJDOQL__VariablesClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5388:1: ( ( ruleVariablesClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5389:1: ( ruleVariablesClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5389:1: ( ruleVariablesClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5390:1: ruleVariablesClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseVariablesClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVariablesClause_in_rule__SingleStringJDOQL__VariablesClauseAssignment_311000);
            ruleVariablesClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseVariablesClauseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__VariablesClauseAssignment_3"


    // $ANTLR start "rule__SingleStringJDOQL__ParametersClauseAssignment_4"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5399:1: rule__SingleStringJDOQL__ParametersClauseAssignment_4 : ( ruleParametersClause ) ;
    public final void rule__SingleStringJDOQL__ParametersClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5403:1: ( ( ruleParametersClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5404:1: ( ruleParametersClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5404:1: ( ruleParametersClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5405:1: ruleParametersClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseParametersClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParametersClause_in_rule__SingleStringJDOQL__ParametersClauseAssignment_411031);
            ruleParametersClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseParametersClauseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__ParametersClauseAssignment_4"


    // $ANTLR start "rule__SingleStringJDOQL__ImportClauseAssignment_5"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5414:1: rule__SingleStringJDOQL__ImportClauseAssignment_5 : ( ruleImportClause ) ;
    public final void rule__SingleStringJDOQL__ImportClauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5418:1: ( ( ruleImportClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5419:1: ( ruleImportClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5419:1: ( ruleImportClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5420:1: ruleImportClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getImportClauseImportClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleImportClause_in_rule__SingleStringJDOQL__ImportClauseAssignment_511062);
            ruleImportClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getImportClauseImportClauseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__ImportClauseAssignment_5"


    // $ANTLR start "rule__SingleStringJDOQL__GroupByClauseAssignment_6"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5429:1: rule__SingleStringJDOQL__GroupByClauseAssignment_6 : ( ruleGroupByClause ) ;
    public final void rule__SingleStringJDOQL__GroupByClauseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5433:1: ( ( ruleGroupByClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5434:1: ( ruleGroupByClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5434:1: ( ruleGroupByClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5435:1: ruleGroupByClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseGroupByClauseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleGroupByClause_in_rule__SingleStringJDOQL__GroupByClauseAssignment_611093);
            ruleGroupByClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseGroupByClauseParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__GroupByClauseAssignment_6"


    // $ANTLR start "rule__SingleStringJDOQL__OrderByClauseAssignment_7"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5444:1: rule__SingleStringJDOQL__OrderByClauseAssignment_7 : ( ruleOrderByClause ) ;
    public final void rule__SingleStringJDOQL__OrderByClauseAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5448:1: ( ( ruleOrderByClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5449:1: ( ruleOrderByClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5449:1: ( ruleOrderByClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5450:1: ruleOrderByClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseOrderByClauseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleOrderByClause_in_rule__SingleStringJDOQL__OrderByClauseAssignment_711124);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseOrderByClauseParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__OrderByClauseAssignment_7"


    // $ANTLR start "rule__SingleStringJDOQL__RangeClauseAssignment_8"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5459:1: rule__SingleStringJDOQL__RangeClauseAssignment_8 : ( ruleRangeClause ) ;
    public final void rule__SingleStringJDOQL__RangeClauseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5463:1: ( ( ruleRangeClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5464:1: ( ruleRangeClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5464:1: ( ruleRangeClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5465:1: ruleRangeClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseRangeClauseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleRangeClause_in_rule__SingleStringJDOQL__RangeClauseAssignment_811155);
            ruleRangeClause();

            state._fsp--;

             after(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseRangeClauseParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__SingleStringJDOQL__RangeClauseAssignment_8"


    // $ANTLR start "rule__SelectClause__IsUniqueAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5474:1: rule__SelectClause__IsUniqueAssignment_2 : ( ( KEYWORD_43 ) ) ;
    public final void rule__SelectClause__IsUniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5478:1: ( ( ( KEYWORD_43 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5479:1: ( ( KEYWORD_43 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5479:1: ( ( KEYWORD_43 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5480:1: ( KEYWORD_43 )
            {
             before(grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5481:1: ( KEYWORD_43 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5482:1: KEYWORD_43
            {
             before(grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0()); 
            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__SelectClause__IsUniqueAssignment_211191); 
             after(grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0()); 

            }

             after(grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0()); 

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
    // $ANTLR end "rule__SelectClause__IsUniqueAssignment_2"


    // $ANTLR start "rule__SelectClause__ResultClauseAssignment_3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5497:1: rule__SelectClause__ResultClauseAssignment_3 : ( ruleResultClause ) ;
    public final void rule__SelectClause__ResultClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5501:1: ( ( ruleResultClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5502:1: ( ruleResultClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5502:1: ( ruleResultClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5503:1: ruleResultClause
            {
             before(grammarAccess.getSelectClauseAccess().getResultClauseResultClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleResultClause_in_rule__SelectClause__ResultClauseAssignment_311230);
            ruleResultClause();

            state._fsp--;

             after(grammarAccess.getSelectClauseAccess().getResultClauseResultClauseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SelectClause__ResultClauseAssignment_3"


    // $ANTLR start "rule__SelectClause__IntoClauseAssignment_4"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5512:1: rule__SelectClause__IntoClauseAssignment_4 : ( ruleIntoClause ) ;
    public final void rule__SelectClause__IntoClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5516:1: ( ( ruleIntoClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5517:1: ( ruleIntoClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5517:1: ( ruleIntoClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5518:1: ruleIntoClause
            {
             before(grammarAccess.getSelectClauseAccess().getIntoClauseIntoClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntoClause_in_rule__SelectClause__IntoClauseAssignment_411261);
            ruleIntoClause();

            state._fsp--;

             after(grammarAccess.getSelectClauseAccess().getIntoClauseIntoClauseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SelectClause__IntoClauseAssignment_4"


    // $ANTLR start "rule__ResultClause__IsDistinctAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5527:1: rule__ResultClause__IsDistinctAssignment_0 : ( ( KEYWORD_48 ) ) ;
    public final void rule__ResultClause__IsDistinctAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5531:1: ( ( ( KEYWORD_48 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5532:1: ( ( KEYWORD_48 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5532:1: ( ( KEYWORD_48 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5533:1: ( KEYWORD_48 )
            {
             before(grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5534:1: ( KEYWORD_48 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5535:1: KEYWORD_48
            {
             before(grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0()); 
            match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__ResultClause__IsDistinctAssignment_011297); 
             after(grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0()); 

            }

             after(grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0()); 

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
    // $ANTLR end "rule__ResultClause__IsDistinctAssignment_0"


    // $ANTLR start "rule__ResultClause__ResultSpecsAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5550:1: rule__ResultClause__ResultSpecsAssignment_1 : ( ruleResultSpec ) ;
    public final void rule__ResultClause__ResultSpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5554:1: ( ( ruleResultSpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5555:1: ( ruleResultSpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5555:1: ( ruleResultSpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5556:1: ruleResultSpec
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_111336);
            ruleResultSpec();

            state._fsp--;

             after(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__ResultClause__ResultSpecsAssignment_2_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5565:1: rule__ResultClause__ResultSpecsAssignment_2_1 : ( ruleResultSpec ) ;
    public final void rule__ResultClause__ResultSpecsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5569:1: ( ( ruleResultSpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5570:1: ( ruleResultSpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5570:1: ( ruleResultSpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5571:1: ruleResultSpec
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_2_111367);
            ruleResultSpec();

            state._fsp--;

             after(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ResultClause__ResultSpecsAssignment_2_1"


    // $ANTLR start "rule__IntoClause__ResultClassNameAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5580:1: rule__IntoClause__ResultClassNameAssignment_1 : ( ruleClassOrInterfaceName ) ;
    public final void rule__IntoClause__ResultClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5584:1: ( ( ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5585:1: ( ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5585:1: ( ruleClassOrInterfaceName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5586:1: ruleClassOrInterfaceName
            {
             before(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__IntoClause__ResultClassNameAssignment_111398);
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


    // $ANTLR start "rule__ResultSpec__ResultNamingAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5595:1: rule__ResultSpec__ResultNamingAssignment_1 : ( ruleResultNaming ) ;
    public final void rule__ResultSpec__ResultNamingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5599:1: ( ( ruleResultNaming ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5600:1: ( ruleResultNaming )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5600:1: ( ruleResultNaming )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5601:1: ruleResultNaming
            {
             before(grammarAccess.getResultSpecAccess().getResultNamingResultNamingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResultNaming_in_rule__ResultSpec__ResultNamingAssignment_111429);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5610:1: rule__ResultNaming__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResultNaming__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5614:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5615:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5615:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5616:1: RULE_ID
            {
             before(grammarAccess.getResultNamingAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResultNaming__IdentifierAssignment_111460); 
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


    // $ANTLR start "rule__FromClause__CandidateClassNameAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5625:1: rule__FromClause__CandidateClassNameAssignment_1 : ( ruleCandidateClassName ) ;
    public final void rule__FromClause__CandidateClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5629:1: ( ( ruleCandidateClassName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5630:1: ( ruleCandidateClassName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5630:1: ( ruleCandidateClassName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5631:1: ruleCandidateClassName
            {
             before(grammarAccess.getFromClauseAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCandidateClassName_in_rule__FromClause__CandidateClassNameAssignment_111491);
            ruleCandidateClassName();

            state._fsp--;

             after(grammarAccess.getFromClauseAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FromClause__CandidateClassNameAssignment_1"


    // $ANTLR start "rule__FromClause__IsExcludeSubclassesAssignment_2_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5640:1: rule__FromClause__IsExcludeSubclassesAssignment_2_0 : ( ( KEYWORD_46 ) ) ;
    public final void rule__FromClause__IsExcludeSubclassesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5644:1: ( ( ( KEYWORD_46 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5645:1: ( ( KEYWORD_46 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5645:1: ( ( KEYWORD_46 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5646:1: ( KEYWORD_46 )
            {
             before(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5647:1: ( KEYWORD_46 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5648:1: KEYWORD_46
            {
             before(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0()); 
            match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__FromClause__IsExcludeSubclassesAssignment_2_011527); 
             after(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0()); 

            }

             after(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0()); 

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
    // $ANTLR end "rule__FromClause__IsExcludeSubclassesAssignment_2_0"


    // $ANTLR start "rule__WhereClause__FilterAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5663:1: rule__WhereClause__FilterAssignment_1 : ( ruleConditionalOrExpression ) ;
    public final void rule__WhereClause__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5667:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5668:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5668:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5669:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getWhereClauseAccess().getFilterConditionalOrExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__WhereClause__FilterAssignment_111566);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getFilterConditionalOrExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhereClause__FilterAssignment_1"


    // $ANTLR start "rule__VariablesClause__VariableDeclarationsAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5678:1: rule__VariablesClause__VariableDeclarationsAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesClause__VariableDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5682:1: ( ( ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5683:1: ( ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5683:1: ( ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5684:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_111597);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariablesClause__VariableDeclarationsAssignment_1"


    // $ANTLR start "rule__VariablesClause__VariableDeclarationsAssignment_2_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5693:1: rule__VariablesClause__VariableDeclarationsAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesClause__VariableDeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5697:1: ( ( ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5698:1: ( ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5698:1: ( ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5699:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_2_111628);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VariablesClause__VariableDeclarationsAssignment_2_1"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5708:1: rule__VariableDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5712:1: ( ( ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5713:1: ( ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5713:1: ( ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5714:1: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_011659);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__VariableNameAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5723:1: rule__VariableDeclaration__VariableNameAssignment_1 : ( ruleVariableName ) ;
    public final void rule__VariableDeclaration__VariableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5727:1: ( ( ruleVariableName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5728:1: ( ruleVariableName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5728:1: ( ruleVariableName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5729:1: ruleVariableName
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableName_in_rule__VariableDeclaration__VariableNameAssignment_111690);
            ruleVariableName();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableDeclaration__VariableNameAssignment_1"


    // $ANTLR start "rule__ParametersClause__ParameterDeclarationsAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5738:1: rule__ParametersClause__ParameterDeclarationsAssignment_1 : ( ruleParameterDeclaration ) ;
    public final void rule__ParametersClause__ParameterDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5742:1: ( ( ruleParameterDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5743:1: ( ruleParameterDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5743:1: ( ruleParameterDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5744:1: ruleParameterDeclaration
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_111721);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParametersClause__ParameterDeclarationsAssignment_1"


    // $ANTLR start "rule__ParametersClause__ParameterDeclarationsAssignment_2_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5753:1: rule__ParametersClause__ParameterDeclarationsAssignment_2_1 : ( ruleParameterDeclaration ) ;
    public final void rule__ParametersClause__ParameterDeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5757:1: ( ( ruleParameterDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5758:1: ( ruleParameterDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5758:1: ( ruleParameterDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5759:1: ruleParameterDeclaration
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_2_111752);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ParametersClause__ParameterDeclarationsAssignment_2_1"


    // $ANTLR start "rule__ParameterDeclaration__TypeAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5768:1: rule__ParameterDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5772:1: ( ( ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5773:1: ( ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5773:1: ( ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5774:1: ruleType
            {
             before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_011783);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParameterDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__ParameterDeclaration__DeclaredParameterNameAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5783:1: rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 : ( ruleDeclaredParameterName ) ;
    public final void rule__ParameterDeclaration__DeclaredParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5787:1: ( ( ruleDeclaredParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5788:1: ( ruleDeclaredParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5788:1: ( ruleDeclaredParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5789:1: ruleDeclaredParameterName
            {
             before(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameDeclaredParameterNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_rule__ParameterDeclaration__DeclaredParameterNameAssignment_111814);
            ruleDeclaredParameterName();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameDeclaredParameterNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParameterDeclaration__DeclaredParameterNameAssignment_1"


    // $ANTLR start "rule__DeclaredParameterName__NameAssignment"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5798:1: rule__DeclaredParameterName__NameAssignment : ( ruleParameterName ) ;
    public final void rule__DeclaredParameterName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5802:1: ( ( ruleParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5803:1: ( ruleParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5803:1: ( ruleParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5804:1: ruleParameterName
            {
             before(grammarAccess.getDeclaredParameterNameAccess().getNameParameterNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleParameterName_in_rule__DeclaredParameterName__NameAssignment11845);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getDeclaredParameterNameAccess().getNameParameterNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__DeclaredParameterName__NameAssignment"


    // $ANTLR start "rule__ImportClause__ImportDeclarationsAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5813:1: rule__ImportClause__ImportDeclarationsAssignment_0 : ( ruleImportDeclaration ) ;
    public final void rule__ImportClause__ImportDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5817:1: ( ( ruleImportDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5818:1: ( ruleImportDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5818:1: ( ruleImportDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5819:1: ruleImportDeclaration
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_011876);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ImportClause__ImportDeclarationsAssignment_0"


    // $ANTLR start "rule__ImportClause__ImportDeclarationsAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5828:1: rule__ImportClause__ImportDeclarationsAssignment_1_1 : ( ruleImportDeclaration ) ;
    public final void rule__ImportClause__ImportDeclarationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5832:1: ( ( ruleImportDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5833:1: ( ruleImportDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5833:1: ( ruleImportDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5834:1: ruleImportDeclaration
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_1_111907);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ImportClause__ImportDeclarationsAssignment_1_1"


    // $ANTLR start "rule__ConditionalOrExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5843:1: rule__ConditionalOrExpression__RightAssignment_1_2 : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5847:1: ( ( ruleConditionalAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5848:1: ( ruleConditionalAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5848:1: ( ruleConditionalAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5849:1: ruleConditionalAndExpression
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getRightConditionalAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__RightAssignment_1_211938);
            ruleConditionalAndExpression();

            state._fsp--;

             after(grammarAccess.getConditionalOrExpressionAccess().getRightConditionalAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ConditionalOrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ConditionalAndExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5858:1: rule__ConditionalAndExpression__RightAssignment_1_2 : ( ruleSimpleOrExpression ) ;
    public final void rule__ConditionalAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5862:1: ( ( ruleSimpleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5863:1: ( ruleSimpleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5863:1: ( ruleSimpleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5864:1: ruleSimpleOrExpression
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getRightSimpleOrExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__RightAssignment_1_211969);
            ruleSimpleOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAndExpressionAccess().getRightSimpleOrExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ConditionalAndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__SimpleOrExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5873:1: rule__SimpleOrExpression__RightAssignment_1_2 : ( ruleSimpleAndExpression ) ;
    public final void rule__SimpleOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5877:1: ( ( ruleSimpleAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5878:1: ( ruleSimpleAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5878:1: ( ruleSimpleAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5879:1: ruleSimpleAndExpression
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getRightSimpleAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__RightAssignment_1_212000);
            ruleSimpleAndExpression();

            state._fsp--;

             after(grammarAccess.getSimpleOrExpressionAccess().getRightSimpleAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__SimpleOrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__SimpleAndExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5888:1: rule__SimpleAndExpression__RightAssignment_1_2 : ( ruleComparisonOperatorExpression ) ;
    public final void rule__SimpleAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5892:1: ( ( ruleComparisonOperatorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5893:1: ( ruleComparisonOperatorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5893:1: ( ruleComparisonOperatorExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5894:1: ruleComparisonOperatorExpression
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getRightComparisonOperatorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__RightAssignment_1_212031);
            ruleComparisonOperatorExpression();

            state._fsp--;

             after(grammarAccess.getSimpleAndExpressionAccess().getRightComparisonOperatorExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__SimpleAndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonOperatorExpression__OperatorAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5903:1: rule__ComparisonOperatorExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonOperatorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5907:1: ( ( ruleComparisonOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5908:1: ( ruleComparisonOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5908:1: ( ruleComparisonOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5909:1: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__ComparisonOperatorExpression__OperatorAssignment_1_112062);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ComparisonOperatorExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonOperatorExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5918:1: rule__ComparisonOperatorExpression__RightAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisonOperatorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5922:1: ( ( ruleAdditionExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5923:1: ( ruleAdditionExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5923:1: ( ruleAdditionExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5924:1: ruleAdditionExpression
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__RightAssignment_1_212093);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ComparisonOperatorExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AdditionExpression__OperatorAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5933:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5937:1: ( ( ruleAdditionOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5938:1: ( ruleAdditionOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5938:1: ( ruleAdditionOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5939:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_112124);
            ruleAdditionOperator();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5948:1: rule__AdditionExpression__RightAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5952:1: ( ( ruleMultiplicationExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5953:1: ( ruleMultiplicationExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5953:1: ( ruleMultiplicationExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5954:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__RightAssignment_1_212155);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AdditionExpression__RightAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__OperatorAssignment_1_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5963:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5967:1: ( ( ruleMultiplicationOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5968:1: ( ruleMultiplicationOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5968:1: ( ruleMultiplicationOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5969:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_112186);
            ruleMultiplicationOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MultiplicationExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5978:1: rule__MultiplicationExpression__RightAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5982:1: ( ( ruleUnaryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5983:1: ( ruleUnaryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5983:1: ( ruleUnaryExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5984:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__RightAssignment_1_212217);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MultiplicationExpression__RightAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__UnaryOperatorAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5993:1: rule__UnaryExpression__UnaryOperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__UnaryOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5997:1: ( ( ruleUnaryOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5998:1: ( ruleUnaryOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5998:1: ( ruleUnaryOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5999:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOperator_in_rule__UnaryExpression__UnaryOperatorAssignment_012248);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__UnaryExpression__UnaryOperatorAssignment_0"


    // $ANTLR start "rule__UnaryExpression__RightAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6008:1: rule__UnaryExpression__RightAssignment_1 : ( ruleFieldAccessExpression ) ;
    public final void rule__UnaryExpression__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6012:1: ( ( ruleFieldAccessExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6013:1: ( ruleFieldAccessExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6013:1: ( ruleFieldAccessExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6014:1: ruleFieldAccessExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_rule__UnaryExpression__RightAssignment_112279);
            ruleFieldAccessExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnaryExpression__RightAssignment_1"


    // $ANTLR start "rule__FieldAccessExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6023:1: rule__FieldAccessExpression__RightAssignment_1_2 : ( ruleFieldOrMethodExpression ) ;
    public final void rule__FieldAccessExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6027:1: ( ( ruleFieldOrMethodExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6028:1: ( ruleFieldOrMethodExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6028:1: ( ruleFieldOrMethodExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6029:1: ruleFieldOrMethodExpression
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_rule__FieldAccessExpression__RightAssignment_1_212310);
            ruleFieldOrMethodExpression();

            state._fsp--;

             after(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__FieldAccessExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6038:1: rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 : ( ruleLiteral ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6042:1: ( ( ruleLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6043:1: ( ruleLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6043:1: ( ruleLiteral )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6044:1: ruleLiteral
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_012341);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6053:1: rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 : ( ( KEYWORD_33 ) ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6057:1: ( ( ( KEYWORD_33 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6058:1: ( ( KEYWORD_33 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6058:1: ( ( KEYWORD_33 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6059:1: ( KEYWORD_33 )
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6060:1: ( KEYWORD_33 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6061:1: KEYWORD_33
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_112377); 
             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 

            }

             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__IdAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6076:1: rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6080:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6081:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6081:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6082:1: RULE_ID
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterOrFieldOrMethodExpression__IdAssignment_212416); 
             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__IdAssignment_2"


    // $ANTLR start "rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6091:1: rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 : ( ruleParameterName ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6095:1: ( ( ruleParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6096:1: ( ruleParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6096:1: ( ruleParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6097:1: ruleParameterName
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParameterName_in_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_112447);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1"


    // $ANTLR start "rule__FieldOrMethodExpression__LiteralAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6106:1: rule__FieldOrMethodExpression__LiteralAssignment_0 : ( ruleLiteral ) ;
    public final void rule__FieldOrMethodExpression__LiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6110:1: ( ( ruleLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6111:1: ( ruleLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6111:1: ( ruleLiteral )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6112:1: ruleLiteral
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__FieldOrMethodExpression__LiteralAssignment_012478);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FieldOrMethodExpression__LiteralAssignment_0"


    // $ANTLR start "rule__FieldOrMethodExpression__ThisAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6121:1: rule__FieldOrMethodExpression__ThisAssignment_1 : ( ( KEYWORD_33 ) ) ;
    public final void rule__FieldOrMethodExpression__ThisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6125:1: ( ( ( KEYWORD_33 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6126:1: ( ( KEYWORD_33 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6126:1: ( ( KEYWORD_33 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6127:1: ( KEYWORD_33 )
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6128:1: ( KEYWORD_33 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6129:1: KEYWORD_33
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__FieldOrMethodExpression__ThisAssignment_112514); 
             after(grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 

            }

             after(grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 

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
    // $ANTLR end "rule__FieldOrMethodExpression__ThisAssignment_1"


    // $ANTLR start "rule__FieldOrMethodExpression__IdAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6144:1: rule__FieldOrMethodExpression__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__FieldOrMethodExpression__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6148:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6149:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6149:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6150:1: RULE_ID
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldOrMethodExpression__IdAssignment_212553); 
             after(grammarAccess.getFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FieldOrMethodExpression__IdAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSingleStringJDOQL_in_entryRuleSingleStringJDOQL54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStringJDOQL61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__0_in_ruleSingleStringJDOQL91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__0_in_ruleSelectClause155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__0_in_ruleResultClause219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__0_in_ruleIntoClause283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__0_in_ruleResultSpec347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__0_in_ruleResultNaming411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__0_in_ruleFromClause475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__0_in_ruleWhereClause539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__0_in_ruleVariablesClause603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__0_in_ruleParametersClause794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameterName__NameAssignment_in_ruleDeclaredParameterName922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__0_in_ruleImportClause1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__0_in_ruleGroupByClause1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__0_in_ruleOrderByClause1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleRangeClause1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__0_in_ruleConditionalOrExpression1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__0_in_ruleConditionalAndExpression1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__0_in_ruleSimpleOrExpression1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__0_in_ruleSimpleAndExpression1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__0_in_ruleComparisonOperatorExpression1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__0_in_ruleUnaryExpression1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__0_in_ruleFieldAccessExpression1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Alternatives_in_ruleParameterOrFieldOrMethodExpression1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression1974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__Alternatives_in_ruleFieldOrMethodExpression2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__0_in_ruleParenthesesExpression2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType2168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType2232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegralType__Alternatives_in_ruleIntegralType2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType2360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatingPointType__Alternatives_in_ruleFloatingPointType2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleNullLiteral2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__0_in_ruleQualifiedIdentifier2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName2812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName2875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationOperator__Alternatives_in_ruleMultiplicationOperator3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__IdAssignment_2_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__LiteralAssignment_0_in_rule__FieldOrMethodExpression__Alternatives3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__ThisAssignment_1_in_rule__FieldOrMethodExpression__Alternatives3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__IdAssignment_2_in_rule__FieldOrMethodExpression__Alternatives3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_rule__FieldOrMethodExpression__Alternatives3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__Type__Alternatives3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__PrimitiveType__Alternatives3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__PrimitiveType__Alternatives3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_rule__NumericType__Alternatives3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_rule__NumericType__Alternatives3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__IntegralType__Alternatives3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__IntegralType__Alternatives3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__IntegralType__Alternatives3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__IntegralType__Alternatives3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__IntegralType__Alternatives3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__FloatingPointType__Alternatives3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__FloatingPointType__Alternatives3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__BooleanLiteral__Alternatives3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__BooleanLiteral__Alternatives3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__UnaryOperator__Alternatives3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__UnaryOperator__Alternatives3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__UnaryOperator__Alternatives3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__UnaryOperator__Alternatives3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__AdditionOperator__Alternatives3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__AdditionOperator__Alternatives3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__MultiplicationOperator__Alternatives3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__MultiplicationOperator__Alternatives3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__MultiplicationOperator__Alternatives3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__ComparisonOperator__Alternatives3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__ComparisonOperator__Alternatives3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__ComparisonOperator__Alternatives4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__ComparisonOperator__Alternatives4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__ComparisonOperator__Alternatives4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__ComparisonOperator__Alternatives4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__ComparisonOperator__Alternatives4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__0__Impl_in_rule__SingleStringJDOQL__Group__04117 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__1_in_rule__SingleStringJDOQL__Group__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__SelectClauseAssignment_0_in_rule__SingleStringJDOQL__Group__0__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__1__Impl_in_rule__SingleStringJDOQL__Group__14177 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__2_in_rule__SingleStringJDOQL__Group__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__FromClauseAssignment_1_in_rule__SingleStringJDOQL__Group__1__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__2__Impl_in_rule__SingleStringJDOQL__Group__24237 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__3_in_rule__SingleStringJDOQL__Group__24240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__WhereClauseAssignment_2_in_rule__SingleStringJDOQL__Group__2__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__3__Impl_in_rule__SingleStringJDOQL__Group__34298 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__4_in_rule__SingleStringJDOQL__Group__34301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__VariablesClauseAssignment_3_in_rule__SingleStringJDOQL__Group__3__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__4__Impl_in_rule__SingleStringJDOQL__Group__44359 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__5_in_rule__SingleStringJDOQL__Group__44362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__ParametersClauseAssignment_4_in_rule__SingleStringJDOQL__Group__4__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__5__Impl_in_rule__SingleStringJDOQL__Group__54420 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__6_in_rule__SingleStringJDOQL__Group__54423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__ImportClauseAssignment_5_in_rule__SingleStringJDOQL__Group__5__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__6__Impl_in_rule__SingleStringJDOQL__Group__64481 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__7_in_rule__SingleStringJDOQL__Group__64484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__GroupByClauseAssignment_6_in_rule__SingleStringJDOQL__Group__6__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__7__Impl_in_rule__SingleStringJDOQL__Group__74542 = new BitSet(new long[]{0x000000000007C090L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__8_in_rule__SingleStringJDOQL__Group__74545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__OrderByClauseAssignment_7_in_rule__SingleStringJDOQL__Group__7__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__8__Impl_in_rule__SingleStringJDOQL__Group__84603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__RangeClauseAssignment_8_in_rule__SingleStringJDOQL__Group__8__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__0__Impl_in_rule__SelectClause__Group__04679 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__1_in_rule__SelectClause__Group__04682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__1__Impl_in_rule__SelectClause__Group__14740 = new BitSet(new long[]{0x0784A48038881100L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__2_in_rule__SelectClause__Group__14743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__SelectClause__Group__1__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__2__Impl_in_rule__SelectClause__Group__24802 = new BitSet(new long[]{0x0784A48038881100L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__3_in_rule__SelectClause__Group__24805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__IsUniqueAssignment_2_in_rule__SelectClause__Group__2__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__3__Impl_in_rule__SelectClause__Group__34863 = new BitSet(new long[]{0x0784A48038881100L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__4_in_rule__SelectClause__Group__34866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__ResultClauseAssignment_3_in_rule__SelectClause__Group__3__Impl4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__4__Impl_in_rule__SelectClause__Group__44924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__IntoClauseAssignment_4_in_rule__SelectClause__Group__4__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__0__Impl_in_rule__ResultClause__Group__04992 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__1_in_rule__ResultClause__Group__04995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__IsDistinctAssignment_0_in_rule__ResultClause__Group__0__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__1__Impl_in_rule__ResultClause__Group__15053 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__2_in_rule__ResultClause__Group__15056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__ResultSpecsAssignment_1_in_rule__ResultClause__Group__1__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__2__Impl_in_rule__ResultClause__Group__25113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__0_in_rule__ResultClause__Group__2__Impl5140 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__0__Impl_in_rule__ResultClause__Group_2__05177 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__1_in_rule__ResultClause__Group_2__05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ResultClause__Group_2__0__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__1__Impl_in_rule__ResultClause__Group_2__15239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__ResultSpecsAssignment_2_1_in_rule__ResultClause__Group_2__1__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__0__Impl_in_rule__IntoClause__Group__05300 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__1_in_rule__IntoClause__Group__05303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__IntoClause__Group__0__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__1__Impl_in_rule__IntoClause__Group__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__ResultClassNameAssignment_1_in_rule__IntoClause__Group__1__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__0__Impl_in_rule__ResultSpec__Group__05423 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__1_in_rule__ResultSpec__Group__05426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__ResultSpec__Group__0__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__1__Impl_in_rule__ResultSpec__Group__15482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__ResultNamingAssignment_1_in_rule__ResultSpec__Group__1__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__0__Impl_in_rule__ResultNaming__Group__05544 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__1_in_rule__ResultNaming__Group__05547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__ResultNaming__Group__0__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__1__Impl_in_rule__ResultNaming__Group__15606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__IdentifierAssignment_1_in_rule__ResultNaming__Group__1__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__0__Impl_in_rule__FromClause__Group__05667 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__FromClause__Group__1_in_rule__FromClause__Group__05670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__FromClause__Group__0__Impl5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__1__Impl_in_rule__FromClause__Group__15729 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__FromClause__Group__2_in_rule__FromClause__Group__15732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__CandidateClassNameAssignment_1_in_rule__FromClause__Group__1__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__2__Impl_in_rule__FromClause__Group__25789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__0_in_rule__FromClause__Group__2__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__0__Impl_in_rule__FromClause__Group_2__05853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__1_in_rule__FromClause__Group_2__05856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__IsExcludeSubclassesAssignment_2_0_in_rule__FromClause__Group_2__0__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__1__Impl_in_rule__FromClause__Group_2__15913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__FromClause__Group_2__1__Impl5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__0__Impl_in_rule__WhereClause__Group__05976 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__1_in_rule__WhereClause__Group__05979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__WhereClause__Group__0__Impl6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__1__Impl_in_rule__WhereClause__Group__16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__FilterAssignment_1_in_rule__WhereClause__Group__1__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__0__Impl_in_rule__VariablesClause__Group__06099 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__1_in_rule__VariablesClause__Group__06102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__VariablesClause__Group__0__Impl6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__1__Impl_in_rule__VariablesClause__Group__16161 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__2_in_rule__VariablesClause__Group__16164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_1_in_rule__VariablesClause__Group__1__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__2__Impl_in_rule__VariablesClause__Group__26221 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__3_in_rule__VariablesClause__Group__26224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__0_in_rule__VariablesClause__Group__2__Impl6251 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__3__Impl_in_rule__VariablesClause__Group__36282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group__3__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__0__Impl_in_rule__VariablesClause__Group_2__06352 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__1_in_rule__VariablesClause__Group_2__06355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group_2__0__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__1__Impl_in_rule__VariablesClause__Group_2__16414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_2_1_in_rule__VariablesClause__Group_2__1__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__06475 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__06478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__16535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__VariableNameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__0__Impl_in_rule__ParametersClause__Group__06596 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__1_in_rule__ParametersClause__Group__06599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__ParametersClause__Group__0__Impl6627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__1__Impl_in_rule__ParametersClause__Group__16658 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__2_in_rule__ParametersClause__Group__16661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_1_in_rule__ParametersClause__Group__1__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__2__Impl_in_rule__ParametersClause__Group__26718 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__3_in_rule__ParametersClause__Group__26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__0_in_rule__ParametersClause__Group__2__Impl6748 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__3__Impl_in_rule__ParametersClause__Group__36779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group__3__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__0__Impl_in_rule__ParametersClause__Group_2__06849 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__1_in_rule__ParametersClause__Group_2__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group_2__0__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__1__Impl_in_rule__ParametersClause__Group_2__16911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_2_1_in_rule__ParametersClause__Group_2__1__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06972 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__TypeAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__17032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__DeclaredParameterNameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__0__Impl_in_rule__ImportClause__Group__07093 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__1_in_rule__ImportClause__Group__07096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_0_in_rule__ImportClause__Group__0__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__1__Impl_in_rule__ImportClause__Group__17153 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__2_in_rule__ImportClause__Group__17156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__0_in_rule__ImportClause__Group__1__Impl7183 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__2__Impl_in_rule__ImportClause__Group__27214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__ImportClause__Group__2__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__0__Impl_in_rule__ImportClause__Group_1__07282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__1_in_rule__ImportClause__Group_1__07285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__ImportClause__Group_1__0__Impl7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__1__Impl_in_rule__ImportClause__Group_1__17344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_1_1_in_rule__ImportClause__Group_1__1__Impl7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__07405 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__07408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__ImportDeclaration__Group__0__Impl7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_rule__ImportDeclaration__Group__1__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__0__Impl_in_rule__GroupByClause__Group__07527 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__1_in_rule__GroupByClause__Group__07530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__GroupByClause__Group__0__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__1__Impl_in_rule__GroupByClause__Group__17589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__GroupByClause__Group__1__Impl7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__0__Impl_in_rule__OrderByClause__Group__07652 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__1_in_rule__OrderByClause__Group__07655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__OrderByClause__Group__0__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__1__Impl_in_rule__OrderByClause__Group__17714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__OrderByClause__Group__1__Impl7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__0__Impl_in_rule__ConditionalOrExpression__Group__07777 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__1_in_rule__ConditionalOrExpression__Group__07780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__Group__0__Impl7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__1__Impl_in_rule__ConditionalOrExpression__Group__17836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__0_in_rule__ConditionalOrExpression__Group__1__Impl7863 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__0__Impl_in_rule__ConditionalOrExpression__Group_1__07898 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__1_in_rule__ConditionalOrExpression__Group_1__07901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__1__Impl_in_rule__ConditionalOrExpression__Group_1__17959 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__2_in_rule__ConditionalOrExpression__Group_1__17962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__ConditionalOrExpression__Group_1__1__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__2__Impl_in_rule__ConditionalOrExpression__Group_1__28021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__RightAssignment_1_2_in_rule__ConditionalOrExpression__Group_1__2__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__0__Impl_in_rule__ConditionalAndExpression__Group__08084 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__1_in_rule__ConditionalAndExpression__Group__08087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__Group__0__Impl8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__1__Impl_in_rule__ConditionalAndExpression__Group__18143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__0_in_rule__ConditionalAndExpression__Group__1__Impl8170 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__0__Impl_in_rule__ConditionalAndExpression__Group_1__08205 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__1_in_rule__ConditionalAndExpression__Group_1__08208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__1__Impl_in_rule__ConditionalAndExpression__Group_1__18266 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__2_in_rule__ConditionalAndExpression__Group_1__18269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__ConditionalAndExpression__Group_1__1__Impl8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__2__Impl_in_rule__ConditionalAndExpression__Group_1__28328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__RightAssignment_1_2_in_rule__ConditionalAndExpression__Group_1__2__Impl8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__0__Impl_in_rule__SimpleOrExpression__Group__08391 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__1_in_rule__SimpleOrExpression__Group__08394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__Group__0__Impl8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__1__Impl_in_rule__SimpleOrExpression__Group__18450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__0_in_rule__SimpleOrExpression__Group__1__Impl8477 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__0__Impl_in_rule__SimpleOrExpression__Group_1__08512 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__1_in_rule__SimpleOrExpression__Group_1__08515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__1__Impl_in_rule__SimpleOrExpression__Group_1__18573 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__2_in_rule__SimpleOrExpression__Group_1__18576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__SimpleOrExpression__Group_1__1__Impl8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__2__Impl_in_rule__SimpleOrExpression__Group_1__28635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__RightAssignment_1_2_in_rule__SimpleOrExpression__Group_1__2__Impl8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__0__Impl_in_rule__SimpleAndExpression__Group__08698 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__1_in_rule__SimpleAndExpression__Group__08701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__Group__0__Impl8728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__1__Impl_in_rule__SimpleAndExpression__Group__18757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__0_in_rule__SimpleAndExpression__Group__1__Impl8784 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__0__Impl_in_rule__SimpleAndExpression__Group_1__08819 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__1_in_rule__SimpleAndExpression__Group_1__08822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__1__Impl_in_rule__SimpleAndExpression__Group_1__18880 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__2_in_rule__SimpleAndExpression__Group_1__18883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SimpleAndExpression__Group_1__1__Impl8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__2__Impl_in_rule__SimpleAndExpression__Group_1__28942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__RightAssignment_1_2_in_rule__SimpleAndExpression__Group_1__2__Impl8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__0__Impl_in_rule__ComparisonOperatorExpression__Group__09005 = new BitSet(new long[]{0x0030000E80000040L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__1_in_rule__ComparisonOperatorExpression__Group__09008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__Group__0__Impl9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__1__Impl_in_rule__ComparisonOperatorExpression__Group__19064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__0_in_rule__ComparisonOperatorExpression__Group__1__Impl9091 = new BitSet(new long[]{0x0030000E80000042L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__0__Impl_in_rule__ComparisonOperatorExpression__Group_1__09126 = new BitSet(new long[]{0x0030000E80000040L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__1_in_rule__ComparisonOperatorExpression__Group_1__09129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__1__Impl_in_rule__ComparisonOperatorExpression__Group_1__19187 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__2_in_rule__ComparisonOperatorExpression__Group_1__19190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__OperatorAssignment_1_1_in_rule__ComparisonOperatorExpression__Group_1__1__Impl9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__2__Impl_in_rule__ComparisonOperatorExpression__Group_1__29247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__RightAssignment_1_2_in_rule__ComparisonOperatorExpression__Group_1__2__Impl9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__09310 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__09313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl9340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__19369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl9396 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__09431 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__09434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__19492 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__19495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__29552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__RightAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__09615 = new BitSet(new long[]{0x0002110000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__09618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__Group__0__Impl9645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__19674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl9701 = new BitSet(new long[]{0x0002110000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__09736 = new BitSet(new long[]{0x0002110000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__09739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__19797 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__19800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl9827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__29857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__RightAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__0__Impl_in_rule__UnaryExpression__Group__09920 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__1_in_rule__UnaryExpression__Group__09923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__UnaryOperatorAssignment_0_in_rule__UnaryExpression__Group__0__Impl9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__1__Impl_in_rule__UnaryExpression__Group__19981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__RightAssignment_1_in_rule__UnaryExpression__Group__1__Impl10008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__0__Impl_in_rule__FieldAccessExpression__Group__010042 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__1_in_rule__FieldAccessExpression__Group__010045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_rule__FieldAccessExpression__Group__0__Impl10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__1__Impl_in_rule__FieldAccessExpression__Group__110101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__0_in_rule__FieldAccessExpression__Group__1__Impl10128 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__0__Impl_in_rule__FieldAccessExpression__Group_1__010163 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__1_in_rule__FieldAccessExpression__Group_1__010166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__1__Impl_in_rule__FieldAccessExpression__Group_1__110224 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__2_in_rule__FieldAccessExpression__Group_1__110227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__FieldAccessExpression__Group_1__1__Impl10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__2__Impl_in_rule__FieldAccessExpression__Group_1__210286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__RightAssignment_1_2_in_rule__FieldAccessExpression__Group_1__2__Impl10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__010349 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__010352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__110411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__0__Impl_in_rule__ParenthesesExpression__Group__010472 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__1_in_rule__ParenthesesExpression__Group__010475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__ParenthesesExpression__Group__0__Impl10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__1__Impl_in_rule__ParenthesesExpression__Group__110534 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__2_in_rule__ParenthesesExpression__Group__110537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__ParenthesesExpression__Group__1__Impl10564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__2__Impl_in_rule__ParenthesesExpression__Group__210593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__ParenthesesExpression__Group__2__Impl10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__0__Impl_in_rule__QualifiedIdentifier__Group__010659 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__1_in_rule__QualifiedIdentifier__Group__010662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group__0__Impl10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__1__Impl_in_rule__QualifiedIdentifier__Group__110718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__0_in_rule__QualifiedIdentifier__Group__1__Impl10745 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__0__Impl_in_rule__QualifiedIdentifier__Group_1__010780 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__1_in_rule__QualifiedIdentifier__Group_1__010783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__QualifiedIdentifier__Group_1__0__Impl10811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__1__Impl_in_rule__QualifiedIdentifier__Group_1__110842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group_1__1__Impl10869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_rule__SingleStringJDOQL__SelectClauseAssignment_010907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_rule__SingleStringJDOQL__FromClauseAssignment_110938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_rule__SingleStringJDOQL__WhereClauseAssignment_210969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_rule__SingleStringJDOQL__VariablesClauseAssignment_311000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_rule__SingleStringJDOQL__ParametersClauseAssignment_411031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_rule__SingleStringJDOQL__ImportClauseAssignment_511062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_rule__SingleStringJDOQL__GroupByClauseAssignment_611093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_rule__SingleStringJDOQL__OrderByClauseAssignment_711124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_rule__SingleStringJDOQL__RangeClauseAssignment_811155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__SelectClause__IsUniqueAssignment_211191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_rule__SelectClause__ResultClauseAssignment_311230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_rule__SelectClause__IntoClauseAssignment_411261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__ResultClause__IsDistinctAssignment_011297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_111336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_2_111367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__IntoClause__ResultClassNameAssignment_111398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_rule__ResultSpec__ResultNamingAssignment_111429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResultNaming__IdentifierAssignment_111460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_rule__FromClause__CandidateClassNameAssignment_111491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__FromClause__IsExcludeSubclassesAssignment_2_011527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__WhereClause__FilterAssignment_111566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_111597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_2_111628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_011659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_rule__VariableDeclaration__VariableNameAssignment_111690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_111721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_2_111752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_011783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_rule__ParameterDeclaration__DeclaredParameterNameAssignment_111814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_rule__DeclaredParameterName__NameAssignment11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_011876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_1_111907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__RightAssignment_1_211938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__RightAssignment_1_211969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__RightAssignment_1_212000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__RightAssignment_1_212031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__ComparisonOperatorExpression__OperatorAssignment_1_112062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__RightAssignment_1_212093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_112124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__RightAssignment_1_212155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_112186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__RightAssignment_1_212217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryExpression__UnaryOperatorAssignment_012248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_rule__UnaryExpression__RightAssignment_112279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_rule__FieldAccessExpression__RightAssignment_1_212310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_012341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_112377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterOrFieldOrMethodExpression__IdAssignment_212416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_112447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__FieldOrMethodExpression__LiteralAssignment_012478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__FieldOrMethodExpression__ThisAssignment_112514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldOrMethodExpression__IdAssignment_212553 = new BitSet(new long[]{0x0000000000000002L});

}