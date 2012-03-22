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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_92", "KEYWORD_91", "KEYWORD_89", "KEYWORD_90", "KEYWORD_88", "KEYWORD_86", "KEYWORD_87", "KEYWORD_84", "KEYWORD_85", "KEYWORD_82", "KEYWORD_83", "KEYWORD_80", "KEYWORD_81", "KEYWORD_79", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_75", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=96;
    public static final int RULE_ANY_OTHER=102;
    public static final int KEYWORD_56=43;
    public static final int KEYWORD_55=42;
    public static final int KEYWORD_54=41;
    public static final int KEYWORD_53=40;
    public static final int KEYWORD_52=39;
    public static final int KEYWORD_51=53;
    public static final int KEYWORD_50=52;
    public static final int EOF=-1;
    public static final int KEYWORD_59=35;
    public static final int KEYWORD_58=34;
    public static final int KEYWORD_57=44;
    public static final int KEYWORD_65=32;
    public static final int KEYWORD_64=31;
    public static final int KEYWORD_67=26;
    public static final int KEYWORD_66=33;
    public static final int KEYWORD_61=37;
    public static final int KEYWORD_60=36;
    public static final int KEYWORD_63=30;
    public static final int KEYWORD_62=38;
    public static final int KEYWORD_69=28;
    public static final int KEYWORD_68=27;
    public static final int KEYWORD_30=68;
    public static final int KEYWORD_34=55;
    public static final int KEYWORD_33=54;
    public static final int KEYWORD_32=70;
    public static final int KEYWORD_31=69;
    public static final int KEYWORD_38=59;
    public static final int KEYWORD_37=58;
    public static final int KEYWORD_36=57;
    public static final int KEYWORD_35=56;
    public static final int RULE_ML_COMMENT=99;
    public static final int KEYWORD_39=60;
    public static final int RULE_STRING=98;
    public static final int KEYWORD_41=62;
    public static final int KEYWORD_40=61;
    public static final int KEYWORD_43=45;
    public static final int KEYWORD_42=63;
    public static final int KEYWORD_45=47;
    public static final int KEYWORD_44=46;
    public static final int KEYWORD_47=49;
    public static final int KEYWORD_46=48;
    public static final int KEYWORD_49=51;
    public static final int KEYWORD_48=50;
    public static final int KEYWORD_90=7;
    public static final int KEYWORD_19=72;
    public static final int KEYWORD_17=95;
    public static final int KEYWORD_92=4;
    public static final int KEYWORD_91=5;
    public static final int KEYWORD_18=71;
    public static final int KEYWORD_15=93;
    public static final int KEYWORD_16=94;
    public static final int KEYWORD_13=91;
    public static final int KEYWORD_14=92;
    public static final int KEYWORD_11=89;
    public static final int KEYWORD_12=90;
    public static final int KEYWORD_10=88;
    public static final int KEYWORD_6=84;
    public static final int KEYWORD_7=85;
    public static final int KEYWORD_8=86;
    public static final int KEYWORD_9=87;
    public static final int KEYWORD_28=66;
    public static final int KEYWORD_29=67;
    public static final int RULE_INT=97;
    public static final int KEYWORD_24=77;
    public static final int KEYWORD_25=78;
    public static final int KEYWORD_26=64;
    public static final int KEYWORD_27=65;
    public static final int KEYWORD_20=73;
    public static final int KEYWORD_21=74;
    public static final int KEYWORD_22=75;
    public static final int KEYWORD_23=76;
    public static final int KEYWORD_79=17;
    public static final int KEYWORD_71=21;
    public static final int KEYWORD_72=22;
    public static final int KEYWORD_73=23;
    public static final int KEYWORD_74=24;
    public static final int KEYWORD_75=25;
    public static final int KEYWORD_76=18;
    public static final int KEYWORD_77=19;
    public static final int KEYWORD_78=20;
    public static final int KEYWORD_1=79;
    public static final int KEYWORD_5=83;
    public static final int KEYWORD_4=82;
    public static final int KEYWORD_70=29;
    public static final int KEYWORD_3=81;
    public static final int KEYWORD_2=80;
    public static final int RULE_SL_COMMENT=100;
    public static final int KEYWORD_84=11;
    public static final int KEYWORD_85=12;
    public static final int KEYWORD_82=13;
    public static final int KEYWORD_83=14;
    public static final int KEYWORD_88=8;
    public static final int KEYWORD_89=6;
    public static final int KEYWORD_86=9;
    public static final int KEYWORD_87=10;
    public static final int KEYWORD_81=16;
    public static final int KEYWORD_80=15;
    public static final int RULE_WS=101;

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

            if ( (LA1_0==KEYWORD_46) ) {
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

            if ( (LA2_0==KEYWORD_69) ) {
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

            if ( (LA3_0==KEYWORD_72) ) {
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

            if ( (LA4_0==KEYWORD_56) ) {
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

            if ( (LA5_0==KEYWORD_43) ) {
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

            if ( (LA6_0==KEYWORD_44) ) {
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

            if ( (LA7_0==KEYWORD_45) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:260:1: ruleSelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_53 ( (lv_isUnique_2_0= KEYWORD_54 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:263:28: ( ( () otherlv_1= KEYWORD_53 ( (lv_isUnique_2_0= KEYWORD_54 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_53 ( (lv_isUnique_2_0= KEYWORD_54 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_53 ( (lv_isUnique_2_0= KEYWORD_54 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: () otherlv_1= KEYWORD_53 ( (lv_isUnique_2_0= KEYWORD_54 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
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

            otherlv_1=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleSelectClause399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:278:1: ( (lv_isUnique_2_0= KEYWORD_54 ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_54) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_54 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_54 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:280:3: lv_isUnique_2_0= KEYWORD_54
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSelectClause417); if (state.failed) return current;
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

            if ( ((LA9_0>=KEYWORD_92 && LA9_0<=KEYWORD_91)||(LA9_0>=KEYWORD_90 && LA9_0<=KEYWORD_88)||(LA9_0>=KEYWORD_79 && LA9_0<=KEYWORD_78)||LA9_0==KEYWORD_75||LA9_0==KEYWORD_68||(LA9_0>=KEYWORD_70 && LA9_0<=KEYWORD_66)||(LA9_0>=KEYWORD_60 && LA9_0<=KEYWORD_62)||(LA9_0>=KEYWORD_47 && LA9_0<=KEYWORD_48)||(LA9_0>=KEYWORD_39 && LA9_0<=KEYWORD_42)||(LA9_0>=KEYWORD_27 && LA9_0<=KEYWORD_28)||(LA9_0>=KEYWORD_30 && LA9_0<=KEYWORD_32)||LA9_0==KEYWORD_1||LA9_0==KEYWORD_4||LA9_0==KEYWORD_7||LA9_0==KEYWORD_9||LA9_0==KEYWORD_12||(LA9_0>=KEYWORD_17 && LA9_0<=RULE_STRING)) ) {
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

            if ( (LA10_0==KEYWORD_35) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:347:1: ruleResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_63 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) ;
    public final EObject ruleResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        EObject lv_resultSpecs_1_0 = null;

        EObject lv_resultSpecs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:350:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_63 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_63 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_63 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_63 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_63 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_63) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:353:3: lv_isDistinct_0_0= KEYWORD_63
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleResultClause562); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:425:1: ruleIntoClause returns [EObject current=null] : (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) ;
    public final EObject ruleIntoClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_resultClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:428:28: ( (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:429:1: (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:430:2: otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleIntoClause714); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:564:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73 )? ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExcludeSubclasses_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_candidateClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:28: ( (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:569:2: otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleFromClause1037); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:2: ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_58) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) ) otherlv_3= KEYWORD_73
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_58 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_58 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_58 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:593:3: lv_isExcludeSubclasses_2_0= KEYWORD_58
                    {
                    lv_isExcludeSubclasses_2_0=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleFromClause1077); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleFromClause1101); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:629:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_46 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:632:28: ( (otherlv_0= KEYWORD_46 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_46 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_46 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:634:2: otherlv_0= KEYWORD_46 ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleWhereClause1185); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:673:1: ruleVariablesClause returns [EObject current=null] : (otherlv_0= KEYWORD_69 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) ;
    public final EObject ruleVariablesClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:676:28: ( (otherlv_0= KEYWORD_69 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_69 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_69 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:678:2: otherlv_0= KEYWORD_69 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleVariablesClause1288); if (state.failed) return current;
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

                    if ( (LA15_1==KEYWORD_89||(LA15_1>=KEYWORD_86 && LA15_1<=KEYWORD_81)||LA15_1==KEYWORD_59||LA15_1==KEYWORD_55||LA15_1==KEYWORD_57||(LA15_1>=KEYWORD_49 && LA15_1<=KEYWORD_51)||(LA15_1>=KEYWORD_36 && LA15_1<=KEYWORD_38)||LA15_1==KEYWORD_29||LA15_1==RULE_ID) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:831:1: ruleParametersClause returns [EObject current=null] : (otherlv_0= KEYWORD_72 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleParametersClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:834:28: ( (otherlv_0= KEYWORD_72 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_72 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_72 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:836:2: otherlv_0= KEYWORD_72 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleParametersClause1648); if (state.failed) return current;
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

                    if ( (LA17_1==KEYWORD_89||(LA17_1>=KEYWORD_86 && LA17_1<=KEYWORD_81)||LA17_1==KEYWORD_59||LA17_1==KEYWORD_55||LA17_1==KEYWORD_57||(LA17_1>=KEYWORD_49 && LA17_1<=KEYWORD_51)||(LA17_1>=KEYWORD_36 && LA17_1<=KEYWORD_38)||LA17_1==KEYWORD_29||LA17_1==RULE_ID) ) {
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

                    if ( (LA19_1==KEYWORD_56) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1089:1: ruleImportDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_56 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleImportDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1093:6: ( (kw= KEYWORD_56 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_56 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_56 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1095:2: kw= KEYWORD_56 this_QualifiedIdentifier_1= ruleQualifiedIdentifier
            {
            kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleImportDeclaration2253); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1128:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_43 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1131:28: ( (otherlv_0= KEYWORD_43 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_43 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_43 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1133:2: otherlv_0= KEYWORD_43 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleGroupByClause2367); if (state.failed) return current;
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

                    if ( ((LA21_1>=KEYWORD_92 && LA21_1<=KEYWORD_91)||(LA21_1>=KEYWORD_90 && LA21_1<=KEYWORD_88)||(LA21_1>=KEYWORD_79 && LA21_1<=KEYWORD_78)||LA21_1==KEYWORD_75||LA21_1==KEYWORD_68||LA21_1==KEYWORD_70||(LA21_1>=KEYWORD_64 && LA21_1<=KEYWORD_66)||(LA21_1>=KEYWORD_60 && LA21_1<=KEYWORD_62)||(LA21_1>=KEYWORD_47 && LA21_1<=KEYWORD_48)||(LA21_1>=KEYWORD_39 && LA21_1<=KEYWORD_42)||(LA21_1>=KEYWORD_27 && LA21_1<=KEYWORD_28)||(LA21_1>=KEYWORD_30 && LA21_1<=KEYWORD_32)||LA21_1==KEYWORD_1||LA21_1==KEYWORD_4||LA21_1==KEYWORD_7||LA21_1==KEYWORD_9||LA21_1==KEYWORD_12||(LA21_1>=KEYWORD_17 && LA21_1<=RULE_STRING)) ) {
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

            if ( (LA23_0==KEYWORD_52) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1223:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_52 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1226:28: ( (otherlv_0= KEYWORD_52 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_52 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_52 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1228:2: otherlv_0= KEYWORD_52 ( (lv_having_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleHavingClause2555); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1267:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1270:28: ( (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1272:2: otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOrderByClause2658); if (state.failed) return current;
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

                    if ( ((LA24_1>=KEYWORD_92 && LA24_1<=KEYWORD_91)||(LA24_1>=KEYWORD_90 && LA24_1<=KEYWORD_88)||(LA24_1>=KEYWORD_79 && LA24_1<=KEYWORD_78)||LA24_1==KEYWORD_75||LA24_1==KEYWORD_68||LA24_1==KEYWORD_70||(LA24_1>=KEYWORD_64 && LA24_1<=KEYWORD_66)||(LA24_1>=KEYWORD_60 && LA24_1<=KEYWORD_62)||(LA24_1>=KEYWORD_47 && LA24_1<=KEYWORD_48)||(LA24_1>=KEYWORD_39 && LA24_1<=KEYWORD_42)||(LA24_1>=KEYWORD_27 && LA24_1<=KEYWORD_28)||(LA24_1>=KEYWORD_30 && LA24_1<=KEYWORD_32)||LA24_1==KEYWORD_1||LA24_1==KEYWORD_4||LA24_1==KEYWORD_7||LA24_1==KEYWORD_9||LA24_1==KEYWORD_12||(LA24_1>=KEYWORD_17 && LA24_1<=RULE_STRING)) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1395:1: ruleRangeClause returns [EObject current=null] : (otherlv_0= KEYWORD_45 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleRangeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1398:28: ( (otherlv_0= KEYWORD_45 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_45 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_45 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1400:2: otherlv_0= KEYWORD_45 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleRangeClause2939); if (state.failed) return current;
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

                if ( (LA30_0==KEYWORD_74||LA30_0==KEYWORD_18||(LA30_0>=KEYWORD_20 && LA30_0<=KEYWORD_22)||(LA30_0>=KEYWORD_14 && LA30_0<=KEYWORD_15)) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1956:1: ruleUnaryExpression returns [EObject current=null] : ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_castType_1_0 = null;

        EObject lv_right_3_0 = null;

        Enumerator lv_unaryOperator_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1959:28: ( ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:1: ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:1: ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:2: (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1960:2: (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1961:2: otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUnaryExpression4097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1965:1: ( (lv_castType_1_0= ruleType ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1966:1: (lv_castType_1_0= ruleType )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1966:1: (lv_castType_1_0= ruleType )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1967:3: lv_castType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getCastTypeTypeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleUnaryExpression4117);
                    lv_castType_1_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"castType",
                              		lv_castType_1_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleUnaryExpression4130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1988:1: ( (lv_right_3_0= ruleFieldAccessExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1989:1: (lv_right_3_0= ruleFieldAccessExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1989:1: (lv_right_3_0= ruleFieldAccessExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1990:3: lv_right_3_0= ruleFieldAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4150);
                    lv_right_3_0=ruleFieldAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"FieldAccessExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2007:6: ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2007:6: ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2007:7: ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2007:7: ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==KEYWORD_1||LA33_0==KEYWORD_7||LA33_0==KEYWORD_9||LA33_0==KEYWORD_17) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2008:1: (lv_unaryOperator_4_0= ruleUnaryOperator )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2008:1: (lv_unaryOperator_4_0= ruleUnaryOperator )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2009:3: lv_unaryOperator_4_0= ruleUnaryOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression4179);
                            lv_unaryOperator_4_0=ruleUnaryOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"unaryOperator",
                                      		lv_unaryOperator_4_0, 
                                      		"UnaryOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2025:3: ( (lv_right_5_0= ruleFieldAccessExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2026:1: (lv_right_5_0= ruleFieldAccessExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2026:1: (lv_right_5_0= ruleFieldAccessExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2027:3: lv_right_5_0= ruleFieldAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4201);
                    lv_right_5_0=ruleFieldAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_5_0, 
                              		"FieldAccessExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleFieldAccessExpression"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2051:1: entryRuleFieldAccessExpression returns [EObject current=null] : iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF ;
    public final EObject entryRuleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAccessExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2052:2: (iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2053:2: iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression4237);
            iv_ruleFieldAccessExpression=ruleFieldAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAccessExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAccessExpression4247); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2060:1: ruleFieldAccessExpression returns [EObject current=null] : (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) ) ;
    public final EObject ruleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StaticMethodExpression_0 = null;

        EObject this_ParameterOrFieldOrMethodExpression_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2063:28: ( (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2064:1: (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2064:1: (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=KEYWORD_92 && LA36_0<=KEYWORD_91)||(LA36_0>=KEYWORD_90 && LA36_0<=KEYWORD_88)||LA36_0==KEYWORD_68||LA36_0==KEYWORD_64||LA36_0==KEYWORD_47||LA36_0==KEYWORD_27||(LA36_0>=KEYWORD_30 && LA36_0<=KEYWORD_32)) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=KEYWORD_79 && LA36_0<=KEYWORD_78)||LA36_0==KEYWORD_75||LA36_0==KEYWORD_70||(LA36_0>=KEYWORD_65 && LA36_0<=KEYWORD_66)||(LA36_0>=KEYWORD_60 && LA36_0<=KEYWORD_62)||LA36_0==KEYWORD_48||(LA36_0>=KEYWORD_39 && LA36_0<=KEYWORD_42)||LA36_0==KEYWORD_28||LA36_0==KEYWORD_4||LA36_0==KEYWORD_12||(LA36_0>=RULE_ID && LA36_0<=RULE_STRING)) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2065:2: this_StaticMethodExpression_0= ruleStaticMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getStaticMethodExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression4297);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2077:6: (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2077:6: (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2078:2: this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4328);
                    this_ParameterOrFieldOrMethodExpression_1=ruleParameterOrFieldOrMethodExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParameterOrFieldOrMethodExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2089:1: ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==KEYWORD_10) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2089:2: () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2089:2: ()
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2090:2: 
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

                    	    otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4353); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2103:1: ( (lv_right_4_0= ruleFieldOrMethodExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2104:1: (lv_right_4_0= ruleFieldOrMethodExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2104:1: (lv_right_4_0= ruleFieldOrMethodExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2105:3: lv_right_4_0= ruleFieldOrMethodExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4373);
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
                    	    break loop35;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2129:1: entryRuleParameterOrFieldOrMethodExpression returns [EObject current=null] : iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF ;
    public final EObject entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOrFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2130:2: (iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2131:2: iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4411);
            iv_ruleParameterOrFieldOrMethodExpression=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterOrFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4421); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2138:1: ruleParameterOrFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2141:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2142:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2142:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) )
            int alt37=6;
            switch ( input.LA(1) ) {
            case KEYWORD_48:
            case KEYWORD_39:
            case KEYWORD_42:
            case RULE_INT:
            case RULE_STRING:
                {
                alt37=1;
                }
                break;
            case KEYWORD_41:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
                {
                alt37=3;
                }
                break;
            case KEYWORD_12:
                {
                alt37=4;
                }
                break;
            case KEYWORD_4:
                {
                alt37=5;
                }
                break;
            case KEYWORD_79:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_75:
            case KEYWORD_70:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_40:
            case KEYWORD_28:
                {
                alt37=6;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2142:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2142:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2143:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2143:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2144:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4467);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2161:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2161:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2162:1: (lv_this_1_0= KEYWORD_41 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2162:1: (lv_this_1_0= KEYWORD_41 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2163:3: lv_this_1_0= KEYWORD_41
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleParameterOrFieldOrMethodExpression4492); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2178:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2178:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2179:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2179:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2180:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4526); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2197:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2197:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2198:2: otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2202:1: ( (lv_parameterName_4_0= ruleParameterName ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2203:1: (lv_parameterName_4_0= ruleParameterName )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2203:1: (lv_parameterName_4_0= ruleParameterName )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2204:3: lv_parameterName_4_0= ruleParameterName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4571);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2222:2: this_ParenthesesExpression_5= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4603);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2234:6: ( (lv_method_6_0= ruleMethodExpression ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2234:6: ( (lv_method_6_0= ruleMethodExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2235:1: (lv_method_6_0= ruleMethodExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2235:1: (lv_method_6_0= ruleMethodExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2236:3: lv_method_6_0= ruleMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getMethodMethodExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodExpression_in_ruleParameterOrFieldOrMethodExpression4629);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2260:1: entryRuleFieldOrMethodExpression returns [EObject current=null] : iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF ;
    public final EObject entryRuleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2261:2: (iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2262:2: iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4664);
            iv_ruleFieldOrMethodExpression=ruleFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4674); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2269:1: ruleFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) ) ;
    public final EObject ruleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ParenthesesExpression_3 = null;

        EObject lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2272:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2273:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2273:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case KEYWORD_48:
            case KEYWORD_39:
            case KEYWORD_42:
            case RULE_INT:
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case KEYWORD_41:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
                {
                alt38=3;
                }
                break;
            case KEYWORD_4:
                {
                alt38=4;
                }
                break;
            case KEYWORD_79:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_78:
            case KEYWORD_75:
            case KEYWORD_70:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_40:
            case KEYWORD_28:
                {
                alt38=5;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2273:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2273:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2274:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2274:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2275:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4720);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2292:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2292:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2293:1: (lv_this_1_0= KEYWORD_41 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2293:1: (lv_this_1_0= KEYWORD_41 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2294:3: lv_this_1_0= KEYWORD_41
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleFieldOrMethodExpression4745); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2309:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2309:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2310:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2310:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2311:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4779); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2329:2: this_ParenthesesExpression_3= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4815);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2341:6: ( (lv_method_4_0= ruleMethodExpression ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2341:6: ( (lv_method_4_0= ruleMethodExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2342:1: (lv_method_4_0= ruleMethodExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2342:1: (lv_method_4_0= ruleMethodExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2343:3: lv_method_4_0= ruleMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getMethodMethodExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodExpression_in_ruleFieldOrMethodExpression4841);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2367:1: entryRuleStaticMethodExpression returns [EObject current=null] : iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF ;
    public final EObject entryRuleStaticMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2368:2: (iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2369:2: iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodExpression_in_entryRuleStaticMethodExpression4876);
            iv_ruleStaticMethodExpression=ruleStaticMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodExpression4886); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2376:1: ruleStaticMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5 ) | ( () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5 ) | ( () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5 ) | ( () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5 ) ) ;
    public final EObject ruleStaticMethodExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_isDistinct_33_0=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_isDistinct_39_0=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token lv_isDistinct_55_0=null;
        Token otherlv_57=null;
        EObject lv_numeric_3_0 = null;

        EObject lv_numeric_8_0 = null;

        EObject lv_numeric_13_0 = null;

        EObject lv_numeric_18_0 = null;

        EObject lv_persistable_23_0 = null;

        EObject lv_persistable_28_0 = null;

        EObject lv_aggregateArgument_34_0 = null;

        EObject lv_aggregateArgument_40_0 = null;

        EObject lv_aggregateArgument_45_0 = null;

        EObject lv_aggregateArgument_50_0 = null;

        EObject lv_aggregateArgument_56_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2379:28: ( ( ( () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5 ) | ( () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5 ) | ( () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5 ) | ( () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:1: ( ( () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5 ) | ( () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5 ) | ( () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5 ) | ( () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:1: ( ( () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5 ) | ( () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5 ) | ( () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5 ) | ( () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5 ) )
            int alt42=11;
            switch ( input.LA(1) ) {
            case KEYWORD_88:
                {
                alt42=1;
                }
                break;
            case KEYWORD_64:
                {
                alt42=2;
                }
                break;
            case KEYWORD_90:
                {
                alt42=3;
                }
                break;
            case KEYWORD_68:
                {
                alt42=4;
                }
                break;
            case KEYWORD_92:
                {
                alt42=5;
                }
                break;
            case KEYWORD_91:
                {
                alt42=6;
                }
                break;
            case KEYWORD_47:
                {
                alt42=7;
                }
                break;
            case KEYWORD_32:
                {
                alt42=8;
                }
                break;
            case KEYWORD_31:
                {
                alt42=9;
                }
                break;
            case KEYWORD_30:
                {
                alt42=10;
                }
                break;
            case KEYWORD_27:
                {
                alt42=11;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:2: ( () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:2: ( () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:3: () otherlv_1= KEYWORD_88 otherlv_2= KEYWORD_4 ( (lv_numeric_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:3: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2381:2: 
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

                    otherlv_1=(Token)match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleStaticMethodExpression4937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAbsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2399:1: ( (lv_numeric_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2400:1: (lv_numeric_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2400:1: (lv_numeric_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2401:3: lv_numeric_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumericConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression4969);
                    lv_numeric_3_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_3_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression4982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:6: ( () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:6: ( () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:7: () otherlv_6= KEYWORD_64 otherlv_7= KEYWORD_4 ( (lv_numeric_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2424:2: 
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

                    otherlv_6=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleStaticMethodExpression5014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStaticMethodExpressionAccess().getMathAbsKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2442:1: ( (lv_numeric_8_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2443:1: (lv_numeric_8_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2443:1: (lv_numeric_8_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:3: lv_numeric_8_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumericConditionalOrExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5046);
                    lv_numeric_8_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_8_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:6: ( () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:6: ( () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:7: () otherlv_11= KEYWORD_90 otherlv_12= KEYWORD_4 ( (lv_numeric_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2467:2: 
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

                    otherlv_11=(Token)match(input,KEYWORD_90,FOLLOW_KEYWORD_90_in_ruleStaticMethodExpression5091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathSqrtKeyword_2_1());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2485:1: ( (lv_numeric_13_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2486:1: (lv_numeric_13_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2486:1: (lv_numeric_13_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2487:3: lv_numeric_13_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumericConditionalOrExpressionParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5123);
                    lv_numeric_13_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_13_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:6: ( () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:6: ( () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:7: () otherlv_16= KEYWORD_68 otherlv_17= KEYWORD_4 ( (lv_numeric_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2510:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_16=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleStaticMethodExpression5168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStaticMethodExpressionAccess().getMathSqrtKeyword_3_1());
                          
                    }
                    otherlv_17=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2528:1: ( (lv_numeric_18_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2529:1: (lv_numeric_18_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2529:1: (lv_numeric_18_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2530:3: lv_numeric_18_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumericConditionalOrExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5200);
                    lv_numeric_18_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"numeric",
                              		lv_numeric_18_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:6: ( () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:6: ( () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:7: () otherlv_21= KEYWORD_92 otherlv_22= KEYWORD_4 ( (lv_persistable_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2553:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_21=(Token)match(input,KEYWORD_92,FOLLOW_KEYWORD_92_in_ruleStaticMethodExpression5245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStaticMethodExpressionAccess().getJavaxJdoJDOHelperGetObjectIdKeyword_4_1());
                          
                    }
                    otherlv_22=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2571:1: ( (lv_persistable_23_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2572:1: (lv_persistable_23_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2572:1: (lv_persistable_23_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2573:3: lv_persistable_23_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5277);
                    lv_persistable_23_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_23_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:6: ( () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:6: ( () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:7: () otherlv_26= KEYWORD_91 otherlv_27= KEYWORD_4 ( (lv_persistable_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2596:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_26=(Token)match(input,KEYWORD_91,FOLLOW_KEYWORD_91_in_ruleStaticMethodExpression5322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStaticMethodExpressionAccess().getJDOHelperGetObjectIdKeyword_5_1());
                          
                    }
                    otherlv_27=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2614:1: ( (lv_persistable_28_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:1: (lv_persistable_28_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:1: (lv_persistable_28_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2616:3: lv_persistable_28_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5354);
                    lv_persistable_28_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_28_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:6: ( () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:6: ( () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:7: () otherlv_31= KEYWORD_47 otherlv_32= KEYWORD_4 ( (lv_isDistinct_33_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) ) otherlv_35= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_31=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleStaticMethodExpression5399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getStaticMethodExpressionAccess().getCountKeyword_6_1());
                          
                    }
                    otherlv_32=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2657:1: ( (lv_isDistinct_33_0= KEYWORD_63 ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==KEYWORD_63) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:1: (lv_isDistinct_33_0= KEYWORD_63 )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:1: (lv_isDistinct_33_0= KEYWORD_63 )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2659:3: lv_isDistinct_33_0= KEYWORD_63
                            {
                            lv_isDistinct_33_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStaticMethodExpression5429); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isDistinct_33_0, grammarAccess.getStaticMethodExpressionAccess().getIsDistinctDISTINCTKeyword_6_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStaticMethodExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2673:3: ( (lv_aggregateArgument_34_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2674:1: (lv_aggregateArgument_34_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2674:1: (lv_aggregateArgument_34_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2675:3: lv_aggregateArgument_34_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_6_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5462);
                    lv_aggregateArgument_34_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_34_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2697:6: ( () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2697:6: ( () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2697:7: () otherlv_37= KEYWORD_32 otherlv_38= KEYWORD_4 ( (lv_isDistinct_39_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) ) otherlv_41= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2697:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2698:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_37=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleStaticMethodExpression5507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getStaticMethodExpressionAccess().getSumKeyword_7_1());
                          
                    }
                    otherlv_38=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_38, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2716:1: ( (lv_isDistinct_39_0= KEYWORD_63 ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==KEYWORD_63) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2717:1: (lv_isDistinct_39_0= KEYWORD_63 )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2717:1: (lv_isDistinct_39_0= KEYWORD_63 )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2718:3: lv_isDistinct_39_0= KEYWORD_63
                            {
                            lv_isDistinct_39_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStaticMethodExpression5537); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isDistinct_39_0, grammarAccess.getStaticMethodExpressionAccess().getIsDistinctDISTINCTKeyword_7_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStaticMethodExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2732:3: ( (lv_aggregateArgument_40_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2733:1: (lv_aggregateArgument_40_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2733:1: (lv_aggregateArgument_40_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2734:3: lv_aggregateArgument_40_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_7_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5570);
                    lv_aggregateArgument_40_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_40_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_41=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_7_5());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2756:6: ( () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2756:6: ( () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2756:7: () otherlv_43= KEYWORD_31 otherlv_44= KEYWORD_4 ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) ) otherlv_46= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2756:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2757:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_43=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleStaticMethodExpression5615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getStaticMethodExpressionAccess().getMinKeyword_8_1());
                          
                    }
                    otherlv_44=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2775:1: ( (lv_aggregateArgument_45_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2776:1: (lv_aggregateArgument_45_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2776:1: (lv_aggregateArgument_45_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2777:3: lv_aggregateArgument_45_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5647);
                    lv_aggregateArgument_45_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_45_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_46=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2799:6: ( () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2799:6: ( () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2799:7: () otherlv_48= KEYWORD_30 otherlv_49= KEYWORD_4 ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) ) otherlv_51= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2799:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2800:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_48=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleStaticMethodExpression5692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getStaticMethodExpressionAccess().getMaxKeyword_9_1());
                          
                    }
                    otherlv_49=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2818:1: ( (lv_aggregateArgument_50_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2819:1: (lv_aggregateArgument_50_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2819:1: (lv_aggregateArgument_50_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2820:3: lv_aggregateArgument_50_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5724);
                    lv_aggregateArgument_50_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_50_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_51=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_51, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:6: ( () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:6: ( () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:7: () otherlv_53= KEYWORD_27 otherlv_54= KEYWORD_4 ( (lv_isDistinct_55_0= KEYWORD_63 ) )? ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) ) otherlv_57= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2842:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2843:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_10_0(),
                                  current);
                          
                    }

                    }

                    otherlv_53=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleStaticMethodExpression5769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_53, grammarAccess.getStaticMethodExpressionAccess().getAvgKeyword_10_1());
                          
                    }
                    otherlv_54=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_54, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2861:1: ( (lv_isDistinct_55_0= KEYWORD_63 ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==KEYWORD_63) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2862:1: (lv_isDistinct_55_0= KEYWORD_63 )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2862:1: (lv_isDistinct_55_0= KEYWORD_63 )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2863:3: lv_isDistinct_55_0= KEYWORD_63
                            {
                            lv_isDistinct_55_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStaticMethodExpression5799); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isDistinct_55_0, grammarAccess.getStaticMethodExpressionAccess().getIsDistinctDISTINCTKeyword_10_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStaticMethodExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2877:3: ( (lv_aggregateArgument_56_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2878:1: (lv_aggregateArgument_56_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2878:1: (lv_aggregateArgument_56_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2879:3: lv_aggregateArgument_56_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_10_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5832);
                    lv_aggregateArgument_56_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_56_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_57=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_10_5());
                          
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2908:1: entryRuleMethodExpression returns [EObject current=null] : iv_ruleMethodExpression= ruleMethodExpression EOF ;
    public final EObject entryRuleMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2909:2: (iv_ruleMethodExpression= ruleMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2910:2: iv_ruleMethodExpression= ruleMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression5880);
            iv_ruleMethodExpression=ruleMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodExpression5890); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:1: ruleMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2920:28: ( ( ( () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2921:1: ( ( () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2921:1: ( ( () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 ) | ( () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 ) | ( () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 ) | ( () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 ) | ( () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 ) | ( () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 ) | ( () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 ) | ( () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 ) | ( () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 ) )
            int alt45=13;
            switch ( input.LA(1) ) {
            case KEYWORD_65:
                {
                alt45=1;
                }
                break;
            case KEYWORD_61:
                {
                alt45=2;
                }
                break;
            case KEYWORD_40:
                {
                alt45=3;
                }
                break;
            case KEYWORD_28:
                {
                alt45=4;
                }
                break;
            case KEYWORD_76:
                {
                alt45=5;
                }
                break;
            case KEYWORD_79:
                {
                alt45=6;
                }
                break;
            case KEYWORD_75:
                {
                alt45=7;
                }
                break;
            case KEYWORD_66:
                {
                alt45=8;
                }
                break;
            case KEYWORD_62:
                {
                alt45=9;
                }
                break;
            case KEYWORD_77:
                {
                alt45=10;
                }
                break;
            case KEYWORD_78:
                {
                alt45=11;
                }
                break;
            case KEYWORD_60:
                {
                alt45=12;
                }
                break;
            case KEYWORD_70:
                {
                alt45=13;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2921:2: ( () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2921:2: ( () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2921:3: () otherlv_1= KEYWORD_65 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2921:3: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2922:2: 
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

                    otherlv_1=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleMethodExpression5941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMethodExpressionAccess().getContainsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression5953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2940:1: ( (lv_element_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2941:1: (lv_element_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2941:1: (lv_element_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2942:3: lv_element_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getElementConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5973);
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

                    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression5986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:6: ( () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:6: ( () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:7: () otherlv_6= KEYWORD_61 otherlv_7= KEYWORD_4 otherlv_8= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2964:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2965:2: 
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

                    otherlv_6=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleMethodExpression6018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodExpressionAccess().getIsEmptyKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    otherlv_8=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:6: ( () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:6: ( () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:7: () otherlv_10= KEYWORD_40 otherlv_11= KEYWORD_4 otherlv_12= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2990:2: 
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

                    otherlv_10=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleMethodExpression6074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMethodExpressionAccess().getSizeKeyword_2_1());
                          
                    }
                    otherlv_11=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3014:6: ( () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3014:6: ( () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3014:7: () otherlv_14= KEYWORD_28 otherlv_15= KEYWORD_4 ( (lv_arg_16_0= ruleConditionalOrExpression ) ) otherlv_17= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3014:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3015:2: 
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

                    otherlv_14=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleMethodExpression6130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getMethodExpressionAccess().getGetKeyword_3_1());
                          
                    }
                    otherlv_15=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3033:1: ( (lv_arg_16_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3034:1: (lv_arg_16_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3034:1: (lv_arg_16_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3035:3: lv_arg_16_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getArgConditionalOrExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6162);
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

                    otherlv_17=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3057:6: ( () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3057:6: ( () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3057:7: () otherlv_19= KEYWORD_76 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3057:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3058:2: 
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

                    otherlv_19=(Token)match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleMethodExpression6207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getMethodExpressionAccess().getContainsKeyKeyword_4_1());
                          
                    }
                    otherlv_20=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3076:1: ( (lv_key_21_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3077:1: (lv_key_21_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3077:1: (lv_key_21_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3078:3: lv_key_21_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getKeyConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6239);
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

                    otherlv_22=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3100:6: ( () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3100:6: ( () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3100:7: () otherlv_24= KEYWORD_79 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3100:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3101:2: 
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

                    otherlv_24=(Token)match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleMethodExpression6284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getMethodExpressionAccess().getContainsValueKeyword_5_1());
                          
                    }
                    otherlv_25=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3119:1: ( (lv_value_26_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3120:1: (lv_value_26_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3120:1: (lv_value_26_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3121:3: lv_value_26_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getValueConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6316);
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

                    otherlv_27=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3143:6: ( () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3143:6: ( () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3143:7: () otherlv_29= KEYWORD_75 otherlv_30= KEYWORD_4 ( (lv_string_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3143:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3144:2: 
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

                    otherlv_29=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleMethodExpression6361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getMethodExpressionAccess().getStartsWithKeyword_6_1());
                          
                    }
                    otherlv_30=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3162:1: ( (lv_string_31_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3163:1: (lv_string_31_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3163:1: (lv_string_31_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3164:3: lv_string_31_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6393);
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

                    otherlv_32=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_6_4());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3186:6: ( () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3186:6: ( () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3186:7: () otherlv_34= KEYWORD_66 otherlv_35= KEYWORD_4 ( (lv_string_36_0= ruleConditionalOrExpression ) ) otherlv_37= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3186:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3187:2: 
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

                    otherlv_34=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleMethodExpression6438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getMethodExpressionAccess().getEndsWithKeyword_7_1());
                          
                    }
                    otherlv_35=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3205:1: ( (lv_string_36_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3206:1: (lv_string_36_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3206:1: (lv_string_36_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3207:3: lv_string_36_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6470);
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

                    otherlv_37=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3229:6: ( () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3229:6: ( () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3229:7: () otherlv_39= KEYWORD_62 otherlv_40= KEYWORD_4 ( (lv_regex_41_0= ruleConditionalOrExpression ) ) otherlv_42= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3229:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3230:2: 
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

                    otherlv_39=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMethodExpression6515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getMethodExpressionAccess().getMatchesKeyword_8_1());
                          
                    }
                    otherlv_40=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3248:1: ( (lv_regex_41_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3249:1: (lv_regex_41_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3249:1: (lv_regex_41_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3250:3: lv_regex_41_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getRegexConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6547);
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

                    otherlv_42=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3272:6: ( () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3272:6: ( () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3272:7: () otherlv_44= KEYWORD_77 otherlv_45= KEYWORD_4 otherlv_46= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3272:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3273:2: 
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

                    otherlv_44=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleMethodExpression6592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getMethodExpressionAccess().getToLowerCaseKeyword_9_1());
                          
                    }
                    otherlv_45=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    otherlv_46=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_9_3());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3297:6: ( () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3297:6: ( () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3297:7: () otherlv_48= KEYWORD_78 otherlv_49= KEYWORD_4 otherlv_50= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3297:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3298:2: 
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

                    otherlv_48=(Token)match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleMethodExpression6648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getMethodExpressionAccess().getToUpperCaseKeyword_10_1());
                          
                    }
                    otherlv_49=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    otherlv_50=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_50, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_10_3());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3322:6: ( () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3322:6: ( () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3322:7: () otherlv_52= KEYWORD_60 otherlv_53= KEYWORD_4 ( (lv_string_54_0= ruleConditionalOrExpression ) ) (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )? otherlv_57= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3322:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3323:2: 
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

                    otherlv_52=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleMethodExpression6704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getMethodExpressionAccess().getIndexOfKeyword_11_1());
                          
                    }
                    otherlv_53=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_53, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_11_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3341:1: ( (lv_string_54_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3342:1: (lv_string_54_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3342:1: (lv_string_54_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3343:3: lv_string_54_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6736);
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

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3359:2: (otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==KEYWORD_8) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3360:2: otherlv_55= KEYWORD_8 ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_55=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression6750); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_55, grammarAccess.getMethodExpressionAccess().getCommaKeyword_11_4_0());
                                  
                            }
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3364:1: ( (lv_fromIndex_56_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3365:1: (lv_fromIndex_56_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3365:1: (lv_fromIndex_56_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3366:3: lv_fromIndex_56_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getFromIndexConditionalOrExpressionParserRuleCall_11_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6770);
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

                    otherlv_57=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_11_5());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3388:6: ( () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3388:6: ( () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3388:7: () otherlv_59= KEYWORD_70 otherlv_60= KEYWORD_4 ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) ) (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )? otherlv_64= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3388:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3389:2: 
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

                    otherlv_59=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleMethodExpression6817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_59, grammarAccess.getMethodExpressionAccess().getSubstringKeyword_12_1());
                          
                    }
                    otherlv_60=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression6829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_60, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_12_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3407:1: ( (lv_beginIndex_61_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3408:1: (lv_beginIndex_61_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3408:1: (lv_beginIndex_61_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3409:3: lv_beginIndex_61_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getBeginIndexConditionalOrExpressionParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6849);
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

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3425:2: (otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==KEYWORD_8) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3426:2: otherlv_62= KEYWORD_8 ( (lv_endIndex_63_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_62=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression6863); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_62, grammarAccess.getMethodExpressionAccess().getCommaKeyword_12_4_0());
                                  
                            }
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3430:1: ( (lv_endIndex_63_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3431:1: (lv_endIndex_63_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3431:1: (lv_endIndex_63_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3432:3: lv_endIndex_63_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getEndIndexConditionalOrExpressionParserRuleCall_12_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6883);
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

                    otherlv_64=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression6898); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3461:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3462:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3463:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6933);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression6943); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3470:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConditionalOrExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3473:28: ( (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3474:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3474:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3475:2: otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthesesExpression6981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression7005);
            this_ConditionalOrExpression_1=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthesesExpression7017); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3504:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3505:1: (iv_ruleType= ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3506:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType7052);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType7063); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3513:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_ClassOrInterfaceName_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3517:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3518:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3518:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_59||LA46_0==KEYWORD_55||LA46_0==KEYWORD_49||LA46_0==KEYWORD_51||(LA46_0>=KEYWORD_36 && LA46_0<=KEYWORD_38)||LA46_0==KEYWORD_29) ) {
                alt46=1;
            }
            else if ( (LA46_0==KEYWORD_89||(LA46_0>=KEYWORD_86 && LA46_0<=KEYWORD_81)||LA46_0==KEYWORD_57||LA46_0==KEYWORD_50||LA46_0==RULE_ID) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3519:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType7110);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3531:5: this_ClassOrInterfaceName_1= ruleClassOrInterfaceName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleType7143);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3549:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3550:1: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3551:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType7188);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType7199); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3558:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericType_0= ruleNumericType | kw= KEYWORD_59 ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NumericType_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3562:6: ( (this_NumericType_0= ruleNumericType | kw= KEYWORD_59 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3563:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_59 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3563:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_59 )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_55||LA47_0==KEYWORD_49||LA47_0==KEYWORD_51||(LA47_0>=KEYWORD_36 && LA47_0<=KEYWORD_38)||LA47_0==KEYWORD_29) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_59) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3564:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType7246);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3576:2: kw= KEYWORD_59
                    {
                    kw=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rulePrimitiveType7270); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3589:1: entryRuleNumericType returns [String current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final String entryRuleNumericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3590:1: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3591:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType7310);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType7321); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3598:1: ruleNumericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) ;
    public final AntlrDatatypeRuleToken ruleNumericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegralType_0 = null;

        AntlrDatatypeRuleToken this_FloatingPointType_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3602:6: ( (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3603:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3603:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_51||(LA48_0>=KEYWORD_36 && LA48_0<=KEYWORD_38)||LA48_0==KEYWORD_29) ) {
                alt48=1;
            }
            else if ( (LA48_0==KEYWORD_55||LA48_0==KEYWORD_49) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:5: this_IntegralType_0= ruleIntegralType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegralType_in_ruleNumericType7368);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3616:5: this_FloatingPointType_1= ruleFloatingPointType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatingPointType_in_ruleNumericType7401);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3634:1: entryRuleIntegralType returns [String current=null] : iv_ruleIntegralType= ruleIntegralType EOF ;
    public final String entryRuleIntegralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegralType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:1: (iv_ruleIntegralType= ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3636:2: iv_ruleIntegralType= ruleIntegralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegralTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType7446);
            iv_ruleIntegralType=ruleIntegralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegralType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType7457); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3643:1: ruleIntegralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_51 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleIntegralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3647:6: ( (kw= KEYWORD_36 | kw= KEYWORD_51 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3648:1: (kw= KEYWORD_36 | kw= KEYWORD_51 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3648:1: (kw= KEYWORD_36 | kw= KEYWORD_51 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 )
            int alt49=5;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt49=1;
                }
                break;
            case KEYWORD_51:
                {
                alt49=2;
                }
                break;
            case KEYWORD_29:
                {
                alt49=3;
                }
                break;
            case KEYWORD_38:
                {
                alt49=4;
                }
                break;
            case KEYWORD_37:
                {
                alt49=5;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3649:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleIntegralType7495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3656:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleIntegralType7514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3663:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleIntegralType7533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3670:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleIntegralType7552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3677:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleIntegralType7571); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3690:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3691:1: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3692:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType7611);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType7622); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3699:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_49 | kw= KEYWORD_55 ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3703:6: ( (kw= KEYWORD_49 | kw= KEYWORD_55 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3704:1: (kw= KEYWORD_49 | kw= KEYWORD_55 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3704:1: (kw= KEYWORD_49 | kw= KEYWORD_55 )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_49) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEYWORD_55) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3705:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleFloatingPointType7660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3712:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleFloatingPointType7679); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3725:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3726:1: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3727:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral7719);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral7730); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3734:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3738:6: (this_INT_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3739:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral7769); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3754:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3755:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3756:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7813);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral7824); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3763:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3767:6: (this_STRING_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3768:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral7863); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3783:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3784:1: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3785:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7907);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral7918); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3792:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_42 | kw= KEYWORD_48 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3796:6: ( (kw= KEYWORD_42 | kw= KEYWORD_48 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3797:1: (kw= KEYWORD_42 | kw= KEYWORD_48 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3797:1: (kw= KEYWORD_42 | kw= KEYWORD_48 )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_42) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEYWORD_48) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3798:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleBooleanLiteral7956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3805:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleBooleanLiteral7975); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3818:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3819:1: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3820:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8015);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral8026); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3827:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_39 ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3831:6: (kw= KEYWORD_39 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3833:2: kw= KEYWORD_39
            {
            kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNullLiteral8063); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3846:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3847:1: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3848:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8102);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8113); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3855:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;

        AntlrDatatypeRuleToken this_NullLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3859:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3860:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3860:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt52=1;
                }
                break;
            case KEYWORD_48:
            case KEYWORD_42:
                {
                alt52=2;
                }
                break;
            case RULE_STRING:
                {
                alt52=3;
                }
                break;
            case KEYWORD_39:
                {
                alt52=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3861:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral8160);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3873:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral8193);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3885:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral8226);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3897:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral8259);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3915:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3916:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3917:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier8304);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier8315); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3924:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_86 | kw= KEYWORD_80 | kw= KEYWORD_89 | kw= KEYWORD_84 | kw= KEYWORD_82 | kw= KEYWORD_87 | kw= KEYWORD_81 | kw= KEYWORD_83 | kw= KEYWORD_85 | (kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_10=null;
        Token this_ID_12=null;
        Token this_ID_14=null;
        Token this_ID_16=null;
        Token this_ID_17=null;
        Token this_ID_19=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3928:6: ( (kw= KEYWORD_86 | kw= KEYWORD_80 | kw= KEYWORD_89 | kw= KEYWORD_84 | kw= KEYWORD_82 | kw= KEYWORD_87 | kw= KEYWORD_81 | kw= KEYWORD_83 | kw= KEYWORD_85 | (kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3929:1: (kw= KEYWORD_86 | kw= KEYWORD_80 | kw= KEYWORD_89 | kw= KEYWORD_84 | kw= KEYWORD_82 | kw= KEYWORD_87 | kw= KEYWORD_81 | kw= KEYWORD_83 | kw= KEYWORD_85 | (kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3929:1: (kw= KEYWORD_86 | kw= KEYWORD_80 | kw= KEYWORD_89 | kw= KEYWORD_84 | kw= KEYWORD_82 | kw= KEYWORD_87 | kw= KEYWORD_81 | kw= KEYWORD_83 | kw= KEYWORD_85 | (kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) )
            int alt56=12;
            switch ( input.LA(1) ) {
            case KEYWORD_86:
                {
                alt56=1;
                }
                break;
            case KEYWORD_80:
                {
                alt56=2;
                }
                break;
            case KEYWORD_89:
                {
                alt56=3;
                }
                break;
            case KEYWORD_84:
                {
                alt56=4;
                }
                break;
            case KEYWORD_82:
                {
                alt56=5;
                }
                break;
            case KEYWORD_87:
                {
                alt56=6;
                }
                break;
            case KEYWORD_81:
                {
                alt56=7;
                }
                break;
            case KEYWORD_83:
                {
                alt56=8;
                }
                break;
            case KEYWORD_85:
                {
                alt56=9;
                }
                break;
            case KEYWORD_50:
                {
                alt56=10;
                }
                break;
            case KEYWORD_57:
                {
                alt56=11;
                }
                break;
            case RULE_ID:
                {
                alt56=12;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3930:2: kw= KEYWORD_86
                    {
                    kw=(Token)match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleQualifiedIdentifier8353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3937:2: kw= KEYWORD_80
                    {
                    kw=(Token)match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleQualifiedIdentifier8372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3944:2: kw= KEYWORD_89
                    {
                    kw=(Token)match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_ruleQualifiedIdentifier8391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangCharacterKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3951:2: kw= KEYWORD_84
                    {
                    kw=(Token)match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleQualifiedIdentifier8410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangDoubleKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3958:2: kw= KEYWORD_82
                    {
                    kw=(Token)match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleQualifiedIdentifier8429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangFloatKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3965:2: kw= KEYWORD_87
                    {
                    kw=(Token)match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleQualifiedIdentifier8448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangIntegerKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3972:2: kw= KEYWORD_81
                    {
                    kw=(Token)match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleQualifiedIdentifier8467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3979:2: kw= KEYWORD_83
                    {
                    kw=(Token)match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleQualifiedIdentifier8486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangShortKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3986:2: kw= KEYWORD_85
                    {
                    kw=(Token)match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleQualifiedIdentifier8505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangStringKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3992:6: (kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3992:6: (kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3993:2: kw= KEYWORD_50 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleQualifiedIdentifier8525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaKeyword_9_0()); 
                          
                    }
                    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_10, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_9_1()); 
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4005:1: (kw= KEYWORD_10 this_ID_12= RULE_ID )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==KEYWORD_10) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4006:2: kw= KEYWORD_10 this_ID_12= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier8559); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_9_2_0()); 
                    	          
                    	    }
                    	    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8574); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ID_12);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ID_12, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_9_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4019:6: (kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4019:6: (kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4020:2: kw= KEYWORD_57 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleQualifiedIdentifier8602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaxKeyword_10_0()); 
                          
                    }
                    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_14, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_10_1()); 
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4032:1: (kw= KEYWORD_10 this_ID_16= RULE_ID )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==KEYWORD_10) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4033:2: kw= KEYWORD_10 this_ID_16= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier8636); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_10_2_0()); 
                    	          
                    	    }
                    	    this_ID_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8651); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ID_16);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ID_16, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_10_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:6: (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:6: (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:11: this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )*
                    {
                    this_ID_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_17, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_11_0()); 
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4053:1: (kw= KEYWORD_10 this_ID_19= RULE_ID )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==KEYWORD_10) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4054:2: kw= KEYWORD_10 this_ID_19= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier8700); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_11_1_0()); 
                    	          
                    	    }
                    	    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8715); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ID_19);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ID_19, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_11_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
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
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleCandidateClassName"
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4074:1: entryRuleCandidateClassName returns [String current=null] : iv_ruleCandidateClassName= ruleCandidateClassName EOF ;
    public final String entryRuleCandidateClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidateClassName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4075:1: (iv_ruleCandidateClassName= ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4076:2: iv_ruleCandidateClassName= ruleCandidateClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCandidateClassNameRule()); 
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName8763);
            iv_ruleCandidateClassName=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCandidateClassName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName8774); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4083:1: ruleCandidateClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleCandidateClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4087:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4089:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName8820);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4107:1: entryRuleClassOrInterfaceName returns [String current=null] : iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF ;
    public final String entryRuleClassOrInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrInterfaceName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4108:1: (iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4109:2: iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName8864);
            iv_ruleClassOrInterfaceName=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName8875); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4116:1: ruleClassOrInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleClassOrInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4120:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4122:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName8921);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4140:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_67 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_71 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4142:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_67 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_71 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4143:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_67 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_71 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4143:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_67 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_71 ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt57=1;
                }
                break;
            case KEYWORD_67:
                {
                alt57=2;
                }
                break;
            case KEYWORD_33:
                {
                alt57=3;
                }
                break;
            case KEYWORD_71:
                {
                alt57=4;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4143:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4143:2: (enumLiteral_0= KEYWORD_26 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4143:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderByDirection8982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4149:6: (enumLiteral_1= KEYWORD_67 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4149:6: (enumLiteral_1= KEYWORD_67 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4149:11: enumLiteral_1= KEYWORD_67
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleOrderByDirection9004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:6: (enumLiteral_2= KEYWORD_33 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:6: (enumLiteral_2= KEYWORD_33 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:11: enumLiteral_2= KEYWORD_33
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleOrderByDirection9026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4161:6: (enumLiteral_3= KEYWORD_71 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4161:6: (enumLiteral_3= KEYWORD_71 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4161:11: enumLiteral_3= KEYWORD_71
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleOrderByDirection9048); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4171:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4173:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4174:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4174:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt58=1;
                }
                break;
            case KEYWORD_9:
                {
                alt58=2;
                }
                break;
            case KEYWORD_17:
                {
                alt58=3;
                }
                break;
            case KEYWORD_1:
                {
                alt58=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4174:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4174:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4174:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryOperator9098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4180:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4180:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4180:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryOperator9120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4186:6: (enumLiteral_2= KEYWORD_17 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4186:6: (enumLiteral_2= KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4186:11: enumLiteral_2= KEYWORD_17
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryOperator9142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4192:6: (enumLiteral_3= KEYWORD_1 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4192:6: (enumLiteral_3= KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4192:11: enumLiteral_3= KEYWORD_1
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleUnaryOperator9164); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4202:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4204:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4205:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4205:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_7) ) {
                alt59=1;
            }
            else if ( (LA59_0==KEYWORD_9) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4205:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4205:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4205:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditionOperator9214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4211:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4211:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4211:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditionOperator9236); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4221:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4223:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4224:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4224:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt60=1;
                }
                break;
            case KEYWORD_11:
                {
                alt60=2;
                }
                break;
            case KEYWORD_2:
                {
                alt60=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4224:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4224:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4224:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator9286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4230:6: (enumLiteral_1= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4230:6: (enumLiteral_1= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4230:11: enumLiteral_1= KEYWORD_11
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator9308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4236:6: (enumLiteral_2= KEYWORD_2 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4236:6: (enumLiteral_2= KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4236:11: enumLiteral_2= KEYWORD_2
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator9330); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4246:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_74 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4248:28: ( ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_74 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4249:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_74 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4249:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_74 ) )
            int alt61=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt61=1;
                }
                break;
            case KEYWORD_15:
                {
                alt61=2;
                }
                break;
            case KEYWORD_20:
                {
                alt61=3;
                }
                break;
            case KEYWORD_22:
                {
                alt61=4;
                }
                break;
            case KEYWORD_21:
                {
                alt61=5;
                }
                break;
            case KEYWORD_18:
                {
                alt61=6;
                }
                break;
            case KEYWORD_74:
                {
                alt61=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4249:2: (enumLiteral_0= KEYWORD_14 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4249:2: (enumLiteral_0= KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4249:7: enumLiteral_0= KEYWORD_14
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator9380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4255:6: (enumLiteral_1= KEYWORD_15 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4255:6: (enumLiteral_1= KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4255:11: enumLiteral_1= KEYWORD_15
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator9402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:6: (enumLiteral_2= KEYWORD_20 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:6: (enumLiteral_2= KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:11: enumLiteral_2= KEYWORD_20
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComparisonOperator9424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4267:6: (enumLiteral_3= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4267:6: (enumLiteral_3= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4267:11: enumLiteral_3= KEYWORD_22
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleComparisonOperator9446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4273:6: (enumLiteral_4= KEYWORD_21 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4273:6: (enumLiteral_4= KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4273:11: enumLiteral_4= KEYWORD_21
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleComparisonOperator9468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4279:6: (enumLiteral_5= KEYWORD_18 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4279:6: (enumLiteral_5= KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4279:11: enumLiteral_5= KEYWORD_18
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleComparisonOperator9490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4285:6: (enumLiteral_6= KEYWORD_74 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4285:6: (enumLiteral_6= KEYWORD_74 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4285:11: enumLiteral_6= KEYWORD_74
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleComparisonOperator9512); if (state.failed) return current;
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


    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA34_eotS =
        "\10\uffff";
    static final String DFA34_eofS =
        "\6\uffff\1\2\1\uffff";
    static final String DFA34_minS =
        "\2\4\1\uffff\1\30\1\uffff\1\21\1\4\1\30";
    static final String DFA34_maxS =
        "\2\142\1\uffff\1\136\1\uffff\2\142\1\136";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String DFA34_specialS =
        "\10\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\2\1\uffff\2\2\10\uffff\4\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\2\uffff\3\2\12\uffff\2\2\11\uffff\4\2\1\uffff"+
            "\2\2\1\uffff\3\2\10\uffff\1\2\2\uffff\1\1\2\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\2\4\uffff\4\2",
            "\2\2\1\4\2\2\10\4\4\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\3\2\1\uffff\1\4\3\2\3\uffff\1\4\1\uffff\1\4\4\uffff\2"+
            "\2\3\4\3\uffff\3\4\4\2\1\uffff\2\2\1\4\3\2\10\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2\1\3\2\2",
            "",
            "\1\2\56\uffff\5\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\6\2\2\1"+
            "\uffff\1\2\1\5\1\2\2\uffff\3\2",
            "",
            "\4\2\4\uffff\1\2\3\uffff\1\2\2\uffff\2\2\2\uffff\3\2\13\uffff"+
            "\1\2\11\uffff\4\2\2\uffff\1\2\17\uffff\1\2\15\uffff\1\7\2\2",
            "\2\4\1\uffff\2\4\10\uffff\4\4\2\2\1\uffff\1\2\1\4\1\2\1\4\1"+
            "\2\1\4\1\uffff\3\4\2\uffff\3\4\1\2\3\uffff\1\2\1\uffff\3\2\1"+
            "\uffff\2\4\3\uffff\3\2\3\uffff\4\4\1\2\2\4\1\uffff\3\4\6\2\1"+
            "\uffff\1\2\1\uffff\2\2\1\4\7\2\1\4\1\uffff\3\2\1\uffff\3\4",
            "\1\2\56\uffff\5\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\6\2\2\1"+
            "\uffff\1\2\1\5\1\2\2\uffff\3\2"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1960:1: ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSingleStringJDOQL_in_entryRuleSingleStringJDOQL73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStringJDOQL83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSingleStringJDOQL129 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSingleStringJDOQL150 = new BitSet(new long[]{0x0001E80010400002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSingleStringJDOQL171 = new BitSet(new long[]{0x0000E80010400002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_ruleSingleStringJDOQL193 = new BitSet(new long[]{0x0000E80000400002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_ruleSingleStringJDOQL215 = new BitSet(new long[]{0x0000E80000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_ruleSingleStringJDOQL237 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSingleStringJDOQL259 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSingleStringJDOQL281 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_ruleSingleStringJDOQL303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleSelectClause399 = new BitSet(new long[]{0xF1060273EA1E01B2L,0x0000000784A48076L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSelectClause417 = new BitSet(new long[]{0xF1060073EA1E01B2L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleResultClause_in_ruleSelectClause450 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSelectClause472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleResultClause562 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause609 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleIntoClause714 = new BitSet(new long[]{0x001010000001FE40L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleResultNaming_in_ruleResultSpec849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleResultNaming933 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultNaming949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleFromClause1037 = new BitSet(new long[]{0x001010000001FE40L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleFromClause1057 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleFromClause1077 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleFromClause1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleWhereClause1185 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleVariablesClause1288 = new BitSet(new long[]{0x0E3814080001FE40L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1308 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1322 = new BitSet(new long[]{0x0E3814080001FE40L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1342 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleParametersClause1648 = new BitSet(new long[]{0x0E3814080001FE40L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1682 = new BitSet(new long[]{0x0E3814080001FE40L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2117 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2131 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2151 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleImportDeclaration2253 = new BitSet(new long[]{0x001010000001FE40L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleGroupByClause2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleGroupByClause2379 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2399 = new BitSet(new long[]{0x0000008000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2413 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2433 = new BitSet(new long[]{0x0000008000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2449 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleHavingClause2555 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOrderByClause2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleOrderByClause2670 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2704 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec2836 = new BitSet(new long[]{0x0040000004200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleRangeClause2939 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleRangeClause2972 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3087 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3112 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3229 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression3254 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3371 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression3396 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3416 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3513 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3538 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3558 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3655 = new BitSet(new long[]{0x0000000001000002L,0x0000000030000E80L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3688 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3709 = new BitSet(new long[]{0x0000000001000002L,0x0000000030000E80L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3806 = new BitSet(new long[]{0x0000000000000002L,0x0000000000A00000L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3839 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3860 = new BitSet(new long[]{0x0000000000000002L,0x0000000000A00000L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3957 = new BitSet(new long[]{0x0000000000000002L,0x0000000002110000L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3990 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4011 = new BitSet(new long[]{0x0000000000000002L,0x0000000002110000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnaryExpression4097 = new BitSet(new long[]{0x0E3814080001FE40L,0x0000000100000008L});
    public static final BitSet FOLLOW_ruleType_in_ruleUnaryExpression4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUnaryExpression4130 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression4179 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4328 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4353 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4373 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleParameterOrFieldOrMethodExpression4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4551 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_ruleParameterOrFieldOrMethodExpression4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleFieldOrMethodExpression4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_ruleFieldOrMethodExpression4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_entryRuleStaticMethodExpression4876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodExpression4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleStaticMethodExpression4937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4949 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression4969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleStaticMethodExpression5014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5026 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_90_in_ruleStaticMethodExpression5091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5103 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleStaticMethodExpression5168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5180 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_92_in_ruleStaticMethodExpression5245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5257 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_91_in_ruleStaticMethodExpression5322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5334 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleStaticMethodExpression5399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5411 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStaticMethodExpression5429 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleStaticMethodExpression5507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5519 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStaticMethodExpression5537 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleStaticMethodExpression5615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5627 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleStaticMethodExpression5692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5704 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleStaticMethodExpression5769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5781 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStaticMethodExpression5799 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression5880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodExpression5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleMethodExpression5941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression5953 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression5973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleMethodExpression6018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleMethodExpression6074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleMethodExpression6130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6142 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleMethodExpression6207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6219 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleMethodExpression6284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6296 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleMethodExpression6361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6373 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleMethodExpression6438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6450 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMethodExpression6515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6527 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleMethodExpression6592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleMethodExpression6648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleMethodExpression6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6716 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression6750 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleMethodExpression6817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression6829 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression6863 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression6883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthesesExpression6981 = new BitSet(new long[]{0xF0060073EA1E01B0L,0x0000000784A48076L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression7005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthesesExpression7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType7052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleType7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType7188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rulePrimitiveType7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType7310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_ruleNumericType7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_ruleNumericType7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType7446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleIntegralType7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleIntegralType7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleIntegralType7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleIntegralType7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleIntegralType7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType7611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleFloatingPointType7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleFloatingPointType7679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral7719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral7769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral7813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral7907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral7918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleBooleanLiteral7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleBooleanLiteral7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNullLiteral8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier8304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier8315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleQualifiedIdentifier8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleQualifiedIdentifier8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_ruleQualifiedIdentifier8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleQualifiedIdentifier8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleQualifiedIdentifier8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleQualifiedIdentifier8448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleQualifiedIdentifier8467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleQualifiedIdentifier8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleQualifiedIdentifier8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleQualifiedIdentifier8525 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8540 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier8559 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8574 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleQualifiedIdentifier8602 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8617 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier8636 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8651 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8681 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier8700 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier8715 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName8763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName8864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderByDirection8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleOrderByDirection9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleOrderByDirection9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleOrderByDirection9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryOperator9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryOperator9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryOperator9142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleUnaryOperator9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditionOperator9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditionOperator9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator9330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator9380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComparisonOperator9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleComparisonOperator9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleComparisonOperator9468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleComparisonOperator9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleComparisonOperator9512 = new BitSet(new long[]{0x0000000000000002L});

}