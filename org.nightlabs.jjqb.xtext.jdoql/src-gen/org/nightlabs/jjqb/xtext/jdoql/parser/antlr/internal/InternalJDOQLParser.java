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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_75", "KEYWORD_74", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=79;
    public static final int RULE_ANY_OTHER=85;
    public static final int KEYWORD_19=55;
    public static final int KEYWORD_56=20;
    public static final int KEYWORD_55=28;
    public static final int KEYWORD_54=27;
    public static final int KEYWORD_17=78;
    public static final int KEYWORD_53=26;
    public static final int KEYWORD_18=54;
    public static final int KEYWORD_52=25;
    public static final int KEYWORD_15=76;
    public static final int KEYWORD_51=24;
    public static final int KEYWORD_16=77;
    public static final int KEYWORD_50=33;
    public static final int KEYWORD_13=74;
    public static final int KEYWORD_14=75;
    public static final int KEYWORD_11=72;
    public static final int EOF=-1;
    public static final int KEYWORD_12=73;
    public static final int KEYWORD_10=71;
    public static final int KEYWORD_59=23;
    public static final int KEYWORD_58=22;
    public static final int KEYWORD_57=21;
    public static final int KEYWORD_6=67;
    public static final int KEYWORD_7=68;
    public static final int KEYWORD_8=69;
    public static final int KEYWORD_9=70;
    public static final int KEYWORD_28=53;
    public static final int KEYWORD_65=10;
    public static final int KEYWORD_64=9;
    public static final int KEYWORD_29=41;
    public static final int RULE_INT=80;
    public static final int KEYWORD_67=12;
    public static final int KEYWORD_66=11;
    public static final int KEYWORD_24=60;
    public static final int KEYWORD_61=17;
    public static final int KEYWORD_25=61;
    public static final int KEYWORD_60=16;
    public static final int KEYWORD_26=51;
    public static final int KEYWORD_63=19;
    public static final int KEYWORD_62=18;
    public static final int KEYWORD_27=52;
    public static final int KEYWORD_20=56;
    public static final int KEYWORD_21=57;
    public static final int KEYWORD_22=58;
    public static final int KEYWORD_23=59;
    public static final int KEYWORD_69=14;
    public static final int KEYWORD_68=13;
    public static final int KEYWORD_71=6;
    public static final int KEYWORD_72=7;
    public static final int KEYWORD_73=8;
    public static final int KEYWORD_74=5;
    public static final int KEYWORD_75=4;
    public static final int KEYWORD_30=42;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_34=46;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_33=45;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_70=15;
    public static final int KEYWORD_32=44;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_31=43;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_38=50;
    public static final int KEYWORD_37=49;
    public static final int RULE_SL_COMMENT=83;
    public static final int KEYWORD_36=48;
    public static final int KEYWORD_35=47;
    public static final int RULE_ML_COMMENT=82;
    public static final int KEYWORD_39=34;
    public static final int RULE_STRING=81;
    public static final int KEYWORD_41=36;
    public static final int KEYWORD_40=35;
    public static final int KEYWORD_43=38;
    public static final int KEYWORD_42=37;
    public static final int KEYWORD_45=40;
    public static final int KEYWORD_44=39;
    public static final int KEYWORD_47=30;
    public static final int RULE_WS=84;
    public static final int KEYWORD_46=29;
    public static final int KEYWORD_49=32;
    public static final int KEYWORD_48=31;

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

            if ( (LA1_0==KEYWORD_42) ) {
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

            if ( (LA2_0==KEYWORD_62) ) {
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

            if ( (LA3_0==KEYWORD_65) ) {
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

            if ( (LA4_0==KEYWORD_50) ) {
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

            if ( (LA5_0==KEYWORD_39) ) {
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

            if ( (LA6_0==KEYWORD_40) ) {
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

            if ( (LA7_0==KEYWORD_41) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:260:1: ruleSelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_47 ( (lv_isUnique_2_0= KEYWORD_48 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:263:28: ( ( () otherlv_1= KEYWORD_47 ( (lv_isUnique_2_0= KEYWORD_48 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_47 ( (lv_isUnique_2_0= KEYWORD_48 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_47 ( (lv_isUnique_2_0= KEYWORD_48 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: () otherlv_1= KEYWORD_47 ( (lv_isUnique_2_0= KEYWORD_48 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
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

            otherlv_1=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleSelectClause399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:278:1: ( (lv_isUnique_2_0= KEYWORD_48 ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_48) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_48 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:280:3: lv_isUnique_2_0= KEYWORD_48
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleSelectClause417); if (state.failed) return current;
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

            if ( ((LA9_0>=KEYWORD_75 && LA9_0<=KEYWORD_73)||(LA9_0>=KEYWORD_68 && LA9_0<=KEYWORD_70)||LA9_0==KEYWORD_61||(LA9_0>=KEYWORD_63 && LA9_0<=KEYWORD_59)||(LA9_0>=KEYWORD_53 && LA9_0<=KEYWORD_55)||LA9_0==KEYWORD_43||(LA9_0>=KEYWORD_35 && LA9_0<=KEYWORD_38)||LA9_0==KEYWORD_27||LA9_0==KEYWORD_1||LA9_0==KEYWORD_4||LA9_0==KEYWORD_7||LA9_0==KEYWORD_9||LA9_0==KEYWORD_12||(LA9_0>=KEYWORD_17 && LA9_0<=RULE_STRING)) ) {
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

            if ( (LA10_0==KEYWORD_31) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:347:1: ruleResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_56 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) ;
    public final EObject ruleResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        EObject lv_resultSpecs_1_0 = null;

        EObject lv_resultSpecs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:350:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_56 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_56 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_56 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_56 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_56 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_56) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_56 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_56 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:353:3: lv_isDistinct_0_0= KEYWORD_56
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleResultClause562); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:425:1: ruleIntoClause returns [EObject current=null] : (otherlv_0= KEYWORD_31 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) ;
    public final EObject ruleIntoClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_resultClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:428:28: ( (otherlv_0= KEYWORD_31 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_31 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_31 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:430:2: otherlv_0= KEYWORD_31 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleIntoClause714); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:564:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_30 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66 )? ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExcludeSubclasses_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_candidateClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:28: ( (otherlv_0= KEYWORD_30 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_30 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_30 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:569:2: otherlv_0= KEYWORD_30 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleFromClause1037); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:2: ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_51) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) ) otherlv_3= KEYWORD_66
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_51 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_51 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_51 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:593:3: lv_isExcludeSubclasses_2_0= KEYWORD_51
                    {
                    lv_isExcludeSubclasses_2_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleFromClause1077); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleFromClause1101); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:629:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_42 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:632:28: ( (otherlv_0= KEYWORD_42 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_42 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_42 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:634:2: otherlv_0= KEYWORD_42 ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleWhereClause1185); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:673:1: ruleVariablesClause returns [EObject current=null] : (otherlv_0= KEYWORD_62 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) ;
    public final EObject ruleVariablesClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:676:28: ( (otherlv_0= KEYWORD_62 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_62 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_62 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:678:2: otherlv_0= KEYWORD_62 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleVariablesClause1288); if (state.failed) return current;
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

                    if ( (LA15_1==KEYWORD_52||LA15_1==KEYWORD_49||(LA15_1>=KEYWORD_44 && LA15_1<=KEYWORD_45)||(LA15_1>=KEYWORD_32 && LA15_1<=KEYWORD_34)||LA15_1==KEYWORD_28||LA15_1==RULE_ID) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:831:1: ruleParametersClause returns [EObject current=null] : (otherlv_0= KEYWORD_65 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleParametersClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:834:28: ( (otherlv_0= KEYWORD_65 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_65 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_65 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:836:2: otherlv_0= KEYWORD_65 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleParametersClause1648); if (state.failed) return current;
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

                    if ( (LA17_1==KEYWORD_52||LA17_1==KEYWORD_49||(LA17_1>=KEYWORD_44 && LA17_1<=KEYWORD_45)||(LA17_1>=KEYWORD_32 && LA17_1<=KEYWORD_34)||LA17_1==KEYWORD_28||LA17_1==RULE_ID) ) {
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

                    if ( (LA19_1==KEYWORD_50) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1089:1: ruleImportDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleImportDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1093:6: ( (kw= KEYWORD_50 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_50 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_50 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1095:2: kw= KEYWORD_50 this_QualifiedIdentifier_1= ruleQualifiedIdentifier
            {
            kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleImportDeclaration2253); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1128:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_39 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1131:28: ( (otherlv_0= KEYWORD_39 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_39 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_39 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1133:2: otherlv_0= KEYWORD_39 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleGroupByClause2367); if (state.failed) return current;
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

                    if ( ((LA21_1>=KEYWORD_75 && LA21_1<=KEYWORD_73)||(LA21_1>=KEYWORD_68 && LA21_1<=KEYWORD_70)||LA21_1==KEYWORD_61||LA21_1==KEYWORD_63||(LA21_1>=KEYWORD_57 && LA21_1<=KEYWORD_59)||(LA21_1>=KEYWORD_53 && LA21_1<=KEYWORD_55)||LA21_1==KEYWORD_43||(LA21_1>=KEYWORD_35 && LA21_1<=KEYWORD_38)||LA21_1==KEYWORD_27||LA21_1==KEYWORD_1||LA21_1==KEYWORD_4||LA21_1==KEYWORD_7||LA21_1==KEYWORD_9||LA21_1==KEYWORD_12||(LA21_1>=KEYWORD_17 && LA21_1<=RULE_STRING)) ) {
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

            if ( (LA23_0==KEYWORD_46) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1223:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_46 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1226:28: ( (otherlv_0= KEYWORD_46 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_46 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_46 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1228:2: otherlv_0= KEYWORD_46 ( (lv_having_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleHavingClause2555); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1267:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_40 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1270:28: ( (otherlv_0= KEYWORD_40 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_40 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_40 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1272:2: otherlv_0= KEYWORD_40 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleOrderByClause2658); if (state.failed) return current;
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

                    if ( ((LA24_1>=KEYWORD_75 && LA24_1<=KEYWORD_73)||(LA24_1>=KEYWORD_68 && LA24_1<=KEYWORD_70)||LA24_1==KEYWORD_61||LA24_1==KEYWORD_63||(LA24_1>=KEYWORD_57 && LA24_1<=KEYWORD_59)||(LA24_1>=KEYWORD_53 && LA24_1<=KEYWORD_55)||LA24_1==KEYWORD_43||(LA24_1>=KEYWORD_35 && LA24_1<=KEYWORD_38)||LA24_1==KEYWORD_27||LA24_1==KEYWORD_1||LA24_1==KEYWORD_4||LA24_1==KEYWORD_7||LA24_1==KEYWORD_9||LA24_1==KEYWORD_12||(LA24_1>=KEYWORD_17 && LA24_1<=RULE_STRING)) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1395:1: ruleRangeClause returns [EObject current=null] : (otherlv_0= KEYWORD_41 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleRangeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1398:28: ( (otherlv_0= KEYWORD_41 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_41 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_41 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1400:2: otherlv_0= KEYWORD_41 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleRangeClause2939); if (state.failed) return current;
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

                if ( (LA30_0==KEYWORD_67||LA30_0==KEYWORD_18||(LA30_0>=KEYWORD_20 && LA30_0<=KEYWORD_22)||(LA30_0>=KEYWORD_14 && LA30_0<=KEYWORD_15)) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2013:1: ruleFieldAccessExpression returns [EObject current=null] : (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) ) ;
    public final EObject ruleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StaticMethodExpression_0 = null;

        EObject this_ParameterOrFieldOrMethodExpression_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2016:28: ( (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2017:1: (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2017:1: (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_75||(LA35_0>=KEYWORD_68 && LA35_0<=KEYWORD_69)||LA35_0==KEYWORD_61||LA35_0==KEYWORD_57) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=KEYWORD_74 && LA35_0<=KEYWORD_73)||LA35_0==KEYWORD_70||LA35_0==KEYWORD_63||(LA35_0>=KEYWORD_58 && LA35_0<=KEYWORD_59)||(LA35_0>=KEYWORD_53 && LA35_0<=KEYWORD_55)||LA35_0==KEYWORD_43||(LA35_0>=KEYWORD_35 && LA35_0<=KEYWORD_38)||LA35_0==KEYWORD_27||LA35_0==KEYWORD_4||LA35_0==KEYWORD_12||(LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2018:2: this_StaticMethodExpression_0= ruleStaticMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getStaticMethodExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression4221);
                    this_StaticMethodExpression_0=ruleStaticMethodExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StaticMethodExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2030:6: (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2030:6: (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2031:2: this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4252);
                    this_ParameterOrFieldOrMethodExpression_1=ruleParameterOrFieldOrMethodExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParameterOrFieldOrMethodExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2042:1: ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==KEYWORD_10) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2042:2: () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2042:2: ()
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2043:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getFieldAccessExpressionAccess().getFieldAccessExpressionLeftAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4277); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2056:1: ( (lv_right_4_0= ruleFieldOrMethodExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2057:1: (lv_right_4_0= ruleFieldOrMethodExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2057:1: (lv_right_4_0= ruleFieldOrMethodExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2058:3: lv_right_4_0= ruleFieldOrMethodExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4297);
                    	    lv_right_4_0=ruleFieldOrMethodExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFieldAccessExpressionRule());
                    	      	        }
                    	             		set(
                    	             			current, 
                    	             			"right",
                    	              		lv_right_4_0, 
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
    // $ANTLR end "ruleFieldAccessExpression"


    // $ANTLR start "entryRuleParameterOrFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2082:1: entryRuleParameterOrFieldOrMethodExpression returns [EObject current=null] : iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF ;
    public final EObject entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOrFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2083:2: (iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2084:2: iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4335);
            iv_ruleParameterOrFieldOrMethodExpression=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterOrFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4345); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2091:1: ruleParameterOrFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) ) ;
    public final EObject ruleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        AntlrDatatypeRuleToken lv_parameterName_4_0 = null;

        EObject this_ParenthesesExpression_5 = null;

        EObject lv_method_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2094:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2095:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2095:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) )
            int alt36=6;
            switch ( input.LA(1) ) {
            case KEYWORD_43:
            case KEYWORD_35:
            case KEYWORD_38:
            case RULE_INT:
            case RULE_STRING:
                {
                alt36=1;
                }
                break;
            case KEYWORD_37:
                {
                alt36=2;
                }
                break;
            case RULE_ID:
                {
                alt36=3;
                }
                break;
            case KEYWORD_12:
                {
                alt36=4;
                }
                break;
            case KEYWORD_4:
                {
                alt36=5;
                }
                break;
            case KEYWORD_74:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_70:
            case KEYWORD_63:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_36:
            case KEYWORD_27:
                {
                alt36=6;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2095:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2095:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2096:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2096:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2097:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4391);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2114:6: ( (lv_this_1_0= KEYWORD_37 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2114:6: ( (lv_this_1_0= KEYWORD_37 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2115:1: (lv_this_1_0= KEYWORD_37 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2115:1: (lv_this_1_0= KEYWORD_37 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2116:3: lv_this_1_0= KEYWORD_37
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleParameterOrFieldOrMethodExpression4416); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2131:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2131:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2132:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2132:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2133:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4450); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2150:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2150:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2151:2: otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2155:1: ( (lv_parameterName_4_0= ruleParameterName ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2156:1: (lv_parameterName_4_0= ruleParameterName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2156:1: (lv_parameterName_4_0= ruleParameterName )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2157:3: lv_parameterName_4_0= ruleParameterName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4495);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2175:2: this_ParenthesesExpression_5= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4527);
                    this_ParenthesesExpression_5=ruleParenthesesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthesesExpression_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2187:6: ( (lv_method_6_0= ruleMethodExpression ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2187:6: ( (lv_method_6_0= ruleMethodExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2188:1: (lv_method_6_0= ruleMethodExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2188:1: (lv_method_6_0= ruleMethodExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2189:3: lv_method_6_0= ruleMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getMethodMethodExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodExpression_in_ruleParameterOrFieldOrMethodExpression4553);
                    lv_method_6_0=ruleMethodExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterOrFieldOrMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"method",
                              		lv_method_6_0, 
                              		"MethodExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleParameterOrFieldOrMethodExpression"


    // $ANTLR start "entryRuleFieldOrMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2213:1: entryRuleFieldOrMethodExpression returns [EObject current=null] : iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF ;
    public final EObject entryRuleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2214:2: (iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2215:2: iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4588);
            iv_ruleFieldOrMethodExpression=ruleFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4598); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2222:1: ruleFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) ) ;
    public final EObject ruleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ParenthesesExpression_3 = null;

        EObject lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2225:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2226:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2226:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_37 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case KEYWORD_43:
            case KEYWORD_35:
            case KEYWORD_38:
            case RULE_INT:
            case RULE_STRING:
                {
                alt37=1;
                }
                break;
            case KEYWORD_37:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
                {
                alt37=3;
                }
                break;
            case KEYWORD_4:
                {
                alt37=4;
                }
                break;
            case KEYWORD_74:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_73:
            case KEYWORD_70:
            case KEYWORD_63:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_36:
            case KEYWORD_27:
                {
                alt37=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2226:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2226:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2227:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2227:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2228:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4644);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2245:6: ( (lv_this_1_0= KEYWORD_37 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2245:6: ( (lv_this_1_0= KEYWORD_37 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2246:1: (lv_this_1_0= KEYWORD_37 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2246:1: (lv_this_1_0= KEYWORD_37 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2247:3: lv_this_1_0= KEYWORD_37
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleFieldOrMethodExpression4669); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2262:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2262:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2263:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2263:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2264:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4703); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2282:2: this_ParenthesesExpression_3= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4739);
                    this_ParenthesesExpression_3=ruleParenthesesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthesesExpression_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2294:6: ( (lv_method_4_0= ruleMethodExpression ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2294:6: ( (lv_method_4_0= ruleMethodExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2295:1: (lv_method_4_0= ruleMethodExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2295:1: (lv_method_4_0= ruleMethodExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2296:3: lv_method_4_0= ruleMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getMethodMethodExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodExpression_in_ruleFieldOrMethodExpression4765);
                    lv_method_4_0=ruleMethodExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldOrMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"method",
                              		lv_method_4_0, 
                              		"MethodExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleFieldOrMethodExpression"


    // $ANTLR start "entryRuleStaticMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2320:1: entryRuleStaticMethodExpression returns [EObject current=null] : iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF ;
    public final EObject entryRuleStaticMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2321:2: (iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2322:2: iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodExpression_in_entryRuleStaticMethodExpression4800);
            iv_ruleStaticMethodExpression=ruleStaticMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodExpression4810); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticMethodExpression"


    // $ANTLR start "ruleStaticMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2329:1: ruleStaticMethodExpression returns [EObject current=null] : ( ( () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5 ) | ( () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5 ) | ( () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) ) ;
    public final EObject ruleStaticMethodExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_numeric_4_0 = null;

        EObject lv_numeric_10_0 = null;

        EObject lv_persistable_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2332:28: ( ( ( () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5 ) | ( () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5 ) | ( () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2333:1: ( ( () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5 ) | ( () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5 ) | ( () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2333:1: ( ( () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5 ) | ( () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5 ) | ( () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case KEYWORD_68:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==KEYWORD_57) ) {
                    alt41=1;
                }
                else if ( (LA41_1==KEYWORD_61) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_57:
                {
                alt41=1;
                }
                break;
            case KEYWORD_61:
                {
                alt41=2;
                }
                break;
            case KEYWORD_75:
            case KEYWORD_69:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2333:2: ( () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2333:2: ( () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2333:3: () (otherlv_1= KEYWORD_68 )? otherlv_2= KEYWORD_57 otherlv_3= KEYWORD_4 ( (lv_numeric_4_0= ruleConditionalOrExpression ) ) otherlv_5= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2333:3: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2334:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2342:2: (otherlv_1= KEYWORD_68 )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==KEYWORD_68) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2343:2: otherlv_1= KEYWORD_68
                            {
                            otherlv_1=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleStaticMethodExpression4862); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getStaticMethodExpressionAccess().getJavaLangKeyword_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleStaticMethodExpression4876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStaticMethodExpressionAccess().getMathAbsKeyword_0_2());
                          
                    }
                    otherlv_3=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_0_3());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2357:1: ( (lv_numeric_4_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2358:1: (lv_numeric_4_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2358:1: (lv_numeric_4_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2359:3: lv_numeric_4_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumericConditionalOrExpressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression4908);
                    lv_numeric_4_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_4_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression4921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_0_5());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2381:6: ( () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2381:6: ( () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2381:7: () (otherlv_7= KEYWORD_68 )? otherlv_8= KEYWORD_61 otherlv_9= KEYWORD_4 ( (lv_numeric_10_0= ruleConditionalOrExpression ) ) otherlv_11= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2381:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2382:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2390:2: (otherlv_7= KEYWORD_68 )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==KEYWORD_68) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2391:2: otherlv_7= KEYWORD_68
                            {
                            otherlv_7=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleStaticMethodExpression4954); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getStaticMethodExpressionAccess().getJavaLangKeyword_1_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleStaticMethodExpression4968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStaticMethodExpressionAccess().getMathSqrtKeyword_1_2());
                          
                    }
                    otherlv_9=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2405:1: ( (lv_numeric_10_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2406:1: (lv_numeric_10_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2406:1: (lv_numeric_10_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2407:3: lv_numeric_10_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumericConditionalOrExpressionParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5000);
                    lv_numeric_10_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_10_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_1_5());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2429:6: ( () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2429:6: ( () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2429:7: () (otherlv_13= KEYWORD_69 )? otherlv_14= KEYWORD_75 otherlv_15= KEYWORD_4 ( (lv_persistable_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2429:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2430:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2438:2: (otherlv_13= KEYWORD_69 )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==KEYWORD_69) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2439:2: otherlv_13= KEYWORD_69
                            {
                            otherlv_13=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleStaticMethodExpression5046); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getStaticMethodExpressionAccess().getJavaxJdoKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleStaticMethodExpression5060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStaticMethodExpressionAccess().getJDOHelperGetObjectIdKeyword_2_2());
                          
                    }
                    otherlv_15=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_2_3());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2453:1: ( (lv_persistable_16_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2454:1: (lv_persistable_16_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2454:1: (lv_persistable_16_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2455:3: lv_persistable_16_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_2_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5092);
                    lv_persistable_16_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_16_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_2_5());
                          
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
    // $ANTLR end "ruleStaticMethodExpression"


    // $ANTLR start "entryRuleMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2484:1: entryRuleMethodExpression returns [EObject current=null] : iv_ruleMethodExpression= ruleMethodExpression EOF ;
    public final EObject entryRuleMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2485:2: (iv_ruleMethodExpression= ruleMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2486:2: iv_ruleMethodExpression= ruleMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression5140);
            iv_ruleMethodExpression=ruleMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodExpression5150); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodExpression"


    // $ANTLR start "ruleMethodExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2493:1: ruleMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) ) ;
    public final EObject ruleMethodExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        EObject lv_element_3_0 = null;

        EObject lv_arg_16_0 = null;

        EObject lv_key_21_0 = null;

        EObject lv_value_26_0 = null;

        EObject lv_string_31_0 = null;

        EObject lv_string_36_0 = null;

        EObject lv_regex_41_0 = null;

        EObject lv_string_54_0 = null;

        EObject lv_fromIndex_56_0 = null;

        EObject lv_beginIndex_61_0 = null;

        EObject lv_endIndex_63_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2496:28: ( ( ( () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:1: ( ( () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:1: ( ( () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) )
            int alt44=13;
            switch ( input.LA(1) ) {
            case KEYWORD_58:
                {
                alt44=1;
                }
                break;
            case KEYWORD_54:
                {
                alt44=2;
                }
                break;
            case KEYWORD_36:
                {
                alt44=3;
                }
                break;
            case KEYWORD_27:
                {
                alt44=4;
                }
                break;
            case KEYWORD_71:
                {
                alt44=5;
                }
                break;
            case KEYWORD_74:
                {
                alt44=6;
                }
                break;
            case KEYWORD_70:
                {
                alt44=7;
                }
                break;
            case KEYWORD_59:
                {
                alt44=8;
                }
                break;
            case KEYWORD_55:
                {
                alt44=9;
                }
                break;
            case KEYWORD_72:
                {
                alt44=10;
                }
                break;
            case KEYWORD_73:
                {
                alt44=11;
                }
                break;
            case KEYWORD_53:
                {
                alt44=12;
                }
                break;
            case KEYWORD_63:
                {
                alt44=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:2: ( () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:2: ( () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:3: () otherlv_1= KEYWORD_58 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:3: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2498:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleMethodExpression5201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMethodExpressionAccess().getContainsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2516:1: ( (lv_element_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2517:1: (lv_element_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2517:1: (lv_element_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2518:3: lv_element_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getElementConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5233);
                    lv_element_3_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"element",
                              		lv_element_3_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2540:6: ( () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2540:6: ( () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2540:7: () otherlv_6= KEYWORD_54 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2540:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2541:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleMethodExpression5278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodExpressionAccess().getIsEmptyKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    otherlv_8=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2565:6: ( () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2565:6: ( () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2565:7: () otherlv_10= KEYWORD_36 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2565:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2566:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_10=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleMethodExpression5334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMethodExpressionAccess().getSizeKeyword_2_1());
                          
                    }
                    otherlv_11=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2590:6: ( () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2590:6: ( () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2590:7: () otherlv_14= KEYWORD_27 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2590:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2591:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleMethodExpression5390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getMethodExpressionAccess().getGetKeyword_3_1());
                          
                    }
                    otherlv_15=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2609:1: ( (lv_arg_16_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2610:1: (lv_arg_16_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2610:1: (lv_arg_16_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2611:3: lv_arg_16_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getArgConditionalOrExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5422);
                    lv_arg_16_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"arg",
                              		lv_arg_16_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2633:6: ( () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2633:6: ( () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2633:7: () otherlv_19= KEYWORD_71 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2633:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2634:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_19=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleMethodExpression5467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getMethodExpressionAccess().getContainsKeyKeyword_4_1());
                          
                    }
                    otherlv_20=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2652:1: ( (lv_key_21_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2653:1: (lv_key_21_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2653:1: (lv_key_21_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2654:3: lv_key_21_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getKeyConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5499);
                    lv_key_21_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_21_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5512); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2676:6: ( () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2676:6: ( () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2676:7: () otherlv_24= KEYWORD_74 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2676:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2677:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_24=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleMethodExpression5544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getMethodExpressionAccess().getContainsValueKeyword_5_1());
                          
                    }
                    otherlv_25=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2695:1: ( (lv_value_26_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2696:1: (lv_value_26_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2696:1: (lv_value_26_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2697:3: lv_value_26_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getValueConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5576);
                    lv_value_26_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_26_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_27=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:6: ( () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:6: ( () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:7: () otherlv_29= KEYWORD_70 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2719:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2720:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_29=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleMethodExpression5621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getMethodExpressionAccess().getStartsWithKeyword_6_1());
                          
                    }
                    otherlv_30=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2738:1: ( (lv_string_31_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2739:1: (lv_string_31_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2739:1: (lv_string_31_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2740:3: lv_string_31_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5653);
                    lv_string_31_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_31_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_6_4());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2762:6: ( () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2762:6: ( () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2762:7: () otherlv_34= KEYWORD_59 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2762:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2763:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_34=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleMethodExpression5698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getMethodExpressionAccess().getEndsWithKeyword_7_1());
                          
                    }
                    otherlv_35=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2781:1: ( (lv_string_36_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2782:1: (lv_string_36_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2782:1: (lv_string_36_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2783:3: lv_string_36_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5730);
                    lv_string_36_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_36_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2805:6: ( () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2805:6: ( () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2805:7: () otherlv_39= KEYWORD_55 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2805:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2806:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_39=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleMethodExpression5775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getMethodExpressionAccess().getMatchesKeyword_8_1());
                          
                    }
                    otherlv_40=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2824:1: ( (lv_regex_41_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2825:1: (lv_regex_41_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2825:1: (lv_regex_41_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2826:3: lv_regex_41_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getRegexConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5807);
                    lv_regex_41_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"regex",
                              		lv_regex_41_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_42=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:6: ( () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:6: ( () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:7: () otherlv_44= KEYWORD_72 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2848:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2849:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_44=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleMethodExpression5852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getMethodExpressionAccess().getToLowerCaseKeyword_9_1());
                          
                    }
                    otherlv_45=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    otherlv_46=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_9_3());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:6: ( () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:6: ( () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:7: () otherlv_48= KEYWORD_73 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2874:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_48=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleMethodExpression5908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getMethodExpressionAccess().getToUpperCaseKeyword_10_1());
                          
                    }
                    otherlv_49=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    otherlv_50=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_50, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_10_3());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:6: ( () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:6: ( () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:7: () otherlv_52= KEYWORD_53 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2898:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2899:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_52=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleMethodExpression5964); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getMethodExpressionAccess().getIndexOfKeyword_11_1());
                          
                    }
                    otherlv_53=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_53, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_11_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:1: ( (lv_string_54_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2918:1: (lv_string_54_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2918:1: (lv_string_54_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2919:3: lv_string_54_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5996);
                    lv_string_54_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_54_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2935:2: (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==KEYWORD_8) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2936:2: otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_55=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression6010); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_55, grammarAccess.getMethodExpressionAccess().getCommaKeyword_11_4_0());
                                  
                            }
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2940:1: ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2941:1: (lv_fromIndex_56_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2941:1: (lv_fromIndex_56_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:3: lv_fromIndex_56_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getFromIndexConditionalOrExpressionParserRuleCall_11_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6030);
                            lv_fromIndex_56_0=ruleConditionalOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"fromIndex",
                                      		lv_fromIndex_56_0, 
                                      		"ConditionalOrExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_57=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_11_5());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:6: ( () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:6: ( () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:7: () otherlv_59= KEYWORD_63 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2965:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_12_0(),
                                  current);
                          
                    }

                    }

                    otherlv_59=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleMethodExpression6077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_59, grammarAccess.getMethodExpressionAccess().getSubstringKeyword_12_1());
                          
                    }
                    otherlv_60=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_60, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_12_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2983:1: ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2984:1: (lv_beginIndex_61_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2984:1: (lv_beginIndex_61_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2985:3: lv_beginIndex_61_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getBeginIndexConditionalOrExpressionParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6109);
                    lv_beginIndex_61_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"beginIndex",
                              		lv_beginIndex_61_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3001:2: (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==KEYWORD_8) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3002:2: otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_62=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression6123); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_62, grammarAccess.getMethodExpressionAccess().getCommaKeyword_12_4_0());
                                  
                            }
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3006:1: ( (lv_endIndex_63_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3007:1: (lv_endIndex_63_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3007:1: (lv_endIndex_63_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3008:3: lv_endIndex_63_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getEndIndexConditionalOrExpressionParserRuleCall_12_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6143);
                            lv_endIndex_63_0=ruleConditionalOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"endIndex",
                                      		lv_endIndex_63_0, 
                                      		"ConditionalOrExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_64=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_64, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_12_5());
                          
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
    // $ANTLR end "ruleMethodExpression"


    // $ANTLR start "entryRuleParenthesesExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3037:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3038:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3039:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6193);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression6203); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3046:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConditionalOrExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3049:28: ( (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3050:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3050:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3051:2: otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthesesExpression6241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression6265);
            this_ConditionalOrExpression_1=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthesesExpression6277); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3082:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3083:1: (iv_ruleType= ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3084:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType6314);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType6325); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3091:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_ClassOrInterfaceName_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3095:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3096:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3096:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_52||LA45_0==KEYWORD_49||(LA45_0>=KEYWORD_44 && LA45_0<=KEYWORD_45)||(LA45_0>=KEYWORD_32 && LA45_0<=KEYWORD_34)||LA45_0==KEYWORD_28) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3097:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType6372);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3109:5: this_ClassOrInterfaceName_1= ruleClassOrInterfaceName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleType6405);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3127:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3128:1: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3129:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType6450);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType6461); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3136:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericType_0= ruleNumericType | kw= KEYWORD_52 ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NumericType_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3140:6: ( (this_NumericType_0= ruleNumericType | kw= KEYWORD_52 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3141:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_52 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3141:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_52 )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_49||(LA46_0>=KEYWORD_44 && LA46_0<=KEYWORD_45)||(LA46_0>=KEYWORD_32 && LA46_0<=KEYWORD_34)||LA46_0==KEYWORD_28) ) {
                alt46=1;
            }
            else if ( (LA46_0==KEYWORD_52) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3142:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType6508);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3154:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rulePrimitiveType6532); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3167:1: entryRuleNumericType returns [String current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final String entryRuleNumericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3168:1: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3169:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType6572);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType6583); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3176:1: ruleNumericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) ;
    public final AntlrDatatypeRuleToken ruleNumericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegralType_0 = null;

        AntlrDatatypeRuleToken this_FloatingPointType_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3180:6: ( (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3181:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3181:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_45||(LA47_0>=KEYWORD_32 && LA47_0<=KEYWORD_34)||LA47_0==KEYWORD_28) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_49||LA47_0==KEYWORD_44) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3182:5: this_IntegralType_0= ruleIntegralType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegralType_in_ruleNumericType6630);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3194:5: this_FloatingPointType_1= ruleFloatingPointType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatingPointType_in_ruleNumericType6663);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3212:1: entryRuleIntegralType returns [String current=null] : iv_ruleIntegralType= ruleIntegralType EOF ;
    public final String entryRuleIntegralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegralType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3213:1: (iv_ruleIntegralType= ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3214:2: iv_ruleIntegralType= ruleIntegralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegralTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType6708);
            iv_ruleIntegralType=ruleIntegralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegralType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType6719); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3221:1: ruleIntegralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_32 | kw= KEYWORD_45 | kw= KEYWORD_28 | kw= KEYWORD_34 | kw= KEYWORD_33 ) ;
    public final AntlrDatatypeRuleToken ruleIntegralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3225:6: ( (kw= KEYWORD_32 | kw= KEYWORD_45 | kw= KEYWORD_28 | kw= KEYWORD_34 | kw= KEYWORD_33 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3226:1: (kw= KEYWORD_32 | kw= KEYWORD_45 | kw= KEYWORD_28 | kw= KEYWORD_34 | kw= KEYWORD_33 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3226:1: (kw= KEYWORD_32 | kw= KEYWORD_45 | kw= KEYWORD_28 | kw= KEYWORD_34 | kw= KEYWORD_33 )
            int alt48=5;
            switch ( input.LA(1) ) {
            case KEYWORD_32:
                {
                alt48=1;
                }
                break;
            case KEYWORD_45:
                {
                alt48=2;
                }
                break;
            case KEYWORD_28:
                {
                alt48=3;
                }
                break;
            case KEYWORD_34:
                {
                alt48=4;
                }
                break;
            case KEYWORD_33:
                {
                alt48=5;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3227:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleIntegralType6757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3234:2: kw= KEYWORD_45
                    {
                    kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleIntegralType6776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3241:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleIntegralType6795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3248:2: kw= KEYWORD_34
                    {
                    kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleIntegralType6814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3255:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleIntegralType6833); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3268:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3269:1: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3270:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType6873);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType6884); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3277:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_44 | kw= KEYWORD_49 ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3281:6: ( (kw= KEYWORD_44 | kw= KEYWORD_49 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3282:1: (kw= KEYWORD_44 | kw= KEYWORD_49 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3282:1: (kw= KEYWORD_44 | kw= KEYWORD_49 )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_44) ) {
                alt49=1;
            }
            else if ( (LA49_0==KEYWORD_49) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3283:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleFloatingPointType6922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3290:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleFloatingPointType6941); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3303:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3304:1: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3305:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral6981);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral6992); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3312:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3316:6: (this_INT_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3317:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral7031); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3332:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3333:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3334:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7075);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7086); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3341:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3345:6: (this_STRING_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3346:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7125); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3361:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3362:1: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3363:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7169);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral7180); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3370:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_38 | kw= KEYWORD_43 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3374:6: ( (kw= KEYWORD_38 | kw= KEYWORD_43 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3375:1: (kw= KEYWORD_38 | kw= KEYWORD_43 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3375:1: (kw= KEYWORD_38 | kw= KEYWORD_43 )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_38) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEYWORD_43) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3376:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleBooleanLiteral7218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3383:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanLiteral7237); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3396:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3397:1: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3398:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7277);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral7288); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3405:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_35 ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3409:6: (kw= KEYWORD_35 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3411:2: kw= KEYWORD_35
            {
            kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleNullLiteral7325); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3424:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3425:1: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3426:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral7364);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral7375); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3433:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;

        AntlrDatatypeRuleToken this_NullLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3437:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3438:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3438:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            int alt51=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt51=1;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_38:
                {
                alt51=2;
                }
                break;
            case RULE_STRING:
                {
                alt51=3;
                }
                break;
            case KEYWORD_35:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3439:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral7422);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3451:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral7455);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3463:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral7488);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3475:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral7521);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3493:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3494:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3495:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier7566);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier7577); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3502:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3506:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3507:1: (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3507:1: (this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3507:6: this_ID_0= RULE_ID (kw= KEYWORD_10 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier7617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3514:1: (kw= KEYWORD_10 this_ID_2= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==KEYWORD_10) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3515:2: kw= KEYWORD_10 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier7636); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier7651); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3535:1: entryRuleCandidateClassName returns [String current=null] : iv_ruleCandidateClassName= ruleCandidateClassName EOF ;
    public final String entryRuleCandidateClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidateClassName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3536:1: (iv_ruleCandidateClassName= ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3537:2: iv_ruleCandidateClassName= ruleCandidateClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCandidateClassNameRule()); 
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName7698);
            iv_ruleCandidateClassName=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCandidateClassName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName7709); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3544:1: ruleCandidateClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleCandidateClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3548:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3550:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName7755);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3568:1: entryRuleClassOrInterfaceName returns [String current=null] : iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF ;
    public final String entryRuleClassOrInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrInterfaceName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3569:1: (iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3570:2: iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName7799);
            iv_ruleClassOrInterfaceName=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName7810); if (state.failed) return current;

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3577:1: ruleClassOrInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleClassOrInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3581:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3583:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName7856);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3601:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_60 ) | (enumLiteral_2= KEYWORD_29 ) | (enumLiteral_3= KEYWORD_64 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3603:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_60 ) | (enumLiteral_2= KEYWORD_29 ) | (enumLiteral_3= KEYWORD_64 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_60 ) | (enumLiteral_2= KEYWORD_29 ) | (enumLiteral_3= KEYWORD_64 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_60 ) | (enumLiteral_2= KEYWORD_29 ) | (enumLiteral_3= KEYWORD_64 ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt53=1;
                }
                break;
            case KEYWORD_60:
                {
                alt53=2;
                }
                break;
            case KEYWORD_29:
                {
                alt53=3;
                }
                break;
            case KEYWORD_64:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:2: (enumLiteral_0= KEYWORD_26 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderByDirection7917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3610:6: (enumLiteral_1= KEYWORD_60 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3610:6: (enumLiteral_1= KEYWORD_60 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3610:11: enumLiteral_1= KEYWORD_60
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleOrderByDirection7939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3616:6: (enumLiteral_2= KEYWORD_29 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3616:6: (enumLiteral_2= KEYWORD_29 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3616:11: enumLiteral_2= KEYWORD_29
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleOrderByDirection7961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3622:6: (enumLiteral_3= KEYWORD_64 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3622:6: (enumLiteral_3= KEYWORD_64 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3622:11: enumLiteral_3= KEYWORD_64
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleOrderByDirection7983); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3632:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3634:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            int alt54=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt54=1;
                }
                break;
            case KEYWORD_9:
                {
                alt54=2;
                }
                break;
            case KEYWORD_17:
                {
                alt54=3;
                }
                break;
            case KEYWORD_1:
                {
                alt54=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryOperator8033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3641:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3641:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3641:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryOperator8055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3647:6: (enumLiteral_2= KEYWORD_17 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3647:6: (enumLiteral_2= KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3647:11: enumLiteral_2= KEYWORD_17
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryOperator8077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3653:6: (enumLiteral_3= KEYWORD_1 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3653:6: (enumLiteral_3= KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3653:11: enumLiteral_3= KEYWORD_1
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleUnaryOperator8099); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3663:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3665:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3666:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3666:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KEYWORD_7) ) {
                alt55=1;
            }
            else if ( (LA55_0==KEYWORD_9) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3666:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3666:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3666:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditionOperator8149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3672:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3672:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3672:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditionOperator8171); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3682:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3684:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3685:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3685:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt56=1;
                }
                break;
            case KEYWORD_11:
                {
                alt56=2;
                }
                break;
            case KEYWORD_2:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3685:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3685:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3685:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator8221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3691:6: (enumLiteral_1= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3691:6: (enumLiteral_1= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3691:11: enumLiteral_1= KEYWORD_11
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator8243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3697:6: (enumLiteral_2= KEYWORD_2 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3697:6: (enumLiteral_2= KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3697:11: enumLiteral_2= KEYWORD_2
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator8265); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3707:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_67 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3709:28: ( ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_67 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3710:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_67 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3710:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_67 ) )
            int alt57=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt57=1;
                }
                break;
            case KEYWORD_15:
                {
                alt57=2;
                }
                break;
            case KEYWORD_20:
                {
                alt57=3;
                }
                break;
            case KEYWORD_22:
                {
                alt57=4;
                }
                break;
            case KEYWORD_21:
                {
                alt57=5;
                }
                break;
            case KEYWORD_18:
                {
                alt57=6;
                }
                break;
            case KEYWORD_67:
                {
                alt57=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3710:2: (enumLiteral_0= KEYWORD_14 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3710:2: (enumLiteral_0= KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3710:7: enumLiteral_0= KEYWORD_14
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator8315); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3716:6: (enumLiteral_1= KEYWORD_15 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3716:6: (enumLiteral_1= KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3716:11: enumLiteral_1= KEYWORD_15
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator8337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3722:6: (enumLiteral_2= KEYWORD_20 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3722:6: (enumLiteral_2= KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3722:11: enumLiteral_2= KEYWORD_20
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComparisonOperator8359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3728:6: (enumLiteral_3= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3728:6: (enumLiteral_3= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3728:11: enumLiteral_3= KEYWORD_22
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleComparisonOperator8381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3734:6: (enumLiteral_4= KEYWORD_21 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3734:6: (enumLiteral_4= KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3734:11: enumLiteral_4= KEYWORD_21
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleComparisonOperator8403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3740:6: (enumLiteral_5= KEYWORD_18 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3740:6: (enumLiteral_5= KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3740:11: enumLiteral_5= KEYWORD_18
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleComparisonOperator8425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3746:6: (enumLiteral_6= KEYWORD_67 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3746:6: (enumLiteral_6= KEYWORD_67 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3746:11: enumLiteral_6= KEYWORD_67
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleComparisonOperator8447); if (state.failed) return current;
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
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSingleStringJDOQL129 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSingleStringJDOQL150 = new BitSet(new long[]{0x0000003E00040402L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSingleStringJDOQL171 = new BitSet(new long[]{0x0000001E00040402L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_ruleSingleStringJDOQL193 = new BitSet(new long[]{0x0000001E00000402L});
    public static final BitSet FOLLOW_ruleParametersClause_in_ruleSingleStringJDOQL215 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_ruleSingleStringJDOQL237 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSingleStringJDOQL259 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSingleStringJDOQL281 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_ruleSingleStringJDOQL303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleSelectClause399 = new BitSet(new long[]{0x401788409CFAE1F2L,0x000000000003C252L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleSelectClause417 = new BitSet(new long[]{0x401788401CFAE1F2L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleResultClause_in_ruleSelectClause450 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSelectClause472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleResultClause562 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause609 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleIntoClause714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec829 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_ruleResultSpec849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleResultNaming933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultNaming949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleFromClause1037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleFromClause1057 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleFromClause1077 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleFromClause1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleWhereClause1185 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleVariablesClause1288 = new BitSet(new long[]{0x0020718102000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1322 = new BitSet(new long[]{0x0020718102000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1342 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleParametersClause1648 = new BitSet(new long[]{0x0020718102000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1682 = new BitSet(new long[]{0x0020718102000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2131 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleImportDeclaration2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleGroupByClause2367 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleGroupByClause2379 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2399 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2413 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2433 = new BitSet(new long[]{0x0000000020000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2449 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleHavingClause2555 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleOrderByClause2658 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleOrderByClause2670 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2704 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec2836 = new BitSet(new long[]{0x0008020000010200L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleRangeClause2939 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleRangeClause2972 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3087 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3112 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3132 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3229 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression3254 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3274 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression3396 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3513 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3538 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3655 = new BitSet(new long[]{0x0740000000001002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3688 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3709 = new BitSet(new long[]{0x0740000000001002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3839 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000050L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3957 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3990 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4011 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression4104 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression4161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4277 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleParameterOrFieldOrMethodExpression4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_ruleParameterOrFieldOrMethodExpression4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleFieldOrMethodExpression4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_ruleFieldOrMethodExpression4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_entryRuleStaticMethodExpression4800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodExpression4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleStaticMethodExpression4862 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleStaticMethodExpression4876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4888 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression4908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleStaticMethodExpression4954 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleStaticMethodExpression4968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4980 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleStaticMethodExpression5046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleStaticMethodExpression5060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5072 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression5140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodExpression5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleMethodExpression5201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5213 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleMethodExpression5278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleMethodExpression5334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleMethodExpression5390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5402 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleMethodExpression5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5479 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleMethodExpression5544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5556 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleMethodExpression5621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5633 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleMethodExpression5698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5710 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleMethodExpression5775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5787 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleMethodExpression5852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleMethodExpression5908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleMethodExpression5964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5976 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression6010 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleMethodExpression6077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6089 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression6123 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthesesExpression6241 = new BitSet(new long[]{0x401780401CFAE1F0L,0x000000000003C252L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression6265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthesesExpression6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType6314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleType6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType6450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rulePrimitiveType6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType6572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_ruleNumericType6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_ruleNumericType6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType6708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleIntegralType6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleIntegralType6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleIntegralType6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleIntegralType6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleIntegralType6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType6873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleFloatingPointType6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleFloatingPointType6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral6981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleBooleanLiteral7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanLiteral7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral7277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleNullLiteral7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral7488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier7566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier7617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier7636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier7651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName7698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName7799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderByDirection7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleOrderByDirection7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleOrderByDirection7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleOrderByDirection7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryOperator8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryOperator8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryOperator8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleUnaryOperator8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditionOperator8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditionOperator8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator8221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComparisonOperator8359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleComparisonOperator8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleComparisonOperator8403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleComparisonOperator8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleComparisonOperator8447 = new BitSet(new long[]{0x0000000000000002L});

}