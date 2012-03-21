package org.nightlabs.jjqb.xtext.jdoql.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.nightlabs.jjqb.xtext.jdoql.services.JDOQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJDOQLParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private JDOQLGrammarAccess grammarAccess;
    	 	
    	public InternalJDOQLParser(TokenStream input, JDOQLGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "SingleStringJDOQL";	
    	} 
    	   	   	
    	@Override
    	protected JDOQLGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleSingleStringJDOQL"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:68:1: entryRuleSingleStringJDOQL returns [EObject current=null] : iv_ruleSingleStringJDOQL= ruleSingleStringJDOQL EOF ;
    public final EObject entryRuleSingleStringJDOQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStringJDOQL = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:69:2: (iv_ruleSingleStringJDOQL= ruleSingleStringJDOQL EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:70:2: iv_ruleSingleStringJDOQL= ruleSingleStringJDOQL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleStringJDOQLRule()); 
            }
            pushFollow(FOLLOW_ruleSingleStringJDOQL_in_entryRuleSingleStringJDOQL73);
            iv_ruleSingleStringJDOQL=ruleSingleStringJDOQL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleStringJDOQL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStringJDOQL83); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleStringJDOQL"


    // $ANTLR start "ruleSingleStringJDOQL"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:77:1: ruleSingleStringJDOQL returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? ) ;
    public final EObject ruleSingleStringJDOQL() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;

        EObject lv_variablesClause_3_0 = null;

        EObject lv_parametersClause_4_0 = null;

        EObject lv_importClause_5_0 = null;

        EObject lv_groupByClause_6_0 = null;

        EObject lv_orderByClause_7_0 = null;

        EObject lv_rangeClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:80:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:2: ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:2: ( (lv_selectClause_0_0= ruleSelectClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:82:1: (lv_selectClause_0_0= ruleSelectClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:82:1: (lv_selectClause_0_0= ruleSelectClause )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:83:3: lv_selectClause_0_0= ruleSelectClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectClause_in_ruleSingleStringJDOQL129);
            lv_selectClause_0_0=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
              	        }
                     		set(
                     			current, 
                     			"selectClause",
                      		lv_selectClause_0_0, 
                      		"SelectClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:99:2: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:100:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:100:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:101:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleSingleStringJDOQL150);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
              	        }
                     		set(
                     			current, 
                     			"fromClause",
                      		lv_fromClause_1_0, 
                      		"FromClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:117:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_40) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:118:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:118:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:119:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSingleStringJDOQL171);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"whereClause",
                              		lv_whereClause_2_0, 
                              		"WhereClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:135:3: ( (lv_variablesClause_3_0= ruleVariablesClause ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_53) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:136:1: (lv_variablesClause_3_0= ruleVariablesClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:136:1: (lv_variablesClause_3_0= ruleVariablesClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:137:3: lv_variablesClause_3_0= ruleVariablesClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getVariablesClauseVariablesClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablesClause_in_ruleSingleStringJDOQL193);
                    lv_variablesClause_3_0=ruleVariablesClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"variablesClause",
                              		lv_variablesClause_3_0, 
                              		"VariablesClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:153:3: ( (lv_parametersClause_4_0= ruleParametersClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_55) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:154:1: (lv_parametersClause_4_0= ruleParametersClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:154:1: (lv_parametersClause_4_0= ruleParametersClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:155:3: lv_parametersClause_4_0= ruleParametersClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getParametersClauseParametersClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParametersClause_in_ruleSingleStringJDOQL215);
                    lv_parametersClause_4_0=ruleParametersClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"parametersClause",
                              		lv_parametersClause_4_0, 
                              		"ParametersClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:171:3: ( (lv_importClause_5_0= ruleImportClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_48) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:172:1: (lv_importClause_5_0= ruleImportClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:172:1: (lv_importClause_5_0= ruleImportClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:173:3: lv_importClause_5_0= ruleImportClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getImportClauseImportClauseParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImportClause_in_ruleSingleStringJDOQL237);
                    lv_importClause_5_0=ruleImportClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"importClause",
                              		lv_importClause_5_0, 
                              		"ImportClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:189:3: ( (lv_groupByClause_6_0= ruleGroupByClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_37) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:190:1: (lv_groupByClause_6_0= ruleGroupByClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:190:1: (lv_groupByClause_6_0= ruleGroupByClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:191:3: lv_groupByClause_6_0= ruleGroupByClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getGroupByClauseGroupByClauseParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByClause_in_ruleSingleStringJDOQL259);
                    lv_groupByClause_6_0=ruleGroupByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"groupByClause",
                              		lv_groupByClause_6_0, 
                              		"GroupByClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:207:3: ( (lv_orderByClause_7_0= ruleOrderByClause ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_38) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:208:1: (lv_orderByClause_7_0= ruleOrderByClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:208:1: (lv_orderByClause_7_0= ruleOrderByClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:209:3: lv_orderByClause_7_0= ruleOrderByClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getOrderByClauseOrderByClauseParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderByClause_in_ruleSingleStringJDOQL281);
                    lv_orderByClause_7_0=ruleOrderByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"orderByClause",
                              		lv_orderByClause_7_0, 
                              		"OrderByClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:225:3: ( (lv_rangeClause_8_0= ruleRangeClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:226:1: (lv_rangeClause_8_0= ruleRangeClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:226:1: (lv_rangeClause_8_0= ruleRangeClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:227:3: lv_rangeClause_8_0= ruleRangeClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSingleStringJDOQLAccess().getRangeClauseRangeClauseParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRangeClause_in_ruleSingleStringJDOQL303);
                    lv_rangeClause_8_0=ruleRangeClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSingleStringJDOQLRule());
                      	        }
                             		set(
                             			current, 
                             			"rangeClause",
                              		lv_rangeClause_8_0, 
                              		"RangeClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleStringJDOQL"


    // $ANTLR start "entryRuleSelectClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:251:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:252:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:253:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause339);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause349); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectClause"


    // $ANTLR start "ruleSelectClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:260:1: ruleSelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_45 ( (lv_isUnique_2_0= KEYWORD_46 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:263:28: ( ( () otherlv_1= KEYWORD_45 ( (lv_isUnique_2_0= KEYWORD_46 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_45 ( (lv_isUnique_2_0= KEYWORD_46 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_45 ( (lv_isUnique_2_0= KEYWORD_46 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: () otherlv_1= KEYWORD_45 ( (lv_isUnique_2_0= KEYWORD_46 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: ()
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:265:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectClauseAccess().getSelectClauseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleSelectClause399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:278:1: ( (lv_isUnique_2_0= KEYWORD_46 ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_46 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_46 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:280:3: lv_isUnique_2_0= KEYWORD_46
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleSelectClause417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isUnique_2_0, grammarAccess.getSelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isUnique", true, "UNIQUE");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:294:3: ( (lv_resultClause_3_0= ruleResultClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_51||LA9_0==KEYWORD_41||(LA9_0>=KEYWORD_34 && LA9_0<=KEYWORD_36)||LA9_0==KEYWORD_1||LA9_0==KEYWORD_4||LA9_0==KEYWORD_7||LA9_0==KEYWORD_9||LA9_0==KEYWORD_12||(LA9_0>=KEYWORD_17 && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:295:1: (lv_resultClause_3_0= ruleResultClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:295:1: (lv_resultClause_3_0= ruleResultClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:296:3: lv_resultClause_3_0= ruleResultClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getResultClauseResultClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleResultClause_in_ruleSelectClause450);
                    lv_resultClause_3_0=ruleResultClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"resultClause",
                              		lv_resultClause_3_0, 
                              		"ResultClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:312:3: ( (lv_intoClause_4_0= ruleIntoClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:313:1: (lv_intoClause_4_0= ruleIntoClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:313:1: (lv_intoClause_4_0= ruleIntoClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:314:3: lv_intoClause_4_0= ruleIntoClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getIntoClauseIntoClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntoClause_in_ruleSelectClause472);
                    lv_intoClause_4_0=ruleIntoClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"intoClause",
                              		lv_intoClause_4_0, 
                              		"IntoClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectClause"


    // $ANTLR start "entryRuleResultClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:338:1: entryRuleResultClause returns [EObject current=null] : iv_ruleResultClause= ruleResultClause EOF ;
    public final EObject entryRuleResultClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:339:2: (iv_ruleResultClause= ruleResultClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:340:2: iv_ruleResultClause= ruleResultClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultClauseRule()); 
            }
            pushFollow(FOLLOW_ruleResultClause_in_entryRuleResultClause508);
            iv_ruleResultClause=ruleResultClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultClause518); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultClause"


    // $ANTLR start "ruleResultClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:347:1: ruleResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_51 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) ;
    public final EObject ruleResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        EObject lv_resultSpecs_1_0 = null;

        EObject lv_resultSpecs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:350:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_51 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_51 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_51 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_51 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_51 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_51) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_51 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_51 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:353:3: lv_isDistinct_0_0= KEYWORD_51
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleResultClause562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_0_0, grammarAccess.getResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResultClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:367:3: ( (lv_resultSpecs_1_0= ruleResultSpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:368:1: (lv_resultSpecs_1_0= ruleResultSpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:368:1: (lv_resultSpecs_1_0= ruleResultSpec )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:369:3: lv_resultSpecs_1_0= ruleResultSpec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultSpec_in_ruleResultClause595);
            lv_resultSpecs_1_0=ruleResultSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResultClauseRule());
              	        }
                     		add(
                     			current, 
                     			"resultSpecs",
                      		lv_resultSpecs_1_0, 
                      		"ResultSpec");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:385:2: (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KEYWORD_8) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:386:2: otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleResultClause609); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getResultClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:390:1: ( (lv_resultSpecs_3_0= ruleResultSpec ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:391:1: (lv_resultSpecs_3_0= ruleResultSpec )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:391:1: (lv_resultSpecs_3_0= ruleResultSpec )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:392:3: lv_resultSpecs_3_0= ruleResultSpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultSpec_in_ruleResultClause629);
            	    lv_resultSpecs_3_0=ruleResultSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getResultClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resultSpecs",
            	              		lv_resultSpecs_3_0, 
            	              		"ResultSpec");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultClause"


    // $ANTLR start "entryRuleIntoClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:416:1: entryRuleIntoClause returns [EObject current=null] : iv_ruleIntoClause= ruleIntoClause EOF ;
    public final EObject entryRuleIntoClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntoClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:417:2: (iv_ruleIntoClause= ruleIntoClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:418:2: iv_ruleIntoClause= ruleIntoClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntoClauseRule()); 
            }
            pushFollow(FOLLOW_ruleIntoClause_in_entryRuleIntoClause666);
            iv_ruleIntoClause=ruleIntoClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntoClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntoClause676); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntoClause"


    // $ANTLR start "ruleIntoClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:425:1: ruleIntoClause returns [EObject current=null] : (otherlv_0= KEYWORD_30 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) ;
    public final EObject ruleIntoClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_resultClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:428:28: ( (otherlv_0= KEYWORD_30 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_30 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_30 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:430:2: otherlv_0= KEYWORD_30 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleIntoClause714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntoClauseAccess().getINTOKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:434:1: ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:435:1: (lv_resultClassName_1_0= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:435:1: (lv_resultClassName_1_0= ruleClassOrInterfaceName )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:436:3: lv_resultClassName_1_0= ruleClassOrInterfaceName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause734);
            lv_resultClassName_1_0=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntoClauseRule());
              	        }
                     		set(
                     			current, 
                     			"resultClassName",
                      		lv_resultClassName_1_0, 
                      		"ClassOrInterfaceName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntoClause"


    // $ANTLR start "entryRuleResultSpec"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:460:1: entryRuleResultSpec returns [EObject current=null] : iv_ruleResultSpec= ruleResultSpec EOF ;
    public final EObject entryRuleResultSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultSpec = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:461:2: (iv_ruleResultSpec= ruleResultSpec EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:462:2: iv_ruleResultSpec= ruleResultSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultSpecRule()); 
            }
            pushFollow(FOLLOW_ruleResultSpec_in_entryRuleResultSpec769);
            iv_ruleResultSpec=ruleResultSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultSpec779); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultSpec"


    // $ANTLR start "ruleResultSpec"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:469:1: ruleResultSpec returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? ) ;
    public final EObject ruleResultSpec() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalOrExpression_0 = null;

        EObject lv_resultNaming_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:472:28: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:473:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:473:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:474:2: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getResultSpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec829);
            this_ConditionalOrExpression_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:485:1: ( (lv_resultNaming_1_0= ruleResultNaming ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:486:1: (lv_resultNaming_1_0= ruleResultNaming )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:486:1: (lv_resultNaming_1_0= ruleResultNaming )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:487:3: lv_resultNaming_1_0= ruleResultNaming
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResultSpecAccess().getResultNamingResultNamingParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleResultNaming_in_ruleResultSpec849);
                    lv_resultNaming_1_0=ruleResultNaming();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResultSpecRule());
                      	        }
                             		set(
                             			current, 
                             			"resultNaming",
                              		lv_resultNaming_1_0, 
                              		"ResultNaming");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultSpec"


    // $ANTLR start "entryRuleResultNaming"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:511:1: entryRuleResultNaming returns [EObject current=null] : iv_ruleResultNaming= ruleResultNaming EOF ;
    public final EObject entryRuleResultNaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultNaming = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:512:2: (iv_ruleResultNaming= ruleResultNaming EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:513:2: iv_ruleResultNaming= ruleResultNaming EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultNamingRule()); 
            }
            pushFollow(FOLLOW_ruleResultNaming_in_entryRuleResultNaming885);
            iv_ruleResultNaming=ruleResultNaming();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultNaming; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultNaming895); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultNaming"


    // $ANTLR start "ruleResultNaming"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:520:1: ruleResultNaming returns [EObject current=null] : (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResultNaming() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:523:28: ( (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:524:1: (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:524:1: (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:525:2: otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleResultNaming933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getResultNamingAccess().getASKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:529:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:530:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:530:1: (lv_identifier_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:531:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultNaming949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getResultNamingAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getResultNamingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultNaming"


    // $ANTLR start "entryRuleFromClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:555:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:556:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:557:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause989);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause999); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:564:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_29 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56 )? ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExcludeSubclasses_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_candidateClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:28: ( (otherlv_0= KEYWORD_29 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_29 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_29 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:569:2: otherlv_0= KEYWORD_29 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleFromClause1037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:573:1: ( (lv_candidateClassName_1_0= ruleCandidateClassName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:574:1: (lv_candidateClassName_1_0= ruleCandidateClassName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:574:1: (lv_candidateClassName_1_0= ruleCandidateClassName )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:575:3: lv_candidateClassName_1_0= ruleCandidateClassName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClauseAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_ruleFromClause1057);
            lv_candidateClassName_1_0=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromClauseRule());
              	        }
                     		set(
                     			current, 
                     			"candidateClassName",
                      		lv_candidateClassName_1_0, 
                      		"CandidateClassName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:2: ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) ) otherlv_3= KEYWORD_56
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_49 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_49 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_49 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:593:3: lv_isExcludeSubclasses_2_0= KEYWORD_49
                    {
                    lv_isExcludeSubclasses_2_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleFromClause1077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isExcludeSubclasses_2_0, grammarAccess.getFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFromClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isExcludeSubclasses", true, "EXCLUDE");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleFromClause1101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFromClauseAccess().getSUBCLASSESKeyword_2_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleWhereClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:620:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:621:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:622:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause1137);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause1147); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:629:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_40 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:632:28: ( (otherlv_0= KEYWORD_40 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_40 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_40 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:634:2: otherlv_0= KEYWORD_40 ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleWhereClause1185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:638:1: ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:639:1: (lv_filter_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:639:1: (lv_filter_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:640:3: lv_filter_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereClauseAccess().getFilterConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause1205);
            lv_filter_1_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereClauseRule());
              	        }
                     		set(
                     			current, 
                     			"filter",
                      		lv_filter_1_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleVariablesClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:664:1: entryRuleVariablesClause returns [EObject current=null] : iv_ruleVariablesClause= ruleVariablesClause EOF ;
    public final EObject entryRuleVariablesClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:665:2: (iv_ruleVariablesClause= ruleVariablesClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:666:2: iv_ruleVariablesClause= ruleVariablesClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariablesClauseRule()); 
            }
            pushFollow(FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause1240);
            iv_ruleVariablesClause=ruleVariablesClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariablesClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesClause1250); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariablesClause"


    // $ANTLR start "ruleVariablesClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:673:1: ruleVariablesClause returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) ;
    public final EObject ruleVariablesClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:676:28: ( (otherlv_0= KEYWORD_53 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_53 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_53 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:678:2: otherlv_0= KEYWORD_53 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleVariablesClause1288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariablesClauseAccess().getVARIABLESKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:682:1: ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:683:1: (lv_variableDeclarations_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:683:1: (lv_variableDeclarations_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:684:3: lv_variableDeclarations_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1308);
            lv_variableDeclarations_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariablesClauseRule());
              	        }
                     		add(
                     			current, 
                     			"variableDeclarations",
                      		lv_variableDeclarations_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:700:2: (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==KEYWORD_13) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==KEYWORD_50||LA15_1==KEYWORD_47||(LA15_1>=KEYWORD_42 && LA15_1<=KEYWORD_43)||(LA15_1>=KEYWORD_31 && LA15_1<=KEYWORD_33)||LA15_1==KEYWORD_27||LA15_1==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:701:2: otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleVariablesClause1322); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:705:1: ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:706:1: (lv_variableDeclarations_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:706:1: (lv_variableDeclarations_3_0= ruleVariableDeclaration )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:707:3: lv_variableDeclarations_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1342);
            	    lv_variableDeclarations_3_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVariablesClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variableDeclarations",
            	              		lv_variableDeclarations_3_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:723:4: (otherlv_4= KEYWORD_13 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:724:2: otherlv_4= KEYWORD_13
                    {
                    otherlv_4=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleVariablesClause1358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariablesClause"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:736:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:737:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:738:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1394);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1404); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:745:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_variableName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:748:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:749:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:749:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:749:2: ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:749:2: ( (lv_type_0_0= ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:750:1: (lv_type_0_0= ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:750:1: (lv_type_0_0= ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:751:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration1450);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:767:2: ( (lv_variableName_1_0= ruleVariableName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:768:1: (lv_variableName_1_0= ruleVariableName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:768:1: (lv_variableName_1_0= ruleVariableName )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:769:3: lv_variableName_1_0= ruleVariableName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDeclaration1471);
            lv_variableName_1_0=ruleVariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"variableName",
                      		lv_variableName_1_0, 
                      		"VariableName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:793:1: entryRuleVariableName returns [String current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final String entryRuleVariableName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:794:1: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:795:2: iv_ruleVariableName= ruleVariableName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableNameRule()); 
            }
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName1507);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName1518); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableName"


    // $ANTLR start "ruleVariableName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:802:1: ruleVariableName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariableName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:806:6: (this_ID_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:807:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName1557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getVariableNameAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableName"


    // $ANTLR start "entryRuleParametersClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:822:1: entryRuleParametersClause returns [EObject current=null] : iv_ruleParametersClause= ruleParametersClause EOF ;
    public final EObject entryRuleParametersClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:823:2: (iv_ruleParametersClause= ruleParametersClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:824:2: iv_ruleParametersClause= ruleParametersClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersClauseRule()); 
            }
            pushFollow(FOLLOW_ruleParametersClause_in_entryRuleParametersClause1600);
            iv_ruleParametersClause=ruleParametersClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParametersClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersClause1610); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametersClause"


    // $ANTLR start "ruleParametersClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:831:1: ruleParametersClause returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleParametersClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:834:28: ( (otherlv_0= KEYWORD_55 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_55 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_55 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:836:2: otherlv_0= KEYWORD_55 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleParametersClause1648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParametersClauseAccess().getPARAMETERSKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:840:1: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:841:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:841:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:842:3: lv_parameterDeclarations_1_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1668);
            lv_parameterDeclarations_1_0=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParametersClauseRule());
              	        }
                     		add(
                     			current, 
                     			"parameterDeclarations",
                      		lv_parameterDeclarations_1_0, 
                      		"ParameterDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:858:2: (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==KEYWORD_8) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==KEYWORD_50||LA17_1==KEYWORD_47||(LA17_1>=KEYWORD_42 && LA17_1<=KEYWORD_43)||(LA17_1>=KEYWORD_31 && LA17_1<=KEYWORD_33)||LA17_1==KEYWORD_27||LA17_1==RULE_ID) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:859:2: otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleParametersClause1682); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParametersClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:863:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:864:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:864:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:865:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1702);
            	    lv_parameterDeclarations_3_0=ruleParameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParametersClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameterDeclarations",
            	              		lv_parameterDeclarations_3_0, 
            	              		"ParameterDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:881:4: (otherlv_4= KEYWORD_8 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_8) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:882:2: otherlv_4= KEYWORD_8
                    {
                    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleParametersClause1718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParametersClauseAccess().getCommaKeyword_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametersClause"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:894:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:895:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:896:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1754);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1764); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:903:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredParameterName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:906:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:907:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:907:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:907:2: ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:907:2: ( (lv_type_0_0= ruleType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:908:1: (lv_type_0_0= ruleType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:908:1: (lv_type_0_0= ruleType )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:909:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameterDeclaration1810);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:925:2: ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:926:1: (lv_declaredParameterName_1_0= ruleDeclaredParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:926:1: (lv_declaredParameterName_1_0= ruleDeclaredParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:927:3: lv_declaredParameterName_1_0= ruleDeclaredParameterName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameDeclaredParameterNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration1831);
            lv_declaredParameterName_1_0=ruleDeclaredParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParameterName",
                      		lv_declaredParameterName_1_0, 
                      		"DeclaredParameterName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleDeclaredParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:951:1: entryRuleDeclaredParameterName returns [String current=null] : iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF ;
    public final String entryRuleDeclaredParameterName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaredParameterName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:952:1: (iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:953:2: iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1867);
            iv_ruleDeclaredParameterName=ruleDeclaredParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredParameterName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameterName1878); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameterName"


    // $ANTLR start "ruleDeclaredParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:960:1: ruleDeclaredParameterName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ParameterName_0= ruleParameterName ;
    public final AntlrDatatypeRuleToken ruleDeclaredParameterName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ParameterName_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:964:6: (this_ParameterName_0= ruleParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:966:5: this_ParameterName_0= ruleParameterName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDeclaredParameterNameAccess().getParameterNameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1924);
            this_ParameterName_0=ruleParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ParameterName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameterName"


    // $ANTLR start "entryRuleParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:984:1: entryRuleParameterName returns [String current=null] : iv_ruleParameterName= ruleParameterName EOF ;
    public final String entryRuleParameterName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:985:1: (iv_ruleParameterName= ruleParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:986:2: iv_ruleParameterName= ruleParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName1968);
            iv_ruleParameterName=ruleParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName1979); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterName"


    // $ANTLR start "ruleParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:993:1: ruleParameterName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleParameterName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:997:6: (this_ID_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:998:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName2018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getParameterNameAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterName"


    // $ANTLR start "entryRuleImportClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1013:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1014:2: (iv_ruleImportClause= ruleImportClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1015:2: iv_ruleImportClause= ruleImportClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportClauseRule()); 
            }
            pushFollow(FOLLOW_ruleImportClause_in_entryRuleImportClause2061);
            iv_ruleImportClause=ruleImportClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportClause2071); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportClause"


    // $ANTLR start "ruleImportClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1022:1: ruleImportClause returns [EObject current=null] : ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importDeclarations_0_0 = null;

        AntlrDatatypeRuleToken lv_importDeclarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1025:28: ( ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:1: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:1: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:2: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )?
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:2: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1027:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1027:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1028:3: lv_importDeclarations_0_0= ruleImportDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_ruleImportClause2117);
            lv_importDeclarations_0_0=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportClauseRule());
              	        }
                     		add(
                     			current, 
                     			"importDeclarations",
                      		lv_importDeclarations_0_0, 
                      		"ImportDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1044:2: (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KEYWORD_13) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==KEYWORD_48) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1045:2: otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleImportClause2131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getImportClauseAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1049:1: ( (lv_importDeclarations_2_0= ruleImportDeclaration ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1050:1: (lv_importDeclarations_2_0= ruleImportDeclaration )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1050:1: (lv_importDeclarations_2_0= ruleImportDeclaration )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1051:3: lv_importDeclarations_2_0= ruleImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDeclaration_in_ruleImportClause2151);
            	    lv_importDeclarations_2_0=ruleImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImportClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importDeclarations",
            	              		lv_importDeclarations_2_0, 
            	              		"ImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1067:4: (otherlv_3= KEYWORD_13 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1068:2: otherlv_3= KEYWORD_13
                    {
                    otherlv_3=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleImportClause2167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getImportClauseAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportClause"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1080:1: entryRuleImportDeclaration returns [String current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final String entryRuleImportDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1081:1: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1082:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2204);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration2215); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1089:1: ruleImportDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_48 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleImportDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1093:6: ( (kw= KEYWORD_48 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_48 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_48 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1095:2: kw= KEYWORD_48 this_QualifiedIdentifier_1= ruleQualifiedIdentifier
            {
            kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleImportDeclaration2253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportDeclarationAccess().getQualifiedIdentifierParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2275);
            this_QualifiedIdentifier_1=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedIdentifier_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleGroupByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1119:1: entryRuleGroupByClause returns [EObject current=null] : iv_ruleGroupByClause= ruleGroupByClause EOF ;
    public final EObject entryRuleGroupByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1120:2: (iv_ruleGroupByClause= ruleGroupByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1121:2: iv_ruleGroupByClause= ruleGroupByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2319);
            iv_ruleGroupByClause=ruleGroupByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByClause2329); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupByClause"


    // $ANTLR start "ruleGroupByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1128:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_37 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) ;
    public final EObject ruleGroupByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_grouping_2_0 = null;

        EObject lv_grouping_4_0 = null;

        EObject lv_havingClause_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1131:28: ( (otherlv_0= KEYWORD_37 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_37 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_37 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1133:2: otherlv_0= KEYWORD_37 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleGroupByClause2367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleGroupByClause2379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1142:1: ( (lv_grouping_2_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1143:1: (lv_grouping_2_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1143:1: (lv_grouping_2_0= ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1144:3: lv_grouping_2_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2399);
            lv_grouping_2_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupByClauseRule());
              	        }
                     		add(
                     			current, 
                     			"grouping",
                      		lv_grouping_2_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1160:2: (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==KEYWORD_8) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==KEYWORD_41||(LA21_1>=KEYWORD_34 && LA21_1<=KEYWORD_36)||LA21_1==KEYWORD_1||LA21_1==KEYWORD_4||LA21_1==KEYWORD_7||LA21_1==KEYWORD_9||LA21_1==KEYWORD_12||(LA21_1>=KEYWORD_17 && LA21_1<=RULE_STRING)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1161:2: otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleGroupByClause2413); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGroupByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1165:1: ( (lv_grouping_4_0= ruleConditionalOrExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1166:1: (lv_grouping_4_0= ruleConditionalOrExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1166:1: (lv_grouping_4_0= ruleConditionalOrExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1167:3: lv_grouping_4_0= ruleConditionalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2433);
            	    lv_grouping_4_0=ruleConditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroupByClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"grouping",
            	              		lv_grouping_4_0, 
            	              		"ConditionalOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1183:4: (otherlv_5= KEYWORD_8 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1184:2: otherlv_5= KEYWORD_8
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleGroupByClause2449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGroupByClauseAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1188:3: ( (lv_havingClause_6_0= ruleHavingClause ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1189:1: (lv_havingClause_6_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1189:1: (lv_havingClause_6_0= ruleHavingClause )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1190:3: lv_havingClause_6_0= ruleHavingClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getHavingClauseHavingClauseParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleGroupByClause2471);
                    lv_havingClause_6_0=ruleHavingClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGroupByClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"havingClause",
                              		lv_havingClause_6_0, 
                              		"HavingClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupByClause"


    // $ANTLR start "entryRuleHavingClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1214:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1215:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1216:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingClauseRule()); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause2507);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause2517); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHavingClause"


    // $ANTLR start "ruleHavingClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1223:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_44 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1226:28: ( (otherlv_0= KEYWORD_44 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_44 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_44 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1228:2: otherlv_0= KEYWORD_44 ( (lv_having_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleHavingClause2555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1232:1: ( (lv_having_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1233:1: (lv_having_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1233:1: (lv_having_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1234:3: lv_having_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause2575);
            lv_having_1_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHavingClauseRule());
              	        }
                     		set(
                     			current, 
                     			"having",
                      		lv_having_1_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHavingClause"


    // $ANTLR start "entryRuleOrderByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1258:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1259:2: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1260:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2610);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderByClause2620); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1267:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_38 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1270:28: ( (otherlv_0= KEYWORD_38 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_38 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_38 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1272:2: otherlv_0= KEYWORD_38 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleOrderByClause2658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleOrderByClause2670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1281:1: ( (lv_ordering_2_0= ruleOrderBySpec ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1282:1: (lv_ordering_2_0= ruleOrderBySpec )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1282:1: (lv_ordering_2_0= ruleOrderBySpec )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1283:3: lv_ordering_2_0= ruleOrderBySpec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2690);
            lv_ordering_2_0=ruleOrderBySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
              	        }
                     		add(
                     			current, 
                     			"ordering",
                      		lv_ordering_2_0, 
                      		"OrderBySpec");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1299:2: (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==KEYWORD_8) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==KEYWORD_41||(LA24_1>=KEYWORD_34 && LA24_1<=KEYWORD_36)||LA24_1==KEYWORD_1||LA24_1==KEYWORD_4||LA24_1==KEYWORD_7||LA24_1==KEYWORD_9||LA24_1==KEYWORD_12||(LA24_1>=KEYWORD_17 && LA24_1<=RULE_STRING)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1300:2: otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOrderByClause2704); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1304:1: ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1305:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1305:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1306:3: lv_ordering_4_0= ruleOrderBySpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2724);
            	    lv_ordering_4_0=ruleOrderBySpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrderByClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ordering",
            	              		lv_ordering_4_0, 
            	              		"OrderBySpec");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1322:4: (otherlv_5= KEYWORD_8 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_8) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1323:2: otherlv_5= KEYWORD_8
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOrderByClause2740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOrderByClauseAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderBySpec"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1335:1: entryRuleOrderBySpec returns [EObject current=null] : iv_ruleOrderBySpec= ruleOrderBySpec EOF ;
    public final EObject entryRuleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderBySpec = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1336:2: (iv_ruleOrderBySpec= ruleOrderBySpec EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1337:2: iv_ruleOrderBySpec= ruleOrderBySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderBySpecRule()); 
            }
            pushFollow(FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec2776);
            iv_ruleOrderBySpec=ruleOrderBySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderBySpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderBySpec2786); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderBySpec"


    // $ANTLR start "ruleOrderBySpec"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1344:1: ruleOrderBySpec returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) ;
    public final EObject ruleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalOrExpression_0 = null;

        Enumerator lv_direction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1347:28: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1348:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1348:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1349:2: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrderBySpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec2836);
            this_ConditionalOrExpression_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1360:1: ( (lv_direction_1_0= ruleOrderByDirection ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1361:1: (lv_direction_1_0= ruleOrderByDirection )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1361:1: (lv_direction_1_0= ruleOrderByDirection )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1362:3: lv_direction_1_0= ruleOrderByDirection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderBySpecAccess().getDirectionOrderByDirectionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec2856);
            lv_direction_1_0=ruleOrderByDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderBySpecRule());
              	        }
                     		set(
                     			current, 
                     			"direction",
                      		lv_direction_1_0, 
                      		"OrderByDirection");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderBySpec"


    // $ANTLR start "entryRuleRangeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1386:1: entryRuleRangeClause returns [EObject current=null] : iv_ruleRangeClause= ruleRangeClause EOF ;
    public final EObject entryRuleRangeClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1387:2: (iv_ruleRangeClause= ruleRangeClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1388:2: iv_ruleRangeClause= ruleRangeClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeClauseRule()); 
            }
            pushFollow(FOLLOW_ruleRangeClause_in_entryRuleRangeClause2891);
            iv_ruleRangeClause=ruleRangeClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeClause2901); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeClause"


    // $ANTLR start "ruleRangeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1395:1: ruleRangeClause returns [EObject current=null] : (otherlv_0= KEYWORD_39 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleRangeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1398:28: ( (otherlv_0= KEYWORD_39 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_39 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_39 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1400:2: otherlv_0= KEYWORD_39 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleRangeClause2939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeClauseAccess().getRANGEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1404:1: ( (lv_start_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1405:1: (lv_start_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1405:1: (lv_start_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1406:3: lv_start_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeClauseAccess().getStartConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2959);
            lv_start_1_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeClauseRule());
              	        }
                     		set(
                     			current, 
                     			"start",
                      		lv_start_1_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleRangeClause2972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeClauseAccess().getCommaKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1427:1: ( (lv_end_3_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1428:1: (lv_end_3_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1428:1: (lv_end_3_0= ruleConditionalOrExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1429:3: lv_end_3_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeClauseAccess().getEndConditionalOrExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2992);
            lv_end_3_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeClauseRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_3_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeClause"


    // $ANTLR start "entryRuleConditionalOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1453:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1454:2: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1455:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3027);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression3037); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalOrExpression"


    // $ANTLR start "ruleConditionalOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1462:1: ruleConditionalOrExpression returns [EObject current=null] : (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConditionalAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1465:28: ( (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1466:1: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1466:1: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1467:2: this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3087);
            this_ConditionalAndExpression_0=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1478:1: ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1478:2: () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1478:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1479:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3112); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1492:1: ( (lv_right_3_0= ruleConditionalAndExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1493:1: (lv_right_3_0= ruleConditionalAndExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1493:1: (lv_right_3_0= ruleConditionalAndExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1494:3: lv_right_3_0= ruleConditionalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getRightConditionalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3132);
            	    lv_right_3_0=ruleConditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ConditionalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalOrExpression"


    // $ANTLR start "entryRuleConditionalAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1518:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1519:2: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1520:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression3169);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression3179); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalAndExpression"


    // $ANTLR start "ruleConditionalAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1527:1: ruleConditionalAndExpression returns [EObject current=null] : (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1530:28: ( (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1531:1: (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1531:1: (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1532:2: this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getSimpleOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3229);
            this_SimpleOrExpression_0=ruleSimpleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SimpleOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1543:1: ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1543:2: () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1543:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1544:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression3254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1557:1: ( (lv_right_3_0= ruleSimpleOrExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1558:1: (lv_right_3_0= ruleSimpleOrExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1558:1: (lv_right_3_0= ruleSimpleOrExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1559:3: lv_right_3_0= ruleSimpleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getRightSimpleOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3274);
            	    lv_right_3_0=ruleSimpleOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SimpleOrExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalAndExpression"


    // $ANTLR start "entryRuleSimpleOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1583:1: entryRuleSimpleOrExpression returns [EObject current=null] : iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF ;
    public final EObject entryRuleSimpleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1584:2: (iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1585:2: iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression3311);
            iv_ruleSimpleOrExpression=ruleSimpleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrExpression3321); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleOrExpression"


    // $ANTLR start "ruleSimpleOrExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1592:1: ruleSimpleOrExpression returns [EObject current=null] : (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1595:28: ( (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1596:1: (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1596:1: (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1597:2: this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleOrExpressionAccess().getSimpleAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3371);
            this_SimpleAndExpression_0=ruleSimpleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SimpleAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1608:1: ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1608:2: () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1608:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1609:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleOrExpressionAccess().getSimpleOrExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression3396); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1622:1: ( (lv_right_3_0= ruleSimpleAndExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1623:1: (lv_right_3_0= ruleSimpleAndExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1623:1: (lv_right_3_0= ruleSimpleAndExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1624:3: lv_right_3_0= ruleSimpleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleOrExpressionAccess().getRightSimpleAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3416);
            	    lv_right_3_0=ruleSimpleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SimpleAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleOrExpression"


    // $ANTLR start "entryRuleSimpleAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1648:1: entryRuleSimpleAndExpression returns [EObject current=null] : iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF ;
    public final EObject entryRuleSimpleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1649:2: (iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1650:2: iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3453);
            iv_ruleSimpleAndExpression=ruleSimpleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAndExpression3463); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAndExpression"


    // $ANTLR start "ruleSimpleAndExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1657:1: ruleSimpleAndExpression returns [EObject current=null] : (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* ) ;
    public final EObject ruleSimpleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperatorExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1660:28: ( (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1661:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1661:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1662:2: this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3513);
            this_ComparisonOperatorExpression_0=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ComparisonOperatorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1673:1: ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_3) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1673:2: () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1673:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1674:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSimpleAndExpressionAccess().getSimpleAndExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3538); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1687:1: ( (lv_right_3_0= ruleComparisonOperatorExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1688:1: (lv_right_3_0= ruleComparisonOperatorExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1688:1: (lv_right_3_0= ruleComparisonOperatorExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1689:3: lv_right_3_0= ruleComparisonOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleAndExpressionAccess().getRightComparisonOperatorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3558);
            	    lv_right_3_0=ruleComparisonOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ComparisonOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAndExpression"


    // $ANTLR start "entryRuleComparisonOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1713:1: entryRuleComparisonOperatorExpression returns [EObject current=null] : iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF ;
    public final EObject entryRuleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1714:2: (iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1715:2: iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3595);
            iv_ruleComparisonOperatorExpression=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3605); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperatorExpression"


    // $ANTLR start "ruleComparisonOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1722:1: ruleComparisonOperatorExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1725:28: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1726:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1726:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1727:2: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3655);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AdditionExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1738:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==KEYWORD_57||LA30_0==KEYWORD_18||(LA30_0>=KEYWORD_20 && LA30_0<=KEYWORD_22)||(LA30_0>=KEYWORD_14 && LA30_0<=KEYWORD_15)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1738:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1738:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1739:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonOperatorExpressionAccess().getComparisonOperatorExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1747:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1748:1: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1748:1: (lv_operator_2_0= ruleComparisonOperator )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1749:3: lv_operator_2_0= ruleComparisonOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3688);
            	    lv_operator_2_0=ruleComparisonOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"ComparisonOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1765:2: ( (lv_right_3_0= ruleAdditionExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1766:1: (lv_right_3_0= ruleAdditionExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1766:1: (lv_right_3_0= ruleAdditionExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1767:3: lv_right_3_0= ruleAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3709);
            	    lv_right_3_0=ruleAdditionExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AdditionExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperatorExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1791:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1792:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1793:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3746);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression3756); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1800:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1803:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1804:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1804:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1805:2: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3806);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MultiplicationExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1816:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==KEYWORD_7||LA31_0==KEYWORD_9) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1816:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1816:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1817:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionExpressionAccess().getAdditionExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1825:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1826:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1826:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1827:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3839);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AdditionOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1843:2: ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1844:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1844:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1845:3: lv_right_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3860);
            	    lv_right_3_0=ruleMultiplicationExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MultiplicationExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1869:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1870:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1871:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3897);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression3907); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1878:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1881:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1882:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1882:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1883:2: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3957);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_UnaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1894:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==KEYWORD_2||LA32_0==KEYWORD_6||LA32_0==KEYWORD_11) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1894:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1894:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1895:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationExpressionAccess().getMultiplicationExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1903:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1904:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1904:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1905:3: lv_operator_2_0= ruleMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3990);
            	    lv_operator_2_0=ruleMultiplicationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MultiplicationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1921:2: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1922:1: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1922:1: (lv_right_3_0= ruleUnaryExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1923:3: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4011);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"UnaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1947:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1948:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1949:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4048);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression4058); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1956:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryOperator_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1959:28: ( ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:1: ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:1: ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:2: ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:2: ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_1||LA33_0==KEYWORD_7||LA33_0==KEYWORD_9||LA33_0==KEYWORD_17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1961:1: (lv_unaryOperator_0_0= ruleUnaryOperator )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1961:1: (lv_unaryOperator_0_0= ruleUnaryOperator )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1962:3: lv_unaryOperator_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression4104);
                    lv_unaryOperator_0_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"unaryOperator",
                              		lv_unaryOperator_0_0, 
                              		"UnaryOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1978:3: ( (lv_right_1_0= ruleFieldAccessExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1979:1: (lv_right_1_0= ruleFieldAccessExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1979:1: (lv_right_1_0= ruleFieldAccessExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1980:3: lv_right_1_0= ruleFieldAccessExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4126);
            lv_right_1_0=ruleFieldAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_1_0, 
                      		"FieldAccessExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleFieldAccessExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2004:1: entryRuleFieldAccessExpression returns [EObject current=null] : iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF ;
    public final EObject entryRuleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAccessExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2005:2: (iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2006:2: iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression4161);
            iv_ruleFieldAccessExpression=ruleFieldAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAccessExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAccessExpression4171); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldAccessExpression"


    // $ANTLR start "ruleFieldAccessExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2013:1: ruleFieldAccessExpression returns [EObject current=null] : (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* ) ;
    public final EObject ruleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ParameterOrFieldOrMethodExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2016:28: ( (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2017:1: (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2017:1: (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2018:2: this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4221);
            this_ParameterOrFieldOrMethodExpression_0=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ParameterOrFieldOrMethodExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2029:1: ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==KEYWORD_10) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2029:2: () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2029:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2030:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4246); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2043:1: ( (lv_right_3_0= ruleFieldOrMethodExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2044:1: (lv_right_3_0= ruleFieldOrMethodExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2044:1: (lv_right_3_0= ruleFieldOrMethodExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2045:3: lv_right_3_0= ruleFieldOrMethodExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4266);
            	    lv_right_3_0=ruleFieldOrMethodExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFieldAccessExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"FieldOrMethodExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldAccessExpression"


    // $ANTLR start "entryRuleParameterOrFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2069:1: entryRuleParameterOrFieldOrMethodExpression returns [EObject current=null] : iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF ;
    public final EObject entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOrFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2070:2: (iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2071:2: iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4303);
            iv_ruleParameterOrFieldOrMethodExpression=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterOrFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4313); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterOrFieldOrMethodExpression"


    // $ANTLR start "ruleParameterOrFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2078:1: ruleParameterOrFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression ) ;
    public final EObject ruleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        AntlrDatatypeRuleToken lv_parameterName_4_0 = null;

        EObject this_ParenthesesExpression_5 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2081:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2082:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2082:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression )
            int alt35=5;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
            case KEYWORD_34:
            case KEYWORD_36:
            case RULE_INT:
            case RULE_STRING:
                {
                alt35=1;
                }
                break;
            case KEYWORD_35:
                {
                alt35=2;
                }
                break;
            case RULE_ID:
                {
                alt35=3;
                }
                break;
            case KEYWORD_12:
                {
                alt35=4;
                }
                break;
            case KEYWORD_4:
                {
                alt35=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2082:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2082:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2083:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2083:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2084:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4359);
                    lv_literal_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterOrFieldOrMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_0_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2101:6: ( (lv_this_1_0= KEYWORD_35 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2101:6: ( (lv_this_1_0= KEYWORD_35 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2102:1: (lv_this_1_0= KEYWORD_35 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2102:1: (lv_this_1_0= KEYWORD_35 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2103:3: lv_this_1_0= KEYWORD_35
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleParameterOrFieldOrMethodExpression4384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_this_1_0, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getThisThisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterOrFieldOrMethodExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "this", lv_this_1_0, "this");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2118:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2118:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2119:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2119:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2120:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_0, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterOrFieldOrMethodExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2137:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2137:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2138:2: otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2142:1: ( (lv_parameterName_4_0= ruleParameterName ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2143:1: (lv_parameterName_4_0= ruleParameterName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2143:1: (lv_parameterName_4_0= ruleParameterName )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2144:3: lv_parameterName_4_0= ruleParameterName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4463);
                    lv_parameterName_4_0=ruleParameterName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterOrFieldOrMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterName",
                              		lv_parameterName_4_0, 
                              		"ParameterName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2162:2: this_ParenthesesExpression_5= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4495);
                    this_ParenthesesExpression_5=ruleParenthesesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthesesExpression_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterOrFieldOrMethodExpression"


    // $ANTLR start "entryRuleFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2181:1: entryRuleFieldOrMethodExpression returns [EObject current=null] : iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF ;
    public final EObject entryRuleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2182:2: (iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2183:2: iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4529);
            iv_ruleFieldOrMethodExpression=ruleFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4539); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOrMethodExpression"


    // $ANTLR start "ruleFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2190:1: ruleFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression ) ;
    public final EObject ruleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ParenthesesExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2193:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2194:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2194:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_35 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression )
            int alt36=4;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
            case KEYWORD_34:
            case KEYWORD_36:
            case RULE_INT:
            case RULE_STRING:
                {
                alt36=1;
                }
                break;
            case KEYWORD_35:
                {
                alt36=2;
                }
                break;
            case RULE_ID:
                {
                alt36=3;
                }
                break;
            case KEYWORD_4:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2194:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2194:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2195:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2195:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2196:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4585);
                    lv_literal_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldOrMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_0_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2213:6: ( (lv_this_1_0= KEYWORD_35 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2213:6: ( (lv_this_1_0= KEYWORD_35 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2214:1: (lv_this_1_0= KEYWORD_35 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2214:1: (lv_this_1_0= KEYWORD_35 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2215:3: lv_this_1_0= KEYWORD_35
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleFieldOrMethodExpression4610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_this_1_0, grammarAccess.getFieldOrMethodExpressionAccess().getThisThisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldOrMethodExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "this", lv_this_1_0, "this");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2230:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2230:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2231:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2231:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2232:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_2_0, grammarAccess.getFieldOrMethodExpressionAccess().getIdIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFieldOrMethodExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2250:2: this_ParenthesesExpression_3= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4680);
                    this_ParenthesesExpression_3=ruleParenthesesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthesesExpression_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOrMethodExpression"


    // $ANTLR start "entryRuleParenthesesExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2269:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2270:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2271:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression4714);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression4724); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesesExpression"


    // $ANTLR start "ruleParenthesesExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2278:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConditionalOrExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2281:28: ( (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2282:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2282:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2283:2: otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthesesExpression4762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression4786);
            this_ConditionalOrExpression_1=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthesesExpression4798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesesExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesesExpression"


    // $ANTLR start "entryRuleType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2314:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2315:1: (iv_ruleType= ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2316:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType4835);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4846); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2323:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_ClassOrInterfaceName_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2327:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2328:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2328:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_50||LA37_0==KEYWORD_47||(LA37_0>=KEYWORD_42 && LA37_0<=KEYWORD_43)||(LA37_0>=KEYWORD_31 && LA37_0<=KEYWORD_33)||LA37_0==KEYWORD_27) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2329:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType4893);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimitiveType_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2341:5: this_ClassOrInterfaceName_1= ruleClassOrInterfaceName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleType4926);
                    this_ClassOrInterfaceName_1=ruleClassOrInterfaceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ClassOrInterfaceName_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2359:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2360:1: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2361:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4971);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType4982); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2368:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericType_0= ruleNumericType | kw= KEYWORD_50 ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NumericType_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2372:6: ( (this_NumericType_0= ruleNumericType | kw= KEYWORD_50 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2373:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_50 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2373:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_50 )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_47||(LA38_0>=KEYWORD_42 && LA38_0<=KEYWORD_43)||(LA38_0>=KEYWORD_31 && LA38_0<=KEYWORD_33)||LA38_0==KEYWORD_27) ) {
                alt38=1;
            }
            else if ( (LA38_0==KEYWORD_50) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2374:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType5029);
                    this_NumericType_0=ruleNumericType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NumericType_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2386:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rulePrimitiveType5053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleNumericType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2399:1: entryRuleNumericType returns [String current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final String entryRuleNumericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2400:1: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2401:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType5093);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType5104); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2408:1: ruleNumericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) ;
    public final AntlrDatatypeRuleToken ruleNumericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegralType_0 = null;

        AntlrDatatypeRuleToken this_FloatingPointType_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2412:6: ( (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2413:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2413:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_43||(LA39_0>=KEYWORD_31 && LA39_0<=KEYWORD_33)||LA39_0==KEYWORD_27) ) {
                alt39=1;
            }
            else if ( (LA39_0==KEYWORD_47||LA39_0==KEYWORD_42) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2414:5: this_IntegralType_0= ruleIntegralType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegralType_in_ruleNumericType5151);
                    this_IntegralType_0=ruleIntegralType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IntegralType_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2426:5: this_FloatingPointType_1= ruleFloatingPointType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatingPointType_in_ruleNumericType5184);
                    this_FloatingPointType_1=ruleFloatingPointType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FloatingPointType_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleIntegralType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:1: entryRuleIntegralType returns [String current=null] : iv_ruleIntegralType= ruleIntegralType EOF ;
    public final String entryRuleIntegralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegralType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2445:1: (iv_ruleIntegralType= ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2446:2: iv_ruleIntegralType= ruleIntegralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegralTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType5229);
            iv_ruleIntegralType=ruleIntegralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegralType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType5240); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegralType"


    // $ANTLR start "ruleIntegralType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2453:1: ruleIntegralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_31 | kw= KEYWORD_43 | kw= KEYWORD_27 | kw= KEYWORD_33 | kw= KEYWORD_32 ) ;
    public final AntlrDatatypeRuleToken ruleIntegralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2457:6: ( (kw= KEYWORD_31 | kw= KEYWORD_43 | kw= KEYWORD_27 | kw= KEYWORD_33 | kw= KEYWORD_32 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2458:1: (kw= KEYWORD_31 | kw= KEYWORD_43 | kw= KEYWORD_27 | kw= KEYWORD_33 | kw= KEYWORD_32 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2458:1: (kw= KEYWORD_31 | kw= KEYWORD_43 | kw= KEYWORD_27 | kw= KEYWORD_33 | kw= KEYWORD_32 )
            int alt40=5;
            switch ( input.LA(1) ) {
            case KEYWORD_31:
                {
                alt40=1;
                }
                break;
            case KEYWORD_43:
                {
                alt40=2;
                }
                break;
            case KEYWORD_27:
                {
                alt40=3;
                }
                break;
            case KEYWORD_33:
                {
                alt40=4;
                }
                break;
            case KEYWORD_32:
                {
                alt40=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2459:2: kw= KEYWORD_31
                    {
                    kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleIntegralType5278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleIntegralType5297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2473:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleIntegralType5316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2480:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleIntegralType5335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2487:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleIntegralType5354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getCharKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegralType"


    // $ANTLR start "entryRuleFloatingPointType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2500:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2501:1: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2502:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType5394);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType5405); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatingPointType"


    // $ANTLR start "ruleFloatingPointType"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_42 | kw= KEYWORD_47 ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2513:6: ( (kw= KEYWORD_42 | kw= KEYWORD_47 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2514:1: (kw= KEYWORD_42 | kw= KEYWORD_47 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2514:1: (kw= KEYWORD_42 | kw= KEYWORD_47 )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_42) ) {
                alt41=1;
            }
            else if ( (LA41_0==KEYWORD_47) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2515:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleFloatingPointType5443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2522:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleFloatingPointType5462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getDoubleKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatingPointType"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2535:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2536:1: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2537:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral5502);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral5513); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2544:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2548:6: (this_INT_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2549:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral5552); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getIntegerLiteralAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2564:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2565:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2566:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5596);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5607); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2573:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2577:6: (this_STRING_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2578:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2593:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2594:1: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5690);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5701); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2602:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_41 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2606:6: ( (kw= KEYWORD_36 | kw= KEYWORD_41 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2607:1: (kw= KEYWORD_36 | kw= KEYWORD_41 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2607:1: (kw= KEYWORD_36 | kw= KEYWORD_41 )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_36) ) {
                alt42=1;
            }
            else if ( (LA42_0==KEYWORD_41) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2608:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleBooleanLiteral5739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleBooleanLiteral5758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2628:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2629:1: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2630:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5798);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral5809); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2637:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_34 ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2641:6: (kw= KEYWORD_34 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2643:2: kw= KEYWORD_34
            {
            kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleNullLiteral5846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNullLiteralAccess().getNullKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2656:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2657:1: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5885);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5896); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2665:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;

        AntlrDatatypeRuleToken this_NullLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2669:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2670:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2670:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt43=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_36:
                {
                alt43=2;
                }
                break;
            case RULE_STRING:
                {
                alt43=3;
                }
                break;
            case KEYWORD_34:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2671:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral5943);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IntegerLiteral_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2683:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5976);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BooleanLiteral_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2695:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral6009);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_StringLiteral_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2707:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral6042);
                    this_NullLiteral_3=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NullLiteral_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleQualifiedIdentifier"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2725:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2726:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2727:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier6087);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier6098); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedIdentifier"


    // $ANTLR start "ruleQualifiedIdentifier"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2734:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2738:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2739:1: (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2739:1: (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2739:6: this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier6138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2746:1: (kw= KEYWORD_10 this_ID_2= RULE_ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==KEYWORD_10) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2747:2: kw= KEYWORD_10 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier6157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier6172); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleCandidateClassName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2767:1: entryRuleCandidateClassName returns [String current=null] : iv_ruleCandidateClassName= ruleCandidateClassName EOF ;
    public final String entryRuleCandidateClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidateClassName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2768:1: (iv_ruleCandidateClassName= ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2769:2: iv_ruleCandidateClassName= ruleCandidateClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCandidateClassNameRule()); 
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName6219);
            iv_ruleCandidateClassName=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCandidateClassName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName6230); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCandidateClassName"


    // $ANTLR start "ruleCandidateClassName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2776:1: ruleCandidateClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleCandidateClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2780:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2782:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName6276);
            this_QualifiedIdentifier_0=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedIdentifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCandidateClassName"


    // $ANTLR start "entryRuleClassOrInterfaceName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2800:1: entryRuleClassOrInterfaceName returns [String current=null] : iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF ;
    public final String entryRuleClassOrInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrInterfaceName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2801:1: (iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2802:2: iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName6320);
            iv_ruleClassOrInterfaceName=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName6331); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassOrInterfaceName"


    // $ANTLR start "ruleClassOrInterfaceName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2809:1: ruleClassOrInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleClassOrInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2813:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2815:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName6377);
            this_QualifiedIdentifier_0=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedIdentifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassOrInterfaceName"


    // $ANTLR start "ruleOrderByDirection"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2833:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_52 ) | (enumLiteral_2= KEYWORD_28 ) | (enumLiteral_3= KEYWORD_54 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2835:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_52 ) | (enumLiteral_2= KEYWORD_28 ) | (enumLiteral_3= KEYWORD_54 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2836:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_52 ) | (enumLiteral_2= KEYWORD_28 ) | (enumLiteral_3= KEYWORD_54 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2836:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_52 ) | (enumLiteral_2= KEYWORD_28 ) | (enumLiteral_3= KEYWORD_54 ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt45=1;
                }
                break;
            case KEYWORD_52:
                {
                alt45=2;
                }
                break;
            case KEYWORD_28:
                {
                alt45=3;
                }
                break;
            case KEYWORD_54:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2836:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2836:2: (enumLiteral_0= KEYWORD_26 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2836:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderByDirection6438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:6: (enumLiteral_1= KEYWORD_52 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:6: (enumLiteral_1= KEYWORD_52 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:11: enumLiteral_1= KEYWORD_52
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleOrderByDirection6460); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:6: (enumLiteral_2= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:6: (enumLiteral_2= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:11: enumLiteral_2= KEYWORD_28
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleOrderByDirection6482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2854:6: (enumLiteral_3= KEYWORD_54 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2854:6: (enumLiteral_3= KEYWORD_54 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2854:11: enumLiteral_3= KEYWORD_54
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleOrderByDirection6504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescendingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOrderByDirectionAccess().getDescendingEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderByDirection"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2864:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2866:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2867:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2867:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt46=1;
                }
                break;
            case KEYWORD_9:
                {
                alt46=2;
                }
                break;
            case KEYWORD_17:
                {
                alt46=3;
                }
                break;
            case KEYWORD_1:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2867:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2867:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2867:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryOperator6554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryOperator6576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2879:6: (enumLiteral_2= KEYWORD_17 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2879:6: (enumLiteral_2= KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2879:11: enumLiteral_2= KEYWORD_17
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryOperator6598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2885:6: (enumLiteral_3= KEYWORD_1 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2885:6: (enumLiteral_3= KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2885:11: enumLiteral_3= KEYWORD_1
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleUnaryOperator6620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleAdditionOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2895:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2897:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_7) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_9) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditionOperator6670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2904:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2904:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2904:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditionOperator6692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2914:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2916:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt48=1;
                }
                break;
            case KEYWORD_11:
                {
                alt48=2;
                }
                break;
            case KEYWORD_2:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator6742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2923:6: (enumLiteral_1= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2923:6: (enumLiteral_1= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2923:11: enumLiteral_1= KEYWORD_11
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator6764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2929:6: (enumLiteral_2= KEYWORD_2 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2929:6: (enumLiteral_2= KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2929:11: enumLiteral_2= KEYWORD_2
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator6786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getModuloEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicationOperatorAccess().getModuloEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2939:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_57 ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2941:28: ( ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_57 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_57 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_57 ) )
            int alt49=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt49=1;
                }
                break;
            case KEYWORD_15:
                {
                alt49=2;
                }
                break;
            case KEYWORD_20:
                {
                alt49=3;
                }
                break;
            case KEYWORD_22:
                {
                alt49=4;
                }
                break;
            case KEYWORD_21:
                {
                alt49=5;
                }
                break;
            case KEYWORD_18:
                {
                alt49=6;
                }
                break;
            case KEYWORD_57:
                {
                alt49=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:2: (enumLiteral_0= KEYWORD_14 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:2: (enumLiteral_0= KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:7: enumLiteral_0= KEYWORD_14
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator6836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2948:6: (enumLiteral_1= KEYWORD_15 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2948:6: (enumLiteral_1= KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2948:11: enumLiteral_1= KEYWORD_15
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator6858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2954:6: (enumLiteral_2= KEYWORD_20 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2954:6: (enumLiteral_2= KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2954:11: enumLiteral_2= KEYWORD_20
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComparisonOperator6880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2960:6: (enumLiteral_3= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2960:6: (enumLiteral_3= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2960:11: enumLiteral_3= KEYWORD_22
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleComparisonOperator6902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2966:6: (enumLiteral_4= KEYWORD_21 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2966:6: (enumLiteral_4= KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2966:11: enumLiteral_4= KEYWORD_21
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleComparisonOperator6924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2972:6: (enumLiteral_5= KEYWORD_18 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2972:6: (enumLiteral_5= KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2972:11: enumLiteral_5= KEYWORD_18
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleComparisonOperator6946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2978:6: (enumLiteral_6= KEYWORD_57 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2978:6: (enumLiteral_6= KEYWORD_57 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2978:11: enumLiteral_6= KEYWORD_57
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleComparisonOperator6968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getInstanceofEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getComparisonOperatorAccess().getInstanceofEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSingleStringJDOQL_in_entryRuleSingleStringJDOQL73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStringJDOQL83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSingleStringJDOQL129 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSingleStringJDOQL150 = new BitSet(new long[]{0x00000000003E0222L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSingleStringJDOQL171 = new BitSet(new long[]{0x00000000001E0222L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_ruleSingleStringJDOQL193 = new BitSet(new long[]{0x00000000001E0022L});
    public static final BitSet FOLLOW_ruleParametersClause_in_ruleSingleStringJDOQL215 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_ruleImportClause_in_ruleSingleStringJDOQL237 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSingleStringJDOQL259 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSingleStringJDOQL281 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_ruleSingleStringJDOQL303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleSelectClause399 = new BitSet(new long[]{0xF094900388408402L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleSelectClause417 = new BitSet(new long[]{0xF094900388400402L});
    public static final BitSet FOLLOW_ruleResultClause_in_ruleSelectClause450 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSelectClause472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleResultClause562 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause595 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause609 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause629 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleIntoClause714 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec829 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_ruleResultSpec849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleResultNaming933 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultNaming949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleFromClause1037 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleFromClause1057 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleFromClause1077 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleFromClause1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleWhereClause1185 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleVariablesClause1288 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1308 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1322 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1342 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1450 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleParametersClause1648 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1668 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1682 = new BitSet(new long[]{0x2000000871811000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1702 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration1810 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2117 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2131 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2151 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleImportDeclaration2253 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleGroupByClause2367 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleGroupByClause2379 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2399 = new BitSet(new long[]{0x0008000000002002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2413 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2433 = new BitSet(new long[]{0x0008000000002002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2449 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleHavingClause2555 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleOrderByClause2658 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleOrderByClause2670 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2690 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2704 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2724 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec2836 = new BitSet(new long[]{0x0000000402000110L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleRangeClause2939 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2959 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleRangeClause2972 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3087 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3112 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3132 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3229 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression3254 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3274 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3371 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression3396 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3416 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3513 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3538 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3558 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3655 = new BitSet(new long[]{0x060001D000000082L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3688 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3709 = new BitSet(new long[]{0x060001D000000082L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3806 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3839 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3860 = new BitSet(new long[]{0x0014000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3957 = new BitSet(new long[]{0x0042200000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3990 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4011 = new BitSet(new long[]{0x0042200000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression4104 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression4161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4221 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4246 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4266 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleParameterOrFieldOrMethodExpression4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4443 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleFieldOrMethodExpression4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression4714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthesesExpression4762 = new BitSet(new long[]{0xF094900380400400L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression4786 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthesesExpression4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleType4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rulePrimitiveType5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_ruleNumericType5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_ruleNumericType5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType5229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleIntegralType5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleIntegralType5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleIntegralType5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleIntegralType5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleIntegralType5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType5394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleFloatingPointType5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleFloatingPointType5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral5502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleBooleanLiteral5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleBooleanLiteral5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleNullLiteral5846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier6087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier6138 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier6157 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier6172 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName6219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName6320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderByDirection6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleOrderByDirection6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleOrderByDirection6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleOrderByDirection6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryOperator6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryOperator6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryOperator6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleUnaryOperator6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditionOperator6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditionOperator6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComparisonOperator6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleComparisonOperator6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleComparisonOperator6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleComparisonOperator6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleComparisonOperator6968 = new BitSet(new long[]{0x0000000000000002L});

}