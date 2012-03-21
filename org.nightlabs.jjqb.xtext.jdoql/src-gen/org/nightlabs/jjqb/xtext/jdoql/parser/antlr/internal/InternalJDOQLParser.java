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

        AntlrDatatypeRuleToken lv_groupByClause_6_0 = null;

        AntlrDatatypeRuleToken lv_orderByClause_7_0 = null;

        AntlrDatatypeRuleToken lv_rangeClause_8_0 = null;


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

            if ( (LA1_0==KEYWORD_38) ) {
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

            if ( (LA2_0==KEYWORD_49) ) {
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

            if ( (LA3_0==KEYWORD_50) ) {
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

            if ( (LA4_0==KEYWORD_45) ) {
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

            if ( (LA5_0==KEYWORD_35) ) {
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

            if ( (LA6_0==KEYWORD_36) ) {
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

            if ( (LA7_0==KEYWORD_37) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:260:1: ruleSelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_42 ( (lv_isUnique_2_0= KEYWORD_43 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:263:28: ( ( () otherlv_1= KEYWORD_42 ( (lv_isUnique_2_0= KEYWORD_43 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_42 ( (lv_isUnique_2_0= KEYWORD_43 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_42 ( (lv_isUnique_2_0= KEYWORD_43 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: () otherlv_1= KEYWORD_42 ( (lv_isUnique_2_0= KEYWORD_43 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
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

            otherlv_1=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleSelectClause399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:278:1: ( (lv_isUnique_2_0= KEYWORD_43 ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_43 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_43 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:280:3: lv_isUnique_2_0= KEYWORD_43
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleSelectClause417); if (state.failed) return current;
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

            if ( (LA9_0==KEYWORD_48||LA9_0==KEYWORD_39||(LA9_0>=KEYWORD_32 && LA9_0<=KEYWORD_34)||LA9_0==KEYWORD_1||LA9_0==KEYWORD_4||LA9_0==KEYWORD_7||LA9_0==KEYWORD_9||LA9_0==KEYWORD_12||(LA9_0>=KEYWORD_17 && LA9_0<=RULE_STRING)) ) {
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

            if ( (LA10_0==KEYWORD_28) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:347:1: ruleResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_48 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) ;
    public final EObject ruleResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        EObject lv_resultSpecs_1_0 = null;

        EObject lv_resultSpecs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:350:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_48 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_48 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_48 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_48 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_48 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_48) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_48 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:353:3: lv_isDistinct_0_0= KEYWORD_48
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleResultClause562); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:425:1: ruleIntoClause returns [EObject current=null] : (otherlv_0= KEYWORD_28 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) ;
    public final EObject ruleIntoClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_resultClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:428:28: ( (otherlv_0= KEYWORD_28 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_28 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_28 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:430:2: otherlv_0= KEYWORD_28 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleIntoClause714); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:564:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_27 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51 )? ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExcludeSubclasses_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_candidateClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:28: ( (otherlv_0= KEYWORD_27 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_27 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_27 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:569:2: otherlv_0= KEYWORD_27 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleFromClause1037); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:2: ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) ) otherlv_3= KEYWORD_51
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_46 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_46 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_46 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:593:3: lv_isExcludeSubclasses_2_0= KEYWORD_46
                    {
                    lv_isExcludeSubclasses_2_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleFromClause1077); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleFromClause1101); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:629:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:632:28: ( (otherlv_0= KEYWORD_38 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_38 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_38 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:634:2: otherlv_0= KEYWORD_38 ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleWhereClause1185); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:673:1: ruleVariablesClause returns [EObject current=null] : (otherlv_0= KEYWORD_49 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) ;
    public final EObject ruleVariablesClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:676:28: ( (otherlv_0= KEYWORD_49 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_49 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_49 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:678:2: otherlv_0= KEYWORD_49 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleVariablesClause1288); if (state.failed) return current;
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

                    if ( (LA15_1==KEYWORD_47||LA15_1==KEYWORD_44||(LA15_1>=KEYWORD_40 && LA15_1<=KEYWORD_41)||(LA15_1>=KEYWORD_29 && LA15_1<=KEYWORD_31)||LA15_1==KEYWORD_26||LA15_1==RULE_ID) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:831:1: ruleParametersClause returns [EObject current=null] : (otherlv_0= KEYWORD_50 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleParametersClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:834:28: ( (otherlv_0= KEYWORD_50 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_50 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_50 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:836:2: otherlv_0= KEYWORD_50 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleParametersClause1648); if (state.failed) return current;
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

                    if ( (LA17_1==KEYWORD_47||LA17_1==KEYWORD_44||(LA17_1>=KEYWORD_40 && LA17_1<=KEYWORD_41)||(LA17_1>=KEYWORD_29 && LA17_1<=KEYWORD_31)||LA17_1==KEYWORD_26||LA17_1==RULE_ID) ) {
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

        EObject lv_declaredParameterName_1_0 = null;


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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:951:1: entryRuleDeclaredParameterName returns [EObject current=null] : iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF ;
    public final EObject entryRuleDeclaredParameterName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameterName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:952:2: (iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:953:2: iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1866);
            iv_ruleDeclaredParameterName=ruleDeclaredParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredParameterName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameterName1876); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:960:1: ruleDeclaredParameterName returns [EObject current=null] : ( (lv_name_0_0= ruleParameterName ) ) ;
    public final EObject ruleDeclaredParameterName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:963:28: ( ( (lv_name_0_0= ruleParameterName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:964:1: ( (lv_name_0_0= ruleParameterName ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:964:1: ( (lv_name_0_0= ruleParameterName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:965:1: (lv_name_0_0= ruleParameterName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:965:1: (lv_name_0_0= ruleParameterName )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:966:3: lv_name_0_0= ruleParameterName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaredParameterNameAccess().getNameParameterNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1921);
            lv_name_0_0=ruleParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaredParameterNameRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ParameterName");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleDeclaredParameterName"


    // $ANTLR start "entryRuleParameterName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:990:1: entryRuleParameterName returns [String current=null] : iv_ruleParameterName= ruleParameterName EOF ;
    public final String entryRuleParameterName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:991:1: (iv_ruleParameterName= ruleParameterName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:992:2: iv_ruleParameterName= ruleParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName1956);
            iv_ruleParameterName=ruleParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName1967); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:999:1: ruleParameterName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleParameterName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1003:6: (this_ID_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1004:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName2006); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1019:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1020:2: (iv_ruleImportClause= ruleImportClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1021:2: iv_ruleImportClause= ruleImportClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportClauseRule()); 
            }
            pushFollow(FOLLOW_ruleImportClause_in_entryRuleImportClause2049);
            iv_ruleImportClause=ruleImportClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportClause2059); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1028:1: ruleImportClause returns [EObject current=null] : ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importDeclarations_0_0 = null;

        AntlrDatatypeRuleToken lv_importDeclarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1031:28: ( ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1032:1: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1032:1: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1032:2: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )?
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1032:2: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1033:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1033:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1034:3: lv_importDeclarations_0_0= ruleImportDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_ruleImportClause2105);
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1050:2: (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KEYWORD_13) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==KEYWORD_45) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1051:2: otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleImportClause2119); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getImportClauseAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1055:1: ( (lv_importDeclarations_2_0= ruleImportDeclaration ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1056:1: (lv_importDeclarations_2_0= ruleImportDeclaration )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1056:1: (lv_importDeclarations_2_0= ruleImportDeclaration )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1057:3: lv_importDeclarations_2_0= ruleImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDeclaration_in_ruleImportClause2139);
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1073:4: (otherlv_3= KEYWORD_13 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1074:2: otherlv_3= KEYWORD_13
                    {
                    otherlv_3=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleImportClause2155); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1086:1: entryRuleImportDeclaration returns [String current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final String entryRuleImportDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1087:1: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1088:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2192);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration2203); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1095:1: ruleImportDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_45 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleImportDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1099:6: ( (kw= KEYWORD_45 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1100:1: (kw= KEYWORD_45 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1100:1: (kw= KEYWORD_45 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1101:2: kw= KEYWORD_45 this_QualifiedIdentifier_1= ruleQualifiedIdentifier
            {
            kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleImportDeclaration2241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportDeclarationAccess().getQualifiedIdentifierParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2263);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1125:1: entryRuleGroupByClause returns [String current=null] : iv_ruleGroupByClause= ruleGroupByClause EOF ;
    public final String entryRuleGroupByClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGroupByClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1126:1: (iv_ruleGroupByClause= ruleGroupByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1127:2: iv_ruleGroupByClause= ruleGroupByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2308);
            iv_ruleGroupByClause=ruleGroupByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByClause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByClause2319); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1134:1: ruleGroupByClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_35 kw= KEYWORD_24 ) ;
    public final AntlrDatatypeRuleToken ruleGroupByClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1138:6: ( (kw= KEYWORD_35 kw= KEYWORD_24 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1139:1: (kw= KEYWORD_35 kw= KEYWORD_24 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1139:1: (kw= KEYWORD_35 kw= KEYWORD_24 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1140:2: kw= KEYWORD_35 kw= KEYWORD_24
            {
            kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleGroupByClause2357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0()); 
                  
            }
            kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleGroupByClause2370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getGroupByClauseAccess().getBYKeyword_1()); 
                  
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


    // $ANTLR start "entryRuleOrderByClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1159:1: entryRuleOrderByClause returns [String current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final String entryRuleOrderByClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrderByClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1160:1: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1161:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2410);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderByClause2421); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1168:1: ruleOrderByClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 kw= KEYWORD_24 ) ;
    public final AntlrDatatypeRuleToken ruleOrderByClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1172:6: ( (kw= KEYWORD_36 kw= KEYWORD_24 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1173:1: (kw= KEYWORD_36 kw= KEYWORD_24 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1173:1: (kw= KEYWORD_36 kw= KEYWORD_24 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1174:2: kw= KEYWORD_36 kw= KEYWORD_24
            {
            kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleOrderByClause2459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 
                  
            }
            kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleOrderByClause2472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 
                  
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


    // $ANTLR start "entryRuleRangeClause"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1193:1: entryRuleRangeClause returns [String current=null] : iv_ruleRangeClause= ruleRangeClause EOF ;
    public final String entryRuleRangeClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRangeClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1194:1: (iv_ruleRangeClause= ruleRangeClause EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1195:2: iv_ruleRangeClause= ruleRangeClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeClauseRule()); 
            }
            pushFollow(FOLLOW_ruleRangeClause_in_entryRuleRangeClause2512);
            iv_ruleRangeClause=ruleRangeClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeClause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeClause2523); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1202:1: ruleRangeClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_37 ;
    public final AntlrDatatypeRuleToken ruleRangeClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1206:6: (kw= KEYWORD_37 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1208:2: kw= KEYWORD_37
            {
            kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleRangeClause2560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRangeClauseAccess().getRANGEKeyword()); 
                  
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1221:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1222:2: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1223:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression2598);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression2608); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1230:1: ruleConditionalOrExpression returns [EObject current=null] : (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConditionalAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1233:28: ( (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1234:1: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1234:1: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1235:2: this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2658);
            this_ConditionalAndExpression_0=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1246:1: ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==KEYWORD_25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1246:2: () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1246:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1247:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression2683); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1260:1: ( (lv_right_3_0= ruleConditionalAndExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1261:1: (lv_right_3_0= ruleConditionalAndExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1261:1: (lv_right_3_0= ruleConditionalAndExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1262:3: lv_right_3_0= ruleConditionalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getRightConditionalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2703);
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
            	    break loop21;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1286:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1287:2: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1288:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression2740);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression2750); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1295:1: ruleConditionalAndExpression returns [EObject current=null] : (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1298:28: ( (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1299:1: (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1299:1: (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1300:2: this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getSimpleOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression2800);
            this_SimpleOrExpression_0=ruleSimpleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SimpleOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1311:1: ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1311:2: () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1311:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1312:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression2825); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1325:1: ( (lv_right_3_0= ruleSimpleOrExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1326:1: (lv_right_3_0= ruleSimpleOrExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1326:1: (lv_right_3_0= ruleSimpleOrExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1327:3: lv_right_3_0= ruleSimpleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getRightSimpleOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression2845);
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
            	    break loop22;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1351:1: entryRuleSimpleOrExpression returns [EObject current=null] : iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF ;
    public final EObject entryRuleSimpleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1352:2: (iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1353:2: iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression2882);
            iv_ruleSimpleOrExpression=ruleSimpleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrExpression2892); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1360:1: ruleSimpleOrExpression returns [EObject current=null] : (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1363:28: ( (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1364:1: (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1364:1: (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1365:2: this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleOrExpressionAccess().getSimpleAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression2942);
            this_SimpleAndExpression_0=ruleSimpleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SimpleAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1376:1: ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1376:2: () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1376:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1377:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression2967); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1390:1: ( (lv_right_3_0= ruleSimpleAndExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1391:1: (lv_right_3_0= ruleSimpleAndExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1391:1: (lv_right_3_0= ruleSimpleAndExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1392:3: lv_right_3_0= ruleSimpleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleOrExpressionAccess().getRightSimpleAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression2987);
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
            	    break loop23;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1416:1: entryRuleSimpleAndExpression returns [EObject current=null] : iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF ;
    public final EObject entryRuleSimpleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1417:2: (iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1418:2: iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3024);
            iv_ruleSimpleAndExpression=ruleSimpleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAndExpression3034); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1425:1: ruleSimpleAndExpression returns [EObject current=null] : (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* ) ;
    public final EObject ruleSimpleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperatorExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1428:28: ( (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1429:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1429:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1430:2: this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3084);
            this_ComparisonOperatorExpression_0=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ComparisonOperatorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1441:1: ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==KEYWORD_3) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1441:2: () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1441:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1442:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3109); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1455:1: ( (lv_right_3_0= ruleComparisonOperatorExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1456:1: (lv_right_3_0= ruleComparisonOperatorExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1456:1: (lv_right_3_0= ruleComparisonOperatorExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1457:3: lv_right_3_0= ruleComparisonOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleAndExpressionAccess().getRightComparisonOperatorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3129);
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
            	    break loop24;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1481:1: entryRuleComparisonOperatorExpression returns [EObject current=null] : iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF ;
    public final EObject entryRuleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1482:2: (iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1483:2: iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3166);
            iv_ruleComparisonOperatorExpression=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3176); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1490:1: ruleComparisonOperatorExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1493:28: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1494:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1494:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1495:2: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3226);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AdditionExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1506:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==KEYWORD_52||LA25_0==KEYWORD_18||(LA25_0>=KEYWORD_20 && LA25_0<=KEYWORD_22)||(LA25_0>=KEYWORD_14 && LA25_0<=KEYWORD_15)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1506:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1506:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1507:2: 
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

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1515:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1516:1: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1516:1: (lv_operator_2_0= ruleComparisonOperator )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1517:3: lv_operator_2_0= ruleComparisonOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3259);
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

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1533:2: ( (lv_right_3_0= ruleAdditionExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1534:1: (lv_right_3_0= ruleAdditionExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1534:1: (lv_right_3_0= ruleAdditionExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1535:3: lv_right_3_0= ruleAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3280);
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
            	    break loop25;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1559:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1560:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1561:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3317);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression3327); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1568:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1571:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1572:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1572:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1573:2: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3377);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MultiplicationExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1584:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_7||LA26_0==KEYWORD_9) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1584:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1584:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1585:2: 
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

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1593:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1594:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1594:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1595:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3410);
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

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1611:2: ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1612:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1612:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1613:3: lv_right_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3431);
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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1637:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1638:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1639:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3468);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression3478); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1646:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1649:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1650:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1650:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1651:2: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3528);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_UnaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1662:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_2||LA27_0==KEYWORD_6||LA27_0==KEYWORD_11) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1662:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1662:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1663:2: 
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

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1671:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1672:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1672:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1673:3: lv_operator_2_0= ruleMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3561);
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

            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1689:2: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1690:1: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1690:1: (lv_right_3_0= ruleUnaryExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1691:3: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3582);
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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1715:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1716:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1717:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression3619);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression3629); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1724:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryOperator_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1727:28: ( ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1728:1: ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1728:1: ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1728:2: ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleFieldAccessExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1728:2: ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_1||LA28_0==KEYWORD_7||LA28_0==KEYWORD_9||LA28_0==KEYWORD_17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1729:1: (lv_unaryOperator_0_0= ruleUnaryOperator )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1729:1: (lv_unaryOperator_0_0= ruleUnaryOperator )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1730:3: lv_unaryOperator_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression3675);
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1746:3: ( (lv_right_1_0= ruleFieldAccessExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1747:1: (lv_right_1_0= ruleFieldAccessExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1747:1: (lv_right_1_0= ruleFieldAccessExpression )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1748:3: lv_right_1_0= ruleFieldAccessExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression3697);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1772:1: entryRuleFieldAccessExpression returns [EObject current=null] : iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF ;
    public final EObject entryRuleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAccessExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1773:2: (iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1774:2: iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression3732);
            iv_ruleFieldAccessExpression=ruleFieldAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAccessExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAccessExpression3742); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1781:1: ruleFieldAccessExpression returns [EObject current=null] : (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* ) ;
    public final EObject ruleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ParameterOrFieldOrMethodExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1784:28: ( (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1785:1: (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1785:1: (this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1786:2: this_ParameterOrFieldOrMethodExpression_0= ruleParameterOrFieldOrMethodExpression ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression3792);
            this_ParameterOrFieldOrMethodExpression_0=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ParameterOrFieldOrMethodExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1797:1: ( () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_10) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1797:2: () otherlv_2= KEYWORD_10 ( (lv_right_3_0= ruleFieldOrMethodExpression ) )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1797:2: ()
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1798:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression3817); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1811:1: ( (lv_right_3_0= ruleFieldOrMethodExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1812:1: (lv_right_3_0= ruleFieldOrMethodExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1812:1: (lv_right_3_0= ruleFieldOrMethodExpression )
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1813:3: lv_right_3_0= ruleFieldOrMethodExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression3837);
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
    // $ANTLR end "ruleFieldAccessExpression"


    // $ANTLR start "entryRuleParameterOrFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1837:1: entryRuleParameterOrFieldOrMethodExpression returns [EObject current=null] : iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF ;
    public final EObject entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOrFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1838:2: (iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1839:2: iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression3874);
            iv_ruleParameterOrFieldOrMethodExpression=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterOrFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression3884); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1846:1: ruleParameterOrFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1849:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1850:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1850:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression )
            int alt30=5;
            switch ( input.LA(1) ) {
            case KEYWORD_39:
            case KEYWORD_32:
            case KEYWORD_34:
            case RULE_INT:
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case KEYWORD_33:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                alt30=3;
                }
                break;
            case KEYWORD_12:
                {
                alt30=4;
                }
                break;
            case KEYWORD_4:
                {
                alt30=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1850:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1850:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1851:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1851:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1852:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression3930);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1869:6: ( (lv_this_1_0= KEYWORD_33 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1869:6: ( (lv_this_1_0= KEYWORD_33 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1870:1: (lv_this_1_0= KEYWORD_33 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1870:1: (lv_this_1_0= KEYWORD_33 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1871:3: lv_this_1_0= KEYWORD_33
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleParameterOrFieldOrMethodExpression3955); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1886:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1886:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1887:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1887:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1888:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression3989); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1905:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1905:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1906:2: otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1910:1: ( (lv_parameterName_4_0= ruleParameterName ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1911:1: (lv_parameterName_4_0= ruleParameterName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1911:1: (lv_parameterName_4_0= ruleParameterName )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1912:3: lv_parameterName_4_0= ruleParameterName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4034);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1930:2: this_ParenthesesExpression_5= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4066);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1949:1: entryRuleFieldOrMethodExpression returns [EObject current=null] : iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF ;
    public final EObject entryRuleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1950:2: (iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1951:2: iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4100);
            iv_ruleFieldOrMethodExpression=ruleFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4110); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1958:1: ruleFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression ) ;
    public final EObject ruleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ParenthesesExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1961:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1962:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1962:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_33 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression )
            int alt31=4;
            switch ( input.LA(1) ) {
            case KEYWORD_39:
            case KEYWORD_32:
            case KEYWORD_34:
            case RULE_INT:
            case RULE_STRING:
                {
                alt31=1;
                }
                break;
            case KEYWORD_33:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
                {
                alt31=3;
                }
                break;
            case KEYWORD_4:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1962:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1962:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1963:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1963:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1964:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4156);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1981:6: ( (lv_this_1_0= KEYWORD_33 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1981:6: ( (lv_this_1_0= KEYWORD_33 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1982:1: (lv_this_1_0= KEYWORD_33 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1982:1: (lv_this_1_0= KEYWORD_33 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1983:3: lv_this_1_0= KEYWORD_33
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleFieldOrMethodExpression4181); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1998:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1998:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1999:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1999:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2000:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4215); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2018:2: this_ParenthesesExpression_3= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4251);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2037:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2038:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2039:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression4285);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression4295); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2046:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConditionalOrExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2049:28: ( (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2050:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2050:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2051:2: otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthesesExpression4333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression4357);
            this_ConditionalOrExpression_1=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthesesExpression4369); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2082:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2083:1: (iv_ruleType= ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2084:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType4406);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4417); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2091:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_ClassOrInterfaceName_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2095:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2096:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2096:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_47||LA32_0==KEYWORD_44||(LA32_0>=KEYWORD_40 && LA32_0<=KEYWORD_41)||(LA32_0>=KEYWORD_29 && LA32_0<=KEYWORD_31)||LA32_0==KEYWORD_26) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2097:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType4464);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2109:5: this_ClassOrInterfaceName_1= ruleClassOrInterfaceName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleType4497);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2127:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2128:1: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2129:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4542);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType4553); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2136:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericType_0= ruleNumericType | kw= KEYWORD_47 ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NumericType_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2140:6: ( (this_NumericType_0= ruleNumericType | kw= KEYWORD_47 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2141:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_47 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2141:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_47 )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_44||(LA33_0>=KEYWORD_40 && LA33_0<=KEYWORD_41)||(LA33_0>=KEYWORD_29 && LA33_0<=KEYWORD_31)||LA33_0==KEYWORD_26) ) {
                alt33=1;
            }
            else if ( (LA33_0==KEYWORD_47) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2142:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType4600);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2154:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rulePrimitiveType4624); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2167:1: entryRuleNumericType returns [String current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final String entryRuleNumericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2168:1: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2169:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType4664);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType4675); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2176:1: ruleNumericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) ;
    public final AntlrDatatypeRuleToken ruleNumericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegralType_0 = null;

        AntlrDatatypeRuleToken this_FloatingPointType_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2180:6: ( (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2181:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2181:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_41||(LA34_0>=KEYWORD_29 && LA34_0<=KEYWORD_31)||LA34_0==KEYWORD_26) ) {
                alt34=1;
            }
            else if ( (LA34_0==KEYWORD_44||LA34_0==KEYWORD_40) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2182:5: this_IntegralType_0= ruleIntegralType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegralType_in_ruleNumericType4722);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2194:5: this_FloatingPointType_1= ruleFloatingPointType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatingPointType_in_ruleNumericType4755);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2212:1: entryRuleIntegralType returns [String current=null] : iv_ruleIntegralType= ruleIntegralType EOF ;
    public final String entryRuleIntegralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegralType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2213:1: (iv_ruleIntegralType= ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2214:2: iv_ruleIntegralType= ruleIntegralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegralTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType4800);
            iv_ruleIntegralType=ruleIntegralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegralType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType4811); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2221:1: ruleIntegralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_41 | kw= KEYWORD_26 | kw= KEYWORD_31 | kw= KEYWORD_30 ) ;
    public final AntlrDatatypeRuleToken ruleIntegralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2225:6: ( (kw= KEYWORD_29 | kw= KEYWORD_41 | kw= KEYWORD_26 | kw= KEYWORD_31 | kw= KEYWORD_30 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2226:1: (kw= KEYWORD_29 | kw= KEYWORD_41 | kw= KEYWORD_26 | kw= KEYWORD_31 | kw= KEYWORD_30 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2226:1: (kw= KEYWORD_29 | kw= KEYWORD_41 | kw= KEYWORD_26 | kw= KEYWORD_31 | kw= KEYWORD_30 )
            int alt35=5;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt35=1;
                }
                break;
            case KEYWORD_41:
                {
                alt35=2;
                }
                break;
            case KEYWORD_26:
                {
                alt35=3;
                }
                break;
            case KEYWORD_31:
                {
                alt35=4;
                }
                break;
            case KEYWORD_30:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2227:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleIntegralType4849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2234:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleIntegralType4868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2241:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleIntegralType4887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2248:2: kw= KEYWORD_31
                    {
                    kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleIntegralType4906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2255:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleIntegralType4925); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2268:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2269:1: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2270:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType4965);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType4976); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2277:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_40 | kw= KEYWORD_44 ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2281:6: ( (kw= KEYWORD_40 | kw= KEYWORD_44 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2282:1: (kw= KEYWORD_40 | kw= KEYWORD_44 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2282:1: (kw= KEYWORD_40 | kw= KEYWORD_44 )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_40) ) {
                alt36=1;
            }
            else if ( (LA36_0==KEYWORD_44) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2283:2: kw= KEYWORD_40
                    {
                    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleFloatingPointType5014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2290:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleFloatingPointType5033); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2303:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2304:1: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2305:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral5073);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral5084); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2312:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2316:6: (this_INT_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2317:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral5123); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2336:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2337:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2338:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5171);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5182); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2345:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2349:6: (this_STRING_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2350:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5221); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2365:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2366:1: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2367:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5265);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5276); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2374:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_34 | kw= KEYWORD_39 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2378:6: ( (kw= KEYWORD_34 | kw= KEYWORD_39 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2379:1: (kw= KEYWORD_34 | kw= KEYWORD_39 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2379:1: (kw= KEYWORD_34 | kw= KEYWORD_39 )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_34) ) {
                alt37=1;
            }
            else if ( (LA37_0==KEYWORD_39) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:2: kw= KEYWORD_34
                    {
                    kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleBooleanLiteral5314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2387:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleBooleanLiteral5333); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2400:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2401:1: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2402:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5373);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral5384); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2409:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_32 ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2413:6: (kw= KEYWORD_32 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2415:2: kw= KEYWORD_32
            {
            kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleNullLiteral5421); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2428:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2429:1: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2430:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5460);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5471); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2437:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;

        AntlrDatatypeRuleToken this_NullLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2441:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2442:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2442:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt38=1;
                }
                break;
            case KEYWORD_39:
            case KEYWORD_34:
                {
                alt38=2;
                }
                break;
            case RULE_STRING:
                {
                alt38=3;
                }
                break;
            case KEYWORD_32:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2443:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral5518);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2455:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral5551);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2467:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral5584);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2479:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral5617);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2498:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2499:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier5662);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier5673); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2506:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2510:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2511:1: (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2511:1: (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2511:6: this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier5713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2518:1: (kw= KEYWORD_10 this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==KEYWORD_10) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2519:2: kw= KEYWORD_10 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier5732); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier5747); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2539:1: entryRuleCandidateClassName returns [String current=null] : iv_ruleCandidateClassName= ruleCandidateClassName EOF ;
    public final String entryRuleCandidateClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidateClassName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2540:1: (iv_ruleCandidateClassName= ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2541:2: iv_ruleCandidateClassName= ruleCandidateClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCandidateClassNameRule()); 
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName5794);
            iv_ruleCandidateClassName=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCandidateClassName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName5805); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2548:1: ruleCandidateClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleCandidateClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2554:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName5851);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2572:1: entryRuleClassOrInterfaceName returns [String current=null] : iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF ;
    public final String entryRuleClassOrInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrInterfaceName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2573:1: (iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2574:2: iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName5895);
            iv_ruleClassOrInterfaceName=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName5906); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2581:1: ruleClassOrInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleClassOrInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2585:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2587:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName5952);
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


    // $ANTLR start "ruleUnaryOperator"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2605:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2607:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2608:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2608:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            int alt40=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt40=1;
                }
                break;
            case KEYWORD_9:
                {
                alt40=2;
                }
                break;
            case KEYWORD_17:
                {
                alt40=3;
                }
                break;
            case KEYWORD_1:
                {
                alt40=4;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2608:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2608:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2608:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryOperator6013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2614:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2614:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2614:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryOperator6035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2620:6: (enumLiteral_2= KEYWORD_17 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2620:6: (enumLiteral_2= KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2620:11: enumLiteral_2= KEYWORD_17
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryOperator6057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2626:6: (enumLiteral_3= KEYWORD_1 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2626:6: (enumLiteral_3= KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2626:11: enumLiteral_3= KEYWORD_1
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleUnaryOperator6079); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2636:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_7) ) {
                alt41=1;
            }
            else if ( (LA41_0==KEYWORD_9) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditionOperator6129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2645:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2645:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2645:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditionOperator6151); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2655:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2657:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt42=1;
                }
                break;
            case KEYWORD_11:
                {
                alt42=2;
                }
                break;
            case KEYWORD_2:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator6201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2664:6: (enumLiteral_1= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2664:6: (enumLiteral_1= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2664:11: enumLiteral_1= KEYWORD_11
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator6223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2670:6: (enumLiteral_2= KEYWORD_2 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2670:6: (enumLiteral_2= KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2670:11: enumLiteral_2= KEYWORD_2
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator6245); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2680:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_52 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2682:28: ( ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_52 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2683:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_52 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2683:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_52 ) )
            int alt43=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt43=1;
                }
                break;
            case KEYWORD_15:
                {
                alt43=2;
                }
                break;
            case KEYWORD_20:
                {
                alt43=3;
                }
                break;
            case KEYWORD_22:
                {
                alt43=4;
                }
                break;
            case KEYWORD_21:
                {
                alt43=5;
                }
                break;
            case KEYWORD_18:
                {
                alt43=6;
                }
                break;
            case KEYWORD_52:
                {
                alt43=7;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2683:2: (enumLiteral_0= KEYWORD_14 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2683:2: (enumLiteral_0= KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2683:7: enumLiteral_0= KEYWORD_14
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator6295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2689:6: (enumLiteral_1= KEYWORD_15 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2689:6: (enumLiteral_1= KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2689:11: enumLiteral_1= KEYWORD_15
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator6317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2695:6: (enumLiteral_2= KEYWORD_20 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2695:6: (enumLiteral_2= KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2695:11: enumLiteral_2= KEYWORD_20
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComparisonOperator6339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2701:6: (enumLiteral_3= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2701:6: (enumLiteral_3= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2701:11: enumLiteral_3= KEYWORD_22
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleComparisonOperator6361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2707:6: (enumLiteral_4= KEYWORD_21 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2707:6: (enumLiteral_4= KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2707:11: enumLiteral_4= KEYWORD_21
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleComparisonOperator6383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2713:6: (enumLiteral_5= KEYWORD_18 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2713:6: (enumLiteral_5= KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2713:11: enumLiteral_5= KEYWORD_18
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleComparisonOperator6405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:6: (enumLiteral_6= KEYWORD_52 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:6: (enumLiteral_6= KEYWORD_52 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:11: enumLiteral_6= KEYWORD_52
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleComparisonOperator6427); if (state.failed) return current;
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
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSingleStringJDOQL129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSingleStringJDOQL150 = new BitSet(new long[]{0x000000000007C092L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSingleStringJDOQL171 = new BitSet(new long[]{0x000000000003C092L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_ruleSingleStringJDOQL193 = new BitSet(new long[]{0x000000000003C012L});
    public static final BitSet FOLLOW_ruleParametersClause_in_ruleSingleStringJDOQL215 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_ruleImportClause_in_ruleSingleStringJDOQL237 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSingleStringJDOQL259 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSingleStringJDOQL281 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_ruleSingleStringJDOQL303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleSelectClause399 = new BitSet(new long[]{0x0784A48038881102L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleSelectClause417 = new BitSet(new long[]{0x0784A48038880102L});
    public static final BitSet FOLLOW_ruleResultClause_in_ruleSelectClause450 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSelectClause472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleResultClause562 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause595 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause609 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause629 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleIntoClause714 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec829 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_ruleResultSpec849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleResultNaming933 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultNaming949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleFromClause1037 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleFromClause1057 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleFromClause1077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleFromClause1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleWhereClause1185 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleVariablesClause1288 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1308 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1322 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1342 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1450 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleParametersClause1648 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1668 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1682 = new BitSet(new long[]{0x0100000047302400L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1702 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration1810 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName1956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2105 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2119 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2139 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleImportDeclaration2241 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleGroupByClause2357 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleGroupByClause2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleOrderByClause2459 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleOrderByClause2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause2512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleRangeClause2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression2598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2658 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression2683 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression2703 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression2800 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression2825 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression2845 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression2942 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression2967 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression2987 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3084 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3109 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3129 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3226 = new BitSet(new long[]{0x0030000E80000042L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3259 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3280 = new BitSet(new long[]{0x0030000E80000042L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3377 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3410 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3431 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3528 = new BitSet(new long[]{0x0002110000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3561 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3582 = new BitSet(new long[]{0x0002110000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression3619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression3675 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression3732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression3792 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression3817 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression3837 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression3874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleParameterOrFieldOrMethodExpression3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4014 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleFieldOrMethodExpression4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression4285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthesesExpression4333 = new BitSet(new long[]{0x0784A48038080100L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression4357 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthesesExpression4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleType4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rulePrimitiveType4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_ruleNumericType4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_ruleNumericType4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType4800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleIntegralType4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleIntegralType4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleIntegralType4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleIntegralType4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleIntegralType4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType4965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleFloatingPointType5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleFloatingPointType5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral5073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleBooleanLiteral5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleBooleanLiteral5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleNullLiteral5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier5662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier5713 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier5732 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier5747 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName5794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName5895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryOperator6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryOperator6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryOperator6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleUnaryOperator6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditionOperator6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditionOperator6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComparisonOperator6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleComparisonOperator6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleComparisonOperator6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleComparisonOperator6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleComparisonOperator6427 = new BitSet(new long[]{0x0000000000000002L});

}