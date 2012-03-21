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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_52", "KEYWORD_53", "KEYWORD_51", "KEYWORD_49", "KEYWORD_50", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_26", "KEYWORD_27", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=61;
    public static final int RULE_ANY_OTHER=67;
    public static final int KEYWORD_56=6;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_55=5;
    public static final int KEYWORD_54=4;
    public static final int KEYWORD_17=60;
    public static final int KEYWORD_18=36;
    public static final int KEYWORD_53=9;
    public static final int KEYWORD_52=8;
    public static final int KEYWORD_15=58;
    public static final int KEYWORD_51=10;
    public static final int KEYWORD_16=59;
    public static final int KEYWORD_50=12;
    public static final int KEYWORD_13=56;
    public static final int KEYWORD_14=57;
    public static final int KEYWORD_11=54;
    public static final int EOF=-1;
    public static final int KEYWORD_12=55;
    public static final int KEYWORD_10=53;
    public static final int KEYWORD_57=7;
    public static final int KEYWORD_6=49;
    public static final int KEYWORD_7=50;
    public static final int KEYWORD_8=51;
    public static final int KEYWORD_9=52;
    public static final int KEYWORD_28=25;
    public static final int KEYWORD_29=26;
    public static final int RULE_INT=62;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_25=43;
    public static final int KEYWORD_26=34;
    public static final int KEYWORD_27=35;
    public static final int KEYWORD_20=38;
    public static final int KEYWORD_21=39;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_1=44;
    public static final int KEYWORD_30=27;
    public static final int KEYWORD_5=48;
    public static final int KEYWORD_34=31;
    public static final int KEYWORD_33=30;
    public static final int KEYWORD_4=47;
    public static final int KEYWORD_32=29;
    public static final int KEYWORD_3=46;
    public static final int KEYWORD_31=28;
    public static final int KEYWORD_2=45;
    public static final int KEYWORD_38=19;
    public static final int KEYWORD_37=18;
    public static final int RULE_SL_COMMENT=65;
    public static final int KEYWORD_36=33;
    public static final int KEYWORD_35=32;
    public static final int RULE_ML_COMMENT=64;
    public static final int KEYWORD_39=20;
    public static final int RULE_STRING=63;
    public static final int KEYWORD_41=22;
    public static final int KEYWORD_40=21;
    public static final int KEYWORD_43=24;
    public static final int KEYWORD_42=23;
    public static final int KEYWORD_45=14;
    public static final int KEYWORD_44=13;
    public static final int KEYWORD_47=16;
    public static final int RULE_WS=66;
    public static final int KEYWORD_46=15;
    public static final int KEYWORD_49=11;
    public static final int KEYWORD_48=17;

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
    		tokenNameToValue.put("KEYWORD_26", "'ASC'");
    		tokenNameToValue.put("KEYWORD_27", "'int'");
    		tokenNameToValue.put("KEYWORD_28", "'DESC'");
    		tokenNameToValue.put("KEYWORD_29", "'FROM'");
    		tokenNameToValue.put("KEYWORD_30", "'INTO'");
    		tokenNameToValue.put("KEYWORD_31", "'byte'");
    		tokenNameToValue.put("KEYWORD_32", "'char'");
    		tokenNameToValue.put("KEYWORD_33", "'long'");
    		tokenNameToValue.put("KEYWORD_34", "'null'");
    		tokenNameToValue.put("KEYWORD_35", "'this'");
    		tokenNameToValue.put("KEYWORD_36", "'true'");
    		tokenNameToValue.put("KEYWORD_37", "'GROUP'");
    		tokenNameToValue.put("KEYWORD_38", "'ORDER'");
    		tokenNameToValue.put("KEYWORD_39", "'RANGE'");
    		tokenNameToValue.put("KEYWORD_40", "'WHERE'");
    		tokenNameToValue.put("KEYWORD_41", "'false'");
    		tokenNameToValue.put("KEYWORD_42", "'float'");
    		tokenNameToValue.put("KEYWORD_43", "'short'");
    		tokenNameToValue.put("KEYWORD_44", "'HAVING'");
    		tokenNameToValue.put("KEYWORD_45", "'SELECT'");
    		tokenNameToValue.put("KEYWORD_46", "'UNIQUE'");
    		tokenNameToValue.put("KEYWORD_47", "'double'");
    		tokenNameToValue.put("KEYWORD_48", "'import'");
    		tokenNameToValue.put("KEYWORD_49", "'EXCLUDE'");
    		tokenNameToValue.put("KEYWORD_50", "'boolean'");
    		tokenNameToValue.put("KEYWORD_51", "'DISTINCT'");
    		tokenNameToValue.put("KEYWORD_52", "'ASCENDING'");
    		tokenNameToValue.put("KEYWORD_53", "'VARIABLES'");
    		tokenNameToValue.put("KEYWORD_54", "'DESCENDING'");
    		tokenNameToValue.put("KEYWORD_55", "'PARAMETERS'");
    		tokenNameToValue.put("KEYWORD_56", "'SUBCLASSES'");
    		tokenNameToValue.put("KEYWORD_57", "'instanceof'");
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:120:1: entryRuleSingleStringJDOQL : ruleSingleStringJDOQL EOF ;
    public final void entryRuleSingleStringJDOQL() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:121:1: ( ruleSingleStringJDOQL EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:122:1: ruleSingleStringJDOQL EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:129:1: ruleSingleStringJDOQL : ( ( rule__SingleStringJDOQL__Group__0 ) ) ;
    public final void ruleSingleStringJDOQL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:133:5: ( ( ( rule__SingleStringJDOQL__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:134:1: ( ( rule__SingleStringJDOQL__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:134:1: ( ( rule__SingleStringJDOQL__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:135:1: ( rule__SingleStringJDOQL__Group__0 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:136:1: ( rule__SingleStringJDOQL__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:136:2: rule__SingleStringJDOQL__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:148:1: entryRuleSelectClause : ruleSelectClause EOF ;
    public final void entryRuleSelectClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:149:1: ( ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:150:1: ruleSelectClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:157:1: ruleSelectClause : ( ( rule__SelectClause__Group__0 ) ) ;
    public final void ruleSelectClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:161:5: ( ( ( rule__SelectClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:162:1: ( ( rule__SelectClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:162:1: ( ( rule__SelectClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:163:1: ( rule__SelectClause__Group__0 )
            {
             before(grammarAccess.getSelectClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:164:1: ( rule__SelectClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:164:2: rule__SelectClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:176:1: entryRuleResultClause : ruleResultClause EOF ;
    public final void entryRuleResultClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:177:1: ( ruleResultClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:178:1: ruleResultClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:185:1: ruleResultClause : ( ( rule__ResultClause__Group__0 ) ) ;
    public final void ruleResultClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:189:5: ( ( ( rule__ResultClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:190:1: ( ( rule__ResultClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:190:1: ( ( rule__ResultClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:191:1: ( rule__ResultClause__Group__0 )
            {
             before(grammarAccess.getResultClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:192:1: ( rule__ResultClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:192:2: rule__ResultClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:204:1: entryRuleIntoClause : ruleIntoClause EOF ;
    public final void entryRuleIntoClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:205:1: ( ruleIntoClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:206:1: ruleIntoClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:213:1: ruleIntoClause : ( ( rule__IntoClause__Group__0 ) ) ;
    public final void ruleIntoClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:217:5: ( ( ( rule__IntoClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:218:1: ( ( rule__IntoClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:218:1: ( ( rule__IntoClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:219:1: ( rule__IntoClause__Group__0 )
            {
             before(grammarAccess.getIntoClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:220:1: ( rule__IntoClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:220:2: rule__IntoClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:232:1: entryRuleResultSpec : ruleResultSpec EOF ;
    public final void entryRuleResultSpec() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:233:1: ( ruleResultSpec EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:234:1: ruleResultSpec EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:241:1: ruleResultSpec : ( ( rule__ResultSpec__Group__0 ) ) ;
    public final void ruleResultSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:245:5: ( ( ( rule__ResultSpec__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:246:1: ( ( rule__ResultSpec__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:246:1: ( ( rule__ResultSpec__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:247:1: ( rule__ResultSpec__Group__0 )
            {
             before(grammarAccess.getResultSpecAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:248:1: ( rule__ResultSpec__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:248:2: rule__ResultSpec__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:260:1: entryRuleResultNaming : ruleResultNaming EOF ;
    public final void entryRuleResultNaming() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:261:1: ( ruleResultNaming EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:262:1: ruleResultNaming EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:269:1: ruleResultNaming : ( ( rule__ResultNaming__Group__0 ) ) ;
    public final void ruleResultNaming() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:273:5: ( ( ( rule__ResultNaming__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:274:1: ( ( rule__ResultNaming__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:274:1: ( ( rule__ResultNaming__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:275:1: ( rule__ResultNaming__Group__0 )
            {
             before(grammarAccess.getResultNamingAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:276:1: ( rule__ResultNaming__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:276:2: rule__ResultNaming__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:288:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:289:1: ( ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:290:1: ruleFromClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:297:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:301:5: ( ( ( rule__FromClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:302:1: ( ( rule__FromClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:302:1: ( ( rule__FromClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:303:1: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:304:1: ( rule__FromClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:304:2: rule__FromClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:316:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:317:1: ( ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:318:1: ruleWhereClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:325:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:329:5: ( ( ( rule__WhereClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:330:1: ( ( rule__WhereClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:330:1: ( ( rule__WhereClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:331:1: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:332:1: ( rule__WhereClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:332:2: rule__WhereClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:344:1: entryRuleVariablesClause : ruleVariablesClause EOF ;
    public final void entryRuleVariablesClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:345:1: ( ruleVariablesClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:346:1: ruleVariablesClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:353:1: ruleVariablesClause : ( ( rule__VariablesClause__Group__0 ) ) ;
    public final void ruleVariablesClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:357:5: ( ( ( rule__VariablesClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:358:1: ( ( rule__VariablesClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:358:1: ( ( rule__VariablesClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:359:1: ( rule__VariablesClause__Group__0 )
            {
             before(grammarAccess.getVariablesClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:360:1: ( rule__VariablesClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:360:2: rule__VariablesClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:372:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:373:1: ( ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:374:1: ruleVariableDeclaration EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:381:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:385:5: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:386:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:386:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:387:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:388:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:388:2: rule__VariableDeclaration__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:400:1: entryRuleVariableName : ruleVariableName EOF ;
    public final void entryRuleVariableName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:401:1: ( ruleVariableName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:402:1: ruleVariableName EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:409:1: ruleVariableName : ( RULE_ID ) ;
    public final void ruleVariableName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:413:5: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:414:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:414:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:415:1: RULE_ID
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:428:1: entryRuleParametersClause : ruleParametersClause EOF ;
    public final void entryRuleParametersClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:429:1: ( ruleParametersClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:430:1: ruleParametersClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:437:1: ruleParametersClause : ( ( rule__ParametersClause__Group__0 ) ) ;
    public final void ruleParametersClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:441:5: ( ( ( rule__ParametersClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:442:1: ( ( rule__ParametersClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:442:1: ( ( rule__ParametersClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:443:1: ( rule__ParametersClause__Group__0 )
            {
             before(grammarAccess.getParametersClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:444:1: ( rule__ParametersClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:444:2: rule__ParametersClause__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:456:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:457:1: ( ruleParameterDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:458:1: ruleParameterDeclaration EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:465:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:469:5: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:470:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:470:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:471:1: ( rule__ParameterDeclaration__Group__0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:472:1: ( rule__ParameterDeclaration__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:472:2: rule__ParameterDeclaration__Group__0
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:484:1: entryRuleDeclaredParameterName : ruleDeclaredParameterName EOF ;
    public final void entryRuleDeclaredParameterName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:485:1: ( ruleDeclaredParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:486:1: ruleDeclaredParameterName EOF
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:493:1: ruleDeclaredParameterName : ( ruleParameterName ) ;
    public final void ruleDeclaredParameterName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:497:5: ( ( ruleParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:498:1: ( ruleParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:498:1: ( ruleParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:499:1: ruleParameterName
            {
             before(grammarAccess.getDeclaredParameterNameAccess().getParameterNameParserRuleCall()); 
            pushFollow(FOLLOW_ruleParameterName_in_ruleDeclaredParameterName922);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getDeclaredParameterNameAccess().getParameterNameParserRuleCall()); 

            }


            }

        }
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:512:1: entryRuleParameterName : ruleParameterName EOF ;
    public final void entryRuleParameterName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:513:1: ( ruleParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:514:1: ruleParameterName EOF
            {
             before(grammarAccess.getParameterNameRule()); 
            pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName948);
            ruleParameterName();

            state._fsp--;

             after(grammarAccess.getParameterNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName955); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:521:1: ruleParameterName : ( RULE_ID ) ;
    public final void ruleParameterName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:525:5: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:526:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:526:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:527:1: RULE_ID
            {
             before(grammarAccess.getParameterNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName985); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:540:1: entryRuleImportClause : ruleImportClause EOF ;
    public final void entryRuleImportClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:541:1: ( ruleImportClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:542:1: ruleImportClause EOF
            {
             before(grammarAccess.getImportClauseRule()); 
            pushFollow(FOLLOW_ruleImportClause_in_entryRuleImportClause1011);
            ruleImportClause();

            state._fsp--;

             after(grammarAccess.getImportClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportClause1018); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:549:1: ruleImportClause : ( ( rule__ImportClause__Group__0 ) ) ;
    public final void ruleImportClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:553:5: ( ( ( rule__ImportClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:554:1: ( ( rule__ImportClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:554:1: ( ( rule__ImportClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:555:1: ( rule__ImportClause__Group__0 )
            {
             before(grammarAccess.getImportClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:556:1: ( rule__ImportClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:556:2: rule__ImportClause__Group__0
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__0_in_ruleImportClause1048);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:568:1: entryRuleImportDeclaration : ruleImportDeclaration EOF ;
    public final void entryRuleImportDeclaration() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:569:1: ( ruleImportDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:570:1: ruleImportDeclaration EOF
            {
             before(grammarAccess.getImportDeclarationRule()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1075);
            ruleImportDeclaration();

            state._fsp--;

             after(grammarAccess.getImportDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration1082); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:577:1: ruleImportDeclaration : ( ( rule__ImportDeclaration__Group__0 ) ) ;
    public final void ruleImportDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:581:5: ( ( ( rule__ImportDeclaration__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:582:1: ( ( rule__ImportDeclaration__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:582:1: ( ( rule__ImportDeclaration__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:583:1: ( rule__ImportDeclaration__Group__0 )
            {
             before(grammarAccess.getImportDeclarationAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:584:1: ( rule__ImportDeclaration__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:584:2: rule__ImportDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration1112);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:596:1: entryRuleGroupByClause : ruleGroupByClause EOF ;
    public final void entryRuleGroupByClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:597:1: ( ruleGroupByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:598:1: ruleGroupByClause EOF
            {
             before(grammarAccess.getGroupByClauseRule()); 
            pushFollow(FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause1139);
            ruleGroupByClause();

            state._fsp--;

             after(grammarAccess.getGroupByClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByClause1146); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:605:1: ruleGroupByClause : ( ( rule__GroupByClause__Group__0 ) ) ;
    public final void ruleGroupByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:609:5: ( ( ( rule__GroupByClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:610:1: ( ( rule__GroupByClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:610:1: ( ( rule__GroupByClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:611:1: ( rule__GroupByClause__Group__0 )
            {
             before(grammarAccess.getGroupByClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:612:1: ( rule__GroupByClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:612:2: rule__GroupByClause__Group__0
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__0_in_ruleGroupByClause1176);
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


    // $ANTLR start "entryRuleHavingClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:624:1: entryRuleHavingClause : ruleHavingClause EOF ;
    public final void entryRuleHavingClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:625:1: ( ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:626:1: ruleHavingClause EOF
            {
             before(grammarAccess.getHavingClauseRule()); 
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause1203);
            ruleHavingClause();

            state._fsp--;

             after(grammarAccess.getHavingClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause1210); 

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
    // $ANTLR end "entryRuleHavingClause"


    // $ANTLR start "ruleHavingClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:633:1: ruleHavingClause : ( ( rule__HavingClause__Group__0 ) ) ;
    public final void ruleHavingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:637:5: ( ( ( rule__HavingClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:638:1: ( ( rule__HavingClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:638:1: ( ( rule__HavingClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:639:1: ( rule__HavingClause__Group__0 )
            {
             before(grammarAccess.getHavingClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:640:1: ( rule__HavingClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:640:2: rule__HavingClause__Group__0
            {
            pushFollow(FOLLOW_rule__HavingClause__Group__0_in_ruleHavingClause1240);
            rule__HavingClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHavingClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHavingClause"


    // $ANTLR start "entryRuleOrderByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:652:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:653:1: ( ruleOrderByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:654:1: ruleOrderByClause EOF
            {
             before(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause1267);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getOrderByClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderByClause1274); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:661:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:665:5: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:666:1: ( ( rule__OrderByClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:666:1: ( ( rule__OrderByClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:667:1: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:668:1: ( rule__OrderByClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:668:2: rule__OrderByClause__Group__0
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__0_in_ruleOrderByClause1304);
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


    // $ANTLR start "entryRuleOrderBySpec"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:680:1: entryRuleOrderBySpec : ruleOrderBySpec EOF ;
    public final void entryRuleOrderBySpec() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:681:1: ( ruleOrderBySpec EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:682:1: ruleOrderBySpec EOF
            {
             before(grammarAccess.getOrderBySpecRule()); 
            pushFollow(FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec1331);
            ruleOrderBySpec();

            state._fsp--;

             after(grammarAccess.getOrderBySpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderBySpec1338); 

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
    // $ANTLR end "entryRuleOrderBySpec"


    // $ANTLR start "ruleOrderBySpec"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:689:1: ruleOrderBySpec : ( ( rule__OrderBySpec__Group__0 ) ) ;
    public final void ruleOrderBySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:693:5: ( ( ( rule__OrderBySpec__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:694:1: ( ( rule__OrderBySpec__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:694:1: ( ( rule__OrderBySpec__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:695:1: ( rule__OrderBySpec__Group__0 )
            {
             before(grammarAccess.getOrderBySpecAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:696:1: ( rule__OrderBySpec__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:696:2: rule__OrderBySpec__Group__0
            {
            pushFollow(FOLLOW_rule__OrderBySpec__Group__0_in_ruleOrderBySpec1368);
            rule__OrderBySpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderBySpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderBySpec"


    // $ANTLR start "entryRuleRangeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:708:1: entryRuleRangeClause : ruleRangeClause EOF ;
    public final void entryRuleRangeClause() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:709:1: ( ruleRangeClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:710:1: ruleRangeClause EOF
            {
             before(grammarAccess.getRangeClauseRule()); 
            pushFollow(FOLLOW_ruleRangeClause_in_entryRuleRangeClause1395);
            ruleRangeClause();

            state._fsp--;

             after(grammarAccess.getRangeClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeClause1402); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:717:1: ruleRangeClause : ( ( rule__RangeClause__Group__0 ) ) ;
    public final void ruleRangeClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:721:5: ( ( ( rule__RangeClause__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:722:1: ( ( rule__RangeClause__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:722:1: ( ( rule__RangeClause__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:723:1: ( rule__RangeClause__Group__0 )
            {
             before(grammarAccess.getRangeClauseAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:724:1: ( rule__RangeClause__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:724:2: rule__RangeClause__Group__0
            {
            pushFollow(FOLLOW_rule__RangeClause__Group__0_in_ruleRangeClause1432);
            rule__RangeClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeClauseAccess().getGroup()); 

            }


            }

        }
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:736:1: entryRuleConditionalOrExpression : ruleConditionalOrExpression EOF ;
    public final void entryRuleConditionalOrExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:737:1: ( ruleConditionalOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:738:1: ruleConditionalOrExpression EOF
            {
             before(grammarAccess.getConditionalOrExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression1459);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getConditionalOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression1466); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:745:1: ruleConditionalOrExpression : ( ( rule__ConditionalOrExpression__Group__0 ) ) ;
    public final void ruleConditionalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:749:5: ( ( ( rule__ConditionalOrExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:750:1: ( ( rule__ConditionalOrExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:750:1: ( ( rule__ConditionalOrExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:751:1: ( rule__ConditionalOrExpression__Group__0 )
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:752:1: ( rule__ConditionalOrExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:752:2: rule__ConditionalOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__0_in_ruleConditionalOrExpression1496);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:764:1: entryRuleConditionalAndExpression : ruleConditionalAndExpression EOF ;
    public final void entryRuleConditionalAndExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:765:1: ( ruleConditionalAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:766:1: ruleConditionalAndExpression EOF
            {
             before(grammarAccess.getConditionalAndExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression1523);
            ruleConditionalAndExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression1530); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:773:1: ruleConditionalAndExpression : ( ( rule__ConditionalAndExpression__Group__0 ) ) ;
    public final void ruleConditionalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:777:5: ( ( ( rule__ConditionalAndExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:778:1: ( ( rule__ConditionalAndExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:778:1: ( ( rule__ConditionalAndExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:779:1: ( rule__ConditionalAndExpression__Group__0 )
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:780:1: ( rule__ConditionalAndExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:780:2: rule__ConditionalAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__0_in_ruleConditionalAndExpression1560);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:792:1: entryRuleSimpleOrExpression : ruleSimpleOrExpression EOF ;
    public final void entryRuleSimpleOrExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:793:1: ( ruleSimpleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:794:1: ruleSimpleOrExpression EOF
            {
             before(grammarAccess.getSimpleOrExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression1587);
            ruleSimpleOrExpression();

            state._fsp--;

             after(grammarAccess.getSimpleOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrExpression1594); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:801:1: ruleSimpleOrExpression : ( ( rule__SimpleOrExpression__Group__0 ) ) ;
    public final void ruleSimpleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:805:5: ( ( ( rule__SimpleOrExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:806:1: ( ( rule__SimpleOrExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:806:1: ( ( rule__SimpleOrExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:807:1: ( rule__SimpleOrExpression__Group__0 )
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:808:1: ( rule__SimpleOrExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:808:2: rule__SimpleOrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__0_in_ruleSimpleOrExpression1624);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:820:1: entryRuleSimpleAndExpression : ruleSimpleAndExpression EOF ;
    public final void entryRuleSimpleAndExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:821:1: ( ruleSimpleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:822:1: ruleSimpleAndExpression EOF
            {
             before(grammarAccess.getSimpleAndExpressionRule()); 
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression1651);
            ruleSimpleAndExpression();

            state._fsp--;

             after(grammarAccess.getSimpleAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAndExpression1658); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:829:1: ruleSimpleAndExpression : ( ( rule__SimpleAndExpression__Group__0 ) ) ;
    public final void ruleSimpleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:833:5: ( ( ( rule__SimpleAndExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:834:1: ( ( rule__SimpleAndExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:834:1: ( ( rule__SimpleAndExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:835:1: ( rule__SimpleAndExpression__Group__0 )
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:836:1: ( rule__SimpleAndExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:836:2: rule__SimpleAndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__0_in_ruleSimpleAndExpression1688);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:848:1: entryRuleComparisonOperatorExpression : ruleComparisonOperatorExpression EOF ;
    public final void entryRuleComparisonOperatorExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:849:1: ( ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:850:1: ruleComparisonOperatorExpression EOF
            {
             before(grammarAccess.getComparisonOperatorExpressionRule()); 
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression1715);
            ruleComparisonOperatorExpression();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression1722); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:857:1: ruleComparisonOperatorExpression : ( ( rule__ComparisonOperatorExpression__Group__0 ) ) ;
    public final void ruleComparisonOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:861:5: ( ( ( rule__ComparisonOperatorExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:862:1: ( ( rule__ComparisonOperatorExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:862:1: ( ( rule__ComparisonOperatorExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:863:1: ( rule__ComparisonOperatorExpression__Group__0 )
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:864:1: ( rule__ComparisonOperatorExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:864:2: rule__ComparisonOperatorExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__0_in_ruleComparisonOperatorExpression1752);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:876:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:877:1: ( ruleAdditionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:878:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1779);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression1786); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:885:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:889:5: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:890:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:890:1: ( ( rule__AdditionExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:891:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:892:1: ( rule__AdditionExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:892:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1816);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:904:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:905:1: ( ruleMultiplicationExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:906:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1843);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression1850); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:913:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Group__0 ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:917:5: ( ( ( rule__MultiplicationExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:918:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:918:1: ( ( rule__MultiplicationExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:919:1: ( rule__MultiplicationExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:920:1: ( rule__MultiplicationExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:920:2: rule__MultiplicationExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression1880);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:932:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:933:1: ( ruleUnaryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:934:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1907);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1914); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:941:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Group__0 ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:945:5: ( ( ( rule__UnaryExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:946:1: ( ( rule__UnaryExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:946:1: ( ( rule__UnaryExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:947:1: ( rule__UnaryExpression__Group__0 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:948:1: ( rule__UnaryExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:948:2: rule__UnaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group__0_in_ruleUnaryExpression1944);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:960:1: entryRuleFieldAccessExpression : ruleFieldAccessExpression EOF ;
    public final void entryRuleFieldAccessExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:961:1: ( ruleFieldAccessExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:962:1: ruleFieldAccessExpression EOF
            {
             before(grammarAccess.getFieldAccessExpressionRule()); 
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression1971);
            ruleFieldAccessExpression();

            state._fsp--;

             after(grammarAccess.getFieldAccessExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAccessExpression1978); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:969:1: ruleFieldAccessExpression : ( ( rule__FieldAccessExpression__Group__0 ) ) ;
    public final void ruleFieldAccessExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:973:5: ( ( ( rule__FieldAccessExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:974:1: ( ( rule__FieldAccessExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:974:1: ( ( rule__FieldAccessExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:975:1: ( rule__FieldAccessExpression__Group__0 )
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:976:1: ( rule__FieldAccessExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:976:2: rule__FieldAccessExpression__Group__0
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__0_in_ruleFieldAccessExpression2008);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:988:1: entryRuleParameterOrFieldOrMethodExpression : ruleParameterOrFieldOrMethodExpression EOF ;
    public final void entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:989:1: ( ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:990:1: ruleParameterOrFieldOrMethodExpression EOF
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression2035);
            ruleParameterOrFieldOrMethodExpression();

            state._fsp--;

             after(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression2042); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:997:1: ruleParameterOrFieldOrMethodExpression : ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) ) ;
    public final void ruleParameterOrFieldOrMethodExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1001:5: ( ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1002:1: ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1002:1: ( ( rule__ParameterOrFieldOrMethodExpression__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1003:1: ( rule__ParameterOrFieldOrMethodExpression__Alternatives )
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1004:1: ( rule__ParameterOrFieldOrMethodExpression__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1004:2: rule__ParameterOrFieldOrMethodExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Alternatives_in_ruleParameterOrFieldOrMethodExpression2072);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1016:1: entryRuleFieldOrMethodExpression : ruleFieldOrMethodExpression EOF ;
    public final void entryRuleFieldOrMethodExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1017:1: ( ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1018:1: ruleFieldOrMethodExpression EOF
            {
             before(grammarAccess.getFieldOrMethodExpressionRule()); 
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression2099);
            ruleFieldOrMethodExpression();

            state._fsp--;

             after(grammarAccess.getFieldOrMethodExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression2106); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1025:1: ruleFieldOrMethodExpression : ( ( rule__FieldOrMethodExpression__Alternatives ) ) ;
    public final void ruleFieldOrMethodExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1029:5: ( ( ( rule__FieldOrMethodExpression__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1030:1: ( ( rule__FieldOrMethodExpression__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1030:1: ( ( rule__FieldOrMethodExpression__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1031:1: ( rule__FieldOrMethodExpression__Alternatives )
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1032:1: ( rule__FieldOrMethodExpression__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1032:2: rule__FieldOrMethodExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__FieldOrMethodExpression__Alternatives_in_ruleFieldOrMethodExpression2136);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1044:1: entryRuleParenthesesExpression : ruleParenthesesExpression EOF ;
    public final void entryRuleParenthesesExpression() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1045:1: ( ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1046:1: ruleParenthesesExpression EOF
            {
             before(grammarAccess.getParenthesesExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression2163);
            ruleParenthesesExpression();

            state._fsp--;

             after(grammarAccess.getParenthesesExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression2170); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1053:1: ruleParenthesesExpression : ( ( rule__ParenthesesExpression__Group__0 ) ) ;
    public final void ruleParenthesesExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1057:5: ( ( ( rule__ParenthesesExpression__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1058:1: ( ( rule__ParenthesesExpression__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1058:1: ( ( rule__ParenthesesExpression__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1059:1: ( rule__ParenthesesExpression__Group__0 )
            {
             before(grammarAccess.getParenthesesExpressionAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1060:1: ( rule__ParenthesesExpression__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1060:2: rule__ParenthesesExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__0_in_ruleParenthesesExpression2200);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1074:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1075:1: ( ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1076:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2229);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2236); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1083:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1087:5: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1088:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1088:1: ( ( rule__Type__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1089:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1090:1: ( rule__Type__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1090:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType2266);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1102:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1103:1: ( rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1104:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType2293);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType2300); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1111:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1115:5: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1116:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1116:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1117:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1118:1: ( rule__PrimitiveType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1118:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType2330);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1130:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1131:1: ( ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1132:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType2357);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType2364); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1139:1: ruleNumericType : ( ( rule__NumericType__Alternatives ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1143:5: ( ( ( rule__NumericType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1144:1: ( ( rule__NumericType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1144:1: ( ( rule__NumericType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1145:1: ( rule__NumericType__Alternatives )
            {
             before(grammarAccess.getNumericTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1146:1: ( rule__NumericType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1146:2: rule__NumericType__Alternatives
            {
            pushFollow(FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType2394);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1158:1: entryRuleIntegralType : ruleIntegralType EOF ;
    public final void entryRuleIntegralType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1159:1: ( ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1160:1: ruleIntegralType EOF
            {
             before(grammarAccess.getIntegralTypeRule()); 
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType2421);
            ruleIntegralType();

            state._fsp--;

             after(grammarAccess.getIntegralTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType2428); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1167:1: ruleIntegralType : ( ( rule__IntegralType__Alternatives ) ) ;
    public final void ruleIntegralType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1171:5: ( ( ( rule__IntegralType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1172:1: ( ( rule__IntegralType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1172:1: ( ( rule__IntegralType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1173:1: ( rule__IntegralType__Alternatives )
            {
             before(grammarAccess.getIntegralTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1174:1: ( rule__IntegralType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1174:2: rule__IntegralType__Alternatives
            {
            pushFollow(FOLLOW_rule__IntegralType__Alternatives_in_ruleIntegralType2458);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1186:1: entryRuleFloatingPointType : ruleFloatingPointType EOF ;
    public final void entryRuleFloatingPointType() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1187:1: ( ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1188:1: ruleFloatingPointType EOF
            {
             before(grammarAccess.getFloatingPointTypeRule()); 
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType2485);
            ruleFloatingPointType();

            state._fsp--;

             after(grammarAccess.getFloatingPointTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType2492); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1195:1: ruleFloatingPointType : ( ( rule__FloatingPointType__Alternatives ) ) ;
    public final void ruleFloatingPointType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1199:5: ( ( ( rule__FloatingPointType__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1200:1: ( ( rule__FloatingPointType__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1200:1: ( ( rule__FloatingPointType__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1201:1: ( rule__FloatingPointType__Alternatives )
            {
             before(grammarAccess.getFloatingPointTypeAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1202:1: ( rule__FloatingPointType__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1202:2: rule__FloatingPointType__Alternatives
            {
            pushFollow(FOLLOW_rule__FloatingPointType__Alternatives_in_ruleFloatingPointType2522);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1214:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1215:1: ( ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1216:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2549);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral2556); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1223:1: ruleIntegerLiteral : ( RULE_INT ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1227:5: ( ( RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1228:1: ( RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1228:1: ( RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1229:1: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral2586); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1242:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1243:1: ( ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1244:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2612);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2619); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1251:1: ruleStringLiteral : ( RULE_STRING ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1255:5: ( ( RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1256:1: ( RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1256:1: ( RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1257:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral2649); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1270:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1271:1: ( ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1272:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2675);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2682); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1279:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1283:5: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1284:1: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1284:1: ( ( rule__BooleanLiteral__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1285:1: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1286:1: ( rule__BooleanLiteral__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1286:2: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral2712);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1298:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1299:1: ( ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1300:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2739);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral2746); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1307:1: ruleNullLiteral : ( KEYWORD_34 ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1311:5: ( ( KEYWORD_34 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1312:1: ( KEYWORD_34 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1312:1: ( KEYWORD_34 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1313:1: KEYWORD_34
            {
             before(grammarAccess.getNullLiteralAccess().getNullKeyword()); 
            match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleNullLiteral2777); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1328:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1329:1: ( ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1330:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2805);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2812); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1337:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1341:5: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1342:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1342:1: ( ( rule__Literal__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1343:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1344:1: ( rule__Literal__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1344:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2842);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1356:1: entryRuleQualifiedIdentifier : ruleQualifiedIdentifier EOF ;
    public final void entryRuleQualifiedIdentifier() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1357:1: ( ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1358:1: ruleQualifiedIdentifier EOF
            {
             before(grammarAccess.getQualifiedIdentifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier2869);
            ruleQualifiedIdentifier();

            state._fsp--;

             after(grammarAccess.getQualifiedIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier2876); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1365:1: ruleQualifiedIdentifier : ( ( rule__QualifiedIdentifier__Group__0 ) ) ;
    public final void ruleQualifiedIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1369:5: ( ( ( rule__QualifiedIdentifier__Group__0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1370:1: ( ( rule__QualifiedIdentifier__Group__0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1370:1: ( ( rule__QualifiedIdentifier__Group__0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1371:1: ( rule__QualifiedIdentifier__Group__0 )
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getGroup()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1372:1: ( rule__QualifiedIdentifier__Group__0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1372:2: rule__QualifiedIdentifier__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__0_in_ruleQualifiedIdentifier2906);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1384:1: entryRuleCandidateClassName : ruleCandidateClassName EOF ;
    public final void entryRuleCandidateClassName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1385:1: ( ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1386:1: ruleCandidateClassName EOF
            {
             before(grammarAccess.getCandidateClassNameRule()); 
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName2933);
            ruleCandidateClassName();

            state._fsp--;

             after(grammarAccess.getCandidateClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName2940); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1393:1: ruleCandidateClassName : ( ruleQualifiedIdentifier ) ;
    public final void ruleCandidateClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1397:5: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1398:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1398:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1399:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName2970);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1412:1: entryRuleClassOrInterfaceName : ruleClassOrInterfaceName EOF ;
    public final void entryRuleClassOrInterfaceName() throws RecognitionException {
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1413:1: ( ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1414:1: ruleClassOrInterfaceName EOF
            {
             before(grammarAccess.getClassOrInterfaceNameRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName2996);
            ruleClassOrInterfaceName();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName3003); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1421:1: ruleClassOrInterfaceName : ( ruleQualifiedIdentifier ) ;
    public final void ruleClassOrInterfaceName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1425:5: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1426:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1426:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1427:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName3033);
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


    // $ANTLR start "ruleOrderByDirection"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1441:1: ruleOrderByDirection : ( ( rule__OrderByDirection__Alternatives ) ) ;
    public final void ruleOrderByDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1445:1: ( ( ( rule__OrderByDirection__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1446:1: ( ( rule__OrderByDirection__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1446:1: ( ( rule__OrderByDirection__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1447:1: ( rule__OrderByDirection__Alternatives )
            {
             before(grammarAccess.getOrderByDirectionAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1448:1: ( rule__OrderByDirection__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1448:2: rule__OrderByDirection__Alternatives
            {
            pushFollow(FOLLOW_rule__OrderByDirection__Alternatives_in_ruleOrderByDirection3069);
            rule__OrderByDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderByDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderByDirection"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1460:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1464:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1465:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1465:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1466:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1467:1: ( rule__UnaryOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1467:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator3105);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1479:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1483:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1484:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1484:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1485:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1486:1: ( rule__AdditionOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1486:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator3141);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1498:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1502:1: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1503:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1503:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1504:1: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1505:1: ( rule__MultiplicationOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1505:2: rule__MultiplicationOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MultiplicationOperator__Alternatives_in_ruleMultiplicationOperator3177);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1517:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1521:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1522:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1522:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1523:1: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1524:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1524:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator3213);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1535:1: rule__ParameterOrFieldOrMethodExpression__Alternatives : ( ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) ) | ( ruleParenthesesExpression ) );
    public final void rule__ParameterOrFieldOrMethodExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1539:1: ( ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) ) | ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) ) | ( ruleParenthesesExpression ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
            case KEYWORD_34:
            case KEYWORD_36:
            case RULE_INT:
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case KEYWORD_35:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1540:1: ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1540:1: ( ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1541:1: ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1542:1: ( rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1542:2: rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3248);
                    rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1546:6: ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1546:6: ( ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1547:1: ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisAssignment_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1548:1: ( rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1548:2: rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3266);
                    rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1552:6: ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1552:6: ( ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1553:1: ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdAssignment_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1554:1: ( rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1554:2: rule__ParameterOrFieldOrMethodExpression__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__IdAssignment_2_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3284);
                    rule__ParameterOrFieldOrMethodExpression__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1558:6: ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1558:6: ( ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1559:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 )
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getGroup_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1560:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1560:2: rule__ParameterOrFieldOrMethodExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3302);
                    rule__ParameterOrFieldOrMethodExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1564:6: ( ruleParenthesesExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1564:6: ( ruleParenthesesExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1565:1: ruleParenthesesExpression
                    {
                     before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3320);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1575:1: rule__FieldOrMethodExpression__Alternatives : ( ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) ) | ( ruleParenthesesExpression ) );
    public final void rule__FieldOrMethodExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1579:1: ( ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) ) | ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) ) | ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) ) | ( ruleParenthesesExpression ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
            case KEYWORD_34:
            case KEYWORD_36:
            case RULE_INT:
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case KEYWORD_35:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1580:1: ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1580:1: ( ( rule__FieldOrMethodExpression__LiteralAssignment_0 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1581:1: ( rule__FieldOrMethodExpression__LiteralAssignment_0 )
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1582:1: ( rule__FieldOrMethodExpression__LiteralAssignment_0 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1582:2: rule__FieldOrMethodExpression__LiteralAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FieldOrMethodExpression__LiteralAssignment_0_in_rule__FieldOrMethodExpression__Alternatives3352);
                    rule__FieldOrMethodExpression__LiteralAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1586:6: ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1586:6: ( ( rule__FieldOrMethodExpression__ThisAssignment_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1587:1: ( rule__FieldOrMethodExpression__ThisAssignment_1 )
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getThisAssignment_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1588:1: ( rule__FieldOrMethodExpression__ThisAssignment_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1588:2: rule__FieldOrMethodExpression__ThisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FieldOrMethodExpression__ThisAssignment_1_in_rule__FieldOrMethodExpression__Alternatives3370);
                    rule__FieldOrMethodExpression__ThisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getThisAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1592:6: ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1592:6: ( ( rule__FieldOrMethodExpression__IdAssignment_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1593:1: ( rule__FieldOrMethodExpression__IdAssignment_2 )
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getIdAssignment_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1594:1: ( rule__FieldOrMethodExpression__IdAssignment_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1594:2: rule__FieldOrMethodExpression__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FieldOrMethodExpression__IdAssignment_2_in_rule__FieldOrMethodExpression__Alternatives3388);
                    rule__FieldOrMethodExpression__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldOrMethodExpressionAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1598:6: ( ruleParenthesesExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1598:6: ( ruleParenthesesExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1599:1: ruleParenthesesExpression
                    {
                     before(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_rule__FieldOrMethodExpression__Alternatives3406);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1609:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleClassOrInterfaceName ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1613:1: ( ( rulePrimitiveType ) | ( ruleClassOrInterfaceName ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_50||LA3_0==KEYWORD_47||(LA3_0>=KEYWORD_42 && LA3_0<=KEYWORD_43)||(LA3_0>=KEYWORD_31 && LA3_0<=KEYWORD_33)||LA3_0==KEYWORD_27) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1614:1: ( rulePrimitiveType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1614:1: ( rulePrimitiveType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1615:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives3438);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1620:6: ( ruleClassOrInterfaceName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1620:6: ( ruleClassOrInterfaceName )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1621:1: ruleClassOrInterfaceName
                    {
                     before(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__Type__Alternatives3455);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1631:1: rule__PrimitiveType__Alternatives : ( ( ruleNumericType ) | ( KEYWORD_50 ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1635:1: ( ( ruleNumericType ) | ( KEYWORD_50 ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_47||(LA4_0>=KEYWORD_42 && LA4_0<=KEYWORD_43)||(LA4_0>=KEYWORD_31 && LA4_0<=KEYWORD_33)||LA4_0==KEYWORD_27) ) {
                alt4=1;
            }
            else if ( (LA4_0==KEYWORD_50) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1636:1: ( ruleNumericType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1636:1: ( ruleNumericType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1637:1: ruleNumericType
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNumericType_in_rule__PrimitiveType__Alternatives3487);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1642:6: ( KEYWORD_50 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1642:6: ( KEYWORD_50 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1643:1: KEYWORD_50
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1()); 
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__PrimitiveType__Alternatives3505); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1655:1: rule__NumericType__Alternatives : ( ( ruleIntegralType ) | ( ruleFloatingPointType ) );
    public final void rule__NumericType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1659:1: ( ( ruleIntegralType ) | ( ruleFloatingPointType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_43||(LA5_0>=KEYWORD_31 && LA5_0<=KEYWORD_33)||LA5_0==KEYWORD_27) ) {
                alt5=1;
            }
            else if ( (LA5_0==KEYWORD_47||LA5_0==KEYWORD_42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1660:1: ( ruleIntegralType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1660:1: ( ruleIntegralType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1661:1: ruleIntegralType
                    {
                     before(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegralType_in_rule__NumericType__Alternatives3539);
                    ruleIntegralType();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1666:6: ( ruleFloatingPointType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1666:6: ( ruleFloatingPointType )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1667:1: ruleFloatingPointType
                    {
                     before(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFloatingPointType_in_rule__NumericType__Alternatives3556);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1677:1: rule__IntegralType__Alternatives : ( ( KEYWORD_31 ) | ( KEYWORD_43 ) | ( KEYWORD_27 ) | ( KEYWORD_33 ) | ( KEYWORD_32 ) );
    public final void rule__IntegralType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1681:1: ( ( KEYWORD_31 ) | ( KEYWORD_43 ) | ( KEYWORD_27 ) | ( KEYWORD_33 ) | ( KEYWORD_32 ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case KEYWORD_31:
                {
                alt6=1;
                }
                break;
            case KEYWORD_43:
                {
                alt6=2;
                }
                break;
            case KEYWORD_27:
                {
                alt6=3;
                }
                break;
            case KEYWORD_33:
                {
                alt6=4;
                }
                break;
            case KEYWORD_32:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1682:1: ( KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1682:1: ( KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1683:1: KEYWORD_31
                    {
                     before(grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__IntegralType__Alternatives3589); 
                     after(grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1690:6: ( KEYWORD_43 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1690:6: ( KEYWORD_43 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1691:1: KEYWORD_43
                    {
                     before(grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__IntegralType__Alternatives3609); 
                     after(grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1698:6: ( KEYWORD_27 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1698:6: ( KEYWORD_27 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1699:1: KEYWORD_27
                    {
                     before(grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__IntegralType__Alternatives3629); 
                     after(grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1706:6: ( KEYWORD_33 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1706:6: ( KEYWORD_33 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1707:1: KEYWORD_33
                    {
                     before(grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__IntegralType__Alternatives3649); 
                     after(grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1714:6: ( KEYWORD_32 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1714:6: ( KEYWORD_32 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1715:1: KEYWORD_32
                    {
                     before(grammarAccess.getIntegralTypeAccess().getCharKeyword_4()); 
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__IntegralType__Alternatives3669); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1727:1: rule__FloatingPointType__Alternatives : ( ( KEYWORD_42 ) | ( KEYWORD_47 ) );
    public final void rule__FloatingPointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1731:1: ( ( KEYWORD_42 ) | ( KEYWORD_47 ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_42) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_47) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1732:1: ( KEYWORD_42 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1732:1: ( KEYWORD_42 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1733:1: KEYWORD_42
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__FloatingPointType__Alternatives3704); 
                     after(grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1740:6: ( KEYWORD_47 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1740:6: ( KEYWORD_47 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1741:1: KEYWORD_47
                    {
                     before(grammarAccess.getFloatingPointTypeAccess().getDoubleKeyword_1()); 
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__FloatingPointType__Alternatives3724); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1753:1: rule__BooleanLiteral__Alternatives : ( ( KEYWORD_36 ) | ( KEYWORD_41 ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1757:1: ( ( KEYWORD_36 ) | ( KEYWORD_41 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_36) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1758:1: ( KEYWORD_36 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1758:1: ( KEYWORD_36 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1759:1: KEYWORD_36
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__BooleanLiteral__Alternatives3759); 
                     after(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1766:6: ( KEYWORD_41 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1766:6: ( KEYWORD_41 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1767:1: KEYWORD_41
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__BooleanLiteral__Alternatives3779); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1779:1: rule__Literal__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1783:1: ( ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNullLiteral ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_36:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case KEYWORD_34:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1784:1: ( ruleIntegerLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1784:1: ( ruleIntegerLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1785:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives3813);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1790:6: ( ruleBooleanLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1790:6: ( ruleBooleanLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1791:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3830);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1796:6: ( ruleStringLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1796:6: ( ruleStringLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1797:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3847);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1802:6: ( ruleNullLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1802:6: ( ruleNullLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1803:1: ruleNullLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives3864);
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


    // $ANTLR start "rule__OrderByDirection__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1813:1: rule__OrderByDirection__Alternatives : ( ( ( KEYWORD_26 ) ) | ( ( KEYWORD_52 ) ) | ( ( KEYWORD_28 ) ) | ( ( KEYWORD_54 ) ) );
    public final void rule__OrderByDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1817:1: ( ( ( KEYWORD_26 ) ) | ( ( KEYWORD_52 ) ) | ( ( KEYWORD_28 ) ) | ( ( KEYWORD_54 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt10=1;
                }
                break;
            case KEYWORD_52:
                {
                alt10=2;
                }
                break;
            case KEYWORD_28:
                {
                alt10=3;
                }
                break;
            case KEYWORD_54:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1818:1: ( ( KEYWORD_26 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1818:1: ( ( KEYWORD_26 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1819:1: ( KEYWORD_26 )
                    {
                     before(grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1820:1: ( KEYWORD_26 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1820:3: KEYWORD_26
                    {
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__OrderByDirection__Alternatives3897); 

                    }

                     after(grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1825:6: ( ( KEYWORD_52 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1825:6: ( ( KEYWORD_52 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1826:1: ( KEYWORD_52 )
                    {
                     before(grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1827:1: ( KEYWORD_52 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1827:3: KEYWORD_52
                    {
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__OrderByDirection__Alternatives3917); 

                    }

                     after(grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1832:6: ( ( KEYWORD_28 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1832:6: ( ( KEYWORD_28 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1833:1: ( KEYWORD_28 )
                    {
                     before(grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1834:1: ( KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1834:3: KEYWORD_28
                    {
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__OrderByDirection__Alternatives3937); 

                    }

                     after(grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1839:6: ( ( KEYWORD_54 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1839:6: ( ( KEYWORD_54 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1840:1: ( KEYWORD_54 )
                    {
                     before(grammarAccess.getOrderByDirectionAccess().getDescendingEnumLiteralDeclaration_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1841:1: ( KEYWORD_54 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1841:3: KEYWORD_54
                    {
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__OrderByDirection__Alternatives3957); 

                    }

                     after(grammarAccess.getOrderByDirectionAccess().getDescendingEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__OrderByDirection__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1851:1: rule__UnaryOperator__Alternatives : ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) | ( ( KEYWORD_17 ) ) | ( ( KEYWORD_1 ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1855:1: ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) | ( ( KEYWORD_17 ) ) | ( ( KEYWORD_1 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt11=1;
                }
                break;
            case KEYWORD_9:
                {
                alt11=2;
                }
                break;
            case KEYWORD_17:
                {
                alt11=3;
                }
                break;
            case KEYWORD_1:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1856:1: ( ( KEYWORD_7 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1856:1: ( ( KEYWORD_7 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1857:1: ( KEYWORD_7 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1858:1: ( KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1858:3: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__UnaryOperator__Alternatives3992); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1863:6: ( ( KEYWORD_9 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1863:6: ( ( KEYWORD_9 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1864:1: ( KEYWORD_9 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1865:1: ( KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1865:3: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__UnaryOperator__Alternatives4012); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1870:6: ( ( KEYWORD_17 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1870:6: ( ( KEYWORD_17 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1871:1: ( KEYWORD_17 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1872:1: ( KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1872:3: KEYWORD_17
                    {
                    match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__UnaryOperator__Alternatives4032); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1877:6: ( ( KEYWORD_1 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1877:6: ( ( KEYWORD_1 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1878:1: ( KEYWORD_1 )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1879:1: ( KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1879:3: KEYWORD_1
                    {
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__UnaryOperator__Alternatives4052); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1889:1: rule__AdditionOperator__Alternatives : ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1893:1: ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_9 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_7) ) {
                alt12=1;
            }
            else if ( (LA12_0==KEYWORD_9) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1894:1: ( ( KEYWORD_7 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1894:1: ( ( KEYWORD_7 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1895:1: ( KEYWORD_7 )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1896:1: ( KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1896:3: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__AdditionOperator__Alternatives4087); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1901:6: ( ( KEYWORD_9 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1901:6: ( ( KEYWORD_9 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1902:1: ( KEYWORD_9 )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1903:1: ( KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1903:3: KEYWORD_9
                    {
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__AdditionOperator__Alternatives4107); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1913:1: rule__MultiplicationOperator__Alternatives : ( ( ( KEYWORD_6 ) ) | ( ( KEYWORD_11 ) ) | ( ( KEYWORD_2 ) ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1917:1: ( ( ( KEYWORD_6 ) ) | ( ( KEYWORD_11 ) ) | ( ( KEYWORD_2 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt13=1;
                }
                break;
            case KEYWORD_11:
                {
                alt13=2;
                }
                break;
            case KEYWORD_2:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1918:1: ( ( KEYWORD_6 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1918:1: ( ( KEYWORD_6 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1919:1: ( KEYWORD_6 )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1920:1: ( KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1920:3: KEYWORD_6
                    {
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__MultiplicationOperator__Alternatives4142); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1925:6: ( ( KEYWORD_11 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1925:6: ( ( KEYWORD_11 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1926:1: ( KEYWORD_11 )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1927:1: ( KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1927:3: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__MultiplicationOperator__Alternatives4162); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1932:6: ( ( KEYWORD_2 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1932:6: ( ( KEYWORD_2 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1933:1: ( KEYWORD_2 )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getModuloEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1934:1: ( KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1934:3: KEYWORD_2
                    {
                    match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__MultiplicationOperator__Alternatives4182); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1944:1: rule__ComparisonOperator__Alternatives : ( ( ( KEYWORD_14 ) ) | ( ( KEYWORD_15 ) ) | ( ( KEYWORD_20 ) ) | ( ( KEYWORD_22 ) ) | ( ( KEYWORD_21 ) ) | ( ( KEYWORD_18 ) ) | ( ( KEYWORD_57 ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1948:1: ( ( ( KEYWORD_14 ) ) | ( ( KEYWORD_15 ) ) | ( ( KEYWORD_20 ) ) | ( ( KEYWORD_22 ) ) | ( ( KEYWORD_21 ) ) | ( ( KEYWORD_18 ) ) | ( ( KEYWORD_57 ) ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt14=1;
                }
                break;
            case KEYWORD_15:
                {
                alt14=2;
                }
                break;
            case KEYWORD_20:
                {
                alt14=3;
                }
                break;
            case KEYWORD_22:
                {
                alt14=4;
                }
                break;
            case KEYWORD_21:
                {
                alt14=5;
                }
                break;
            case KEYWORD_18:
                {
                alt14=6;
                }
                break;
            case KEYWORD_57:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1949:1: ( ( KEYWORD_14 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1949:1: ( ( KEYWORD_14 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1950:1: ( KEYWORD_14 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1951:1: ( KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1951:3: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__ComparisonOperator__Alternatives4217); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1956:6: ( ( KEYWORD_15 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1956:6: ( ( KEYWORD_15 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1957:1: ( KEYWORD_15 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1958:1: ( KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1958:3: KEYWORD_15
                    {
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__ComparisonOperator__Alternatives4237); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1963:6: ( ( KEYWORD_20 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1963:6: ( ( KEYWORD_20 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1964:1: ( KEYWORD_20 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1965:1: ( KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1965:3: KEYWORD_20
                    {
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__ComparisonOperator__Alternatives4257); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1970:6: ( ( KEYWORD_22 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1970:6: ( ( KEYWORD_22 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1971:1: ( KEYWORD_22 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1972:1: ( KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1972:3: KEYWORD_22
                    {
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__ComparisonOperator__Alternatives4277); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1977:6: ( ( KEYWORD_21 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1977:6: ( ( KEYWORD_21 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1978:1: ( KEYWORD_21 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1979:1: ( KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1979:3: KEYWORD_21
                    {
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__ComparisonOperator__Alternatives4297); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1984:6: ( ( KEYWORD_18 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1984:6: ( ( KEYWORD_18 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1985:1: ( KEYWORD_18 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1986:1: ( KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1986:3: KEYWORD_18
                    {
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__ComparisonOperator__Alternatives4317); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1991:6: ( ( KEYWORD_57 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1991:6: ( ( KEYWORD_57 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1992:1: ( KEYWORD_57 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getInstanceofEnumLiteralDeclaration_6()); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1993:1: ( KEYWORD_57 )
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:1993:3: KEYWORD_57
                    {
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_rule__ComparisonOperator__Alternatives4337); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2005:1: rule__SingleStringJDOQL__Group__0 : rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1 ;
    public final void rule__SingleStringJDOQL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2009:1: ( rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2010:2: rule__SingleStringJDOQL__Group__0__Impl rule__SingleStringJDOQL__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__0__Impl_in_rule__SingleStringJDOQL__Group__04369);
            rule__SingleStringJDOQL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__1_in_rule__SingleStringJDOQL__Group__04372);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2017:1: rule__SingleStringJDOQL__Group__0__Impl : ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) ) ;
    public final void rule__SingleStringJDOQL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2021:1: ( ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2022:1: ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2022:1: ( ( rule__SingleStringJDOQL__SelectClauseAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2023:1: ( rule__SingleStringJDOQL__SelectClauseAssignment_0 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2024:1: ( rule__SingleStringJDOQL__SelectClauseAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2024:2: rule__SingleStringJDOQL__SelectClauseAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__SelectClauseAssignment_0_in_rule__SingleStringJDOQL__Group__0__Impl4399);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2034:1: rule__SingleStringJDOQL__Group__1 : rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2 ;
    public final void rule__SingleStringJDOQL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2038:1: ( rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2039:2: rule__SingleStringJDOQL__Group__1__Impl rule__SingleStringJDOQL__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__1__Impl_in_rule__SingleStringJDOQL__Group__14429);
            rule__SingleStringJDOQL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__2_in_rule__SingleStringJDOQL__Group__14432);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2046:1: rule__SingleStringJDOQL__Group__1__Impl : ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) ) ;
    public final void rule__SingleStringJDOQL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2050:1: ( ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2051:1: ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2051:1: ( ( rule__SingleStringJDOQL__FromClauseAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2052:1: ( rule__SingleStringJDOQL__FromClauseAssignment_1 )
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getFromClauseAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2053:1: ( rule__SingleStringJDOQL__FromClauseAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2053:2: rule__SingleStringJDOQL__FromClauseAssignment_1
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__FromClauseAssignment_1_in_rule__SingleStringJDOQL__Group__1__Impl4459);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2063:1: rule__SingleStringJDOQL__Group__2 : rule__SingleStringJDOQL__Group__2__Impl rule__SingleStringJDOQL__Group__3 ;
    public final void rule__SingleStringJDOQL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2067:1: ( rule__SingleStringJDOQL__Group__2__Impl rule__SingleStringJDOQL__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2068:2: rule__SingleStringJDOQL__Group__2__Impl rule__SingleStringJDOQL__Group__3
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__2__Impl_in_rule__SingleStringJDOQL__Group__24489);
            rule__SingleStringJDOQL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__3_in_rule__SingleStringJDOQL__Group__24492);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2075:1: rule__SingleStringJDOQL__Group__2__Impl : ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? ) ;
    public final void rule__SingleStringJDOQL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2079:1: ( ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2080:1: ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2080:1: ( ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2081:1: ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2082:1: ( rule__SingleStringJDOQL__WhereClauseAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2082:2: rule__SingleStringJDOQL__WhereClauseAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__WhereClauseAssignment_2_in_rule__SingleStringJDOQL__Group__2__Impl4519);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2092:1: rule__SingleStringJDOQL__Group__3 : rule__SingleStringJDOQL__Group__3__Impl rule__SingleStringJDOQL__Group__4 ;
    public final void rule__SingleStringJDOQL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2096:1: ( rule__SingleStringJDOQL__Group__3__Impl rule__SingleStringJDOQL__Group__4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2097:2: rule__SingleStringJDOQL__Group__3__Impl rule__SingleStringJDOQL__Group__4
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__3__Impl_in_rule__SingleStringJDOQL__Group__34550);
            rule__SingleStringJDOQL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__4_in_rule__SingleStringJDOQL__Group__34553);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2104:1: rule__SingleStringJDOQL__Group__3__Impl : ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? ) ;
    public final void rule__SingleStringJDOQL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2108:1: ( ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2109:1: ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2109:1: ( ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2110:1: ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseAssignment_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2111:1: ( rule__SingleStringJDOQL__VariablesClauseAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_53) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2111:2: rule__SingleStringJDOQL__VariablesClauseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__VariablesClauseAssignment_3_in_rule__SingleStringJDOQL__Group__3__Impl4580);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2121:1: rule__SingleStringJDOQL__Group__4 : rule__SingleStringJDOQL__Group__4__Impl rule__SingleStringJDOQL__Group__5 ;
    public final void rule__SingleStringJDOQL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2125:1: ( rule__SingleStringJDOQL__Group__4__Impl rule__SingleStringJDOQL__Group__5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2126:2: rule__SingleStringJDOQL__Group__4__Impl rule__SingleStringJDOQL__Group__5
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__4__Impl_in_rule__SingleStringJDOQL__Group__44611);
            rule__SingleStringJDOQL__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__5_in_rule__SingleStringJDOQL__Group__44614);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2133:1: rule__SingleStringJDOQL__Group__4__Impl : ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? ) ;
    public final void rule__SingleStringJDOQL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2137:1: ( ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2138:1: ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2138:1: ( ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2139:1: ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseAssignment_4()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2140:1: ( rule__SingleStringJDOQL__ParametersClauseAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_55) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2140:2: rule__SingleStringJDOQL__ParametersClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__ParametersClauseAssignment_4_in_rule__SingleStringJDOQL__Group__4__Impl4641);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2150:1: rule__SingleStringJDOQL__Group__5 : rule__SingleStringJDOQL__Group__5__Impl rule__SingleStringJDOQL__Group__6 ;
    public final void rule__SingleStringJDOQL__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2154:1: ( rule__SingleStringJDOQL__Group__5__Impl rule__SingleStringJDOQL__Group__6 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2155:2: rule__SingleStringJDOQL__Group__5__Impl rule__SingleStringJDOQL__Group__6
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__5__Impl_in_rule__SingleStringJDOQL__Group__54672);
            rule__SingleStringJDOQL__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__6_in_rule__SingleStringJDOQL__Group__54675);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2162:1: rule__SingleStringJDOQL__Group__5__Impl : ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? ) ;
    public final void rule__SingleStringJDOQL__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2166:1: ( ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2167:1: ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2167:1: ( ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2168:1: ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getImportClauseAssignment_5()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2169:1: ( rule__SingleStringJDOQL__ImportClauseAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2169:2: rule__SingleStringJDOQL__ImportClauseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__ImportClauseAssignment_5_in_rule__SingleStringJDOQL__Group__5__Impl4702);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2179:1: rule__SingleStringJDOQL__Group__6 : rule__SingleStringJDOQL__Group__6__Impl rule__SingleStringJDOQL__Group__7 ;
    public final void rule__SingleStringJDOQL__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2183:1: ( rule__SingleStringJDOQL__Group__6__Impl rule__SingleStringJDOQL__Group__7 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2184:2: rule__SingleStringJDOQL__Group__6__Impl rule__SingleStringJDOQL__Group__7
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__6__Impl_in_rule__SingleStringJDOQL__Group__64733);
            rule__SingleStringJDOQL__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__7_in_rule__SingleStringJDOQL__Group__64736);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2191:1: rule__SingleStringJDOQL__Group__6__Impl : ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? ) ;
    public final void rule__SingleStringJDOQL__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2195:1: ( ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2196:1: ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2196:1: ( ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2197:1: ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseAssignment_6()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2198:1: ( rule__SingleStringJDOQL__GroupByClauseAssignment_6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2198:2: rule__SingleStringJDOQL__GroupByClauseAssignment_6
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__GroupByClauseAssignment_6_in_rule__SingleStringJDOQL__Group__6__Impl4763);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2208:1: rule__SingleStringJDOQL__Group__7 : rule__SingleStringJDOQL__Group__7__Impl rule__SingleStringJDOQL__Group__8 ;
    public final void rule__SingleStringJDOQL__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2212:1: ( rule__SingleStringJDOQL__Group__7__Impl rule__SingleStringJDOQL__Group__8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2213:2: rule__SingleStringJDOQL__Group__7__Impl rule__SingleStringJDOQL__Group__8
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__7__Impl_in_rule__SingleStringJDOQL__Group__74794);
            rule__SingleStringJDOQL__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__8_in_rule__SingleStringJDOQL__Group__74797);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2220:1: rule__SingleStringJDOQL__Group__7__Impl : ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? ) ;
    public final void rule__SingleStringJDOQL__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2224:1: ( ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2225:1: ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2225:1: ( ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2226:1: ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseAssignment_7()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2227:1: ( rule__SingleStringJDOQL__OrderByClauseAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2227:2: rule__SingleStringJDOQL__OrderByClauseAssignment_7
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__OrderByClauseAssignment_7_in_rule__SingleStringJDOQL__Group__7__Impl4824);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2237:1: rule__SingleStringJDOQL__Group__8 : rule__SingleStringJDOQL__Group__8__Impl ;
    public final void rule__SingleStringJDOQL__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2241:1: ( rule__SingleStringJDOQL__Group__8__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2242:2: rule__SingleStringJDOQL__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SingleStringJDOQL__Group__8__Impl_in_rule__SingleStringJDOQL__Group__84855);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2248:1: rule__SingleStringJDOQL__Group__8__Impl : ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? ) ;
    public final void rule__SingleStringJDOQL__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2252:1: ( ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2253:1: ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2253:1: ( ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2254:1: ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )?
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseAssignment_8()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2255:1: ( rule__SingleStringJDOQL__RangeClauseAssignment_8 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2255:2: rule__SingleStringJDOQL__RangeClauseAssignment_8
                    {
                    pushFollow(FOLLOW_rule__SingleStringJDOQL__RangeClauseAssignment_8_in_rule__SingleStringJDOQL__Group__8__Impl4882);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2283:1: rule__SelectClause__Group__0 : rule__SelectClause__Group__0__Impl rule__SelectClause__Group__1 ;
    public final void rule__SelectClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2287:1: ( rule__SelectClause__Group__0__Impl rule__SelectClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2288:2: rule__SelectClause__Group__0__Impl rule__SelectClause__Group__1
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__0__Impl_in_rule__SelectClause__Group__04931);
            rule__SelectClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__1_in_rule__SelectClause__Group__04934);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2295:1: rule__SelectClause__Group__0__Impl : ( () ) ;
    public final void rule__SelectClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2299:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2300:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2300:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2301:1: ()
            {
             before(grammarAccess.getSelectClauseAccess().getSelectClauseAction_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2302:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2304:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2314:1: rule__SelectClause__Group__1 : rule__SelectClause__Group__1__Impl rule__SelectClause__Group__2 ;
    public final void rule__SelectClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2318:1: ( rule__SelectClause__Group__1__Impl rule__SelectClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2319:2: rule__SelectClause__Group__1__Impl rule__SelectClause__Group__2
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__1__Impl_in_rule__SelectClause__Group__14992);
            rule__SelectClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__2_in_rule__SelectClause__Group__14995);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2326:1: rule__SelectClause__Group__1__Impl : ( KEYWORD_45 ) ;
    public final void rule__SelectClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2330:1: ( ( KEYWORD_45 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2331:1: ( KEYWORD_45 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2331:1: ( KEYWORD_45 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2332:1: KEYWORD_45
            {
             before(grammarAccess.getSelectClauseAccess().getSELECTKeyword_1()); 
            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__SelectClause__Group__1__Impl5023); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2345:1: rule__SelectClause__Group__2 : rule__SelectClause__Group__2__Impl rule__SelectClause__Group__3 ;
    public final void rule__SelectClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2349:1: ( rule__SelectClause__Group__2__Impl rule__SelectClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2350:2: rule__SelectClause__Group__2__Impl rule__SelectClause__Group__3
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__2__Impl_in_rule__SelectClause__Group__25054);
            rule__SelectClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__3_in_rule__SelectClause__Group__25057);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2357:1: rule__SelectClause__Group__2__Impl : ( ( rule__SelectClause__IsUniqueAssignment_2 )? ) ;
    public final void rule__SelectClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2361:1: ( ( ( rule__SelectClause__IsUniqueAssignment_2 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2362:1: ( ( rule__SelectClause__IsUniqueAssignment_2 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2362:1: ( ( rule__SelectClause__IsUniqueAssignment_2 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2363:1: ( rule__SelectClause__IsUniqueAssignment_2 )?
            {
             before(grammarAccess.getSelectClauseAccess().getIsUniqueAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2364:1: ( rule__SelectClause__IsUniqueAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2364:2: rule__SelectClause__IsUniqueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SelectClause__IsUniqueAssignment_2_in_rule__SelectClause__Group__2__Impl5084);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2374:1: rule__SelectClause__Group__3 : rule__SelectClause__Group__3__Impl rule__SelectClause__Group__4 ;
    public final void rule__SelectClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2378:1: ( rule__SelectClause__Group__3__Impl rule__SelectClause__Group__4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2379:2: rule__SelectClause__Group__3__Impl rule__SelectClause__Group__4
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__3__Impl_in_rule__SelectClause__Group__35115);
            rule__SelectClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectClause__Group__4_in_rule__SelectClause__Group__35118);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2386:1: rule__SelectClause__Group__3__Impl : ( ( rule__SelectClause__ResultClauseAssignment_3 )? ) ;
    public final void rule__SelectClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2390:1: ( ( ( rule__SelectClause__ResultClauseAssignment_3 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2391:1: ( ( rule__SelectClause__ResultClauseAssignment_3 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2391:1: ( ( rule__SelectClause__ResultClauseAssignment_3 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2392:1: ( rule__SelectClause__ResultClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectClauseAccess().getResultClauseAssignment_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2393:1: ( rule__SelectClause__ResultClauseAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_51||LA23_0==KEYWORD_41||(LA23_0>=KEYWORD_34 && LA23_0<=KEYWORD_36)||LA23_0==KEYWORD_1||LA23_0==KEYWORD_4||LA23_0==KEYWORD_7||LA23_0==KEYWORD_9||LA23_0==KEYWORD_12||(LA23_0>=KEYWORD_17 && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2393:2: rule__SelectClause__ResultClauseAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SelectClause__ResultClauseAssignment_3_in_rule__SelectClause__Group__3__Impl5145);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2403:1: rule__SelectClause__Group__4 : rule__SelectClause__Group__4__Impl ;
    public final void rule__SelectClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2407:1: ( rule__SelectClause__Group__4__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2408:2: rule__SelectClause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SelectClause__Group__4__Impl_in_rule__SelectClause__Group__45176);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2414:1: rule__SelectClause__Group__4__Impl : ( ( rule__SelectClause__IntoClauseAssignment_4 )? ) ;
    public final void rule__SelectClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2418:1: ( ( ( rule__SelectClause__IntoClauseAssignment_4 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2419:1: ( ( rule__SelectClause__IntoClauseAssignment_4 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2419:1: ( ( rule__SelectClause__IntoClauseAssignment_4 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2420:1: ( rule__SelectClause__IntoClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectClauseAccess().getIntoClauseAssignment_4()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2421:1: ( rule__SelectClause__IntoClauseAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2421:2: rule__SelectClause__IntoClauseAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SelectClause__IntoClauseAssignment_4_in_rule__SelectClause__Group__4__Impl5203);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2441:1: rule__ResultClause__Group__0 : rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1 ;
    public final void rule__ResultClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2445:1: ( rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2446:2: rule__ResultClause__Group__0__Impl rule__ResultClause__Group__1
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__0__Impl_in_rule__ResultClause__Group__05244);
            rule__ResultClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group__1_in_rule__ResultClause__Group__05247);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2453:1: rule__ResultClause__Group__0__Impl : ( ( rule__ResultClause__IsDistinctAssignment_0 )? ) ;
    public final void rule__ResultClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2457:1: ( ( ( rule__ResultClause__IsDistinctAssignment_0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2458:1: ( ( rule__ResultClause__IsDistinctAssignment_0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2458:1: ( ( rule__ResultClause__IsDistinctAssignment_0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2459:1: ( rule__ResultClause__IsDistinctAssignment_0 )?
            {
             before(grammarAccess.getResultClauseAccess().getIsDistinctAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2460:1: ( rule__ResultClause__IsDistinctAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2460:2: rule__ResultClause__IsDistinctAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ResultClause__IsDistinctAssignment_0_in_rule__ResultClause__Group__0__Impl5274);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2470:1: rule__ResultClause__Group__1 : rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2 ;
    public final void rule__ResultClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2474:1: ( rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2475:2: rule__ResultClause__Group__1__Impl rule__ResultClause__Group__2
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__1__Impl_in_rule__ResultClause__Group__15305);
            rule__ResultClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group__2_in_rule__ResultClause__Group__15308);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2482:1: rule__ResultClause__Group__1__Impl : ( ( rule__ResultClause__ResultSpecsAssignment_1 ) ) ;
    public final void rule__ResultClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2486:1: ( ( ( rule__ResultClause__ResultSpecsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2487:1: ( ( rule__ResultClause__ResultSpecsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2487:1: ( ( rule__ResultClause__ResultSpecsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2488:1: ( rule__ResultClause__ResultSpecsAssignment_1 )
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2489:1: ( rule__ResultClause__ResultSpecsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2489:2: rule__ResultClause__ResultSpecsAssignment_1
            {
            pushFollow(FOLLOW_rule__ResultClause__ResultSpecsAssignment_1_in_rule__ResultClause__Group__1__Impl5335);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2499:1: rule__ResultClause__Group__2 : rule__ResultClause__Group__2__Impl ;
    public final void rule__ResultClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2503:1: ( rule__ResultClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2504:2: rule__ResultClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ResultClause__Group__2__Impl_in_rule__ResultClause__Group__25365);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2510:1: rule__ResultClause__Group__2__Impl : ( ( rule__ResultClause__Group_2__0 )* ) ;
    public final void rule__ResultClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2514:1: ( ( ( rule__ResultClause__Group_2__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2515:1: ( ( rule__ResultClause__Group_2__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2515:1: ( ( rule__ResultClause__Group_2__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2516:1: ( rule__ResultClause__Group_2__0 )*
            {
             before(grammarAccess.getResultClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2517:1: ( rule__ResultClause__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_8) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2517:2: rule__ResultClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ResultClause__Group_2__0_in_rule__ResultClause__Group__2__Impl5392);
            	    rule__ResultClause__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2533:1: rule__ResultClause__Group_2__0 : rule__ResultClause__Group_2__0__Impl rule__ResultClause__Group_2__1 ;
    public final void rule__ResultClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2537:1: ( rule__ResultClause__Group_2__0__Impl rule__ResultClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2538:2: rule__ResultClause__Group_2__0__Impl rule__ResultClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResultClause__Group_2__0__Impl_in_rule__ResultClause__Group_2__05429);
            rule__ResultClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultClause__Group_2__1_in_rule__ResultClause__Group_2__05432);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2545:1: rule__ResultClause__Group_2__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__ResultClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2549:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2550:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2550:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2551:1: KEYWORD_8
            {
             before(grammarAccess.getResultClauseAccess().getCommaKeyword_2_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ResultClause__Group_2__0__Impl5460); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2564:1: rule__ResultClause__Group_2__1 : rule__ResultClause__Group_2__1__Impl ;
    public final void rule__ResultClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2568:1: ( rule__ResultClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2569:2: rule__ResultClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultClause__Group_2__1__Impl_in_rule__ResultClause__Group_2__15491);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2575:1: rule__ResultClause__Group_2__1__Impl : ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) ) ;
    public final void rule__ResultClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2579:1: ( ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2580:1: ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2580:1: ( ( rule__ResultClause__ResultSpecsAssignment_2_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2581:1: ( rule__ResultClause__ResultSpecsAssignment_2_1 )
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsAssignment_2_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2582:1: ( rule__ResultClause__ResultSpecsAssignment_2_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2582:2: rule__ResultClause__ResultSpecsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResultClause__ResultSpecsAssignment_2_1_in_rule__ResultClause__Group_2__1__Impl5518);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2596:1: rule__IntoClause__Group__0 : rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1 ;
    public final void rule__IntoClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2600:1: ( rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2601:2: rule__IntoClause__Group__0__Impl rule__IntoClause__Group__1
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__0__Impl_in_rule__IntoClause__Group__05552);
            rule__IntoClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntoClause__Group__1_in_rule__IntoClause__Group__05555);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2608:1: rule__IntoClause__Group__0__Impl : ( KEYWORD_30 ) ;
    public final void rule__IntoClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2612:1: ( ( KEYWORD_30 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2613:1: ( KEYWORD_30 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2613:1: ( KEYWORD_30 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2614:1: KEYWORD_30
            {
             before(grammarAccess.getIntoClauseAccess().getINTOKeyword_0()); 
            match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__IntoClause__Group__0__Impl5583); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2627:1: rule__IntoClause__Group__1 : rule__IntoClause__Group__1__Impl ;
    public final void rule__IntoClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2631:1: ( rule__IntoClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2632:2: rule__IntoClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntoClause__Group__1__Impl_in_rule__IntoClause__Group__15614);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2638:1: rule__IntoClause__Group__1__Impl : ( ( rule__IntoClause__ResultClassNameAssignment_1 ) ) ;
    public final void rule__IntoClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2642:1: ( ( ( rule__IntoClause__ResultClassNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2643:1: ( ( rule__IntoClause__ResultClassNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2643:1: ( ( rule__IntoClause__ResultClassNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2644:1: ( rule__IntoClause__ResultClassNameAssignment_1 )
            {
             before(grammarAccess.getIntoClauseAccess().getResultClassNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2645:1: ( rule__IntoClause__ResultClassNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2645:2: rule__IntoClause__ResultClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__IntoClause__ResultClassNameAssignment_1_in_rule__IntoClause__Group__1__Impl5641);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2659:1: rule__ResultSpec__Group__0 : rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1 ;
    public final void rule__ResultSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2663:1: ( rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2664:2: rule__ResultSpec__Group__0__Impl rule__ResultSpec__Group__1
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__0__Impl_in_rule__ResultSpec__Group__05675);
            rule__ResultSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultSpec__Group__1_in_rule__ResultSpec__Group__05678);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2671:1: rule__ResultSpec__Group__0__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__ResultSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2675:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2676:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2676:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2677:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getResultSpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__ResultSpec__Group__0__Impl5705);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2688:1: rule__ResultSpec__Group__1 : rule__ResultSpec__Group__1__Impl ;
    public final void rule__ResultSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2692:1: ( rule__ResultSpec__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2693:2: rule__ResultSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultSpec__Group__1__Impl_in_rule__ResultSpec__Group__15734);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2699:1: rule__ResultSpec__Group__1__Impl : ( ( rule__ResultSpec__ResultNamingAssignment_1 )? ) ;
    public final void rule__ResultSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2703:1: ( ( ( rule__ResultSpec__ResultNamingAssignment_1 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2704:1: ( ( rule__ResultSpec__ResultNamingAssignment_1 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2704:1: ( ( rule__ResultSpec__ResultNamingAssignment_1 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2705:1: ( rule__ResultSpec__ResultNamingAssignment_1 )?
            {
             before(grammarAccess.getResultSpecAccess().getResultNamingAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2706:1: ( rule__ResultSpec__ResultNamingAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2706:2: rule__ResultSpec__ResultNamingAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ResultSpec__ResultNamingAssignment_1_in_rule__ResultSpec__Group__1__Impl5761);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2720:1: rule__ResultNaming__Group__0 : rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1 ;
    public final void rule__ResultNaming__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2724:1: ( rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2725:2: rule__ResultNaming__Group__0__Impl rule__ResultNaming__Group__1
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__0__Impl_in_rule__ResultNaming__Group__05796);
            rule__ResultNaming__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResultNaming__Group__1_in_rule__ResultNaming__Group__05799);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2732:1: rule__ResultNaming__Group__0__Impl : ( KEYWORD_23 ) ;
    public final void rule__ResultNaming__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2736:1: ( ( KEYWORD_23 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2737:1: ( KEYWORD_23 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2737:1: ( KEYWORD_23 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2738:1: KEYWORD_23
            {
             before(grammarAccess.getResultNamingAccess().getASKeyword_0()); 
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__ResultNaming__Group__0__Impl5827); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2751:1: rule__ResultNaming__Group__1 : rule__ResultNaming__Group__1__Impl ;
    public final void rule__ResultNaming__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2755:1: ( rule__ResultNaming__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2756:2: rule__ResultNaming__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResultNaming__Group__1__Impl_in_rule__ResultNaming__Group__15858);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2762:1: rule__ResultNaming__Group__1__Impl : ( ( rule__ResultNaming__IdentifierAssignment_1 ) ) ;
    public final void rule__ResultNaming__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2766:1: ( ( ( rule__ResultNaming__IdentifierAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2767:1: ( ( rule__ResultNaming__IdentifierAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2767:1: ( ( rule__ResultNaming__IdentifierAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2768:1: ( rule__ResultNaming__IdentifierAssignment_1 )
            {
             before(grammarAccess.getResultNamingAccess().getIdentifierAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2769:1: ( rule__ResultNaming__IdentifierAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2769:2: rule__ResultNaming__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__ResultNaming__IdentifierAssignment_1_in_rule__ResultNaming__Group__1__Impl5885);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2783:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2787:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2788:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
            {
            pushFollow(FOLLOW_rule__FromClause__Group__0__Impl_in_rule__FromClause__Group__05919);
            rule__FromClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FromClause__Group__1_in_rule__FromClause__Group__05922);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2795:1: rule__FromClause__Group__0__Impl : ( KEYWORD_29 ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2799:1: ( ( KEYWORD_29 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2800:1: ( KEYWORD_29 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2800:1: ( KEYWORD_29 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2801:1: KEYWORD_29
            {
             before(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__FromClause__Group__0__Impl5950); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2814:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl rule__FromClause__Group__2 ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2818:1: ( rule__FromClause__Group__1__Impl rule__FromClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2819:2: rule__FromClause__Group__1__Impl rule__FromClause__Group__2
            {
            pushFollow(FOLLOW_rule__FromClause__Group__1__Impl_in_rule__FromClause__Group__15981);
            rule__FromClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FromClause__Group__2_in_rule__FromClause__Group__15984);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2826:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__CandidateClassNameAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2830:1: ( ( ( rule__FromClause__CandidateClassNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2831:1: ( ( rule__FromClause__CandidateClassNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2831:1: ( ( rule__FromClause__CandidateClassNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2832:1: ( rule__FromClause__CandidateClassNameAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getCandidateClassNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2833:1: ( rule__FromClause__CandidateClassNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2833:2: rule__FromClause__CandidateClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__FromClause__CandidateClassNameAssignment_1_in_rule__FromClause__Group__1__Impl6011);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2843:1: rule__FromClause__Group__2 : rule__FromClause__Group__2__Impl ;
    public final void rule__FromClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2847:1: ( rule__FromClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2848:2: rule__FromClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FromClause__Group__2__Impl_in_rule__FromClause__Group__26041);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2854:1: rule__FromClause__Group__2__Impl : ( ( rule__FromClause__Group_2__0 )? ) ;
    public final void rule__FromClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2858:1: ( ( ( rule__FromClause__Group_2__0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2859:1: ( ( rule__FromClause__Group_2__0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2859:1: ( ( rule__FromClause__Group_2__0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2860:1: ( rule__FromClause__Group_2__0 )?
            {
             before(grammarAccess.getFromClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2861:1: ( rule__FromClause__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2861:2: rule__FromClause__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FromClause__Group_2__0_in_rule__FromClause__Group__2__Impl6068);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2877:1: rule__FromClause__Group_2__0 : rule__FromClause__Group_2__0__Impl rule__FromClause__Group_2__1 ;
    public final void rule__FromClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2881:1: ( rule__FromClause__Group_2__0__Impl rule__FromClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2882:2: rule__FromClause__Group_2__0__Impl rule__FromClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__FromClause__Group_2__0__Impl_in_rule__FromClause__Group_2__06105);
            rule__FromClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FromClause__Group_2__1_in_rule__FromClause__Group_2__06108);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2889:1: rule__FromClause__Group_2__0__Impl : ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) ) ;
    public final void rule__FromClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2893:1: ( ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2894:1: ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2894:1: ( ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2895:1: ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 )
            {
             before(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesAssignment_2_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2896:1: ( rule__FromClause__IsExcludeSubclassesAssignment_2_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2896:2: rule__FromClause__IsExcludeSubclassesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FromClause__IsExcludeSubclassesAssignment_2_0_in_rule__FromClause__Group_2__0__Impl6135);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2906:1: rule__FromClause__Group_2__1 : rule__FromClause__Group_2__1__Impl ;
    public final void rule__FromClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2910:1: ( rule__FromClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2911:2: rule__FromClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FromClause__Group_2__1__Impl_in_rule__FromClause__Group_2__16165);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2917:1: rule__FromClause__Group_2__1__Impl : ( KEYWORD_56 ) ;
    public final void rule__FromClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2921:1: ( ( KEYWORD_56 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2922:1: ( KEYWORD_56 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2922:1: ( KEYWORD_56 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2923:1: KEYWORD_56
            {
             before(grammarAccess.getFromClauseAccess().getSUBCLASSESKeyword_2_1()); 
            match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_rule__FromClause__Group_2__1__Impl6193); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2940:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2944:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2945:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_rule__WhereClause__Group__0__Impl_in_rule__WhereClause__Group__06228);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhereClause__Group__1_in_rule__WhereClause__Group__06231);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2952:1: rule__WhereClause__Group__0__Impl : ( KEYWORD_40 ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2956:1: ( ( KEYWORD_40 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2957:1: ( KEYWORD_40 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2957:1: ( KEYWORD_40 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2958:1: KEYWORD_40
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__WhereClause__Group__0__Impl6259); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2971:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2975:1: ( rule__WhereClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2976:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhereClause__Group__1__Impl_in_rule__WhereClause__Group__16290);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2982:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__FilterAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2986:1: ( ( ( rule__WhereClause__FilterAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2987:1: ( ( rule__WhereClause__FilterAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2987:1: ( ( rule__WhereClause__FilterAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2988:1: ( rule__WhereClause__FilterAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getFilterAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2989:1: ( rule__WhereClause__FilterAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:2989:2: rule__WhereClause__FilterAssignment_1
            {
            pushFollow(FOLLOW_rule__WhereClause__FilterAssignment_1_in_rule__WhereClause__Group__1__Impl6317);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3003:1: rule__VariablesClause__Group__0 : rule__VariablesClause__Group__0__Impl rule__VariablesClause__Group__1 ;
    public final void rule__VariablesClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3007:1: ( rule__VariablesClause__Group__0__Impl rule__VariablesClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3008:2: rule__VariablesClause__Group__0__Impl rule__VariablesClause__Group__1
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__0__Impl_in_rule__VariablesClause__Group__06351);
            rule__VariablesClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group__1_in_rule__VariablesClause__Group__06354);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3015:1: rule__VariablesClause__Group__0__Impl : ( KEYWORD_53 ) ;
    public final void rule__VariablesClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3019:1: ( ( KEYWORD_53 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3020:1: ( KEYWORD_53 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3020:1: ( KEYWORD_53 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3021:1: KEYWORD_53
            {
             before(grammarAccess.getVariablesClauseAccess().getVARIABLESKeyword_0()); 
            match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__VariablesClause__Group__0__Impl6382); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3034:1: rule__VariablesClause__Group__1 : rule__VariablesClause__Group__1__Impl rule__VariablesClause__Group__2 ;
    public final void rule__VariablesClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3038:1: ( rule__VariablesClause__Group__1__Impl rule__VariablesClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3039:2: rule__VariablesClause__Group__1__Impl rule__VariablesClause__Group__2
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__1__Impl_in_rule__VariablesClause__Group__16413);
            rule__VariablesClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group__2_in_rule__VariablesClause__Group__16416);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3046:1: rule__VariablesClause__Group__1__Impl : ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) ) ;
    public final void rule__VariablesClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3050:1: ( ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3051:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3051:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3052:1: ( rule__VariablesClause__VariableDeclarationsAssignment_1 )
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3053:1: ( rule__VariablesClause__VariableDeclarationsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3053:2: rule__VariablesClause__VariableDeclarationsAssignment_1
            {
            pushFollow(FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_1_in_rule__VariablesClause__Group__1__Impl6443);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3063:1: rule__VariablesClause__Group__2 : rule__VariablesClause__Group__2__Impl rule__VariablesClause__Group__3 ;
    public final void rule__VariablesClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3067:1: ( rule__VariablesClause__Group__2__Impl rule__VariablesClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3068:2: rule__VariablesClause__Group__2__Impl rule__VariablesClause__Group__3
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__2__Impl_in_rule__VariablesClause__Group__26473);
            rule__VariablesClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group__3_in_rule__VariablesClause__Group__26476);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3075:1: rule__VariablesClause__Group__2__Impl : ( ( rule__VariablesClause__Group_2__0 )* ) ;
    public final void rule__VariablesClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3079:1: ( ( ( rule__VariablesClause__Group_2__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3080:1: ( ( rule__VariablesClause__Group_2__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3080:1: ( ( rule__VariablesClause__Group_2__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3081:1: ( rule__VariablesClause__Group_2__0 )*
            {
             before(grammarAccess.getVariablesClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3082:1: ( rule__VariablesClause__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_13) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==KEYWORD_50||LA29_1==KEYWORD_47||(LA29_1>=KEYWORD_42 && LA29_1<=KEYWORD_43)||(LA29_1>=KEYWORD_31 && LA29_1<=KEYWORD_33)||LA29_1==KEYWORD_27||LA29_1==RULE_ID) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3082:2: rule__VariablesClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariablesClause__Group_2__0_in_rule__VariablesClause__Group__2__Impl6503);
            	    rule__VariablesClause__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3092:1: rule__VariablesClause__Group__3 : rule__VariablesClause__Group__3__Impl ;
    public final void rule__VariablesClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3096:1: ( rule__VariablesClause__Group__3__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3097:2: rule__VariablesClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group__3__Impl_in_rule__VariablesClause__Group__36534);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3103:1: rule__VariablesClause__Group__3__Impl : ( ( KEYWORD_13 )? ) ;
    public final void rule__VariablesClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3107:1: ( ( ( KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3108:1: ( ( KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3108:1: ( ( KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3109:1: ( KEYWORD_13 )?
            {
             before(grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3110:1: ( KEYWORD_13 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3111:2: KEYWORD_13
                    {
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group__3__Impl6563); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3130:1: rule__VariablesClause__Group_2__0 : rule__VariablesClause__Group_2__0__Impl rule__VariablesClause__Group_2__1 ;
    public final void rule__VariablesClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3134:1: ( rule__VariablesClause__Group_2__0__Impl rule__VariablesClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3135:2: rule__VariablesClause__Group_2__0__Impl rule__VariablesClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group_2__0__Impl_in_rule__VariablesClause__Group_2__06604);
            rule__VariablesClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariablesClause__Group_2__1_in_rule__VariablesClause__Group_2__06607);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3142:1: rule__VariablesClause__Group_2__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__VariablesClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3146:1: ( ( KEYWORD_13 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3147:1: ( KEYWORD_13 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3147:1: ( KEYWORD_13 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3148:1: KEYWORD_13
            {
             before(grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_2_0()); 
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group_2__0__Impl6635); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3161:1: rule__VariablesClause__Group_2__1 : rule__VariablesClause__Group_2__1__Impl ;
    public final void rule__VariablesClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3165:1: ( rule__VariablesClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3166:2: rule__VariablesClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariablesClause__Group_2__1__Impl_in_rule__VariablesClause__Group_2__16666);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3172:1: rule__VariablesClause__Group_2__1__Impl : ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) ) ;
    public final void rule__VariablesClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3176:1: ( ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3177:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3177:1: ( ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3178:1: ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsAssignment_2_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3179:1: ( rule__VariablesClause__VariableDeclarationsAssignment_2_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3179:2: rule__VariablesClause__VariableDeclarationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_2_1_in_rule__VariablesClause__Group_2__1__Impl6693);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3193:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3197:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3198:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__06727);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__06730);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3205:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3209:1: ( ( ( rule__VariableDeclaration__TypeAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3210:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3210:1: ( ( rule__VariableDeclaration__TypeAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3211:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3212:1: ( rule__VariableDeclaration__TypeAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3212:2: rule__VariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl6757);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3222:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3226:1: ( rule__VariableDeclaration__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3227:2: rule__VariableDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__16787);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3233:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3237:1: ( ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3238:1: ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3238:1: ( ( rule__VariableDeclaration__VariableNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3239:1: ( rule__VariableDeclaration__VariableNameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3240:1: ( rule__VariableDeclaration__VariableNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3240:2: rule__VariableDeclaration__VariableNameAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__VariableNameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl6814);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3254:1: rule__ParametersClause__Group__0 : rule__ParametersClause__Group__0__Impl rule__ParametersClause__Group__1 ;
    public final void rule__ParametersClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3258:1: ( rule__ParametersClause__Group__0__Impl rule__ParametersClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3259:2: rule__ParametersClause__Group__0__Impl rule__ParametersClause__Group__1
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__0__Impl_in_rule__ParametersClause__Group__06848);
            rule__ParametersClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group__1_in_rule__ParametersClause__Group__06851);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3266:1: rule__ParametersClause__Group__0__Impl : ( KEYWORD_55 ) ;
    public final void rule__ParametersClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3270:1: ( ( KEYWORD_55 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3271:1: ( KEYWORD_55 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3271:1: ( KEYWORD_55 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3272:1: KEYWORD_55
            {
             before(grammarAccess.getParametersClauseAccess().getPARAMETERSKeyword_0()); 
            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rule__ParametersClause__Group__0__Impl6879); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3285:1: rule__ParametersClause__Group__1 : rule__ParametersClause__Group__1__Impl rule__ParametersClause__Group__2 ;
    public final void rule__ParametersClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3289:1: ( rule__ParametersClause__Group__1__Impl rule__ParametersClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3290:2: rule__ParametersClause__Group__1__Impl rule__ParametersClause__Group__2
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__1__Impl_in_rule__ParametersClause__Group__16910);
            rule__ParametersClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group__2_in_rule__ParametersClause__Group__16913);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3297:1: rule__ParametersClause__Group__1__Impl : ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) ) ;
    public final void rule__ParametersClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3301:1: ( ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3302:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3302:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3303:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_1 )
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3304:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3304:2: rule__ParametersClause__ParameterDeclarationsAssignment_1
            {
            pushFollow(FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_1_in_rule__ParametersClause__Group__1__Impl6940);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3314:1: rule__ParametersClause__Group__2 : rule__ParametersClause__Group__2__Impl rule__ParametersClause__Group__3 ;
    public final void rule__ParametersClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3318:1: ( rule__ParametersClause__Group__2__Impl rule__ParametersClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3319:2: rule__ParametersClause__Group__2__Impl rule__ParametersClause__Group__3
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__2__Impl_in_rule__ParametersClause__Group__26970);
            rule__ParametersClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group__3_in_rule__ParametersClause__Group__26973);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3326:1: rule__ParametersClause__Group__2__Impl : ( ( rule__ParametersClause__Group_2__0 )* ) ;
    public final void rule__ParametersClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3330:1: ( ( ( rule__ParametersClause__Group_2__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3331:1: ( ( rule__ParametersClause__Group_2__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3331:1: ( ( rule__ParametersClause__Group_2__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3332:1: ( rule__ParametersClause__Group_2__0 )*
            {
             before(grammarAccess.getParametersClauseAccess().getGroup_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3333:1: ( rule__ParametersClause__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==KEYWORD_8) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==KEYWORD_50||LA31_1==KEYWORD_47||(LA31_1>=KEYWORD_42 && LA31_1<=KEYWORD_43)||(LA31_1>=KEYWORD_31 && LA31_1<=KEYWORD_33)||LA31_1==KEYWORD_27||LA31_1==RULE_ID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3333:2: rule__ParametersClause__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ParametersClause__Group_2__0_in_rule__ParametersClause__Group__2__Impl7000);
            	    rule__ParametersClause__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3343:1: rule__ParametersClause__Group__3 : rule__ParametersClause__Group__3__Impl ;
    public final void rule__ParametersClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3347:1: ( rule__ParametersClause__Group__3__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3348:2: rule__ParametersClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group__3__Impl_in_rule__ParametersClause__Group__37031);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3354:1: rule__ParametersClause__Group__3__Impl : ( ( KEYWORD_8 )? ) ;
    public final void rule__ParametersClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3358:1: ( ( ( KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3359:1: ( ( KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3359:1: ( ( KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3360:1: ( KEYWORD_8 )?
            {
             before(grammarAccess.getParametersClauseAccess().getCommaKeyword_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3361:1: ( KEYWORD_8 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_8) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3362:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group__3__Impl7060); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3381:1: rule__ParametersClause__Group_2__0 : rule__ParametersClause__Group_2__0__Impl rule__ParametersClause__Group_2__1 ;
    public final void rule__ParametersClause__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3385:1: ( rule__ParametersClause__Group_2__0__Impl rule__ParametersClause__Group_2__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3386:2: rule__ParametersClause__Group_2__0__Impl rule__ParametersClause__Group_2__1
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group_2__0__Impl_in_rule__ParametersClause__Group_2__07101);
            rule__ParametersClause__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersClause__Group_2__1_in_rule__ParametersClause__Group_2__07104);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3393:1: rule__ParametersClause__Group_2__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__ParametersClause__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3397:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3398:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3398:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3399:1: KEYWORD_8
            {
             before(grammarAccess.getParametersClauseAccess().getCommaKeyword_2_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group_2__0__Impl7132); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3412:1: rule__ParametersClause__Group_2__1 : rule__ParametersClause__Group_2__1__Impl ;
    public final void rule__ParametersClause__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3416:1: ( rule__ParametersClause__Group_2__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3417:2: rule__ParametersClause__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ParametersClause__Group_2__1__Impl_in_rule__ParametersClause__Group_2__17163);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3423:1: rule__ParametersClause__Group_2__1__Impl : ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) ) ;
    public final void rule__ParametersClause__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3427:1: ( ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3428:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3428:1: ( ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3429:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 )
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsAssignment_2_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3430:1: ( rule__ParametersClause__ParameterDeclarationsAssignment_2_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3430:2: rule__ParametersClause__ParameterDeclarationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_2_1_in_rule__ParametersClause__Group_2__1__Impl7190);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3444:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3448:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3449:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__07224);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__07227);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3456:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3460:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3461:1: ( ( rule__ParameterDeclaration__TypeAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3461:1: ( ( rule__ParameterDeclaration__TypeAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3462:1: ( rule__ParameterDeclaration__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3463:1: ( rule__ParameterDeclaration__TypeAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3463:2: rule__ParameterDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__TypeAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl7254);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3473:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3477:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3478:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__17284);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3484:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3488:1: ( ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3489:1: ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3489:1: ( ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3490:1: ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3491:1: ( rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3491:2: rule__ParameterDeclaration__DeclaredParameterNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__DeclaredParameterNameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl7311);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3505:1: rule__ImportClause__Group__0 : rule__ImportClause__Group__0__Impl rule__ImportClause__Group__1 ;
    public final void rule__ImportClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3509:1: ( rule__ImportClause__Group__0__Impl rule__ImportClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3510:2: rule__ImportClause__Group__0__Impl rule__ImportClause__Group__1
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__0__Impl_in_rule__ImportClause__Group__07345);
            rule__ImportClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportClause__Group__1_in_rule__ImportClause__Group__07348);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3517:1: rule__ImportClause__Group__0__Impl : ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) ) ;
    public final void rule__ImportClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3521:1: ( ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3522:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3522:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_0 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3523:1: ( rule__ImportClause__ImportDeclarationsAssignment_0 )
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3524:1: ( rule__ImportClause__ImportDeclarationsAssignment_0 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3524:2: rule__ImportClause__ImportDeclarationsAssignment_0
            {
            pushFollow(FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_0_in_rule__ImportClause__Group__0__Impl7375);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3534:1: rule__ImportClause__Group__1 : rule__ImportClause__Group__1__Impl rule__ImportClause__Group__2 ;
    public final void rule__ImportClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3538:1: ( rule__ImportClause__Group__1__Impl rule__ImportClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3539:2: rule__ImportClause__Group__1__Impl rule__ImportClause__Group__2
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__1__Impl_in_rule__ImportClause__Group__17405);
            rule__ImportClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportClause__Group__2_in_rule__ImportClause__Group__17408);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3546:1: rule__ImportClause__Group__1__Impl : ( ( rule__ImportClause__Group_1__0 )* ) ;
    public final void rule__ImportClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3550:1: ( ( ( rule__ImportClause__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3551:1: ( ( rule__ImportClause__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3551:1: ( ( rule__ImportClause__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3552:1: ( rule__ImportClause__Group_1__0 )*
            {
             before(grammarAccess.getImportClauseAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3553:1: ( rule__ImportClause__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==KEYWORD_13) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==KEYWORD_48) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3553:2: rule__ImportClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ImportClause__Group_1__0_in_rule__ImportClause__Group__1__Impl7435);
            	    rule__ImportClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3563:1: rule__ImportClause__Group__2 : rule__ImportClause__Group__2__Impl ;
    public final void rule__ImportClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3567:1: ( rule__ImportClause__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3568:2: rule__ImportClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportClause__Group__2__Impl_in_rule__ImportClause__Group__27466);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3574:1: rule__ImportClause__Group__2__Impl : ( ( KEYWORD_13 )? ) ;
    public final void rule__ImportClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3578:1: ( ( ( KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3579:1: ( ( KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3579:1: ( ( KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3580:1: ( KEYWORD_13 )?
            {
             before(grammarAccess.getImportClauseAccess().getSemicolonKeyword_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3581:1: ( KEYWORD_13 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_13) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3582:2: KEYWORD_13
                    {
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__ImportClause__Group__2__Impl7495); 

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3599:1: rule__ImportClause__Group_1__0 : rule__ImportClause__Group_1__0__Impl rule__ImportClause__Group_1__1 ;
    public final void rule__ImportClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3603:1: ( rule__ImportClause__Group_1__0__Impl rule__ImportClause__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3604:2: rule__ImportClause__Group_1__0__Impl rule__ImportClause__Group_1__1
            {
            pushFollow(FOLLOW_rule__ImportClause__Group_1__0__Impl_in_rule__ImportClause__Group_1__07534);
            rule__ImportClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportClause__Group_1__1_in_rule__ImportClause__Group_1__07537);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3611:1: rule__ImportClause__Group_1__0__Impl : ( KEYWORD_13 ) ;
    public final void rule__ImportClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3615:1: ( ( KEYWORD_13 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3616:1: ( KEYWORD_13 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3616:1: ( KEYWORD_13 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3617:1: KEYWORD_13
            {
             before(grammarAccess.getImportClauseAccess().getSemicolonKeyword_1_0()); 
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__ImportClause__Group_1__0__Impl7565); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3630:1: rule__ImportClause__Group_1__1 : rule__ImportClause__Group_1__1__Impl ;
    public final void rule__ImportClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3634:1: ( rule__ImportClause__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3635:2: rule__ImportClause__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportClause__Group_1__1__Impl_in_rule__ImportClause__Group_1__17596);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3641:1: rule__ImportClause__Group_1__1__Impl : ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) ) ;
    public final void rule__ImportClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3645:1: ( ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3646:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3646:1: ( ( rule__ImportClause__ImportDeclarationsAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3647:1: ( rule__ImportClause__ImportDeclarationsAssignment_1_1 )
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3648:1: ( rule__ImportClause__ImportDeclarationsAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3648:2: rule__ImportClause__ImportDeclarationsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_1_1_in_rule__ImportClause__Group_1__1__Impl7623);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3662:1: rule__ImportDeclaration__Group__0 : rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 ;
    public final void rule__ImportDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3666:1: ( rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3667:2: rule__ImportDeclaration__Group__0__Impl rule__ImportDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__07657);
            rule__ImportDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__07660);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3674:1: rule__ImportDeclaration__Group__0__Impl : ( KEYWORD_48 ) ;
    public final void rule__ImportDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3678:1: ( ( KEYWORD_48 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3679:1: ( KEYWORD_48 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3679:1: ( KEYWORD_48 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3680:1: KEYWORD_48
            {
             before(grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
            match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__ImportDeclaration__Group__0__Impl7688); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3693:1: rule__ImportDeclaration__Group__1 : rule__ImportDeclaration__Group__1__Impl ;
    public final void rule__ImportDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3697:1: ( rule__ImportDeclaration__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3698:2: rule__ImportDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__17719);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3704:1: rule__ImportDeclaration__Group__1__Impl : ( ruleQualifiedIdentifier ) ;
    public final void rule__ImportDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3708:1: ( ( ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3709:1: ( ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3709:1: ( ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3710:1: ruleQualifiedIdentifier
            {
             before(grammarAccess.getImportDeclarationAccess().getQualifiedIdentifierParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_rule__ImportDeclaration__Group__1__Impl7746);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3725:1: rule__GroupByClause__Group__0 : rule__GroupByClause__Group__0__Impl rule__GroupByClause__Group__1 ;
    public final void rule__GroupByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3729:1: ( rule__GroupByClause__Group__0__Impl rule__GroupByClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3730:2: rule__GroupByClause__Group__0__Impl rule__GroupByClause__Group__1
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__0__Impl_in_rule__GroupByClause__Group__07779);
            rule__GroupByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group__1_in_rule__GroupByClause__Group__07782);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3737:1: rule__GroupByClause__Group__0__Impl : ( KEYWORD_37 ) ;
    public final void rule__GroupByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3741:1: ( ( KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3742:1: ( KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3742:1: ( KEYWORD_37 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3743:1: KEYWORD_37
            {
             before(grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0()); 
            match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__GroupByClause__Group__0__Impl7810); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3756:1: rule__GroupByClause__Group__1 : rule__GroupByClause__Group__1__Impl rule__GroupByClause__Group__2 ;
    public final void rule__GroupByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3760:1: ( rule__GroupByClause__Group__1__Impl rule__GroupByClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3761:2: rule__GroupByClause__Group__1__Impl rule__GroupByClause__Group__2
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__1__Impl_in_rule__GroupByClause__Group__17841);
            rule__GroupByClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group__2_in_rule__GroupByClause__Group__17844);
            rule__GroupByClause__Group__2();

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3768:1: rule__GroupByClause__Group__1__Impl : ( KEYWORD_24 ) ;
    public final void rule__GroupByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3772:1: ( ( KEYWORD_24 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3773:1: ( KEYWORD_24 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3773:1: ( KEYWORD_24 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3774:1: KEYWORD_24
            {
             before(grammarAccess.getGroupByClauseAccess().getBYKeyword_1()); 
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__GroupByClause__Group__1__Impl7872); 
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


    // $ANTLR start "rule__GroupByClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3787:1: rule__GroupByClause__Group__2 : rule__GroupByClause__Group__2__Impl rule__GroupByClause__Group__3 ;
    public final void rule__GroupByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3791:1: ( rule__GroupByClause__Group__2__Impl rule__GroupByClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3792:2: rule__GroupByClause__Group__2__Impl rule__GroupByClause__Group__3
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__2__Impl_in_rule__GroupByClause__Group__27903);
            rule__GroupByClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group__3_in_rule__GroupByClause__Group__27906);
            rule__GroupByClause__Group__3();

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
    // $ANTLR end "rule__GroupByClause__Group__2"


    // $ANTLR start "rule__GroupByClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3799:1: rule__GroupByClause__Group__2__Impl : ( ( rule__GroupByClause__GroupingAssignment_2 ) ) ;
    public final void rule__GroupByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3803:1: ( ( ( rule__GroupByClause__GroupingAssignment_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3804:1: ( ( rule__GroupByClause__GroupingAssignment_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3804:1: ( ( rule__GroupByClause__GroupingAssignment_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3805:1: ( rule__GroupByClause__GroupingAssignment_2 )
            {
             before(grammarAccess.getGroupByClauseAccess().getGroupingAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3806:1: ( rule__GroupByClause__GroupingAssignment_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3806:2: rule__GroupByClause__GroupingAssignment_2
            {
            pushFollow(FOLLOW_rule__GroupByClause__GroupingAssignment_2_in_rule__GroupByClause__Group__2__Impl7933);
            rule__GroupByClause__GroupingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupByClauseAccess().getGroupingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__Group__2__Impl"


    // $ANTLR start "rule__GroupByClause__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3816:1: rule__GroupByClause__Group__3 : rule__GroupByClause__Group__3__Impl rule__GroupByClause__Group__4 ;
    public final void rule__GroupByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3820:1: ( rule__GroupByClause__Group__3__Impl rule__GroupByClause__Group__4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3821:2: rule__GroupByClause__Group__3__Impl rule__GroupByClause__Group__4
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__3__Impl_in_rule__GroupByClause__Group__37963);
            rule__GroupByClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group__4_in_rule__GroupByClause__Group__37966);
            rule__GroupByClause__Group__4();

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
    // $ANTLR end "rule__GroupByClause__Group__3"


    // $ANTLR start "rule__GroupByClause__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3828:1: rule__GroupByClause__Group__3__Impl : ( ( rule__GroupByClause__Group_3__0 )* ) ;
    public final void rule__GroupByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3832:1: ( ( ( rule__GroupByClause__Group_3__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3833:1: ( ( rule__GroupByClause__Group_3__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3833:1: ( ( rule__GroupByClause__Group_3__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3834:1: ( rule__GroupByClause__Group_3__0 )*
            {
             before(grammarAccess.getGroupByClauseAccess().getGroup_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3835:1: ( rule__GroupByClause__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_8) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==KEYWORD_41||(LA35_1>=KEYWORD_34 && LA35_1<=KEYWORD_36)||LA35_1==KEYWORD_1||LA35_1==KEYWORD_4||LA35_1==KEYWORD_7||LA35_1==KEYWORD_9||LA35_1==KEYWORD_12||(LA35_1>=KEYWORD_17 && LA35_1<=RULE_STRING)) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3835:2: rule__GroupByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__GroupByClause__Group_3__0_in_rule__GroupByClause__Group__3__Impl7993);
            	    rule__GroupByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getGroupByClauseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__Group__3__Impl"


    // $ANTLR start "rule__GroupByClause__Group__4"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3845:1: rule__GroupByClause__Group__4 : rule__GroupByClause__Group__4__Impl rule__GroupByClause__Group__5 ;
    public final void rule__GroupByClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3849:1: ( rule__GroupByClause__Group__4__Impl rule__GroupByClause__Group__5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3850:2: rule__GroupByClause__Group__4__Impl rule__GroupByClause__Group__5
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__4__Impl_in_rule__GroupByClause__Group__48024);
            rule__GroupByClause__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group__5_in_rule__GroupByClause__Group__48027);
            rule__GroupByClause__Group__5();

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
    // $ANTLR end "rule__GroupByClause__Group__4"


    // $ANTLR start "rule__GroupByClause__Group__4__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3857:1: rule__GroupByClause__Group__4__Impl : ( ( KEYWORD_8 )? ) ;
    public final void rule__GroupByClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3861:1: ( ( ( KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3862:1: ( ( KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3862:1: ( ( KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3863:1: ( KEYWORD_8 )?
            {
             before(grammarAccess.getGroupByClauseAccess().getCommaKeyword_4()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3864:1: ( KEYWORD_8 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_8) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3865:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__GroupByClause__Group__4__Impl8056); 

                    }
                    break;

            }

             after(grammarAccess.getGroupByClauseAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__Group__4__Impl"


    // $ANTLR start "rule__GroupByClause__Group__5"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3876:1: rule__GroupByClause__Group__5 : rule__GroupByClause__Group__5__Impl ;
    public final void rule__GroupByClause__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3880:1: ( rule__GroupByClause__Group__5__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3881:2: rule__GroupByClause__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group__5__Impl_in_rule__GroupByClause__Group__58089);
            rule__GroupByClause__Group__5__Impl();

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
    // $ANTLR end "rule__GroupByClause__Group__5"


    // $ANTLR start "rule__GroupByClause__Group__5__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3887:1: rule__GroupByClause__Group__5__Impl : ( ( rule__GroupByClause__HavingClauseAssignment_5 )? ) ;
    public final void rule__GroupByClause__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3891:1: ( ( ( rule__GroupByClause__HavingClauseAssignment_5 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3892:1: ( ( rule__GroupByClause__HavingClauseAssignment_5 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3892:1: ( ( rule__GroupByClause__HavingClauseAssignment_5 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3893:1: ( rule__GroupByClause__HavingClauseAssignment_5 )?
            {
             before(grammarAccess.getGroupByClauseAccess().getHavingClauseAssignment_5()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3894:1: ( rule__GroupByClause__HavingClauseAssignment_5 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3894:2: rule__GroupByClause__HavingClauseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__GroupByClause__HavingClauseAssignment_5_in_rule__GroupByClause__Group__5__Impl8116);
                    rule__GroupByClause__HavingClauseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupByClauseAccess().getHavingClauseAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__Group__5__Impl"


    // $ANTLR start "rule__GroupByClause__Group_3__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3916:1: rule__GroupByClause__Group_3__0 : rule__GroupByClause__Group_3__0__Impl rule__GroupByClause__Group_3__1 ;
    public final void rule__GroupByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3920:1: ( rule__GroupByClause__Group_3__0__Impl rule__GroupByClause__Group_3__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3921:2: rule__GroupByClause__Group_3__0__Impl rule__GroupByClause__Group_3__1
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group_3__0__Impl_in_rule__GroupByClause__Group_3__08159);
            rule__GroupByClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupByClause__Group_3__1_in_rule__GroupByClause__Group_3__08162);
            rule__GroupByClause__Group_3__1();

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
    // $ANTLR end "rule__GroupByClause__Group_3__0"


    // $ANTLR start "rule__GroupByClause__Group_3__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3928:1: rule__GroupByClause__Group_3__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__GroupByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3932:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3933:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3933:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3934:1: KEYWORD_8
            {
             before(grammarAccess.getGroupByClauseAccess().getCommaKeyword_3_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__GroupByClause__Group_3__0__Impl8190); 
             after(grammarAccess.getGroupByClauseAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__Group_3__0__Impl"


    // $ANTLR start "rule__GroupByClause__Group_3__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3947:1: rule__GroupByClause__Group_3__1 : rule__GroupByClause__Group_3__1__Impl ;
    public final void rule__GroupByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3951:1: ( rule__GroupByClause__Group_3__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3952:2: rule__GroupByClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupByClause__Group_3__1__Impl_in_rule__GroupByClause__Group_3__18221);
            rule__GroupByClause__Group_3__1__Impl();

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
    // $ANTLR end "rule__GroupByClause__Group_3__1"


    // $ANTLR start "rule__GroupByClause__Group_3__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3958:1: rule__GroupByClause__Group_3__1__Impl : ( ( rule__GroupByClause__GroupingAssignment_3_1 ) ) ;
    public final void rule__GroupByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3962:1: ( ( ( rule__GroupByClause__GroupingAssignment_3_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3963:1: ( ( rule__GroupByClause__GroupingAssignment_3_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3963:1: ( ( rule__GroupByClause__GroupingAssignment_3_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3964:1: ( rule__GroupByClause__GroupingAssignment_3_1 )
            {
             before(grammarAccess.getGroupByClauseAccess().getGroupingAssignment_3_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3965:1: ( rule__GroupByClause__GroupingAssignment_3_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3965:2: rule__GroupByClause__GroupingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__GroupByClause__GroupingAssignment_3_1_in_rule__GroupByClause__Group_3__1__Impl8248);
            rule__GroupByClause__GroupingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupByClauseAccess().getGroupingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__Group_3__1__Impl"


    // $ANTLR start "rule__HavingClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3979:1: rule__HavingClause__Group__0 : rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1 ;
    public final void rule__HavingClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3983:1: ( rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3984:2: rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1
            {
            pushFollow(FOLLOW_rule__HavingClause__Group__0__Impl_in_rule__HavingClause__Group__08282);
            rule__HavingClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HavingClause__Group__1_in_rule__HavingClause__Group__08285);
            rule__HavingClause__Group__1();

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
    // $ANTLR end "rule__HavingClause__Group__0"


    // $ANTLR start "rule__HavingClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3991:1: rule__HavingClause__Group__0__Impl : ( KEYWORD_44 ) ;
    public final void rule__HavingClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3995:1: ( ( KEYWORD_44 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3996:1: ( KEYWORD_44 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3996:1: ( KEYWORD_44 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:3997:1: KEYWORD_44
            {
             before(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0()); 
            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__HavingClause__Group__0__Impl8313); 
             after(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__Group__0__Impl"


    // $ANTLR start "rule__HavingClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4010:1: rule__HavingClause__Group__1 : rule__HavingClause__Group__1__Impl ;
    public final void rule__HavingClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4014:1: ( rule__HavingClause__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4015:2: rule__HavingClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HavingClause__Group__1__Impl_in_rule__HavingClause__Group__18344);
            rule__HavingClause__Group__1__Impl();

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
    // $ANTLR end "rule__HavingClause__Group__1"


    // $ANTLR start "rule__HavingClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4021:1: rule__HavingClause__Group__1__Impl : ( ( rule__HavingClause__HavingAssignment_1 ) ) ;
    public final void rule__HavingClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4025:1: ( ( ( rule__HavingClause__HavingAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4026:1: ( ( rule__HavingClause__HavingAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4026:1: ( ( rule__HavingClause__HavingAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4027:1: ( rule__HavingClause__HavingAssignment_1 )
            {
             before(grammarAccess.getHavingClauseAccess().getHavingAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4028:1: ( rule__HavingClause__HavingAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4028:2: rule__HavingClause__HavingAssignment_1
            {
            pushFollow(FOLLOW_rule__HavingClause__HavingAssignment_1_in_rule__HavingClause__Group__1__Impl8371);
            rule__HavingClause__HavingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHavingClauseAccess().getHavingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4042:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4046:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4047:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__0__Impl_in_rule__OrderByClause__Group__08405);
            rule__OrderByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderByClause__Group__1_in_rule__OrderByClause__Group__08408);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4054:1: rule__OrderByClause__Group__0__Impl : ( KEYWORD_38 ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4058:1: ( ( KEYWORD_38 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4059:1: ( KEYWORD_38 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4059:1: ( KEYWORD_38 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4060:1: KEYWORD_38
            {
             before(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__OrderByClause__Group__0__Impl8436); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4073:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4077:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4078:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__1__Impl_in_rule__OrderByClause__Group__18467);
            rule__OrderByClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderByClause__Group__2_in_rule__OrderByClause__Group__18470);
            rule__OrderByClause__Group__2();

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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4085:1: rule__OrderByClause__Group__1__Impl : ( KEYWORD_24 ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4089:1: ( ( KEYWORD_24 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4090:1: ( KEYWORD_24 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4090:1: ( KEYWORD_24 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4091:1: KEYWORD_24
            {
             before(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__OrderByClause__Group__1__Impl8498); 
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


    // $ANTLR start "rule__OrderByClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4104:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4108:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4109:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__2__Impl_in_rule__OrderByClause__Group__28529);
            rule__OrderByClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderByClause__Group__3_in_rule__OrderByClause__Group__28532);
            rule__OrderByClause__Group__3();

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
    // $ANTLR end "rule__OrderByClause__Group__2"


    // $ANTLR start "rule__OrderByClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4116:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderingAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4120:1: ( ( ( rule__OrderByClause__OrderingAssignment_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4121:1: ( ( rule__OrderByClause__OrderingAssignment_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4121:1: ( ( rule__OrderByClause__OrderingAssignment_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4122:1: ( rule__OrderByClause__OrderingAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingAssignment_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4123:1: ( rule__OrderByClause__OrderingAssignment_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4123:2: rule__OrderByClause__OrderingAssignment_2
            {
            pushFollow(FOLLOW_rule__OrderByClause__OrderingAssignment_2_in_rule__OrderByClause__Group__2__Impl8559);
            rule__OrderByClause__OrderingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__2__Impl"


    // $ANTLR start "rule__OrderByClause__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4133:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl rule__OrderByClause__Group__4 ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4137:1: ( rule__OrderByClause__Group__3__Impl rule__OrderByClause__Group__4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4138:2: rule__OrderByClause__Group__3__Impl rule__OrderByClause__Group__4
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__3__Impl_in_rule__OrderByClause__Group__38589);
            rule__OrderByClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderByClause__Group__4_in_rule__OrderByClause__Group__38592);
            rule__OrderByClause__Group__4();

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
    // $ANTLR end "rule__OrderByClause__Group__3"


    // $ANTLR start "rule__OrderByClause__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4145:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4149:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4150:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4150:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4151:1: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4152:1: ( rule__OrderByClause__Group_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_8) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==KEYWORD_41||(LA38_1>=KEYWORD_34 && LA38_1<=KEYWORD_36)||LA38_1==KEYWORD_1||LA38_1==KEYWORD_4||LA38_1==KEYWORD_7||LA38_1==KEYWORD_9||LA38_1==KEYWORD_12||(LA38_1>=KEYWORD_17 && LA38_1<=RULE_STRING)) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4152:2: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__OrderByClause__Group_3__0_in_rule__OrderByClause__Group__3__Impl8619);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getOrderByClauseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__3__Impl"


    // $ANTLR start "rule__OrderByClause__Group__4"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4162:1: rule__OrderByClause__Group__4 : rule__OrderByClause__Group__4__Impl ;
    public final void rule__OrderByClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4166:1: ( rule__OrderByClause__Group__4__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4167:2: rule__OrderByClause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group__4__Impl_in_rule__OrderByClause__Group__48650);
            rule__OrderByClause__Group__4__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group__4"


    // $ANTLR start "rule__OrderByClause__Group__4__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4173:1: rule__OrderByClause__Group__4__Impl : ( ( KEYWORD_8 )? ) ;
    public final void rule__OrderByClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4177:1: ( ( ( KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4178:1: ( ( KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4178:1: ( ( KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4179:1: ( KEYWORD_8 )?
            {
             before(grammarAccess.getOrderByClauseAccess().getCommaKeyword_4()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4180:1: ( KEYWORD_8 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_8) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4181:2: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__OrderByClause__Group__4__Impl8679); 

                    }
                    break;

            }

             after(grammarAccess.getOrderByClauseAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__4__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4202:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4206:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4207:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group_3__0__Impl_in_rule__OrderByClause__Group_3__08722);
            rule__OrderByClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderByClause__Group_3__1_in_rule__OrderByClause__Group_3__08725);
            rule__OrderByClause__Group_3__1();

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
    // $ANTLR end "rule__OrderByClause__Group_3__0"


    // $ANTLR start "rule__OrderByClause__Group_3__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4214:1: rule__OrderByClause__Group_3__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4218:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4219:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4219:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4220:1: KEYWORD_8
            {
             before(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__OrderByClause__Group_3__0__Impl8753); 
             after(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4233:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4237:1: ( rule__OrderByClause__Group_3__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4238:2: rule__OrderByClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderByClause__Group_3__1__Impl_in_rule__OrderByClause__Group_3__18784);
            rule__OrderByClause__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group_3__1"


    // $ANTLR start "rule__OrderByClause__Group_3__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4244:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderingAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4248:1: ( ( ( rule__OrderByClause__OrderingAssignment_3_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4249:1: ( ( rule__OrderByClause__OrderingAssignment_3_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4249:1: ( ( rule__OrderByClause__OrderingAssignment_3_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4250:1: ( rule__OrderByClause__OrderingAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingAssignment_3_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4251:1: ( rule__OrderByClause__OrderingAssignment_3_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4251:2: rule__OrderByClause__OrderingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__OrderByClause__OrderingAssignment_3_1_in_rule__OrderByClause__Group_3__1__Impl8811);
            rule__OrderByClause__OrderingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__1__Impl"


    // $ANTLR start "rule__OrderBySpec__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4265:1: rule__OrderBySpec__Group__0 : rule__OrderBySpec__Group__0__Impl rule__OrderBySpec__Group__1 ;
    public final void rule__OrderBySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4269:1: ( rule__OrderBySpec__Group__0__Impl rule__OrderBySpec__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4270:2: rule__OrderBySpec__Group__0__Impl rule__OrderBySpec__Group__1
            {
            pushFollow(FOLLOW_rule__OrderBySpec__Group__0__Impl_in_rule__OrderBySpec__Group__08845);
            rule__OrderBySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderBySpec__Group__1_in_rule__OrderBySpec__Group__08848);
            rule__OrderBySpec__Group__1();

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
    // $ANTLR end "rule__OrderBySpec__Group__0"


    // $ANTLR start "rule__OrderBySpec__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4277:1: rule__OrderBySpec__Group__0__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__OrderBySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4281:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4282:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4282:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4283:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getOrderBySpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__OrderBySpec__Group__0__Impl8875);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getOrderBySpecAccess().getConditionalOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderBySpec__Group__0__Impl"


    // $ANTLR start "rule__OrderBySpec__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4294:1: rule__OrderBySpec__Group__1 : rule__OrderBySpec__Group__1__Impl ;
    public final void rule__OrderBySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4298:1: ( rule__OrderBySpec__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4299:2: rule__OrderBySpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderBySpec__Group__1__Impl_in_rule__OrderBySpec__Group__18904);
            rule__OrderBySpec__Group__1__Impl();

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
    // $ANTLR end "rule__OrderBySpec__Group__1"


    // $ANTLR start "rule__OrderBySpec__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4305:1: rule__OrderBySpec__Group__1__Impl : ( ( rule__OrderBySpec__DirectionAssignment_1 ) ) ;
    public final void rule__OrderBySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4309:1: ( ( ( rule__OrderBySpec__DirectionAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4310:1: ( ( rule__OrderBySpec__DirectionAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4310:1: ( ( rule__OrderBySpec__DirectionAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4311:1: ( rule__OrderBySpec__DirectionAssignment_1 )
            {
             before(grammarAccess.getOrderBySpecAccess().getDirectionAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4312:1: ( rule__OrderBySpec__DirectionAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4312:2: rule__OrderBySpec__DirectionAssignment_1
            {
            pushFollow(FOLLOW_rule__OrderBySpec__DirectionAssignment_1_in_rule__OrderBySpec__Group__1__Impl8931);
            rule__OrderBySpec__DirectionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderBySpecAccess().getDirectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderBySpec__Group__1__Impl"


    // $ANTLR start "rule__RangeClause__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4326:1: rule__RangeClause__Group__0 : rule__RangeClause__Group__0__Impl rule__RangeClause__Group__1 ;
    public final void rule__RangeClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4330:1: ( rule__RangeClause__Group__0__Impl rule__RangeClause__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4331:2: rule__RangeClause__Group__0__Impl rule__RangeClause__Group__1
            {
            pushFollow(FOLLOW_rule__RangeClause__Group__0__Impl_in_rule__RangeClause__Group__08965);
            rule__RangeClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeClause__Group__1_in_rule__RangeClause__Group__08968);
            rule__RangeClause__Group__1();

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
    // $ANTLR end "rule__RangeClause__Group__0"


    // $ANTLR start "rule__RangeClause__Group__0__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4338:1: rule__RangeClause__Group__0__Impl : ( KEYWORD_39 ) ;
    public final void rule__RangeClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4342:1: ( ( KEYWORD_39 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4343:1: ( KEYWORD_39 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4343:1: ( KEYWORD_39 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4344:1: KEYWORD_39
            {
             before(grammarAccess.getRangeClauseAccess().getRANGEKeyword_0()); 
            match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__RangeClause__Group__0__Impl8996); 
             after(grammarAccess.getRangeClauseAccess().getRANGEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeClause__Group__0__Impl"


    // $ANTLR start "rule__RangeClause__Group__1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4357:1: rule__RangeClause__Group__1 : rule__RangeClause__Group__1__Impl rule__RangeClause__Group__2 ;
    public final void rule__RangeClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4361:1: ( rule__RangeClause__Group__1__Impl rule__RangeClause__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4362:2: rule__RangeClause__Group__1__Impl rule__RangeClause__Group__2
            {
            pushFollow(FOLLOW_rule__RangeClause__Group__1__Impl_in_rule__RangeClause__Group__19027);
            rule__RangeClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeClause__Group__2_in_rule__RangeClause__Group__19030);
            rule__RangeClause__Group__2();

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
    // $ANTLR end "rule__RangeClause__Group__1"


    // $ANTLR start "rule__RangeClause__Group__1__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4369:1: rule__RangeClause__Group__1__Impl : ( ( rule__RangeClause__StartAssignment_1 ) ) ;
    public final void rule__RangeClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4373:1: ( ( ( rule__RangeClause__StartAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4374:1: ( ( rule__RangeClause__StartAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4374:1: ( ( rule__RangeClause__StartAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4375:1: ( rule__RangeClause__StartAssignment_1 )
            {
             before(grammarAccess.getRangeClauseAccess().getStartAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4376:1: ( rule__RangeClause__StartAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4376:2: rule__RangeClause__StartAssignment_1
            {
            pushFollow(FOLLOW_rule__RangeClause__StartAssignment_1_in_rule__RangeClause__Group__1__Impl9057);
            rule__RangeClause__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeClauseAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeClause__Group__1__Impl"


    // $ANTLR start "rule__RangeClause__Group__2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4386:1: rule__RangeClause__Group__2 : rule__RangeClause__Group__2__Impl rule__RangeClause__Group__3 ;
    public final void rule__RangeClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4390:1: ( rule__RangeClause__Group__2__Impl rule__RangeClause__Group__3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4391:2: rule__RangeClause__Group__2__Impl rule__RangeClause__Group__3
            {
            pushFollow(FOLLOW_rule__RangeClause__Group__2__Impl_in_rule__RangeClause__Group__29087);
            rule__RangeClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RangeClause__Group__3_in_rule__RangeClause__Group__29090);
            rule__RangeClause__Group__3();

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
    // $ANTLR end "rule__RangeClause__Group__2"


    // $ANTLR start "rule__RangeClause__Group__2__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4398:1: rule__RangeClause__Group__2__Impl : ( KEYWORD_8 ) ;
    public final void rule__RangeClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4402:1: ( ( KEYWORD_8 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4403:1: ( KEYWORD_8 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4403:1: ( KEYWORD_8 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4404:1: KEYWORD_8
            {
             before(grammarAccess.getRangeClauseAccess().getCommaKeyword_2()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__RangeClause__Group__2__Impl9118); 
             after(grammarAccess.getRangeClauseAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeClause__Group__2__Impl"


    // $ANTLR start "rule__RangeClause__Group__3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4417:1: rule__RangeClause__Group__3 : rule__RangeClause__Group__3__Impl ;
    public final void rule__RangeClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4421:1: ( rule__RangeClause__Group__3__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4422:2: rule__RangeClause__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RangeClause__Group__3__Impl_in_rule__RangeClause__Group__39149);
            rule__RangeClause__Group__3__Impl();

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
    // $ANTLR end "rule__RangeClause__Group__3"


    // $ANTLR start "rule__RangeClause__Group__3__Impl"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4428:1: rule__RangeClause__Group__3__Impl : ( ( rule__RangeClause__EndAssignment_3 ) ) ;
    public final void rule__RangeClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4432:1: ( ( ( rule__RangeClause__EndAssignment_3 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4433:1: ( ( rule__RangeClause__EndAssignment_3 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4433:1: ( ( rule__RangeClause__EndAssignment_3 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4434:1: ( rule__RangeClause__EndAssignment_3 )
            {
             before(grammarAccess.getRangeClauseAccess().getEndAssignment_3()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4435:1: ( rule__RangeClause__EndAssignment_3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4435:2: rule__RangeClause__EndAssignment_3
            {
            pushFollow(FOLLOW_rule__RangeClause__EndAssignment_3_in_rule__RangeClause__Group__3__Impl9176);
            rule__RangeClause__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeClauseAccess().getEndAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeClause__Group__3__Impl"


    // $ANTLR start "rule__ConditionalOrExpression__Group__0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4453:1: rule__ConditionalOrExpression__Group__0 : rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 ;
    public final void rule__ConditionalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4457:1: ( rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4458:2: rule__ConditionalOrExpression__Group__0__Impl rule__ConditionalOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__0__Impl_in_rule__ConditionalOrExpression__Group__09214);
            rule__ConditionalOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__1_in_rule__ConditionalOrExpression__Group__09217);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4465:1: rule__ConditionalOrExpression__Group__0__Impl : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4469:1: ( ( ruleConditionalAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4470:1: ( ruleConditionalAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4470:1: ( ruleConditionalAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4471:1: ruleConditionalAndExpression
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__Group__0__Impl9244);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4482:1: rule__ConditionalOrExpression__Group__1 : rule__ConditionalOrExpression__Group__1__Impl ;
    public final void rule__ConditionalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4486:1: ( rule__ConditionalOrExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4487:2: rule__ConditionalOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group__1__Impl_in_rule__ConditionalOrExpression__Group__19273);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4493:1: rule__ConditionalOrExpression__Group__1__Impl : ( ( rule__ConditionalOrExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4497:1: ( ( ( rule__ConditionalOrExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4498:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4498:1: ( ( rule__ConditionalOrExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4499:1: ( rule__ConditionalOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4500:1: ( rule__ConditionalOrExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_25) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4500:2: rule__ConditionalOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__0_in_rule__ConditionalOrExpression__Group__1__Impl9300);
            	    rule__ConditionalOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4514:1: rule__ConditionalOrExpression__Group_1__0 : rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 ;
    public final void rule__ConditionalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4518:1: ( rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4519:2: rule__ConditionalOrExpression__Group_1__0__Impl rule__ConditionalOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__0__Impl_in_rule__ConditionalOrExpression__Group_1__09335);
            rule__ConditionalOrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__1_in_rule__ConditionalOrExpression__Group_1__09338);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4526:1: rule__ConditionalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4530:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4531:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4531:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4532:1: ()
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4533:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4535:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4545:1: rule__ConditionalOrExpression__Group_1__1 : rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 ;
    public final void rule__ConditionalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4549:1: ( rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4550:2: rule__ConditionalOrExpression__Group_1__1__Impl rule__ConditionalOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__1__Impl_in_rule__ConditionalOrExpression__Group_1__19396);
            rule__ConditionalOrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__2_in_rule__ConditionalOrExpression__Group_1__19399);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4557:1: rule__ConditionalOrExpression__Group_1__1__Impl : ( KEYWORD_25 ) ;
    public final void rule__ConditionalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4561:1: ( ( KEYWORD_25 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4562:1: ( KEYWORD_25 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4562:1: ( KEYWORD_25 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4563:1: KEYWORD_25
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__ConditionalOrExpression__Group_1__1__Impl9427); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4576:1: rule__ConditionalOrExpression__Group_1__2 : rule__ConditionalOrExpression__Group_1__2__Impl ;
    public final void rule__ConditionalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4580:1: ( rule__ConditionalOrExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4581:2: rule__ConditionalOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__Group_1__2__Impl_in_rule__ConditionalOrExpression__Group_1__29458);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4587:1: rule__ConditionalOrExpression__Group_1__2__Impl : ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConditionalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4591:1: ( ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4592:1: ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4592:1: ( ( rule__ConditionalOrExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4593:1: ( rule__ConditionalOrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4594:1: ( rule__ConditionalOrExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4594:2: rule__ConditionalOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConditionalOrExpression__RightAssignment_1_2_in_rule__ConditionalOrExpression__Group_1__2__Impl9485);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4610:1: rule__ConditionalAndExpression__Group__0 : rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 ;
    public final void rule__ConditionalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4614:1: ( rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4615:2: rule__ConditionalAndExpression__Group__0__Impl rule__ConditionalAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__0__Impl_in_rule__ConditionalAndExpression__Group__09521);
            rule__ConditionalAndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__1_in_rule__ConditionalAndExpression__Group__09524);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4622:1: rule__ConditionalAndExpression__Group__0__Impl : ( ruleSimpleOrExpression ) ;
    public final void rule__ConditionalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4626:1: ( ( ruleSimpleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4627:1: ( ruleSimpleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4627:1: ( ruleSimpleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4628:1: ruleSimpleOrExpression
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getSimpleOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__Group__0__Impl9551);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4639:1: rule__ConditionalAndExpression__Group__1 : rule__ConditionalAndExpression__Group__1__Impl ;
    public final void rule__ConditionalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4643:1: ( rule__ConditionalAndExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4644:2: rule__ConditionalAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group__1__Impl_in_rule__ConditionalAndExpression__Group__19580);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4650:1: rule__ConditionalAndExpression__Group__1__Impl : ( ( rule__ConditionalAndExpression__Group_1__0 )* ) ;
    public final void rule__ConditionalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4654:1: ( ( ( rule__ConditionalAndExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4655:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4655:1: ( ( rule__ConditionalAndExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4656:1: ( rule__ConditionalAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4657:1: ( rule__ConditionalAndExpression__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==KEYWORD_19) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4657:2: rule__ConditionalAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__0_in_rule__ConditionalAndExpression__Group__1__Impl9607);
            	    rule__ConditionalAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4671:1: rule__ConditionalAndExpression__Group_1__0 : rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 ;
    public final void rule__ConditionalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4675:1: ( rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4676:2: rule__ConditionalAndExpression__Group_1__0__Impl rule__ConditionalAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__0__Impl_in_rule__ConditionalAndExpression__Group_1__09642);
            rule__ConditionalAndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__1_in_rule__ConditionalAndExpression__Group_1__09645);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4683:1: rule__ConditionalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConditionalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4687:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4688:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4688:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4689:1: ()
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4690:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4692:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4702:1: rule__ConditionalAndExpression__Group_1__1 : rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 ;
    public final void rule__ConditionalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4706:1: ( rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4707:2: rule__ConditionalAndExpression__Group_1__1__Impl rule__ConditionalAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__1__Impl_in_rule__ConditionalAndExpression__Group_1__19703);
            rule__ConditionalAndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__2_in_rule__ConditionalAndExpression__Group_1__19706);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4714:1: rule__ConditionalAndExpression__Group_1__1__Impl : ( KEYWORD_19 ) ;
    public final void rule__ConditionalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4718:1: ( ( KEYWORD_19 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4719:1: ( KEYWORD_19 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4719:1: ( KEYWORD_19 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4720:1: KEYWORD_19
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__ConditionalAndExpression__Group_1__1__Impl9734); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4733:1: rule__ConditionalAndExpression__Group_1__2 : rule__ConditionalAndExpression__Group_1__2__Impl ;
    public final void rule__ConditionalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4737:1: ( rule__ConditionalAndExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4738:2: rule__ConditionalAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__Group_1__2__Impl_in_rule__ConditionalAndExpression__Group_1__29765);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4744:1: rule__ConditionalAndExpression__Group_1__2__Impl : ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ConditionalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4748:1: ( ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4749:1: ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4749:1: ( ( rule__ConditionalAndExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4750:1: ( rule__ConditionalAndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4751:1: ( rule__ConditionalAndExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4751:2: rule__ConditionalAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ConditionalAndExpression__RightAssignment_1_2_in_rule__ConditionalAndExpression__Group_1__2__Impl9792);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4767:1: rule__SimpleOrExpression__Group__0 : rule__SimpleOrExpression__Group__0__Impl rule__SimpleOrExpression__Group__1 ;
    public final void rule__SimpleOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4771:1: ( rule__SimpleOrExpression__Group__0__Impl rule__SimpleOrExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4772:2: rule__SimpleOrExpression__Group__0__Impl rule__SimpleOrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__0__Impl_in_rule__SimpleOrExpression__Group__09828);
            rule__SimpleOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__1_in_rule__SimpleOrExpression__Group__09831);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4779:1: rule__SimpleOrExpression__Group__0__Impl : ( ruleSimpleAndExpression ) ;
    public final void rule__SimpleOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4783:1: ( ( ruleSimpleAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4784:1: ( ruleSimpleAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4784:1: ( ruleSimpleAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4785:1: ruleSimpleAndExpression
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getSimpleAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__Group__0__Impl9858);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4796:1: rule__SimpleOrExpression__Group__1 : rule__SimpleOrExpression__Group__1__Impl ;
    public final void rule__SimpleOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4800:1: ( rule__SimpleOrExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4801:2: rule__SimpleOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group__1__Impl_in_rule__SimpleOrExpression__Group__19887);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4807:1: rule__SimpleOrExpression__Group__1__Impl : ( ( rule__SimpleOrExpression__Group_1__0 )* ) ;
    public final void rule__SimpleOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4811:1: ( ( ( rule__SimpleOrExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4812:1: ( ( rule__SimpleOrExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4812:1: ( ( rule__SimpleOrExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4813:1: ( rule__SimpleOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4814:1: ( rule__SimpleOrExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==KEYWORD_16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4814:2: rule__SimpleOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__0_in_rule__SimpleOrExpression__Group__1__Impl9914);
            	    rule__SimpleOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4828:1: rule__SimpleOrExpression__Group_1__0 : rule__SimpleOrExpression__Group_1__0__Impl rule__SimpleOrExpression__Group_1__1 ;
    public final void rule__SimpleOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4832:1: ( rule__SimpleOrExpression__Group_1__0__Impl rule__SimpleOrExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4833:2: rule__SimpleOrExpression__Group_1__0__Impl rule__SimpleOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__0__Impl_in_rule__SimpleOrExpression__Group_1__09949);
            rule__SimpleOrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__1_in_rule__SimpleOrExpression__Group_1__09952);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4840:1: rule__SimpleOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SimpleOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4844:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4845:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4845:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4846:1: ()
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4847:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4849:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4859:1: rule__SimpleOrExpression__Group_1__1 : rule__SimpleOrExpression__Group_1__1__Impl rule__SimpleOrExpression__Group_1__2 ;
    public final void rule__SimpleOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4863:1: ( rule__SimpleOrExpression__Group_1__1__Impl rule__SimpleOrExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4864:2: rule__SimpleOrExpression__Group_1__1__Impl rule__SimpleOrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__1__Impl_in_rule__SimpleOrExpression__Group_1__110010);
            rule__SimpleOrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__2_in_rule__SimpleOrExpression__Group_1__110013);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4871:1: rule__SimpleOrExpression__Group_1__1__Impl : ( KEYWORD_16 ) ;
    public final void rule__SimpleOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4875:1: ( ( KEYWORD_16 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4876:1: ( KEYWORD_16 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4876:1: ( KEYWORD_16 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4877:1: KEYWORD_16
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getVerticalLineKeyword_1_1()); 
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__SimpleOrExpression__Group_1__1__Impl10041); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4890:1: rule__SimpleOrExpression__Group_1__2 : rule__SimpleOrExpression__Group_1__2__Impl ;
    public final void rule__SimpleOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4894:1: ( rule__SimpleOrExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4895:2: rule__SimpleOrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__Group_1__2__Impl_in_rule__SimpleOrExpression__Group_1__210072);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4901:1: rule__SimpleOrExpression__Group_1__2__Impl : ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SimpleOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4905:1: ( ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4906:1: ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4906:1: ( ( rule__SimpleOrExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4907:1: ( rule__SimpleOrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4908:1: ( rule__SimpleOrExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4908:2: rule__SimpleOrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SimpleOrExpression__RightAssignment_1_2_in_rule__SimpleOrExpression__Group_1__2__Impl10099);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4924:1: rule__SimpleAndExpression__Group__0 : rule__SimpleAndExpression__Group__0__Impl rule__SimpleAndExpression__Group__1 ;
    public final void rule__SimpleAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4928:1: ( rule__SimpleAndExpression__Group__0__Impl rule__SimpleAndExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4929:2: rule__SimpleAndExpression__Group__0__Impl rule__SimpleAndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__0__Impl_in_rule__SimpleAndExpression__Group__010135);
            rule__SimpleAndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__1_in_rule__SimpleAndExpression__Group__010138);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4936:1: rule__SimpleAndExpression__Group__0__Impl : ( ruleComparisonOperatorExpression ) ;
    public final void rule__SimpleAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4940:1: ( ( ruleComparisonOperatorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4941:1: ( ruleComparisonOperatorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4941:1: ( ruleComparisonOperatorExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4942:1: ruleComparisonOperatorExpression
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__Group__0__Impl10165);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4953:1: rule__SimpleAndExpression__Group__1 : rule__SimpleAndExpression__Group__1__Impl ;
    public final void rule__SimpleAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4957:1: ( rule__SimpleAndExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4958:2: rule__SimpleAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group__1__Impl_in_rule__SimpleAndExpression__Group__110194);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4964:1: rule__SimpleAndExpression__Group__1__Impl : ( ( rule__SimpleAndExpression__Group_1__0 )* ) ;
    public final void rule__SimpleAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4968:1: ( ( ( rule__SimpleAndExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4969:1: ( ( rule__SimpleAndExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4969:1: ( ( rule__SimpleAndExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4970:1: ( rule__SimpleAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4971:1: ( rule__SimpleAndExpression__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==KEYWORD_3) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4971:2: rule__SimpleAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__0_in_rule__SimpleAndExpression__Group__1__Impl10221);
            	    rule__SimpleAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4985:1: rule__SimpleAndExpression__Group_1__0 : rule__SimpleAndExpression__Group_1__0__Impl rule__SimpleAndExpression__Group_1__1 ;
    public final void rule__SimpleAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4989:1: ( rule__SimpleAndExpression__Group_1__0__Impl rule__SimpleAndExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4990:2: rule__SimpleAndExpression__Group_1__0__Impl rule__SimpleAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__0__Impl_in_rule__SimpleAndExpression__Group_1__010256);
            rule__SimpleAndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__1_in_rule__SimpleAndExpression__Group_1__010259);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:4997:1: rule__SimpleAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SimpleAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5001:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5002:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5002:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5003:1: ()
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5004:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5006:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5016:1: rule__SimpleAndExpression__Group_1__1 : rule__SimpleAndExpression__Group_1__1__Impl rule__SimpleAndExpression__Group_1__2 ;
    public final void rule__SimpleAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5020:1: ( rule__SimpleAndExpression__Group_1__1__Impl rule__SimpleAndExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5021:2: rule__SimpleAndExpression__Group_1__1__Impl rule__SimpleAndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__1__Impl_in_rule__SimpleAndExpression__Group_1__110317);
            rule__SimpleAndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__2_in_rule__SimpleAndExpression__Group_1__110320);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5028:1: rule__SimpleAndExpression__Group_1__1__Impl : ( KEYWORD_3 ) ;
    public final void rule__SimpleAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5032:1: ( ( KEYWORD_3 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5033:1: ( KEYWORD_3 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5033:1: ( KEYWORD_3 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5034:1: KEYWORD_3
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getAmpersandKeyword_1_1()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SimpleAndExpression__Group_1__1__Impl10348); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5047:1: rule__SimpleAndExpression__Group_1__2 : rule__SimpleAndExpression__Group_1__2__Impl ;
    public final void rule__SimpleAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5051:1: ( rule__SimpleAndExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5052:2: rule__SimpleAndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__Group_1__2__Impl_in_rule__SimpleAndExpression__Group_1__210379);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5058:1: rule__SimpleAndExpression__Group_1__2__Impl : ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__SimpleAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5062:1: ( ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5063:1: ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5063:1: ( ( rule__SimpleAndExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5064:1: ( rule__SimpleAndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5065:1: ( rule__SimpleAndExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5065:2: rule__SimpleAndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SimpleAndExpression__RightAssignment_1_2_in_rule__SimpleAndExpression__Group_1__2__Impl10406);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5081:1: rule__ComparisonOperatorExpression__Group__0 : rule__ComparisonOperatorExpression__Group__0__Impl rule__ComparisonOperatorExpression__Group__1 ;
    public final void rule__ComparisonOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5085:1: ( rule__ComparisonOperatorExpression__Group__0__Impl rule__ComparisonOperatorExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5086:2: rule__ComparisonOperatorExpression__Group__0__Impl rule__ComparisonOperatorExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__0__Impl_in_rule__ComparisonOperatorExpression__Group__010442);
            rule__ComparisonOperatorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__1_in_rule__ComparisonOperatorExpression__Group__010445);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5093:1: rule__ComparisonOperatorExpression__Group__0__Impl : ( ruleAdditionExpression ) ;
    public final void rule__ComparisonOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5097:1: ( ( ruleAdditionExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5098:1: ( ruleAdditionExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5098:1: ( ruleAdditionExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5099:1: ruleAdditionExpression
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__Group__0__Impl10472);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5110:1: rule__ComparisonOperatorExpression__Group__1 : rule__ComparisonOperatorExpression__Group__1__Impl ;
    public final void rule__ComparisonOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5114:1: ( rule__ComparisonOperatorExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5115:2: rule__ComparisonOperatorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group__1__Impl_in_rule__ComparisonOperatorExpression__Group__110501);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5121:1: rule__ComparisonOperatorExpression__Group__1__Impl : ( ( rule__ComparisonOperatorExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5125:1: ( ( ( rule__ComparisonOperatorExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5126:1: ( ( rule__ComparisonOperatorExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5126:1: ( ( rule__ComparisonOperatorExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5127:1: ( rule__ComparisonOperatorExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5128:1: ( rule__ComparisonOperatorExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==KEYWORD_57||LA44_0==KEYWORD_18||(LA44_0>=KEYWORD_20 && LA44_0<=KEYWORD_22)||(LA44_0>=KEYWORD_14 && LA44_0<=KEYWORD_15)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5128:2: rule__ComparisonOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__0_in_rule__ComparisonOperatorExpression__Group__1__Impl10528);
            	    rule__ComparisonOperatorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5142:1: rule__ComparisonOperatorExpression__Group_1__0 : rule__ComparisonOperatorExpression__Group_1__0__Impl rule__ComparisonOperatorExpression__Group_1__1 ;
    public final void rule__ComparisonOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5146:1: ( rule__ComparisonOperatorExpression__Group_1__0__Impl rule__ComparisonOperatorExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5147:2: rule__ComparisonOperatorExpression__Group_1__0__Impl rule__ComparisonOperatorExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__0__Impl_in_rule__ComparisonOperatorExpression__Group_1__010563);
            rule__ComparisonOperatorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__1_in_rule__ComparisonOperatorExpression__Group_1__010566);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5154:1: rule__ComparisonOperatorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5158:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5159:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5159:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5160:1: ()
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5161:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5163:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5173:1: rule__ComparisonOperatorExpression__Group_1__1 : rule__ComparisonOperatorExpression__Group_1__1__Impl rule__ComparisonOperatorExpression__Group_1__2 ;
    public final void rule__ComparisonOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5177:1: ( rule__ComparisonOperatorExpression__Group_1__1__Impl rule__ComparisonOperatorExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5178:2: rule__ComparisonOperatorExpression__Group_1__1__Impl rule__ComparisonOperatorExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__1__Impl_in_rule__ComparisonOperatorExpression__Group_1__110624);
            rule__ComparisonOperatorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__2_in_rule__ComparisonOperatorExpression__Group_1__110627);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5185:1: rule__ComparisonOperatorExpression__Group_1__1__Impl : ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5189:1: ( ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5190:1: ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5190:1: ( ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5191:1: ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5192:1: ( rule__ComparisonOperatorExpression__OperatorAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5192:2: rule__ComparisonOperatorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__OperatorAssignment_1_1_in_rule__ComparisonOperatorExpression__Group_1__1__Impl10654);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5202:1: rule__ComparisonOperatorExpression__Group_1__2 : rule__ComparisonOperatorExpression__Group_1__2__Impl ;
    public final void rule__ComparisonOperatorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5206:1: ( rule__ComparisonOperatorExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5207:2: rule__ComparisonOperatorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__Group_1__2__Impl_in_rule__ComparisonOperatorExpression__Group_1__210684);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5213:1: rule__ComparisonOperatorExpression__Group_1__2__Impl : ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonOperatorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5217:1: ( ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5218:1: ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5218:1: ( ( rule__ComparisonOperatorExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5219:1: ( rule__ComparisonOperatorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5220:1: ( rule__ComparisonOperatorExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5220:2: rule__ComparisonOperatorExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ComparisonOperatorExpression__RightAssignment_1_2_in_rule__ComparisonOperatorExpression__Group_1__2__Impl10711);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5236:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5240:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5241:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__010747);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__010750);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5248:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5252:1: ( ( ruleMultiplicationExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5253:1: ( ruleMultiplicationExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5253:1: ( ruleMultiplicationExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5254:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl10777);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5265:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5269:1: ( rule__AdditionExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5270:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__110806);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5276:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5280:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5281:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5281:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5282:1: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5283:1: ( rule__AdditionExpression__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==KEYWORD_7||LA45_0==KEYWORD_9) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5283:2: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl10833);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5297:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5301:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5302:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__010868);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__010871);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5309:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5313:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5314:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5314:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5315:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5316:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5318:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5328:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5332:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5333:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__110929);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__110932);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5340:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5344:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5345:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5345:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5346:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5347:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5347:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl10959);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5357:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5361:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5362:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__210989);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5368:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5372:1: ( ( ( rule__AdditionExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5373:1: ( ( rule__AdditionExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5373:1: ( ( rule__AdditionExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5374:1: ( rule__AdditionExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5375:1: ( rule__AdditionExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5375:2: rule__AdditionExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AdditionExpression__RightAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl11016);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5391:1: rule__MultiplicationExpression__Group__0 : rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 ;
    public final void rule__MultiplicationExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5395:1: ( rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5396:2: rule__MultiplicationExpression__Group__0__Impl rule__MultiplicationExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__011052);
            rule__MultiplicationExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__011055);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5403:1: rule__MultiplicationExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicationExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5407:1: ( ( ruleUnaryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5408:1: ( ruleUnaryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5408:1: ( ruleUnaryExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5409:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__Group__0__Impl11082);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5420:1: rule__MultiplicationExpression__Group__1 : rule__MultiplicationExpression__Group__1__Impl ;
    public final void rule__MultiplicationExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5424:1: ( rule__MultiplicationExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5425:2: rule__MultiplicationExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__111111);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5431:1: rule__MultiplicationExpression__Group__1__Impl : ( ( rule__MultiplicationExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5435:1: ( ( ( rule__MultiplicationExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5436:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5436:1: ( ( rule__MultiplicationExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5437:1: ( rule__MultiplicationExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5438:1: ( rule__MultiplicationExpression__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==KEYWORD_2||LA46_0==KEYWORD_6||LA46_0==KEYWORD_11) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5438:2: rule__MultiplicationExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl11138);
            	    rule__MultiplicationExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5452:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5456:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5457:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__011173);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__011176);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5464:1: rule__MultiplicationExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5468:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5469:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5469:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5470:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5471:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5473:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5483:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5487:1: ( rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5488:2: rule__MultiplicationExpression__Group_1__1__Impl rule__MultiplicationExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__111234);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__111237);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5495:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5499:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5500:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5500:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5501:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5502:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5502:2: rule__MultiplicationExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl11264);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5512:1: rule__MultiplicationExpression__Group_1__2 : rule__MultiplicationExpression__Group_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5516:1: ( rule__MultiplicationExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5517:2: rule__MultiplicationExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__211294);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5523:1: rule__MultiplicationExpression__Group_1__2__Impl : ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5527:1: ( ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5528:1: ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5528:1: ( ( rule__MultiplicationExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5529:1: ( rule__MultiplicationExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5530:1: ( rule__MultiplicationExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5530:2: rule__MultiplicationExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MultiplicationExpression__RightAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl11321);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5546:1: rule__UnaryExpression__Group__0 : rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 ;
    public final void rule__UnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5550:1: ( rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5551:2: rule__UnaryExpression__Group__0__Impl rule__UnaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group__0__Impl_in_rule__UnaryExpression__Group__011357);
            rule__UnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpression__Group__1_in_rule__UnaryExpression__Group__011360);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5558:1: rule__UnaryExpression__Group__0__Impl : ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? ) ;
    public final void rule__UnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5562:1: ( ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5563:1: ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5563:1: ( ( rule__UnaryExpression__UnaryOperatorAssignment_0 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5564:1: ( rule__UnaryExpression__UnaryOperatorAssignment_0 )?
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorAssignment_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5565:1: ( rule__UnaryExpression__UnaryOperatorAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_1||LA47_0==KEYWORD_7||LA47_0==KEYWORD_9||LA47_0==KEYWORD_17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5565:2: rule__UnaryExpression__UnaryOperatorAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__UnaryOperatorAssignment_0_in_rule__UnaryExpression__Group__0__Impl11387);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5575:1: rule__UnaryExpression__Group__1 : rule__UnaryExpression__Group__1__Impl ;
    public final void rule__UnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5579:1: ( rule__UnaryExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5580:2: rule__UnaryExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group__1__Impl_in_rule__UnaryExpression__Group__111418);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5586:1: rule__UnaryExpression__Group__1__Impl : ( ( rule__UnaryExpression__RightAssignment_1 ) ) ;
    public final void rule__UnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5590:1: ( ( ( rule__UnaryExpression__RightAssignment_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5591:1: ( ( rule__UnaryExpression__RightAssignment_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5591:1: ( ( rule__UnaryExpression__RightAssignment_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5592:1: ( rule__UnaryExpression__RightAssignment_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getRightAssignment_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5593:1: ( rule__UnaryExpression__RightAssignment_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5593:2: rule__UnaryExpression__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__RightAssignment_1_in_rule__UnaryExpression__Group__1__Impl11445);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5607:1: rule__FieldAccessExpression__Group__0 : rule__FieldAccessExpression__Group__0__Impl rule__FieldAccessExpression__Group__1 ;
    public final void rule__FieldAccessExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5611:1: ( rule__FieldAccessExpression__Group__0__Impl rule__FieldAccessExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5612:2: rule__FieldAccessExpression__Group__0__Impl rule__FieldAccessExpression__Group__1
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__0__Impl_in_rule__FieldAccessExpression__Group__011479);
            rule__FieldAccessExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__1_in_rule__FieldAccessExpression__Group__011482);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5619:1: rule__FieldAccessExpression__Group__0__Impl : ( ruleParameterOrFieldOrMethodExpression ) ;
    public final void rule__FieldAccessExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5623:1: ( ( ruleParameterOrFieldOrMethodExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5624:1: ( ruleParameterOrFieldOrMethodExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5624:1: ( ruleParameterOrFieldOrMethodExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5625:1: ruleParameterOrFieldOrMethodExpression
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_rule__FieldAccessExpression__Group__0__Impl11509);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5636:1: rule__FieldAccessExpression__Group__1 : rule__FieldAccessExpression__Group__1__Impl ;
    public final void rule__FieldAccessExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5640:1: ( rule__FieldAccessExpression__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5641:2: rule__FieldAccessExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group__1__Impl_in_rule__FieldAccessExpression__Group__111538);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5647:1: rule__FieldAccessExpression__Group__1__Impl : ( ( rule__FieldAccessExpression__Group_1__0 )* ) ;
    public final void rule__FieldAccessExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5651:1: ( ( ( rule__FieldAccessExpression__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5652:1: ( ( rule__FieldAccessExpression__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5652:1: ( ( rule__FieldAccessExpression__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5653:1: ( rule__FieldAccessExpression__Group_1__0 )*
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5654:1: ( rule__FieldAccessExpression__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==KEYWORD_10) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5654:2: rule__FieldAccessExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__0_in_rule__FieldAccessExpression__Group__1__Impl11565);
            	    rule__FieldAccessExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5668:1: rule__FieldAccessExpression__Group_1__0 : rule__FieldAccessExpression__Group_1__0__Impl rule__FieldAccessExpression__Group_1__1 ;
    public final void rule__FieldAccessExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5672:1: ( rule__FieldAccessExpression__Group_1__0__Impl rule__FieldAccessExpression__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5673:2: rule__FieldAccessExpression__Group_1__0__Impl rule__FieldAccessExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__0__Impl_in_rule__FieldAccessExpression__Group_1__011600);
            rule__FieldAccessExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__1_in_rule__FieldAccessExpression__Group_1__011603);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5680:1: rule__FieldAccessExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__FieldAccessExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5684:1: ( ( () ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5685:1: ( () )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5685:1: ( () )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5686:1: ()
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5687:1: ()
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5689:1: 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5699:1: rule__FieldAccessExpression__Group_1__1 : rule__FieldAccessExpression__Group_1__1__Impl rule__FieldAccessExpression__Group_1__2 ;
    public final void rule__FieldAccessExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5703:1: ( rule__FieldAccessExpression__Group_1__1__Impl rule__FieldAccessExpression__Group_1__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5704:2: rule__FieldAccessExpression__Group_1__1__Impl rule__FieldAccessExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__1__Impl_in_rule__FieldAccessExpression__Group_1__111661);
            rule__FieldAccessExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__2_in_rule__FieldAccessExpression__Group_1__111664);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5711:1: rule__FieldAccessExpression__Group_1__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__FieldAccessExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5715:1: ( ( KEYWORD_10 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5716:1: ( KEYWORD_10 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5716:1: ( KEYWORD_10 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5717:1: KEYWORD_10
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__FieldAccessExpression__Group_1__1__Impl11692); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5730:1: rule__FieldAccessExpression__Group_1__2 : rule__FieldAccessExpression__Group_1__2__Impl ;
    public final void rule__FieldAccessExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5734:1: ( rule__FieldAccessExpression__Group_1__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5735:2: rule__FieldAccessExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__Group_1__2__Impl_in_rule__FieldAccessExpression__Group_1__211723);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5741:1: rule__FieldAccessExpression__Group_1__2__Impl : ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) ) ;
    public final void rule__FieldAccessExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5745:1: ( ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5746:1: ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5746:1: ( ( rule__FieldAccessExpression__RightAssignment_1_2 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5747:1: ( rule__FieldAccessExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getRightAssignment_1_2()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5748:1: ( rule__FieldAccessExpression__RightAssignment_1_2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5748:2: rule__FieldAccessExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__FieldAccessExpression__RightAssignment_1_2_in_rule__FieldAccessExpression__Group_1__2__Impl11750);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5764:1: rule__ParameterOrFieldOrMethodExpression__Group_3__0 : rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl rule__ParameterOrFieldOrMethodExpression__Group_3__1 ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5768:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl rule__ParameterOrFieldOrMethodExpression__Group_3__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5769:2: rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl rule__ParameterOrFieldOrMethodExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__011786);
            rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__011789);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5776:1: rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl : ( KEYWORD_12 ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5780:1: ( ( KEYWORD_12 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5781:1: ( KEYWORD_12 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5781:1: ( KEYWORD_12 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5782:1: KEYWORD_12
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0()); 
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl11817); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5795:1: rule__ParameterOrFieldOrMethodExpression__Group_3__1 : rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5799:1: ( rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5800:2: rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__111848);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5806:1: rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl : ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5810:1: ( ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5811:1: ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5811:1: ( ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5812:1: ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 )
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameAssignment_3_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5813:1: ( rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5813:2: rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl11875);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5827:1: rule__ParenthesesExpression__Group__0 : rule__ParenthesesExpression__Group__0__Impl rule__ParenthesesExpression__Group__1 ;
    public final void rule__ParenthesesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5831:1: ( rule__ParenthesesExpression__Group__0__Impl rule__ParenthesesExpression__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5832:2: rule__ParenthesesExpression__Group__0__Impl rule__ParenthesesExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__0__Impl_in_rule__ParenthesesExpression__Group__011909);
            rule__ParenthesesExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__1_in_rule__ParenthesesExpression__Group__011912);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5839:1: rule__ParenthesesExpression__Group__0__Impl : ( KEYWORD_4 ) ;
    public final void rule__ParenthesesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5843:1: ( ( KEYWORD_4 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5844:1: ( KEYWORD_4 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5844:1: ( KEYWORD_4 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5845:1: KEYWORD_4
            {
             before(grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__ParenthesesExpression__Group__0__Impl11940); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5858:1: rule__ParenthesesExpression__Group__1 : rule__ParenthesesExpression__Group__1__Impl rule__ParenthesesExpression__Group__2 ;
    public final void rule__ParenthesesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5862:1: ( rule__ParenthesesExpression__Group__1__Impl rule__ParenthesesExpression__Group__2 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5863:2: rule__ParenthesesExpression__Group__1__Impl rule__ParenthesesExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__1__Impl_in_rule__ParenthesesExpression__Group__111971);
            rule__ParenthesesExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__2_in_rule__ParenthesesExpression__Group__111974);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5870:1: rule__ParenthesesExpression__Group__1__Impl : ( ruleConditionalOrExpression ) ;
    public final void rule__ParenthesesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5874:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5875:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5875:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5876:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__ParenthesesExpression__Group__1__Impl12001);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5887:1: rule__ParenthesesExpression__Group__2 : rule__ParenthesesExpression__Group__2__Impl ;
    public final void rule__ParenthesesExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5891:1: ( rule__ParenthesesExpression__Group__2__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5892:2: rule__ParenthesesExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesesExpression__Group__2__Impl_in_rule__ParenthesesExpression__Group__212030);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5898:1: rule__ParenthesesExpression__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__ParenthesesExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5902:1: ( ( KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5903:1: ( KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5903:1: ( KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5904:1: KEYWORD_5
            {
             before(grammarAccess.getParenthesesExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__ParenthesesExpression__Group__2__Impl12058); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5924:1: rule__QualifiedIdentifier__Group__0 : rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1 ;
    public final void rule__QualifiedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5928:1: ( rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5929:2: rule__QualifiedIdentifier__Group__0__Impl rule__QualifiedIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__0__Impl_in_rule__QualifiedIdentifier__Group__012096);
            rule__QualifiedIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__1_in_rule__QualifiedIdentifier__Group__012099);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5936:1: rule__QualifiedIdentifier__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5940:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5941:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5941:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5942:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group__0__Impl12126); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5953:1: rule__QualifiedIdentifier__Group__1 : rule__QualifiedIdentifier__Group__1__Impl ;
    public final void rule__QualifiedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5957:1: ( rule__QualifiedIdentifier__Group__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5958:2: rule__QualifiedIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group__1__Impl_in_rule__QualifiedIdentifier__Group__112155);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5964:1: rule__QualifiedIdentifier__Group__1__Impl : ( ( rule__QualifiedIdentifier__Group_1__0 )* ) ;
    public final void rule__QualifiedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5968:1: ( ( ( rule__QualifiedIdentifier__Group_1__0 )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5969:1: ( ( rule__QualifiedIdentifier__Group_1__0 )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5969:1: ( ( rule__QualifiedIdentifier__Group_1__0 )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5970:1: ( rule__QualifiedIdentifier__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getGroup_1()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5971:1: ( rule__QualifiedIdentifier__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==KEYWORD_10) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5971:2: rule__QualifiedIdentifier__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__0_in_rule__QualifiedIdentifier__Group__1__Impl12182);
            	    rule__QualifiedIdentifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5985:1: rule__QualifiedIdentifier__Group_1__0 : rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1 ;
    public final void rule__QualifiedIdentifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5989:1: ( rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5990:2: rule__QualifiedIdentifier__Group_1__0__Impl rule__QualifiedIdentifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__0__Impl_in_rule__QualifiedIdentifier__Group_1__012217);
            rule__QualifiedIdentifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__1_in_rule__QualifiedIdentifier__Group_1__012220);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:5997:1: rule__QualifiedIdentifier__Group_1__0__Impl : ( KEYWORD_10 ) ;
    public final void rule__QualifiedIdentifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6001:1: ( ( KEYWORD_10 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6002:1: ( KEYWORD_10 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6002:1: ( KEYWORD_10 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6003:1: KEYWORD_10
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__QualifiedIdentifier__Group_1__0__Impl12248); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6016:1: rule__QualifiedIdentifier__Group_1__1 : rule__QualifiedIdentifier__Group_1__1__Impl ;
    public final void rule__QualifiedIdentifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6020:1: ( rule__QualifiedIdentifier__Group_1__1__Impl )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6021:2: rule__QualifiedIdentifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedIdentifier__Group_1__1__Impl_in_rule__QualifiedIdentifier__Group_1__112279);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6027:1: rule__QualifiedIdentifier__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedIdentifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6031:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6032:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6032:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6033:1: RULE_ID
            {
             before(grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group_1__1__Impl12306); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6049:1: rule__SingleStringJDOQL__SelectClauseAssignment_0 : ( ruleSelectClause ) ;
    public final void rule__SingleStringJDOQL__SelectClauseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6053:1: ( ( ruleSelectClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6054:1: ( ruleSelectClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6054:1: ( ruleSelectClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6055:1: ruleSelectClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSelectClause_in_rule__SingleStringJDOQL__SelectClauseAssignment_012344);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6064:1: rule__SingleStringJDOQL__FromClauseAssignment_1 : ( ruleFromClause ) ;
    public final void rule__SingleStringJDOQL__FromClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6068:1: ( ( ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6069:1: ( ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6069:1: ( ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6070:1: ruleFromClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFromClause_in_rule__SingleStringJDOQL__FromClauseAssignment_112375);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6079:1: rule__SingleStringJDOQL__WhereClauseAssignment_2 : ( ruleWhereClause ) ;
    public final void rule__SingleStringJDOQL__WhereClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6083:1: ( ( ruleWhereClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6084:1: ( ruleWhereClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6084:1: ( ruleWhereClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6085:1: ruleWhereClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWhereClause_in_rule__SingleStringJDOQL__WhereClauseAssignment_212406);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6094:1: rule__SingleStringJDOQL__VariablesClauseAssignment_3 : ( ruleVariablesClause ) ;
    public final void rule__SingleStringJDOQL__VariablesClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6098:1: ( ( ruleVariablesClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6099:1: ( ruleVariablesClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6099:1: ( ruleVariablesClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6100:1: ruleVariablesClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseVariablesClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVariablesClause_in_rule__SingleStringJDOQL__VariablesClauseAssignment_312437);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6109:1: rule__SingleStringJDOQL__ParametersClauseAssignment_4 : ( ruleParametersClause ) ;
    public final void rule__SingleStringJDOQL__ParametersClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6113:1: ( ( ruleParametersClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6114:1: ( ruleParametersClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6114:1: ( ruleParametersClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6115:1: ruleParametersClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseParametersClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParametersClause_in_rule__SingleStringJDOQL__ParametersClauseAssignment_412468);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6124:1: rule__SingleStringJDOQL__ImportClauseAssignment_5 : ( ruleImportClause ) ;
    public final void rule__SingleStringJDOQL__ImportClauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6128:1: ( ( ruleImportClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6129:1: ( ruleImportClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6129:1: ( ruleImportClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6130:1: ruleImportClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getImportClauseImportClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleImportClause_in_rule__SingleStringJDOQL__ImportClauseAssignment_512499);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6139:1: rule__SingleStringJDOQL__GroupByClauseAssignment_6 : ( ruleGroupByClause ) ;
    public final void rule__SingleStringJDOQL__GroupByClauseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6143:1: ( ( ruleGroupByClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6144:1: ( ruleGroupByClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6144:1: ( ruleGroupByClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6145:1: ruleGroupByClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseGroupByClauseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleGroupByClause_in_rule__SingleStringJDOQL__GroupByClauseAssignment_612530);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6154:1: rule__SingleStringJDOQL__OrderByClauseAssignment_7 : ( ruleOrderByClause ) ;
    public final void rule__SingleStringJDOQL__OrderByClauseAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6158:1: ( ( ruleOrderByClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6159:1: ( ruleOrderByClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6159:1: ( ruleOrderByClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6160:1: ruleOrderByClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseOrderByClauseParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleOrderByClause_in_rule__SingleStringJDOQL__OrderByClauseAssignment_712561);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6169:1: rule__SingleStringJDOQL__RangeClauseAssignment_8 : ( ruleRangeClause ) ;
    public final void rule__SingleStringJDOQL__RangeClauseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6173:1: ( ( ruleRangeClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6174:1: ( ruleRangeClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6174:1: ( ruleRangeClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6175:1: ruleRangeClause
            {
             before(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseRangeClauseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleRangeClause_in_rule__SingleStringJDOQL__RangeClauseAssignment_812592);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6184:1: rule__SelectClause__IsUniqueAssignment_2 : ( ( KEYWORD_46 ) ) ;
    public final void rule__SelectClause__IsUniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6188:1: ( ( ( KEYWORD_46 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6189:1: ( ( KEYWORD_46 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6189:1: ( ( KEYWORD_46 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6190:1: ( KEYWORD_46 )
            {
             before(grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6191:1: ( KEYWORD_46 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6192:1: KEYWORD_46
            {
             before(grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0()); 
            match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__SelectClause__IsUniqueAssignment_212628); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6207:1: rule__SelectClause__ResultClauseAssignment_3 : ( ruleResultClause ) ;
    public final void rule__SelectClause__ResultClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6211:1: ( ( ruleResultClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6212:1: ( ruleResultClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6212:1: ( ruleResultClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6213:1: ruleResultClause
            {
             before(grammarAccess.getSelectClauseAccess().getResultClauseResultClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleResultClause_in_rule__SelectClause__ResultClauseAssignment_312667);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6222:1: rule__SelectClause__IntoClauseAssignment_4 : ( ruleIntoClause ) ;
    public final void rule__SelectClause__IntoClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6226:1: ( ( ruleIntoClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6227:1: ( ruleIntoClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6227:1: ( ruleIntoClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6228:1: ruleIntoClause
            {
             before(grammarAccess.getSelectClauseAccess().getIntoClauseIntoClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntoClause_in_rule__SelectClause__IntoClauseAssignment_412698);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6237:1: rule__ResultClause__IsDistinctAssignment_0 : ( ( KEYWORD_51 ) ) ;
    public final void rule__ResultClause__IsDistinctAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6241:1: ( ( ( KEYWORD_51 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6242:1: ( ( KEYWORD_51 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6242:1: ( ( KEYWORD_51 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6243:1: ( KEYWORD_51 )
            {
             before(grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6244:1: ( KEYWORD_51 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6245:1: KEYWORD_51
            {
             before(grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0()); 
            match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__ResultClause__IsDistinctAssignment_012734); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6260:1: rule__ResultClause__ResultSpecsAssignment_1 : ( ruleResultSpec ) ;
    public final void rule__ResultClause__ResultSpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6264:1: ( ( ruleResultSpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6265:1: ( ruleResultSpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6265:1: ( ruleResultSpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6266:1: ruleResultSpec
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_112773);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6275:1: rule__ResultClause__ResultSpecsAssignment_2_1 : ( ruleResultSpec ) ;
    public final void rule__ResultClause__ResultSpecsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6279:1: ( ( ruleResultSpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6280:1: ( ruleResultSpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6280:1: ( ruleResultSpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6281:1: ruleResultSpec
            {
             before(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_2_112804);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6290:1: rule__IntoClause__ResultClassNameAssignment_1 : ( ruleClassOrInterfaceName ) ;
    public final void rule__IntoClause__ResultClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6294:1: ( ( ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6295:1: ( ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6295:1: ( ruleClassOrInterfaceName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6296:1: ruleClassOrInterfaceName
            {
             before(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_rule__IntoClause__ResultClassNameAssignment_112835);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6305:1: rule__ResultSpec__ResultNamingAssignment_1 : ( ruleResultNaming ) ;
    public final void rule__ResultSpec__ResultNamingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6309:1: ( ( ruleResultNaming ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6310:1: ( ruleResultNaming )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6310:1: ( ruleResultNaming )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6311:1: ruleResultNaming
            {
             before(grammarAccess.getResultSpecAccess().getResultNamingResultNamingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResultNaming_in_rule__ResultSpec__ResultNamingAssignment_112866);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6320:1: rule__ResultNaming__IdentifierAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResultNaming__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6324:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6325:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6325:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6326:1: RULE_ID
            {
             before(grammarAccess.getResultNamingAccess().getIdentifierIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResultNaming__IdentifierAssignment_112897); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6335:1: rule__FromClause__CandidateClassNameAssignment_1 : ( ruleCandidateClassName ) ;
    public final void rule__FromClause__CandidateClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6339:1: ( ( ruleCandidateClassName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6340:1: ( ruleCandidateClassName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6340:1: ( ruleCandidateClassName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6341:1: ruleCandidateClassName
            {
             before(grammarAccess.getFromClauseAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCandidateClassName_in_rule__FromClause__CandidateClassNameAssignment_112928);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6350:1: rule__FromClause__IsExcludeSubclassesAssignment_2_0 : ( ( KEYWORD_49 ) ) ;
    public final void rule__FromClause__IsExcludeSubclassesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6354:1: ( ( ( KEYWORD_49 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6355:1: ( ( KEYWORD_49 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6355:1: ( ( KEYWORD_49 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6356:1: ( KEYWORD_49 )
            {
             before(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6357:1: ( KEYWORD_49 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6358:1: KEYWORD_49
            {
             before(grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0()); 
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__FromClause__IsExcludeSubclassesAssignment_2_012964); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6373:1: rule__WhereClause__FilterAssignment_1 : ( ruleConditionalOrExpression ) ;
    public final void rule__WhereClause__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6377:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6378:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6378:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6379:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getWhereClauseAccess().getFilterConditionalOrExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__WhereClause__FilterAssignment_113003);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6388:1: rule__VariablesClause__VariableDeclarationsAssignment_1 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesClause__VariableDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6392:1: ( ( ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6393:1: ( ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6393:1: ( ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6394:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_113034);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6403:1: rule__VariablesClause__VariableDeclarationsAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__VariablesClause__VariableDeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6407:1: ( ( ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6408:1: ( ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6408:1: ( ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6409:1: ruleVariableDeclaration
            {
             before(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_2_113065);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6418:1: rule__VariableDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6422:1: ( ( ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6423:1: ( ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6423:1: ( ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6424:1: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_013096);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6433:1: rule__VariableDeclaration__VariableNameAssignment_1 : ( ruleVariableName ) ;
    public final void rule__VariableDeclaration__VariableNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6437:1: ( ( ruleVariableName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6438:1: ( ruleVariableName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6438:1: ( ruleVariableName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6439:1: ruleVariableName
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVariableName_in_rule__VariableDeclaration__VariableNameAssignment_113127);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6448:1: rule__ParametersClause__ParameterDeclarationsAssignment_1 : ( ruleParameterDeclaration ) ;
    public final void rule__ParametersClause__ParameterDeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6452:1: ( ( ruleParameterDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6453:1: ( ruleParameterDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6453:1: ( ruleParameterDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6454:1: ruleParameterDeclaration
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_113158);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6463:1: rule__ParametersClause__ParameterDeclarationsAssignment_2_1 : ( ruleParameterDeclaration ) ;
    public final void rule__ParametersClause__ParameterDeclarationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6467:1: ( ( ruleParameterDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6468:1: ( ruleParameterDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6468:1: ( ruleParameterDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6469:1: ruleParameterDeclaration
            {
             before(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_2_113189);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6478:1: rule__ParameterDeclaration__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6482:1: ( ( ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6483:1: ( ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6483:1: ( ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6484:1: ruleType
            {
             before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_013220);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6493:1: rule__ParameterDeclaration__DeclaredParameterNameAssignment_1 : ( ruleDeclaredParameterName ) ;
    public final void rule__ParameterDeclaration__DeclaredParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6497:1: ( ( ruleDeclaredParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6498:1: ( ruleDeclaredParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6498:1: ( ruleDeclaredParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6499:1: ruleDeclaredParameterName
            {
             before(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameDeclaredParameterNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_rule__ParameterDeclaration__DeclaredParameterNameAssignment_113251);
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


    // $ANTLR start "rule__ImportClause__ImportDeclarationsAssignment_0"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6508:1: rule__ImportClause__ImportDeclarationsAssignment_0 : ( ruleImportDeclaration ) ;
    public final void rule__ImportClause__ImportDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6512:1: ( ( ruleImportDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6513:1: ( ruleImportDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6513:1: ( ruleImportDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6514:1: ruleImportDeclaration
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_013282);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6523:1: rule__ImportClause__ImportDeclarationsAssignment_1_1 : ( ruleImportDeclaration ) ;
    public final void rule__ImportClause__ImportDeclarationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6527:1: ( ( ruleImportDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6528:1: ( ruleImportDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6528:1: ( ruleImportDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6529:1: ruleImportDeclaration
            {
             before(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_1_113313);
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


    // $ANTLR start "rule__GroupByClause__GroupingAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6538:1: rule__GroupByClause__GroupingAssignment_2 : ( ruleConditionalOrExpression ) ;
    public final void rule__GroupByClause__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6542:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6543:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6543:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6544:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__GroupByClause__GroupingAssignment_213344);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__GroupingAssignment_2"


    // $ANTLR start "rule__GroupByClause__GroupingAssignment_3_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6553:1: rule__GroupByClause__GroupingAssignment_3_1 : ( ruleConditionalOrExpression ) ;
    public final void rule__GroupByClause__GroupingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6557:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6558:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6558:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6559:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__GroupByClause__GroupingAssignment_3_113375);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__GroupingAssignment_3_1"


    // $ANTLR start "rule__GroupByClause__HavingClauseAssignment_5"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6568:1: rule__GroupByClause__HavingClauseAssignment_5 : ( ruleHavingClause ) ;
    public final void rule__GroupByClause__HavingClauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6572:1: ( ( ruleHavingClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6573:1: ( ruleHavingClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6573:1: ( ruleHavingClause )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6574:1: ruleHavingClause
            {
             before(grammarAccess.getGroupByClauseAccess().getHavingClauseHavingClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHavingClause_in_rule__GroupByClause__HavingClauseAssignment_513406);
            ruleHavingClause();

            state._fsp--;

             after(grammarAccess.getGroupByClauseAccess().getHavingClauseHavingClauseParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupByClause__HavingClauseAssignment_5"


    // $ANTLR start "rule__HavingClause__HavingAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6583:1: rule__HavingClause__HavingAssignment_1 : ( ruleConditionalOrExpression ) ;
    public final void rule__HavingClause__HavingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6587:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6588:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6588:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6589:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getHavingClauseAccess().getHavingConditionalOrExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__HavingClause__HavingAssignment_113437);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getHavingClauseAccess().getHavingConditionalOrExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__HavingAssignment_1"


    // $ANTLR start "rule__OrderByClause__OrderingAssignment_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6598:1: rule__OrderByClause__OrderingAssignment_2 : ( ruleOrderBySpec ) ;
    public final void rule__OrderByClause__OrderingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6602:1: ( ( ruleOrderBySpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6603:1: ( ruleOrderBySpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6603:1: ( ruleOrderBySpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6604:1: ruleOrderBySpec
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrderBySpec_in_rule__OrderByClause__OrderingAssignment_213468);
            ruleOrderBySpec();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderingAssignment_2"


    // $ANTLR start "rule__OrderByClause__OrderingAssignment_3_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6613:1: rule__OrderByClause__OrderingAssignment_3_1 : ( ruleOrderBySpec ) ;
    public final void rule__OrderByClause__OrderingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6617:1: ( ( ruleOrderBySpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6618:1: ( ruleOrderBySpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6618:1: ( ruleOrderBySpec )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6619:1: ruleOrderBySpec
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleOrderBySpec_in_rule__OrderByClause__OrderingAssignment_3_113499);
            ruleOrderBySpec();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderingAssignment_3_1"


    // $ANTLR start "rule__OrderBySpec__DirectionAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6628:1: rule__OrderBySpec__DirectionAssignment_1 : ( ruleOrderByDirection ) ;
    public final void rule__OrderBySpec__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6632:1: ( ( ruleOrderByDirection ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6633:1: ( ruleOrderByDirection )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6633:1: ( ruleOrderByDirection )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6634:1: ruleOrderByDirection
            {
             before(grammarAccess.getOrderBySpecAccess().getDirectionOrderByDirectionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOrderByDirection_in_rule__OrderBySpec__DirectionAssignment_113530);
            ruleOrderByDirection();

            state._fsp--;

             after(grammarAccess.getOrderBySpecAccess().getDirectionOrderByDirectionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderBySpec__DirectionAssignment_1"


    // $ANTLR start "rule__RangeClause__StartAssignment_1"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6643:1: rule__RangeClause__StartAssignment_1 : ( ruleConditionalOrExpression ) ;
    public final void rule__RangeClause__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6647:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6648:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6648:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6649:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getRangeClauseAccess().getStartConditionalOrExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__RangeClause__StartAssignment_113561);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getRangeClauseAccess().getStartConditionalOrExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeClause__StartAssignment_1"


    // $ANTLR start "rule__RangeClause__EndAssignment_3"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6658:1: rule__RangeClause__EndAssignment_3 : ( ruleConditionalOrExpression ) ;
    public final void rule__RangeClause__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6662:1: ( ( ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6663:1: ( ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6663:1: ( ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6664:1: ruleConditionalOrExpression
            {
             before(grammarAccess.getRangeClauseAccess().getEndConditionalOrExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_rule__RangeClause__EndAssignment_313592);
            ruleConditionalOrExpression();

            state._fsp--;

             after(grammarAccess.getRangeClauseAccess().getEndConditionalOrExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeClause__EndAssignment_3"


    // $ANTLR start "rule__ConditionalOrExpression__RightAssignment_1_2"
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6673:1: rule__ConditionalOrExpression__RightAssignment_1_2 : ( ruleConditionalAndExpression ) ;
    public final void rule__ConditionalOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6677:1: ( ( ruleConditionalAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6678:1: ( ruleConditionalAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6678:1: ( ruleConditionalAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6679:1: ruleConditionalAndExpression
            {
             before(grammarAccess.getConditionalOrExpressionAccess().getRightConditionalAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__RightAssignment_1_213623);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6688:1: rule__ConditionalAndExpression__RightAssignment_1_2 : ( ruleSimpleOrExpression ) ;
    public final void rule__ConditionalAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6692:1: ( ( ruleSimpleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6693:1: ( ruleSimpleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6693:1: ( ruleSimpleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6694:1: ruleSimpleOrExpression
            {
             before(grammarAccess.getConditionalAndExpressionAccess().getRightSimpleOrExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__RightAssignment_1_213654);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6703:1: rule__SimpleOrExpression__RightAssignment_1_2 : ( ruleSimpleAndExpression ) ;
    public final void rule__SimpleOrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6707:1: ( ( ruleSimpleAndExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6708:1: ( ruleSimpleAndExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6708:1: ( ruleSimpleAndExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6709:1: ruleSimpleAndExpression
            {
             before(grammarAccess.getSimpleOrExpressionAccess().getRightSimpleAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__RightAssignment_1_213685);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6718:1: rule__SimpleAndExpression__RightAssignment_1_2 : ( ruleComparisonOperatorExpression ) ;
    public final void rule__SimpleAndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6722:1: ( ( ruleComparisonOperatorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6723:1: ( ruleComparisonOperatorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6723:1: ( ruleComparisonOperatorExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6724:1: ruleComparisonOperatorExpression
            {
             before(grammarAccess.getSimpleAndExpressionAccess().getRightComparisonOperatorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__RightAssignment_1_213716);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6733:1: rule__ComparisonOperatorExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonOperatorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6737:1: ( ( ruleComparisonOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6738:1: ( ruleComparisonOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6738:1: ( ruleComparisonOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6739:1: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__ComparisonOperatorExpression__OperatorAssignment_1_113747);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6748:1: rule__ComparisonOperatorExpression__RightAssignment_1_2 : ( ruleAdditionExpression ) ;
    public final void rule__ComparisonOperatorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6752:1: ( ( ruleAdditionExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6753:1: ( ruleAdditionExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6753:1: ( ruleAdditionExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6754:1: ruleAdditionExpression
            {
             before(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__RightAssignment_1_213778);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6763:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6767:1: ( ( ruleAdditionOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6768:1: ( ruleAdditionOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6768:1: ( ruleAdditionOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6769:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_113809);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6778:1: rule__AdditionExpression__RightAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6782:1: ( ( ruleMultiplicationExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6783:1: ( ruleMultiplicationExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6783:1: ( ruleMultiplicationExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6784:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__RightAssignment_1_213840);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6793:1: rule__MultiplicationExpression__OperatorAssignment_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6797:1: ( ( ruleMultiplicationOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6798:1: ( ruleMultiplicationOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6798:1: ( ruleMultiplicationOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6799:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_113871);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6808:1: rule__MultiplicationExpression__RightAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicationExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6812:1: ( ( ruleUnaryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6813:1: ( ruleUnaryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6813:1: ( ruleUnaryExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6814:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__RightAssignment_1_213902);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6823:1: rule__UnaryExpression__UnaryOperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryExpression__UnaryOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6827:1: ( ( ruleUnaryOperator ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6828:1: ( ruleUnaryOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6828:1: ( ruleUnaryOperator )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6829:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOperator_in_rule__UnaryExpression__UnaryOperatorAssignment_013933);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6838:1: rule__UnaryExpression__RightAssignment_1 : ( ruleFieldAccessExpression ) ;
    public final void rule__UnaryExpression__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6842:1: ( ( ruleFieldAccessExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6843:1: ( ruleFieldAccessExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6843:1: ( ruleFieldAccessExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6844:1: ruleFieldAccessExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_rule__UnaryExpression__RightAssignment_113964);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6853:1: rule__FieldAccessExpression__RightAssignment_1_2 : ( ruleFieldOrMethodExpression ) ;
    public final void rule__FieldAccessExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6857:1: ( ( ruleFieldOrMethodExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6858:1: ( ruleFieldOrMethodExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6858:1: ( ruleFieldOrMethodExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6859:1: ruleFieldOrMethodExpression
            {
             before(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_rule__FieldAccessExpression__RightAssignment_1_213995);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6868:1: rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0 : ( ruleLiteral ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6872:1: ( ( ruleLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6873:1: ( ruleLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6873:1: ( ruleLiteral )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6874:1: ruleLiteral
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_014026);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6883:1: rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1 : ( ( KEYWORD_35 ) ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6887:1: ( ( ( KEYWORD_35 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6888:1: ( ( KEYWORD_35 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6888:1: ( ( KEYWORD_35 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6889:1: ( KEYWORD_35 )
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6890:1: ( KEYWORD_35 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6891:1: KEYWORD_35
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_114062); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6906:1: rule__ParameterOrFieldOrMethodExpression__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6910:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6911:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6911:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6912:1: RULE_ID
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterOrFieldOrMethodExpression__IdAssignment_214101); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6921:1: rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1 : ( ruleParameterName ) ;
    public final void rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6925:1: ( ( ruleParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6926:1: ( ruleParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6926:1: ( ruleParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6927:1: ruleParameterName
            {
             before(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleParameterName_in_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_114132);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6936:1: rule__FieldOrMethodExpression__LiteralAssignment_0 : ( ruleLiteral ) ;
    public final void rule__FieldOrMethodExpression__LiteralAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6940:1: ( ( ruleLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6941:1: ( ruleLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6941:1: ( ruleLiteral )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6942:1: ruleLiteral
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__FieldOrMethodExpression__LiteralAssignment_014163);
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6951:1: rule__FieldOrMethodExpression__ThisAssignment_1 : ( ( KEYWORD_35 ) ) ;
    public final void rule__FieldOrMethodExpression__ThisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6955:1: ( ( ( KEYWORD_35 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6956:1: ( ( KEYWORD_35 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6956:1: ( ( KEYWORD_35 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6957:1: ( KEYWORD_35 )
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6958:1: ( KEYWORD_35 )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6959:1: KEYWORD_35
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0()); 
            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__FieldOrMethodExpression__ThisAssignment_114199); 
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
    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6974:1: rule__FieldOrMethodExpression__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__FieldOrMethodExpression__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6978:1: ( ( RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6979:1: ( RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6979:1: ( RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/internal/InternalJDOQLParser.g:6980:1: RULE_ID
            {
             before(grammarAccess.getFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldOrMethodExpression__IdAssignment_214238); 
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
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__0_in_ruleImportClause1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0_in_ruleImportDeclaration1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__0_in_ruleGroupByClause1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HavingClause__Group__0_in_ruleHavingClause1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__0_in_ruleOrderByClause1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderBySpec__Group__0_in_ruleOrderBySpec1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__0_in_ruleRangeClause1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__0_in_ruleConditionalOrExpression1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression1523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__0_in_ruleConditionalAndExpression1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__0_in_ruleSimpleOrExpression1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression1651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__0_in_ruleSimpleAndExpression1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression1715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__0_in_ruleComparisonOperatorExpression1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0_in_ruleAdditionExpression1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0_in_ruleMultiplicationExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__0_in_ruleUnaryExpression1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__0_in_ruleFieldAccessExpression2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Alternatives_in_ruleParameterOrFieldOrMethodExpression2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__Alternatives_in_ruleFieldOrMethodExpression2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__0_in_ruleParenthesesExpression2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType2293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType2357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericType__Alternatives_in_ruleNumericType2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType2421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegralType__Alternatives_in_ruleIntegralType2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatingPointType__Alternatives_in_ruleFloatingPointType2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Alternatives_in_ruleBooleanLiteral2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleNullLiteral2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier2869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__0_in_ruleQualifiedIdentifier2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName2933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByDirection__Alternatives_in_ruleOrderByDirection3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationOperator__Alternatives_in_ruleMultiplicationOperator3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_1_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__IdAssignment_2_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_rule__ParameterOrFieldOrMethodExpression__Alternatives3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__LiteralAssignment_0_in_rule__FieldOrMethodExpression__Alternatives3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__ThisAssignment_1_in_rule__FieldOrMethodExpression__Alternatives3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldOrMethodExpression__IdAssignment_2_in_rule__FieldOrMethodExpression__Alternatives3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_rule__FieldOrMethodExpression__Alternatives3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__Type__Alternatives3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rule__PrimitiveType__Alternatives3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__PrimitiveType__Alternatives3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_rule__NumericType__Alternatives3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_rule__NumericType__Alternatives3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__IntegralType__Alternatives3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__IntegralType__Alternatives3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__IntegralType__Alternatives3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__IntegralType__Alternatives3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__IntegralType__Alternatives3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__FloatingPointType__Alternatives3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__FloatingPointType__Alternatives3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__BooleanLiteral__Alternatives3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__BooleanLiteral__Alternatives3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Literal__Alternatives3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__OrderByDirection__Alternatives3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__OrderByDirection__Alternatives3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__OrderByDirection__Alternatives3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__OrderByDirection__Alternatives3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__UnaryOperator__Alternatives3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__UnaryOperator__Alternatives4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__UnaryOperator__Alternatives4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__UnaryOperator__Alternatives4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__AdditionOperator__Alternatives4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__AdditionOperator__Alternatives4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__MultiplicationOperator__Alternatives4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__MultiplicationOperator__Alternatives4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__MultiplicationOperator__Alternatives4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__ComparisonOperator__Alternatives4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__ComparisonOperator__Alternatives4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__ComparisonOperator__Alternatives4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__ComparisonOperator__Alternatives4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__ComparisonOperator__Alternatives4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__ComparisonOperator__Alternatives4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_rule__ComparisonOperator__Alternatives4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__0__Impl_in_rule__SingleStringJDOQL__Group__04369 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__1_in_rule__SingleStringJDOQL__Group__04372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__SelectClauseAssignment_0_in_rule__SingleStringJDOQL__Group__0__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__1__Impl_in_rule__SingleStringJDOQL__Group__14429 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__2_in_rule__SingleStringJDOQL__Group__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__FromClauseAssignment_1_in_rule__SingleStringJDOQL__Group__1__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__2__Impl_in_rule__SingleStringJDOQL__Group__24489 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__3_in_rule__SingleStringJDOQL__Group__24492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__WhereClauseAssignment_2_in_rule__SingleStringJDOQL__Group__2__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__3__Impl_in_rule__SingleStringJDOQL__Group__34550 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__4_in_rule__SingleStringJDOQL__Group__34553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__VariablesClauseAssignment_3_in_rule__SingleStringJDOQL__Group__3__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__4__Impl_in_rule__SingleStringJDOQL__Group__44611 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__5_in_rule__SingleStringJDOQL__Group__44614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__ParametersClauseAssignment_4_in_rule__SingleStringJDOQL__Group__4__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__5__Impl_in_rule__SingleStringJDOQL__Group__54672 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__6_in_rule__SingleStringJDOQL__Group__54675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__ImportClauseAssignment_5_in_rule__SingleStringJDOQL__Group__5__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__6__Impl_in_rule__SingleStringJDOQL__Group__64733 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__7_in_rule__SingleStringJDOQL__Group__64736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__GroupByClauseAssignment_6_in_rule__SingleStringJDOQL__Group__6__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__7__Impl_in_rule__SingleStringJDOQL__Group__74794 = new BitSet(new long[]{0x00000000003E0220L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__8_in_rule__SingleStringJDOQL__Group__74797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__OrderByClauseAssignment_7_in_rule__SingleStringJDOQL__Group__7__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__Group__8__Impl_in_rule__SingleStringJDOQL__Group__84855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStringJDOQL__RangeClauseAssignment_8_in_rule__SingleStringJDOQL__Group__8__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__0__Impl_in_rule__SelectClause__Group__04931 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__1_in_rule__SelectClause__Group__04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__1__Impl_in_rule__SelectClause__Group__14992 = new BitSet(new long[]{0xF094900388408400L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__2_in_rule__SelectClause__Group__14995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__SelectClause__Group__1__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__2__Impl_in_rule__SelectClause__Group__25054 = new BitSet(new long[]{0xF094900388408400L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__3_in_rule__SelectClause__Group__25057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__IsUniqueAssignment_2_in_rule__SelectClause__Group__2__Impl5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__3__Impl_in_rule__SelectClause__Group__35115 = new BitSet(new long[]{0xF094900388408400L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__4_in_rule__SelectClause__Group__35118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__ResultClauseAssignment_3_in_rule__SelectClause__Group__3__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__Group__4__Impl_in_rule__SelectClause__Group__45176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectClause__IntoClauseAssignment_4_in_rule__SelectClause__Group__4__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__0__Impl_in_rule__ResultClause__Group__05244 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__1_in_rule__ResultClause__Group__05247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__IsDistinctAssignment_0_in_rule__ResultClause__Group__0__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__1__Impl_in_rule__ResultClause__Group__15305 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__2_in_rule__ResultClause__Group__15308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__ResultSpecsAssignment_1_in_rule__ResultClause__Group__1__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group__2__Impl_in_rule__ResultClause__Group__25365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__0_in_rule__ResultClause__Group__2__Impl5392 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__0__Impl_in_rule__ResultClause__Group_2__05429 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__1_in_rule__ResultClause__Group_2__05432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ResultClause__Group_2__0__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__Group_2__1__Impl_in_rule__ResultClause__Group_2__15491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultClause__ResultSpecsAssignment_2_1_in_rule__ResultClause__Group_2__1__Impl5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__0__Impl_in_rule__IntoClause__Group__05552 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__1_in_rule__IntoClause__Group__05555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__IntoClause__Group__0__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__Group__1__Impl_in_rule__IntoClause__Group__15614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntoClause__ResultClassNameAssignment_1_in_rule__IntoClause__Group__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__0__Impl_in_rule__ResultSpec__Group__05675 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__1_in_rule__ResultSpec__Group__05678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__ResultSpec__Group__0__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__Group__1__Impl_in_rule__ResultSpec__Group__15734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultSpec__ResultNamingAssignment_1_in_rule__ResultSpec__Group__1__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__0__Impl_in_rule__ResultNaming__Group__05796 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__1_in_rule__ResultNaming__Group__05799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__ResultNaming__Group__0__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__Group__1__Impl_in_rule__ResultNaming__Group__15858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResultNaming__IdentifierAssignment_1_in_rule__ResultNaming__Group__1__Impl5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__0__Impl_in_rule__FromClause__Group__05919 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__FromClause__Group__1_in_rule__FromClause__Group__05922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__FromClause__Group__0__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__1__Impl_in_rule__FromClause__Group__15981 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FromClause__Group__2_in_rule__FromClause__Group__15984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__CandidateClassNameAssignment_1_in_rule__FromClause__Group__1__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group__2__Impl_in_rule__FromClause__Group__26041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__0_in_rule__FromClause__Group__2__Impl6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__0__Impl_in_rule__FromClause__Group_2__06105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__1_in_rule__FromClause__Group_2__06108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__IsExcludeSubclassesAssignment_2_0_in_rule__FromClause__Group_2__0__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FromClause__Group_2__1__Impl_in_rule__FromClause__Group_2__16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_rule__FromClause__Group_2__1__Impl6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__0__Impl_in_rule__WhereClause__Group__06228 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__1_in_rule__WhereClause__Group__06231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__WhereClause__Group__0__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__Group__1__Impl_in_rule__WhereClause__Group__16290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhereClause__FilterAssignment_1_in_rule__WhereClause__Group__1__Impl6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__0__Impl_in_rule__VariablesClause__Group__06351 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__1_in_rule__VariablesClause__Group__06354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__VariablesClause__Group__0__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__1__Impl_in_rule__VariablesClause__Group__16413 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__2_in_rule__VariablesClause__Group__16416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_1_in_rule__VariablesClause__Group__1__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__2__Impl_in_rule__VariablesClause__Group__26473 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__3_in_rule__VariablesClause__Group__26476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__0_in_rule__VariablesClause__Group__2__Impl6503 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group__3__Impl_in_rule__VariablesClause__Group__36534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group__3__Impl6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__0__Impl_in_rule__VariablesClause__Group_2__06604 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__1_in_rule__VariablesClause__Group_2__06607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__VariablesClause__Group_2__0__Impl6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__Group_2__1__Impl_in_rule__VariablesClause__Group_2__16666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariablesClause__VariableDeclarationsAssignment_2_1_in_rule__VariablesClause__Group_2__1__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__06727 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__06730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_0_in_rule__VariableDeclaration__Group__0__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__16787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__VariableNameAssignment_1_in_rule__VariableDeclaration__Group__1__Impl6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__0__Impl_in_rule__ParametersClause__Group__06848 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__1_in_rule__ParametersClause__Group__06851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rule__ParametersClause__Group__0__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__1__Impl_in_rule__ParametersClause__Group__16910 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__2_in_rule__ParametersClause__Group__16913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_1_in_rule__ParametersClause__Group__1__Impl6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__2__Impl_in_rule__ParametersClause__Group__26970 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__3_in_rule__ParametersClause__Group__26973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__0_in_rule__ParametersClause__Group__2__Impl7000 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group__3__Impl_in_rule__ParametersClause__Group__37031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group__3__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__0__Impl_in_rule__ParametersClause__Group_2__07101 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__1_in_rule__ParametersClause__Group_2__07104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__ParametersClause__Group_2__0__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__Group_2__1__Impl_in_rule__ParametersClause__Group_2__17163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersClause__ParameterDeclarationsAssignment_2_1_in_rule__ParametersClause__Group_2__1__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__07224 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__07227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__TypeAssignment_0_in_rule__ParameterDeclaration__Group__0__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__17284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__DeclaredParameterNameAssignment_1_in_rule__ParameterDeclaration__Group__1__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__0__Impl_in_rule__ImportClause__Group__07345 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__1_in_rule__ImportClause__Group__07348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_0_in_rule__ImportClause__Group__0__Impl7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__1__Impl_in_rule__ImportClause__Group__17405 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__2_in_rule__ImportClause__Group__17408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__0_in_rule__ImportClause__Group__1__Impl7435 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group__2__Impl_in_rule__ImportClause__Group__27466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__ImportClause__Group__2__Impl7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__0__Impl_in_rule__ImportClause__Group_1__07534 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__1_in_rule__ImportClause__Group_1__07537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__ImportClause__Group_1__0__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__Group_1__1__Impl_in_rule__ImportClause__Group_1__17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportClause__ImportDeclarationsAssignment_1_1_in_rule__ImportClause__Group_1__1__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__0__Impl_in_rule__ImportDeclaration__Group__07657 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1_in_rule__ImportDeclaration__Group__07660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__ImportDeclaration__Group__0__Impl7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclaration__Group__1__Impl_in_rule__ImportDeclaration__Group__17719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_rule__ImportDeclaration__Group__1__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__0__Impl_in_rule__GroupByClause__Group__07779 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__1_in_rule__GroupByClause__Group__07782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__GroupByClause__Group__0__Impl7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__1__Impl_in_rule__GroupByClause__Group__17841 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__2_in_rule__GroupByClause__Group__17844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__GroupByClause__Group__1__Impl7872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__2__Impl_in_rule__GroupByClause__Group__27903 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__3_in_rule__GroupByClause__Group__27906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__GroupingAssignment_2_in_rule__GroupByClause__Group__2__Impl7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__3__Impl_in_rule__GroupByClause__Group__37963 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__4_in_rule__GroupByClause__Group__37966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group_3__0_in_rule__GroupByClause__Group__3__Impl7993 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__4__Impl_in_rule__GroupByClause__Group__48024 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__5_in_rule__GroupByClause__Group__48027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__GroupByClause__Group__4__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group__5__Impl_in_rule__GroupByClause__Group__58089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__HavingClauseAssignment_5_in_rule__GroupByClause__Group__5__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group_3__0__Impl_in_rule__GroupByClause__Group_3__08159 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group_3__1_in_rule__GroupByClause__Group_3__08162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__GroupByClause__Group_3__0__Impl8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__Group_3__1__Impl_in_rule__GroupByClause__Group_3__18221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupByClause__GroupingAssignment_3_1_in_rule__GroupByClause__Group_3__1__Impl8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HavingClause__Group__0__Impl_in_rule__HavingClause__Group__08282 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__HavingClause__Group__1_in_rule__HavingClause__Group__08285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__HavingClause__Group__0__Impl8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HavingClause__Group__1__Impl_in_rule__HavingClause__Group__18344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HavingClause__HavingAssignment_1_in_rule__HavingClause__Group__1__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__0__Impl_in_rule__OrderByClause__Group__08405 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__1_in_rule__OrderByClause__Group__08408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__OrderByClause__Group__0__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__1__Impl_in_rule__OrderByClause__Group__18467 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__2_in_rule__OrderByClause__Group__18470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__OrderByClause__Group__1__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__2__Impl_in_rule__OrderByClause__Group__28529 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__3_in_rule__OrderByClause__Group__28532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__OrderingAssignment_2_in_rule__OrderByClause__Group__2__Impl8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__3__Impl_in_rule__OrderByClause__Group__38589 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__4_in_rule__OrderByClause__Group__38592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group_3__0_in_rule__OrderByClause__Group__3__Impl8619 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group__4__Impl_in_rule__OrderByClause__Group__48650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__OrderByClause__Group__4__Impl8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group_3__0__Impl_in_rule__OrderByClause__Group_3__08722 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group_3__1_in_rule__OrderByClause__Group_3__08725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__OrderByClause__Group_3__0__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__Group_3__1__Impl_in_rule__OrderByClause__Group_3__18784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderByClause__OrderingAssignment_3_1_in_rule__OrderByClause__Group_3__1__Impl8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderBySpec__Group__0__Impl_in_rule__OrderBySpec__Group__08845 = new BitSet(new long[]{0x0000000402000110L});
    public static final BitSet FOLLOW_rule__OrderBySpec__Group__1_in_rule__OrderBySpec__Group__08848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__OrderBySpec__Group__0__Impl8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderBySpec__Group__1__Impl_in_rule__OrderBySpec__Group__18904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderBySpec__DirectionAssignment_1_in_rule__OrderBySpec__Group__1__Impl8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__0__Impl_in_rule__RangeClause__Group__08965 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__1_in_rule__RangeClause__Group__08968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__RangeClause__Group__0__Impl8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__1__Impl_in_rule__RangeClause__Group__19027 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__2_in_rule__RangeClause__Group__19030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__StartAssignment_1_in_rule__RangeClause__Group__1__Impl9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__2__Impl_in_rule__RangeClause__Group__29087 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__3_in_rule__RangeClause__Group__29090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__RangeClause__Group__2__Impl9118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__Group__3__Impl_in_rule__RangeClause__Group__39149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RangeClause__EndAssignment_3_in_rule__RangeClause__Group__3__Impl9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__0__Impl_in_rule__ConditionalOrExpression__Group__09214 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__1_in_rule__ConditionalOrExpression__Group__09217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__Group__0__Impl9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group__1__Impl_in_rule__ConditionalOrExpression__Group__19273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__0_in_rule__ConditionalOrExpression__Group__1__Impl9300 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__0__Impl_in_rule__ConditionalOrExpression__Group_1__09335 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__1_in_rule__ConditionalOrExpression__Group_1__09338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__1__Impl_in_rule__ConditionalOrExpression__Group_1__19396 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__2_in_rule__ConditionalOrExpression__Group_1__19399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__ConditionalOrExpression__Group_1__1__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__Group_1__2__Impl_in_rule__ConditionalOrExpression__Group_1__29458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalOrExpression__RightAssignment_1_2_in_rule__ConditionalOrExpression__Group_1__2__Impl9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__0__Impl_in_rule__ConditionalAndExpression__Group__09521 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__1_in_rule__ConditionalAndExpression__Group__09524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__Group__0__Impl9551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group__1__Impl_in_rule__ConditionalAndExpression__Group__19580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__0_in_rule__ConditionalAndExpression__Group__1__Impl9607 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__0__Impl_in_rule__ConditionalAndExpression__Group_1__09642 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__1_in_rule__ConditionalAndExpression__Group_1__09645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__1__Impl_in_rule__ConditionalAndExpression__Group_1__19703 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__2_in_rule__ConditionalAndExpression__Group_1__19706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__ConditionalAndExpression__Group_1__1__Impl9734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__Group_1__2__Impl_in_rule__ConditionalAndExpression__Group_1__29765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalAndExpression__RightAssignment_1_2_in_rule__ConditionalAndExpression__Group_1__2__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__0__Impl_in_rule__SimpleOrExpression__Group__09828 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__1_in_rule__SimpleOrExpression__Group__09831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__Group__0__Impl9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group__1__Impl_in_rule__SimpleOrExpression__Group__19887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__0_in_rule__SimpleOrExpression__Group__1__Impl9914 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__0__Impl_in_rule__SimpleOrExpression__Group_1__09949 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__1_in_rule__SimpleOrExpression__Group_1__09952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__1__Impl_in_rule__SimpleOrExpression__Group_1__110010 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__2_in_rule__SimpleOrExpression__Group_1__110013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__SimpleOrExpression__Group_1__1__Impl10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__Group_1__2__Impl_in_rule__SimpleOrExpression__Group_1__210072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleOrExpression__RightAssignment_1_2_in_rule__SimpleOrExpression__Group_1__2__Impl10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__0__Impl_in_rule__SimpleAndExpression__Group__010135 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__1_in_rule__SimpleAndExpression__Group__010138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__Group__0__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group__1__Impl_in_rule__SimpleAndExpression__Group__110194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__0_in_rule__SimpleAndExpression__Group__1__Impl10221 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__0__Impl_in_rule__SimpleAndExpression__Group_1__010256 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__1_in_rule__SimpleAndExpression__Group_1__010259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__1__Impl_in_rule__SimpleAndExpression__Group_1__110317 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__2_in_rule__SimpleAndExpression__Group_1__110320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SimpleAndExpression__Group_1__1__Impl10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__Group_1__2__Impl_in_rule__SimpleAndExpression__Group_1__210379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAndExpression__RightAssignment_1_2_in_rule__SimpleAndExpression__Group_1__2__Impl10406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__0__Impl_in_rule__ComparisonOperatorExpression__Group__010442 = new BitSet(new long[]{0x060001D000000080L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__1_in_rule__ComparisonOperatorExpression__Group__010445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__Group__0__Impl10472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group__1__Impl_in_rule__ComparisonOperatorExpression__Group__110501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__0_in_rule__ComparisonOperatorExpression__Group__1__Impl10528 = new BitSet(new long[]{0x060001D000000082L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__0__Impl_in_rule__ComparisonOperatorExpression__Group_1__010563 = new BitSet(new long[]{0x060001D000000080L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__1_in_rule__ComparisonOperatorExpression__Group_1__010566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__1__Impl_in_rule__ComparisonOperatorExpression__Group_1__110624 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__2_in_rule__ComparisonOperatorExpression__Group_1__110627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__OperatorAssignment_1_1_in_rule__ComparisonOperatorExpression__Group_1__1__Impl10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__Group_1__2__Impl_in_rule__ComparisonOperatorExpression__Group_1__210684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperatorExpression__RightAssignment_1_2_in_rule__ComparisonOperatorExpression__Group_1__2__Impl10711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__0__Impl_in_rule__AdditionExpression__Group__010747 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1_in_rule__AdditionExpression__Group__010750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__Group__0__Impl10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group__1__Impl_in_rule__AdditionExpression__Group__110806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0_in_rule__AdditionExpression__Group__1__Impl10833 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__0__Impl_in_rule__AdditionExpression__Group_1__010868 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1_in_rule__AdditionExpression__Group_1__010871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__1__Impl_in_rule__AdditionExpression__Group_1__110929 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2_in_rule__AdditionExpression__Group_1__110932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__OperatorAssignment_1_1_in_rule__AdditionExpression__Group_1__1__Impl10959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__Group_1__2__Impl_in_rule__AdditionExpression__Group_1__210989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionExpression__RightAssignment_1_2_in_rule__AdditionExpression__Group_1__2__Impl11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__0__Impl_in_rule__MultiplicationExpression__Group__011052 = new BitSet(new long[]{0x0042200000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1_in_rule__MultiplicationExpression__Group__011055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__Group__0__Impl11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group__1__Impl_in_rule__MultiplicationExpression__Group__111111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0_in_rule__MultiplicationExpression__Group__1__Impl11138 = new BitSet(new long[]{0x0042200000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__0__Impl_in_rule__MultiplicationExpression__Group_1__011173 = new BitSet(new long[]{0x0042200000000000L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1_in_rule__MultiplicationExpression__Group_1__011176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__1__Impl_in_rule__MultiplicationExpression__Group_1__111234 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2_in_rule__MultiplicationExpression__Group_1__111237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__OperatorAssignment_1_1_in_rule__MultiplicationExpression__Group_1__1__Impl11264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__Group_1__2__Impl_in_rule__MultiplicationExpression__Group_1__211294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicationExpression__RightAssignment_1_2_in_rule__MultiplicationExpression__Group_1__2__Impl11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__0__Impl_in_rule__UnaryExpression__Group__011357 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__1_in_rule__UnaryExpression__Group__011360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__UnaryOperatorAssignment_0_in_rule__UnaryExpression__Group__0__Impl11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group__1__Impl_in_rule__UnaryExpression__Group__111418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__RightAssignment_1_in_rule__UnaryExpression__Group__1__Impl11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__0__Impl_in_rule__FieldAccessExpression__Group__011479 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__1_in_rule__FieldAccessExpression__Group__011482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_rule__FieldAccessExpression__Group__0__Impl11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group__1__Impl_in_rule__FieldAccessExpression__Group__111538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__0_in_rule__FieldAccessExpression__Group__1__Impl11565 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__0__Impl_in_rule__FieldAccessExpression__Group_1__011600 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__1_in_rule__FieldAccessExpression__Group_1__011603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__1__Impl_in_rule__FieldAccessExpression__Group_1__111661 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__2_in_rule__FieldAccessExpression__Group_1__111664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__FieldAccessExpression__Group_1__1__Impl11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__Group_1__2__Impl_in_rule__FieldAccessExpression__Group_1__211723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldAccessExpression__RightAssignment_1_2_in_rule__FieldAccessExpression__Group_1__2__Impl11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__011786 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__011789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__ParameterOrFieldOrMethodExpression__Group_3__0__Impl11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl_in_rule__ParameterOrFieldOrMethodExpression__Group_3__111848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_1_in_rule__ParameterOrFieldOrMethodExpression__Group_3__1__Impl11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__0__Impl_in_rule__ParenthesesExpression__Group__011909 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__1_in_rule__ParenthesesExpression__Group__011912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__ParenthesesExpression__Group__0__Impl11940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__1__Impl_in_rule__ParenthesesExpression__Group__111971 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__2_in_rule__ParenthesesExpression__Group__111974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__ParenthesesExpression__Group__1__Impl12001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesesExpression__Group__2__Impl_in_rule__ParenthesesExpression__Group__212030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__ParenthesesExpression__Group__2__Impl12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__0__Impl_in_rule__QualifiedIdentifier__Group__012096 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__1_in_rule__QualifiedIdentifier__Group__012099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group__0__Impl12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group__1__Impl_in_rule__QualifiedIdentifier__Group__112155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__0_in_rule__QualifiedIdentifier__Group__1__Impl12182 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__0__Impl_in_rule__QualifiedIdentifier__Group_1__012217 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__1_in_rule__QualifiedIdentifier__Group_1__012220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__QualifiedIdentifier__Group_1__0__Impl12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedIdentifier__Group_1__1__Impl_in_rule__QualifiedIdentifier__Group_1__112279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedIdentifier__Group_1__1__Impl12306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_rule__SingleStringJDOQL__SelectClauseAssignment_012344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_rule__SingleStringJDOQL__FromClauseAssignment_112375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_rule__SingleStringJDOQL__WhereClauseAssignment_212406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_rule__SingleStringJDOQL__VariablesClauseAssignment_312437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_rule__SingleStringJDOQL__ParametersClauseAssignment_412468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_rule__SingleStringJDOQL__ImportClauseAssignment_512499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_rule__SingleStringJDOQL__GroupByClauseAssignment_612530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_rule__SingleStringJDOQL__OrderByClauseAssignment_712561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_rule__SingleStringJDOQL__RangeClauseAssignment_812592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__SelectClause__IsUniqueAssignment_212628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_rule__SelectClause__ResultClauseAssignment_312667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_rule__SelectClause__IntoClauseAssignment_412698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__ResultClause__IsDistinctAssignment_012734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_112773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_rule__ResultClause__ResultSpecsAssignment_2_112804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_rule__IntoClause__ResultClassNameAssignment_112835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_rule__ResultSpec__ResultNamingAssignment_112866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResultNaming__IdentifierAssignment_112897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_rule__FromClause__CandidateClassNameAssignment_112928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__FromClause__IsExcludeSubclassesAssignment_2_012964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__WhereClause__FilterAssignment_113003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_113034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__VariablesClause__VariableDeclarationsAssignment_2_113065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_013096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_rule__VariableDeclaration__VariableNameAssignment_113127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_113158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__ParametersClause__ParameterDeclarationsAssignment_2_113189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_013220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_rule__ParameterDeclaration__DeclaredParameterNameAssignment_113251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_013282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_rule__ImportClause__ImportDeclarationsAssignment_1_113313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__GroupByClause__GroupingAssignment_213344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__GroupByClause__GroupingAssignment_3_113375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_rule__GroupByClause__HavingClauseAssignment_513406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__HavingClause__HavingAssignment_113437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_rule__OrderByClause__OrderingAssignment_213468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_rule__OrderByClause__OrderingAssignment_3_113499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_rule__OrderBySpec__DirectionAssignment_113530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__RangeClause__StartAssignment_113561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_rule__RangeClause__EndAssignment_313592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_rule__ConditionalOrExpression__RightAssignment_1_213623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_rule__ConditionalAndExpression__RightAssignment_1_213654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_rule__SimpleOrExpression__RightAssignment_1_213685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_rule__SimpleAndExpression__RightAssignment_1_213716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__ComparisonOperatorExpression__OperatorAssignment_1_113747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_rule__ComparisonOperatorExpression__RightAssignment_1_213778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__AdditionExpression__OperatorAssignment_1_113809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_rule__AdditionExpression__RightAssignment_1_213840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_rule__MultiplicationExpression__OperatorAssignment_1_113871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicationExpression__RightAssignment_1_213902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryExpression__UnaryOperatorAssignment_013933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_rule__UnaryExpression__RightAssignment_113964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_rule__FieldAccessExpression__RightAssignment_1_213995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ParameterOrFieldOrMethodExpression__LiteralAssignment_014026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__ParameterOrFieldOrMethodExpression__ThisAssignment_114062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterOrFieldOrMethodExpression__IdAssignment_214101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_rule__ParameterOrFieldOrMethodExpression__ParameterNameAssignment_3_114132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__FieldOrMethodExpression__LiteralAssignment_014163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__FieldOrMethodExpression__ThisAssignment_114199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldOrMethodExpression__IdAssignment_214238 = new BitSet(new long[]{0x0000000000000002L});

}