package org.nightlabs.vestigo.xtext.jdoql.parser.antlr.internal; 

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
import org.nightlabs.vestigo.xtext.jdoql.services.JDOQLGrammarAccess;



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
    public String getGrammarFileName() { return "../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g"; }



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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:68:1: entryRuleSingleStringJDOQL returns [EObject current=null] : iv_ruleSingleStringJDOQL= ruleSingleStringJDOQL EOF ;
    public final EObject entryRuleSingleStringJDOQL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStringJDOQL = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:69:2: (iv_ruleSingleStringJDOQL= ruleSingleStringJDOQL EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:70:2: iv_ruleSingleStringJDOQL= ruleSingleStringJDOQL EOF
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:77:1: ruleSingleStringJDOQL returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:80:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:2: ( (lv_selectClause_0_0= ruleSelectClause ) ) ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ( (lv_groupByClause_6_0= ruleGroupByClause ) )? ( (lv_orderByClause_7_0= ruleOrderByClause ) )? ( (lv_rangeClause_8_0= ruleRangeClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:81:2: ( (lv_selectClause_0_0= ruleSelectClause ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:82:1: (lv_selectClause_0_0= ruleSelectClause )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:82:1: (lv_selectClause_0_0= ruleSelectClause )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:83:3: lv_selectClause_0_0= ruleSelectClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:99:2: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:100:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:100:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:101:3: lv_fromClause_1_0= ruleFromClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:117:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_47) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:118:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:118:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:119:3: lv_whereClause_2_0= ruleWhereClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:135:3: ( (lv_variablesClause_3_0= ruleVariablesClause ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_88) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:136:1: (lv_variablesClause_3_0= ruleVariablesClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:136:1: (lv_variablesClause_3_0= ruleVariablesClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:137:3: lv_variablesClause_3_0= ruleVariablesClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:153:3: ( (lv_parametersClause_4_0= ruleParametersClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_94) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:154:1: (lv_parametersClause_4_0= ruleParametersClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:154:1: (lv_parametersClause_4_0= ruleParametersClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:155:3: lv_parametersClause_4_0= ruleParametersClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:171:3: ( (lv_importClause_5_0= ruleImportClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_60) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:172:1: (lv_importClause_5_0= ruleImportClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:172:1: (lv_importClause_5_0= ruleImportClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:173:3: lv_importClause_5_0= ruleImportClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:189:3: ( (lv_groupByClause_6_0= ruleGroupByClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_44) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:190:1: (lv_groupByClause_6_0= ruleGroupByClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:190:1: (lv_groupByClause_6_0= ruleGroupByClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:191:3: lv_groupByClause_6_0= ruleGroupByClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:207:3: ( (lv_orderByClause_7_0= ruleOrderByClause ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_45) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:208:1: (lv_orderByClause_7_0= ruleOrderByClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:208:1: (lv_orderByClause_7_0= ruleOrderByClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:209:3: lv_orderByClause_7_0= ruleOrderByClause
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:225:3: ( (lv_rangeClause_8_0= ruleRangeClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_46) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:226:1: (lv_rangeClause_8_0= ruleRangeClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:226:1: (lv_rangeClause_8_0= ruleRangeClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:227:3: lv_rangeClause_8_0= ruleRangeClause
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


    // $ANTLR start "entryRuleSubquery"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:251:1: entryRuleSubquery returns [EObject current=null] : iv_ruleSubquery= ruleSubquery EOF ;
    public final EObject entryRuleSubquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubquery = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:252:2: (iv_ruleSubquery= ruleSubquery EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:253:2: iv_ruleSubquery= ruleSubquery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubqueryRule()); 
            }
            pushFollow(FOLLOW_ruleSubquery_in_entryRuleSubquery339);
            iv_ruleSubquery=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubquery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubquery349); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubquery"


    // $ANTLR start "ruleSubquery"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:260:1: ruleSubquery returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSubquerySelectClause ) ) ( (lv_fromClause_1_0= ruleSubqueryFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ) ;
    public final EObject ruleSubquery() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;

        EObject lv_variablesClause_3_0 = null;

        EObject lv_parametersClause_4_0 = null;

        EObject lv_importClause_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:263:28: ( ( ( (lv_selectClause_0_0= ruleSubquerySelectClause ) ) ( (lv_fromClause_1_0= ruleSubqueryFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( ( (lv_selectClause_0_0= ruleSubquerySelectClause ) ) ( (lv_fromClause_1_0= ruleSubqueryFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:1: ( ( (lv_selectClause_0_0= ruleSubquerySelectClause ) ) ( (lv_fromClause_1_0= ruleSubqueryFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: ( (lv_selectClause_0_0= ruleSubquerySelectClause ) ) ( (lv_fromClause_1_0= ruleSubqueryFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_variablesClause_3_0= ruleVariablesClause ) )? ( (lv_parametersClause_4_0= ruleParametersClause ) )? ( (lv_importClause_5_0= ruleImportClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:264:2: ( (lv_selectClause_0_0= ruleSubquerySelectClause ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:265:1: (lv_selectClause_0_0= ruleSubquerySelectClause )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:265:1: (lv_selectClause_0_0= ruleSubquerySelectClause )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:266:3: lv_selectClause_0_0= ruleSubquerySelectClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubqueryAccess().getSelectClauseSubquerySelectClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquerySelectClause_in_ruleSubquery395);
            lv_selectClause_0_0=ruleSubquerySelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubqueryRule());
              	        }
                     		set(
                     			current, 
                     			"selectClause",
                      		lv_selectClause_0_0, 
                      		"SubquerySelectClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:282:2: ( (lv_fromClause_1_0= ruleSubqueryFromClause ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:283:1: (lv_fromClause_1_0= ruleSubqueryFromClause )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:283:1: (lv_fromClause_1_0= ruleSubqueryFromClause )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:284:3: lv_fromClause_1_0= ruleSubqueryFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubqueryAccess().getFromClauseSubqueryFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubqueryFromClause_in_ruleSubquery416);
            lv_fromClause_1_0=ruleSubqueryFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubqueryRule());
              	        }
                     		set(
                     			current, 
                     			"fromClause",
                      		lv_fromClause_1_0, 
                      		"SubqueryFromClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:300:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:301:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:301:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:302:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSubquery437);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryRule());
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:318:3: ( (lv_variablesClause_3_0= ruleVariablesClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_88) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:319:1: (lv_variablesClause_3_0= ruleVariablesClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:319:1: (lv_variablesClause_3_0= ruleVariablesClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:320:3: lv_variablesClause_3_0= ruleVariablesClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryAccess().getVariablesClauseVariablesClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariablesClause_in_ruleSubquery459);
                    lv_variablesClause_3_0=ruleVariablesClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryRule());
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:336:3: ( (lv_parametersClause_4_0= ruleParametersClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_94) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:337:1: (lv_parametersClause_4_0= ruleParametersClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:337:1: (lv_parametersClause_4_0= ruleParametersClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:338:3: lv_parametersClause_4_0= ruleParametersClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryAccess().getParametersClauseParametersClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParametersClause_in_ruleSubquery481);
                    lv_parametersClause_4_0=ruleParametersClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryRule());
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:354:3: ( (lv_importClause_5_0= ruleImportClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_60) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:355:1: (lv_importClause_5_0= ruleImportClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:355:1: (lv_importClause_5_0= ruleImportClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:356:3: lv_importClause_5_0= ruleImportClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryAccess().getImportClauseImportClauseParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImportClause_in_ruleSubquery503);
                    lv_importClause_5_0=ruleImportClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryRule());
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubquery"


    // $ANTLR start "entryRuleSelectClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:380:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:381:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:382:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause539);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause549); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:389:1: ruleSelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:392:28: ( ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:393:1: ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:393:1: ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:393:2: () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:393:2: ()
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:394:2: 
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

            otherlv_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSelectClause599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:407:1: ( (lv_isUnique_2_0= KEYWORD_55 ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_55) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:408:1: (lv_isUnique_2_0= KEYWORD_55 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:408:1: (lv_isUnique_2_0= KEYWORD_55 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:409:3: lv_isUnique_2_0= KEYWORD_55
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleSelectClause617); if (state.failed) return current;
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:423:3: ( (lv_resultClause_3_0= ruleResultClause ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=KEYWORD_129 && LA13_0<=KEYWORD_126)||(LA13_0>=KEYWORD_120 && LA13_0<=KEYWORD_118)||LA13_0==KEYWORD_108||(LA13_0>=KEYWORD_102 && LA13_0<=KEYWORD_101)||LA13_0==KEYWORD_93||(LA13_0>=KEYWORD_97 && LA13_0<=KEYWORD_98)||(LA13_0>=KEYWORD_83 && LA13_0<=KEYWORD_87)||(LA13_0>=KEYWORD_89 && LA13_0<=KEYWORD_81)||(LA13_0>=KEYWORD_65 && LA13_0<=KEYWORD_70)||LA13_0==KEYWORD_56||(LA13_0>=KEYWORD_58 && LA13_0<=KEYWORD_59)||LA13_0==KEYWORD_62||(LA13_0>=KEYWORD_48 && LA13_0<=KEYWORD_49)||(LA13_0>=KEYWORD_39 && LA13_0<=KEYWORD_43)||(LA13_0>=KEYWORD_27 && LA13_0<=KEYWORD_28)||(LA13_0>=KEYWORD_30 && LA13_0<=KEYWORD_32)||LA13_0==KEYWORD_1||LA13_0==KEYWORD_4||LA13_0==KEYWORD_7||LA13_0==KEYWORD_9||LA13_0==KEYWORD_12||(LA13_0>=KEYWORD_17 && LA13_0<=RULE_STRING)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:424:1: (lv_resultClause_3_0= ruleResultClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:424:1: (lv_resultClause_3_0= ruleResultClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:425:3: lv_resultClause_3_0= ruleResultClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getResultClauseResultClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleResultClause_in_ruleSelectClause650);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:441:3: ( (lv_intoClause_4_0= ruleIntoClause ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:442:1: (lv_intoClause_4_0= ruleIntoClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:442:1: (lv_intoClause_4_0= ruleIntoClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:443:3: lv_intoClause_4_0= ruleIntoClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getIntoClauseIntoClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntoClause_in_ruleSelectClause672);
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


    // $ANTLR start "entryRuleSubquerySelectClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:467:1: entryRuleSubquerySelectClause returns [EObject current=null] : iv_ruleSubquerySelectClause= ruleSubquerySelectClause EOF ;
    public final EObject entryRuleSubquerySelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubquerySelectClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:468:2: (iv_ruleSubquerySelectClause= ruleSubquerySelectClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:469:2: iv_ruleSubquerySelectClause= ruleSubquerySelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubquerySelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSubquerySelectClause_in_entryRuleSubquerySelectClause708);
            iv_ruleSubquerySelectClause=ruleSubquerySelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubquerySelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubquerySelectClause718); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubquerySelectClause"


    // $ANTLR start "ruleSubquerySelectClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:476:1: ruleSubquerySelectClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleSubqueryResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) ;
    public final EObject ruleSubquerySelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isUnique_2_0=null;
        EObject lv_resultClause_3_0 = null;

        EObject lv_intoClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:479:28: ( ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleSubqueryResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:480:1: ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleSubqueryResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:480:1: ( () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleSubqueryResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:480:2: () otherlv_1= KEYWORD_54 ( (lv_isUnique_2_0= KEYWORD_55 ) )? ( (lv_resultClause_3_0= ruleSubqueryResultClause ) )? ( (lv_intoClause_4_0= ruleIntoClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:480:2: ()
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:481:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubquerySelectClauseAccess().getSelectClauseAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSubquerySelectClause768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubquerySelectClauseAccess().getSELECTKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:494:1: ( (lv_isUnique_2_0= KEYWORD_55 ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:495:1: (lv_isUnique_2_0= KEYWORD_55 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:495:1: (lv_isUnique_2_0= KEYWORD_55 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:496:3: lv_isUnique_2_0= KEYWORD_55
                    {
                    lv_isUnique_2_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleSubquerySelectClause786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isUnique_2_0, grammarAccess.getSubquerySelectClauseAccess().getIsUniqueUNIQUEKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubquerySelectClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isUnique", true, "UNIQUE");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:510:3: ( (lv_resultClause_3_0= ruleSubqueryResultClause ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=KEYWORD_129 && LA16_0<=KEYWORD_126)||(LA16_0>=KEYWORD_120 && LA16_0<=KEYWORD_118)||LA16_0==KEYWORD_108||(LA16_0>=KEYWORD_102 && LA16_0<=KEYWORD_101)||LA16_0==KEYWORD_93||(LA16_0>=KEYWORD_97 && LA16_0<=KEYWORD_98)||(LA16_0>=KEYWORD_83 && LA16_0<=KEYWORD_87)||(LA16_0>=KEYWORD_89 && LA16_0<=KEYWORD_81)||(LA16_0>=KEYWORD_65 && LA16_0<=KEYWORD_70)||LA16_0==KEYWORD_56||(LA16_0>=KEYWORD_58 && LA16_0<=KEYWORD_59)||LA16_0==KEYWORD_62||(LA16_0>=KEYWORD_48 && LA16_0<=KEYWORD_49)||(LA16_0>=KEYWORD_39 && LA16_0<=KEYWORD_43)||(LA16_0>=KEYWORD_27 && LA16_0<=KEYWORD_28)||(LA16_0>=KEYWORD_30 && LA16_0<=KEYWORD_32)||LA16_0==KEYWORD_1||LA16_0==KEYWORD_4||LA16_0==KEYWORD_7||LA16_0==KEYWORD_9||LA16_0==KEYWORD_12||(LA16_0>=KEYWORD_17 && LA16_0<=RULE_STRING)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:511:1: (lv_resultClause_3_0= ruleSubqueryResultClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:511:1: (lv_resultClause_3_0= ruleSubqueryResultClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:512:3: lv_resultClause_3_0= ruleSubqueryResultClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubquerySelectClauseAccess().getResultClauseSubqueryResultClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubqueryResultClause_in_ruleSubquerySelectClause819);
                    lv_resultClause_3_0=ruleSubqueryResultClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubquerySelectClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"resultClause",
                              		lv_resultClause_3_0, 
                              		"SubqueryResultClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:528:3: ( (lv_intoClause_4_0= ruleIntoClause ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:529:1: (lv_intoClause_4_0= ruleIntoClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:529:1: (lv_intoClause_4_0= ruleIntoClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:530:3: lv_intoClause_4_0= ruleIntoClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubquerySelectClauseAccess().getIntoClauseIntoClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntoClause_in_ruleSubquerySelectClause841);
                    lv_intoClause_4_0=ruleIntoClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubquerySelectClauseRule());
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
    // $ANTLR end "ruleSubquerySelectClause"


    // $ANTLR start "entryRuleResultClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:554:1: entryRuleResultClause returns [EObject current=null] : iv_ruleResultClause= ruleResultClause EOF ;
    public final EObject entryRuleResultClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:555:2: (iv_ruleResultClause= ruleResultClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:556:2: iv_ruleResultClause= ruleResultClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultClauseRule()); 
            }
            pushFollow(FOLLOW_ruleResultClause_in_entryRuleResultClause877);
            iv_ruleResultClause=ruleResultClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultClause887); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:563:1: ruleResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_resultSpecs_1_0 = null;

        EObject lv_resultSpecs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:566:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:1: ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:1: ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:2: ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultSpecs_1_0= ruleResultSpec ) ) (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:567:2: ( (lv_isDistinct_0_0= KEYWORD_71 ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_71) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (lv_isDistinct_0_0= KEYWORD_71 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:568:1: (lv_isDistinct_0_0= KEYWORD_71 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:569:3: lv_isDistinct_0_0= KEYWORD_71
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleResultClause931); if (state.failed) return current;
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:583:3: ( (lv_resultSpecs_1_0= ruleResultSpec ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:584:1: (lv_resultSpecs_1_0= ruleResultSpec )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:584:1: (lv_resultSpecs_1_0= ruleResultSpec )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:585:3: lv_resultSpecs_1_0= ruleResultSpec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultSpec_in_ruleResultClause964);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:601:2: (otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KEYWORD_8) ) {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>=KEYWORD_129 && LA19_1<=KEYWORD_126)||(LA19_1>=KEYWORD_120 && LA19_1<=KEYWORD_118)||LA19_1==KEYWORD_108||(LA19_1>=KEYWORD_102 && LA19_1<=KEYWORD_101)||LA19_1==KEYWORD_93||(LA19_1>=KEYWORD_97 && LA19_1<=KEYWORD_98)||(LA19_1>=KEYWORD_83 && LA19_1<=KEYWORD_87)||(LA19_1>=KEYWORD_89 && LA19_1<=KEYWORD_91)||(LA19_1>=KEYWORD_72 && LA19_1<=KEYWORD_81)||(LA19_1>=KEYWORD_65 && LA19_1<=KEYWORD_70)||LA19_1==KEYWORD_56||(LA19_1>=KEYWORD_58 && LA19_1<=KEYWORD_59)||LA19_1==KEYWORD_62||(LA19_1>=KEYWORD_48 && LA19_1<=KEYWORD_49)||(LA19_1>=KEYWORD_39 && LA19_1<=KEYWORD_43)||(LA19_1>=KEYWORD_27 && LA19_1<=KEYWORD_28)||(LA19_1>=KEYWORD_30 && LA19_1<=KEYWORD_32)||LA19_1==KEYWORD_1||LA19_1==KEYWORD_4||LA19_1==KEYWORD_7||LA19_1==KEYWORD_9||LA19_1==KEYWORD_12||(LA19_1>=KEYWORD_17 && LA19_1<=RULE_STRING)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:602:2: otherlv_2= KEYWORD_8 ( (lv_resultSpecs_3_0= ruleResultSpec ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleResultClause978); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getResultClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:606:1: ( (lv_resultSpecs_3_0= ruleResultSpec ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:607:1: (lv_resultSpecs_3_0= ruleResultSpec )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:607:1: (lv_resultSpecs_3_0= ruleResultSpec )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:608:3: lv_resultSpecs_3_0= ruleResultSpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResultClauseAccess().getResultSpecsResultSpecParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultSpec_in_ruleResultClause998);
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
            	    break loop19;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:624:4: (otherlv_4= KEYWORD_8 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_8) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:625:2: otherlv_4= KEYWORD_8
                    {
                    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleResultClause1014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getResultClauseAccess().getCommaKeyword_3());
                          
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
    // $ANTLR end "ruleResultClause"


    // $ANTLR start "entryRuleSubqueryResultClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:637:1: entryRuleSubqueryResultClause returns [EObject current=null] : iv_ruleSubqueryResultClause= ruleSubqueryResultClause EOF ;
    public final EObject entryRuleSubqueryResultClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubqueryResultClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:638:2: (iv_ruleSubqueryResultClause= ruleSubqueryResultClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:639:2: iv_ruleSubqueryResultClause= ruleSubqueryResultClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubqueryResultClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSubqueryResultClause_in_entryRuleSubqueryResultClause1050);
            iv_ruleSubqueryResultClause=ruleSubqueryResultClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubqueryResultClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubqueryResultClause1060); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubqueryResultClause"


    // $ANTLR start "ruleSubqueryResultClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:646:1: ruleSubqueryResultClause returns [EObject current=null] : ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultExpression_1_0= ruleConditionalOrExpression ) ) (otherlv_2= KEYWORD_8 )? ) ;
    public final EObject ruleSubqueryResultClause() throws RecognitionException {
        EObject current = null;

        Token lv_isDistinct_0_0=null;
        Token otherlv_2=null;
        EObject lv_resultExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:649:28: ( ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultExpression_1_0= ruleConditionalOrExpression ) ) (otherlv_2= KEYWORD_8 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:650:1: ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultExpression_1_0= ruleConditionalOrExpression ) ) (otherlv_2= KEYWORD_8 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:650:1: ( ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultExpression_1_0= ruleConditionalOrExpression ) ) (otherlv_2= KEYWORD_8 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:650:2: ( (lv_isDistinct_0_0= KEYWORD_71 ) )? ( (lv_resultExpression_1_0= ruleConditionalOrExpression ) ) (otherlv_2= KEYWORD_8 )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:650:2: ( (lv_isDistinct_0_0= KEYWORD_71 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_71) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:651:1: (lv_isDistinct_0_0= KEYWORD_71 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:651:1: (lv_isDistinct_0_0= KEYWORD_71 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:652:3: lv_isDistinct_0_0= KEYWORD_71
                    {
                    lv_isDistinct_0_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleSubqueryResultClause1104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_0_0, grammarAccess.getSubqueryResultClauseAccess().getIsDistinctDISTINCTKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubqueryResultClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:666:3: ( (lv_resultExpression_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:667:1: (lv_resultExpression_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:667:1: (lv_resultExpression_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:668:3: lv_resultExpression_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubqueryResultClauseAccess().getResultExpressionConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleSubqueryResultClause1137);
            lv_resultExpression_1_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubqueryResultClauseRule());
              	        }
                     		set(
                     			current, 
                     			"resultExpression",
                      		lv_resultExpression_1_0, 
                      		"ConditionalOrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:684:2: (otherlv_2= KEYWORD_8 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:685:2: otherlv_2= KEYWORD_8
                    {
                    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSubqueryResultClause1151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubqueryResultClauseAccess().getCommaKeyword_2());
                          
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
    // $ANTLR end "ruleSubqueryResultClause"


    // $ANTLR start "entryRuleIntoClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:697:1: entryRuleIntoClause returns [EObject current=null] : iv_ruleIntoClause= ruleIntoClause EOF ;
    public final EObject entryRuleIntoClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntoClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:698:2: (iv_ruleIntoClause= ruleIntoClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:699:2: iv_ruleIntoClause= ruleIntoClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntoClauseRule()); 
            }
            pushFollow(FOLLOW_ruleIntoClause_in_entryRuleIntoClause1187);
            iv_ruleIntoClause=ruleIntoClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntoClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntoClause1197); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:706:1: ruleIntoClause returns [EObject current=null] : (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) ;
    public final EObject ruleIntoClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_resultClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:709:28: ( (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:710:1: (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:710:1: (otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:711:2: otherlv_0= KEYWORD_35 ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleIntoClause1235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntoClauseAccess().getINTOKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:715:1: ( (lv_resultClassName_1_0= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:716:1: (lv_resultClassName_1_0= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:716:1: (lv_resultClassName_1_0= ruleClassOrInterfaceName )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:717:3: lv_resultClassName_1_0= ruleClassOrInterfaceName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntoClauseAccess().getResultClassNameClassOrInterfaceNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause1255);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:741:1: entryRuleResultSpec returns [EObject current=null] : iv_ruleResultSpec= ruleResultSpec EOF ;
    public final EObject entryRuleResultSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultSpec = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:742:2: (iv_ruleResultSpec= ruleResultSpec EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:743:2: iv_ruleResultSpec= ruleResultSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultSpecRule()); 
            }
            pushFollow(FOLLOW_ruleResultSpec_in_entryRuleResultSpec1290);
            iv_ruleResultSpec=ruleResultSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultSpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultSpec1300); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:750:1: ruleResultSpec returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? ) ;
    public final EObject ruleResultSpec() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalOrExpression_0 = null;

        EObject lv_resultNaming_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:753:28: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:754:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:754:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:755:2: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_resultNaming_1_0= ruleResultNaming ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getResultSpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec1350);
            this_ConditionalOrExpression_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:766:1: ( (lv_resultNaming_1_0= ruleResultNaming ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:767:1: (lv_resultNaming_1_0= ruleResultNaming )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:767:1: (lv_resultNaming_1_0= ruleResultNaming )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:768:3: lv_resultNaming_1_0= ruleResultNaming
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResultSpecAccess().getResultNamingResultNamingParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleResultNaming_in_ruleResultSpec1370);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:792:1: entryRuleResultNaming returns [EObject current=null] : iv_ruleResultNaming= ruleResultNaming EOF ;
    public final EObject entryRuleResultNaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultNaming = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:793:2: (iv_ruleResultNaming= ruleResultNaming EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:794:2: iv_ruleResultNaming= ruleResultNaming EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultNamingRule()); 
            }
            pushFollow(FOLLOW_ruleResultNaming_in_entryRuleResultNaming1406);
            iv_ruleResultNaming=ruleResultNaming();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultNaming; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultNaming1416); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:801:1: ruleResultNaming returns [EObject current=null] : (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleResultNaming() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:804:28: ( (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:805:1: (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:805:1: (otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:806:2: otherlv_0= KEYWORD_23 ( (lv_identifier_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleResultNaming1454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getResultNamingAccess().getASKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:810:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:811:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:811:1: (lv_identifier_1_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:812:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultNaming1470); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:836:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:837:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:838:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause1510);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause1520); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:845:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isExcludeSubclasses_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_candidateClassName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:848:28: ( (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:849:1: (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:849:1: (otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:850:2: otherlv_0= KEYWORD_34 ( (lv_candidateClassName_1_0= ruleCandidateClassName ) ) ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleFromClause1558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:854:1: ( (lv_candidateClassName_1_0= ruleCandidateClassName ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:855:1: (lv_candidateClassName_1_0= ruleCandidateClassName )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:855:1: (lv_candidateClassName_1_0= ruleCandidateClassName )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:856:3: lv_candidateClassName_1_0= ruleCandidateClassName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClauseAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_ruleFromClause1578);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:872:2: ( ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:872:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) ) otherlv_3= KEYWORD_95
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:872:3: ( (lv_isExcludeSubclasses_2_0= KEYWORD_63 ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:873:1: (lv_isExcludeSubclasses_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:873:1: (lv_isExcludeSubclasses_2_0= KEYWORD_63 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:874:3: lv_isExcludeSubclasses_2_0= KEYWORD_63
                    {
                    lv_isExcludeSubclasses_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleFromClause1598); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,KEYWORD_95,FOLLOW_KEYWORD_95_in_ruleFromClause1622); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSubqueryFromClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:901:1: entryRuleSubqueryFromClause returns [EObject current=null] : iv_ruleSubqueryFromClause= ruleSubqueryFromClause EOF ;
    public final EObject entryRuleSubqueryFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubqueryFromClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:902:2: (iv_ruleSubqueryFromClause= ruleSubqueryFromClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:903:2: iv_ruleSubqueryFromClause= ruleSubqueryFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubqueryFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSubqueryFromClause_in_entryRuleSubqueryFromClause1658);
            iv_ruleSubqueryFromClause=ruleSubqueryFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubqueryFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubqueryFromClause1668); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubqueryFromClause"


    // $ANTLR start "ruleSubqueryFromClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:910:1: ruleSubqueryFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) ) | ( (lv_candidateClassName_4_0= ruleCandidateClassName ) ) ) ( (lv_alias_5_0= ruleAlias ) )? ( ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95 )? ) ;
    public final EObject ruleSubqueryFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isExcludeSubclasses_6_0=null;
        Token otherlv_7=null;
        EObject lv_fieldAccessExpression_3_0 = null;

        AntlrDatatypeRuleToken lv_candidateClassName_4_0 = null;

        EObject lv_alias_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:913:28: ( (otherlv_0= KEYWORD_34 ( (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) ) | ( (lv_candidateClassName_4_0= ruleCandidateClassName ) ) ) ( (lv_alias_5_0= ruleAlias ) )? ( ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:914:1: (otherlv_0= KEYWORD_34 ( (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) ) | ( (lv_candidateClassName_4_0= ruleCandidateClassName ) ) ) ( (lv_alias_5_0= ruleAlias ) )? ( ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:914:1: (otherlv_0= KEYWORD_34 ( (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) ) | ( (lv_candidateClassName_4_0= ruleCandidateClassName ) ) ) ( (lv_alias_5_0= ruleAlias ) )? ( ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:915:2: otherlv_0= KEYWORD_34 ( (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) ) | ( (lv_candidateClassName_4_0= ruleCandidateClassName ) ) ) ( (lv_alias_5_0= ruleAlias ) )? ( ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleSubqueryFromClause1706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubqueryFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:919:1: ( (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) ) | ( (lv_candidateClassName_4_0= ruleCandidateClassName ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_41) ) {
                alt25=1;
            }
            else if ( (LA25_0==KEYWORD_119||(LA25_0>=KEYWORD_111 && LA25_0<=KEYWORD_112)||(LA25_0>=KEYWORD_109 && LA25_0<=KEYWORD_105)||LA25_0==KEYWORD_61||LA25_0==KEYWORD_51||LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:919:2: (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:919:2: (otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:920:2: otherlv_1= KEYWORD_41 otherlv_2= KEYWORD_10 ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) )
                    {
                    otherlv_1=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleSubqueryFromClause1720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSubqueryFromClauseAccess().getThisKeyword_1_0_0());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSubqueryFromClause1732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubqueryFromClauseAccess().getFullStopKeyword_1_0_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:929:1: ( (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:930:1: (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:930:1: (lv_fieldAccessExpression_3_0= ruleFieldAccessExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:931:3: lv_fieldAccessExpression_3_0= ruleFieldAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryFromClauseAccess().getFieldAccessExpressionFieldAccessExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleSubqueryFromClause1752);
                    lv_fieldAccessExpression_3_0=ruleFieldAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryFromClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"fieldAccessExpression",
                              		lv_fieldAccessExpression_3_0, 
                              		"FieldAccessExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:948:6: ( (lv_candidateClassName_4_0= ruleCandidateClassName ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:948:6: ( (lv_candidateClassName_4_0= ruleCandidateClassName ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:949:1: (lv_candidateClassName_4_0= ruleCandidateClassName )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:949:1: (lv_candidateClassName_4_0= ruleCandidateClassName )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:950:3: lv_candidateClassName_4_0= ruleCandidateClassName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryFromClauseAccess().getCandidateClassNameCandidateClassNameParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCandidateClassName_in_ruleSubqueryFromClause1780);
                    lv_candidateClassName_4_0=ruleCandidateClassName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryFromClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"candidateClassName",
                              		lv_candidateClassName_4_0, 
                              		"CandidateClassName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:966:3: ( (lv_alias_5_0= ruleAlias ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_23||LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:967:1: (lv_alias_5_0= ruleAlias )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:967:1: (lv_alias_5_0= ruleAlias )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:968:3: lv_alias_5_0= ruleAlias
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubqueryFromClauseAccess().getAliasAliasParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAlias_in_ruleSubqueryFromClause1802);
                    lv_alias_5_0=ruleAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubqueryFromClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"alias",
                              		lv_alias_5_0, 
                              		"Alias");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:984:3: ( ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_63) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:984:4: ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) ) otherlv_7= KEYWORD_95
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:984:4: ( (lv_isExcludeSubclasses_6_0= KEYWORD_63 ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:985:1: (lv_isExcludeSubclasses_6_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:985:1: (lv_isExcludeSubclasses_6_0= KEYWORD_63 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:986:3: lv_isExcludeSubclasses_6_0= KEYWORD_63
                    {
                    lv_isExcludeSubclasses_6_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleSubqueryFromClause1823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isExcludeSubclasses_6_0, grammarAccess.getSubqueryFromClauseAccess().getIsExcludeSubclassesEXCLUDEKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubqueryFromClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isExcludeSubclasses", true, "EXCLUDE");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,KEYWORD_95,FOLLOW_KEYWORD_95_in_ruleSubqueryFromClause1847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubqueryFromClauseAccess().getSUBCLASSESKeyword_3_1());
                          
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
    // $ANTLR end "ruleSubqueryFromClause"


    // $ANTLR start "entryRuleAlias"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1013:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1014:2: (iv_ruleAlias= ruleAlias EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1015:2: iv_ruleAlias= ruleAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasRule()); 
            }
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias1883);
            iv_ruleAlias=ruleAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlias; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias1893); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1022:1: ruleAlias returns [EObject current=null] : ( (otherlv_0= KEYWORD_23 )? ( (lv_identifier_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1025:28: ( ( (otherlv_0= KEYWORD_23 )? ( (lv_identifier_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:1: ( (otherlv_0= KEYWORD_23 )? ( (lv_identifier_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:1: ( (otherlv_0= KEYWORD_23 )? ( (lv_identifier_1_0= RULE_ID ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:2: (otherlv_0= KEYWORD_23 )? ( (lv_identifier_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1026:2: (otherlv_0= KEYWORD_23 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1027:2: otherlv_0= KEYWORD_23
                    {
                    otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAlias1932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getASKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1031:3: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1032:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1032:1: (lv_identifier_1_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1033:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlias1950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getAliasAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasRule());
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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleWhereClause"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1057:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1058:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1059:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause1990);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause2000); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1066:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filter_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1069:28: ( (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1070:1: (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1070:1: (otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1071:2: otherlv_0= KEYWORD_47 ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleWhereClause2038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1075:1: ( (lv_filter_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1076:1: (lv_filter_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1076:1: (lv_filter_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1077:3: lv_filter_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereClauseAccess().getFilterConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause2058);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1101:1: entryRuleVariablesClause returns [EObject current=null] : iv_ruleVariablesClause= ruleVariablesClause EOF ;
    public final EObject entryRuleVariablesClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1102:2: (iv_ruleVariablesClause= ruleVariablesClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1103:2: iv_ruleVariablesClause= ruleVariablesClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariablesClauseRule()); 
            }
            pushFollow(FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause2093);
            iv_ruleVariablesClause=ruleVariablesClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariablesClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariablesClause2103); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1110:1: ruleVariablesClause returns [EObject current=null] : (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) ;
    public final EObject ruleVariablesClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1113:28: ( (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1114:1: (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1114:1: (otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1115:2: otherlv_0= KEYWORD_88 ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) ) (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )* (otherlv_4= KEYWORD_13 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleVariablesClause2141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVariablesClauseAccess().getVARIABLESKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1119:1: ( (lv_variableDeclarations_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1120:1: (lv_variableDeclarations_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1120:1: (lv_variableDeclarations_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1121:3: lv_variableDeclarations_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause2161);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1137:2: (otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_13) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==KEYWORD_119||(LA29_1>=KEYWORD_111 && LA29_1<=KEYWORD_112)||(LA29_1>=KEYWORD_109 && LA29_1<=KEYWORD_105)||LA29_1==KEYWORD_64||LA29_1==KEYWORD_57||LA29_1==KEYWORD_61||(LA29_1>=KEYWORD_50 && LA29_1<=KEYWORD_52)||(LA29_1>=KEYWORD_36 && LA29_1<=KEYWORD_38)||LA29_1==KEYWORD_29||LA29_1==RULE_ID) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1138:2: otherlv_2= KEYWORD_13 ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleVariablesClause2175); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVariablesClauseAccess().getSemicolonKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1142:1: ( (lv_variableDeclarations_3_0= ruleVariableDeclaration ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1143:1: (lv_variableDeclarations_3_0= ruleVariableDeclaration )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1143:1: (lv_variableDeclarations_3_0= ruleVariableDeclaration )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1144:3: lv_variableDeclarations_3_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVariablesClauseAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause2195);
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
            	    break loop29;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1160:4: (otherlv_4= KEYWORD_13 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1161:2: otherlv_4= KEYWORD_13
                    {
                    otherlv_4=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleVariablesClause2211); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1173:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1174:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1175:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2247);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2257); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1182:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_variableName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1185:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1186:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1186:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1186:2: ( (lv_type_0_0= ruleType ) ) ( (lv_variableName_1_0= ruleVariableName ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1186:2: ( (lv_type_0_0= ruleType ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1187:1: (lv_type_0_0= ruleType )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1187:1: (lv_type_0_0= ruleType )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1188:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration2303);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1204:2: ( (lv_variableName_1_0= ruleVariableName ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1205:1: (lv_variableName_1_0= ruleVariableName )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1205:1: (lv_variableName_1_0= ruleVariableName )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1206:3: lv_variableName_1_0= ruleVariableName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getVariableNameVariableNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableName_in_ruleVariableDeclaration2324);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1230:1: entryRuleVariableName returns [String current=null] : iv_ruleVariableName= ruleVariableName EOF ;
    public final String entryRuleVariableName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1231:1: (iv_ruleVariableName= ruleVariableName EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1232:2: iv_ruleVariableName= ruleVariableName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableNameRule()); 
            }
            pushFollow(FOLLOW_ruleVariableName_in_entryRuleVariableName2360);
            iv_ruleVariableName=ruleVariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableName2371); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1239:1: ruleVariableName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVariableName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1243:6: (this_ID_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1244:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableName2410); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1259:1: entryRuleParametersClause returns [EObject current=null] : iv_ruleParametersClause= ruleParametersClause EOF ;
    public final EObject entryRuleParametersClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1260:2: (iv_ruleParametersClause= ruleParametersClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1261:2: iv_ruleParametersClause= ruleParametersClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersClauseRule()); 
            }
            pushFollow(FOLLOW_ruleParametersClause_in_entryRuleParametersClause2453);
            iv_ruleParametersClause=ruleParametersClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParametersClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersClause2463); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1268:1: ruleParametersClause returns [EObject current=null] : (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleParametersClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1271:28: ( (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1272:1: (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1272:1: (otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1273:2: otherlv_0= KEYWORD_94 ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_94,FOLLOW_KEYWORD_94_in_ruleParametersClause2501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParametersClauseAccess().getPARAMETERSKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1277:1: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1278:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1278:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1279:3: lv_parameterDeclarations_1_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParametersClause2521);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1295:2: (otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==KEYWORD_8) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==KEYWORD_119||(LA31_1>=KEYWORD_111 && LA31_1<=KEYWORD_112)||(LA31_1>=KEYWORD_109 && LA31_1<=KEYWORD_105)||LA31_1==KEYWORD_64||LA31_1==KEYWORD_57||LA31_1==KEYWORD_61||(LA31_1>=KEYWORD_50 && LA31_1<=KEYWORD_52)||(LA31_1>=KEYWORD_36 && LA31_1<=KEYWORD_38)||LA31_1==KEYWORD_29||LA31_1==RULE_ID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1296:2: otherlv_2= KEYWORD_8 ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleParametersClause2535); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParametersClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1300:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1301:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1301:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1302:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParametersClauseAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParametersClause2555);
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
            	    break loop31;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1318:4: (otherlv_4= KEYWORD_8 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_8) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1319:2: otherlv_4= KEYWORD_8
                    {
                    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleParametersClause2571); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1331:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1332:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1333:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2607);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2617); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1340:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_declaredParameterName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1343:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1344:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1344:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1344:2: ( (lv_type_0_0= ruleType ) ) ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1344:2: ( (lv_type_0_0= ruleType ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1345:1: (lv_type_0_0= ruleType )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1345:1: (lv_type_0_0= ruleType )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1346:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameterDeclaration2663);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1362:2: ( (lv_declaredParameterName_1_0= ruleDeclaredParameterName ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1363:1: (lv_declaredParameterName_1_0= ruleDeclaredParameterName )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1363:1: (lv_declaredParameterName_1_0= ruleDeclaredParameterName )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1364:3: lv_declaredParameterName_1_0= ruleDeclaredParameterName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getDeclaredParameterNameDeclaredParameterNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration2684);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1388:1: entryRuleDeclaredParameterName returns [String current=null] : iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF ;
    public final String entryRuleDeclaredParameterName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaredParameterName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1389:1: (iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1390:2: iv_ruleDeclaredParameterName= ruleDeclaredParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName2720);
            iv_ruleDeclaredParameterName=ruleDeclaredParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredParameterName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameterName2731); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1397:1: ruleDeclaredParameterName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ParameterName_0= ruleParameterName ;
    public final AntlrDatatypeRuleToken ruleDeclaredParameterName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ParameterName_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1401:6: (this_ParameterName_0= ruleParameterName )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1403:5: this_ParameterName_0= ruleParameterName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDeclaredParameterNameAccess().getParameterNameParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleParameterName_in_ruleDeclaredParameterName2777);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1421:1: entryRuleParameterName returns [String current=null] : iv_ruleParameterName= ruleParameterName EOF ;
    public final String entryRuleParameterName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1422:1: (iv_ruleParameterName= ruleParameterName EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1423:2: iv_ruleParameterName= ruleParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName2821);
            iv_ruleParameterName=ruleParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName2832); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1430:1: ruleParameterName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleParameterName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1434:6: (this_ID_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1435:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName2871); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1450:1: entryRuleImportClause returns [EObject current=null] : iv_ruleImportClause= ruleImportClause EOF ;
    public final EObject entryRuleImportClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1451:2: (iv_ruleImportClause= ruleImportClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1452:2: iv_ruleImportClause= ruleImportClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportClauseRule()); 
            }
            pushFollow(FOLLOW_ruleImportClause_in_entryRuleImportClause2914);
            iv_ruleImportClause=ruleImportClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportClause2924); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1459:1: ruleImportClause returns [EObject current=null] : ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? ) ;
    public final EObject ruleImportClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importDeclarations_0_0 = null;

        AntlrDatatypeRuleToken lv_importDeclarations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1462:28: ( ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1463:1: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1463:1: ( ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1463:2: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) ) (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )* (otherlv_3= KEYWORD_13 )?
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1463:2: ( (lv_importDeclarations_0_0= ruleImportDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1464:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1464:1: (lv_importDeclarations_0_0= ruleImportDeclaration )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1465:3: lv_importDeclarations_0_0= ruleImportDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_ruleImportClause2970);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1481:2: (otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==KEYWORD_13) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==KEYWORD_60) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1482:2: otherlv_1= KEYWORD_13 ( (lv_importDeclarations_2_0= ruleImportDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleImportClause2984); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getImportClauseAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1486:1: ( (lv_importDeclarations_2_0= ruleImportDeclaration ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1487:1: (lv_importDeclarations_2_0= ruleImportDeclaration )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1487:1: (lv_importDeclarations_2_0= ruleImportDeclaration )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1488:3: lv_importDeclarations_2_0= ruleImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImportClauseAccess().getImportDeclarationsImportDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDeclaration_in_ruleImportClause3004);
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
            	    break loop33;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1504:4: (otherlv_3= KEYWORD_13 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_13) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1505:2: otherlv_3= KEYWORD_13
                    {
                    otherlv_3=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleImportClause3020); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1517:1: entryRuleImportDeclaration returns [String current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final String entryRuleImportDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDeclaration = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1518:1: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1519:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration3057);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration3068); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1526:1: ruleImportDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) ;
    public final AntlrDatatypeRuleToken ruleImportDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedIdentifier_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1530:6: ( (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1531:1: (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1531:1: (kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1532:2: kw= KEYWORD_60 this_QualifiedIdentifier_1= ruleQualifiedIdentifier
            {
            kw=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleImportDeclaration3106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getImportDeclarationAccess().getImportKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImportDeclarationAccess().getQualifiedIdentifierParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration3128);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1556:1: entryRuleGroupByClause returns [EObject current=null] : iv_ruleGroupByClause= ruleGroupByClause EOF ;
    public final EObject entryRuleGroupByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1557:2: (iv_ruleGroupByClause= ruleGroupByClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1558:2: iv_ruleGroupByClause= ruleGroupByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause3172);
            iv_ruleGroupByClause=ruleGroupByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByClause3182); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1565:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1568:28: ( (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1569:1: (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1569:1: (otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1570:2: otherlv_0= KEYWORD_44 otherlv_1= KEYWORD_24 ( (lv_grouping_2_0= ruleConditionalOrExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )* (otherlv_5= KEYWORD_8 )? ( (lv_havingClause_6_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleGroupByClause3220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleGroupByClause3232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1579:1: ( (lv_grouping_2_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1580:1: (lv_grouping_2_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1580:1: (lv_grouping_2_0= ruleConditionalOrExpression )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1581:3: lv_grouping_2_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause3252);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1597:2: (otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_8) ) {
                    int LA35_1 = input.LA(2);

                    if ( ((LA35_1>=KEYWORD_129 && LA35_1<=KEYWORD_126)||(LA35_1>=KEYWORD_120 && LA35_1<=KEYWORD_118)||LA35_1==KEYWORD_108||(LA35_1>=KEYWORD_102 && LA35_1<=KEYWORD_101)||LA35_1==KEYWORD_93||(LA35_1>=KEYWORD_97 && LA35_1<=KEYWORD_98)||(LA35_1>=KEYWORD_83 && LA35_1<=KEYWORD_87)||(LA35_1>=KEYWORD_89 && LA35_1<=KEYWORD_91)||(LA35_1>=KEYWORD_72 && LA35_1<=KEYWORD_81)||(LA35_1>=KEYWORD_65 && LA35_1<=KEYWORD_70)||LA35_1==KEYWORD_56||(LA35_1>=KEYWORD_58 && LA35_1<=KEYWORD_59)||LA35_1==KEYWORD_62||(LA35_1>=KEYWORD_48 && LA35_1<=KEYWORD_49)||(LA35_1>=KEYWORD_39 && LA35_1<=KEYWORD_43)||(LA35_1>=KEYWORD_27 && LA35_1<=KEYWORD_28)||(LA35_1>=KEYWORD_30 && LA35_1<=KEYWORD_32)||LA35_1==KEYWORD_1||LA35_1==KEYWORD_4||LA35_1==KEYWORD_7||LA35_1==KEYWORD_9||LA35_1==KEYWORD_12||(LA35_1>=KEYWORD_17 && LA35_1<=RULE_STRING)) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1598:2: otherlv_3= KEYWORD_8 ( (lv_grouping_4_0= ruleConditionalOrExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleGroupByClause3266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGroupByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1602:1: ( (lv_grouping_4_0= ruleConditionalOrExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1603:1: (lv_grouping_4_0= ruleConditionalOrExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1603:1: (lv_grouping_4_0= ruleConditionalOrExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1604:3: lv_grouping_4_0= ruleConditionalOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getGroupingConditionalOrExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause3286);
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
            	    break loop35;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1620:4: (otherlv_5= KEYWORD_8 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_8) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1621:2: otherlv_5= KEYWORD_8
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleGroupByClause3302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getGroupByClauseAccess().getCommaKeyword_4());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1625:3: ( (lv_havingClause_6_0= ruleHavingClause ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_53) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1626:1: (lv_havingClause_6_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1626:1: (lv_havingClause_6_0= ruleHavingClause )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1627:3: lv_havingClause_6_0= ruleHavingClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getHavingClauseHavingClauseParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleGroupByClause3324);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1651:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1652:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1653:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingClauseRule()); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause3360);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause3370); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1660:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1663:28: ( (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1664:1: (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1664:1: (otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1665:2: otherlv_0= KEYWORD_53 ( (lv_having_1_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleHavingClause3408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1669:1: ( (lv_having_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1670:1: (lv_having_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1670:1: (lv_having_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1671:3: lv_having_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause3428);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1695:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1696:2: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1697:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause3463);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderByClause3473); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1704:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1707:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1708:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1708:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )? )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1709:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_24 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* (otherlv_5= KEYWORD_8 )?
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleOrderByClause3511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleOrderByClause3523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1718:1: ( (lv_ordering_2_0= ruleOrderBySpec ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1719:1: (lv_ordering_2_0= ruleOrderBySpec )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1719:1: (lv_ordering_2_0= ruleOrderBySpec )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1720:3: lv_ordering_2_0= ruleOrderBySpec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderBySpec_in_ruleOrderByClause3543);
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

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1736:2: (otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_8) ) {
                    int LA38_1 = input.LA(2);

                    if ( ((LA38_1>=KEYWORD_129 && LA38_1<=KEYWORD_126)||(LA38_1>=KEYWORD_120 && LA38_1<=KEYWORD_118)||LA38_1==KEYWORD_108||(LA38_1>=KEYWORD_102 && LA38_1<=KEYWORD_101)||LA38_1==KEYWORD_93||(LA38_1>=KEYWORD_97 && LA38_1<=KEYWORD_98)||(LA38_1>=KEYWORD_83 && LA38_1<=KEYWORD_87)||(LA38_1>=KEYWORD_89 && LA38_1<=KEYWORD_91)||(LA38_1>=KEYWORD_72 && LA38_1<=KEYWORD_81)||(LA38_1>=KEYWORD_65 && LA38_1<=KEYWORD_70)||LA38_1==KEYWORD_56||(LA38_1>=KEYWORD_58 && LA38_1<=KEYWORD_59)||LA38_1==KEYWORD_62||(LA38_1>=KEYWORD_48 && LA38_1<=KEYWORD_49)||(LA38_1>=KEYWORD_39 && LA38_1<=KEYWORD_43)||(LA38_1>=KEYWORD_27 && LA38_1<=KEYWORD_28)||(LA38_1>=KEYWORD_30 && LA38_1<=KEYWORD_32)||LA38_1==KEYWORD_1||LA38_1==KEYWORD_4||LA38_1==KEYWORD_7||LA38_1==KEYWORD_9||LA38_1==KEYWORD_12||(LA38_1>=KEYWORD_17 && LA38_1<=RULE_STRING)) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1737:2: otherlv_3= KEYWORD_8 ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOrderByClause3557); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1741:1: ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1742:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1742:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1743:3: lv_ordering_4_0= ruleOrderBySpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderBySpec_in_ruleOrderByClause3577);
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
            	    break loop38;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1759:4: (otherlv_5= KEYWORD_8 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_8) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1760:2: otherlv_5= KEYWORD_8
                    {
                    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOrderByClause3593); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1772:1: entryRuleOrderBySpec returns [EObject current=null] : iv_ruleOrderBySpec= ruleOrderBySpec EOF ;
    public final EObject entryRuleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderBySpec = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1773:2: (iv_ruleOrderBySpec= ruleOrderBySpec EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1774:2: iv_ruleOrderBySpec= ruleOrderBySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderBySpecRule()); 
            }
            pushFollow(FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec3629);
            iv_ruleOrderBySpec=ruleOrderBySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderBySpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderBySpec3639); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1781:1: ruleOrderBySpec returns [EObject current=null] : (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) ;
    public final EObject ruleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalOrExpression_0 = null;

        Enumerator lv_direction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1784:28: ( (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1785:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1785:1: (this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1786:2: this_ConditionalOrExpression_0= ruleConditionalOrExpression ( (lv_direction_1_0= ruleOrderByDirection ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrderBySpecAccess().getConditionalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec3689);
            this_ConditionalOrExpression_0=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1797:1: ( (lv_direction_1_0= ruleOrderByDirection ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1798:1: (lv_direction_1_0= ruleOrderByDirection )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1798:1: (lv_direction_1_0= ruleOrderByDirection )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1799:3: lv_direction_1_0= ruleOrderByDirection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderBySpecAccess().getDirectionOrderByDirectionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec3709);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1823:1: entryRuleRangeClause returns [EObject current=null] : iv_ruleRangeClause= ruleRangeClause EOF ;
    public final EObject entryRuleRangeClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1824:2: (iv_ruleRangeClause= ruleRangeClause EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1825:2: iv_ruleRangeClause= ruleRangeClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeClauseRule()); 
            }
            pushFollow(FOLLOW_ruleRangeClause_in_entryRuleRangeClause3744);
            iv_ruleRangeClause=ruleRangeClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeClause3754); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1832:1: ruleRangeClause returns [EObject current=null] : (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) ;
    public final EObject ruleRangeClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1835:28: ( (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1836:1: (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1836:1: (otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1837:2: otherlv_0= KEYWORD_46 ( (lv_start_1_0= ruleConditionalOrExpression ) ) otherlv_2= KEYWORD_8 ( (lv_end_3_0= ruleConditionalOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleRangeClause3792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeClauseAccess().getRANGEKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1841:1: ( (lv_start_1_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1842:1: (lv_start_1_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1842:1: (lv_start_1_0= ruleConditionalOrExpression )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1843:3: lv_start_1_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeClauseAccess().getStartConditionalOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause3812);
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

            otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleRangeClause3825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeClauseAccess().getCommaKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1864:1: ( (lv_end_3_0= ruleConditionalOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1865:1: (lv_end_3_0= ruleConditionalOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1865:1: (lv_end_3_0= ruleConditionalOrExpression )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1866:3: lv_end_3_0= ruleConditionalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeClauseAccess().getEndConditionalOrExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause3845);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1890:1: entryRuleConditionalOrExpression returns [EObject current=null] : iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF ;
    public final EObject entryRuleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOrExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1891:2: (iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1892:2: iv_ruleConditionalOrExpression= ruleConditionalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3880);
            iv_ruleConditionalOrExpression=ruleConditionalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalOrExpression3890); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1899:1: ruleConditionalOrExpression returns [EObject current=null] : (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* ) ;
    public final EObject ruleConditionalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConditionalAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1902:28: ( (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1903:1: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1903:1: (this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1904:2: this_ConditionalAndExpression_0= ruleConditionalAndExpression ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getConditionalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3940);
            this_ConditionalAndExpression_0=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConditionalAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1915:1: ( () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_25) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1915:2: () otherlv_2= KEYWORD_25 ( (lv_right_3_0= ruleConditionalAndExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1915:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1916:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3965); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConditionalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1929:1: ( (lv_right_3_0= ruleConditionalAndExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1930:1: (lv_right_3_0= ruleConditionalAndExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1930:1: (lv_right_3_0= ruleConditionalAndExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1931:3: lv_right_3_0= ruleConditionalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalOrExpressionAccess().getRightConditionalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3985);
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
            	    break loop40;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1955:1: entryRuleConditionalAndExpression returns [EObject current=null] : iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF ;
    public final EObject entryRuleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAndExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1956:2: (iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1957:2: iv_ruleConditionalAndExpression= ruleConditionalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression4022);
            iv_ruleConditionalAndExpression=ruleConditionalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalAndExpression4032); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1964:1: ruleConditionalAndExpression returns [EObject current=null] : (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* ) ;
    public final EObject ruleConditionalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleOrExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1967:28: ( (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1968:1: (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1968:1: (this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1969:2: this_SimpleOrExpression_0= ruleSimpleOrExpression ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getSimpleOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression4082);
            this_SimpleOrExpression_0=ruleSimpleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SimpleOrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1980:1: ( () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==KEYWORD_19) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1980:2: () otherlv_2= KEYWORD_19 ( (lv_right_3_0= ruleSimpleOrExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1980:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1981:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression4107); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getConditionalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1994:1: ( (lv_right_3_0= ruleSimpleOrExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1995:1: (lv_right_3_0= ruleSimpleOrExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1995:1: (lv_right_3_0= ruleSimpleOrExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:1996:3: lv_right_3_0= ruleSimpleOrExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAndExpressionAccess().getRightSimpleOrExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression4127);
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
            	    break loop41;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2020:1: entryRuleSimpleOrExpression returns [EObject current=null] : iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF ;
    public final EObject entryRuleSimpleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOrExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2021:2: (iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2022:2: iv_ruleSimpleOrExpression= ruleSimpleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression4164);
            iv_ruleSimpleOrExpression=ruleSimpleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrExpression4174); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2029:1: ruleSimpleOrExpression returns [EObject current=null] : (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* ) ;
    public final EObject ruleSimpleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleAndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2032:28: ( (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2033:1: (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2033:1: (this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2034:2: this_SimpleAndExpression_0= ruleSimpleAndExpression ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleOrExpressionAccess().getSimpleAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression4224);
            this_SimpleAndExpression_0=ruleSimpleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SimpleAndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2045:1: ( () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==KEYWORD_16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2045:2: () otherlv_2= KEYWORD_16 ( (lv_right_3_0= ruleSimpleAndExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2045:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2046:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression4249); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleOrExpressionAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2059:1: ( (lv_right_3_0= ruleSimpleAndExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2060:1: (lv_right_3_0= ruleSimpleAndExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2060:1: (lv_right_3_0= ruleSimpleAndExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2061:3: lv_right_3_0= ruleSimpleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleOrExpressionAccess().getRightSimpleAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression4269);
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
            	    break loop42;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2085:1: entryRuleSimpleAndExpression returns [EObject current=null] : iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF ;
    public final EObject entryRuleSimpleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAndExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2086:2: (iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2087:2: iv_ruleSimpleAndExpression= ruleSimpleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression4306);
            iv_ruleSimpleAndExpression=ruleSimpleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAndExpression4316); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2094:1: ruleSimpleAndExpression returns [EObject current=null] : (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* ) ;
    public final EObject ruleSimpleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperatorExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2097:28: ( (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2098:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2098:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2099:2: this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression4366);
            this_ComparisonOperatorExpression_0=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ComparisonOperatorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2110:1: ( () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==KEYWORD_3) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2110:2: () otherlv_2= KEYWORD_3 ( (lv_right_3_0= ruleComparisonOperatorExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2110:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2111:2: 
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

            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression4391); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleAndExpressionAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2124:1: ( (lv_right_3_0= ruleComparisonOperatorExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2125:1: (lv_right_3_0= ruleComparisonOperatorExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2125:1: (lv_right_3_0= ruleComparisonOperatorExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2126:3: lv_right_3_0= ruleComparisonOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleAndExpressionAccess().getRightComparisonOperatorExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression4411);
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
            	    break loop43;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2150:1: entryRuleComparisonOperatorExpression returns [EObject current=null] : iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF ;
    public final EObject entryRuleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperatorExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2151:2: (iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2152:2: iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression4448);
            iv_ruleComparisonOperatorExpression=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression4458); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2159:1: ruleComparisonOperatorExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2162:28: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2163:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2163:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2164:2: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression4508);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AdditionExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2175:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==KEYWORD_96||LA44_0==KEYWORD_18||(LA44_0>=KEYWORD_20 && LA44_0<=KEYWORD_22)||(LA44_0>=KEYWORD_14 && LA44_0<=KEYWORD_15)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2175:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2175:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2176:2: 
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

            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2184:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2185:1: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2185:1: (lv_operator_2_0= ruleComparisonOperator )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2186:3: lv_operator_2_0= ruleComparisonOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression4541);
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

            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2202:2: ( (lv_right_3_0= ruleAdditionExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2203:1: (lv_right_3_0= ruleAdditionExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2203:1: (lv_right_3_0= ruleAdditionExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2204:3: lv_right_3_0= ruleAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression4562);
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
    // $ANTLR end "ruleComparisonOperatorExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2228:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2229:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2230:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression4599);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression4609); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2237:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2240:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2241:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2241:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2242:2: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression4659);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MultiplicationExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2253:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==KEYWORD_7||LA45_0==KEYWORD_9) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2253:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2253:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2254:2: 
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

            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2262:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2263:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2263:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2264:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression4692);
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

            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2280:2: ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2281:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2281:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2282:3: lv_right_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression4713);
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
            	    break loop45;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2306:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2307:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2308:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression4750);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression4760); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2315:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2318:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2319:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2319:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2320:2: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4810);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_UnaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2331:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==KEYWORD_2||LA46_0==KEYWORD_6||LA46_0==KEYWORD_11) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2331:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2331:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2332:2: 
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

            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2340:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2341:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2341:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2342:3: lv_operator_2_0= ruleMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression4843);
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

            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2358:2: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2359:1: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2359:1: (lv_right_3_0= ruleUnaryExpression )
            	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2360:3: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4864);
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
            	    break loop46;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2384:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2385:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2386:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4901);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression4911); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2393:1: ruleUnaryExpression returns [EObject current=null] : ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2396:28: ( ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2397:1: ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2397:1: ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2397:2: (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2397:2: (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2398:2: otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUnaryExpression4950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUnaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2402:1: ( (lv_castType_1_0= ruleType ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2403:1: (lv_castType_1_0= ruleType )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2403:1: (lv_castType_1_0= ruleType )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2404:3: lv_castType_1_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getCastTypeTypeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleUnaryExpression4970);
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

                    otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleUnaryExpression4983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2425:1: ( (lv_right_3_0= ruleFieldAccessExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2426:1: (lv_right_3_0= ruleFieldAccessExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2426:1: (lv_right_3_0= ruleFieldAccessExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2427:3: lv_right_3_0= ruleFieldAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression5003);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:6: ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:6: ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:7: ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2444:7: ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==KEYWORD_1||LA47_0==KEYWORD_7||LA47_0==KEYWORD_9||LA47_0==KEYWORD_17) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2445:1: (lv_unaryOperator_4_0= ruleUnaryOperator )
                            {
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2445:1: (lv_unaryOperator_4_0= ruleUnaryOperator )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2446:3: lv_unaryOperator_4_0= ruleUnaryOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression5032);
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

                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2462:3: ( (lv_right_5_0= ruleFieldAccessExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2463:1: (lv_right_5_0= ruleFieldAccessExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2463:1: (lv_right_5_0= ruleFieldAccessExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2464:3: lv_right_5_0= ruleFieldAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightFieldAccessExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression5054);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2488:1: entryRuleFieldAccessExpression returns [EObject current=null] : iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF ;
    public final EObject entryRuleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAccessExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2489:2: (iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2490:2: iv_ruleFieldAccessExpression= ruleFieldAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression5090);
            iv_ruleFieldAccessExpression=ruleFieldAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAccessExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAccessExpression5100); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2497:1: ruleFieldAccessExpression returns [EObject current=null] : (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) ) ;
    public final EObject ruleFieldAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_StaticMethodExpression_0 = null;

        EObject this_ParameterOrFieldOrMethodExpression_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2500:28: ( (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2501:1: (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2501:1: (this_StaticMethodExpression_0= ruleStaticMethodExpression | (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=KEYWORD_129 && LA50_0<=KEYWORD_126)||(LA50_0>=KEYWORD_120 && LA50_0<=KEYWORD_118)||LA50_0==KEYWORD_93||(LA50_0>=KEYWORD_83 && LA50_0<=KEYWORD_87)||(LA50_0>=KEYWORD_72 && LA50_0<=KEYWORD_77)||LA50_0==KEYWORD_48||LA50_0==KEYWORD_27||(LA50_0>=KEYWORD_30 && LA50_0<=KEYWORD_32)) ) {
                alt50=1;
            }
            else if ( (LA50_0==KEYWORD_108||(LA50_0>=KEYWORD_102 && LA50_0<=KEYWORD_101)||(LA50_0>=KEYWORD_97 && LA50_0<=KEYWORD_98)||(LA50_0>=KEYWORD_89 && LA50_0<=KEYWORD_91)||(LA50_0>=KEYWORD_78 && LA50_0<=KEYWORD_81)||(LA50_0>=KEYWORD_65 && LA50_0<=KEYWORD_70)||LA50_0==KEYWORD_56||(LA50_0>=KEYWORD_58 && LA50_0<=KEYWORD_59)||LA50_0==KEYWORD_62||LA50_0==KEYWORD_49||(LA50_0>=KEYWORD_39 && LA50_0<=KEYWORD_43)||LA50_0==KEYWORD_28||LA50_0==KEYWORD_4||LA50_0==KEYWORD_12||(LA50_0>=RULE_ID && LA50_0<=RULE_STRING)) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2502:2: this_StaticMethodExpression_0= ruleStaticMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getStaticMethodExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression5150);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2514:6: (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2514:6: (this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )* )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2515:2: this_ParameterOrFieldOrMethodExpression_1= ruleParameterOrFieldOrMethodExpression ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getParameterOrFieldOrMethodExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression5181);
                    this_ParameterOrFieldOrMethodExpression_1=ruleParameterOrFieldOrMethodExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParameterOrFieldOrMethodExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2526:1: ( () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==KEYWORD_10) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2526:2: () otherlv_3= KEYWORD_10 ( (lv_right_4_0= ruleFieldOrMethodExpression ) )
                    	    {
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2526:2: ()
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2527:2: 
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

                    	    otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression5206); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFieldAccessExpressionAccess().getFullStopKeyword_1_1_1());
                    	          
                    	    }
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2540:1: ( (lv_right_4_0= ruleFieldOrMethodExpression ) )
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2541:1: (lv_right_4_0= ruleFieldOrMethodExpression )
                    	    {
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2541:1: (lv_right_4_0= ruleFieldOrMethodExpression )
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2542:3: lv_right_4_0= ruleFieldOrMethodExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFieldAccessExpressionAccess().getRightFieldOrMethodExpressionParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression5226);
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
                    	    break loop49;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2566:1: entryRuleParameterOrFieldOrMethodExpression returns [EObject current=null] : iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF ;
    public final EObject entryRuleParameterOrFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOrFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2567:2: (iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2568:2: iv_ruleParameterOrFieldOrMethodExpression= ruleParameterOrFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression5264);
            iv_ruleParameterOrFieldOrMethodExpression=ruleParameterOrFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterOrFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression5274); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2575:1: ruleParameterOrFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2578:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2579:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2579:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) ) | this_ParenthesesExpression_5= ruleParenthesesExpression | ( (lv_method_6_0= ruleMethodExpression ) ) )
            int alt51=6;
            switch ( input.LA(1) ) {
            case KEYWORD_49:
            case KEYWORD_39:
            case KEYWORD_43:
            case RULE_INT:
            case RULE_STRING:
                {
                alt51=1;
                }
                break;
            case KEYWORD_41:
                {
                alt51=2;
                }
                break;
            case RULE_ID:
                {
                alt51=3;
                }
                break;
            case KEYWORD_12:
                {
                alt51=4;
                }
                break;
            case KEYWORD_4:
                {
                alt51=5;
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
                alt51=6;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2579:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2579:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2580:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2580:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2581:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression5320);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2598:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2598:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2599:1: (lv_this_1_0= KEYWORD_41 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2599:1: (lv_this_1_0= KEYWORD_41 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2600:3: lv_this_1_0= KEYWORD_41
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleParameterOrFieldOrMethodExpression5345); if (state.failed) return current;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2615:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2616:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2616:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2617:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression5379); if (state.failed) return current;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2634:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2634:6: (otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2635:2: otherlv_3= KEYWORD_12 ( (lv_parameterName_4_0= ruleParameterName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression5404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2639:1: ( (lv_parameterName_4_0= ruleParameterName ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2640:1: (lv_parameterName_4_0= ruleParameterName )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2640:1: (lv_parameterName_4_0= ruleParameterName )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2641:3: lv_parameterName_4_0= ruleParameterName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParameterNameParameterNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression5424);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2659:2: this_ParenthesesExpression_5= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression5456);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2671:6: ( (lv_method_6_0= ruleMethodExpression ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2671:6: ( (lv_method_6_0= ruleMethodExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2672:1: (lv_method_6_0= ruleMethodExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2672:1: (lv_method_6_0= ruleMethodExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2673:3: lv_method_6_0= ruleMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterOrFieldOrMethodExpressionAccess().getMethodMethodExpressionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodExpression_in_ruleParameterOrFieldOrMethodExpression5482);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2697:1: entryRuleFieldOrMethodExpression returns [EObject current=null] : iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF ;
    public final EObject entryRuleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOrMethodExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2698:2: (iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2699:2: iv_ruleFieldOrMethodExpression= ruleFieldOrMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOrMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression5517);
            iv_ruleFieldOrMethodExpression=ruleFieldOrMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOrMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldOrMethodExpression5527); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2706:1: ruleFieldOrMethodExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) ) ;
    public final EObject ruleFieldOrMethodExpression() throws RecognitionException {
        EObject current = null;

        Token lv_this_1_0=null;
        Token lv_id_2_0=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ParenthesesExpression_3 = null;

        EObject lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2709:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2710:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2710:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_this_1_0= KEYWORD_41 ) ) | ( (lv_id_2_0= RULE_ID ) ) | this_ParenthesesExpression_3= ruleParenthesesExpression | ( (lv_method_4_0= ruleMethodExpression ) ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case KEYWORD_49:
            case KEYWORD_39:
            case KEYWORD_43:
            case RULE_INT:
            case RULE_STRING:
                {
                alt52=1;
                }
                break;
            case KEYWORD_41:
                {
                alt52=2;
                }
                break;
            case RULE_ID:
                {
                alt52=3;
                }
                break;
            case KEYWORD_4:
                {
                alt52=4;
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
                alt52=5;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2710:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2710:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2711:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2711:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2712:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression5573);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2729:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2729:6: ( (lv_this_1_0= KEYWORD_41 ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2730:1: (lv_this_1_0= KEYWORD_41 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2730:1: (lv_this_1_0= KEYWORD_41 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2731:3: lv_this_1_0= KEYWORD_41
                    {
                    lv_this_1_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleFieldOrMethodExpression5598); if (state.failed) return current;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2746:6: ( (lv_id_2_0= RULE_ID ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2746:6: ( (lv_id_2_0= RULE_ID ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2747:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2747:1: (lv_id_2_0= RULE_ID )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2748:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression5632); if (state.failed) return current;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2766:2: this_ParenthesesExpression_3= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getParenthesesExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression5668);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2778:6: ( (lv_method_4_0= ruleMethodExpression ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2778:6: ( (lv_method_4_0= ruleMethodExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2779:1: (lv_method_4_0= ruleMethodExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2779:1: (lv_method_4_0= ruleMethodExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2780:3: lv_method_4_0= ruleMethodExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldOrMethodExpressionAccess().getMethodMethodExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMethodExpression_in_ruleFieldOrMethodExpression5694);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2804:1: entryRuleStaticMethodExpression returns [EObject current=null] : iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF ;
    public final EObject entryRuleStaticMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticMethodExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2805:2: (iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2806:2: iv_ruleStaticMethodExpression= ruleStaticMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStaticMethodExpression_in_entryRuleStaticMethodExpression5729);
            iv_ruleStaticMethodExpression=ruleStaticMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticMethodExpression5739); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2813:1: ruleStaticMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2816:28: ( ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2817:1: ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2817:1: ( ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 ) | ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 ) | ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 ) | ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 ) | ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 ) | ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 ) | ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 ) | ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 ) | ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 ) | ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 ) | ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 ) | ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 ) | ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 ) | ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 ) | ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 ) | ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 ) | ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 ) | ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 ) | ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 ) | ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 ) | ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 ) | ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 ) | ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 ) )
            int alt56=33;
            switch ( input.LA(1) ) {
            case KEYWORD_72:
                {
                alt56=1;
                }
                break;
            case KEYWORD_87:
                {
                alt56=2;
                }
                break;
            case KEYWORD_73:
                {
                alt56=3;
                }
                break;
            case KEYWORD_76:
                {
                alt56=4;
                }
                break;
            case KEYWORD_77:
                {
                alt56=5;
                }
                break;
            case KEYWORD_83:
                {
                alt56=6;
                }
                break;
            case KEYWORD_84:
                {
                alt56=7;
                }
                break;
            case KEYWORD_85:
                {
                alt56=8;
                }
                break;
            case KEYWORD_86:
                {
                alt56=9;
                }
                break;
            case KEYWORD_74:
                {
                alt56=10;
                }
                break;
            case KEYWORD_93:
                {
                alt56=11;
                }
                break;
            case KEYWORD_75:
                {
                alt56=12;
                }
                break;
            case KEYWORD_113:
                {
                alt56=13;
                }
                break;
            case KEYWORD_124:
                {
                alt56=14;
                }
                break;
            case KEYWORD_114:
                {
                alt56=15;
                }
                break;
            case KEYWORD_117:
                {
                alt56=16;
                }
                break;
            case KEYWORD_118:
                {
                alt56=17;
                }
                break;
            case KEYWORD_120:
                {
                alt56=18;
                }
                break;
            case KEYWORD_121:
                {
                alt56=19;
                }
                break;
            case KEYWORD_122:
                {
                alt56=20;
                }
                break;
            case KEYWORD_123:
                {
                alt56=21;
                }
                break;
            case KEYWORD_115:
                {
                alt56=22;
                }
                break;
            case KEYWORD_126:
                {
                alt56=23;
                }
                break;
            case KEYWORD_116:
                {
                alt56=24;
                }
                break;
            case KEYWORD_127:
                {
                alt56=25;
                }
                break;
            case KEYWORD_125:
                {
                alt56=26;
                }
                break;
            case KEYWORD_129:
                {
                alt56=27;
                }
                break;
            case KEYWORD_128:
                {
                alt56=28;
                }
                break;
            case KEYWORD_48:
                {
                alt56=29;
                }
                break;
            case KEYWORD_32:
                {
                alt56=30;
                }
                break;
            case KEYWORD_31:
                {
                alt56=31;
                }
                break;
            case KEYWORD_30:
                {
                alt56=32;
                }
                break;
            case KEYWORD_27:
                {
                alt56=33;
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2817:2: ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2817:2: ( () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2817:3: () otherlv_1= KEYWORD_72 otherlv_2= KEYWORD_4 ( (lv_number_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2817:3: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2818:2: 
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

                    otherlv_1=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleStaticMethodExpression5790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStaticMethodExpressionAccess().getMathAbsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2836:1: ( (lv_number_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2837:1: (lv_number_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2837:1: (lv_number_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2838:3: lv_number_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5822);
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

                    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2860:6: ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2860:6: ( () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2860:7: () otherlv_6= KEYWORD_87 otherlv_7= KEYWORD_4 ( (lv_number_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2860:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2861:2: 
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

                    otherlv_6=(Token)match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleStaticMethodExpression5867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStaticMethodExpressionAccess().getMathSqrtKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2879:1: ( (lv_number_8_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2880:1: (lv_number_8_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2880:1: (lv_number_8_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2881:3: lv_number_8_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5899);
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

                    otherlv_9=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2903:6: ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2903:6: ( () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2903:7: () otherlv_11= KEYWORD_73 otherlv_12= KEYWORD_4 ( (lv_number_13_0= ruleConditionalOrExpression ) ) otherlv_14= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2903:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2904:2: 
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

                    otherlv_11=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleStaticMethodExpression5944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getStaticMethodExpressionAccess().getMathCosKeyword_2_1());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2922:1: ( (lv_number_13_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2923:1: (lv_number_13_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2923:1: (lv_number_13_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2924:3: lv_number_13_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5976);
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

                    otherlv_14=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_2_4());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2946:6: ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2946:6: ( () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2946:7: () otherlv_16= KEYWORD_76 otherlv_17= KEYWORD_4 ( (lv_number_18_0= ruleConditionalOrExpression ) ) otherlv_19= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2946:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2947:2: 
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

                    otherlv_16=(Token)match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleStaticMethodExpression6021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStaticMethodExpressionAccess().getMathSinKeyword_3_1());
                          
                    }
                    otherlv_17=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2965:1: ( (lv_number_18_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2966:1: (lv_number_18_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2966:1: (lv_number_18_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2967:3: lv_number_18_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_3_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6053);
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

                    otherlv_19=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_3_4());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:6: ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:6: ( () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:7: () otherlv_21= KEYWORD_77 otherlv_22= KEYWORD_4 ( (lv_number_23_0= ruleConditionalOrExpression ) ) otherlv_24= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2989:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:2990:2: 
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

                    otherlv_21=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleStaticMethodExpression6098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getStaticMethodExpressionAccess().getMathTanKeyword_4_1());
                          
                    }
                    otherlv_22=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3008:1: ( (lv_number_23_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3009:1: (lv_number_23_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3009:1: (lv_number_23_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3010:3: lv_number_23_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6130);
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

                    otherlv_24=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3032:6: ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3032:6: ( () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3032:7: () otherlv_26= KEYWORD_83 otherlv_27= KEYWORD_4 ( (lv_number_28_0= ruleConditionalOrExpression ) ) otherlv_29= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3032:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3033:2: 
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

                    otherlv_26=(Token)match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleStaticMethodExpression6175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStaticMethodExpressionAccess().getMathAcosKeyword_5_1());
                          
                    }
                    otherlv_27=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3051:1: ( (lv_number_28_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3052:1: (lv_number_28_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3052:1: (lv_number_28_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3053:3: lv_number_28_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6207);
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

                    otherlv_29=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3075:6: ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3075:6: ( () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3075:7: () otherlv_31= KEYWORD_84 otherlv_32= KEYWORD_4 ( (lv_number_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3075:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3076:2: 
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

                    otherlv_31=(Token)match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleStaticMethodExpression6252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getStaticMethodExpressionAccess().getMathAsinKeyword_6_1());
                          
                    }
                    otherlv_32=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3094:1: ( (lv_number_33_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3095:1: (lv_number_33_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3095:1: (lv_number_33_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3096:3: lv_number_33_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6284);
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

                    otherlv_34=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_6_4());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3118:6: ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3118:6: ( () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3118:7: () otherlv_36= KEYWORD_85 otherlv_37= KEYWORD_4 ( (lv_number_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3118:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3119:2: 
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

                    otherlv_36=(Token)match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_ruleStaticMethodExpression6329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getStaticMethodExpressionAccess().getMathAtanKeyword_7_1());
                          
                    }
                    otherlv_37=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3137:1: ( (lv_number_38_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3138:1: (lv_number_38_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3138:1: (lv_number_38_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3139:3: lv_number_38_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6361);
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

                    otherlv_39=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3161:6: ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3161:6: ( () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3161:7: () otherlv_41= KEYWORD_86 otherlv_42= KEYWORD_4 ( (lv_number_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3161:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3162:2: 
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

                    otherlv_41=(Token)match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleStaticMethodExpression6406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getStaticMethodExpressionAccess().getMathCeilKeyword_8_1());
                          
                    }
                    otherlv_42=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3180:1: ( (lv_number_43_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3181:1: (lv_number_43_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3181:1: (lv_number_43_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3182:3: lv_number_43_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6438);
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

                    otherlv_44=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3204:6: ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3204:6: ( () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3204:7: () otherlv_46= KEYWORD_74 otherlv_47= KEYWORD_4 ( (lv_number_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3204:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3205:2: 
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

                    otherlv_46=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleStaticMethodExpression6483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getStaticMethodExpressionAccess().getMathExpKeyword_9_1());
                          
                    }
                    otherlv_47=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3223:1: ( (lv_number_48_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3224:1: (lv_number_48_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3224:1: (lv_number_48_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3225:3: lv_number_48_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6515);
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

                    otherlv_49=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3247:6: ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3247:6: ( () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3247:7: () otherlv_51= KEYWORD_93 otherlv_52= KEYWORD_4 ( (lv_number_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3247:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3248:2: 
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

                    otherlv_51=(Token)match(input,KEYWORD_93,FOLLOW_KEYWORD_93_in_ruleStaticMethodExpression6560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_51, grammarAccess.getStaticMethodExpressionAccess().getMathFloorKeyword_10_1());
                          
                    }
                    otherlv_52=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3266:1: ( (lv_number_53_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3267:1: (lv_number_53_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3267:1: (lv_number_53_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3268:3: lv_number_53_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_10_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6592);
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

                    otherlv_54=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_54, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_10_4());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3290:6: ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3290:6: ( () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3290:7: () otherlv_56= KEYWORD_75 otherlv_57= KEYWORD_4 ( (lv_number_58_0= ruleConditionalOrExpression ) ) otherlv_59= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3290:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3291:2: 
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

                    otherlv_56=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleStaticMethodExpression6637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_56, grammarAccess.getStaticMethodExpressionAccess().getMathLogKeyword_11_1());
                          
                    }
                    otherlv_57=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_11_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3309:1: ( (lv_number_58_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3310:1: (lv_number_58_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3310:1: (lv_number_58_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3311:3: lv_number_58_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6669);
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

                    otherlv_59=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_59, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_11_4());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3333:6: ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3333:6: ( () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3333:7: () otherlv_61= KEYWORD_113 otherlv_62= KEYWORD_4 ( (lv_number_63_0= ruleConditionalOrExpression ) ) otherlv_64= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3333:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3334:2: 
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

                    otherlv_61=(Token)match(input,KEYWORD_113,FOLLOW_KEYWORD_113_in_ruleStaticMethodExpression6714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_61, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAbsKeyword_12_1());
                          
                    }
                    otherlv_62=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_62, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_12_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3352:1: ( (lv_number_63_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3353:1: (lv_number_63_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3353:1: (lv_number_63_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3354:3: lv_number_63_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6746);
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

                    otherlv_64=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_64, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_12_4());
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3376:6: ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3376:6: ( () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3376:7: () otherlv_66= KEYWORD_124 otherlv_67= KEYWORD_4 ( (lv_number_68_0= ruleConditionalOrExpression ) ) otherlv_69= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3376:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3377:2: 
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

                    otherlv_66=(Token)match(input,KEYWORD_124,FOLLOW_KEYWORD_124_in_ruleStaticMethodExpression6791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_66, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathSqrtKeyword_13_1());
                          
                    }
                    otherlv_67=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_67, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_13_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3395:1: ( (lv_number_68_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3396:1: (lv_number_68_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3396:1: (lv_number_68_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3397:3: lv_number_68_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6823);
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

                    otherlv_69=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_69, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_13_4());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3419:6: ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3419:6: ( () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3419:7: () otherlv_71= KEYWORD_114 otherlv_72= KEYWORD_4 ( (lv_number_73_0= ruleConditionalOrExpression ) ) otherlv_74= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3419:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3420:2: 
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

                    otherlv_71=(Token)match(input,KEYWORD_114,FOLLOW_KEYWORD_114_in_ruleStaticMethodExpression6868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_71, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathCosKeyword_14_1());
                          
                    }
                    otherlv_72=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_72, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_14_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3438:1: ( (lv_number_73_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3439:1: (lv_number_73_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3439:1: (lv_number_73_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3440:3: lv_number_73_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6900);
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

                    otherlv_74=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_74, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_14_4());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3462:6: ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3462:6: ( () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3462:7: () otherlv_76= KEYWORD_117 otherlv_77= KEYWORD_4 ( (lv_number_78_0= ruleConditionalOrExpression ) ) otherlv_79= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3462:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3463:2: 
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

                    otherlv_76=(Token)match(input,KEYWORD_117,FOLLOW_KEYWORD_117_in_ruleStaticMethodExpression6945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_76, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathSinKeyword_15_1());
                          
                    }
                    otherlv_77=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_77, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_15_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3481:1: ( (lv_number_78_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3482:1: (lv_number_78_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3482:1: (lv_number_78_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3483:3: lv_number_78_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_15_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6977);
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

                    otherlv_79=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_79, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_15_4());
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3505:6: ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3505:6: ( () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3505:7: () otherlv_81= KEYWORD_118 otherlv_82= KEYWORD_4 ( (lv_number_83_0= ruleConditionalOrExpression ) ) otherlv_84= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3505:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3506:2: 
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

                    otherlv_81=(Token)match(input,KEYWORD_118,FOLLOW_KEYWORD_118_in_ruleStaticMethodExpression7022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_81, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathTanKeyword_16_1());
                          
                    }
                    otherlv_82=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_82, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_16_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3524:1: ( (lv_number_83_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3525:1: (lv_number_83_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3525:1: (lv_number_83_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3526:3: lv_number_83_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_16_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7054);
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

                    otherlv_84=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7067); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_84, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_16_4());
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3548:6: ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3548:6: ( () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3548:7: () otherlv_86= KEYWORD_120 otherlv_87= KEYWORD_4 ( (lv_number_88_0= ruleConditionalOrExpression ) ) otherlv_89= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3548:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3549:2: 
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

                    otherlv_86=(Token)match(input,KEYWORD_120,FOLLOW_KEYWORD_120_in_ruleStaticMethodExpression7099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_86, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAcosKeyword_17_1());
                          
                    }
                    otherlv_87=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_87, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_17_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3567:1: ( (lv_number_88_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3568:1: (lv_number_88_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3568:1: (lv_number_88_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3569:3: lv_number_88_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_17_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7131);
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

                    otherlv_89=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_89, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_17_4());
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3591:6: ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3591:6: ( () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3591:7: () otherlv_91= KEYWORD_121 otherlv_92= KEYWORD_4 ( (lv_number_93_0= ruleConditionalOrExpression ) ) otherlv_94= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3591:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3592:2: 
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

                    otherlv_91=(Token)match(input,KEYWORD_121,FOLLOW_KEYWORD_121_in_ruleStaticMethodExpression7176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_91, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAsinKeyword_18_1());
                          
                    }
                    otherlv_92=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_92, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_18_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3610:1: ( (lv_number_93_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3611:1: (lv_number_93_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3611:1: (lv_number_93_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3612:3: lv_number_93_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_18_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7208);
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

                    otherlv_94=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_94, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_18_4());
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3634:6: ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3634:6: ( () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3634:7: () otherlv_96= KEYWORD_122 otherlv_97= KEYWORD_4 ( (lv_number_98_0= ruleConditionalOrExpression ) ) otherlv_99= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3634:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3635:2: 
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

                    otherlv_96=(Token)match(input,KEYWORD_122,FOLLOW_KEYWORD_122_in_ruleStaticMethodExpression7253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_96, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathAtanKeyword_19_1());
                          
                    }
                    otherlv_97=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_97, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_19_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3653:1: ( (lv_number_98_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3654:1: (lv_number_98_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3654:1: (lv_number_98_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3655:3: lv_number_98_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_19_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7285);
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

                    otherlv_99=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_99, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_19_4());
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3677:6: ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3677:6: ( () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3677:7: () otherlv_101= KEYWORD_123 otherlv_102= KEYWORD_4 ( (lv_number_103_0= ruleConditionalOrExpression ) ) otherlv_104= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3677:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3678:2: 
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

                    otherlv_101=(Token)match(input,KEYWORD_123,FOLLOW_KEYWORD_123_in_ruleStaticMethodExpression7330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_101, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathCeilKeyword_20_1());
                          
                    }
                    otherlv_102=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_102, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_20_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3696:1: ( (lv_number_103_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3697:1: (lv_number_103_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3697:1: (lv_number_103_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3698:3: lv_number_103_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_20_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7362);
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

                    otherlv_104=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_104, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_20_4());
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3720:6: ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3720:6: ( () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3720:7: () otherlv_106= KEYWORD_115 otherlv_107= KEYWORD_4 ( (lv_number_108_0= ruleConditionalOrExpression ) ) otherlv_109= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3720:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3721:2: 
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

                    otherlv_106=(Token)match(input,KEYWORD_115,FOLLOW_KEYWORD_115_in_ruleStaticMethodExpression7407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_106, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathExpKeyword_21_1());
                          
                    }
                    otherlv_107=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_107, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_21_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3739:1: ( (lv_number_108_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3740:1: (lv_number_108_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3740:1: (lv_number_108_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3741:3: lv_number_108_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_21_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7439);
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

                    otherlv_109=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7452); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_109, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_21_4());
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3763:6: ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3763:6: ( () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3763:7: () otherlv_111= KEYWORD_126 otherlv_112= KEYWORD_4 ( (lv_number_113_0= ruleConditionalOrExpression ) ) otherlv_114= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3763:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3764:2: 
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

                    otherlv_111=(Token)match(input,KEYWORD_126,FOLLOW_KEYWORD_126_in_ruleStaticMethodExpression7484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_111, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathFloorKeyword_22_1());
                          
                    }
                    otherlv_112=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_112, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_22_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3782:1: ( (lv_number_113_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3783:1: (lv_number_113_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3783:1: (lv_number_113_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3784:3: lv_number_113_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_22_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7516);
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

                    otherlv_114=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_114, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_22_4());
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3806:6: ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3806:6: ( () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3806:7: () otherlv_116= KEYWORD_116 otherlv_117= KEYWORD_4 ( (lv_number_118_0= ruleConditionalOrExpression ) ) otherlv_119= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3806:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3807:2: 
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

                    otherlv_116=(Token)match(input,KEYWORD_116,FOLLOW_KEYWORD_116_in_ruleStaticMethodExpression7561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_116, grammarAccess.getStaticMethodExpressionAccess().getJavaLangMathLogKeyword_23_1());
                          
                    }
                    otherlv_117=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_117, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_23_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3825:1: ( (lv_number_118_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3826:1: (lv_number_118_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3826:1: (lv_number_118_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3827:3: lv_number_118_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getNumberConditionalOrExpressionParserRuleCall_23_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7593);
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

                    otherlv_119=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_119, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_23_4());
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3849:6: ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3849:6: ( () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3849:7: () otherlv_121= KEYWORD_127 otherlv_122= KEYWORD_4 ( (lv_persistable_123_0= ruleConditionalOrExpression ) ) otherlv_124= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3849:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3850:2: 
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

                    otherlv_121=(Token)match(input,KEYWORD_127,FOLLOW_KEYWORD_127_in_ruleStaticMethodExpression7638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_121, grammarAccess.getStaticMethodExpressionAccess().getJDOHelperGetObjectIdKeyword_24_1());
                          
                    }
                    otherlv_122=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_122, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_24_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3868:1: ( (lv_persistable_123_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3869:1: (lv_persistable_123_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3869:1: (lv_persistable_123_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3870:3: lv_persistable_123_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_24_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7670);
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

                    otherlv_124=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_124, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_24_4());
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3892:6: ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3892:6: ( () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3892:7: () otherlv_126= KEYWORD_125 otherlv_127= KEYWORD_4 ( (lv_persistable_128_0= ruleConditionalOrExpression ) ) otherlv_129= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3892:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3893:2: 
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

                    otherlv_126=(Token)match(input,KEYWORD_125,FOLLOW_KEYWORD_125_in_ruleStaticMethodExpression7715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_126, grammarAccess.getStaticMethodExpressionAccess().getJDOHelperGetVersionKeyword_25_1());
                          
                    }
                    otherlv_127=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_127, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_25_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3911:1: ( (lv_persistable_128_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3912:1: (lv_persistable_128_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3912:1: (lv_persistable_128_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3913:3: lv_persistable_128_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_25_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7747);
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

                    otherlv_129=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_129, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_25_4());
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3935:6: ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3935:6: ( () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3935:7: () otherlv_131= KEYWORD_129 otherlv_132= KEYWORD_4 ( (lv_persistable_133_0= ruleConditionalOrExpression ) ) otherlv_134= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3935:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3936:2: 
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

                    otherlv_131=(Token)match(input,KEYWORD_129,FOLLOW_KEYWORD_129_in_ruleStaticMethodExpression7792); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_131, grammarAccess.getStaticMethodExpressionAccess().getJavaxJdoJDOHelperGetObjectIdKeyword_26_1());
                          
                    }
                    otherlv_132=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_132, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_26_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3954:1: ( (lv_persistable_133_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3955:1: (lv_persistable_133_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3955:1: (lv_persistable_133_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3956:3: lv_persistable_133_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_26_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7824);
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

                    otherlv_134=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_134, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_26_4());
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:6: ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:6: ( () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:7: () otherlv_136= KEYWORD_128 otherlv_137= KEYWORD_4 ( (lv_persistable_138_0= ruleConditionalOrExpression ) ) otherlv_139= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3978:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3979:2: 
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

                    otherlv_136=(Token)match(input,KEYWORD_128,FOLLOW_KEYWORD_128_in_ruleStaticMethodExpression7869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_136, grammarAccess.getStaticMethodExpressionAccess().getJavaxJdoJDOHelperGetVersionKeyword_27_1());
                          
                    }
                    otherlv_137=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_137, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_27_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3997:1: ( (lv_persistable_138_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3998:1: (lv_persistable_138_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3998:1: (lv_persistable_138_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:3999:3: lv_persistable_138_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getPersistableConditionalOrExpressionParserRuleCall_27_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7901);
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

                    otherlv_139=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_139, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_27_4());
                          
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4021:6: ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4021:6: ( () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4021:7: () otherlv_141= KEYWORD_48 otherlv_142= KEYWORD_4 ( (lv_isDistinct_143_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) ) otherlv_145= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4021:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4022:2: 
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

                    otherlv_141=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleStaticMethodExpression7946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_141, grammarAccess.getStaticMethodExpressionAccess().getCountKeyword_28_1());
                          
                    }
                    otherlv_142=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_142, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_28_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4040:1: ( (lv_isDistinct_143_0= KEYWORD_71 ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==KEYWORD_71) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4041:1: (lv_isDistinct_143_0= KEYWORD_71 )
                            {
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4041:1: (lv_isDistinct_143_0= KEYWORD_71 )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4042:3: lv_isDistinct_143_0= KEYWORD_71
                            {
                            lv_isDistinct_143_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7976); if (state.failed) return current;
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

                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4056:3: ( (lv_aggregateArgument_144_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4057:1: (lv_aggregateArgument_144_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4057:1: (lv_aggregateArgument_144_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4058:3: lv_aggregateArgument_144_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_28_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8009);
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

                    otherlv_145=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_145, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_28_5());
                          
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4080:6: ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4080:6: ( () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4080:7: () otherlv_147= KEYWORD_32 otherlv_148= KEYWORD_4 ( (lv_isDistinct_149_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) ) otherlv_151= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4080:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4081:2: 
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

                    otherlv_147=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleStaticMethodExpression8054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_147, grammarAccess.getStaticMethodExpressionAccess().getSumKeyword_29_1());
                          
                    }
                    otherlv_148=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_148, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_29_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4099:1: ( (lv_isDistinct_149_0= KEYWORD_71 ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==KEYWORD_71) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4100:1: (lv_isDistinct_149_0= KEYWORD_71 )
                            {
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4100:1: (lv_isDistinct_149_0= KEYWORD_71 )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4101:3: lv_isDistinct_149_0= KEYWORD_71
                            {
                            lv_isDistinct_149_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression8084); if (state.failed) return current;
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

                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4115:3: ( (lv_aggregateArgument_150_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4116:1: (lv_aggregateArgument_150_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4116:1: (lv_aggregateArgument_150_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4117:3: lv_aggregateArgument_150_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_29_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8117);
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

                    otherlv_151=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_151, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_29_5());
                          
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4139:6: ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4139:6: ( () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4139:7: () otherlv_153= KEYWORD_31 otherlv_154= KEYWORD_4 ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) ) otherlv_156= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4139:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4140:2: 
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

                    otherlv_153=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleStaticMethodExpression8162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_153, grammarAccess.getStaticMethodExpressionAccess().getMinKeyword_30_1());
                          
                    }
                    otherlv_154=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_154, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_30_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4158:1: ( (lv_aggregateArgument_155_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4159:1: (lv_aggregateArgument_155_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4159:1: (lv_aggregateArgument_155_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4160:3: lv_aggregateArgument_155_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_30_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8194);
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

                    otherlv_156=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_156, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_30_4());
                          
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4182:6: ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4182:6: ( () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4182:7: () otherlv_158= KEYWORD_30 otherlv_159= KEYWORD_4 ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) ) otherlv_161= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4182:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4183:2: 
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

                    otherlv_158=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleStaticMethodExpression8239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_158, grammarAccess.getStaticMethodExpressionAccess().getMaxKeyword_31_1());
                          
                    }
                    otherlv_159=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_159, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_31_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4201:1: ( (lv_aggregateArgument_160_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4202:1: (lv_aggregateArgument_160_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4202:1: (lv_aggregateArgument_160_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4203:3: lv_aggregateArgument_160_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_31_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8271);
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

                    otherlv_161=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_161, grammarAccess.getStaticMethodExpressionAccess().getRightParenthesisKeyword_31_4());
                          
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4225:6: ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4225:6: ( () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4225:7: () otherlv_163= KEYWORD_27 otherlv_164= KEYWORD_4 ( (lv_isDistinct_165_0= KEYWORD_71 ) )? ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) ) otherlv_167= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4225:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4226:2: 
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

                    otherlv_163=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleStaticMethodExpression8316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_163, grammarAccess.getStaticMethodExpressionAccess().getAvgKeyword_32_1());
                          
                    }
                    otherlv_164=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_164, grammarAccess.getStaticMethodExpressionAccess().getLeftParenthesisKeyword_32_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4244:1: ( (lv_isDistinct_165_0= KEYWORD_71 ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==KEYWORD_71) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4245:1: (lv_isDistinct_165_0= KEYWORD_71 )
                            {
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4245:1: (lv_isDistinct_165_0= KEYWORD_71 )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4246:3: lv_isDistinct_165_0= KEYWORD_71
                            {
                            lv_isDistinct_165_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression8346); if (state.failed) return current;
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

                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4260:3: ( (lv_aggregateArgument_166_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:1: (lv_aggregateArgument_166_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4261:1: (lv_aggregateArgument_166_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4262:3: lv_aggregateArgument_166_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStaticMethodExpressionAccess().getAggregateArgumentConditionalOrExpressionParserRuleCall_32_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8379);
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

                    otherlv_167=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8392); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4291:1: entryRuleMethodExpression returns [EObject current=null] : iv_ruleMethodExpression= ruleMethodExpression EOF ;
    public final EObject entryRuleMethodExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4292:2: (iv_ruleMethodExpression= ruleMethodExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4293:2: iv_ruleMethodExpression= ruleMethodExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression8427);
            iv_ruleMethodExpression=ruleMethodExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodExpression8437); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4300:1: ruleMethodExpression returns [EObject current=null] : ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4303:28: ( ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:1: ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:1: ( ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 ) | ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 ) | ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 ) | ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 ) | ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 ) | ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 ) | ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 ) | ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 ) | ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 ) | ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 ) | ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 ) | ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 ) | ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 ) | ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 ) | ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 ) | ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 ) | ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 ) | ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 ) | ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 ) | ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 ) | ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 ) | ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 ) | ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 ) | ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 ) | ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 ) | ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 ) | ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 ) | ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 ) )
            int alt59=28;
            switch ( input.LA(1) ) {
            case KEYWORD_78:
                {
                alt59=1;
                }
                break;
            case KEYWORD_28:
                {
                alt59=2;
                }
                break;
            case KEYWORD_68:
                {
                alt59=3;
                }
                break;
            case KEYWORD_40:
                {
                alt59=4;
                }
                break;
            case KEYWORD_99:
                {
                alt59=5;
                }
                break;
            case KEYWORD_103:
                {
                alt59=6;
                }
                break;
            case KEYWORD_102:
                {
                alt59=7;
                }
                break;
            case KEYWORD_56:
                {
                alt59=8;
                }
                break;
            case KEYWORD_79:
                {
                alt59=9;
                }
                break;
            case KEYWORD_58:
                {
                alt59=10;
                }
                break;
            case KEYWORD_108:
                {
                alt59=11;
                }
                break;
            case KEYWORD_67:
                {
                alt59=12;
                }
                break;
            case KEYWORD_62:
                {
                alt59=13;
                }
                break;
            case KEYWORD_69:
                {
                alt59=14;
                }
                break;
            case KEYWORD_97:
                {
                alt59=15;
                }
                break;
            case KEYWORD_98:
                {
                alt59=16;
                }
                break;
            case KEYWORD_91:
                {
                alt59=17;
                }
                break;
            case KEYWORD_100:
                {
                alt59=18;
                }
                break;
            case KEYWORD_101:
                {
                alt59=19;
                }
                break;
            case KEYWORD_42:
                {
                alt59=20;
                }
                break;
            case KEYWORD_59:
                {
                alt59=21;
                }
                break;
            case KEYWORD_80:
                {
                alt59=22;
                }
                break;
            case KEYWORD_66:
                {
                alt59=23;
                }
                break;
            case KEYWORD_65:
                {
                alt59=24;
                }
                break;
            case KEYWORD_89:
                {
                alt59=25;
                }
                break;
            case KEYWORD_90:
                {
                alt59=26;
                }
                break;
            case KEYWORD_70:
                {
                alt59=27;
                }
                break;
            case KEYWORD_81:
                {
                alt59=28;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:2: ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:2: ( () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:3: () otherlv_1= KEYWORD_78 otherlv_2= KEYWORD_4 ( (lv_element_3_0= ruleConditionalOrExpression ) ) otherlv_4= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4304:3: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4305:2: 
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

                    otherlv_1=(Token)match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleMethodExpression8488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMethodExpressionAccess().getContainsKeyword_0_1());
                          
                    }
                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4323:1: ( (lv_element_3_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4324:1: (lv_element_3_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4324:1: (lv_element_3_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4325:3: lv_element_3_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getElementConditionalOrExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8520);
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

                    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4347:6: ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4347:6: ( () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4347:7: () otherlv_6= KEYWORD_28 otherlv_7= KEYWORD_4 ( (lv_arg_8_0= ruleConditionalOrExpression ) ) otherlv_9= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4347:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4348:2: 
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

                    otherlv_6=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleMethodExpression8565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodExpressionAccess().getGetKeyword_1_1());
                          
                    }
                    otherlv_7=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4366:1: ( (lv_arg_8_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4367:1: (lv_arg_8_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4367:1: (lv_arg_8_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4368:3: lv_arg_8_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getArgConditionalOrExpressionParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8597);
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

                    otherlv_9=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4390:6: ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4390:6: ( () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4390:7: () otherlv_11= KEYWORD_68 otherlv_12= KEYWORD_4 otherlv_13= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4390:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4391:2: 
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

                    otherlv_11=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleMethodExpression8642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getMethodExpressionAccess().getIsEmptyKeyword_2_1());
                          
                    }
                    otherlv_12=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_2_2());
                          
                    }
                    otherlv_13=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4415:6: ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4415:6: ( () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4415:7: () otherlv_15= KEYWORD_40 otherlv_16= KEYWORD_4 otherlv_17= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4415:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4416:2: 
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

                    otherlv_15=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleMethodExpression8698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getMethodExpressionAccess().getSizeKeyword_3_1());
                          
                    }
                    otherlv_16=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_3_2());
                          
                    }
                    otherlv_17=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4440:6: ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4440:6: ( () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4440:7: () otherlv_19= KEYWORD_99 otherlv_20= KEYWORD_4 ( (lv_key_21_0= ruleConditionalOrExpression ) ) otherlv_22= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4440:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4441:2: 
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

                    otherlv_19=(Token)match(input,KEYWORD_99,FOLLOW_KEYWORD_99_in_ruleMethodExpression8754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getMethodExpressionAccess().getContainsKeyKeyword_4_1());
                          
                    }
                    otherlv_20=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4459:1: ( (lv_key_21_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4460:1: (lv_key_21_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4460:1: (lv_key_21_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4461:3: lv_key_21_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getKeyConditionalOrExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8786);
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

                    otherlv_22=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4483:6: ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4483:6: ( () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4483:7: () otherlv_24= KEYWORD_103 otherlv_25= KEYWORD_4 ( (lv_value_26_0= ruleConditionalOrExpression ) ) otherlv_27= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4483:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4484:2: 
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

                    otherlv_24=(Token)match(input,KEYWORD_103,FOLLOW_KEYWORD_103_in_ruleMethodExpression8831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getMethodExpressionAccess().getContainsValueKeyword_5_1());
                          
                    }
                    otherlv_25=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4502:1: ( (lv_value_26_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4503:1: (lv_value_26_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4503:1: (lv_value_26_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4504:3: lv_value_26_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getValueConditionalOrExpressionParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8863);
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

                    otherlv_27=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_5_4());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4526:6: ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4526:6: ( () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4526:7: () otherlv_29= KEYWORD_102 otherlv_30= KEYWORD_4 ( (lv_key_31_0= ruleConditionalOrExpression ) ) otherlv_32= KEYWORD_8 ( (lv_value_33_0= ruleConditionalOrExpression ) ) otherlv_34= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4526:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4527:2: 
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

                    otherlv_29=(Token)match(input,KEYWORD_102,FOLLOW_KEYWORD_102_in_ruleMethodExpression8908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getMethodExpressionAccess().getContainsEntryKeyword_6_1());
                          
                    }
                    otherlv_30=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression8920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4545:1: ( (lv_key_31_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4546:1: (lv_key_31_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4546:1: (lv_key_31_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4547:3: lv_key_31_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getKeyConditionalOrExpressionParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8940);
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

                    otherlv_32=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression8953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getMethodExpressionAccess().getCommaKeyword_6_4());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4568:1: ( (lv_value_33_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4569:1: (lv_value_33_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4569:1: (lv_value_33_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4570:3: lv_value_33_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getValueConditionalOrExpressionParserRuleCall_6_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8973);
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

                    otherlv_34=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression8986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_6_6());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4592:6: ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4592:6: ( () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4592:7: () otherlv_36= KEYWORD_56 otherlv_37= KEYWORD_4 ( (lv_index_38_0= ruleConditionalOrExpression ) ) otherlv_39= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4592:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4593:2: 
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

                    otherlv_36=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleMethodExpression9018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getMethodExpressionAccess().getCharAtKeyword_7_1());
                          
                    }
                    otherlv_37=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4611:1: ( (lv_index_38_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4612:1: (lv_index_38_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4612:1: (lv_index_38_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4613:3: lv_index_38_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getIndexConditionalOrExpressionParserRuleCall_7_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9050);
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

                    otherlv_39=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_39, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4635:6: ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4635:6: ( () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4635:7: () otherlv_41= KEYWORD_79 otherlv_42= KEYWORD_4 ( (lv_string_43_0= ruleConditionalOrExpression ) ) otherlv_44= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4635:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4636:2: 
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

                    otherlv_41=(Token)match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleMethodExpression9095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getMethodExpressionAccess().getEndsWithKeyword_8_1());
                          
                    }
                    otherlv_42=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4654:1: ( (lv_string_43_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4655:1: (lv_string_43_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4655:1: (lv_string_43_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4656:3: lv_string_43_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9127);
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

                    otherlv_44=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_44, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_8_4());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4678:6: ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4678:6: ( () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4678:7: () otherlv_46= KEYWORD_58 otherlv_47= KEYWORD_4 ( (lv_string_48_0= ruleConditionalOrExpression ) ) otherlv_49= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4678:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4679:2: 
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

                    otherlv_46=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleMethodExpression9172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getMethodExpressionAccess().getEqualsKeyword_9_1());
                          
                    }
                    otherlv_47=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4697:1: ( (lv_string_48_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4698:1: (lv_string_48_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4698:1: (lv_string_48_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4699:3: lv_string_48_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9204);
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

                    otherlv_49=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_9_4());
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4721:6: ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4721:6: ( () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4721:7: () otherlv_51= KEYWORD_108 otherlv_52= KEYWORD_4 ( (lv_string_53_0= ruleConditionalOrExpression ) ) otherlv_54= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4721:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4722:2: 
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

                    otherlv_51=(Token)match(input,KEYWORD_108,FOLLOW_KEYWORD_108_in_ruleMethodExpression9249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_51, grammarAccess.getMethodExpressionAccess().getEqualsIgnoreCaseKeyword_10_1());
                          
                    }
                    otherlv_52=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_52, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_10_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4740:1: ( (lv_string_53_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4741:1: (lv_string_53_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4741:1: (lv_string_53_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4742:3: lv_string_53_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_10_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9281);
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

                    otherlv_54=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_54, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_10_4());
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4764:6: ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4764:6: ( () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4764:7: () otherlv_56= KEYWORD_67 otherlv_57= KEYWORD_4 ( (lv_string_58_0= ruleConditionalOrExpression ) ) (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )? otherlv_61= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4764:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4765:2: 
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

                    otherlv_56=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleMethodExpression9326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_56, grammarAccess.getMethodExpressionAccess().getIndexOfKeyword_11_1());
                          
                    }
                    otherlv_57=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_57, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_11_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4783:1: ( (lv_string_58_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4784:1: (lv_string_58_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4784:1: (lv_string_58_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4785:3: lv_string_58_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9358);
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

                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4801:2: (otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==KEYWORD_8) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4802:2: otherlv_59= KEYWORD_8 ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_59=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression9372); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_59, grammarAccess.getMethodExpressionAccess().getCommaKeyword_11_4_0());
                                  
                            }
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4806:1: ( (lv_fromIndex_60_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4807:1: (lv_fromIndex_60_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4807:1: (lv_fromIndex_60_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4808:3: lv_fromIndex_60_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getFromIndexConditionalOrExpressionParserRuleCall_11_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9392);
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

                    otherlv_61=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_61, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_11_5());
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4830:6: ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4830:6: ( () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4830:7: () otherlv_63= KEYWORD_62 otherlv_64= KEYWORD_4 otherlv_65= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4830:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4831:2: 
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

                    otherlv_63=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMethodExpression9439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_63, grammarAccess.getMethodExpressionAccess().getLengthKeyword_12_1());
                          
                    }
                    otherlv_64=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_64, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_12_2());
                          
                    }
                    otherlv_65=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_65, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_12_3());
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4855:6: ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4855:6: ( () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4855:7: () otherlv_67= KEYWORD_69 otherlv_68= KEYWORD_4 ( (lv_regex_69_0= ruleConditionalOrExpression ) ) otherlv_70= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4855:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4856:2: 
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

                    otherlv_67=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleMethodExpression9495); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_67, grammarAccess.getMethodExpressionAccess().getMatchesKeyword_13_1());
                          
                    }
                    otherlv_68=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_68, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_13_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4874:1: ( (lv_regex_69_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4875:1: (lv_regex_69_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4875:1: (lv_regex_69_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4876:3: lv_regex_69_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getRegexConditionalOrExpressionParserRuleCall_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9527);
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

                    otherlv_70=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_70, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_13_4());
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4898:6: ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4898:6: ( () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4898:7: () otherlv_72= KEYWORD_97 otherlv_73= KEYWORD_4 ( (lv_regex_74_0= ruleConditionalOrExpression ) ) otherlv_75= KEYWORD_8 ( (lv_replacement_76_0= ruleConditionalOrExpression ) ) otherlv_77= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4898:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4899:2: 
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

                    otherlv_72=(Token)match(input,KEYWORD_97,FOLLOW_KEYWORD_97_in_ruleMethodExpression9572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_72, grammarAccess.getMethodExpressionAccess().getReplaceAllKeyword_14_1());
                          
                    }
                    otherlv_73=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_73, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_14_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4917:1: ( (lv_regex_74_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4918:1: (lv_regex_74_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4918:1: (lv_regex_74_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4919:3: lv_regex_74_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getRegexConditionalOrExpressionParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9604);
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

                    otherlv_75=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression9617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_75, grammarAccess.getMethodExpressionAccess().getCommaKeyword_14_4());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4940:1: ( (lv_replacement_76_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4941:1: (lv_replacement_76_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4941:1: (lv_replacement_76_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4942:3: lv_replacement_76_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getReplacementConditionalOrExpressionParserRuleCall_14_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9637);
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

                    otherlv_77=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_77, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_14_6());
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4964:6: ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4964:6: ( () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4964:7: () otherlv_79= KEYWORD_98 otherlv_80= KEYWORD_4 ( (lv_string_81_0= ruleConditionalOrExpression ) ) otherlv_82= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4964:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4965:2: 
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

                    otherlv_79=(Token)match(input,KEYWORD_98,FOLLOW_KEYWORD_98_in_ruleMethodExpression9682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_79, grammarAccess.getMethodExpressionAccess().getStartsWithKeyword_15_1());
                          
                    }
                    otherlv_80=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_80, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_15_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4983:1: ( (lv_string_81_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4984:1: (lv_string_81_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4984:1: (lv_string_81_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:4985:3: lv_string_81_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getStringConditionalOrExpressionParserRuleCall_15_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9714);
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

                    otherlv_82=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_82, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_15_4());
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5007:6: ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5007:6: ( () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5007:7: () otherlv_84= KEYWORD_91 otherlv_85= KEYWORD_4 ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) ) (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )? otherlv_89= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5007:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5008:2: 
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

                    otherlv_84=(Token)match(input,KEYWORD_91,FOLLOW_KEYWORD_91_in_ruleMethodExpression9759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_84, grammarAccess.getMethodExpressionAccess().getSubstringKeyword_16_1());
                          
                    }
                    otherlv_85=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_85, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_16_2());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5026:1: ( (lv_beginIndex_86_0= ruleConditionalOrExpression ) )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5027:1: (lv_beginIndex_86_0= ruleConditionalOrExpression )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5027:1: (lv_beginIndex_86_0= ruleConditionalOrExpression )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5028:3: lv_beginIndex_86_0= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getBeginIndexConditionalOrExpressionParserRuleCall_16_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9791);
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

                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5044:2: (otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==KEYWORD_8) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5045:2: otherlv_87= KEYWORD_8 ( (lv_endIndex_88_0= ruleConditionalOrExpression ) )
                            {
                            otherlv_87=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMethodExpression9805); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_87, grammarAccess.getMethodExpressionAccess().getCommaKeyword_16_4_0());
                                  
                            }
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5049:1: ( (lv_endIndex_88_0= ruleConditionalOrExpression ) )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5050:1: (lv_endIndex_88_0= ruleConditionalOrExpression )
                            {
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5050:1: (lv_endIndex_88_0= ruleConditionalOrExpression )
                            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5051:3: lv_endIndex_88_0= ruleConditionalOrExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMethodExpressionAccess().getEndIndexConditionalOrExpressionParserRuleCall_16_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9825);
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

                    otherlv_89=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_89, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_16_5());
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5073:6: ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5073:6: ( () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5073:7: () otherlv_91= KEYWORD_100 otherlv_92= KEYWORD_4 otherlv_93= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5073:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5074:2: 
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

                    otherlv_91=(Token)match(input,KEYWORD_100,FOLLOW_KEYWORD_100_in_ruleMethodExpression9872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_91, grammarAccess.getMethodExpressionAccess().getToLowerCaseKeyword_17_1());
                          
                    }
                    otherlv_92=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_92, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_17_2());
                          
                    }
                    otherlv_93=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9896); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_93, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_17_3());
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5098:6: ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5098:6: ( () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5098:7: () otherlv_95= KEYWORD_101 otherlv_96= KEYWORD_4 otherlv_97= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5098:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5099:2: 
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

                    otherlv_95=(Token)match(input,KEYWORD_101,FOLLOW_KEYWORD_101_in_ruleMethodExpression9928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_95, grammarAccess.getMethodExpressionAccess().getToUpperCaseKeyword_18_1());
                          
                    }
                    otherlv_96=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_96, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_18_2());
                          
                    }
                    otherlv_97=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression9952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_97, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_18_3());
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5123:6: ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5123:6: ( () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5123:7: () otherlv_99= KEYWORD_42 otherlv_100= KEYWORD_4 otherlv_101= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5123:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5124:2: 
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

                    otherlv_99=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleMethodExpression9984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_99, grammarAccess.getMethodExpressionAccess().getTrimKeyword_19_1());
                          
                    }
                    otherlv_100=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression9996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_100, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_19_2());
                          
                    }
                    otherlv_101=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_101, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_19_3());
                          
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5148:6: ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5148:6: ( () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5148:7: () otherlv_103= KEYWORD_59 otherlv_104= KEYWORD_4 otherlv_105= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5148:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5149:2: 
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

                    otherlv_103=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleMethodExpression10040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_103, grammarAccess.getMethodExpressionAccess().getGetDayKeyword_20_1());
                          
                    }
                    otherlv_104=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_104, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_20_2());
                          
                    }
                    otherlv_105=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_105, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_20_3());
                          
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5173:6: ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5173:6: ( () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5173:7: () otherlv_107= KEYWORD_80 otherlv_108= KEYWORD_4 otherlv_109= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5173:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5174:2: 
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

                    otherlv_107=(Token)match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleMethodExpression10096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_107, grammarAccess.getMethodExpressionAccess().getGetMonthKeyword_21_1());
                          
                    }
                    otherlv_108=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_108, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_21_2());
                          
                    }
                    otherlv_109=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_109, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_21_3());
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5198:6: ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5198:6: ( () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5198:7: () otherlv_111= KEYWORD_66 otherlv_112= KEYWORD_4 otherlv_113= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5198:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5199:2: 
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

                    otherlv_111=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleMethodExpression10152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_111, grammarAccess.getMethodExpressionAccess().getGetYearKeyword_22_1());
                          
                    }
                    otherlv_112=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_112, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_22_2());
                          
                    }
                    otherlv_113=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_113, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_22_3());
                          
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5223:6: ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5223:6: ( () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5223:7: () otherlv_115= KEYWORD_65 otherlv_116= KEYWORD_4 otherlv_117= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5223:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5224:2: 
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

                    otherlv_115=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleMethodExpression10208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_115, grammarAccess.getMethodExpressionAccess().getGetHourKeyword_23_1());
                          
                    }
                    otherlv_116=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_116, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_23_2());
                          
                    }
                    otherlv_117=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_117, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_23_3());
                          
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5248:6: ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5248:6: ( () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5248:7: () otherlv_119= KEYWORD_89 otherlv_120= KEYWORD_4 otherlv_121= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5248:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5249:2: 
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

                    otherlv_119=(Token)match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_ruleMethodExpression10264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_119, grammarAccess.getMethodExpressionAccess().getGetMinuteKeyword_24_1());
                          
                    }
                    otherlv_120=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_120, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_24_2());
                          
                    }
                    otherlv_121=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_121, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_24_3());
                          
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5273:6: ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5273:6: ( () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5273:7: () otherlv_123= KEYWORD_90 otherlv_124= KEYWORD_4 otherlv_125= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5273:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5274:2: 
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

                    otherlv_123=(Token)match(input,KEYWORD_90,FOLLOW_KEYWORD_90_in_ruleMethodExpression10320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_123, grammarAccess.getMethodExpressionAccess().getGetSecondKeyword_25_1());
                          
                    }
                    otherlv_124=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10332); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_124, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_25_2());
                          
                    }
                    otherlv_125=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_125, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_25_3());
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5298:6: ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5298:6: ( () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5298:7: () otherlv_127= KEYWORD_70 otherlv_128= KEYWORD_4 otherlv_129= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5298:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5299:2: 
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

                    otherlv_127=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleMethodExpression10376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_127, grammarAccess.getMethodExpressionAccess().getOrdinalKeyword_26_1());
                          
                    }
                    otherlv_128=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_128, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_26_2());
                          
                    }
                    otherlv_129=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_129, grammarAccess.getMethodExpressionAccess().getRightParenthesisKeyword_26_3());
                          
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5323:6: ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5323:6: ( () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5323:7: () otherlv_131= KEYWORD_81 otherlv_132= KEYWORD_4 otherlv_133= KEYWORD_5
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5323:7: ()
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5324:2: 
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

                    otherlv_131=(Token)match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleMethodExpression10432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_131, grammarAccess.getMethodExpressionAccess().getToStringKeyword_27_1());
                          
                    }
                    otherlv_132=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMethodExpression10444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_132, grammarAccess.getMethodExpressionAccess().getLeftParenthesisKeyword_27_2());
                          
                    }
                    otherlv_133=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMethodExpression10456); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5355:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5356:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5357:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression10491);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression10501); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5364:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 (this_ConditionalOrExpression_1= ruleConditionalOrExpression | this_Subquery_2= ruleSubquery ) otherlv_3= KEYWORD_5 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_ConditionalOrExpression_1 = null;

        EObject this_Subquery_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5367:28: ( (otherlv_0= KEYWORD_4 (this_ConditionalOrExpression_1= ruleConditionalOrExpression | this_Subquery_2= ruleSubquery ) otherlv_3= KEYWORD_5 ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5368:1: (otherlv_0= KEYWORD_4 (this_ConditionalOrExpression_1= ruleConditionalOrExpression | this_Subquery_2= ruleSubquery ) otherlv_3= KEYWORD_5 )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5368:1: (otherlv_0= KEYWORD_4 (this_ConditionalOrExpression_1= ruleConditionalOrExpression | this_Subquery_2= ruleSubquery ) otherlv_3= KEYWORD_5 )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5369:2: otherlv_0= KEYWORD_4 (this_ConditionalOrExpression_1= ruleConditionalOrExpression | this_Subquery_2= ruleSubquery ) otherlv_3= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthesesExpression10539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5373:1: (this_ConditionalOrExpression_1= ruleConditionalOrExpression | this_Subquery_2= ruleSubquery )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=KEYWORD_129 && LA60_0<=KEYWORD_126)||(LA60_0>=KEYWORD_120 && LA60_0<=KEYWORD_118)||LA60_0==KEYWORD_108||(LA60_0>=KEYWORD_102 && LA60_0<=KEYWORD_101)||LA60_0==KEYWORD_93||(LA60_0>=KEYWORD_97 && LA60_0<=KEYWORD_98)||(LA60_0>=KEYWORD_83 && LA60_0<=KEYWORD_87)||(LA60_0>=KEYWORD_89 && LA60_0<=KEYWORD_91)||(LA60_0>=KEYWORD_72 && LA60_0<=KEYWORD_81)||(LA60_0>=KEYWORD_65 && LA60_0<=KEYWORD_70)||LA60_0==KEYWORD_56||(LA60_0>=KEYWORD_58 && LA60_0<=KEYWORD_59)||LA60_0==KEYWORD_62||(LA60_0>=KEYWORD_48 && LA60_0<=KEYWORD_49)||(LA60_0>=KEYWORD_39 && LA60_0<=KEYWORD_43)||(LA60_0>=KEYWORD_27 && LA60_0<=KEYWORD_28)||(LA60_0>=KEYWORD_30 && LA60_0<=KEYWORD_32)||LA60_0==KEYWORD_1||LA60_0==KEYWORD_4||LA60_0==KEYWORD_7||LA60_0==KEYWORD_9||LA60_0==KEYWORD_12||(LA60_0>=KEYWORD_17 && LA60_0<=RULE_STRING)) ) {
                alt60=1;
            }
            else if ( (LA60_0==KEYWORD_54) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5374:2: this_ConditionalOrExpression_1= ruleConditionalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getConditionalOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression10564);
                    this_ConditionalOrExpression_1=ruleConditionalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ConditionalOrExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5387:2: this_Subquery_2= ruleSubquery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getSubqueryParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubquery_in_ruleParenthesesExpression10594);
                    this_Subquery_2=ruleSubquery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Subquery_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthesesExpression10607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParenthesesExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5411:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5412:1: (iv_ruleType= ruleType EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5413:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType10642);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType10653); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5420:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PrimitiveType_0 = null;

        AntlrDatatypeRuleToken this_ClassOrInterfaceName_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5424:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5425:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5425:1: (this_PrimitiveType_0= rulePrimitiveType | this_ClassOrInterfaceName_1= ruleClassOrInterfaceName )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==KEYWORD_64||LA61_0==KEYWORD_57||LA61_0==KEYWORD_50||LA61_0==KEYWORD_52||(LA61_0>=KEYWORD_36 && LA61_0<=KEYWORD_38)||LA61_0==KEYWORD_29) ) {
                alt61=1;
            }
            else if ( (LA61_0==KEYWORD_119||(LA61_0>=KEYWORD_111 && LA61_0<=KEYWORD_112)||(LA61_0>=KEYWORD_109 && LA61_0<=KEYWORD_105)||LA61_0==KEYWORD_61||LA61_0==KEYWORD_51||LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5426:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType10700);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5438:5: this_ClassOrInterfaceName_1= ruleClassOrInterfaceName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getClassOrInterfaceNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassOrInterfaceName_in_ruleType10733);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5456:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5457:1: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5458:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType10778);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType10789); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5465:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NumericType_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5469:6: ( (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5470:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5470:1: (this_NumericType_0= ruleNumericType | kw= KEYWORD_64 )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==KEYWORD_57||LA62_0==KEYWORD_50||LA62_0==KEYWORD_52||(LA62_0>=KEYWORD_36 && LA62_0<=KEYWORD_38)||LA62_0==KEYWORD_29) ) {
                alt62=1;
            }
            else if ( (LA62_0==KEYWORD_64) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5471:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType10836);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5483:2: kw= KEYWORD_64
                    {
                    kw=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rulePrimitiveType10860); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5496:1: entryRuleNumericType returns [String current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final String entryRuleNumericType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericType = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5497:1: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5498:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType10900);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType10911); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5505:1: ruleNumericType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) ;
    public final AntlrDatatypeRuleToken ruleNumericType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegralType_0 = null;

        AntlrDatatypeRuleToken this_FloatingPointType_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5509:6: ( (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5510:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5510:1: (this_IntegralType_0= ruleIntegralType | this_FloatingPointType_1= ruleFloatingPointType )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==KEYWORD_52||(LA63_0>=KEYWORD_36 && LA63_0<=KEYWORD_38)||LA63_0==KEYWORD_29) ) {
                alt63=1;
            }
            else if ( (LA63_0==KEYWORD_57||LA63_0==KEYWORD_50) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5511:5: this_IntegralType_0= ruleIntegralType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegralTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegralType_in_ruleNumericType10958);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5523:5: this_FloatingPointType_1= ruleFloatingPointType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getFloatingPointTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatingPointType_in_ruleNumericType10991);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5541:1: entryRuleIntegralType returns [String current=null] : iv_ruleIntegralType= ruleIntegralType EOF ;
    public final String entryRuleIntegralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegralType = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5542:1: (iv_ruleIntegralType= ruleIntegralType EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5543:2: iv_ruleIntegralType= ruleIntegralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegralTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegralType_in_entryRuleIntegralType11036);
            iv_ruleIntegralType=ruleIntegralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegralType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegralType11047); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5550:1: ruleIntegralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleIntegralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5554:6: ( (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5555:1: (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5555:1: (kw= KEYWORD_36 | kw= KEYWORD_52 | kw= KEYWORD_29 | kw= KEYWORD_38 | kw= KEYWORD_37 )
            int alt64=5;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt64=1;
                }
                break;
            case KEYWORD_52:
                {
                alt64=2;
                }
                break;
            case KEYWORD_29:
                {
                alt64=3;
                }
                break;
            case KEYWORD_38:
                {
                alt64=4;
                }
                break;
            case KEYWORD_37:
                {
                alt64=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5556:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleIntegralType11085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getByteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5563:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleIntegralType11104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getShortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5570:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleIntegralType11123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getIntKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5577:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleIntegralType11142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegralTypeAccess().getLongKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5584:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleIntegralType11161); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5597:1: entryRuleFloatingPointType returns [String current=null] : iv_ruleFloatingPointType= ruleFloatingPointType EOF ;
    public final String entryRuleFloatingPointType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointType = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5598:1: (iv_ruleFloatingPointType= ruleFloatingPointType EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5599:2: iv_ruleFloatingPointType= ruleFloatingPointType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType11201);
            iv_ruleFloatingPointType=ruleFloatingPointType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPointType11212); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5606:1: ruleFloatingPointType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5610:6: ( (kw= KEYWORD_50 | kw= KEYWORD_57 ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5611:1: (kw= KEYWORD_50 | kw= KEYWORD_57 )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5611:1: (kw= KEYWORD_50 | kw= KEYWORD_57 )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==KEYWORD_50) ) {
                alt65=1;
            }
            else if ( (LA65_0==KEYWORD_57) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5612:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleFloatingPointType11250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointTypeAccess().getFloatKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5619:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleFloatingPointType11269); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5632:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5633:1: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5634:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral11309);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral11320); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5641:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5645:6: (this_INT_0= RULE_INT )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5646:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral11359); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5661:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5662:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5663:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11403);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11414); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5670:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5674:6: (this_STRING_0= RULE_STRING )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5675:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11453); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5690:1: entryRuleBooleanLiteral returns [String current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final String entryRuleBooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5691:1: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5692:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral11497);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral11508); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5699:1: ruleBooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_43 | kw= KEYWORD_49 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5703:6: ( (kw= KEYWORD_43 | kw= KEYWORD_49 ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5704:1: (kw= KEYWORD_43 | kw= KEYWORD_49 )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5704:1: (kw= KEYWORD_43 | kw= KEYWORD_49 )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==KEYWORD_43) ) {
                alt66=1;
            }
            else if ( (LA66_0==KEYWORD_49) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5705:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanLiteral11546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5712:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleBooleanLiteral11565); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5725:1: entryRuleNullLiteral returns [String current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final String entryRuleNullLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5726:1: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5727:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral11605);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral11616); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5734:1: ruleNullLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_39 ;
    public final AntlrDatatypeRuleToken ruleNullLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5738:6: (kw= KEYWORD_39 )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5740:2: kw= KEYWORD_39
            {
            kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNullLiteral11653); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5753:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5754:1: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5755:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral11692);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral11703); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5762:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IntegerLiteral_0 = null;

        AntlrDatatypeRuleToken this_BooleanLiteral_1 = null;

        AntlrDatatypeRuleToken this_StringLiteral_2 = null;

        AntlrDatatypeRuleToken this_NullLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5766:6: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5767:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5767:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral )
            int alt67=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt67=1;
                }
                break;
            case KEYWORD_49:
            case KEYWORD_43:
                {
                alt67=2;
                }
                break;
            case RULE_STRING:
                {
                alt67=3;
                }
                break;
            case KEYWORD_39:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5768:5: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral11750);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5780:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral11783);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5792:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral11816);
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
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5804:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral11849);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5822:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5823:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5824:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier11894);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier11905); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5831:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5835:6: ( (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5836:1: (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5836:1: (kw= KEYWORD_111 | kw= KEYWORD_104 | kw= KEYWORD_119 | kw= KEYWORD_109 | kw= KEYWORD_106 | kw= KEYWORD_112 | kw= KEYWORD_105 | kw= KEYWORD_107 | kw= KEYWORD_110 | (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* ) | (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* ) | (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* ) )
            int alt71=12;
            switch ( input.LA(1) ) {
            case KEYWORD_111:
                {
                alt71=1;
                }
                break;
            case KEYWORD_104:
                {
                alt71=2;
                }
                break;
            case KEYWORD_119:
                {
                alt71=3;
                }
                break;
            case KEYWORD_109:
                {
                alt71=4;
                }
                break;
            case KEYWORD_106:
                {
                alt71=5;
                }
                break;
            case KEYWORD_112:
                {
                alt71=6;
                }
                break;
            case KEYWORD_105:
                {
                alt71=7;
                }
                break;
            case KEYWORD_107:
                {
                alt71=8;
                }
                break;
            case KEYWORD_110:
                {
                alt71=9;
                }
                break;
            case KEYWORD_51:
                {
                alt71=10;
                }
                break;
            case KEYWORD_61:
                {
                alt71=11;
                }
                break;
            case RULE_ID:
                {
                alt71=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5837:2: kw= KEYWORD_111
                    {
                    kw=(Token)match(input,KEYWORD_111,FOLLOW_KEYWORD_111_in_ruleQualifiedIdentifier11943); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5844:2: kw= KEYWORD_104
                    {
                    kw=(Token)match(input,KEYWORD_104,FOLLOW_KEYWORD_104_in_ruleQualifiedIdentifier11962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangByteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5851:2: kw= KEYWORD_119
                    {
                    kw=(Token)match(input,KEYWORD_119,FOLLOW_KEYWORD_119_in_ruleQualifiedIdentifier11981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangCharacterKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5858:2: kw= KEYWORD_109
                    {
                    kw=(Token)match(input,KEYWORD_109,FOLLOW_KEYWORD_109_in_ruleQualifiedIdentifier12000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangDoubleKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5865:2: kw= KEYWORD_106
                    {
                    kw=(Token)match(input,KEYWORD_106,FOLLOW_KEYWORD_106_in_ruleQualifiedIdentifier12019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangFloatKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5872:2: kw= KEYWORD_112
                    {
                    kw=(Token)match(input,KEYWORD_112,FOLLOW_KEYWORD_112_in_ruleQualifiedIdentifier12038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangIntegerKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5879:2: kw= KEYWORD_105
                    {
                    kw=(Token)match(input,KEYWORD_105,FOLLOW_KEYWORD_105_in_ruleQualifiedIdentifier12057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangLongKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5886:2: kw= KEYWORD_107
                    {
                    kw=(Token)match(input,KEYWORD_107,FOLLOW_KEYWORD_107_in_ruleQualifiedIdentifier12076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangShortKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5893:2: kw= KEYWORD_110
                    {
                    kw=(Token)match(input,KEYWORD_110,FOLLOW_KEYWORD_110_in_ruleQualifiedIdentifier12095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaLangStringKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5899:6: (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5899:6: (kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )* )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5900:2: kw= KEYWORD_51 this_ID_10= RULE_ID (kw= KEYWORD_10 this_ID_12= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleQualifiedIdentifier12115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaKeyword_9_0()); 
                          
                    }
                    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_10, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_9_1()); 
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5912:1: (kw= KEYWORD_10 this_ID_12= RULE_ID )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==KEYWORD_10) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5913:2: kw= KEYWORD_10 this_ID_12= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier12149); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_9_2_0()); 
                    	          
                    	    }
                    	    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12164); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ID_12);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ID_12, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_9_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 11 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5926:6: (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5926:6: (kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )* )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5927:2: kw= KEYWORD_61 this_ID_14= RULE_ID (kw= KEYWORD_10 this_ID_16= RULE_ID )*
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleQualifiedIdentifier12192); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getJavaxKeyword_10_0()); 
                          
                    }
                    this_ID_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_14, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_10_1()); 
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5939:1: (kw= KEYWORD_10 this_ID_16= RULE_ID )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==KEYWORD_10) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5940:2: kw= KEYWORD_10 this_ID_16= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier12226); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_10_2_0()); 
                    	          
                    	    }
                    	    this_ID_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12241); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ID_16);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ID_16, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_10_2_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 12 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5953:6: (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5953:6: (this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )* )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5953:11: this_ID_17= RULE_ID (kw= KEYWORD_10 this_ID_19= RULE_ID )*
                    {
                    this_ID_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_17, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_11_0()); 
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5960:1: (kw= KEYWORD_10 this_ID_19= RULE_ID )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==KEYWORD_10) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5961:2: kw= KEYWORD_10 this_ID_19= RULE_ID
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier12290); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_11_1_0()); 
                    	          
                    	    }
                    	    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12305); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ID_19);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_ID_19, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_11_1_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5981:1: entryRuleCandidateClassName returns [String current=null] : iv_ruleCandidateClassName= ruleCandidateClassName EOF ;
    public final String entryRuleCandidateClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCandidateClassName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5982:1: (iv_ruleCandidateClassName= ruleCandidateClassName EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5983:2: iv_ruleCandidateClassName= ruleCandidateClassName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCandidateClassNameRule()); 
            }
            pushFollow(FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName12353);
            iv_ruleCandidateClassName=ruleCandidateClassName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCandidateClassName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCandidateClassName12364); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5990:1: ruleCandidateClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleCandidateClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5994:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:5996:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCandidateClassNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName12410);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6014:1: entryRuleClassOrInterfaceName returns [String current=null] : iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF ;
    public final String entryRuleClassOrInterfaceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrInterfaceName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6015:1: (iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6016:2: iv_ruleClassOrInterfaceName= ruleClassOrInterfaceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrInterfaceNameRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName12454);
            iv_ruleClassOrInterfaceName=ruleClassOrInterfaceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrInterfaceName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceName12465); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6023:1: ruleClassOrInterfaceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedIdentifier_0= ruleQualifiedIdentifier ;
    public final AntlrDatatypeRuleToken ruleClassOrInterfaceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedIdentifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6027:6: (this_QualifiedIdentifier_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6029:5: this_QualifiedIdentifier_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassOrInterfaceNameAccess().getQualifiedIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName12511);
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6047:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6049:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6050:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6050:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_82 ) | (enumLiteral_2= KEYWORD_33 ) | (enumLiteral_3= KEYWORD_92 ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt72=1;
                }
                break;
            case KEYWORD_82:
                {
                alt72=2;
                }
                break;
            case KEYWORD_33:
                {
                alt72=3;
                }
                break;
            case KEYWORD_92:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6050:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6050:2: (enumLiteral_0= KEYWORD_26 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6050:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderByDirection12572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6056:6: (enumLiteral_1= KEYWORD_82 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6056:6: (enumLiteral_1= KEYWORD_82 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6056:11: enumLiteral_1= KEYWORD_82
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleOrderByDirection12594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOrderByDirectionAccess().getAscendingEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6062:6: (enumLiteral_2= KEYWORD_33 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6062:6: (enumLiteral_2= KEYWORD_33 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6062:11: enumLiteral_2= KEYWORD_33
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleOrderByDirection12616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6068:6: (enumLiteral_3= KEYWORD_92 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6068:6: (enumLiteral_3= KEYWORD_92 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6068:11: enumLiteral_3= KEYWORD_92
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_92,FOLLOW_KEYWORD_92_in_ruleOrderByDirection12638); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6078:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6080:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6081:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6081:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) | (enumLiteral_2= KEYWORD_17 ) | (enumLiteral_3= KEYWORD_1 ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt73=1;
                }
                break;
            case KEYWORD_9:
                {
                alt73=2;
                }
                break;
            case KEYWORD_17:
                {
                alt73=3;
                }
                break;
            case KEYWORD_1:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6081:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6081:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6081:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryOperator12688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6087:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6087:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6087:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryOperator12710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6093:6: (enumLiteral_2= KEYWORD_17 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6093:6: (enumLiteral_2= KEYWORD_17 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6093:11: enumLiteral_2= KEYWORD_17
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryOperator12732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getBitwiseNotEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6099:6: (enumLiteral_3= KEYWORD_1 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6099:6: (enumLiteral_3= KEYWORD_1 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6099:11: enumLiteral_3= KEYWORD_1
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleUnaryOperator12754); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6109:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6111:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6112:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6112:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_9 ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==KEYWORD_7) ) {
                alt74=1;
            }
            else if ( (LA74_0==KEYWORD_9) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6112:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6112:2: (enumLiteral_0= KEYWORD_7 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6112:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditionOperator12804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6118:6: (enumLiteral_1= KEYWORD_9 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6118:6: (enumLiteral_1= KEYWORD_9 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6118:11: enumLiteral_1= KEYWORD_9
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditionOperator12826); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6128:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6130:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6131:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6131:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_11 ) | (enumLiteral_2= KEYWORD_2 ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt75=1;
                }
                break;
            case KEYWORD_11:
                {
                alt75=2;
                }
                break;
            case KEYWORD_2:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6131:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6131:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6131:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator12876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6137:6: (enumLiteral_1= KEYWORD_11 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6137:6: (enumLiteral_1= KEYWORD_11 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6137:11: enumLiteral_1= KEYWORD_11
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator12898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6143:6: (enumLiteral_2= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6143:6: (enumLiteral_2= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6143:11: enumLiteral_2= KEYWORD_2
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator12920); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6153:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6155:28: ( ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) ) )
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6156:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6156:1: ( (enumLiteral_0= KEYWORD_14 ) | (enumLiteral_1= KEYWORD_15 ) | (enumLiteral_2= KEYWORD_20 ) | (enumLiteral_3= KEYWORD_22 ) | (enumLiteral_4= KEYWORD_21 ) | (enumLiteral_5= KEYWORD_18 ) | (enumLiteral_6= KEYWORD_96 ) )
            int alt76=7;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt76=1;
                }
                break;
            case KEYWORD_15:
                {
                alt76=2;
                }
                break;
            case KEYWORD_20:
                {
                alt76=3;
                }
                break;
            case KEYWORD_22:
                {
                alt76=4;
                }
                break;
            case KEYWORD_21:
                {
                alt76=5;
                }
                break;
            case KEYWORD_18:
                {
                alt76=6;
                }
                break;
            case KEYWORD_96:
                {
                alt76=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6156:2: (enumLiteral_0= KEYWORD_14 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6156:2: (enumLiteral_0= KEYWORD_14 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6156:7: enumLiteral_0= KEYWORD_14
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator12970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6162:6: (enumLiteral_1= KEYWORD_15 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6162:6: (enumLiteral_1= KEYWORD_15 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6162:11: enumLiteral_1= KEYWORD_15
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator12992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6168:6: (enumLiteral_2= KEYWORD_20 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6168:6: (enumLiteral_2= KEYWORD_20 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6168:11: enumLiteral_2= KEYWORD_20
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleComparisonOperator13014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6174:6: (enumLiteral_3= KEYWORD_22 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6174:6: (enumLiteral_3= KEYWORD_22 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6174:11: enumLiteral_3= KEYWORD_22
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleComparisonOperator13036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6180:6: (enumLiteral_4= KEYWORD_21 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6180:6: (enumLiteral_4= KEYWORD_21 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6180:11: enumLiteral_4= KEYWORD_21
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleComparisonOperator13058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6186:6: (enumLiteral_5= KEYWORD_18 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6186:6: (enumLiteral_5= KEYWORD_18 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6186:11: enumLiteral_5= KEYWORD_18
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleComparisonOperator13080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6192:6: (enumLiteral_6= KEYWORD_96 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6192:6: (enumLiteral_6= KEYWORD_96 )
                    // ../org.nightlabs.vestigo.xtext.jdoql/src-gen/org/nightlabs/vestigo/xtext/jdoql/parser/antlr/internal/InternalJDOQLParser.g:6192:11: enumLiteral_6= KEYWORD_96
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_96,FOLLOW_KEYWORD_96_in_ruleComparisonOperator13102); if (state.failed) return current;
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


    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA48_eotS =
        "\10\uffff";
    static final String DFA48_eofS =
        "\6\uffff\1\2\1\uffff";
    static final String DFA48_minS =
        "\2\4\2\uffff\1\47\1\27\1\4\1\47";
    static final String DFA48_maxS =
        "\2\u0087\2\uffff\1\u0083\2\u0087\1\u0083";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\1\1\4\uffff";
    static final String DFA48_specialS =
        "\10\uffff}>";
    static final String[] DFA48_transitionS = {
            "\5\2\1\uffff\13\2\2\uffff\1\2\6\uffff\5\2\1\uffff\1\2\3\uffff"+
            "\2\2\1\uffff\5\2\1\uffff\3\2\1\uffff\12\2\2\uffff\6\2\3\uffff"+
            "\1\2\1\uffff\2\2\2\uffff\1\2\4\uffff\2\2\11\uffff\5\2\1\uffff"+
            "\2\2\1\uffff\3\2\10\uffff\1\2\2\uffff\1\1\2\uffff\1\2\1\uffff"+
            "\1\2\2\uffff\1\2\4\uffff\4\2",
            "\5\2\1\3\13\2\2\3\1\2\6\3\5\2\1\uffff\1\2\3\uffff\2\2\1\uffff"+
            "\5\2\1\uffff\3\2\1\uffff\12\2\1\uffff\1\3\6\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\3\2\2\1\uffff\1\3\1\2\4\uffff\2\2\3\3\3\uffff\3"+
            "\3\5\2\1\uffff\2\2\1\3\3\2\10\uffff\1\2\2\uffff\1\2\2\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2\1\4\2\2",
            "",
            "",
            "\1\2\104\uffff\5\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\6\2\2"+
            "\1\uffff\1\2\1\5\1\2\2\uffff\3\2",
            "\1\2\6\uffff\5\2\5\uffff\2\2\7\uffff\3\2\7\uffff\4\2\2\uffff"+
            "\6\2\3\uffff\1\2\1\uffff\2\2\2\uffff\1\2\5\uffff\1\2\11\uffff"+
            "\5\2\2\uffff\1\2\17\uffff\1\2\15\uffff\1\7\2\2",
            "\5\3\1\uffff\13\3\2\uffff\1\3\6\uffff\5\3\1\2\1\3\1\2\1\uffff"+
            "\1\2\2\3\1\2\5\3\1\2\3\3\1\uffff\12\3\2\uffff\6\3\1\2\2\uffff"+
            "\1\3\1\uffff\2\3\1\2\1\uffff\1\3\3\2\1\uffff\2\3\3\uffff\3\2"+
            "\3\uffff\5\3\1\2\2\3\1\uffff\3\3\6\2\1\uffff\1\2\1\uffff\2\2"+
            "\1\3\7\2\1\3\1\uffff\3\2\1\uffff\3\3",
            "\1\2\104\uffff\5\2\2\uffff\1\2\1\uffff\2\2\1\uffff\1\6\2\2"+
            "\1\uffff\1\2\1\5\1\2\2\uffff\3\2"
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "2397:1: ( (otherlv_0= KEYWORD_4 ( (lv_castType_1_0= ruleType ) ) otherlv_2= KEYWORD_5 ( (lv_right_3_0= ruleFieldAccessExpression ) ) ) | ( ( (lv_unaryOperator_4_0= ruleUnaryOperator ) )? ( (lv_right_5_0= ruleFieldAccessExpression ) ) ) )";
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
    public static final BitSet FOLLOW_ruleSubquery_in_entryRuleSubquery339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubquery349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubquerySelectClause_in_ruleSubquery395 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleSubqueryFromClause_in_ruleSubquery416 = new BitSet(new long[]{0x0001002000000002L,0x0000000000104000L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSubquery437 = new BitSet(new long[]{0x0001002000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_ruleSubquery459 = new BitSet(new long[]{0x0000002000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleParametersClause_in_ruleSubquery481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleImportClause_in_ruleSubquery503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSelectClause599 = new BitSet(new long[]{0x7FFEFB17C09FFDF2L,0x94900EDF1061367EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleSelectClause617 = new BitSet(new long[]{0x7FFEFB17C09FFDF2L,0x94900EDF1061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleResultClause_in_ruleSelectClause650 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSelectClause672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubquerySelectClause_in_entryRuleSubquerySelectClause708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubquerySelectClause718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSubquerySelectClause768 = new BitSet(new long[]{0x7FFEFB17C09FFDF2L,0x94900EDF1061367EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleSubquerySelectClause786 = new BitSet(new long[]{0x7FFEFB17C09FFDF2L,0x94900EDF1061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleSubqueryResultClause_in_ruleSubquerySelectClause819 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleIntoClause_in_ruleSubquerySelectClause841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultClause_in_entryRuleResultClause877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultClause887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleResultClause931 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause964 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause978 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleResultSpec_in_ruleResultClause998 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleResultClause1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubqueryResultClause_in_entryRuleSubqueryResultClause1050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubqueryResultClause1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleSubqueryResultClause1104 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleSubqueryResultClause1137 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSubqueryResultClause1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntoClause_in_entryRuleIntoClause1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntoClause1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleIntoClause1235 = new BitSet(new long[]{0x000000003F600200L,0x0000000001008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleIntoClause1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultSpec_in_entryRuleResultSpec1290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultSpec1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleResultSpec1350 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleResultNaming_in_ruleResultSpec1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultNaming_in_entryRuleResultNaming1406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultNaming1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleResultNaming1454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultNaming1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleFromClause1558 = new BitSet(new long[]{0x000000003F600200L,0x0000000001008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleFromClause1578 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleFromClause1598 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KEYWORD_95_in_ruleFromClause1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubqueryFromClause_in_entryRuleSubqueryFromClause1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubqueryFromClause1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleSubqueryFromClause1706 = new BitSet(new long[]{0x000000003F600200L,0x0000000401008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleSubqueryFromClause1720 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSubqueryFromClause1732 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleSubqueryFromClause1752 = new BitSet(new long[]{0x8000000000000002L,0x0002000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_ruleSubqueryFromClause1780 = new BitSet(new long[]{0x8000000000000002L,0x0002000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleSubqueryFromClause1802 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleSubqueryFromClause1823 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KEYWORD_95_in_ruleSubqueryFromClause1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias1883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAlias1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlias1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleWhereClause2038 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleWhereClause2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariablesClause_in_entryRuleVariablesClause2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariablesClause2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleVariablesClause2141 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause2175 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleVariablesClause2195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleVariablesClause2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableName_in_ruleVariableDeclaration2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableName_in_entryRuleVariableName2360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableName2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableName2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersClause_in_entryRuleParametersClause2453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersClause2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_94_in_ruleParametersClause2501 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause2521 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause2535 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParametersClause2555 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleParametersClause2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_ruleParameterDeclaration2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameterName_in_entryRuleDeclaredParameterName2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameterName2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleDeclaredParameterName2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportClause_in_entryRuleImportClause2914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportClause2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause2970 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleImportClause3004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleImportClause3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration3057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleImportDeclaration3106 = new BitSet(new long[]{0x000000003F600200L,0x0000000001008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleImportDeclaration3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleGroupByClause3220 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleGroupByClause3232 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause3252 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000080L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause3266 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleGroupByClause3286 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000080L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleGroupByClause3302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause3360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleHavingClause3408 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleHavingClause3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause3463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleOrderByClause3511 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleOrderByClause3523 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause3543 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause3557 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause3577 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOrderByClause3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec3629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleOrderBySpec3689 = new BitSet(new long[]{0x0000040800000000L,0x0000002004000000L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeClause_in_entryRuleRangeClause3744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeClause3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleRangeClause3792 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause3812 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleRangeClause3825 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleRangeClause3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_entryRuleConditionalOrExpression3880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalOrExpression3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3940 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleConditionalOrExpression3965 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_ruleConditionalOrExpression3985 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleConditionalAndExpression_in_entryRuleConditionalAndExpression4022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalAndExpression4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression4082 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleConditionalAndExpression4107 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_ruleConditionalAndExpression4127 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleSimpleOrExpression_in_entryRuleSimpleOrExpression4164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrExpression4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression4224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSimpleOrExpression4249 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_ruleSimpleOrExpression4269 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleSimpleAndExpression_in_entryRuleSimpleAndExpression4306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAndExpression4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression4366 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSimpleAndExpression4391 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleSimpleAndExpression4411 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression4448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression4508 = new BitSet(new long[]{0x0000008000000002L,0x0001D00000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression4541 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression4562 = new BitSet(new long[]{0x0000008000000002L,0x0001D00000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression4599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression4659 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression4692 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression4713 = new BitSet(new long[]{0x0000000000000002L,0x1400000000000000L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression4750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4810 = new BitSet(new long[]{0x0000000000000002L,0x4220000000000000L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression4843 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression4864 = new BitSet(new long[]{0x0000000000000002L,0x4220000000000000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression4901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnaryExpression4950 = new BitSet(new long[]{0x000000003F600200L,0x00000100E3808801L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleUnaryExpression4970 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUnaryExpression4983 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression5032 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_ruleUnaryExpression5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAccessExpression_in_entryRuleFieldAccessExpression5090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAccessExpression5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_ruleFieldAccessExpression5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_ruleFieldAccessExpression5181 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFieldAccessExpression5206 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_ruleFieldAccessExpression5226 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_ruleParameterOrFieldOrMethodExpression_in_entryRuleParameterOrFieldOrMethodExpression5264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOrFieldOrMethodExpression5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleParameterOrFieldOrMethodExpression5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleParameterOrFieldOrMethodExpression5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterOrFieldOrMethodExpression5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleParameterOrFieldOrMethodExpression5404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleParameterOrFieldOrMethodExpression5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleParameterOrFieldOrMethodExpression5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_ruleParameterOrFieldOrMethodExpression5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldOrMethodExpression_in_entryRuleFieldOrMethodExpression5517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldOrMethodExpression5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleFieldOrMethodExpression5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleFieldOrMethodExpression5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldOrMethodExpression5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleFieldOrMethodExpression5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_ruleFieldOrMethodExpression5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticMethodExpression_in_entryRuleStaticMethodExpression5729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticMethodExpression5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleStaticMethodExpression5790 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5802 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5822 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleStaticMethodExpression5867 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5879 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5899 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleStaticMethodExpression5944 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression5956 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression5976 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleStaticMethodExpression6021 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6033 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6053 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleStaticMethodExpression6098 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6110 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6130 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleStaticMethodExpression6175 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6187 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6207 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleStaticMethodExpression6252 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6264 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6284 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_ruleStaticMethodExpression6329 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6341 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6361 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleStaticMethodExpression6406 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6418 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6438 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleStaticMethodExpression6483 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6495 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6515 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_93_in_ruleStaticMethodExpression6560 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6572 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6592 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleStaticMethodExpression6637 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6649 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6669 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_113_in_ruleStaticMethodExpression6714 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6726 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6746 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_124_in_ruleStaticMethodExpression6791 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6803 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6823 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_114_in_ruleStaticMethodExpression6868 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6880 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6900 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_117_in_ruleStaticMethodExpression6945 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression6957 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression6977 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_118_in_ruleStaticMethodExpression7022 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7034 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7054 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_120_in_ruleStaticMethodExpression7099 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7111 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7131 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_121_in_ruleStaticMethodExpression7176 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7188 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7208 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_122_in_ruleStaticMethodExpression7253 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7265 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7285 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_123_in_ruleStaticMethodExpression7330 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7342 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7362 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_115_in_ruleStaticMethodExpression7407 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7419 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7439 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_126_in_ruleStaticMethodExpression7484 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7496 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7516 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_116_in_ruleStaticMethodExpression7561 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7573 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7593 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_127_in_ruleStaticMethodExpression7638 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7650 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7670 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_125_in_ruleStaticMethodExpression7715 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7727 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7747 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_129_in_ruleStaticMethodExpression7792 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7804 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7824 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_128_in_ruleStaticMethodExpression7869 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7881 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression7901 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleStaticMethodExpression7946 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression7958 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression7976 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8009 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleStaticMethodExpression8054 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8066 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression8084 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8117 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleStaticMethodExpression8162 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8174 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8194 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleStaticMethodExpression8239 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8251 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8271 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleStaticMethodExpression8316 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleStaticMethodExpression8328 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleStaticMethodExpression8346 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleStaticMethodExpression8379 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStaticMethodExpression8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodExpression_in_entryRuleMethodExpression8427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodExpression8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleMethodExpression8488 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8500 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8520 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleMethodExpression8565 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8577 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8597 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleMethodExpression8642 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8654 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleMethodExpression8698 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8710 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_99_in_ruleMethodExpression8754 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8766 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8786 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_103_in_ruleMethodExpression8831 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8843 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8863 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_102_in_ruleMethodExpression8908 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression8920 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8940 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression8953 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression8973 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression8986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleMethodExpression9018 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9030 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9050 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleMethodExpression9095 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9107 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9127 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleMethodExpression9172 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9184 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9204 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_108_in_ruleMethodExpression9249 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9261 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9281 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleMethodExpression9326 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9338 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9358 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression9372 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9392 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMethodExpression9439 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9451 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleMethodExpression9495 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9507 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9527 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_97_in_ruleMethodExpression9572 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9584 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9604 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression9617 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9637 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_98_in_ruleMethodExpression9682 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9694 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9714 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_91_in_ruleMethodExpression9759 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9771 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9791 = new BitSet(new long[]{0x0000000000000000L,0x0900000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMethodExpression9805 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061347EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleMethodExpression9825 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_100_in_ruleMethodExpression9872 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9884 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_101_in_ruleMethodExpression9928 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9940 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleMethodExpression9984 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression9996 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleMethodExpression10040 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10052 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleMethodExpression10096 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10108 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleMethodExpression10152 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10164 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleMethodExpression10208 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10220 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_ruleMethodExpression10264 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10276 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_90_in_ruleMethodExpression10320 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10332 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleMethodExpression10376 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10388 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleMethodExpression10432 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMethodExpression10444 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMethodExpression10456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression10491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthesesExpression10539 = new BitSet(new long[]{0x7FFEFB17C09FFDF0L,0x94900EDF0061357EL,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleConditionalOrExpression_in_ruleParenthesesExpression10564 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleParenthesesExpression10594 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthesesExpression10607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType10642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType10653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_ruleType10733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType10778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType10789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rulePrimitiveType10860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType10900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType10911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_ruleNumericType10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_ruleNumericType10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegralType_in_entryRuleIntegralType11036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegralType11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleIntegralType11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleIntegralType11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleIntegralType11123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleIntegralType11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleIntegralType11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPointType_in_entryRuleFloatingPointType11201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointType11212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleFloatingPointType11250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleFloatingPointType11269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral11309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral11497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanLiteral11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleBooleanLiteral11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral11605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNullLiteral11653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral11692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral11703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral11783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier11894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier11905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_111_in_ruleQualifiedIdentifier11943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_104_in_ruleQualifiedIdentifier11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_119_in_ruleQualifiedIdentifier11981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_109_in_ruleQualifiedIdentifier12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_106_in_ruleQualifiedIdentifier12019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_112_in_ruleQualifiedIdentifier12038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_105_in_ruleQualifiedIdentifier12057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_107_in_ruleQualifiedIdentifier12076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_110_in_ruleQualifiedIdentifier12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleQualifiedIdentifier12115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12130 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier12149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12164 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleQualifiedIdentifier12192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12207 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier12226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12241 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12271 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleQualifiedIdentifier12290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier12305 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_ruleCandidateClassName_in_entryRuleCandidateClassName12353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCandidateClassName12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleCandidateClassName12410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceName_in_entryRuleClassOrInterfaceName12454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceName12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleClassOrInterfaceName12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderByDirection12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleOrderByDirection12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleOrderByDirection12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_92_in_ruleOrderByDirection12638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryOperator12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryOperator12710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryOperator12732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleUnaryOperator12754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditionOperator12804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditionOperator12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicationOperator12876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiplicationOperator12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMultiplicationOperator12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator12970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleComparisonOperator13014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleComparisonOperator13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleComparisonOperator13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleComparisonOperator13080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_96_in_ruleComparisonOperator13102 = new BitSet(new long[]{0x0000000000000002L});

}