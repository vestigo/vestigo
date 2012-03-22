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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_129", "KEYWORD_128", "KEYWORD_127", "KEYWORD_125", "KEYWORD_126", "KEYWORD_119", "KEYWORD_120", "KEYWORD_121", "KEYWORD_122", "KEYWORD_123", "KEYWORD_124", "KEYWORD_113", "KEYWORD_114", "KEYWORD_115", "KEYWORD_116", "KEYWORD_117", "KEYWORD_118", "KEYWORD_111", "KEYWORD_112", "KEYWORD_108", "KEYWORD_109", "KEYWORD_110", "KEYWORD_106", "KEYWORD_107", "KEYWORD_104", "KEYWORD_105", "KEYWORD_102", "KEYWORD_103", "KEYWORD_99", "KEYWORD_100", "KEYWORD_101", "KEYWORD_92", "KEYWORD_93", "KEYWORD_94", "KEYWORD_95", "KEYWORD_96", "KEYWORD_97", "KEYWORD_98", "KEYWORD_82", "KEYWORD_83", "KEYWORD_84", "KEYWORD_85", "KEYWORD_86", "KEYWORD_87", "KEYWORD_88", "KEYWORD_89", "KEYWORD_90", "KEYWORD_91", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_80", "KEYWORD_81", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=133;
    public static final int RULE_ANY_OTHER=139;
    public static final int KEYWORD_56=74;
    public static final int KEYWORD_55=73;
    public static final int KEYWORD_54=72;
    public static final int KEYWORD_53=71;
    public static final int KEYWORD_127=6;
    public static final int KEYWORD_52=89;
    public static final int KEYWORD_128=5;
    public static final int KEYWORD_51=88;
    public static final int KEYWORD_129=4;
    public static final int KEYWORD_50=87;
    public static final int EOF=-1;
    public static final int KEYWORD_59=77;
    public static final int KEYWORD_58=76;
    public static final int KEYWORD_57=75;
    public static final int KEYWORD_65=65;
    public static final int KEYWORD_64=64;
    public static final int KEYWORD_67=67;
    public static final int KEYWORD_66=66;
    public static final int KEYWORD_61=79;
    public static final int KEYWORD_60=78;
    public static final int KEYWORD_63=63;
    public static final int KEYWORD_62=80;
    public static final int KEYWORD_69=69;
    public static final int KEYWORD_68=68;
    public static final int KEYWORD_111=21;
    public static final int KEYWORD_110=25;
    public static final int KEYWORD_113=15;
    public static final int KEYWORD_112=22;
    public static final int KEYWORD_115=17;
    public static final int KEYWORD_114=16;
    public static final int KEYWORD_105=29;
    public static final int KEYWORD_30=105;
    public static final int KEYWORD_106=26;
    public static final int KEYWORD_107=27;
    public static final int KEYWORD_108=23;
    public static final int KEYWORD_34=91;
    public static final int KEYWORD_109=24;
    public static final int KEYWORD_33=90;
    public static final int KEYWORD_32=107;
    public static final int KEYWORD_31=106;
    public static final int KEYWORD_38=95;
    public static final int KEYWORD_37=94;
    public static final int KEYWORD_36=93;
    public static final int KEYWORD_35=92;
    public static final int RULE_ML_COMMENT=136;
    public static final int KEYWORD_39=96;
    public static final int RULE_STRING=135;
    public static final int KEYWORD_122=12;
    public static final int KEYWORD_121=11;
    public static final int KEYWORD_120=10;
    public static final int KEYWORD_126=8;
    public static final int KEYWORD_125=7;
    public static final int KEYWORD_124=14;
    public static final int KEYWORD_123=13;
    public static final int KEYWORD_118=20;
    public static final int KEYWORD_119=9;
    public static final int KEYWORD_41=98;
    public static final int KEYWORD_116=18;
    public static final int KEYWORD_40=97;
    public static final int KEYWORD_117=19;
    public static final int KEYWORD_43=100;
    public static final int KEYWORD_42=99;
    public static final int KEYWORD_45=82;
    public static final int KEYWORD_44=81;
    public static final int KEYWORD_47=84;
    public static final int KEYWORD_46=83;
    public static final int KEYWORD_49=86;
    public static final int KEYWORD_48=85;
    public static final int KEYWORD_97=40;
    public static final int KEYWORD_98=41;
    public static final int KEYWORD_99=32;
    public static final int KEYWORD_93=36;
    public static final int KEYWORD_94=37;
    public static final int KEYWORD_95=38;
    public static final int KEYWORD_96=39;
    public static final int KEYWORD_19=109;
    public static final int KEYWORD_90=50;
    public static final int KEYWORD_17=132;
    public static final int KEYWORD_92=35;
    public static final int KEYWORD_18=108;
    public static final int KEYWORD_91=51;
    public static final int KEYWORD_15=130;
    public static final int KEYWORD_16=131;
    public static final int KEYWORD_13=128;
    public static final int KEYWORD_14=129;
    public static final int KEYWORD_11=126;
    public static final int KEYWORD_12=127;
    public static final int KEYWORD_10=125;
    public static final int KEYWORD_103=31;
    public static final int KEYWORD_104=28;
    public static final int KEYWORD_101=34;
    public static final int KEYWORD_102=30;
    public static final int KEYWORD_100=33;
    public static final int KEYWORD_6=121;
    public static final int KEYWORD_7=122;
    public static final int KEYWORD_8=123;
    public static final int KEYWORD_9=124;
    public static final int KEYWORD_28=103;
    public static final int KEYWORD_29=104;
    public static final int RULE_INT=134;
    public static final int KEYWORD_24=114;
    public static final int KEYWORD_25=115;
    public static final int KEYWORD_26=101;
    public static final int KEYWORD_27=102;
    public static final int KEYWORD_20=110;
    public static final int KEYWORD_21=111;
    public static final int KEYWORD_22=112;
    public static final int KEYWORD_23=113;
    public static final int KEYWORD_79=60;
    public static final int KEYWORD_71=52;
    public static final int KEYWORD_72=53;
    public static final int KEYWORD_73=54;
    public static final int KEYWORD_74=55;
    public static final int KEYWORD_75=56;
    public static final int KEYWORD_76=57;
    public static final int KEYWORD_77=58;
    public static final int KEYWORD_78=59;
    public static final int KEYWORD_1=116;
    public static final int KEYWORD_5=120;
    public static final int KEYWORD_4=119;
    public static final int KEYWORD_70=70;
    public static final int KEYWORD_3=118;
    public static final int KEYWORD_2=117;
    public static final int RULE_SL_COMMENT=137;
    public static final int KEYWORD_84=44;
    public static final int KEYWORD_85=45;
    public static final int KEYWORD_82=42;
    public static final int KEYWORD_83=43;
    public static final int KEYWORD_88=48;
    public static final int KEYWORD_89=49;
    public static final int KEYWORD_86=46;
    public static final int KEYWORD_87=47;
    public static final int KEYWORD_81=62;
    public static final int KEYWORD_80=61;
    public static final int RULE_WS=138;

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

            if ( (LA1_0==KEYWORD_47) ) {
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

            if ( (LA2_0==KEYWORD_88) ) {
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

            if ( (LA3_0==KEYWORD_94) ) {
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

            if ( (LA4_0==KEYWORD_60) ) {
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

            if ( (LA5_0==KEYWORD_44) ) {
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

            if ( (LA6_0==KEYWORD_45) ) {
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

            if ( (LA7_0==KEYWORD_46) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:260:1: ruleSelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:263:28: ( ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
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

            otherlv_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSelectClause399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:278:1: ( (lv_isUnique_2_0= KEYWORD_55 ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_55) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_55 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:279:1: (lv_isUnique_2_0= KEYWORD_55 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:280:3: lv_isUnique_2_0= KEYWORD_55
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleSelectClause417); if (state.failed) return current;
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

            if ( ((LA9_0>=KEYWORD_129 && LA9_0<=KEYWORD_126)||(LA9_0>=KEYWORD_120 && LA9_0<=KEYWORD_118)||LA9_0==KEYWORD_108||(LA9_0>=KEYWORD_102 && LA9_0<=KEYWORD_101)||LA9_0==KEYWORD_93||(LA9_0>=KEYWORD_97 && LA9_0<=KEYWORD_98)||(LA9_0>=KEYWORD_83 && LA9_0<=KEYWORD_87)||(LA9_0>=KEYWORD_89 && LA9_0<=KEYWORD_81)||(LA9_0>=KEYWORD_65 && LA9_0<=KEYWORD_70)||LA9_0==KEYWORD_56||(LA9_0>=KEYWORD_58 && LA9_0<=KEYWORD_59)||LA9_0==KEYWORD_62||(LA9_0>=KEYWORD_48 && LA9_0<=KEYWORD_49)||(LA9_0>=KEYWORD_39 && LA9_0<=KEYWORD_43)||(LA9_0>=KEYWORD_27 && LA9_0<=KEYWORD_28)||(LA9_0>=KEYWORD_30 && LA9_0<=KEYWORD_32)||LA9_0==KEYWORD_1||LA9_0==KEYWORD_4||LA9_0==KEYWORD_7||LA9_0==KEYWORD_9||LA9_0==KEYWORD_12||(LA9_0>=KEYWORD_17 && LA9_0<=RULE_STRING)) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:347:1: ruleResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) ;
    public final EObject ruleResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        EObject lv_resultSpecs_1_0 = null;

        EObject lv_resultSpecs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:350:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:1: ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:351:2: ( (lv_isDistinct_0_0= KEYWORD_71 ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_71) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_71 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:352:1: (lv_isDistinct_0_0= KEYWORD_71 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:353:3: lv_isDistinct_0_0= KEYWORD_71
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleResultClause562); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:564:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExcludeSubclasses_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_candidateClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:28: ( (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:569:2: otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )?
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:2: ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_63) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:591:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:592:1: (lv_isExcludeSubclasses_2_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:593:3: lv_isExcludeSubclasses_2_0= KEYWORD_63
                    {
                    lv_isExcludeSubclasses_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleFromClause1077); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,KEYWORD_95,FOLLOW_KEYWORD_95_in_ruleFromClause1101); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:629:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:632:28: ( (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:633:1: (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:634:2: otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleWhereClause1185); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:673:1: ruleVariablesClause returns [EObject current=null] : (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) ;
    public final EObject ruleVariablesClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:676:28: ( (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:677:1: (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:678:2: otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleVariablesClause1288); if (state.failed) return current;
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

                    if ( (LA15_1==KEYWORD_119||(LA15_1>=KEYWORD_111 && LA15_1<=KEYWORD_112)||(LA15_1>=KEYWORD_109 && LA15_1<=KEYWORD_105)||LA15_1==KEYWORD_64||LA15_1==KEYWORD_57||LA15_1==KEYWORD_61||(LA15_1>=KEYWORD_50 && LA15_1<=KEYWORD_52)||(LA15_1>=KEYWORD_36 && LA15_1<=KEYWORD_38)||LA15_1==KEYWORD_29||LA15_1==RULE_ID) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:831:1: ruleParametersClause returns [EObject current=null] : (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleParametersClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:834:28: ( (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:835:1: (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:836:2: otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_94,FOLLOW_KEYWORD_94_in_ruleParametersClause1648); if (state.failed) return current;
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

                    if ( (LA17_1==KEYWORD_119||(LA17_1>=KEYWORD_111 && LA17_1<=KEYWORD_112)||(LA17_1>=KEYWORD_109 && LA17_1<=KEYWORD_105)||LA17_1==KEYWORD_64||LA17_1==KEYWORD_57||LA17_1==KEYWORD_61||(LA17_1>=KEYWORD_50 && LA17_1<=KEYWORD_52)||(LA17_1>=KEYWORD_36 && LA17_1<=KEYWORD_38)||LA17_1==KEYWORD_29||LA17_1==RULE_ID) ) {
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

                    if ( (LA19_1==KEYWORD_60) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1089:1: ruleImportDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleImportDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1093:6: ( (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1094:1: (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1095:2: kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier
            {
            kw=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleImportDeclaration2253); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1128:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1131:28: ( (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1132:1: (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1133:2: otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleGroupByClause2367); if (state.failed) return current;
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

                    if ( ((LA21_1>=KEYWORD_129 && LA21_1<=KEYWORD_126)||(LA21_1>=KEYWORD_120 && LA21_1<=KEYWORD_118)||LA21_1==KEYWORD_108||(LA21_1>=KEYWORD_102 && LA21_1<=KEYWORD_101)||LA21_1==KEYWORD_93||(LA21_1>=KEYWORD_97 && LA21_1<=KEYWORD_98)||(LA21_1>=KEYWORD_83 && LA21_1<=KEYWORD_87)||(LA21_1>=KEYWORD_89 && LA21_1<=KEYWORD_91)||(LA21_1>=KEYWORD_72 && LA21_1<=KEYWORD_81)||(LA21_1>=KEYWORD_65 && LA21_1<=KEYWORD_70)||LA21_1==KEYWORD_56||(LA21_1>=KEYWORD_58 && LA21_1<=KEYWORD_59)||LA21_1==KEYWORD_62||(LA21_1>=KEYWORD_48 && LA21_1<=KEYWORD_49)||(LA21_1>=KEYWORD_39 && LA21_1<=KEYWORD_43)||(LA21_1>=KEYWORD_27 && LA21_1<=KEYWORD_28)||(LA21_1>=KEYWORD_30 && LA21_1<=KEYWORD_32)||LA21_1==KEYWORD_1||LA21_1==KEYWORD_4||LA21_1==KEYWORD_7||LA21_1==KEYWORD_9||LA21_1==KEYWORD_12||(LA21_1>=KEYWORD_17 && LA21_1<=RULE_STRING)) ) {
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

            if ( (LA23_0==KEYWORD_53) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1223:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1226:28: ( (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1227:1: (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1228:2: otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleHavingClause2555); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1267:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1270:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1272:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleOrderByClause2658); if (state.failed) return current;
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

                    if ( ((LA24_1>=KEYWORD_129 && LA24_1<=KEYWORD_126)||(LA24_1>=KEYWORD_120 && LA24_1<=KEYWORD_118)||LA24_1==KEYWORD_108||(LA24_1>=KEYWORD_102 && LA24_1<=KEYWORD_101)||LA24_1==KEYWORD_93||(LA24_1>=KEYWORD_97 && LA24_1<=KEYWORD_98)||(LA24_1>=KEYWORD_83 && LA24_1<=KEYWORD_87)||(LA24_1>=KEYWORD_89 && LA24_1<=KEYWORD_91)||(LA24_1>=KEYWORD_72 && LA24_1<=KEYWORD_81)||(LA24_1>=KEYWORD_65 && LA24_1<=KEYWORD_70)||LA24_1==KEYWORD_56||(LA24_1>=KEYWORD_58 && LA24_1<=KEYWORD_59)||LA24_1==KEYWORD_62||(LA24_1>=KEYWORD_48 && LA24_1<=KEYWORD_49)||(LA24_1>=KEYWORD_39 && LA24_1<=KEYWORD_43)||(LA24_1>=KEYWORD_27 && LA24_1<=KEYWORD_28)||(LA24_1>=KEYWORD_30 && LA24_1<=KEYWORD_32)||LA24_1==KEYWORD_1||LA24_1==KEYWORD_4||LA24_1==KEYWORD_7||LA24_1==KEYWORD_9||LA24_1==KEYWORD_12||(LA24_1>=KEYWORD_17 && LA24_1<=RULE_STRING)) ) {
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1395:1: ruleRangeClause returns [EObject current=null] : (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleRangeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1398:28: ( (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1399:1: (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1400:2: otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleRangeClause2939); if (state.failed) return current;
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

                if ( (LA30_0==KEYWORD_96||LA30_0==KEYWORD_18||(LA30_0>=KEYWORD_20 && LA30_0<=KEYWORD_22)||(LA30_0>=KEYWORD_14 && LA30_0<=KEYWORD_15)) ) {
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

            if ( ((LA36_0>=KEYWORD_129 && LA36_0<=KEYWORD_126)||(LA36_0>=KEYWORD_120 && LA36_0<=KEYWORD_118)||LA36_0==KEYWORD_93||(LA36_0>=KEYWORD_83 && LA36_0<=KEYWORD_87)||(LA36_0>=KEYWORD_72 && LA36_0<=KEYWORD_77)||LA36_0==KEYWORD_48||LA36_0==KEYWORD_27||(LA36_0>=KEYWORD_30 && LA36_0<=KEYWORD_32)) ) {
                alt36=1;
            }
            else if ( (LA36_0==KEYWORD_108||(LA36_0>=KEYWORD_102 && LA36_0<=KEYWORD_101)||(LA36_0>=KEYWORD_97 && LA36_0<=KEYWORD_98)||(LA36_0>=KEYWORD_89 && LA36_0<=KEYWORD_91)||(LA36_0>=KEYWORD_78 && LA36_0<=KEYWORD_81)||(LA36_0>=KEYWORD_65 && LA36_0<=KEYWORD_70)||LA36_0==KEYWORD_56||(LA36_0>=KEYWORD_58 && LA36_0<=KEYWORD_59)||LA36_0==KEYWORD_62||LA36_0==KEYWORD_49||(LA36_0>=KEYWORD_39 && LA36_0<=KEYWORD_43)||LA36_0==KEYWORD_28||LA36_0==KEYWORD_4||LA36_0==KEYWORD_12||(LA36_0>=RULE_ID && LA36_0<=RULE_STRING)) ) {
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
            case KEYWORD_49:
            case KEYWORD_39:
            case KEYWORD_43:
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
            case KEYWORD_108:
            case KEYWORD_102:
            case KEYWORD_103:
            case KEYWORD_99:
            case KEYWORD_100:
            case KEYWORD_101:
            case KEYWORD_97:
            case KEYWORD_98:
            case KEYWORD_89:
            case KEYWORD_90:
            case KEYWORD_91:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_56:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_62:
            case KEYWORD_40:
            case KEYWORD_42:
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
            case KEYWORD_49:
            case KEYWORD_39:
            case KEYWORD_43:
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
            case KEYWORD_108:
            case KEYWORD_102:
            case KEYWORD_103:
            case KEYWORD_99:
            case KEYWORD_100:
            case KEYWORD_101:
            case KEYWORD_97:
            case KEYWORD_98:
            case KEYWORD_89:
            case KEYWORD_90:
            case KEYWORD_91:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_56:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_62:
            case KEYWORD_40:
            case KEYWORD_42:
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2376:1: ruleStaticMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) ) ;
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
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_79=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token otherlv_84=null;
        Token otherlv_86=null;
        Token otherlv_87=null;
        Token otherlv_89=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token otherlv_94=null;
        Token otherlv_96=null;
        Token otherlv_97=null;
        Token otherlv_99=null;
        Token otherlv_101=null;
        Token otherlv_102=null;
        Token otherlv_104=null;
        Token otherlv_106=null;
        Token otherlv_107=null;
        Token otherlv_109=null;
        Token otherlv_111=null;
        Token otherlv_112=null;
        Token otherlv_114=null;
        Token otherlv_116=null;
        Token otherlv_117=null;
        Token otherlv_119=null;
        Token otherlv_121=null;
        Token otherlv_122=null;
        Token otherlv_124=null;
        Token otherlv_126=null;
        Token otherlv_127=null;
        Token otherlv_129=null;
        Token otherlv_131=null;
        Token otherlv_132=null;
        Token otherlv_134=null;
        Token otherlv_136=null;
        Token otherlv_137=null;
        Token otherlv_139=null;
        Token otherlv_141=null;
        Token otherlv_142=null;
        Token lv_isDistinct_143_0=null;
        Token otherlv_145=null;
        Token otherlv_147=null;
        Token otherlv_148=null;
        Token lv_isDistinct_149_0=null;
        Token otherlv_151=null;
        Token otherlv_153=null;
        Token otherlv_154=null;
        Token otherlv_156=null;
        Token otherlv_158=null;
        Token otherlv_159=null;
        Token otherlv_161=null;
        Token otherlv_163=null;
        Token otherlv_164=null;
        Token lv_isDistinct_165_0=null;
        Token otherlv_167=null;
        EObject lv_number_3_0 = null;

        EObject lv_number_8_0 = null;

        EObject lv_number_13_0 = null;

        EObject lv_number_18_0 = null;

        EObject lv_number_23_0 = null;

        EObject lv_number_28_0 = null;

        EObject lv_number_33_0 = null;

        EObject lv_number_38_0 = null;

        EObject lv_number_43_0 = null;

        EObject lv_number_48_0 = null;

        EObject lv_number_53_0 = null;

        EObject lv_number_58_0 = null;

        EObject lv_number_63_0 = null;

        EObject lv_number_68_0 = null;

        EObject lv_number_73_0 = null;

        EObject lv_number_78_0 = null;

        EObject lv_number_83_0 = null;

        EObject lv_number_88_0 = null;

        EObject lv_number_93_0 = null;

        EObject lv_number_98_0 = null;

        EObject lv_number_103_0 = null;

        EObject lv_number_108_0 = null;

        EObject lv_number_113_0 = null;

        EObject lv_number_118_0 = null;

        EObject lv_persistable_123_0 = null;

        EObject lv_persistable_128_0 = null;

        EObject lv_persistable_133_0 = null;

        EObject lv_persistable_138_0 = null;

        EObject lv_aggregateArgument_144_0 = null;

        EObject lv_aggregateArgument_150_0 = null;

        EObject lv_aggregateArgument_155_0 = null;

        EObject lv_aggregateArgument_160_0 = null;

        EObject lv_aggregateArgument_166_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2379:28: ( ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:1: ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:1: ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) )
            int alt42=33;
            switch ( input.LA(1) ) {
            case KEYWORD_72:
                {
                alt42=1;
                }
                break;
            case KEYWORD_87:
                {
                alt42=2;
                }
                break;
            case KEYWORD_73:
                {
                alt42=3;
                }
                break;
            case KEYWORD_76:
                {
                alt42=4;
                }
                break;
            case KEYWORD_77:
                {
                alt42=5;
                }
                break;
            case KEYWORD_83:
                {
                alt42=6;
                }
                break;
            case KEYWORD_84:
                {
                alt42=7;
                }
                break;
            case KEYWORD_85:
                {
                alt42=8;
                }
                break;
            case KEYWORD_86:
                {
                alt42=9;
                }
                break;
            case KEYWORD_74:
                {
                alt42=10;
                }
                break;
            case KEYWORD_93:
                {
                alt42=11;
                }
                break;
            case KEYWORD_75:
                {
                alt42=12;
                }
                break;
            case KEYWORD_113:
                {
                alt42=13;
                }
                break;
            case KEYWORD_124:
                {
                alt42=14;
                }
                break;
            case KEYWORD_114:
                {
                alt42=15;
                }
                break;
            case KEYWORD_117:
                {
                alt42=16;
                }
                break;
            case KEYWORD_118:
                {
                alt42=17;
                }
                break;
            case KEYWORD_120:
                {
                alt42=18;
                }
                break;
            case KEYWORD_121:
                {
                alt42=19;
                }
                break;
            case KEYWORD_122:
                {
                alt42=20;
                }
                break;
            case KEYWORD_123:
                {
                alt42=21;
                }
                break;
            case KEYWORD_115:
                {
                alt42=22;
                }
                break;
            case KEYWORD_126:
                {
                alt42=23;
                }
                break;
            case KEYWORD_116:
                {
                alt42=24;
                }
                break;
            case KEYWORD_127:
                {
                alt42=25;
                }
                break;
            case KEYWORD_125:
                {
                alt42=26;
                }
                break;
            case KEYWORD_129:
                {
                alt42=27;
                }
                break;
            case KEYWORD_128:
                {
                alt42=28;
                }
                break;
            case KEYWORD_48:
                {
                alt42=29;
                }
                break;
            case KEYWORD_32:
                {
                alt42=30;
                }
                break;
            case KEYWORD_31:
                {
                alt42=31;
                }
                break;
            case KEYWORD_30:
                {
                alt42=32;
                }
                break;
            case KEYWORD_27:
                {
                alt42=33;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:2: ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:2: ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2380:3: () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
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

                    otherlv_1=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleStaticMethodExpression4937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStaticMethodExpressionAccess().getMathAbsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2399:1: ( (lv_number_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2400:1: (lv_number_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2400:1: (lv_number_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2401:3: lv_number_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression4969);
                    lv_number_3_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_3_0, 
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:6: ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:6: ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2423:7: () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5
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

                    otherlv_6=(Token)match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleStaticMethodExpression5014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStaticMethodExpressionAccess().getMathSqrtKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2442:1: ( (lv_number_8_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2443:1: (lv_number_8_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2443:1: (lv_number_8_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:3: lv_number_8_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5046);
                    lv_number_8_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_8_0, 
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:6: ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:6: ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2466:7: () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5
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

                    otherlv_11=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleStaticMethodExpression5091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStaticMethodExpressionAccess().getMathCosKeyword_2_1());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2485:1: ( (lv_number_13_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2486:1: (lv_number_13_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2486:1: (lv_number_13_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2487:3: lv_number_13_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5123);
                    lv_number_13_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_13_0, 
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:6: ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:6: ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2509:7: () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5
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

                    otherlv_16=(Token)match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleStaticMethodExpression5168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStaticMethodExpressionAccess().getMathSinKeyword_3_1());
                          
                    }
                    otherlv_17=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2528:1: ( (lv_number_18_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2529:1: (lv_number_18_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2529:1: (lv_number_18_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2530:3: lv_number_18_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5200);
                    lv_number_18_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_18_0, 
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:6: ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:6: ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2552:7: () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5
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

                    otherlv_21=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleStaticMethodExpression5245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStaticMethodExpressionAccess().getMathTanKeyword_4_1());
                          
                    }
                    otherlv_22=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2571:1: ( (lv_number_23_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2572:1: (lv_number_23_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2572:1: (lv_number_23_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2573:3: lv_number_23_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5277);
                    lv_number_23_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_23_0, 
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:6: ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:6: ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2595:7: () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5
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

                    otherlv_26=(Token)match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleStaticMethodExpression5322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStaticMethodExpressionAccess().getMathAcosKeyword_5_1());
                          
                    }
                    otherlv_27=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2614:1: ( (lv_number_28_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:1: (lv_number_28_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:1: (lv_number_28_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2616:3: lv_number_28_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5354);
                    lv_number_28_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_28_0, 
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:6: ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:6: ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2638:7: () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5
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

                    otherlv_31=(Token)match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleStaticMethodExpression5399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getStaticMethodExpressionAccess().getMathAsinKeyword_6_1());
                          
                    }
                    otherlv_32=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2657:1: ( (lv_number_33_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:1: (lv_number_33_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2658:1: (lv_number_33_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2659:3: lv_number_33_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5431);
                    lv_number_33_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_33_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_6_4());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2681:6: ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2681:6: ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2681:7: () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2681:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2682:2: 
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

                    otherlv_36=(Token)match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleStaticMethodExpression5476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getStaticMethodExpressionAccess().getMathAtanKeyword_7_1());
                          
                    }
                    otherlv_37=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2700:1: ( (lv_number_38_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2701:1: (lv_number_38_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2701:1: (lv_number_38_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2702:3: lv_number_38_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5508);
                    lv_number_38_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_38_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_39=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2724:6: ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2724:6: ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2724:7: () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2724:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2725:2: 
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

                    otherlv_41=(Token)match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleStaticMethodExpression5553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getStaticMethodExpressionAccess().getMathCeilKeyword_8_1());
                          
                    }
                    otherlv_42=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2743:1: ( (lv_number_43_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2744:1: (lv_number_43_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2744:1: (lv_number_43_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2745:3: lv_number_43_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5585);
                    lv_number_43_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_43_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_44=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2767:6: ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2767:6: ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2767:7: () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2767:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2768:2: 
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

                    otherlv_46=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleStaticMethodExpression5630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getStaticMethodExpressionAccess().getMathExpKeyword_9_1());
                          
                    }
                    otherlv_47=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2786:1: ( (lv_number_48_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2787:1: (lv_number_48_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2787:1: (lv_number_48_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2788:3: lv_number_48_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5662);
                    lv_number_48_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_48_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_49=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2810:6: ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2810:6: ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2810:7: () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2810:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2811:2: 
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

                    otherlv_51=(Token)match(input,KEYWORD_93,FOLLOW_KEYWORD_93_in_ruleStaticMethodExpression5707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_51, grammarAccess.getStaticMethodExpressionAccess().getMathFloorKeyword_10_1());
                          
                    }
                    otherlv_52=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2829:1: ( (lv_number_53_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2830:1: (lv_number_53_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2830:1: (lv_number_53_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2831:3: lv_number_53_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_10_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5739);
                    lv_number_53_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_53_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_54=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_54, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_10_4());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2853:6: ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2853:6: ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2853:7: () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2853:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2854:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_11_0(),
                                  current);
                          
                    }

                    }

                    otherlv_56=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleStaticMethodExpression5784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_56, grammarAccess.getStaticMethodExpressionAccess().getMathLogKeyword_11_1());
                          
                    }
                    otherlv_57=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_11_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2872:1: ( (lv_number_58_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:1: (lv_number_58_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2873:1: (lv_number_58_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2874:3: lv_number_58_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5816);
                    lv_number_58_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_58_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_59=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_59, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_11_4());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2896:6: ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2896:6: ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2896:7: () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2896:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2897:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_12_0(),
                                  current);
                          
                    }

                    }

                    otherlv_61=(Token)match(input,KEYWORD_113,FOLLOW_KEYWORD_113_in_ruleStaticMethodExpression5861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_61, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAbsKeyword_12_1());
                          
                    }
                    otherlv_62=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_62, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_12_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2915:1: ( (lv_number_63_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2916:1: (lv_number_63_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2916:1: (lv_number_63_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2917:3: lv_number_63_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5893);
                    lv_number_63_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_63_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_64=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_64, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_12_4());
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2939:6: ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2939:6: ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2939:7: () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2939:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2940:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_13_0(),
                                  current);
                          
                    }

                    }

                    otherlv_66=(Token)match(input,KEYWORD_124,FOLLOW_KEYWORD_124_in_ruleStaticMethodExpression5938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_66, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathSqrtKeyword_13_1());
                          
                    }
                    otherlv_67=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_67, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_13_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2958:1: ( (lv_number_68_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2959:1: (lv_number_68_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2959:1: (lv_number_68_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2960:3: lv_number_68_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5970);
                    lv_number_68_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_68_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_69=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_69, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_13_4());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2982:6: ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2982:6: ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2982:7: () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2982:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2983:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_14_0(),
                                  current);
                          
                    }

                    }

                    otherlv_71=(Token)match(input,KEYWORD_114,FOLLOW_KEYWORD_114_in_ruleStaticMethodExpression6015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_71, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathCosKeyword_14_1());
                          
                    }
                    otherlv_72=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_72, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_14_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3001:1: ( (lv_number_73_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3002:1: (lv_number_73_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3002:1: (lv_number_73_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3003:3: lv_number_73_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6047);
                    lv_number_73_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_73_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_74=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_74, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_14_4());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3025:6: ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3025:6: ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3025:7: () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3025:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3026:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_15_0(),
                                  current);
                          
                    }

                    }

                    otherlv_76=(Token)match(input,KEYWORD_117,FOLLOW_KEYWORD_117_in_ruleStaticMethodExpression6092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_76, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathSinKeyword_15_1());
                          
                    }
                    otherlv_77=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_77, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_15_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3044:1: ( (lv_number_78_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3045:1: (lv_number_78_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3045:1: (lv_number_78_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3046:3: lv_number_78_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_15_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6124);
                    lv_number_78_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_78_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_79=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_79, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_15_4());
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3068:6: ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3068:6: ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3068:7: () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3068:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3069:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_16_0(),
                                  current);
                          
                    }

                    }

                    otherlv_81=(Token)match(input,KEYWORD_118,FOLLOW_KEYWORD_118_in_ruleStaticMethodExpression6169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_81, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathTanKeyword_16_1());
                          
                    }
                    otherlv_82=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_82, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_16_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3087:1: ( (lv_number_83_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3088:1: (lv_number_83_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3088:1: (lv_number_83_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3089:3: lv_number_83_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_16_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6201);
                    lv_number_83_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_83_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_84=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_84, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_16_4());
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3111:6: ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3111:6: ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3111:7: () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3111:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3112:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_17_0(),
                                  current);
                          
                    }

                    }

                    otherlv_86=(Token)match(input,KEYWORD_120,FOLLOW_KEYWORD_120_in_ruleStaticMethodExpression6246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_86, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAcosKeyword_17_1());
                          
                    }
                    otherlv_87=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_87, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_17_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3130:1: ( (lv_number_88_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3131:1: (lv_number_88_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3131:1: (lv_number_88_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3132:3: lv_number_88_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_17_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6278);
                    lv_number_88_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_88_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_89=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_89, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_17_4());
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3154:6: ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3154:6: ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3154:7: () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3154:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3155:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_18_0(),
                                  current);
                          
                    }

                    }

                    otherlv_91=(Token)match(input,KEYWORD_121,FOLLOW_KEYWORD_121_in_ruleStaticMethodExpression6323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_91, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAsinKeyword_18_1());
                          
                    }
                    otherlv_92=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_92, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_18_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3173:1: ( (lv_number_93_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3174:1: (lv_number_93_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3174:1: (lv_number_93_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3175:3: lv_number_93_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_18_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6355);
                    lv_number_93_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_93_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_94=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_94, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_18_4());
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3197:6: ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3197:6: ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3197:7: () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3197:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3198:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_19_0(),
                                  current);
                          
                    }

                    }

                    otherlv_96=(Token)match(input,KEYWORD_122,FOLLOW_KEYWORD_122_in_ruleStaticMethodExpression6400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_96, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAtanKeyword_19_1());
                          
                    }
                    otherlv_97=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_97, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_19_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3216:1: ( (lv_number_98_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3217:1: (lv_number_98_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3217:1: (lv_number_98_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3218:3: lv_number_98_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_19_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6432);
                    lv_number_98_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_98_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_99=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_99, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_19_4());
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3240:6: ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3240:6: ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3240:7: () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3240:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3241:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_20_0(),
                                  current);
                          
                    }

                    }

                    otherlv_101=(Token)match(input,KEYWORD_123,FOLLOW_KEYWORD_123_in_ruleStaticMethodExpression6477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_101, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathCeilKeyword_20_1());
                          
                    }
                    otherlv_102=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_102, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_20_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3259:1: ( (lv_number_103_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3260:1: (lv_number_103_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3260:1: (lv_number_103_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3261:3: lv_number_103_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_20_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6509);
                    lv_number_103_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_103_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_104=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_104, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_20_4());
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3283:6: ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3283:6: ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3283:7: () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3283:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3284:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_21_0(),
                                  current);
                          
                    }

                    }

                    otherlv_106=(Token)match(input,KEYWORD_115,FOLLOW_KEYWORD_115_in_ruleStaticMethodExpression6554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_106, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathExpKeyword_21_1());
                          
                    }
                    otherlv_107=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_107, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_21_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3302:1: ( (lv_number_108_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3303:1: (lv_number_108_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3303:1: (lv_number_108_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3304:3: lv_number_108_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_21_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6586);
                    lv_number_108_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_108_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_109=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_109, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_21_4());
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3326:6: ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3326:6: ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3326:7: () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3326:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3327:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_22_0(),
                                  current);
                          
                    }

                    }

                    otherlv_111=(Token)match(input,KEYWORD_126,FOLLOW_KEYWORD_126_in_ruleStaticMethodExpression6631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_111, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathFloorKeyword_22_1());
                          
                    }
                    otherlv_112=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_112, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_22_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3345:1: ( (lv_number_113_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3346:1: (lv_number_113_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3346:1: (lv_number_113_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3347:3: lv_number_113_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_22_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6663);
                    lv_number_113_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_113_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_114=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_114, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_22_4());
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3369:6: ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3369:6: ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3369:7: () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3369:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3370:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_23_0(),
                                  current);
                          
                    }

                    }

                    otherlv_116=(Token)match(input,KEYWORD_116,FOLLOW_KEYWORD_116_in_ruleStaticMethodExpression6708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_116, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathLogKeyword_23_1());
                          
                    }
                    otherlv_117=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_117, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_23_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3388:1: ( (lv_number_118_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3389:1: (lv_number_118_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3389:1: (lv_number_118_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3390:3: lv_number_118_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_23_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6740);
                    lv_number_118_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_118_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_119=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6753); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_119, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_23_4());
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3412:6: ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3412:6: ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3412:7: () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3412:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3413:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_24_0(),
                                  current);
                          
                    }

                    }

                    otherlv_121=(Token)match(input,KEYWORD_127,FOLLOW_KEYWORD_127_in_ruleStaticMethodExpression6785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_121, grammarAccess.getStaticMethodExpressionAccess().getJDOHelperGetObjectIdKeyword_24_1());
                          
                    }
                    otherlv_122=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_122, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_24_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3431:1: ( (lv_persistable_123_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3432:1: (lv_persistable_123_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3432:1: (lv_persistable_123_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3433:3: lv_persistable_123_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_24_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6817);
                    lv_persistable_123_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_123_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_124=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_124, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_24_4());
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3455:6: ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3455:6: ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3455:7: () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3455:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3456:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_25_0(),
                                  current);
                          
                    }

                    }

                    otherlv_126=(Token)match(input,KEYWORD_125,FOLLOW_KEYWORD_125_in_ruleStaticMethodExpression6862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_126, grammarAccess.getStaticMethodExpressionAccess().getJDOHelperGetVersionKeyword_25_1());
                          
                    }
                    otherlv_127=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_127, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_25_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3474:1: ( (lv_persistable_128_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3475:1: (lv_persistable_128_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3475:1: (lv_persistable_128_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3476:3: lv_persistable_128_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_25_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6894);
                    lv_persistable_128_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_128_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_129=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_129, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_25_4());
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3498:6: ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3498:6: ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3498:7: () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3498:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3499:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_26_0(),
                                  current);
                          
                    }

                    }

                    otherlv_131=(Token)match(input,KEYWORD_129,FOLLOW_KEYWORD_129_in_ruleStaticMethodExpression6939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_131, grammarAccess.getStaticMethodExpressionAccess().getJavaxJdoJDOHelperGetObjectIdKeyword_26_1());
                          
                    }
                    otherlv_132=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_132, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_26_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3517:1: ( (lv_persistable_133_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3518:1: (lv_persistable_133_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3518:1: (lv_persistable_133_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3519:3: lv_persistable_133_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_26_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6971);
                    lv_persistable_133_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_133_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_134=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_134, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_26_4());
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3541:6: ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3541:6: ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3541:7: () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3541:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3542:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_27_0(),
                                  current);
                          
                    }

                    }

                    otherlv_136=(Token)match(input,KEYWORD_128,FOLLOW_KEYWORD_128_in_ruleStaticMethodExpression7016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_136, grammarAccess.getStaticMethodExpressionAccess().getJavaxJdoJDOHelperGetVersionKeyword_27_1());
                          
                    }
                    otherlv_137=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_137, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_27_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3560:1: ( (lv_persistable_138_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3561:1: (lv_persistable_138_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3561:1: (lv_persistable_138_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3562:3: lv_persistable_138_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_27_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7048);
                    lv_persistable_138_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"persistable",
                              		lv_persistable_138_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_139=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_139, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_27_4());
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3584:6: ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3584:6: ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3584:7: () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3584:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3585:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_28_0(),
                                  current);
                          
                    }

                    }

                    otherlv_141=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleStaticMethodExpression7093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_141, grammarAccess.getStaticMethodExpressionAccess().getCountKeyword_28_1());
                          
                    }
                    otherlv_142=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_142, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_28_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3603:1: ( (lv_isDistinct_143_0= KEYWORD_71 ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==KEYWORD_71) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:1: (lv_isDistinct_143_0= KEYWORD_71 )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3604:1: (lv_isDistinct_143_0= KEYWORD_71 )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3605:3: lv_isDistinct_143_0= KEYWORD_71
                            {
                            lv_isDistinct_143_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7123); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isDistinct_143_0, grammarAccess.getStaticMethodExpressionAccess().getIsDistinctDISTINCTKeyword_28_3_0());
                                  
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

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3619:3: ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3620:1: (lv_aggregateArgument_144_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3620:1: (lv_aggregateArgument_144_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3621:3: lv_aggregateArgument_144_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_28_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7156);
                    lv_aggregateArgument_144_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_144_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_145=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_145, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_28_5());
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3643:6: ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3643:6: ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3643:7: () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3643:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3644:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_29_0(),
                                  current);
                          
                    }

                    }

                    otherlv_147=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleStaticMethodExpression7201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_147, grammarAccess.getStaticMethodExpressionAccess().getSumKeyword_29_1());
                          
                    }
                    otherlv_148=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_148, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_29_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3662:1: ( (lv_isDistinct_149_0= KEYWORD_71 ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==KEYWORD_71) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3663:1: (lv_isDistinct_149_0= KEYWORD_71 )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3663:1: (lv_isDistinct_149_0= KEYWORD_71 )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3664:3: lv_isDistinct_149_0= KEYWORD_71
                            {
                            lv_isDistinct_149_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7231); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isDistinct_149_0, grammarAccess.getStaticMethodExpressionAccess().getIsDistinctDISTINCTKeyword_29_3_0());
                                  
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

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3678:3: ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3679:1: (lv_aggregateArgument_150_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3679:1: (lv_aggregateArgument_150_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3680:3: lv_aggregateArgument_150_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_29_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7264);
                    lv_aggregateArgument_150_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_150_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_151=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_151, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_29_5());
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3702:6: ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3702:6: ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3702:7: () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3702:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3703:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_30_0(),
                                  current);
                          
                    }

                    }

                    otherlv_153=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleStaticMethodExpression7309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_153, grammarAccess.getStaticMethodExpressionAccess().getMinKeyword_30_1());
                          
                    }
                    otherlv_154=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_154, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_30_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3721:1: ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3722:1: (lv_aggregateArgument_155_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3722:1: (lv_aggregateArgument_155_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3723:3: lv_aggregateArgument_155_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_30_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7341);
                    lv_aggregateArgument_155_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_155_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_156=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_156, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_30_4());
                          
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3745:6: ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3745:6: ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3745:7: () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3745:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3746:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_31_0(),
                                  current);
                          
                    }

                    }

                    otherlv_158=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleStaticMethodExpression7386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_158, grammarAccess.getStaticMethodExpressionAccess().getMaxKeyword_31_1());
                          
                    }
                    otherlv_159=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_159, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_31_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3764:1: ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3765:1: (lv_aggregateArgument_160_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3765:1: (lv_aggregateArgument_160_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3766:3: lv_aggregateArgument_160_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_31_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7418);
                    lv_aggregateArgument_160_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_160_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_161=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_161, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_31_4());
                          
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3788:6: ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3788:6: ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3788:7: () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3788:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3789:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStaticMethodExpressionAccess().getExpressionAction_32_0(),
                                  current);
                          
                    }

                    }

                    otherlv_163=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleStaticMethodExpression7463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_163, grammarAccess.getStaticMethodExpressionAccess().getAvgKeyword_32_1());
                          
                    }
                    otherlv_164=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_164, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_32_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3807:1: ( (lv_isDistinct_165_0= KEYWORD_71 ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==KEYWORD_71) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3808:1: (lv_isDistinct_165_0= KEYWORD_71 )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3808:1: (lv_isDistinct_165_0= KEYWORD_71 )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3809:3: lv_isDistinct_165_0= KEYWORD_71
                            {
                            lv_isDistinct_165_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7493); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isDistinct_165_0, grammarAccess.getStaticMethodExpressionAccess().getIsDistinctDISTINCTKeyword_32_3_0());
                                  
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

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3823:3: ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3824:1: (lv_aggregateArgument_166_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3824:1: (lv_aggregateArgument_166_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3825:3: lv_aggregateArgument_166_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_32_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7526);
                    lv_aggregateArgument_166_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStaticMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"aggregateArgument",
                              		lv_aggregateArgument_166_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_167=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_167, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_32_5());
                          
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3854:1: entryRuleMethodExpression returns [EObject current=null] : iv_ruleMethodExpression= ruleMethodExpression EOF ;
    public final EObject entryRuleMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3855:2: (iv_ruleMethodExpression= ruleMethodExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3856:2: iv_ruleMethodExpression= ruleMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression7574);
            iv_ruleMethodExpression=ruleMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodExpression7584); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3863:1: ruleMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) ) ;
    public final EObject ruleMethodExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
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
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_77=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_82=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_89=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token otherlv_93=null;
        Token otherlv_95=null;
        Token otherlv_96=null;
        Token otherlv_97=null;
        Token otherlv_99=null;
        Token otherlv_100=null;
        Token otherlv_101=null;
        Token otherlv_103=null;
        Token otherlv_104=null;
        Token otherlv_105=null;
        Token otherlv_107=null;
        Token otherlv_108=null;
        Token otherlv_109=null;
        Token otherlv_111=null;
        Token otherlv_112=null;
        Token otherlv_113=null;
        Token otherlv_115=null;
        Token otherlv_116=null;
        Token otherlv_117=null;
        Token otherlv_119=null;
        Token otherlv_120=null;
        Token otherlv_121=null;
        Token otherlv_123=null;
        Token otherlv_124=null;
        Token otherlv_125=null;
        Token otherlv_127=null;
        Token otherlv_128=null;
        Token otherlv_129=null;
        Token otherlv_131=null;
        Token otherlv_132=null;
        Token otherlv_133=null;
        EObject lv_element_3_0 = null;

        EObject lv_arg_8_0 = null;

        EObject lv_key_21_0 = null;

        EObject lv_value_26_0 = null;

        EObject lv_key_31_0 = null;

        EObject lv_value_33_0 = null;

        EObject lv_index_38_0 = null;

        EObject lv_string_43_0 = null;

        EObject lv_string_48_0 = null;

        EObject lv_string_53_0 = null;

        EObject lv_string_58_0 = null;

        EObject lv_fromIndex_60_0 = null;

        EObject lv_regex_69_0 = null;

        EObject lv_regex_74_0 = null;

        EObject lv_replacement_76_0 = null;

        EObject lv_string_81_0 = null;

        EObject lv_beginIndex_86_0 = null;

        EObject lv_endIndex_88_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3866:28: ( ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3867:1: ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3867:1: ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) )
            int alt45=28;
            switch ( input.LA(1) ) {
            case KEYWORD_78:
                {
                alt45=1;
                }
                break;
            case KEYWORD_28:
                {
                alt45=2;
                }
                break;
            case KEYWORD_68:
                {
                alt45=3;
                }
                break;
            case KEYWORD_40:
                {
                alt45=4;
                }
                break;
            case KEYWORD_99:
                {
                alt45=5;
                }
                break;
            case KEYWORD_103:
                {
                alt45=6;
                }
                break;
            case KEYWORD_102:
                {
                alt45=7;
                }
                break;
            case KEYWORD_56:
                {
                alt45=8;
                }
                break;
            case KEYWORD_79:
                {
                alt45=9;
                }
                break;
            case KEYWORD_58:
                {
                alt45=10;
                }
                break;
            case KEYWORD_108:
                {
                alt45=11;
                }
                break;
            case KEYWORD_67:
                {
                alt45=12;
                }
                break;
            case KEYWORD_62:
                {
                alt45=13;
                }
                break;
            case KEYWORD_69:
                {
                alt45=14;
                }
                break;
            case KEYWORD_97:
                {
                alt45=15;
                }
                break;
            case KEYWORD_98:
                {
                alt45=16;
                }
                break;
            case KEYWORD_91:
                {
                alt45=17;
                }
                break;
            case KEYWORD_100:
                {
                alt45=18;
                }
                break;
            case KEYWORD_101:
                {
                alt45=19;
                }
                break;
            case KEYWORD_42:
                {
                alt45=20;
                }
                break;
            case KEYWORD_59:
                {
                alt45=21;
                }
                break;
            case KEYWORD_80:
                {
                alt45=22;
                }
                break;
            case KEYWORD_66:
                {
                alt45=23;
                }
                break;
            case KEYWORD_65:
                {
                alt45=24;
                }
                break;
            case KEYWORD_89:
                {
                alt45=25;
                }
                break;
            case KEYWORD_90:
                {
                alt45=26;
                }
                break;
            case KEYWORD_70:
                {
                alt45=27;
                }
                break;
            case KEYWORD_81:
                {
                alt45=28;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3867:2: ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3867:2: ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3867:3: () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3867:3: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3868:2: 
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

                    otherlv_1=(Token)match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleMethodExpression7635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMethodExpressionAccess().getContainsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression7647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3886:1: ( (lv_element_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3887:1: (lv_element_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3887:1: (lv_element_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3888:3: lv_element_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getElementConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression7667);
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

                    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression7680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3910:6: ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3910:6: ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3910:7: () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3910:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3911:2: 
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

                    otherlv_6=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleMethodExpression7712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodExpressionAccess().getGetKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression7724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3929:1: ( (lv_arg_8_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3930:1: (lv_arg_8_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3930:1: (lv_arg_8_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3931:3: lv_arg_8_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getArgConditionalOrExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression7744);
                    lv_arg_8_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"arg",
                              		lv_arg_8_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression7757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3953:6: ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3953:6: ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3953:7: () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3953:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3954:2: 
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

                    otherlv_11=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleMethodExpression7789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMethodExpressionAccess().getIsEmptyKeyword_2_1());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression7801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    otherlv_13=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression7813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:6: ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:6: ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:7: () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3979:2: 
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

                    otherlv_15=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleMethodExpression7845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getMethodExpressionAccess().getSizeKeyword_3_1());
                          
                    }
                    otherlv_16=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression7857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    otherlv_17=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression7869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4003:6: ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4003:6: ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4003:7: () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4003:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4004:2: 
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

                    otherlv_19=(Token)match(input,KEYWORD_99,FOLLOW_KEYWORD_99_in_ruleMethodExpression7901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getMethodExpressionAccess().getContainsKeyKeyword_4_1());
                          
                    }
                    otherlv_20=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression7913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4022:1: ( (lv_key_21_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4023:1: (lv_key_21_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4023:1: (lv_key_21_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4024:3: lv_key_21_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getKeyConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression7933);
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

                    otherlv_22=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression7946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:6: ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:6: ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:7: () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4046:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4047:2: 
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

                    otherlv_24=(Token)match(input,KEYWORD_103,FOLLOW_KEYWORD_103_in_ruleMethodExpression7978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getMethodExpressionAccess().getContainsValueKeyword_5_1());
                          
                    }
                    otherlv_25=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression7990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4065:1: ( (lv_value_26_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4066:1: (lv_value_26_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4066:1: (lv_value_26_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4067:3: lv_value_26_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getValueConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8010);
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

                    otherlv_27=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4089:6: ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4089:6: ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4089:7: () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4089:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4090:2: 
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

                    otherlv_29=(Token)match(input,KEYWORD_102,FOLLOW_KEYWORD_102_in_ruleMethodExpression8055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getMethodExpressionAccess().getContainsEntryKeyword_6_1());
                          
                    }
                    otherlv_30=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4108:1: ( (lv_key_31_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4109:1: (lv_key_31_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4109:1: (lv_key_31_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4110:3: lv_key_31_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getKeyConditionalOrExpressionParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8087);
                    lv_key_31_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"key",
                              		lv_key_31_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression8100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getMethodExpressionAccess().getCommaKeyword_6_4());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4131:1: ( (lv_value_33_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4132:1: (lv_value_33_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4132:1: (lv_value_33_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4133:3: lv_value_33_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getValueConditionalOrExpressionParserRuleCall_6_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8120);
                    lv_value_33_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_33_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_6_6());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:6: ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:6: ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:7: () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4155:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4156:2: 
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

                    otherlv_36=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleMethodExpression8165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getMethodExpressionAccess().getCharAtKeyword_7_1());
                          
                    }
                    otherlv_37=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4174:1: ( (lv_index_38_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4175:1: (lv_index_38_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4175:1: (lv_index_38_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4176:3: lv_index_38_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getIndexConditionalOrExpressionParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8197);
                    lv_index_38_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"index",
                              		lv_index_38_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_39=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4198:6: ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4198:6: ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4198:7: () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4198:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4199:2: 
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

                    otherlv_41=(Token)match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleMethodExpression8242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getMethodExpressionAccess().getEndsWithKeyword_8_1());
                          
                    }
                    otherlv_42=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4217:1: ( (lv_string_43_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4218:1: (lv_string_43_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4218:1: (lv_string_43_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4219:3: lv_string_43_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8274);
                    lv_string_43_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_43_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_44=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4241:6: ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4241:6: ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4241:7: () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4241:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4242:2: 
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

                    otherlv_46=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleMethodExpression8319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getMethodExpressionAccess().getEqualsKeyword_9_1());
                          
                    }
                    otherlv_47=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4260:1: ( (lv_string_48_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:1: (lv_string_48_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:1: (lv_string_48_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4262:3: lv_string_48_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8351);
                    lv_string_48_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_48_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_49=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4284:6: ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4284:6: ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4284:7: () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4284:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4285:2: 
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

                    otherlv_51=(Token)match(input,KEYWORD_108,FOLLOW_KEYWORD_108_in_ruleMethodExpression8396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_51, grammarAccess.getMethodExpressionAccess().getEqualsIgnoreCaseKeyword_10_1());
                          
                    }
                    otherlv_52=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4303:1: ( (lv_string_53_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:1: (lv_string_53_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:1: (lv_string_53_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4305:3: lv_string_53_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_10_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8428);
                    lv_string_53_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_53_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_54=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_54, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_10_4());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4327:6: ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4327:6: ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4327:7: () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4327:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4328:2: 
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

                    otherlv_56=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleMethodExpression8473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_56, grammarAccess.getMethodExpressionAccess().getIndexOfKeyword_11_1());
                          
                    }
                    otherlv_57=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_11_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4346:1: ( (lv_string_58_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4347:1: (lv_string_58_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4347:1: (lv_string_58_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4348:3: lv_string_58_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8505);
                    lv_string_58_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_58_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4364:2: (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==KEYWORD_8) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4365:2: otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_59=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression8519); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getMethodExpressionAccess().getCommaKeyword_11_4_0());
                                  
                            }
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4369:1: ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4370:1: (lv_fromIndex_60_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4370:1: (lv_fromIndex_60_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4371:3: lv_fromIndex_60_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getFromIndexConditionalOrExpressionParserRuleCall_11_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8539);
                            lv_fromIndex_60_0=ruleConditionalOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"fromIndex",
                                      		lv_fromIndex_60_0, 
                                      		"ConditionalOrExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_61=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_61, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_11_5());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4393:6: ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4393:6: ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4393:7: () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4393:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4394:2: 
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

                    otherlv_63=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMethodExpression8586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_63, grammarAccess.getMethodExpressionAccess().getLengthKeyword_12_1());
                          
                    }
                    otherlv_64=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_64, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_12_2());
                          
                    }
                    otherlv_65=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_65, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_12_3());
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4418:6: ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4418:6: ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4418:7: () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4418:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4419:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_13_0(),
                                  current);
                          
                    }

                    }

                    otherlv_67=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleMethodExpression8642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_67, grammarAccess.getMethodExpressionAccess().getMatchesKeyword_13_1());
                          
                    }
                    otherlv_68=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_68, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_13_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4437:1: ( (lv_regex_69_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4438:1: (lv_regex_69_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4438:1: (lv_regex_69_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4439:3: lv_regex_69_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getRegexConditionalOrExpressionParserRuleCall_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8674);
                    lv_regex_69_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"regex",
                              		lv_regex_69_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_70=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_70, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_13_4());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4461:6: ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4461:6: ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4461:7: () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4461:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4462:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_14_0(),
                                  current);
                          
                    }

                    }

                    otherlv_72=(Token)match(input,KEYWORD_97,FOLLOW_KEYWORD_97_in_ruleMethodExpression8719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_72, grammarAccess.getMethodExpressionAccess().getReplaceAllKeyword_14_1());
                          
                    }
                    otherlv_73=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_73, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_14_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4480:1: ( (lv_regex_74_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4481:1: (lv_regex_74_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4481:1: (lv_regex_74_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4482:3: lv_regex_74_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getRegexConditionalOrExpressionParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8751);
                    lv_regex_74_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"regex",
                              		lv_regex_74_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_75=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression8764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_75, grammarAccess.getMethodExpressionAccess().getCommaKeyword_14_4());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4503:1: ( (lv_replacement_76_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4504:1: (lv_replacement_76_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4504:1: (lv_replacement_76_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4505:3: lv_replacement_76_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getReplacementConditionalOrExpressionParserRuleCall_14_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8784);
                    lv_replacement_76_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"replacement",
                              		lv_replacement_76_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_77=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_77, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_14_6());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4527:6: ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4527:6: ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4527:7: () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4527:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4528:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_15_0(),
                                  current);
                          
                    }

                    }

                    otherlv_79=(Token)match(input,KEYWORD_98,FOLLOW_KEYWORD_98_in_ruleMethodExpression8829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_79, grammarAccess.getMethodExpressionAccess().getStartsWithKeyword_15_1());
                          
                    }
                    otherlv_80=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_80, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_15_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4546:1: ( (lv_string_81_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4547:1: (lv_string_81_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4547:1: (lv_string_81_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4548:3: lv_string_81_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_15_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8861);
                    lv_string_81_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"string",
                              		lv_string_81_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_82=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_82, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_15_4());
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4570:6: ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4570:6: ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4570:7: () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4570:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4571:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_16_0(),
                                  current);
                          
                    }

                    }

                    otherlv_84=(Token)match(input,KEYWORD_91,FOLLOW_KEYWORD_91_in_ruleMethodExpression8906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_84, grammarAccess.getMethodExpressionAccess().getSubstringKeyword_16_1());
                          
                    }
                    otherlv_85=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_85, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_16_2());
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4589:1: ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4590:1: (lv_beginIndex_86_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4590:1: (lv_beginIndex_86_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4591:3: lv_beginIndex_86_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getBeginIndexConditionalOrExpressionParserRuleCall_16_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8938);
                    lv_beginIndex_86_0=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"beginIndex",
                              		lv_beginIndex_86_0, 
                              		"ConditionalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4607:2: (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==KEYWORD_8) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4608:2: otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_87=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression8952); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_87, grammarAccess.getMethodExpressionAccess().getCommaKeyword_16_4_0());
                                  
                            }
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4612:1: ( (lv_endIndex_88_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4613:1: (lv_endIndex_88_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4613:1: (lv_endIndex_88_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4614:3: lv_endIndex_88_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getEndIndexConditionalOrExpressionParserRuleCall_16_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8972);
                            lv_endIndex_88_0=ruleConditionalOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMethodExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"endIndex",
                                      		lv_endIndex_88_0, 
                                      		"ConditionalOrExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_89=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_89, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_16_5());
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4636:6: ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4636:6: ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4636:7: () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4636:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4637:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_17_0(),
                                  current);
                          
                    }

                    }

                    otherlv_91=(Token)match(input,KEYWORD_100,FOLLOW_KEYWORD_100_in_ruleMethodExpression9019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_91, grammarAccess.getMethodExpressionAccess().getToLowerCaseKeyword_17_1());
                          
                    }
                    otherlv_92=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9031); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_92, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_17_2());
                          
                    }
                    otherlv_93=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_93, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_17_3());
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4661:6: ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4661:6: ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4661:7: () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4661:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4662:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_18_0(),
                                  current);
                          
                    }

                    }

                    otherlv_95=(Token)match(input,KEYWORD_101,FOLLOW_KEYWORD_101_in_ruleMethodExpression9075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_95, grammarAccess.getMethodExpressionAccess().getToUpperCaseKeyword_18_1());
                          
                    }
                    otherlv_96=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_96, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_18_2());
                          
                    }
                    otherlv_97=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_97, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_18_3());
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4686:6: ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4686:6: ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4686:7: () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4686:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4687:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_19_0(),
                                  current);
                          
                    }

                    }

                    otherlv_99=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleMethodExpression9131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_99, grammarAccess.getMethodExpressionAccess().getTrimKeyword_19_1());
                          
                    }
                    otherlv_100=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_100, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_19_2());
                          
                    }
                    otherlv_101=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_101, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_19_3());
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4711:6: ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4711:6: ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4711:7: () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4711:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4712:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_20_0(),
                                  current);
                          
                    }

                    }

                    otherlv_103=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleMethodExpression9187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_103, grammarAccess.getMethodExpressionAccess().getGetDayKeyword_20_1());
                          
                    }
                    otherlv_104=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_104, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_20_2());
                          
                    }
                    otherlv_105=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_105, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_20_3());
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4736:6: ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4736:6: ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4736:7: () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4736:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4737:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_21_0(),
                                  current);
                          
                    }

                    }

                    otherlv_107=(Token)match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleMethodExpression9243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_107, grammarAccess.getMethodExpressionAccess().getGetMonthKeyword_21_1());
                          
                    }
                    otherlv_108=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_108, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_21_2());
                          
                    }
                    otherlv_109=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_109, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_21_3());
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4761:6: ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4761:6: ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4761:7: () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4761:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4762:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_22_0(),
                                  current);
                          
                    }

                    }

                    otherlv_111=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleMethodExpression9299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_111, grammarAccess.getMethodExpressionAccess().getGetYearKeyword_22_1());
                          
                    }
                    otherlv_112=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9311); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_112, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_22_2());
                          
                    }
                    otherlv_113=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_113, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_22_3());
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4786:6: ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4786:6: ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4786:7: () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4786:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4787:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_23_0(),
                                  current);
                          
                    }

                    }

                    otherlv_115=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleMethodExpression9355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_115, grammarAccess.getMethodExpressionAccess().getGetHourKeyword_23_1());
                          
                    }
                    otherlv_116=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_116, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_23_2());
                          
                    }
                    otherlv_117=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9379); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_117, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_23_3());
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4811:6: ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4811:6: ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4811:7: () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4811:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4812:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_24_0(),
                                  current);
                          
                    }

                    }

                    otherlv_119=(Token)match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_ruleMethodExpression9411); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_119, grammarAccess.getMethodExpressionAccess().getGetMinuteKeyword_24_1());
                          
                    }
                    otherlv_120=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_120, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_24_2());
                          
                    }
                    otherlv_121=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_121, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_24_3());
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4836:6: ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4836:6: ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4836:7: () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4836:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4837:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_25_0(),
                                  current);
                          
                    }

                    }

                    otherlv_123=(Token)match(input,KEYWORD_90,FOLLOW_KEYWORD_90_in_ruleMethodExpression9467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_123, grammarAccess.getMethodExpressionAccess().getGetSecondKeyword_25_1());
                          
                    }
                    otherlv_124=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_124, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_25_2());
                          
                    }
                    otherlv_125=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_125, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_25_3());
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4861:6: ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4861:6: ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4861:7: () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4861:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4862:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_26_0(),
                                  current);
                          
                    }

                    }

                    otherlv_127=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleMethodExpression9523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_127, grammarAccess.getMethodExpressionAccess().getOrdinalKeyword_26_1());
                          
                    }
                    otherlv_128=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_128, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_26_2());
                          
                    }
                    otherlv_129=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_129, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_26_3());
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4886:6: ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4886:6: ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4886:7: () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4886:7: ()
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4887:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMethodExpressionAccess().getExpressionAction_27_0(),
                                  current);
                          
                    }

                    }

                    otherlv_131=(Token)match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleMethodExpression9579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_131, grammarAccess.getMethodExpressionAccess().getToStringKeyword_27_1());
                          
                    }
                    otherlv_132=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_132, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_27_2());
                          
                    }
                    otherlv_133=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_133, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_27_3());
                          
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4918:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4919:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4920:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression9638);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression9648); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4927:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ConditionalOrExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4930:28: ( (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4931:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4931:1: (otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4932:2: otherlv_0= KEYWORD_4 this_ConditionalOrExpression_1= ruleConditionalOrExpression otherlv_2= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthesesExpression9686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression9710);
            this_ConditionalOrExpression_1=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthesesExpression9722); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4961:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4962:1: (iv_ruleType= ruleType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4963:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType9757);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType9768); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4970:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_ClassOrInterfaceName_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4974:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4975:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4975:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_64||LA46_0==KEYWORD_57||LA46_0==KEYWORD_50||LA46_0==KEYWORD_52||(LA46_0>=KEYWORD_36 && LA46_0<=KEYWORD_38)||LA46_0==KEYWORD_29) ) {
                alt46=1;
            }
            else if ( (LA46_0==KEYWORD_119||(LA46_0>=KEYWORD_111 && LA46_0<=KEYWORD_112)||(LA46_0>=KEYWORD_109 && LA46_0<=KEYWORD_105)||LA46_0==KEYWORD_61||LA46_0==KEYWORD_51||LA46_0==RULE_ID) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4976:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType9815);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4988:5: this_ClassOrInterfaceName_1= ruleClassOrInterfaceName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleType9848);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5006:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5007:1: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5008:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType9893);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType9904); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5015:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NumericType_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5019:6: ( (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5020:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5020:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_57||LA47_0==KEYWORD_50||LA47_0==KEYWORD_52||(LA47_0>=KEYWORD_36 && LA47_0<=KEYWORD_38)||LA47_0==KEYWORD_29) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_64) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5021:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType9951);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5033:2: kw= KEYWORD_64
                    {
                    kw=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rulePrimitiveType9975); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5046:1: entryRuleNumericType returns [String current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final String entryRuleNumericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5047:1: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5048:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType10015);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType10026); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5055:1: ruleNumericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) ;
    public final AntlrDatatypeRuleToken ruleNumericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegralType_0 = null;

        AntlrDatatypeRuleToken this_FloatingPointType_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5059:6: ( (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5060:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5060:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_52||(LA48_0>=KEYWORD_36 && LA48_0<=KEYWORD_38)||LA48_0==KEYWORD_29) ) {
                alt48=1;
            }
            else if ( (LA48_0==KEYWORD_57||LA48_0==KEYWORD_50) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5061:5: this_IntegralType_0= ruleIntegralType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegralType_in_ruleNumericType10073);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5073:5: this_FloatingPointType_1= ruleFloatingPointType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatingPointType_in_ruleNumericType10106);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5091:1: entryRuleIntegralType returns [String current=null] : iv_ruleIntegralType= ruleIntegralType EOF ;
    public final String entryRuleIntegralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegralType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5092:1: (iv_ruleIntegralType= ruleIntegralType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5093:2: iv_ruleIntegralType= ruleIntegralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegralTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType10151);
            iv_ruleIntegralType=ruleIntegralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegralType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType10162); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5100:1: ruleIntegralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleIntegralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5104:6: ( (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5105:1: (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5105:1: (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 )
            int alt49=5;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt49=1;
                }
                break;
            case KEYWORD_52:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5106:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleIntegralType10200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5113:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleIntegralType10219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5120:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleIntegralType10238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5127:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleIntegralType10257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5134:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleIntegralType10276); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5147:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5148:1: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5149:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType10316);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType10327); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5156:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5160:6: ( (kw= KEYWORD_50 | kw= KEYWORD_57 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5161:1: (kw= KEYWORD_50 | kw= KEYWORD_57 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5161:1: (kw= KEYWORD_50 | kw= KEYWORD_57 )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_50) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEYWORD_57) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5162:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleFloatingPointType10365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5169:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleFloatingPointType10384); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5182:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5183:1: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5184:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral10424);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral10435); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5191:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5195:6: (this_INT_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5196:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral10474); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5211:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5212:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5213:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10518);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral10529); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5220:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5224:6: (this_STRING_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5225:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral10568); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5240:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5241:1: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5242:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral10612);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral10623); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5249:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_43 | kw= KEYWORD_49 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5253:6: ( (kw= KEYWORD_43 | kw= KEYWORD_49 ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5254:1: (kw= KEYWORD_43 | kw= KEYWORD_49 )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5254:1: (kw= KEYWORD_43 | kw= KEYWORD_49 )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_43) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEYWORD_49) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5255:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanLiteral10661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5262:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleBooleanLiteral10680); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5275:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5276:1: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5277:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral10720);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral10731); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5284:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_39 ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5288:6: (kw= KEYWORD_39 )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5290:2: kw= KEYWORD_39
            {
            kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNullLiteral10768); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5303:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5304:1: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5305:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral10807);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral10818); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5312:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;

        AntlrDatatypeRuleToken this_NullLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5316:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5317:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5317:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt52=1;
                }
                break;
            case KEYWORD_49:
            case KEYWORD_43:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5318:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral10865);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5330:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral10898);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5342:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral10931);
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5354:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral10964);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5372:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5373:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5374:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier11009);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier11020); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5381:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5385:6: ( (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5386:1: (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5386:1: (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) )
            int alt56=12;
            switch ( input.LA(1) ) {
            case KEYWORD_111:
                {
                alt56=1;
                }
                break;
            case KEYWORD_104:
                {
                alt56=2;
                }
                break;
            case KEYWORD_119:
                {
                alt56=3;
                }
                break;
            case KEYWORD_109:
                {
                alt56=4;
                }
                break;
            case KEYWORD_106:
                {
                alt56=5;
                }
                break;
            case KEYWORD_112:
                {
                alt56=6;
                }
                break;
            case KEYWORD_105:
                {
                alt56=7;
                }
                break;
            case KEYWORD_107:
                {
                alt56=8;
                }
                break;
            case KEYWORD_110:
                {
                alt56=9;
                }
                break;
            case KEYWORD_51:
                {
                alt56=10;
                }
                break;
            case KEYWORD_61:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5387:2: kw= KEYWORD_111
                    {
                    kw=(Token)match(input,KEYWORD_111,FOLLOW_KEYWORD_111_in_ruleQualifiedIdentifier11058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5394:2: kw= KEYWORD_104
                    {
                    kw=(Token)match(input,KEYWORD_104,FOLLOW_KEYWORD_104_in_ruleQualifiedIdentifier11077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5401:2: kw= KEYWORD_119
                    {
                    kw=(Token)match(input,KEYWORD_119,FOLLOW_KEYWORD_119_in_ruleQualifiedIdentifier11096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangCharacterKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5408:2: kw= KEYWORD_109
                    {
                    kw=(Token)match(input,KEYWORD_109,FOLLOW_KEYWORD_109_in_ruleQualifiedIdentifier11115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangDoubleKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5415:2: kw= KEYWORD_106
                    {
                    kw=(Token)match(input,KEYWORD_106,FOLLOW_KEYWORD_106_in_ruleQualifiedIdentifier11134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangFloatKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5422:2: kw= KEYWORD_112
                    {
                    kw=(Token)match(input,KEYWORD_112,FOLLOW_KEYWORD_112_in_ruleQualifiedIdentifier11153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangIntegerKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5429:2: kw= KEYWORD_105
                    {
                    kw=(Token)match(input,KEYWORD_105,FOLLOW_KEYWORD_105_in_ruleQualifiedIdentifier11172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5436:2: kw= KEYWORD_107
                    {
                    kw=(Token)match(input,KEYWORD_107,FOLLOW_KEYWORD_107_in_ruleQualifiedIdentifier11191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangShortKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5443:2: kw= KEYWORD_110
                    {
                    kw=(Token)match(input,KEYWORD_110,FOLLOW_KEYWORD_110_in_ruleQualifiedIdentifier11210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangStringKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5449:6: (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5449:6: (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5450:2: kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleQualifiedIdentifier11230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaKeyword_9_0()); 
                          
                    }
                    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_10, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_9_1()); 
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5462:1: (kw= KEYWORD_10 this_ID_12= RULE_ID )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==KEYWORD_10) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5463:2: kw= KEYWORD_10 this_ID_12= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier11264); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_9_2_0()); 
                    	          
                    	    }
                    	    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11279); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5476:6: (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5476:6: (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5477:2: kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleQualifiedIdentifier11307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaxKeyword_10_0()); 
                          
                    }
                    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_14, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_10_1()); 
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5489:1: (kw= KEYWORD_10 this_ID_16= RULE_ID )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==KEYWORD_10) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5490:2: kw= KEYWORD_10 this_ID_16= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier11341); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_10_2_0()); 
                    	          
                    	    }
                    	    this_ID_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11356); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5503:6: (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5503:6: (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5503:11: this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )*
                    {
                    this_ID_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_17, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_11_0()); 
                          
                    }
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5510:1: (kw= KEYWORD_10 this_ID_19= RULE_ID )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==KEYWORD_10) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5511:2: kw= KEYWORD_10 this_ID_19= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier11405); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_11_1_0()); 
                    	          
                    	    }
                    	    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11420); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5531:1: entryRuleCandidateClassName returns [String current=null] : iv_ruleCandidateClassName= ruleCandidateClassName EOF ;
    public final String entryRuleCandidateClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidateClassName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5532:1: (iv_ruleCandidateClassName= ruleCandidateClassName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5533:2: iv_ruleCandidateClassName= ruleCandidateClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCandidateClassNameRule()); 
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName11468);
            iv_ruleCandidateClassName=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCandidateClassName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName11479); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5540:1: ruleCandidateClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleCandidateClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5544:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5546:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName11525);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5564:1: entryRuleClassOrInterfaceName returns [String current=null] : iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF ;
    public final String entryRuleClassOrInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrInterfaceName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5565:1: (iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5566:2: iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName11569);
            iv_ruleClassOrInterfaceName=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName11580); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5573:1: ruleClassOrInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleClassOrInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5577:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5579:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName11626);
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5597:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5599:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5600:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5600:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt57=1;
                }
                break;
            case KEYWORD_82:
                {
                alt57=2;
                }
                break;
            case KEYWORD_33:
                {
                alt57=3;
                }
                break;
            case KEYWORD_92:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5600:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5600:2: (enumLiteral_0= KEYWORD_26 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5600:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderByDirection11687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5606:6: (enumLiteral_1= KEYWORD_82 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5606:6: (enumLiteral_1= KEYWORD_82 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5606:11: enumLiteral_1= KEYWORD_82
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleOrderByDirection11709); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5612:6: (enumLiteral_2= KEYWORD_33 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5612:6: (enumLiteral_2= KEYWORD_33 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5612:11: enumLiteral_2= KEYWORD_33
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleOrderByDirection11731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5618:6: (enumLiteral_3= KEYWORD_92 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5618:6: (enumLiteral_3= KEYWORD_92 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5618:11: enumLiteral_3= KEYWORD_92
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_92,FOLLOW_KEYWORD_92_in_ruleOrderByDirection11753); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5628:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5630:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5631:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5631:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5631:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5631:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5631:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryOperator11803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5637:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5637:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5637:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryOperator11825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5643:6: (enumLiteral_2= KEYWORD_17 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5643:6: (enumLiteral_2= KEYWORD_17 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5643:11: enumLiteral_2= KEYWORD_17
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryOperator11847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5649:6: (enumLiteral_3= KEYWORD_1 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5649:6: (enumLiteral_3= KEYWORD_1 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5649:11: enumLiteral_3= KEYWORD_1
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleUnaryOperator11869); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5659:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5661:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5662:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5662:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5662:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5662:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5662:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditionOperator11919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5668:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5668:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5668:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditionOperator11941); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5678:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5680:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5681:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5681:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5681:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5681:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5681:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator11991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5687:6: (enumLiteral_1= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5687:6: (enumLiteral_1= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5687:11: enumLiteral_1= KEYWORD_11
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator12013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5693:6: (enumLiteral_2= KEYWORD_2 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5693:6: (enumLiteral_2= KEYWORD_2 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5693:11: enumLiteral_2= KEYWORD_2
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator12035); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5703:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5705:28: ( ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5706:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5706:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) )
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
            case KEYWORD_96:
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5706:2: (enumLiteral_0= KEYWORD_14 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5706:2: (enumLiteral_0= KEYWORD_14 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5706:7: enumLiteral_0= KEYWORD_14
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator12085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5712:6: (enumLiteral_1= KEYWORD_15 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5712:6: (enumLiteral_1= KEYWORD_15 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5712:11: enumLiteral_1= KEYWORD_15
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator12107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5718:6: (enumLiteral_2= KEYWORD_20 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5718:6: (enumLiteral_2= KEYWORD_20 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5718:11: enumLiteral_2= KEYWORD_20
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComparisonOperator12129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5724:6: (enumLiteral_3= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5724:6: (enumLiteral_3= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5724:11: enumLiteral_3= KEYWORD_22
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleComparisonOperator12151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5730:6: (enumLiteral_4= KEYWORD_21 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5730:6: (enumLiteral_4= KEYWORD_21 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5730:11: enumLiteral_4= KEYWORD_21
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleComparisonOperator12173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5736:6: (enumLiteral_5= KEYWORD_18 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5736:6: (enumLiteral_5= KEYWORD_18 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5736:11: enumLiteral_5= KEYWORD_18
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleComparisonOperator12195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5742:6: (enumLiteral_6= KEYWORD_96 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5742:6: (enumLiteral_6= KEYWORD_96 )
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5742:11: enumLiteral_6= KEYWORD_96
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_96,FOLLOW_KEYWORD_96_in_ruleComparisonOperator12217); if (state.failed) return current;
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
        "\2\4\1\uffff\1\47\1\uffff\1\27\1\4\1\47";
    static final String DFA34_maxS =
        "\2\u0087\1\uffff\1\u0083\1\uffff\2\u0087\1\u0083";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\3\uffff";
    static final String DFA34_specialS =
        "\10\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\1\uffff\13\2\2\uffff\1\2\6\uffff\5\2\1\uffff\1\2\3\uffff"+
            "\2\2\1\uffff\5\2\1\uffff\3\2\1\uffff\12\2\2\uffff\6\2\3\uffff"+
            "\1\2\1\uffff\2\2\2\uffff\1\2\4\uffff\2\2\11\uffff\5\2\1\uffff"+
            "\2\2\1\uffff\3\2\10\uffff\1\2\2\uffff\1\1\2\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\2\4\uffff\4\2",
            "\5\2\1\4\13\2\2\4\1\2\6\4\5\2\1\uffff\1\2\3\uffff\2\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\4\6\2\3\uffff\1\2\1"+
            "\4\2\2\1\uffff\1\4\1\2\4\uffff\2\2\3\4\3\uffff\3\4\5\2\1\uffff"+
            "\2\2\1\4\3\2\10\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1"+
            "\2\2\uffff\1\2\4\uffff\1\2\1\3\2\2",
            "",
            "\1\2\104\uffff\5\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\6\2\2"+
            "\1\uffff\1\2\1\5\1\2\2\uffff\3\2",
            "",
            "\1\2\6\uffff\5\2\5\uffff\2\2\7\uffff\3\2\7\uffff\4\2\2\uffff"+
            "\6\2\3\uffff\1\2\1\uffff\2\2\2\uffff\1\2\5\uffff\1\2\11\uffff"+
            "\5\2\2\uffff\1\2\17\uffff\1\2\15\uffff\1\7\2\2",
            "\5\4\1\uffff\13\4\2\uffff\1\4\6\uffff\5\4\1\2\1\4\1\2\1\uffff"+
            "\1\2\2\4\1\2\5\4\1\2\3\4\1\uffff\12\4\2\uffff\6\4\1\2\2\uffff"+
            "\1\4\1\uffff\2\4\1\2\1\uffff\1\4\3\2\1\uffff\2\4\3\uffff\3\2"+
            "\3\uffff\5\4\1\2\2\4\1\uffff\3\4\6\2\1\uffff\1\2\1\uffff\2\2"+
            "\1\4\7\2\1\4\1\uffff\3\2\1\uffff\3\4",
            "\1\2\104\uffff\5\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\6\2\2"+
            "\1\uffff\1\2\1\5\1\2\2\uffff\3\2"
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
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSingleStringJDOQL129 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSingleStringJDOQL150 = new BitSet(new long[]{0x0001002000000002L,0x00000000001E4000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSingleStringJDOQL171 = new BitSet(new long[]{0x0001002000000002L,0x00000000000E4000L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_ruleSingleStringJDOQL193 = new BitSet(new long[]{0x0000002000000002L,0x00000000000E4000L});
    public static final BitSet FOLLOW_ruleParametersClause_in_ruleSingleStringJDOQL215 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E4000L});
    public static final BitSet FOLLOW_ruleImportClause_in_ruleSingleStringJDOQL237 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSingleStringJDOQL259 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSingleStringJDOQL281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleRangeClause_in_ruleSingleStringJDOQL303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSelectClause399 = new BitSet(new long[]{0x7FFEFB17C09FFDF2L,0x94900EDF1061367EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleSelectClause417 = new BitSet(new long[]{0x7FFEFB17C09FFDF2L,0x94900EDF1061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleResultClause_in_ruleSelectClause450 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSelectClause472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleResultClause562 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause595 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause609 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause629 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleIntoClause714 = new BitSet(new long[]{0x000000003F600200L,0x0000000001008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec829 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleResultNaming_in_ruleResultSpec849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleResultNaming933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultNaming949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleFromClause1037 = new BitSet(new long[]{0x000000003F600200L,0x0000000001008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleFromClause1057 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleFromClause1077 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KEYWORD_95_in_ruleFromClause1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleWhereClause1185 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleVariablesClause1288 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1322 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause1342 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDeclaration1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_94_in_ruleParametersClause1648 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1668 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1682 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause1702 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleImportDeclaration2253 = new BitSet(new long[]{0x000000003F600200L,0x0000000001008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleGroupByClause2367 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleGroupByClause2379 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2399 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000080L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2413 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause2433 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000080L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause2449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause2507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleHavingClause2555 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleOrderByClause2658 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleOrderByClause2670 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2690 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2704 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause2724 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec2776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec2836 = new BitSet(new long[]{0x0000040800000000L,0x0000002004000000L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleRangeClause2939 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2959 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleRangeClause2972 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3087 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3112 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3132 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3229 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression3254 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression3274 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression3396 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression3416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3513 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression3538 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression3558 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression3595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3655 = new BitSet(new long[]{0x0000008000000002L,0x0001D00000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression3688 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression3709 = new BitSet(new long[]{0x0000008000000002L,0x0001D00000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3806 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression3839 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression3860 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression3897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression3907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression3957 = new BitSet(new long[]{0x0000000000000002L,0x4220000000000000L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression3990 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4011 = new BitSet(new long[]{0x0000000000000002L,0x4220000000000000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnaryExpression4097 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleUnaryExpression4117 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUnaryExpression4130 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression4179 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression4328 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression4353 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression4373 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression4411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleParameterOrFieldOrMethodExpression4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression4551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
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
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleStaticMethodExpression4937 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression4949 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression4969 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleStaticMethodExpression5014 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5026 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5046 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleStaticMethodExpression5091 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5103 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5123 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleStaticMethodExpression5168 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5180 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5200 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleStaticMethodExpression5245 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5257 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5277 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleStaticMethodExpression5322 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5334 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5354 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleStaticMethodExpression5399 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5411 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5431 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleStaticMethodExpression5476 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5488 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5508 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleStaticMethodExpression5553 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5565 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5585 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleStaticMethodExpression5630 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5642 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5662 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_93_in_ruleStaticMethodExpression5707 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5719 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5739 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleStaticMethodExpression5784 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5796 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5816 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_113_in_ruleStaticMethodExpression5861 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5873 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5893 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_124_in_ruleStaticMethodExpression5938 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5950 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5970 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_114_in_ruleStaticMethodExpression6015 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6027 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6047 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_117_in_ruleStaticMethodExpression6092 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6104 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6124 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_118_in_ruleStaticMethodExpression6169 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6181 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6201 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_120_in_ruleStaticMethodExpression6246 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6258 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6278 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_121_in_ruleStaticMethodExpression6323 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6335 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6355 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_122_in_ruleStaticMethodExpression6400 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6412 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6432 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_123_in_ruleStaticMethodExpression6477 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6489 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6509 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_115_in_ruleStaticMethodExpression6554 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6566 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6586 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_126_in_ruleStaticMethodExpression6631 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6643 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6663 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_116_in_ruleStaticMethodExpression6708 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6720 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6740 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_127_in_ruleStaticMethodExpression6785 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6797 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6817 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_125_in_ruleStaticMethodExpression6862 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6874 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6894 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_129_in_ruleStaticMethodExpression6939 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6951 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6971 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_128_in_ruleStaticMethodExpression7016 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7028 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7048 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleStaticMethodExpression7093 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7105 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7123 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7156 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleStaticMethodExpression7201 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7213 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7231 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7264 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleStaticMethodExpression7309 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7321 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7341 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleStaticMethodExpression7386 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7398 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7418 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleStaticMethodExpression7463 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7475 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7493 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7526 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression7574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodExpression7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleMethodExpression7635 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression7647 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression7667 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleMethodExpression7712 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression7724 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression7744 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleMethodExpression7789 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression7801 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleMethodExpression7845 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression7857 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_99_in_ruleMethodExpression7901 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression7913 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression7933 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_103_in_ruleMethodExpression7978 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression7990 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8010 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_102_in_ruleMethodExpression8055 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8067 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8087 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression8100 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8120 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleMethodExpression8165 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8177 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8197 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleMethodExpression8242 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8254 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8274 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleMethodExpression8319 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8331 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8351 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_108_in_ruleMethodExpression8396 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8408 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8428 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleMethodExpression8473 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8485 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8505 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression8519 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8539 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMethodExpression8586 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8598 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleMethodExpression8642 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8654 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8674 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_97_in_ruleMethodExpression8719 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8731 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8751 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression8764 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8784 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_98_in_ruleMethodExpression8829 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8841 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8861 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_91_in_ruleMethodExpression8906 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8918 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8938 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression8952 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8972 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_100_in_ruleMethodExpression9019 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9031 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_101_in_ruleMethodExpression9075 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9087 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleMethodExpression9131 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9143 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleMethodExpression9187 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9199 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleMethodExpression9243 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9255 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleMethodExpression9299 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9311 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleMethodExpression9355 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9367 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_ruleMethodExpression9411 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9423 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_90_in_ruleMethodExpression9467 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9479 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleMethodExpression9523 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9535 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleMethodExpression9579 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9591 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression9638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthesesExpression9686 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression9710 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthesesExpression9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType9757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleType9848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType9893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType9951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rulePrimitiveType9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType10015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_ruleNumericType10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_ruleNumericType10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType10151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType10162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleIntegralType10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleIntegralType10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleIntegralType10238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleIntegralType10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleIntegralType10276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType10316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleFloatingPointType10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleFloatingPointType10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral10424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral10518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral10529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral10568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral10612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanLiteral10661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleBooleanLiteral10680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral10720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral10731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNullLiteral10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral10807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral10818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral10931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier11009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_111_in_ruleQualifiedIdentifier11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_104_in_ruleQualifiedIdentifier11077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_119_in_ruleQualifiedIdentifier11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_109_in_ruleQualifiedIdentifier11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_106_in_ruleQualifiedIdentifier11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_112_in_ruleQualifiedIdentifier11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_105_in_ruleQualifiedIdentifier11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_107_in_ruleQualifiedIdentifier11191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_110_in_ruleQualifiedIdentifier11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleQualifiedIdentifier11230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11245 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier11264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11279 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleQualifiedIdentifier11307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11322 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier11341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11356 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11386 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier11405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier11420 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName11468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName11479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName11569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName11580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderByDirection11687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleOrderByDirection11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleOrderByDirection11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_92_in_ruleOrderByDirection11753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryOperator11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryOperator11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryOperator11847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleUnaryOperator11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditionOperator11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditionOperator11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator11991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator12035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator12085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComparisonOperator12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleComparisonOperator12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleComparisonOperator12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleComparisonOperator12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_96_in_ruleComparisonOperator12217 = new BitSet(new long[]{0x0000000000000002L});

}